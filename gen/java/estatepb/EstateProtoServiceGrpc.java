package java.estatepb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: proto/estate.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EstateProtoServiceGrpc {

  private EstateProtoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "estatepb.EstateProtoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<java.estatepb.EstateProto.EstateIdRequest,
      java.estatepb.EstateProto.EstateInfoResponse> getFindEstateInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindEstateInfo",
      requestType = java.estatepb.EstateProto.EstateIdRequest.class,
      responseType = java.estatepb.EstateProto.EstateInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.estatepb.EstateProto.EstateIdRequest,
      java.estatepb.EstateProto.EstateInfoResponse> getFindEstateInfoMethod() {
    io.grpc.MethodDescriptor<java.estatepb.EstateProto.EstateIdRequest, java.estatepb.EstateProto.EstateInfoResponse> getFindEstateInfoMethod;
    if ((getFindEstateInfoMethod = EstateProtoServiceGrpc.getFindEstateInfoMethod) == null) {
      synchronized (EstateProtoServiceGrpc.class) {
        if ((getFindEstateInfoMethod = EstateProtoServiceGrpc.getFindEstateInfoMethod) == null) {
          EstateProtoServiceGrpc.getFindEstateInfoMethod = getFindEstateInfoMethod =
              io.grpc.MethodDescriptor.<java.estatepb.EstateProto.EstateIdRequest, java.estatepb.EstateProto.EstateInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindEstateInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.estatepb.EstateProto.EstateIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.estatepb.EstateProto.EstateInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EstateProtoServiceMethodDescriptorSupplier("FindEstateInfo"))
              .build();
        }
      }
    }
    return getFindEstateInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.estatepb.EstateProto.EstateAllRequest,
      java.estatepb.EstateProto.EstateAllResponse> getGetEstateAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEstateAll",
      requestType = java.estatepb.EstateProto.EstateAllRequest.class,
      responseType = java.estatepb.EstateProto.EstateAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.estatepb.EstateProto.EstateAllRequest,
      java.estatepb.EstateProto.EstateAllResponse> getGetEstateAllMethod() {
    io.grpc.MethodDescriptor<java.estatepb.EstateProto.EstateAllRequest, java.estatepb.EstateProto.EstateAllResponse> getGetEstateAllMethod;
    if ((getGetEstateAllMethod = EstateProtoServiceGrpc.getGetEstateAllMethod) == null) {
      synchronized (EstateProtoServiceGrpc.class) {
        if ((getGetEstateAllMethod = EstateProtoServiceGrpc.getGetEstateAllMethod) == null) {
          EstateProtoServiceGrpc.getGetEstateAllMethod = getGetEstateAllMethod =
              io.grpc.MethodDescriptor.<java.estatepb.EstateProto.EstateAllRequest, java.estatepb.EstateProto.EstateAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEstateAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.estatepb.EstateProto.EstateAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.estatepb.EstateProto.EstateAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EstateProtoServiceMethodDescriptorSupplier("GetEstateAll"))
              .build();
        }
      }
    }
    return getGetEstateAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.estatepb.EstateProto.EstateSaveRequest,
      java.estatepb.EstateProto.EstateSaveResponse> getSaveEstateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveEstate",
      requestType = java.estatepb.EstateProto.EstateSaveRequest.class,
      responseType = java.estatepb.EstateProto.EstateSaveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.estatepb.EstateProto.EstateSaveRequest,
      java.estatepb.EstateProto.EstateSaveResponse> getSaveEstateMethod() {
    io.grpc.MethodDescriptor<java.estatepb.EstateProto.EstateSaveRequest, java.estatepb.EstateProto.EstateSaveResponse> getSaveEstateMethod;
    if ((getSaveEstateMethod = EstateProtoServiceGrpc.getSaveEstateMethod) == null) {
      synchronized (EstateProtoServiceGrpc.class) {
        if ((getSaveEstateMethod = EstateProtoServiceGrpc.getSaveEstateMethod) == null) {
          EstateProtoServiceGrpc.getSaveEstateMethod = getSaveEstateMethod =
              io.grpc.MethodDescriptor.<java.estatepb.EstateProto.EstateSaveRequest, java.estatepb.EstateProto.EstateSaveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveEstate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.estatepb.EstateProto.EstateSaveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.estatepb.EstateProto.EstateSaveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EstateProtoServiceMethodDescriptorSupplier("SaveEstate"))
              .build();
        }
      }
    }
    return getSaveEstateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.estatepb.EstateProto.EstateUpdateRequest,
      java.estatepb.EstateProto.EstateUpdateResponse> getUpdateEstateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEstate",
      requestType = java.estatepb.EstateProto.EstateUpdateRequest.class,
      responseType = java.estatepb.EstateProto.EstateUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.estatepb.EstateProto.EstateUpdateRequest,
      java.estatepb.EstateProto.EstateUpdateResponse> getUpdateEstateMethod() {
    io.grpc.MethodDescriptor<java.estatepb.EstateProto.EstateUpdateRequest, java.estatepb.EstateProto.EstateUpdateResponse> getUpdateEstateMethod;
    if ((getUpdateEstateMethod = EstateProtoServiceGrpc.getUpdateEstateMethod) == null) {
      synchronized (EstateProtoServiceGrpc.class) {
        if ((getUpdateEstateMethod = EstateProtoServiceGrpc.getUpdateEstateMethod) == null) {
          EstateProtoServiceGrpc.getUpdateEstateMethod = getUpdateEstateMethod =
              io.grpc.MethodDescriptor.<java.estatepb.EstateProto.EstateUpdateRequest, java.estatepb.EstateProto.EstateUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEstate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.estatepb.EstateProto.EstateUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.estatepb.EstateProto.EstateUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EstateProtoServiceMethodDescriptorSupplier("UpdateEstate"))
              .build();
        }
      }
    }
    return getUpdateEstateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.estatepb.EstateProto.EstateDeleteRequest,
      java.estatepb.EstateProto.EstateDeleteResponse> getDeleteEstateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEstate",
      requestType = java.estatepb.EstateProto.EstateDeleteRequest.class,
      responseType = java.estatepb.EstateProto.EstateDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.estatepb.EstateProto.EstateDeleteRequest,
      java.estatepb.EstateProto.EstateDeleteResponse> getDeleteEstateMethod() {
    io.grpc.MethodDescriptor<java.estatepb.EstateProto.EstateDeleteRequest, java.estatepb.EstateProto.EstateDeleteResponse> getDeleteEstateMethod;
    if ((getDeleteEstateMethod = EstateProtoServiceGrpc.getDeleteEstateMethod) == null) {
      synchronized (EstateProtoServiceGrpc.class) {
        if ((getDeleteEstateMethod = EstateProtoServiceGrpc.getDeleteEstateMethod) == null) {
          EstateProtoServiceGrpc.getDeleteEstateMethod = getDeleteEstateMethod =
              io.grpc.MethodDescriptor.<java.estatepb.EstateProto.EstateDeleteRequest, java.estatepb.EstateProto.EstateDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEstate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.estatepb.EstateProto.EstateDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.estatepb.EstateProto.EstateDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EstateProtoServiceMethodDescriptorSupplier("DeleteEstate"))
              .build();
        }
      }
    }
    return getDeleteEstateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EstateProtoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EstateProtoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EstateProtoServiceStub>() {
        @java.lang.Override
        public EstateProtoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EstateProtoServiceStub(channel, callOptions);
        }
      };
    return EstateProtoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EstateProtoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EstateProtoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EstateProtoServiceBlockingStub>() {
        @java.lang.Override
        public EstateProtoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EstateProtoServiceBlockingStub(channel, callOptions);
        }
      };
    return EstateProtoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EstateProtoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EstateProtoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EstateProtoServiceFutureStub>() {
        @java.lang.Override
        public EstateProtoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EstateProtoServiceFutureStub(channel, callOptions);
        }
      };
    return EstateProtoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void findEstateInfo(java.estatepb.EstateProto.EstateIdRequest request,
        io.grpc.stub.StreamObserver<java.estatepb.EstateProto.EstateInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindEstateInfoMethod(), responseObserver);
    }

    /**
     */
    default void getEstateAll(java.estatepb.EstateProto.EstateAllRequest request,
        io.grpc.stub.StreamObserver<java.estatepb.EstateProto.EstateAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEstateAllMethod(), responseObserver);
    }

    /**
     */
    default void saveEstate(java.estatepb.EstateProto.EstateSaveRequest request,
        io.grpc.stub.StreamObserver<java.estatepb.EstateProto.EstateSaveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveEstateMethod(), responseObserver);
    }

    /**
     */
    default void updateEstate(java.estatepb.EstateProto.EstateUpdateRequest request,
        io.grpc.stub.StreamObserver<java.estatepb.EstateProto.EstateUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEstateMethod(), responseObserver);
    }

    /**
     */
    default void deleteEstate(java.estatepb.EstateProto.EstateDeleteRequest request,
        io.grpc.stub.StreamObserver<java.estatepb.EstateProto.EstateDeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEstateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EstateProtoService.
   */
  public static abstract class EstateProtoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EstateProtoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EstateProtoService.
   */
  public static final class EstateProtoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EstateProtoServiceStub> {
    private EstateProtoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EstateProtoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EstateProtoServiceStub(channel, callOptions);
    }

    /**
     */
    public void findEstateInfo(java.estatepb.EstateProto.EstateIdRequest request,
        io.grpc.stub.StreamObserver<java.estatepb.EstateProto.EstateInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindEstateInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEstateAll(java.estatepb.EstateProto.EstateAllRequest request,
        io.grpc.stub.StreamObserver<java.estatepb.EstateProto.EstateAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEstateAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveEstate(java.estatepb.EstateProto.EstateSaveRequest request,
        io.grpc.stub.StreamObserver<java.estatepb.EstateProto.EstateSaveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveEstateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEstate(java.estatepb.EstateProto.EstateUpdateRequest request,
        io.grpc.stub.StreamObserver<java.estatepb.EstateProto.EstateUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEstateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEstate(java.estatepb.EstateProto.EstateDeleteRequest request,
        io.grpc.stub.StreamObserver<java.estatepb.EstateProto.EstateDeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEstateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EstateProtoService.
   */
  public static final class EstateProtoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EstateProtoServiceBlockingStub> {
    private EstateProtoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EstateProtoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EstateProtoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.estatepb.EstateProto.EstateInfoResponse findEstateInfo(java.estatepb.EstateProto.EstateIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindEstateInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.estatepb.EstateProto.EstateAllResponse getEstateAll(java.estatepb.EstateProto.EstateAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEstateAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.estatepb.EstateProto.EstateSaveResponse saveEstate(java.estatepb.EstateProto.EstateSaveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveEstateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.estatepb.EstateProto.EstateUpdateResponse updateEstate(java.estatepb.EstateProto.EstateUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEstateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.estatepb.EstateProto.EstateDeleteResponse deleteEstate(java.estatepb.EstateProto.EstateDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEstateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EstateProtoService.
   */
  public static final class EstateProtoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EstateProtoServiceFutureStub> {
    private EstateProtoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EstateProtoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EstateProtoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.estatepb.EstateProto.EstateInfoResponse> findEstateInfo(
        java.estatepb.EstateProto.EstateIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindEstateInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.estatepb.EstateProto.EstateAllResponse> getEstateAll(
        java.estatepb.EstateProto.EstateAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEstateAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.estatepb.EstateProto.EstateSaveResponse> saveEstate(
        java.estatepb.EstateProto.EstateSaveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveEstateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.estatepb.EstateProto.EstateUpdateResponse> updateEstate(
        java.estatepb.EstateProto.EstateUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEstateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.estatepb.EstateProto.EstateDeleteResponse> deleteEstate(
        java.estatepb.EstateProto.EstateDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEstateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_ESTATE_INFO = 0;
  private static final int METHODID_GET_ESTATE_ALL = 1;
  private static final int METHODID_SAVE_ESTATE = 2;
  private static final int METHODID_UPDATE_ESTATE = 3;
  private static final int METHODID_DELETE_ESTATE = 4;

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
        case METHODID_FIND_ESTATE_INFO:
          serviceImpl.findEstateInfo((java.estatepb.EstateProto.EstateIdRequest) request,
              (io.grpc.stub.StreamObserver<java.estatepb.EstateProto.EstateInfoResponse>) responseObserver);
          break;
        case METHODID_GET_ESTATE_ALL:
          serviceImpl.getEstateAll((java.estatepb.EstateProto.EstateAllRequest) request,
              (io.grpc.stub.StreamObserver<java.estatepb.EstateProto.EstateAllResponse>) responseObserver);
          break;
        case METHODID_SAVE_ESTATE:
          serviceImpl.saveEstate((java.estatepb.EstateProto.EstateSaveRequest) request,
              (io.grpc.stub.StreamObserver<java.estatepb.EstateProto.EstateSaveResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ESTATE:
          serviceImpl.updateEstate((java.estatepb.EstateProto.EstateUpdateRequest) request,
              (io.grpc.stub.StreamObserver<java.estatepb.EstateProto.EstateUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE_ESTATE:
          serviceImpl.deleteEstate((java.estatepb.EstateProto.EstateDeleteRequest) request,
              (io.grpc.stub.StreamObserver<java.estatepb.EstateProto.EstateDeleteResponse>) responseObserver);
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
          getFindEstateInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.estatepb.EstateProto.EstateIdRequest,
              java.estatepb.EstateProto.EstateInfoResponse>(
                service, METHODID_FIND_ESTATE_INFO)))
        .addMethod(
          getGetEstateAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.estatepb.EstateProto.EstateAllRequest,
              java.estatepb.EstateProto.EstateAllResponse>(
                service, METHODID_GET_ESTATE_ALL)))
        .addMethod(
          getSaveEstateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.estatepb.EstateProto.EstateSaveRequest,
              java.estatepb.EstateProto.EstateSaveResponse>(
                service, METHODID_SAVE_ESTATE)))
        .addMethod(
          getUpdateEstateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.estatepb.EstateProto.EstateUpdateRequest,
              java.estatepb.EstateProto.EstateUpdateResponse>(
                service, METHODID_UPDATE_ESTATE)))
        .addMethod(
          getDeleteEstateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.estatepb.EstateProto.EstateDeleteRequest,
              java.estatepb.EstateProto.EstateDeleteResponse>(
                service, METHODID_DELETE_ESTATE)))
        .build();
  }

  private static abstract class EstateProtoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EstateProtoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return java.estatepb.EstateProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EstateProtoService");
    }
  }

  private static final class EstateProtoServiceFileDescriptorSupplier
      extends EstateProtoServiceBaseDescriptorSupplier {
    EstateProtoServiceFileDescriptorSupplier() {}
  }

  private static final class EstateProtoServiceMethodDescriptorSupplier
      extends EstateProtoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EstateProtoServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EstateProtoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EstateProtoServiceFileDescriptorSupplier())
              .addMethod(getFindEstateInfoMethod())
              .addMethod(getGetEstateAllMethod())
              .addMethod(getSaveEstateMethod())
              .addMethod(getUpdateEstateMethod())
              .addMethod(getDeleteEstateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
