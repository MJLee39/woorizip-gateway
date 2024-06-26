// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.3.0
// - protoc             (unknown)
// source: proto/account.proto

package proto

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

const (
	AccountService_CreateAccount_FullMethodName        = "/accountpb.AccountService/CreateAccount"
	AccountService_GetAccount_FullMethodName           = "/accountpb.AccountService/GetAccount"
	AccountService_ListAccounts_FullMethodName         = "/accountpb.AccountService/ListAccounts"
	AccountService_LockAccount_FullMethodName          = "/accountpb.AccountService/LockAccount"
	AccountService_UnlockAccount_FullMethodName        = "/accountpb.AccountService/UnlockAccount"
	AccountService_ChangeRole_FullMethodName           = "/accountpb.AccountService/ChangeRole"
	AccountService_DeleteAccount_FullMethodName        = "/accountpb.AccountService/DeleteAccount"
	AccountService_GetAccountByProvider_FullMethodName = "/accountpb.AccountService/GetAccountByProvider"
	AccountService_UpdateAccount_FullMethodName        = "/accountpb.AccountService/UpdateAccount"
)

// AccountServiceClient is the client API for AccountService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type AccountServiceClient interface {
	CreateAccount(ctx context.Context, in *CreateAccountReq, opts ...grpc.CallOption) (*CreateAccountResp, error)
	GetAccount(ctx context.Context, in *GetAccountReq, opts ...grpc.CallOption) (*GetAccountResp, error)
	ListAccounts(ctx context.Context, in *ListAccountReq, opts ...grpc.CallOption) (*ListAccountResp, error)
	LockAccount(ctx context.Context, in *LockAccountReq, opts ...grpc.CallOption) (*LockAccountResp, error)
	UnlockAccount(ctx context.Context, in *UnlockAccountReq, opts ...grpc.CallOption) (*UnlockAccountResp, error)
	ChangeRole(ctx context.Context, in *ChangeRoleReq, opts ...grpc.CallOption) (*ChangeRoleResp, error)
	DeleteAccount(ctx context.Context, in *DeleteAccountReq, opts ...grpc.CallOption) (*DeleteAccountResp, error)
	GetAccountByProvider(ctx context.Context, in *GetAccountByProviderReq, opts ...grpc.CallOption) (*GetAccountByProviderResp, error)
	UpdateAccount(ctx context.Context, in *UpdateAccountReq, opts ...grpc.CallOption) (*UpdateAccountResp, error)
}

type accountServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewAccountServiceClient(cc grpc.ClientConnInterface) AccountServiceClient {
	return &accountServiceClient{cc}
}

func (c *accountServiceClient) CreateAccount(ctx context.Context, in *CreateAccountReq, opts ...grpc.CallOption) (*CreateAccountResp, error) {
	out := new(CreateAccountResp)
	err := c.cc.Invoke(ctx, AccountService_CreateAccount_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) GetAccount(ctx context.Context, in *GetAccountReq, opts ...grpc.CallOption) (*GetAccountResp, error) {
	out := new(GetAccountResp)
	err := c.cc.Invoke(ctx, AccountService_GetAccount_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) ListAccounts(ctx context.Context, in *ListAccountReq, opts ...grpc.CallOption) (*ListAccountResp, error) {
	out := new(ListAccountResp)
	err := c.cc.Invoke(ctx, AccountService_ListAccounts_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) LockAccount(ctx context.Context, in *LockAccountReq, opts ...grpc.CallOption) (*LockAccountResp, error) {
	out := new(LockAccountResp)
	err := c.cc.Invoke(ctx, AccountService_LockAccount_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) UnlockAccount(ctx context.Context, in *UnlockAccountReq, opts ...grpc.CallOption) (*UnlockAccountResp, error) {
	out := new(UnlockAccountResp)
	err := c.cc.Invoke(ctx, AccountService_UnlockAccount_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) ChangeRole(ctx context.Context, in *ChangeRoleReq, opts ...grpc.CallOption) (*ChangeRoleResp, error) {
	out := new(ChangeRoleResp)
	err := c.cc.Invoke(ctx, AccountService_ChangeRole_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) DeleteAccount(ctx context.Context, in *DeleteAccountReq, opts ...grpc.CallOption) (*DeleteAccountResp, error) {
	out := new(DeleteAccountResp)
	err := c.cc.Invoke(ctx, AccountService_DeleteAccount_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) GetAccountByProvider(ctx context.Context, in *GetAccountByProviderReq, opts ...grpc.CallOption) (*GetAccountByProviderResp, error) {
	out := new(GetAccountByProviderResp)
	err := c.cc.Invoke(ctx, AccountService_GetAccountByProvider_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountServiceClient) UpdateAccount(ctx context.Context, in *UpdateAccountReq, opts ...grpc.CallOption) (*UpdateAccountResp, error) {
	out := new(UpdateAccountResp)
	err := c.cc.Invoke(ctx, AccountService_UpdateAccount_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// AccountServiceServer is the server API for AccountService service.
// All implementations must embed UnimplementedAccountServiceServer
// for forward compatibility
type AccountServiceServer interface {
	CreateAccount(context.Context, *CreateAccountReq) (*CreateAccountResp, error)
	GetAccount(context.Context, *GetAccountReq) (*GetAccountResp, error)
	ListAccounts(context.Context, *ListAccountReq) (*ListAccountResp, error)
	LockAccount(context.Context, *LockAccountReq) (*LockAccountResp, error)
	UnlockAccount(context.Context, *UnlockAccountReq) (*UnlockAccountResp, error)
	ChangeRole(context.Context, *ChangeRoleReq) (*ChangeRoleResp, error)
	DeleteAccount(context.Context, *DeleteAccountReq) (*DeleteAccountResp, error)
	GetAccountByProvider(context.Context, *GetAccountByProviderReq) (*GetAccountByProviderResp, error)
	UpdateAccount(context.Context, *UpdateAccountReq) (*UpdateAccountResp, error)
	mustEmbedUnimplementedAccountServiceServer()
}

// UnimplementedAccountServiceServer must be embedded to have forward compatible implementations.
type UnimplementedAccountServiceServer struct {
}

func (UnimplementedAccountServiceServer) CreateAccount(context.Context, *CreateAccountReq) (*CreateAccountResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateAccount not implemented")
}
func (UnimplementedAccountServiceServer) GetAccount(context.Context, *GetAccountReq) (*GetAccountResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetAccount not implemented")
}
func (UnimplementedAccountServiceServer) ListAccounts(context.Context, *ListAccountReq) (*ListAccountResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListAccounts not implemented")
}
func (UnimplementedAccountServiceServer) LockAccount(context.Context, *LockAccountReq) (*LockAccountResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method LockAccount not implemented")
}
func (UnimplementedAccountServiceServer) UnlockAccount(context.Context, *UnlockAccountReq) (*UnlockAccountResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UnlockAccount not implemented")
}
func (UnimplementedAccountServiceServer) ChangeRole(context.Context, *ChangeRoleReq) (*ChangeRoleResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ChangeRole not implemented")
}
func (UnimplementedAccountServiceServer) DeleteAccount(context.Context, *DeleteAccountReq) (*DeleteAccountResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteAccount not implemented")
}
func (UnimplementedAccountServiceServer) GetAccountByProvider(context.Context, *GetAccountByProviderReq) (*GetAccountByProviderResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetAccountByProvider not implemented")
}
func (UnimplementedAccountServiceServer) UpdateAccount(context.Context, *UpdateAccountReq) (*UpdateAccountResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateAccount not implemented")
}
func (UnimplementedAccountServiceServer) mustEmbedUnimplementedAccountServiceServer() {}

// UnsafeAccountServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to AccountServiceServer will
// result in compilation errors.
type UnsafeAccountServiceServer interface {
	mustEmbedUnimplementedAccountServiceServer()
}

func RegisterAccountServiceServer(s grpc.ServiceRegistrar, srv AccountServiceServer) {
	s.RegisterService(&AccountService_ServiceDesc, srv)
}

func _AccountService_CreateAccount_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateAccountReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).CreateAccount(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: AccountService_CreateAccount_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).CreateAccount(ctx, req.(*CreateAccountReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_GetAccount_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetAccountReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).GetAccount(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: AccountService_GetAccount_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).GetAccount(ctx, req.(*GetAccountReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_ListAccounts_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListAccountReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).ListAccounts(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: AccountService_ListAccounts_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).ListAccounts(ctx, req.(*ListAccountReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_LockAccount_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(LockAccountReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).LockAccount(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: AccountService_LockAccount_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).LockAccount(ctx, req.(*LockAccountReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_UnlockAccount_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UnlockAccountReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).UnlockAccount(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: AccountService_UnlockAccount_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).UnlockAccount(ctx, req.(*UnlockAccountReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_ChangeRole_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ChangeRoleReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).ChangeRole(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: AccountService_ChangeRole_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).ChangeRole(ctx, req.(*ChangeRoleReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_DeleteAccount_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteAccountReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).DeleteAccount(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: AccountService_DeleteAccount_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).DeleteAccount(ctx, req.(*DeleteAccountReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_GetAccountByProvider_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetAccountByProviderReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).GetAccountByProvider(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: AccountService_GetAccountByProvider_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).GetAccountByProvider(ctx, req.(*GetAccountByProviderReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _AccountService_UpdateAccount_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateAccountReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServiceServer).UpdateAccount(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: AccountService_UpdateAccount_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServiceServer).UpdateAccount(ctx, req.(*UpdateAccountReq))
	}
	return interceptor(ctx, in, info, handler)
}

// AccountService_ServiceDesc is the grpc.ServiceDesc for AccountService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var AccountService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "accountpb.AccountService",
	HandlerType: (*AccountServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateAccount",
			Handler:    _AccountService_CreateAccount_Handler,
		},
		{
			MethodName: "GetAccount",
			Handler:    _AccountService_GetAccount_Handler,
		},
		{
			MethodName: "ListAccounts",
			Handler:    _AccountService_ListAccounts_Handler,
		},
		{
			MethodName: "LockAccount",
			Handler:    _AccountService_LockAccount_Handler,
		},
		{
			MethodName: "UnlockAccount",
			Handler:    _AccountService_UnlockAccount_Handler,
		},
		{
			MethodName: "ChangeRole",
			Handler:    _AccountService_ChangeRole_Handler,
		},
		{
			MethodName: "DeleteAccount",
			Handler:    _AccountService_DeleteAccount_Handler,
		},
		{
			MethodName: "GetAccountByProvider",
			Handler:    _AccountService_GetAccountByProvider_Handler,
		},
		{
			MethodName: "UpdateAccount",
			Handler:    _AccountService_UpdateAccount_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "proto/account.proto",
}
