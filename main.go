package main

import (
	"context"
	swaggerFiles "github.com/swaggo/files"
	ginSwagger "github.com/swaggo/gin-swagger"
	"log"
	"time"

	"github.com/TeamWAF/woorizip-gateway/gen/proto"
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
	{Address: "service-auth", RegisterFunc: proto.RegisterAuthServiceHandler, Name: "Auth"},
	{Address: "service-account", RegisterFunc: proto.RegisterAccountServiceHandler, Name: "Account"},
	{Address: "192.168.0.90:19093", RegisterFunc: proto.RegisterConditionServiceHandler, Name: "Condition"},
	{Address: "192.168.0.60:9092", RegisterFunc: proto.RegisterEstateProtoServiceHandler, Name: "Estate"},
	{Address: "192.168.0.60:9091", RegisterFunc: proto.RegisterZipProtoServiceHandler, Name: "Zip"},
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
		// Swagger 문서 파일 경로 수정
		r.StaticFile("/swagger-doc/woorizip.json", "./swagger/woorizip.swagger.json")

		// Swagger UI 경로 수정
		url := ginSwagger.URL("/swagger-doc/woorizip.json")
		// Swagger UI 기본 페이지 리다이렉트 설정
		r.GET("/swagger", func(c *gin.Context) {
			c.Redirect(304, "/swagger/index.html")
		})
		r.GET("/swagger/*any", ginSwagger.WrapHandler(swaggerFiles.Handler, url))

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
