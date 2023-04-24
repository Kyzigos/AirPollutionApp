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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: history.proto")
public final class AirQualityHistoryServiceGrpc {

  private AirQualityHistoryServiceGrpc() {}

  public static final String SERVICE_NAME = "smartproto.AirQualityHistoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.smartproto.HistoryRequest,
      com.grpc.proto.smartproto.PMHistoryResponse> getGetPM25HistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPM25History",
      requestType = com.grpc.proto.smartproto.HistoryRequest.class,
      responseType = com.grpc.proto.smartproto.PMHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.smartproto.HistoryRequest,
      com.grpc.proto.smartproto.PMHistoryResponse> getGetPM25HistoryMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.smartproto.HistoryRequest, com.grpc.proto.smartproto.PMHistoryResponse> getGetPM25HistoryMethod;
    if ((getGetPM25HistoryMethod = AirQualityHistoryServiceGrpc.getGetPM25HistoryMethod) == null) {
      synchronized (AirQualityHistoryServiceGrpc.class) {
        if ((getGetPM25HistoryMethod = AirQualityHistoryServiceGrpc.getGetPM25HistoryMethod) == null) {
          AirQualityHistoryServiceGrpc.getGetPM25HistoryMethod = getGetPM25HistoryMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.smartproto.HistoryRequest, com.grpc.proto.smartproto.PMHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartproto.AirQualityHistoryService", "GetPM25History"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.HistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.PMHistoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityHistoryServiceMethodDescriptorSupplier("GetPM25History"))
                  .build();
          }
        }
     }
     return getGetPM25HistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.smartproto.HistoryRequest,
      com.grpc.proto.smartproto.PMHistoryResponse> getGetPM10HistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPM10History",
      requestType = com.grpc.proto.smartproto.HistoryRequest.class,
      responseType = com.grpc.proto.smartproto.PMHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.smartproto.HistoryRequest,
      com.grpc.proto.smartproto.PMHistoryResponse> getGetPM10HistoryMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.smartproto.HistoryRequest, com.grpc.proto.smartproto.PMHistoryResponse> getGetPM10HistoryMethod;
    if ((getGetPM10HistoryMethod = AirQualityHistoryServiceGrpc.getGetPM10HistoryMethod) == null) {
      synchronized (AirQualityHistoryServiceGrpc.class) {
        if ((getGetPM10HistoryMethod = AirQualityHistoryServiceGrpc.getGetPM10HistoryMethod) == null) {
          AirQualityHistoryServiceGrpc.getGetPM10HistoryMethod = getGetPM10HistoryMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.smartproto.HistoryRequest, com.grpc.proto.smartproto.PMHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartproto.AirQualityHistoryService", "GetPM10History"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.HistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.PMHistoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityHistoryServiceMethodDescriptorSupplier("GetPM10History"))
                  .build();
          }
        }
     }
     return getGetPM10HistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.smartproto.HistoryRequest,
      com.grpc.proto.smartproto.OzoneHistoryResponse> getGetOzoneHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOzoneHistory",
      requestType = com.grpc.proto.smartproto.HistoryRequest.class,
      responseType = com.grpc.proto.smartproto.OzoneHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.smartproto.HistoryRequest,
      com.grpc.proto.smartproto.OzoneHistoryResponse> getGetOzoneHistoryMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.smartproto.HistoryRequest, com.grpc.proto.smartproto.OzoneHistoryResponse> getGetOzoneHistoryMethod;
    if ((getGetOzoneHistoryMethod = AirQualityHistoryServiceGrpc.getGetOzoneHistoryMethod) == null) {
      synchronized (AirQualityHistoryServiceGrpc.class) {
        if ((getGetOzoneHistoryMethod = AirQualityHistoryServiceGrpc.getGetOzoneHistoryMethod) == null) {
          AirQualityHistoryServiceGrpc.getGetOzoneHistoryMethod = getGetOzoneHistoryMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.smartproto.HistoryRequest, com.grpc.proto.smartproto.OzoneHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartproto.AirQualityHistoryService", "GetOzoneHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.HistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.OzoneHistoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityHistoryServiceMethodDescriptorSupplier("GetOzoneHistory"))
                  .build();
          }
        }
     }
     return getGetOzoneHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.smartproto.SummaryHistoryRequest,
      com.grpc.proto.smartproto.SummaryHistoryResponse> getGetAirQualitySummaryHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAirQualitySummaryHistory",
      requestType = com.grpc.proto.smartproto.SummaryHistoryRequest.class,
      responseType = com.grpc.proto.smartproto.SummaryHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.smartproto.SummaryHistoryRequest,
      com.grpc.proto.smartproto.SummaryHistoryResponse> getGetAirQualitySummaryHistoryMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.smartproto.SummaryHistoryRequest, com.grpc.proto.smartproto.SummaryHistoryResponse> getGetAirQualitySummaryHistoryMethod;
    if ((getGetAirQualitySummaryHistoryMethod = AirQualityHistoryServiceGrpc.getGetAirQualitySummaryHistoryMethod) == null) {
      synchronized (AirQualityHistoryServiceGrpc.class) {
        if ((getGetAirQualitySummaryHistoryMethod = AirQualityHistoryServiceGrpc.getGetAirQualitySummaryHistoryMethod) == null) {
          AirQualityHistoryServiceGrpc.getGetAirQualitySummaryHistoryMethod = getGetAirQualitySummaryHistoryMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.smartproto.SummaryHistoryRequest, com.grpc.proto.smartproto.SummaryHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartproto.AirQualityHistoryService", "GetAirQualitySummaryHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.SummaryHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.SummaryHistoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityHistoryServiceMethodDescriptorSupplier("GetAirQualitySummaryHistory"))
                  .build();
          }
        }
     }
     return getGetAirQualitySummaryHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.smartproto.LocationHistoryRequest,
      com.grpc.proto.smartproto.LocationHistoryResponse> getGetAirQualityByLocationHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAirQualityByLocationHistory",
      requestType = com.grpc.proto.smartproto.LocationHistoryRequest.class,
      responseType = com.grpc.proto.smartproto.LocationHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.smartproto.LocationHistoryRequest,
      com.grpc.proto.smartproto.LocationHistoryResponse> getGetAirQualityByLocationHistoryMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.smartproto.LocationHistoryRequest, com.grpc.proto.smartproto.LocationHistoryResponse> getGetAirQualityByLocationHistoryMethod;
    if ((getGetAirQualityByLocationHistoryMethod = AirQualityHistoryServiceGrpc.getGetAirQualityByLocationHistoryMethod) == null) {
      synchronized (AirQualityHistoryServiceGrpc.class) {
        if ((getGetAirQualityByLocationHistoryMethod = AirQualityHistoryServiceGrpc.getGetAirQualityByLocationHistoryMethod) == null) {
          AirQualityHistoryServiceGrpc.getGetAirQualityByLocationHistoryMethod = getGetAirQualityByLocationHistoryMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.smartproto.LocationHistoryRequest, com.grpc.proto.smartproto.LocationHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartproto.AirQualityHistoryService", "GetAirQualityByLocationHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.LocationHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.LocationHistoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityHistoryServiceMethodDescriptorSupplier("GetAirQualityByLocationHistory"))
                  .build();
          }
        }
     }
     return getGetAirQualityByLocationHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AirQualityHistoryServiceStub newStub(io.grpc.Channel channel) {
    return new AirQualityHistoryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AirQualityHistoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AirQualityHistoryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AirQualityHistoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AirQualityHistoryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AirQualityHistoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPM25History(com.grpc.proto.smartproto.HistoryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.PMHistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPM25HistoryMethod(), responseObserver);
    }

    /**
     */
    public void getPM10History(com.grpc.proto.smartproto.HistoryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.PMHistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPM10HistoryMethod(), responseObserver);
    }

    /**
     */
    public void getOzoneHistory(com.grpc.proto.smartproto.HistoryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.OzoneHistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOzoneHistoryMethod(), responseObserver);
    }

    /**
     */
    public void getAirQualitySummaryHistory(com.grpc.proto.smartproto.SummaryHistoryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.SummaryHistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAirQualitySummaryHistoryMethod(), responseObserver);
    }

    /**
     */
    public void getAirQualityByLocationHistory(com.grpc.proto.smartproto.LocationHistoryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.LocationHistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAirQualityByLocationHistoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPM25HistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.smartproto.HistoryRequest,
                com.grpc.proto.smartproto.PMHistoryResponse>(
                  this, METHODID_GET_PM25HISTORY)))
          .addMethod(
            getGetPM10HistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.smartproto.HistoryRequest,
                com.grpc.proto.smartproto.PMHistoryResponse>(
                  this, METHODID_GET_PM10HISTORY)))
          .addMethod(
            getGetOzoneHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.smartproto.HistoryRequest,
                com.grpc.proto.smartproto.OzoneHistoryResponse>(
                  this, METHODID_GET_OZONE_HISTORY)))
          .addMethod(
            getGetAirQualitySummaryHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.smartproto.SummaryHistoryRequest,
                com.grpc.proto.smartproto.SummaryHistoryResponse>(
                  this, METHODID_GET_AIR_QUALITY_SUMMARY_HISTORY)))
          .addMethod(
            getGetAirQualityByLocationHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.smartproto.LocationHistoryRequest,
                com.grpc.proto.smartproto.LocationHistoryResponse>(
                  this, METHODID_GET_AIR_QUALITY_BY_LOCATION_HISTORY)))
          .build();
    }
  }

  /**
   */
  public static final class AirQualityHistoryServiceStub extends io.grpc.stub.AbstractStub<AirQualityHistoryServiceStub> {
    private AirQualityHistoryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualityHistoryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityHistoryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualityHistoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPM25History(com.grpc.proto.smartproto.HistoryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.PMHistoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPM25HistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPM10History(com.grpc.proto.smartproto.HistoryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.PMHistoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPM10HistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOzoneHistory(com.grpc.proto.smartproto.HistoryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.OzoneHistoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOzoneHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAirQualitySummaryHistory(com.grpc.proto.smartproto.SummaryHistoryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.SummaryHistoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAirQualitySummaryHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAirQualityByLocationHistory(com.grpc.proto.smartproto.LocationHistoryRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.LocationHistoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAirQualityByLocationHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AirQualityHistoryServiceBlockingStub extends io.grpc.stub.AbstractStub<AirQualityHistoryServiceBlockingStub> {
    private AirQualityHistoryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualityHistoryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityHistoryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualityHistoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.proto.smartproto.PMHistoryResponse getPM25History(com.grpc.proto.smartproto.HistoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPM25HistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.smartproto.PMHistoryResponse getPM10History(com.grpc.proto.smartproto.HistoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPM10HistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.smartproto.OzoneHistoryResponse getOzoneHistory(com.grpc.proto.smartproto.HistoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOzoneHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.smartproto.SummaryHistoryResponse getAirQualitySummaryHistory(com.grpc.proto.smartproto.SummaryHistoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAirQualitySummaryHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.smartproto.LocationHistoryResponse getAirQualityByLocationHistory(com.grpc.proto.smartproto.LocationHistoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAirQualityByLocationHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AirQualityHistoryServiceFutureStub extends io.grpc.stub.AbstractStub<AirQualityHistoryServiceFutureStub> {
    private AirQualityHistoryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualityHistoryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityHistoryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualityHistoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.smartproto.PMHistoryResponse> getPM25History(
        com.grpc.proto.smartproto.HistoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPM25HistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.smartproto.PMHistoryResponse> getPM10History(
        com.grpc.proto.smartproto.HistoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPM10HistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.smartproto.OzoneHistoryResponse> getOzoneHistory(
        com.grpc.proto.smartproto.HistoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOzoneHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.smartproto.SummaryHistoryResponse> getAirQualitySummaryHistory(
        com.grpc.proto.smartproto.SummaryHistoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAirQualitySummaryHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.smartproto.LocationHistoryResponse> getAirQualityByLocationHistory(
        com.grpc.proto.smartproto.LocationHistoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAirQualityByLocationHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PM25HISTORY = 0;
  private static final int METHODID_GET_PM10HISTORY = 1;
  private static final int METHODID_GET_OZONE_HISTORY = 2;
  private static final int METHODID_GET_AIR_QUALITY_SUMMARY_HISTORY = 3;
  private static final int METHODID_GET_AIR_QUALITY_BY_LOCATION_HISTORY = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AirQualityHistoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AirQualityHistoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PM25HISTORY:
          serviceImpl.getPM25History((com.grpc.proto.smartproto.HistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.PMHistoryResponse>) responseObserver);
          break;
        case METHODID_GET_PM10HISTORY:
          serviceImpl.getPM10History((com.grpc.proto.smartproto.HistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.PMHistoryResponse>) responseObserver);
          break;
        case METHODID_GET_OZONE_HISTORY:
          serviceImpl.getOzoneHistory((com.grpc.proto.smartproto.HistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.OzoneHistoryResponse>) responseObserver);
          break;
        case METHODID_GET_AIR_QUALITY_SUMMARY_HISTORY:
          serviceImpl.getAirQualitySummaryHistory((com.grpc.proto.smartproto.SummaryHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.SummaryHistoryResponse>) responseObserver);
          break;
        case METHODID_GET_AIR_QUALITY_BY_LOCATION_HISTORY:
          serviceImpl.getAirQualityByLocationHistory((com.grpc.proto.smartproto.LocationHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.LocationHistoryResponse>) responseObserver);
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

  private static abstract class AirQualityHistoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AirQualityHistoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.proto.smartproto.HistoryDataProtoImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AirQualityHistoryService");
    }
  }

  private static final class AirQualityHistoryServiceFileDescriptorSupplier
      extends AirQualityHistoryServiceBaseDescriptorSupplier {
    AirQualityHistoryServiceFileDescriptorSupplier() {}
  }

  private static final class AirQualityHistoryServiceMethodDescriptorSupplier
      extends AirQualityHistoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AirQualityHistoryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AirQualityHistoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AirQualityHistoryServiceFileDescriptorSupplier())
              .addMethod(getGetPM25HistoryMethod())
              .addMethod(getGetPM10HistoryMethod())
              .addMethod(getGetOzoneHistoryMethod())
              .addMethod(getGetAirQualitySummaryHistoryMethod())
              .addMethod(getGetAirQualityByLocationHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
