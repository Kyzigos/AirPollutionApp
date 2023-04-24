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
    comments = "Source: allerts.proto")
public final class PersonalizedAlertsServiceGrpc {

  private PersonalizedAlertsServiceGrpc() {}

  public static final String SERVICE_NAME = "smartproto.PersonalizedAlertsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.smartproto.AlertCreationRequest,
      com.grpc.proto.smartproto.AlertCreationResponse> getCreateAlertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAlert",
      requestType = com.grpc.proto.smartproto.AlertCreationRequest.class,
      responseType = com.grpc.proto.smartproto.AlertCreationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.smartproto.AlertCreationRequest,
      com.grpc.proto.smartproto.AlertCreationResponse> getCreateAlertMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.smartproto.AlertCreationRequest, com.grpc.proto.smartproto.AlertCreationResponse> getCreateAlertMethod;
    if ((getCreateAlertMethod = PersonalizedAlertsServiceGrpc.getCreateAlertMethod) == null) {
      synchronized (PersonalizedAlertsServiceGrpc.class) {
        if ((getCreateAlertMethod = PersonalizedAlertsServiceGrpc.getCreateAlertMethod) == null) {
          PersonalizedAlertsServiceGrpc.getCreateAlertMethod = getCreateAlertMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.smartproto.AlertCreationRequest, com.grpc.proto.smartproto.AlertCreationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartproto.PersonalizedAlertsService", "CreateAlert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.AlertCreationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.AlertCreationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonalizedAlertsServiceMethodDescriptorSupplier("CreateAlert"))
                  .build();
          }
        }
     }
     return getCreateAlertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.smartproto.ListAlertsRequest,
      com.grpc.proto.smartproto.ListAlertsResponse> getListAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAlerts",
      requestType = com.grpc.proto.smartproto.ListAlertsRequest.class,
      responseType = com.grpc.proto.smartproto.ListAlertsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.smartproto.ListAlertsRequest,
      com.grpc.proto.smartproto.ListAlertsResponse> getListAlertsMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.smartproto.ListAlertsRequest, com.grpc.proto.smartproto.ListAlertsResponse> getListAlertsMethod;
    if ((getListAlertsMethod = PersonalizedAlertsServiceGrpc.getListAlertsMethod) == null) {
      synchronized (PersonalizedAlertsServiceGrpc.class) {
        if ((getListAlertsMethod = PersonalizedAlertsServiceGrpc.getListAlertsMethod) == null) {
          PersonalizedAlertsServiceGrpc.getListAlertsMethod = getListAlertsMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.smartproto.ListAlertsRequest, com.grpc.proto.smartproto.ListAlertsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartproto.PersonalizedAlertsService", "ListAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.ListAlertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.ListAlertsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonalizedAlertsServiceMethodDescriptorSupplier("ListAlerts"))
                  .build();
          }
        }
     }
     return getListAlertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.smartproto.AlertDeletionRequest,
      com.grpc.proto.smartproto.AlertDeletionResponse> getDeleteAlertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAlert",
      requestType = com.grpc.proto.smartproto.AlertDeletionRequest.class,
      responseType = com.grpc.proto.smartproto.AlertDeletionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.smartproto.AlertDeletionRequest,
      com.grpc.proto.smartproto.AlertDeletionResponse> getDeleteAlertMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.smartproto.AlertDeletionRequest, com.grpc.proto.smartproto.AlertDeletionResponse> getDeleteAlertMethod;
    if ((getDeleteAlertMethod = PersonalizedAlertsServiceGrpc.getDeleteAlertMethod) == null) {
      synchronized (PersonalizedAlertsServiceGrpc.class) {
        if ((getDeleteAlertMethod = PersonalizedAlertsServiceGrpc.getDeleteAlertMethod) == null) {
          PersonalizedAlertsServiceGrpc.getDeleteAlertMethod = getDeleteAlertMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.smartproto.AlertDeletionRequest, com.grpc.proto.smartproto.AlertDeletionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartproto.PersonalizedAlertsService", "DeleteAlert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.AlertDeletionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.smartproto.AlertDeletionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonalizedAlertsServiceMethodDescriptorSupplier("DeleteAlert"))
                  .build();
          }
        }
     }
     return getDeleteAlertMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonalizedAlertsServiceStub newStub(io.grpc.Channel channel) {
    return new PersonalizedAlertsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonalizedAlertsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonalizedAlertsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonalizedAlertsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonalizedAlertsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PersonalizedAlertsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createAlert(com.grpc.proto.smartproto.AlertCreationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.AlertCreationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAlertMethod(), responseObserver);
    }

    /**
     */
    public void listAlerts(com.grpc.proto.smartproto.ListAlertsRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.ListAlertsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAlertsMethod(), responseObserver);
    }

    /**
     */
    public void deleteAlert(com.grpc.proto.smartproto.AlertDeletionRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.AlertDeletionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAlertMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAlertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.smartproto.AlertCreationRequest,
                com.grpc.proto.smartproto.AlertCreationResponse>(
                  this, METHODID_CREATE_ALERT)))
          .addMethod(
            getListAlertsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.smartproto.ListAlertsRequest,
                com.grpc.proto.smartproto.ListAlertsResponse>(
                  this, METHODID_LIST_ALERTS)))
          .addMethod(
            getDeleteAlertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.smartproto.AlertDeletionRequest,
                com.grpc.proto.smartproto.AlertDeletionResponse>(
                  this, METHODID_DELETE_ALERT)))
          .build();
    }
  }

  /**
   */
  public static final class PersonalizedAlertsServiceStub extends io.grpc.stub.AbstractStub<PersonalizedAlertsServiceStub> {
    private PersonalizedAlertsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonalizedAlertsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonalizedAlertsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonalizedAlertsServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAlert(com.grpc.proto.smartproto.AlertCreationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.AlertCreationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAlertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAlerts(com.grpc.proto.smartproto.ListAlertsRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.ListAlertsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAlertsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAlert(com.grpc.proto.smartproto.AlertDeletionRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.AlertDeletionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAlertMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonalizedAlertsServiceBlockingStub extends io.grpc.stub.AbstractStub<PersonalizedAlertsServiceBlockingStub> {
    private PersonalizedAlertsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonalizedAlertsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonalizedAlertsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonalizedAlertsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.proto.smartproto.AlertCreationResponse createAlert(com.grpc.proto.smartproto.AlertCreationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAlertMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.smartproto.ListAlertsResponse listAlerts(com.grpc.proto.smartproto.ListAlertsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAlertsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.smartproto.AlertDeletionResponse deleteAlert(com.grpc.proto.smartproto.AlertDeletionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAlertMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonalizedAlertsServiceFutureStub extends io.grpc.stub.AbstractStub<PersonalizedAlertsServiceFutureStub> {
    private PersonalizedAlertsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonalizedAlertsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonalizedAlertsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonalizedAlertsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.smartproto.AlertCreationResponse> createAlert(
        com.grpc.proto.smartproto.AlertCreationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAlertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.smartproto.ListAlertsResponse> listAlerts(
        com.grpc.proto.smartproto.ListAlertsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAlertsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.smartproto.AlertDeletionResponse> deleteAlert(
        com.grpc.proto.smartproto.AlertDeletionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAlertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ALERT = 0;
  private static final int METHODID_LIST_ALERTS = 1;
  private static final int METHODID_DELETE_ALERT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonalizedAlertsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonalizedAlertsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ALERT:
          serviceImpl.createAlert((com.grpc.proto.smartproto.AlertCreationRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.AlertCreationResponse>) responseObserver);
          break;
        case METHODID_LIST_ALERTS:
          serviceImpl.listAlerts((com.grpc.proto.smartproto.ListAlertsRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.ListAlertsResponse>) responseObserver);
          break;
        case METHODID_DELETE_ALERT:
          serviceImpl.deleteAlert((com.grpc.proto.smartproto.AlertDeletionRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.smartproto.AlertDeletionResponse>) responseObserver);
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

  private static abstract class PersonalizedAlertsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonalizedAlertsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.proto.smartproto.SmartAlertsProtoImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PersonalizedAlertsService");
    }
  }

  private static final class PersonalizedAlertsServiceFileDescriptorSupplier
      extends PersonalizedAlertsServiceBaseDescriptorSupplier {
    PersonalizedAlertsServiceFileDescriptorSupplier() {}
  }

  private static final class PersonalizedAlertsServiceMethodDescriptorSupplier
      extends PersonalizedAlertsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonalizedAlertsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PersonalizedAlertsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonalizedAlertsServiceFileDescriptorSupplier())
              .addMethod(getCreateAlertMethod())
              .addMethod(getListAlertsMethod())
              .addMethod(getDeleteAlertMethod())
              .build();
        }
      }
    }
    return result;
  }
}
