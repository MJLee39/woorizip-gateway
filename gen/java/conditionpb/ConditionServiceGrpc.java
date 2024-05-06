package java.conditionpb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: proto/condition.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConditionServiceGrpc {

  private ConditionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "conditionpb.ConditionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionAccountIdReq,
      java.conditionpb.ConditionProto.ConditionIsRegisteredResp> getIsRegisteredMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsRegistered",
      requestType = java.conditionpb.ConditionProto.ConditionAccountIdReq.class,
      responseType = java.conditionpb.ConditionProto.ConditionIsRegisteredResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionAccountIdReq,
      java.conditionpb.ConditionProto.ConditionIsRegisteredResp> getIsRegisteredMethod() {
    io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionAccountIdReq, java.conditionpb.ConditionProto.ConditionIsRegisteredResp> getIsRegisteredMethod;
    if ((getIsRegisteredMethod = ConditionServiceGrpc.getIsRegisteredMethod) == null) {
      synchronized (ConditionServiceGrpc.class) {
        if ((getIsRegisteredMethod = ConditionServiceGrpc.getIsRegisteredMethod) == null) {
          ConditionServiceGrpc.getIsRegisteredMethod = getIsRegisteredMethod =
              io.grpc.MethodDescriptor.<java.conditionpb.ConditionProto.ConditionAccountIdReq, java.conditionpb.ConditionProto.ConditionIsRegisteredResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsRegistered"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.conditionpb.ConditionProto.ConditionAccountIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.conditionpb.ConditionProto.ConditionIsRegisteredResp.getDefaultInstance()))
              .setSchemaDescriptor(new ConditionServiceMethodDescriptorSupplier("IsRegistered"))
              .build();
        }
      }
    }
    return getIsRegisteredMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionReq,
      java.conditionpb.ConditionProto.ConditionResp> getSaveConditionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveCondition",
      requestType = java.conditionpb.ConditionProto.ConditionReq.class,
      responseType = java.conditionpb.ConditionProto.ConditionResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionReq,
      java.conditionpb.ConditionProto.ConditionResp> getSaveConditionMethod() {
    io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionReq, java.conditionpb.ConditionProto.ConditionResp> getSaveConditionMethod;
    if ((getSaveConditionMethod = ConditionServiceGrpc.getSaveConditionMethod) == null) {
      synchronized (ConditionServiceGrpc.class) {
        if ((getSaveConditionMethod = ConditionServiceGrpc.getSaveConditionMethod) == null) {
          ConditionServiceGrpc.getSaveConditionMethod = getSaveConditionMethod =
              io.grpc.MethodDescriptor.<java.conditionpb.ConditionProto.ConditionReq, java.conditionpb.ConditionProto.ConditionResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveCondition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.conditionpb.ConditionProto.ConditionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.conditionpb.ConditionProto.ConditionResp.getDefaultInstance()))
              .setSchemaDescriptor(new ConditionServiceMethodDescriptorSupplier("SaveCondition"))
              .build();
        }
      }
    }
    return getSaveConditionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionAccountIdReq,
      java.conditionpb.ConditionProto.ConditionResp> getReadMyConditionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadMyCondition",
      requestType = java.conditionpb.ConditionProto.ConditionAccountIdReq.class,
      responseType = java.conditionpb.ConditionProto.ConditionResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionAccountIdReq,
      java.conditionpb.ConditionProto.ConditionResp> getReadMyConditionMethod() {
    io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionAccountIdReq, java.conditionpb.ConditionProto.ConditionResp> getReadMyConditionMethod;
    if ((getReadMyConditionMethod = ConditionServiceGrpc.getReadMyConditionMethod) == null) {
      synchronized (ConditionServiceGrpc.class) {
        if ((getReadMyConditionMethod = ConditionServiceGrpc.getReadMyConditionMethod) == null) {
          ConditionServiceGrpc.getReadMyConditionMethod = getReadMyConditionMethod =
              io.grpc.MethodDescriptor.<java.conditionpb.ConditionProto.ConditionAccountIdReq, java.conditionpb.ConditionProto.ConditionResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadMyCondition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.conditionpb.ConditionProto.ConditionAccountIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.conditionpb.ConditionProto.ConditionResp.getDefaultInstance()))
              .setSchemaDescriptor(new ConditionServiceMethodDescriptorSupplier("ReadMyCondition"))
              .build();
        }
      }
    }
    return getReadMyConditionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      java.conditionpb.ConditionProto.ConditionRespList> getReadAllConditionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadAllCondition",
      requestType = com.google.protobuf.Empty.class,
      responseType = java.conditionpb.ConditionProto.ConditionRespList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      java.conditionpb.ConditionProto.ConditionRespList> getReadAllConditionMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, java.conditionpb.ConditionProto.ConditionRespList> getReadAllConditionMethod;
    if ((getReadAllConditionMethod = ConditionServiceGrpc.getReadAllConditionMethod) == null) {
      synchronized (ConditionServiceGrpc.class) {
        if ((getReadAllConditionMethod = ConditionServiceGrpc.getReadAllConditionMethod) == null) {
          ConditionServiceGrpc.getReadAllConditionMethod = getReadAllConditionMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, java.conditionpb.ConditionProto.ConditionRespList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadAllCondition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.conditionpb.ConditionProto.ConditionRespList.getDefaultInstance()))
              .setSchemaDescriptor(new ConditionServiceMethodDescriptorSupplier("ReadAllCondition"))
              .build();
        }
      }
    }
    return getReadAllConditionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionReadByWhereReq,
      java.conditionpb.ConditionProto.ConditionRespList> getReadByWhereConditionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadByWhereCondition",
      requestType = java.conditionpb.ConditionProto.ConditionReadByWhereReq.class,
      responseType = java.conditionpb.ConditionProto.ConditionRespList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionReadByWhereReq,
      java.conditionpb.ConditionProto.ConditionRespList> getReadByWhereConditionMethod() {
    io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionReadByWhereReq, java.conditionpb.ConditionProto.ConditionRespList> getReadByWhereConditionMethod;
    if ((getReadByWhereConditionMethod = ConditionServiceGrpc.getReadByWhereConditionMethod) == null) {
      synchronized (ConditionServiceGrpc.class) {
        if ((getReadByWhereConditionMethod = ConditionServiceGrpc.getReadByWhereConditionMethod) == null) {
          ConditionServiceGrpc.getReadByWhereConditionMethod = getReadByWhereConditionMethod =
              io.grpc.MethodDescriptor.<java.conditionpb.ConditionProto.ConditionReadByWhereReq, java.conditionpb.ConditionProto.ConditionRespList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadByWhereCondition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.conditionpb.ConditionProto.ConditionReadByWhereReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.conditionpb.ConditionProto.ConditionRespList.getDefaultInstance()))
              .setSchemaDescriptor(new ConditionServiceMethodDescriptorSupplier("ReadByWhereCondition"))
              .build();
        }
      }
    }
    return getReadByWhereConditionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionReqWithId,
      java.conditionpb.ConditionProto.ConditionResp> getUpdateConditionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateCondition",
      requestType = java.conditionpb.ConditionProto.ConditionReqWithId.class,
      responseType = java.conditionpb.ConditionProto.ConditionResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionReqWithId,
      java.conditionpb.ConditionProto.ConditionResp> getUpdateConditionMethod() {
    io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionReqWithId, java.conditionpb.ConditionProto.ConditionResp> getUpdateConditionMethod;
    if ((getUpdateConditionMethod = ConditionServiceGrpc.getUpdateConditionMethod) == null) {
      synchronized (ConditionServiceGrpc.class) {
        if ((getUpdateConditionMethod = ConditionServiceGrpc.getUpdateConditionMethod) == null) {
          ConditionServiceGrpc.getUpdateConditionMethod = getUpdateConditionMethod =
              io.grpc.MethodDescriptor.<java.conditionpb.ConditionProto.ConditionReqWithId, java.conditionpb.ConditionProto.ConditionResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateCondition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.conditionpb.ConditionProto.ConditionReqWithId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.conditionpb.ConditionProto.ConditionResp.getDefaultInstance()))
              .setSchemaDescriptor(new ConditionServiceMethodDescriptorSupplier("updateCondition"))
              .build();
        }
      }
    }
    return getUpdateConditionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionIdReq,
      java.conditionpb.ConditionProto.ConditionDeleteResp> getDeleteConditionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCondition",
      requestType = java.conditionpb.ConditionProto.ConditionIdReq.class,
      responseType = java.conditionpb.ConditionProto.ConditionDeleteResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionIdReq,
      java.conditionpb.ConditionProto.ConditionDeleteResp> getDeleteConditionMethod() {
    io.grpc.MethodDescriptor<java.conditionpb.ConditionProto.ConditionIdReq, java.conditionpb.ConditionProto.ConditionDeleteResp> getDeleteConditionMethod;
    if ((getDeleteConditionMethod = ConditionServiceGrpc.getDeleteConditionMethod) == null) {
      synchronized (ConditionServiceGrpc.class) {
        if ((getDeleteConditionMethod = ConditionServiceGrpc.getDeleteConditionMethod) == null) {
          ConditionServiceGrpc.getDeleteConditionMethod = getDeleteConditionMethod =
              io.grpc.MethodDescriptor.<java.conditionpb.ConditionProto.ConditionIdReq, java.conditionpb.ConditionProto.ConditionDeleteResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCondition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.conditionpb.ConditionProto.ConditionIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.conditionpb.ConditionProto.ConditionDeleteResp.getDefaultInstance()))
              .setSchemaDescriptor(new ConditionServiceMethodDescriptorSupplier("DeleteCondition"))
              .build();
        }
      }
    }
    return getDeleteConditionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConditionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConditionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConditionServiceStub>() {
        @java.lang.Override
        public ConditionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConditionServiceStub(channel, callOptions);
        }
      };
    return ConditionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConditionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConditionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConditionServiceBlockingStub>() {
        @java.lang.Override
        public ConditionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConditionServiceBlockingStub(channel, callOptions);
        }
      };
    return ConditionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConditionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConditionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConditionServiceFutureStub>() {
        @java.lang.Override
        public ConditionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConditionServiceFutureStub(channel, callOptions);
        }
      };
    return ConditionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void isRegistered(java.conditionpb.ConditionProto.ConditionAccountIdReq request,
        io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionIsRegisteredResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsRegisteredMethod(), responseObserver);
    }

    /**
     */
    default void saveCondition(java.conditionpb.ConditionProto.ConditionReq request,
        io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveConditionMethod(), responseObserver);
    }

    /**
     */
    default void readMyCondition(java.conditionpb.ConditionProto.ConditionAccountIdReq request,
        io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMyConditionMethod(), responseObserver);
    }

    /**
     */
    default void readAllCondition(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionRespList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadAllConditionMethod(), responseObserver);
    }

    /**
     */
    default void readByWhereCondition(java.conditionpb.ConditionProto.ConditionReadByWhereReq request,
        io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionRespList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadByWhereConditionMethod(), responseObserver);
    }

    /**
     */
    default void updateCondition(java.conditionpb.ConditionProto.ConditionReqWithId request,
        io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateConditionMethod(), responseObserver);
    }

    /**
     */
    default void deleteCondition(java.conditionpb.ConditionProto.ConditionIdReq request,
        io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionDeleteResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteConditionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ConditionService.
   */
  public static abstract class ConditionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ConditionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ConditionService.
   */
  public static final class ConditionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ConditionServiceStub> {
    private ConditionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConditionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConditionServiceStub(channel, callOptions);
    }

    /**
     */
    public void isRegistered(java.conditionpb.ConditionProto.ConditionAccountIdReq request,
        io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionIsRegisteredResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsRegisteredMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveCondition(java.conditionpb.ConditionProto.ConditionReq request,
        io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveConditionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readMyCondition(java.conditionpb.ConditionProto.ConditionAccountIdReq request,
        io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadMyConditionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readAllCondition(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionRespList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadAllConditionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readByWhereCondition(java.conditionpb.ConditionProto.ConditionReadByWhereReq request,
        io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionRespList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadByWhereConditionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCondition(java.conditionpb.ConditionProto.ConditionReqWithId request,
        io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateConditionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCondition(java.conditionpb.ConditionProto.ConditionIdReq request,
        io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionDeleteResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteConditionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ConditionService.
   */
  public static final class ConditionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ConditionServiceBlockingStub> {
    private ConditionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConditionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConditionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.conditionpb.ConditionProto.ConditionIsRegisteredResp isRegistered(java.conditionpb.ConditionProto.ConditionAccountIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsRegisteredMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.conditionpb.ConditionProto.ConditionResp saveCondition(java.conditionpb.ConditionProto.ConditionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveConditionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.conditionpb.ConditionProto.ConditionResp readMyCondition(java.conditionpb.ConditionProto.ConditionAccountIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadMyConditionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.conditionpb.ConditionProto.ConditionRespList readAllCondition(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadAllConditionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.conditionpb.ConditionProto.ConditionRespList readByWhereCondition(java.conditionpb.ConditionProto.ConditionReadByWhereReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadByWhereConditionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.conditionpb.ConditionProto.ConditionResp updateCondition(java.conditionpb.ConditionProto.ConditionReqWithId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateConditionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.conditionpb.ConditionProto.ConditionDeleteResp deleteCondition(java.conditionpb.ConditionProto.ConditionIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteConditionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ConditionService.
   */
  public static final class ConditionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ConditionServiceFutureStub> {
    private ConditionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConditionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConditionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.conditionpb.ConditionProto.ConditionIsRegisteredResp> isRegistered(
        java.conditionpb.ConditionProto.ConditionAccountIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsRegisteredMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.conditionpb.ConditionProto.ConditionResp> saveCondition(
        java.conditionpb.ConditionProto.ConditionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveConditionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.conditionpb.ConditionProto.ConditionResp> readMyCondition(
        java.conditionpb.ConditionProto.ConditionAccountIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadMyConditionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.conditionpb.ConditionProto.ConditionRespList> readAllCondition(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadAllConditionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.conditionpb.ConditionProto.ConditionRespList> readByWhereCondition(
        java.conditionpb.ConditionProto.ConditionReadByWhereReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadByWhereConditionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.conditionpb.ConditionProto.ConditionResp> updateCondition(
        java.conditionpb.ConditionProto.ConditionReqWithId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateConditionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.conditionpb.ConditionProto.ConditionDeleteResp> deleteCondition(
        java.conditionpb.ConditionProto.ConditionIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteConditionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IS_REGISTERED = 0;
  private static final int METHODID_SAVE_CONDITION = 1;
  private static final int METHODID_READ_MY_CONDITION = 2;
  private static final int METHODID_READ_ALL_CONDITION = 3;
  private static final int METHODID_READ_BY_WHERE_CONDITION = 4;
  private static final int METHODID_UPDATE_CONDITION = 5;
  private static final int METHODID_DELETE_CONDITION = 6;

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
        case METHODID_IS_REGISTERED:
          serviceImpl.isRegistered((java.conditionpb.ConditionProto.ConditionAccountIdReq) request,
              (io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionIsRegisteredResp>) responseObserver);
          break;
        case METHODID_SAVE_CONDITION:
          serviceImpl.saveCondition((java.conditionpb.ConditionProto.ConditionReq) request,
              (io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionResp>) responseObserver);
          break;
        case METHODID_READ_MY_CONDITION:
          serviceImpl.readMyCondition((java.conditionpb.ConditionProto.ConditionAccountIdReq) request,
              (io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionResp>) responseObserver);
          break;
        case METHODID_READ_ALL_CONDITION:
          serviceImpl.readAllCondition((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionRespList>) responseObserver);
          break;
        case METHODID_READ_BY_WHERE_CONDITION:
          serviceImpl.readByWhereCondition((java.conditionpb.ConditionProto.ConditionReadByWhereReq) request,
              (io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionRespList>) responseObserver);
          break;
        case METHODID_UPDATE_CONDITION:
          serviceImpl.updateCondition((java.conditionpb.ConditionProto.ConditionReqWithId) request,
              (io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionResp>) responseObserver);
          break;
        case METHODID_DELETE_CONDITION:
          serviceImpl.deleteCondition((java.conditionpb.ConditionProto.ConditionIdReq) request,
              (io.grpc.stub.StreamObserver<java.conditionpb.ConditionProto.ConditionDeleteResp>) responseObserver);
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
          getIsRegisteredMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.conditionpb.ConditionProto.ConditionAccountIdReq,
              java.conditionpb.ConditionProto.ConditionIsRegisteredResp>(
                service, METHODID_IS_REGISTERED)))
        .addMethod(
          getSaveConditionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.conditionpb.ConditionProto.ConditionReq,
              java.conditionpb.ConditionProto.ConditionResp>(
                service, METHODID_SAVE_CONDITION)))
        .addMethod(
          getReadMyConditionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.conditionpb.ConditionProto.ConditionAccountIdReq,
              java.conditionpb.ConditionProto.ConditionResp>(
                service, METHODID_READ_MY_CONDITION)))
        .addMethod(
          getReadAllConditionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              java.conditionpb.ConditionProto.ConditionRespList>(
                service, METHODID_READ_ALL_CONDITION)))
        .addMethod(
          getReadByWhereConditionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.conditionpb.ConditionProto.ConditionReadByWhereReq,
              java.conditionpb.ConditionProto.ConditionRespList>(
                service, METHODID_READ_BY_WHERE_CONDITION)))
        .addMethod(
          getUpdateConditionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.conditionpb.ConditionProto.ConditionReqWithId,
              java.conditionpb.ConditionProto.ConditionResp>(
                service, METHODID_UPDATE_CONDITION)))
        .addMethod(
          getDeleteConditionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.conditionpb.ConditionProto.ConditionIdReq,
              java.conditionpb.ConditionProto.ConditionDeleteResp>(
                service, METHODID_DELETE_CONDITION)))
        .build();
  }

  private static abstract class ConditionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConditionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return java.conditionpb.ConditionProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConditionService");
    }
  }

  private static final class ConditionServiceFileDescriptorSupplier
      extends ConditionServiceBaseDescriptorSupplier {
    ConditionServiceFileDescriptorSupplier() {}
  }

  private static final class ConditionServiceMethodDescriptorSupplier
      extends ConditionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ConditionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ConditionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConditionServiceFileDescriptorSupplier())
              .addMethod(getIsRegisteredMethod())
              .addMethod(getSaveConditionMethod())
              .addMethod(getReadMyConditionMethod())
              .addMethod(getReadAllConditionMethod())
              .addMethod(getReadByWhereConditionMethod())
              .addMethod(getUpdateConditionMethod())
              .addMethod(getDeleteConditionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
