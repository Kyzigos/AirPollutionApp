package com.grpc.proto.smartproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: realtimedata.proto")
public final class AirQualityServiceGrpc {

  private AirQualityServiceGrpc() {}

  public static final String SERVICE_NAME = "smartproto.AirQualityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.smartproto.PMRequest,
      com.grpc.proto.smartproto.PMResponse> getGetPM25Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPM25",
      requestType = com.grpc.proto.smartproto.PMRequest.class,
      responseType = com.grpc.proto.smartproto.PMResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.smartproto.PMRequest,
      com.grpc.proto.smartproto.PMResponse> getGetPM25Method() {
    io.grpc.MethodDescriptor<com.grpc.proto.smartproto.PMRequest, com.grpc.proto.smartproto.PMResponse> getGetPM25Method;
    if ((getGetPM25Method = AirQualityServiceGrpc.getGetPM25Method) == null) {
      synchronized (AirQualityServiceGrpc.class) {
        if ((getGetPM25Method = AirQualityServiceGrpc.getGetPM25Method) == null) {
          AirQualityServiceGrpc.getGetPM25Method = getGetPM25Method = 
              io.grpc.MethodDescriptor.<com.grpc.proto.smartproto.PMRequest, com.grpc.proto.smartproto.PMResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartproto.AirQualityService", "getPM25"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.PMRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.PMResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityServiceMethodDescriptorSupplier("getPM25"))
                  .build();
          }
        }
     }
     return getGetPM25Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.smartproto.PMRequest,
      com.grpc.proto.smartproto.PMResponse> getGetPM10Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPM10",
      requestType = com.grpc.proto.smartproto.PMRequest.class,
      responseType = com.grpc.proto.smartproto.PMResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.smartproto.PMRequest,
      com.grpc.proto.smartproto.PMResponse> getGetPM10Method() {
    io.grpc.MethodDescriptor<com.grpc.proto.smartproto.PMRequest, com.grpc.proto.smartproto.PMResponse> getGetPM10Method;
    if ((getGetPM10Method = AirQualityServiceGrpc.getGetPM10Method) == null) {
      synchronized (AirQualityServiceGrpc.class) {
        if ((getGetPM10Method = AirQualityServiceGrpc.getGetPM10Method) == null) {
          AirQualityServiceGrpc.getGetPM10Method = getGetPM10Method = 
              io.grpc.MethodDescriptor.<com.grpc.proto.smartproto.PMRequest, com.grpc.proto.smartproto.PMResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartproto.AirQualityService", "getPM10"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.PMRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.PMResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityServiceMethodDescriptorSupplier("getPM10"))
                  .build();
          }
        }
     }
     return getGetPM10Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.smartproto.OzoneRequest,
      com.grpc.proto.smartproto.OzoneResponse> getGetOzoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOzone",
      requestType = com.grpc.proto.smartproto.OzoneRequest.class,
      responseType = com.grpc.proto.smartproto.OzoneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.smartproto.OzoneRequest,
      com.grpc.proto.smartproto.OzoneResponse> getGetOzoneMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.smartproto.OzoneRequest, com.grpc.proto.smartproto.OzoneResponse> getGetOzoneMethod;
    if ((getGetOzoneMethod = AirQualityServiceGrpc.getGetOzoneMethod) == null) {
      synchronized (AirQualityServiceGrpc.class) {
        if ((getGetOzoneMethod = AirQualityServiceGrpc.getGetOzoneMethod) == null) {
          AirQualityServiceGrpc.getGetOzoneMethod = getGetOzoneMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.smartproto.OzoneRequest, com.grpc.proto.smartproto.OzoneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartproto.AirQualityService", "getOzone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.OzoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.OzoneResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityServiceMethodDescriptorSupplier("getOzone"))
                  .build();
          }
        }
     }
     return getGetOzoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.smartproto.SummaryRequest,
      com.grpc.proto.smartproto.SummaryResponse> getGetAirQualitySummaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAirQualitySummary",
      requestType = com.grpc.proto.smartproto.SummaryRequest.class,
      responseType = com.grpc.proto.smartproto.SummaryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.smartproto.SummaryRequest,
      com.grpc.proto.smartproto.SummaryResponse> getGetAirQualitySummaryMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.smartproto.SummaryRequest, com.grpc.proto.smartproto.SummaryResponse> getGetAirQualitySummaryMethod;
    if ((getGetAirQualitySummaryMethod = AirQualityServiceGrpc.getGetAirQualitySummaryMethod) == null) {
      synchronized (AirQualityServiceGrpc.class) {
        if ((getGetAirQualitySummaryMethod = AirQualityServiceGrpc.getGetAirQualitySummaryMethod) == null) {
          AirQualityServiceGrpc.getGetAirQualitySummaryMethod = getGetAirQualitySummaryMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.smartproto.SummaryRequest, com.grpc.proto.smartproto.SummaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartproto.AirQualityService", "getAirQualitySummary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.SummaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.SummaryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityServiceMethodDescriptorSupplier("getAirQualitySummary"))
                  .build();
          }
        }
     }
     return getGetAirQualitySummaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.smartproto.LocationRequest,
      com.grpc.proto.smartproto.LocationResponse> getGetAirQualityByLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAirQualityByLocation",
      requestType = com.grpc.proto.smartproto.LocationRequest.class,
      responseType = com.grpc.proto.smartproto.LocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.smartproto.LocationRequest,
      com.grpc.proto.smartproto.LocationResponse> getGetAirQualityByLocationMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.smartproto.LocationRequest, com.grpc.proto.smartproto.LocationResponse> getGetAirQualityByLocationMethod;
    if ((getGetAirQualityByLocationMethod = AirQualityServiceGrpc.getGetAirQualityByLocationMethod) == null) {
      synchronized (AirQualityServiceGrpc.class) {
        if ((getGetAirQualityByLocationMethod = AirQualityServiceGrpc.getGetAirQualityByLocationMethod) == null) {
          AirQualityServiceGrpc.getGetAirQualityByLocationMethod = getGetAirQualityByLocationMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.smartproto.LocationRequest, com.grpc.proto.smartproto.LocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartproto.AirQualityService", "getAirQualityByLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.LocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.LocationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityServiceMethodDescriptorSupplier("getAirQualityByLocation"))
                  .build();
          }
        }
     }
     return getGetAirQualityByLocationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AirQualityServiceStub newStub(io.grpc.Channel channel) {
    return new AirQualityServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AirQualityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AirQualityServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AirQualityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AirQualityServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class AirQualityServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPM25(com.grpc.proto.smartproto.PMRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.PMResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPM25Method(), responseObserver);
    }

    /**
     */
    public void getPM10(com.grpc.proto.smartproto.PMRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.PMResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPM10Method(), responseObserver);
    }

    /**
     */
    public void getOzone(com.grpc.proto.smartproto.OzoneRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.OzoneResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOzoneMethod(), responseObserver);
    }

    /**
     */
    public void getAirQualitySummary(com.grpc.proto.smartproto.SummaryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.SummaryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAirQualitySummaryMethod(), responseObserver);
    }

    /**
     */
    public void getAirQualityByLocation(com.grpc.proto.smartproto.LocationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.LocationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAirQualityByLocationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPM25Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.smartproto.PMRequest,
                com.grpc.proto.smartproto.PMResponse>(
                  this, METHODID_GET_PM25)))
          .addMethod(
            getGetPM10Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.smartproto.PMRequest,
                com.grpc.proto.smartproto.PMResponse>(
                  this, METHODID_GET_PM10)))
          .addMethod(
            getGetOzoneMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.smartproto.OzoneRequest,
                com.grpc.proto.smartproto.OzoneResponse>(
                  this, METHODID_GET_OZONE)))
          .addMethod(
            getGetAirQualitySummaryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.smartproto.SummaryRequest,
                com.grpc.proto.smartproto.SummaryResponse>(
                  this, METHODID_GET_AIR_QUALITY_SUMMARY)))
          .addMethod(
            getGetAirQualityByLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.smartproto.LocationRequest,
                com.grpc.proto.smartproto.LocationResponse>(
                  this, METHODID_GET_AIR_QUALITY_BY_LOCATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AirQualityServiceStub extends io.grpc.stub.AbstractStub<AirQualityServiceStub> {
    private AirQualityServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualityServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualityServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPM25(com.grpc.proto.smartproto.PMRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.PMResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPM25Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPM10(com.grpc.proto.smartproto.PMRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.PMResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPM10Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOzone(com.grpc.proto.smartproto.OzoneRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.OzoneResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOzoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAirQualitySummary(com.grpc.proto.smartproto.SummaryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.SummaryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAirQualitySummaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAirQualityByLocation(com.grpc.proto.smartproto.LocationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.LocationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAirQualityByLocationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AirQualityServiceBlockingStub extends io.grpc.stub.AbstractStub<AirQualityServiceBlockingStub> {
    private AirQualityServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualityServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.proto.smartproto.PMResponse getPM25(com.grpc.proto.smartproto.PMRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPM25Method(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.smartproto.PMResponse getPM10(com.grpc.proto.smartproto.PMRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPM10Method(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.smartproto.OzoneResponse getOzone(com.grpc.proto.smartproto.OzoneRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOzoneMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.smartproto.SummaryResponse getAirQualitySummary(com.grpc.proto.smartproto.SummaryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAirQualitySummaryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.smartproto.LocationResponse getAirQualityByLocation(com.grpc.proto.smartproto.LocationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAirQualityByLocationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AirQualityServiceFutureStub extends io.grpc.stub.AbstractStub<AirQualityServiceFutureStub> {
    private AirQualityServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualityServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.smartproto.PMResponse> getPM25(
        com.grpc.proto.smartproto.PMRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPM25Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.smartproto.PMResponse> getPM10(
        com.grpc.proto.smartproto.PMRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPM10Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.smartproto.OzoneResponse> getOzone(
        com.grpc.proto.smartproto.OzoneRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOzoneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.smartproto.SummaryResponse> getAirQualitySummary(
        com.grpc.proto.smartproto.SummaryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAirQualitySummaryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.smartproto.LocationResponse> getAirQualityByLocation(
        com.grpc.proto.smartproto.LocationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAirQualityByLocationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PM25 = 0;
  private static final int METHODID_GET_PM10 = 1;
  private static final int METHODID_GET_OZONE = 2;
  private static final int METHODID_GET_AIR_QUALITY_SUMMARY = 3;
  private static final int METHODID_GET_AIR_QUALITY_BY_LOCATION = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AirQualityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AirQualityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PM25:
          serviceImpl.getPM25((com.grpc.proto.smartproto.PMRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.PMResponse>) responseObserver);
          break;
        case METHODID_GET_PM10:
          serviceImpl.getPM10((com.grpc.proto.smartproto.PMRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.PMResponse>) responseObserver);
          break;
        case METHODID_GET_OZONE:
          serviceImpl.getOzone((com.grpc.proto.smartproto.OzoneRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.OzoneResponse>) responseObserver);
          break;
        case METHODID_GET_AIR_QUALITY_SUMMARY:
          serviceImpl.getAirQualitySummary((com.grpc.proto.smartproto.SummaryRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.SummaryResponse>) responseObserver);
          break;
        case METHODID_GET_AIR_QUALITY_BY_LOCATION:
          serviceImpl.getAirQualityByLocation((com.grpc.proto.smartproto.LocationRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.LocationResponse>) responseObserver);
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

  private static abstract class AirQualityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AirQualityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.proto.smartproto.SmartProtoImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AirQualityService");
    }
  }

  private static final class AirQualityServiceFileDescriptorSupplier
      extends AirQualityServiceBaseDescriptorSupplier {
    AirQualityServiceFileDescriptorSupplier() {}
  }

  private static final class AirQualityServiceMethodDescriptorSupplier
      extends AirQualityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AirQualityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AirQualityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AirQualityServiceFileDescriptorSupplier())
              .addMethod(getGetPM25Method())
              .addMethod(getGetPM10Method())
              .addMethod(getGetOzoneMethod())
              .addMethod(getGetAirQualitySummaryMethod())
              .addMethod(getGetAirQualityByLocationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
