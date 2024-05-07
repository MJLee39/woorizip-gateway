package java.authpb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: proto/auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "authpb.AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<java.authpb.AuthProto.AuthReq,
      java.authpb.AuthProto.AuthResp> getAuthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Auth",
      requestType = java.authpb.AuthProto.AuthReq.class,
      responseType = java.authpb.AuthProto.AuthResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.authpb.AuthProto.AuthReq,
      java.authpb.AuthProto.AuthResp> getAuthMethod() {
    io.grpc.MethodDescriptor<java.authpb.AuthProto.AuthReq, java.authpb.AuthProto.AuthResp> getAuthMethod;
    if ((getAuthMethod = AuthServiceGrpc.getAuthMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getAuthMethod = AuthServiceGrpc.getAuthMethod) == null) {
          AuthServiceGrpc.getAuthMethod = getAuthMethod =
              io.grpc.MethodDescriptor.<java.authpb.AuthProto.AuthReq, java.authpb.AuthProto.AuthResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Auth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.authpb.AuthProto.AuthReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.authpb.AuthProto.AuthResp.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("Auth"))
              .build();
        }
      }
    }
    return getAuthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.authpb.AuthProto.AuthCheckAccountReq,
      java.authpb.AuthProto.AuthCheckAccountResp> getAuthCheckAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthCheckAccount",
      requestType = java.authpb.AuthProto.AuthCheckAccountReq.class,
      responseType = java.authpb.AuthProto.AuthCheckAccountResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.authpb.AuthProto.AuthCheckAccountReq,
      java.authpb.AuthProto.AuthCheckAccountResp> getAuthCheckAccountMethod() {
    io.grpc.MethodDescriptor<java.authpb.AuthProto.AuthCheckAccountReq, java.authpb.AuthProto.AuthCheckAccountResp> getAuthCheckAccountMethod;
    if ((getAuthCheckAccountMethod = AuthServiceGrpc.getAuthCheckAccountMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getAuthCheckAccountMethod = AuthServiceGrpc.getAuthCheckAccountMethod) == null) {
          AuthServiceGrpc.getAuthCheckAccountMethod = getAuthCheckAccountMethod =
              io.grpc.MethodDescriptor.<java.authpb.AuthProto.AuthCheckAccountReq, java.authpb.AuthProto.AuthCheckAccountResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthCheckAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.authpb.AuthProto.AuthCheckAccountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.authpb.AuthProto.AuthCheckAccountResp.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("AuthCheckAccount"))
              .build();
        }
      }
    }
    return getAuthCheckAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.authpb.AuthProto.AuthValidationReq,
      java.authpb.AuthProto.AuthValidationResp> getAuthValidationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthValidation",
      requestType = java.authpb.AuthProto.AuthValidationReq.class,
      responseType = java.authpb.AuthProto.AuthValidationResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.authpb.AuthProto.AuthValidationReq,
      java.authpb.AuthProto.AuthValidationResp> getAuthValidationMethod() {
    io.grpc.MethodDescriptor<java.authpb.AuthProto.AuthValidationReq, java.authpb.AuthProto.AuthValidationResp> getAuthValidationMethod;
    if ((getAuthValidationMethod = AuthServiceGrpc.getAuthValidationMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getAuthValidationMethod = AuthServiceGrpc.getAuthValidationMethod) == null) {
          AuthServiceGrpc.getAuthValidationMethod = getAuthValidationMethod =
              io.grpc.MethodDescriptor.<java.authpb.AuthProto.AuthValidationReq, java.authpb.AuthProto.AuthValidationResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthValidation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.authpb.AuthProto.AuthValidationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.authpb.AuthProto.AuthValidationResp.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("AuthValidation"))
              .build();
        }
      }
    }
    return getAuthValidationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.authpb.AuthProto.AuthRefreshReq,
      java.authpb.AuthProto.AuthRefreshResp> getAuthRefreshMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthRefresh",
      requestType = java.authpb.AuthProto.AuthRefreshReq.class,
      responseType = java.authpb.AuthProto.AuthRefreshResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.authpb.AuthProto.AuthRefreshReq,
      java.authpb.AuthProto.AuthRefreshResp> getAuthRefreshMethod() {
    io.grpc.MethodDescriptor<java.authpb.AuthProto.AuthRefreshReq, java.authpb.AuthProto.AuthRefreshResp> getAuthRefreshMethod;
    if ((getAuthRefreshMethod = AuthServiceGrpc.getAuthRefreshMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getAuthRefreshMethod = AuthServiceGrpc.getAuthRefreshMethod) == null) {
          AuthServiceGrpc.getAuthRefreshMethod = getAuthRefreshMethod =
              io.grpc.MethodDescriptor.<java.authpb.AuthProto.AuthRefreshReq, java.authpb.AuthProto.AuthRefreshResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthRefresh"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.authpb.AuthProto.AuthRefreshReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.authpb.AuthProto.AuthRefreshResp.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("AuthRefresh"))
              .build();
        }
      }
    }
    return getAuthRefreshMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.authpb.AuthProto.AuthLogoutReq,
      java.authpb.AuthProto.AuthLogoutResp> getAuthLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthLogout",
      requestType = java.authpb.AuthProto.AuthLogoutReq.class,
      responseType = java.authpb.AuthProto.AuthLogoutResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.authpb.AuthProto.AuthLogoutReq,
      java.authpb.AuthProto.AuthLogoutResp> getAuthLogoutMethod() {
    io.grpc.MethodDescriptor<java.authpb.AuthProto.AuthLogoutReq, java.authpb.AuthProto.AuthLogoutResp> getAuthLogoutMethod;
    if ((getAuthLogoutMethod = AuthServiceGrpc.getAuthLogoutMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getAuthLogoutMethod = AuthServiceGrpc.getAuthLogoutMethod) == null) {
          AuthServiceGrpc.getAuthLogoutMethod = getAuthLogoutMethod =
              io.grpc.MethodDescriptor.<java.authpb.AuthProto.AuthLogoutReq, java.authpb.AuthProto.AuthLogoutResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthLogout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.authpb.AuthProto.AuthLogoutReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.authpb.AuthProto.AuthLogoutResp.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("AuthLogout"))
              .build();
        }
      }
    }
    return getAuthLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.authpb.AuthProto.GetAccountByTokenReq,
      java.authpb.AuthProto.GetAccountByTokenResp> getGetAccountByTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountByToken",
      requestType = java.authpb.AuthProto.GetAccountByTokenReq.class,
      responseType = java.authpb.AuthProto.GetAccountByTokenResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.authpb.AuthProto.GetAccountByTokenReq,
      java.authpb.AuthProto.GetAccountByTokenResp> getGetAccountByTokenMethod() {
    io.grpc.MethodDescriptor<java.authpb.AuthProto.GetAccountByTokenReq, java.authpb.AuthProto.GetAccountByTokenResp> getGetAccountByTokenMethod;
    if ((getGetAccountByTokenMethod = AuthServiceGrpc.getGetAccountByTokenMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetAccountByTokenMethod = AuthServiceGrpc.getGetAccountByTokenMethod) == null) {
          AuthServiceGrpc.getGetAccountByTokenMethod = getGetAccountByTokenMethod =
              io.grpc.MethodDescriptor.<java.authpb.AuthProto.GetAccountByTokenReq, java.authpb.AuthProto.GetAccountByTokenResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountByToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.authpb.AuthProto.GetAccountByTokenReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.authpb.AuthProto.GetAccountByTokenResp.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetAccountByToken"))
              .build();
        }
      }
    }
    return getGetAccountByTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void auth(java.authpb.AuthProto.AuthReq request,
        io.grpc.stub.StreamObserver<java.authpb.AuthProto.AuthResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthMethod(), responseObserver);
    }

    /**
     */
    default void authCheckAccount(java.authpb.AuthProto.AuthCheckAccountReq request,
        io.grpc.stub.StreamObserver<java.authpb.AuthProto.AuthCheckAccountResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthCheckAccountMethod(), responseObserver);
    }

    /**
     */
    default void authValidation(java.authpb.AuthProto.AuthValidationReq request,
        io.grpc.stub.StreamObserver<java.authpb.AuthProto.AuthValidationResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthValidationMethod(), responseObserver);
    }

    /**
     */
    default void authRefresh(java.authpb.AuthProto.AuthRefreshReq request,
        io.grpc.stub.StreamObserver<java.authpb.AuthProto.AuthRefreshResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthRefreshMethod(), responseObserver);
    }

    /**
     */
    default void authLogout(java.authpb.AuthProto.AuthLogoutReq request,
        io.grpc.stub.StreamObserver<java.authpb.AuthProto.AuthLogoutResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthLogoutMethod(), responseObserver);
    }

    /**
     */
    default void getAccountByToken(java.authpb.AuthProto.GetAccountByTokenReq request,
        io.grpc.stub.StreamObserver<java.authpb.AuthProto.GetAccountByTokenResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountByTokenMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuthService.
   */
  public static abstract class AuthServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void auth(java.authpb.AuthProto.AuthReq request,
        io.grpc.stub.StreamObserver<java.authpb.AuthProto.AuthResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authCheckAccount(java.authpb.AuthProto.AuthCheckAccountReq request,
        io.grpc.stub.StreamObserver<java.authpb.AuthProto.AuthCheckAccountResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthCheckAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authValidation(java.authpb.AuthProto.AuthValidationReq request,
        io.grpc.stub.StreamObserver<java.authpb.AuthProto.AuthValidationResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthValidationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authRefresh(java.authpb.AuthProto.AuthRefreshReq request,
        io.grpc.stub.StreamObserver<java.authpb.AuthProto.AuthRefreshResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthRefreshMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authLogout(java.authpb.AuthProto.AuthLogoutReq request,
        io.grpc.stub.StreamObserver<java.authpb.AuthProto.AuthLogoutResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountByToken(java.authpb.AuthProto.GetAccountByTokenReq request,
        io.grpc.stub.StreamObserver<java.authpb.AuthProto.GetAccountByTokenResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountByTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.authpb.AuthProto.AuthResp auth(java.authpb.AuthProto.AuthReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.authpb.AuthProto.AuthCheckAccountResp authCheckAccount(java.authpb.AuthProto.AuthCheckAccountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthCheckAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.authpb.AuthProto.AuthValidationResp authValidation(java.authpb.AuthProto.AuthValidationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthValidationMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.authpb.AuthProto.AuthRefreshResp authRefresh(java.authpb.AuthProto.AuthRefreshReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthRefreshMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.authpb.AuthProto.AuthLogoutResp authLogout(java.authpb.AuthProto.AuthLogoutReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.authpb.AuthProto.GetAccountByTokenResp getAccountByToken(java.authpb.AuthProto.GetAccountByTokenReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountByTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthService.
   */
  public static final class AuthServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.authpb.AuthProto.AuthResp> auth(
        java.authpb.AuthProto.AuthReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.authpb.AuthProto.AuthCheckAccountResp> authCheckAccount(
        java.authpb.AuthProto.AuthCheckAccountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthCheckAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.authpb.AuthProto.AuthValidationResp> authValidation(
        java.authpb.AuthProto.AuthValidationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthValidationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.authpb.AuthProto.AuthRefreshResp> authRefresh(
        java.authpb.AuthProto.AuthRefreshReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthRefreshMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.authpb.AuthProto.AuthLogoutResp> authLogout(
        java.authpb.AuthProto.AuthLogoutReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthLogoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.authpb.AuthProto.GetAccountByTokenResp> getAccountByToken(
        java.authpb.AuthProto.GetAccountByTokenReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountByTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTH = 0;
  private static final int METHODID_AUTH_CHECK_ACCOUNT = 1;
  private static final int METHODID_AUTH_VALIDATION = 2;
  private static final int METHODID_AUTH_REFRESH = 3;
  private static final int METHODID_AUTH_LOGOUT = 4;
  private static final int METHODID_GET_ACCOUNT_BY_TOKEN = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTH:
          serviceImpl.auth((java.authpb.AuthProto.AuthReq) request,
              (io.grpc.stub.StreamObserver<java.authpb.AuthProto.AuthResp>) responseObserver);
          break;
        case METHODID_AUTH_CHECK_ACCOUNT:
          serviceImpl.authCheckAccount((java.authpb.AuthProto.AuthCheckAccountReq) request,
              (io.grpc.stub.StreamObserver<java.authpb.AuthProto.AuthCheckAccountResp>) responseObserver);
          break;
        case METHODID_AUTH_VALIDATION:
          serviceImpl.authValidation((java.authpb.AuthProto.AuthValidationReq) request,
              (io.grpc.stub.StreamObserver<java.authpb.AuthProto.AuthValidationResp>) responseObserver);
          break;
        case METHODID_AUTH_REFRESH:
          serviceImpl.authRefresh((java.authpb.AuthProto.AuthRefreshReq) request,
              (io.grpc.stub.StreamObserver<java.authpb.AuthProto.AuthRefreshResp>) responseObserver);
          break;
        case METHODID_AUTH_LOGOUT:
          serviceImpl.authLogout((java.authpb.AuthProto.AuthLogoutReq) request,
              (io.grpc.stub.StreamObserver<java.authpb.AuthProto.AuthLogoutResp>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_BY_TOKEN:
          serviceImpl.getAccountByToken((java.authpb.AuthProto.GetAccountByTokenReq) request,
              (io.grpc.stub.StreamObserver<java.authpb.AuthProto.GetAccountByTokenResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAuthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.authpb.AuthProto.AuthReq,
              java.authpb.AuthProto.AuthResp>(
                service, METHODID_AUTH)))
        .addMethod(
          getAuthCheckAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.authpb.AuthProto.AuthCheckAccountReq,
              java.authpb.AuthProto.AuthCheckAccountResp>(
                service, METHODID_AUTH_CHECK_ACCOUNT)))
        .addMethod(
          getAuthValidationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.authpb.AuthProto.AuthValidationReq,
              java.authpb.AuthProto.AuthValidationResp>(
                service, METHODID_AUTH_VALIDATION)))
        .addMethod(
          getAuthRefreshMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.authpb.AuthProto.AuthRefreshReq,
              java.authpb.AuthProto.AuthRefreshResp>(
                service, METHODID_AUTH_REFRESH)))
        .addMethod(
          getAuthLogoutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.authpb.AuthProto.AuthLogoutReq,
              java.authpb.AuthProto.AuthLogoutResp>(
                service, METHODID_AUTH_LOGOUT)))
        .addMethod(
          getGetAccountByTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.authpb.AuthProto.GetAccountByTokenReq,
              java.authpb.AuthProto.GetAccountByTokenResp>(
                service, METHODID_GET_ACCOUNT_BY_TOKEN)))
        .build();
  }

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return java.authpb.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuthServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getAuthMethod())
              .addMethod(getAuthCheckAccountMethod())
              .addMethod(getAuthValidationMethod())
              .addMethod(getAuthRefreshMethod())
              .addMethod(getAuthLogoutMethod())
              .addMethod(getGetAccountByTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
