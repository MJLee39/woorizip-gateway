package java.zippb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: proto/zip.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ZipProtoServiceGrpc {

  private ZipProtoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "zippb.ZipProtoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipIdRequest,
      java.zippb.ZipProto.ZipIdResponse> getGetZipInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZipInfo",
      requestType = java.zippb.ZipProto.ZipIdRequest.class,
      responseType = java.zippb.ZipProto.ZipIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipIdRequest,
      java.zippb.ZipProto.ZipIdResponse> getGetZipInfoMethod() {
    io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipIdRequest, java.zippb.ZipProto.ZipIdResponse> getGetZipInfoMethod;
    if ((getGetZipInfoMethod = ZipProtoServiceGrpc.getGetZipInfoMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getGetZipInfoMethod = ZipProtoServiceGrpc.getGetZipInfoMethod) == null) {
          ZipProtoServiceGrpc.getGetZipInfoMethod = getGetZipInfoMethod =
              io.grpc.MethodDescriptor.<java.zippb.ZipProto.ZipIdRequest, java.zippb.ZipProto.ZipIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZipInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("GetZipInfo"))
              .build();
        }
      }
    }
    return getGetZipInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipAllRequest,
      java.zippb.ZipProto.ZipAllResponse> getGetZipAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZipAll",
      requestType = java.zippb.ZipProto.ZipAllRequest.class,
      responseType = java.zippb.ZipProto.ZipAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipAllRequest,
      java.zippb.ZipProto.ZipAllResponse> getGetZipAllMethod() {
    io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipAllRequest, java.zippb.ZipProto.ZipAllResponse> getGetZipAllMethod;
    if ((getGetZipAllMethod = ZipProtoServiceGrpc.getGetZipAllMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getGetZipAllMethod = ZipProtoServiceGrpc.getGetZipAllMethod) == null) {
          ZipProtoServiceGrpc.getGetZipAllMethod = getGetZipAllMethod =
              io.grpc.MethodDescriptor.<java.zippb.ZipProto.ZipAllRequest, java.zippb.ZipProto.ZipAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZipAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("GetZipAll"))
              .build();
        }
      }
    }
    return getGetZipAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipShowYesRequest,
      java.zippb.ZipProto.ZipShowYesResponse> getGetZipShowYesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZipShowYes",
      requestType = java.zippb.ZipProto.ZipShowYesRequest.class,
      responseType = java.zippb.ZipProto.ZipShowYesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipShowYesRequest,
      java.zippb.ZipProto.ZipShowYesResponse> getGetZipShowYesMethod() {
    io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipShowYesRequest, java.zippb.ZipProto.ZipShowYesResponse> getGetZipShowYesMethod;
    if ((getGetZipShowYesMethod = ZipProtoServiceGrpc.getGetZipShowYesMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getGetZipShowYesMethod = ZipProtoServiceGrpc.getGetZipShowYesMethod) == null) {
          ZipProtoServiceGrpc.getGetZipShowYesMethod = getGetZipShowYesMethod =
              io.grpc.MethodDescriptor.<java.zippb.ZipProto.ZipShowYesRequest, java.zippb.ZipProto.ZipShowYesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZipShowYes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipShowYesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipShowYesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("GetZipShowYes"))
              .build();
        }
      }
    }
    return getGetZipShowYesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipShowNoRequest,
      java.zippb.ZipProto.ZipShowNoResponse> getGetZipShowNoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZipShowNo",
      requestType = java.zippb.ZipProto.ZipShowNoRequest.class,
      responseType = java.zippb.ZipProto.ZipShowNoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipShowNoRequest,
      java.zippb.ZipProto.ZipShowNoResponse> getGetZipShowNoMethod() {
    io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipShowNoRequest, java.zippb.ZipProto.ZipShowNoResponse> getGetZipShowNoMethod;
    if ((getGetZipShowNoMethod = ZipProtoServiceGrpc.getGetZipShowNoMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getGetZipShowNoMethod = ZipProtoServiceGrpc.getGetZipShowNoMethod) == null) {
          ZipProtoServiceGrpc.getGetZipShowNoMethod = getGetZipShowNoMethod =
              io.grpc.MethodDescriptor.<java.zippb.ZipProto.ZipShowNoRequest, java.zippb.ZipProto.ZipShowNoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZipShowNo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipShowNoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipShowNoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("GetZipShowNo"))
              .build();
        }
      }
    }
    return getGetZipShowNoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipAgentIdRequest,
      java.zippb.ZipProto.ZipAgentIdResponse> getGetZipByAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZipByAgent",
      requestType = java.zippb.ZipProto.ZipAgentIdRequest.class,
      responseType = java.zippb.ZipProto.ZipAgentIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipAgentIdRequest,
      java.zippb.ZipProto.ZipAgentIdResponse> getGetZipByAgentMethod() {
    io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipAgentIdRequest, java.zippb.ZipProto.ZipAgentIdResponse> getGetZipByAgentMethod;
    if ((getGetZipByAgentMethod = ZipProtoServiceGrpc.getGetZipByAgentMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getGetZipByAgentMethod = ZipProtoServiceGrpc.getGetZipByAgentMethod) == null) {
          ZipProtoServiceGrpc.getGetZipByAgentMethod = getGetZipByAgentMethod =
              io.grpc.MethodDescriptor.<java.zippb.ZipProto.ZipAgentIdRequest, java.zippb.ZipProto.ZipAgentIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZipByAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipAgentIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipAgentIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("GetZipByAgent"))
              .build();
        }
      }
    }
    return getGetZipByAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipEsateIdRequest,
      java.zippb.ZipProto.ZipEstateIdResponse> getGetZipByEstateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZipByEstate",
      requestType = java.zippb.ZipProto.ZipEsateIdRequest.class,
      responseType = java.zippb.ZipProto.ZipEstateIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipEsateIdRequest,
      java.zippb.ZipProto.ZipEstateIdResponse> getGetZipByEstateMethod() {
    io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipEsateIdRequest, java.zippb.ZipProto.ZipEstateIdResponse> getGetZipByEstateMethod;
    if ((getGetZipByEstateMethod = ZipProtoServiceGrpc.getGetZipByEstateMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getGetZipByEstateMethod = ZipProtoServiceGrpc.getGetZipByEstateMethod) == null) {
          ZipProtoServiceGrpc.getGetZipByEstateMethod = getGetZipByEstateMethod =
              io.grpc.MethodDescriptor.<java.zippb.ZipProto.ZipEsateIdRequest, java.zippb.ZipProto.ZipEstateIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZipByEstate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipEsateIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipEstateIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("GetZipByEstate"))
              .build();
        }
      }
    }
    return getGetZipByEstateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipInsertRequest,
      java.zippb.ZipProto.ZipInsertResponse> getSaveZipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveZip",
      requestType = java.zippb.ZipProto.ZipInsertRequest.class,
      responseType = java.zippb.ZipProto.ZipInsertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipInsertRequest,
      java.zippb.ZipProto.ZipInsertResponse> getSaveZipMethod() {
    io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipInsertRequest, java.zippb.ZipProto.ZipInsertResponse> getSaveZipMethod;
    if ((getSaveZipMethod = ZipProtoServiceGrpc.getSaveZipMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getSaveZipMethod = ZipProtoServiceGrpc.getSaveZipMethod) == null) {
          ZipProtoServiceGrpc.getSaveZipMethod = getSaveZipMethod =
              io.grpc.MethodDescriptor.<java.zippb.ZipProto.ZipInsertRequest, java.zippb.ZipProto.ZipInsertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveZip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipInsertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipInsertResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("SaveZip"))
              .build();
        }
      }
    }
    return getSaveZipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipUpdateRequest,
      java.zippb.ZipProto.ZipUpdateResponse> getUpdateZipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateZip",
      requestType = java.zippb.ZipProto.ZipUpdateRequest.class,
      responseType = java.zippb.ZipProto.ZipUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipUpdateRequest,
      java.zippb.ZipProto.ZipUpdateResponse> getUpdateZipMethod() {
    io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipUpdateRequest, java.zippb.ZipProto.ZipUpdateResponse> getUpdateZipMethod;
    if ((getUpdateZipMethod = ZipProtoServiceGrpc.getUpdateZipMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getUpdateZipMethod = ZipProtoServiceGrpc.getUpdateZipMethod) == null) {
          ZipProtoServiceGrpc.getUpdateZipMethod = getUpdateZipMethod =
              io.grpc.MethodDescriptor.<java.zippb.ZipProto.ZipUpdateRequest, java.zippb.ZipProto.ZipUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateZip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("UpdateZip"))
              .build();
        }
      }
    }
    return getUpdateZipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipDeleteRequest,
      java.zippb.ZipProto.ZipDeleteResponse> getDeleteZipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteZip",
      requestType = java.zippb.ZipProto.ZipDeleteRequest.class,
      responseType = java.zippb.ZipProto.ZipDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipDeleteRequest,
      java.zippb.ZipProto.ZipDeleteResponse> getDeleteZipMethod() {
    io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipDeleteRequest, java.zippb.ZipProto.ZipDeleteResponse> getDeleteZipMethod;
    if ((getDeleteZipMethod = ZipProtoServiceGrpc.getDeleteZipMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getDeleteZipMethod = ZipProtoServiceGrpc.getDeleteZipMethod) == null) {
          ZipProtoServiceGrpc.getDeleteZipMethod = getDeleteZipMethod =
              io.grpc.MethodDescriptor.<java.zippb.ZipProto.ZipDeleteRequest, java.zippb.ZipProto.ZipDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteZip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("DeleteZip"))
              .build();
        }
      }
    }
    return getDeleteZipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipSearchRequest,
      java.zippb.ZipProto.ZipSearchResponse> getSearchZipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchZip",
      requestType = java.zippb.ZipProto.ZipSearchRequest.class,
      responseType = java.zippb.ZipProto.ZipSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipSearchRequest,
      java.zippb.ZipProto.ZipSearchResponse> getSearchZipMethod() {
    io.grpc.MethodDescriptor<java.zippb.ZipProto.ZipSearchRequest, java.zippb.ZipProto.ZipSearchResponse> getSearchZipMethod;
    if ((getSearchZipMethod = ZipProtoServiceGrpc.getSearchZipMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getSearchZipMethod = ZipProtoServiceGrpc.getSearchZipMethod) == null) {
          ZipProtoServiceGrpc.getSearchZipMethod = getSearchZipMethod =
              io.grpc.MethodDescriptor.<java.zippb.ZipProto.ZipSearchRequest, java.zippb.ZipProto.ZipSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchZip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java.zippb.ZipProto.ZipSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("SearchZip"))
              .build();
        }
      }
    }
    return getSearchZipMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ZipProtoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZipProtoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZipProtoServiceStub>() {
        @java.lang.Override
        public ZipProtoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZipProtoServiceStub(channel, callOptions);
        }
      };
    return ZipProtoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ZipProtoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZipProtoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZipProtoServiceBlockingStub>() {
        @java.lang.Override
        public ZipProtoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZipProtoServiceBlockingStub(channel, callOptions);
        }
      };
    return ZipProtoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ZipProtoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZipProtoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZipProtoServiceFutureStub>() {
        @java.lang.Override
        public ZipProtoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZipProtoServiceFutureStub(channel, callOptions);
        }
      };
    return ZipProtoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getZipInfo(java.zippb.ZipProto.ZipIdRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZipInfoMethod(), responseObserver);
    }

    /**
     */
    default void getZipAll(java.zippb.ZipProto.ZipAllRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZipAllMethod(), responseObserver);
    }

    /**
     */
    default void getZipShowYes(java.zippb.ZipProto.ZipShowYesRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipShowYesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZipShowYesMethod(), responseObserver);
    }

    /**
     */
    default void getZipShowNo(java.zippb.ZipProto.ZipShowNoRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipShowNoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZipShowNoMethod(), responseObserver);
    }

    /**
     */
    default void getZipByAgent(java.zippb.ZipProto.ZipAgentIdRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipAgentIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZipByAgentMethod(), responseObserver);
    }

    /**
     */
    default void getZipByEstate(java.zippb.ZipProto.ZipEsateIdRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipEstateIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZipByEstateMethod(), responseObserver);
    }

    /**
     */
    default void saveZip(java.zippb.ZipProto.ZipInsertRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipInsertResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveZipMethod(), responseObserver);
    }

    /**
     */
    default void updateZip(java.zippb.ZipProto.ZipUpdateRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateZipMethod(), responseObserver);
    }

    /**
     */
    default void deleteZip(java.zippb.ZipProto.ZipDeleteRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipDeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteZipMethod(), responseObserver);
    }

    /**
     */
    default void searchZip(java.zippb.ZipProto.ZipSearchRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchZipMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ZipProtoService.
   */
  public static abstract class ZipProtoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ZipProtoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ZipProtoService.
   */
  public static final class ZipProtoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ZipProtoServiceStub> {
    private ZipProtoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZipProtoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZipProtoServiceStub(channel, callOptions);
    }

    /**
     */
    public void getZipInfo(java.zippb.ZipProto.ZipIdRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZipInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZipAll(java.zippb.ZipProto.ZipAllRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZipAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZipShowYes(java.zippb.ZipProto.ZipShowYesRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipShowYesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZipShowYesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZipShowNo(java.zippb.ZipProto.ZipShowNoRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipShowNoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZipShowNoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZipByAgent(java.zippb.ZipProto.ZipAgentIdRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipAgentIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZipByAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZipByEstate(java.zippb.ZipProto.ZipEsateIdRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipEstateIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZipByEstateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveZip(java.zippb.ZipProto.ZipInsertRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipInsertResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveZipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateZip(java.zippb.ZipProto.ZipUpdateRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateZipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteZip(java.zippb.ZipProto.ZipDeleteRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipDeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteZipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchZip(java.zippb.ZipProto.ZipSearchRequest request,
        io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchZipMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ZipProtoService.
   */
  public static final class ZipProtoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ZipProtoServiceBlockingStub> {
    private ZipProtoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZipProtoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZipProtoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.zippb.ZipProto.ZipIdResponse getZipInfo(java.zippb.ZipProto.ZipIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZipInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.zippb.ZipProto.ZipAllResponse getZipAll(java.zippb.ZipProto.ZipAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZipAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.zippb.ZipProto.ZipShowYesResponse getZipShowYes(java.zippb.ZipProto.ZipShowYesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZipShowYesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.zippb.ZipProto.ZipShowNoResponse getZipShowNo(java.zippb.ZipProto.ZipShowNoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZipShowNoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.zippb.ZipProto.ZipAgentIdResponse getZipByAgent(java.zippb.ZipProto.ZipAgentIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZipByAgentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.zippb.ZipProto.ZipEstateIdResponse getZipByEstate(java.zippb.ZipProto.ZipEsateIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZipByEstateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.zippb.ZipProto.ZipInsertResponse saveZip(java.zippb.ZipProto.ZipInsertRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveZipMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.zippb.ZipProto.ZipUpdateResponse updateZip(java.zippb.ZipProto.ZipUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateZipMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.zippb.ZipProto.ZipDeleteResponse deleteZip(java.zippb.ZipProto.ZipDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteZipMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.zippb.ZipProto.ZipSearchResponse searchZip(java.zippb.ZipProto.ZipSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchZipMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ZipProtoService.
   */
  public static final class ZipProtoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ZipProtoServiceFutureStub> {
    private ZipProtoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZipProtoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZipProtoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.zippb.ZipProto.ZipIdResponse> getZipInfo(
        java.zippb.ZipProto.ZipIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZipInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.zippb.ZipProto.ZipAllResponse> getZipAll(
        java.zippb.ZipProto.ZipAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZipAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.zippb.ZipProto.ZipShowYesResponse> getZipShowYes(
        java.zippb.ZipProto.ZipShowYesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZipShowYesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.zippb.ZipProto.ZipShowNoResponse> getZipShowNo(
        java.zippb.ZipProto.ZipShowNoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZipShowNoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.zippb.ZipProto.ZipAgentIdResponse> getZipByAgent(
        java.zippb.ZipProto.ZipAgentIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZipByAgentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.zippb.ZipProto.ZipEstateIdResponse> getZipByEstate(
        java.zippb.ZipProto.ZipEsateIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZipByEstateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.zippb.ZipProto.ZipInsertResponse> saveZip(
        java.zippb.ZipProto.ZipInsertRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveZipMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.zippb.ZipProto.ZipUpdateResponse> updateZip(
        java.zippb.ZipProto.ZipUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateZipMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.zippb.ZipProto.ZipDeleteResponse> deleteZip(
        java.zippb.ZipProto.ZipDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteZipMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java.zippb.ZipProto.ZipSearchResponse> searchZip(
        java.zippb.ZipProto.ZipSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchZipMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ZIP_INFO = 0;
  private static final int METHODID_GET_ZIP_ALL = 1;
  private static final int METHODID_GET_ZIP_SHOW_YES = 2;
  private static final int METHODID_GET_ZIP_SHOW_NO = 3;
  private static final int METHODID_GET_ZIP_BY_AGENT = 4;
  private static final int METHODID_GET_ZIP_BY_ESTATE = 5;
  private static final int METHODID_SAVE_ZIP = 6;
  private static final int METHODID_UPDATE_ZIP = 7;
  private static final int METHODID_DELETE_ZIP = 8;
  private static final int METHODID_SEARCH_ZIP = 9;

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
        case METHODID_GET_ZIP_INFO:
          serviceImpl.getZipInfo((java.zippb.ZipProto.ZipIdRequest) request,
              (io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipIdResponse>) responseObserver);
          break;
        case METHODID_GET_ZIP_ALL:
          serviceImpl.getZipAll((java.zippb.ZipProto.ZipAllRequest) request,
              (io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipAllResponse>) responseObserver);
          break;
        case METHODID_GET_ZIP_SHOW_YES:
          serviceImpl.getZipShowYes((java.zippb.ZipProto.ZipShowYesRequest) request,
              (io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipShowYesResponse>) responseObserver);
          break;
        case METHODID_GET_ZIP_SHOW_NO:
          serviceImpl.getZipShowNo((java.zippb.ZipProto.ZipShowNoRequest) request,
              (io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipShowNoResponse>) responseObserver);
          break;
        case METHODID_GET_ZIP_BY_AGENT:
          serviceImpl.getZipByAgent((java.zippb.ZipProto.ZipAgentIdRequest) request,
              (io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipAgentIdResponse>) responseObserver);
          break;
        case METHODID_GET_ZIP_BY_ESTATE:
          serviceImpl.getZipByEstate((java.zippb.ZipProto.ZipEsateIdRequest) request,
              (io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipEstateIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_ZIP:
          serviceImpl.saveZip((java.zippb.ZipProto.ZipInsertRequest) request,
              (io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipInsertResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ZIP:
          serviceImpl.updateZip((java.zippb.ZipProto.ZipUpdateRequest) request,
              (io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE_ZIP:
          serviceImpl.deleteZip((java.zippb.ZipProto.ZipDeleteRequest) request,
              (io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipDeleteResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ZIP:
          serviceImpl.searchZip((java.zippb.ZipProto.ZipSearchRequest) request,
              (io.grpc.stub.StreamObserver<java.zippb.ZipProto.ZipSearchResponse>) responseObserver);
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
          getGetZipInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.zippb.ZipProto.ZipIdRequest,
              java.zippb.ZipProto.ZipIdResponse>(
                service, METHODID_GET_ZIP_INFO)))
        .addMethod(
          getGetZipAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.zippb.ZipProto.ZipAllRequest,
              java.zippb.ZipProto.ZipAllResponse>(
                service, METHODID_GET_ZIP_ALL)))
        .addMethod(
          getGetZipShowYesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.zippb.ZipProto.ZipShowYesRequest,
              java.zippb.ZipProto.ZipShowYesResponse>(
                service, METHODID_GET_ZIP_SHOW_YES)))
        .addMethod(
          getGetZipShowNoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.zippb.ZipProto.ZipShowNoRequest,
              java.zippb.ZipProto.ZipShowNoResponse>(
                service, METHODID_GET_ZIP_SHOW_NO)))
        .addMethod(
          getGetZipByAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.zippb.ZipProto.ZipAgentIdRequest,
              java.zippb.ZipProto.ZipAgentIdResponse>(
                service, METHODID_GET_ZIP_BY_AGENT)))
        .addMethod(
          getGetZipByEstateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.zippb.ZipProto.ZipEsateIdRequest,
              java.zippb.ZipProto.ZipEstateIdResponse>(
                service, METHODID_GET_ZIP_BY_ESTATE)))
        .addMethod(
          getSaveZipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.zippb.ZipProto.ZipInsertRequest,
              java.zippb.ZipProto.ZipInsertResponse>(
                service, METHODID_SAVE_ZIP)))
        .addMethod(
          getUpdateZipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.zippb.ZipProto.ZipUpdateRequest,
              java.zippb.ZipProto.ZipUpdateResponse>(
                service, METHODID_UPDATE_ZIP)))
        .addMethod(
          getDeleteZipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.zippb.ZipProto.ZipDeleteRequest,
              java.zippb.ZipProto.ZipDeleteResponse>(
                service, METHODID_DELETE_ZIP)))
        .addMethod(
          getSearchZipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              java.zippb.ZipProto.ZipSearchRequest,
              java.zippb.ZipProto.ZipSearchResponse>(
                service, METHODID_SEARCH_ZIP)))
        .build();
  }

  private static abstract class ZipProtoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ZipProtoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return java.zippb.ZipProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ZipProtoService");
    }
  }

  private static final class ZipProtoServiceFileDescriptorSupplier
      extends ZipProtoServiceBaseDescriptorSupplier {
    ZipProtoServiceFileDescriptorSupplier() {}
  }

  private static final class ZipProtoServiceMethodDescriptorSupplier
      extends ZipProtoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ZipProtoServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ZipProtoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ZipProtoServiceFileDescriptorSupplier())
              .addMethod(getGetZipInfoMethod())
              .addMethod(getGetZipAllMethod())
              .addMethod(getGetZipShowYesMethod())
              .addMethod(getGetZipShowNoMethod())
              .addMethod(getGetZipByAgentMethod())
              .addMethod(getGetZipByEstateMethod())
              .addMethod(getSaveZipMethod())
              .addMethod(getUpdateZipMethod())
              .addMethod(getDeleteZipMethod())
              .addMethod(getSearchZipMethod())
              .build();
        }
      }
    }
    return result;
  }
}
