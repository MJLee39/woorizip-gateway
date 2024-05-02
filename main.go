package main

import (
	"context"
	"log"
	"time"

	"github.com/TeamWAF/woorizip-idl/gen/proto"
	"github.com/gin-gonic/gin"
	"github.com/grpc-ecosystem/grpc-gateway/v2/runtime"
	"google.golang.org/grpc"
	"google.golang.org/grpc/keepalive"
)

type Server struct {
	Address      string
	RegisterFunc func(ctx context.Context, mux *runtime.ServeMux, conn *grpc.ClientConn) error
	Name         string
}

var servers = []Server{
	{Address: "localhost:50051", RegisterFunc: proto.RegisterAuthServiceHandler, Name: "Auth"},
	{Address: "localhost:50052", RegisterFunc: proto.RegisterAccountServiceHandler, Name: "Account"},
	{Address: "service-condition.woorizip.svc.cluster.local:80", RegisterFunc: proto.RegisterConditionServiceHandler, Name: "Condition"},
	{Address: "service-estate.woorizip.svc.cluster.local:80", RegisterFunc: proto.RegisterEstateProtoServiceHandler, Name: "Estate"},
	{Address: "service-zip.woorizip.svc.cluster.local:80", RegisterFunc: proto.RegisterZipProtoServiceHandler, Name: "Zip"},
}

func main() {
	mux := runtime.NewServeMux()

	for _, server := range servers {
		go func(server Server) {
			registerGateway(server.Address, server.RegisterFunc, mux, server.Name)
		}(server)
	}

	go func() {
		r := gin.New()
		r.Use(gin.Logger())
		r.Use(gin.Recovery())

		r.GET("/v1/*any", gin.WrapH(mux))
		r.POST("/v1/*any", gin.WrapH(mux))
		r.PUT("/v1/*any", gin.WrapH(mux))

		if err := r.Run(":8080"); err != nil {
			log.Fatalln("Failed to run server:", err)
		}
	}()

	select {}
}

var connMap = make(map[string]*grpc.ClientConn)

func setConnection(address string, conn *grpc.ClientConn) {
	connMap[address] = conn
}

func getGRPCOptions() []grpc.DialOption {
	return []grpc.DialOption{
		grpc.WithInsecure(),
		grpc.WithBlock(),
		grpc.WithTimeout(5 * time.Second),
		grpc.WithKeepaliveParams(keepalive.ClientParameters{
			Time:                60 * time.Second, // 핑 요청 간격을 60초로 늘림
			Timeout:             2 * time.Second,  // 핑 응답 대기 시간을 20초로 늘림
			PermitWithoutStream: true,
		}),
	}
}

func registerGateway(serverAddr string, registerFunc func(ctx context.Context, mux *runtime.ServeMux, conn *grpc.ClientConn) error, mux *runtime.ServeMux, serviceName string) {
	conn, err := grpc.Dial(serverAddr, getGRPCOptions()...)
	if err != nil {
		log.Printf("Failed to connect to %s server: %v", serviceName, err)
		return
	}

	setConnection(serverAddr, conn)

	if err := registerFunc(context.Background(), mux, conn); err != nil {
		log.Printf("Failed to register %s gateway: %v", serviceName, err)
		conn.Close()
		delete(connMap, serverAddr)
		return
	}

	log.Printf("%s gateway registered", serviceName)
}
