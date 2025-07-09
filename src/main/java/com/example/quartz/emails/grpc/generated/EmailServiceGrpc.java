package com.example.quartz.emails.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.3)",
    comments = "Source: email_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EmailServiceGrpc {

  private EmailServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.quartz.emails.grpc.generated.EmailService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.quartz.emails.grpc.generated.EmailRequest,
      com.example.quartz.emails.grpc.generated.JobResponse> getSendNowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendNow",
      requestType = com.example.quartz.emails.grpc.generated.EmailRequest.class,
      responseType = com.example.quartz.emails.grpc.generated.JobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.quartz.emails.grpc.generated.EmailRequest,
      com.example.quartz.emails.grpc.generated.JobResponse> getSendNowMethod() {
    io.grpc.MethodDescriptor<com.example.quartz.emails.grpc.generated.EmailRequest, com.example.quartz.emails.grpc.generated.JobResponse> getSendNowMethod;
    if ((getSendNowMethod = EmailServiceGrpc.getSendNowMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getSendNowMethod = EmailServiceGrpc.getSendNowMethod) == null) {
          EmailServiceGrpc.getSendNowMethod = getSendNowMethod =
              io.grpc.MethodDescriptor.<com.example.quartz.emails.grpc.generated.EmailRequest, com.example.quartz.emails.grpc.generated.JobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendNow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.quartz.emails.grpc.generated.EmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.quartz.emails.grpc.generated.JobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("SendNow"))
              .build();
        }
      }
    }
    return getSendNowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.quartz.emails.grpc.generated.EmailLaterRequest,
      com.example.quartz.emails.grpc.generated.JobResponse> getSendLaterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendLater",
      requestType = com.example.quartz.emails.grpc.generated.EmailLaterRequest.class,
      responseType = com.example.quartz.emails.grpc.generated.JobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.quartz.emails.grpc.generated.EmailLaterRequest,
      com.example.quartz.emails.grpc.generated.JobResponse> getSendLaterMethod() {
    io.grpc.MethodDescriptor<com.example.quartz.emails.grpc.generated.EmailLaterRequest, com.example.quartz.emails.grpc.generated.JobResponse> getSendLaterMethod;
    if ((getSendLaterMethod = EmailServiceGrpc.getSendLaterMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getSendLaterMethod = EmailServiceGrpc.getSendLaterMethod) == null) {
          EmailServiceGrpc.getSendLaterMethod = getSendLaterMethod =
              io.grpc.MethodDescriptor.<com.example.quartz.emails.grpc.generated.EmailLaterRequest, com.example.quartz.emails.grpc.generated.JobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendLater"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.quartz.emails.grpc.generated.EmailLaterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.quartz.emails.grpc.generated.JobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("SendLater"))
              .build();
        }
      }
    }
    return getSendLaterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmailServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmailServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmailServiceStub>() {
        @java.lang.Override
        public EmailServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmailServiceStub(channel, callOptions);
        }
      };
    return EmailServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmailServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmailServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmailServiceBlockingStub>() {
        @java.lang.Override
        public EmailServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmailServiceBlockingStub(channel, callOptions);
        }
      };
    return EmailServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmailServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmailServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmailServiceFutureStub>() {
        @java.lang.Override
        public EmailServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmailServiceFutureStub(channel, callOptions);
        }
      };
    return EmailServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EmailServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendNow(com.example.quartz.emails.grpc.generated.EmailRequest request,
        io.grpc.stub.StreamObserver<com.example.quartz.emails.grpc.generated.JobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendNowMethod(), responseObserver);
    }

    /**
     */
    public void sendLater(com.example.quartz.emails.grpc.generated.EmailLaterRequest request,
        io.grpc.stub.StreamObserver<com.example.quartz.emails.grpc.generated.JobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendLaterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendNowMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.quartz.emails.grpc.generated.EmailRequest,
                com.example.quartz.emails.grpc.generated.JobResponse>(
                  this, METHODID_SEND_NOW)))
          .addMethod(
            getSendLaterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.quartz.emails.grpc.generated.EmailLaterRequest,
                com.example.quartz.emails.grpc.generated.JobResponse>(
                  this, METHODID_SEND_LATER)))
          .build();
    }
  }

  /**
   */
  public static final class EmailServiceStub extends io.grpc.stub.AbstractAsyncStub<EmailServiceStub> {
    private EmailServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmailServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendNow(com.example.quartz.emails.grpc.generated.EmailRequest request,
        io.grpc.stub.StreamObserver<com.example.quartz.emails.grpc.generated.JobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendNowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendLater(com.example.quartz.emails.grpc.generated.EmailLaterRequest request,
        io.grpc.stub.StreamObserver<com.example.quartz.emails.grpc.generated.JobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendLaterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmailServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EmailServiceBlockingStub> {
    private EmailServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmailServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.quartz.emails.grpc.generated.JobResponse sendNow(com.example.quartz.emails.grpc.generated.EmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendNowMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.quartz.emails.grpc.generated.JobResponse sendLater(com.example.quartz.emails.grpc.generated.EmailLaterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendLaterMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmailServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EmailServiceFutureStub> {
    private EmailServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmailServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.quartz.emails.grpc.generated.JobResponse> sendNow(
        com.example.quartz.emails.grpc.generated.EmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendNowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.quartz.emails.grpc.generated.JobResponse> sendLater(
        com.example.quartz.emails.grpc.generated.EmailLaterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendLaterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_NOW = 0;
  private static final int METHODID_SEND_LATER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmailServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmailServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_NOW:
          serviceImpl.sendNow((com.example.quartz.emails.grpc.generated.EmailRequest) request,
              (io.grpc.stub.StreamObserver<com.example.quartz.emails.grpc.generated.JobResponse>) responseObserver);
          break;
        case METHODID_SEND_LATER:
          serviceImpl.sendLater((com.example.quartz.emails.grpc.generated.EmailLaterRequest) request,
              (io.grpc.stub.StreamObserver<com.example.quartz.emails.grpc.generated.JobResponse>) responseObserver);
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

  private static abstract class EmailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmailServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.quartz.emails.grpc.generated.EmailServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmailService");
    }
  }

  private static final class EmailServiceFileDescriptorSupplier
      extends EmailServiceBaseDescriptorSupplier {
    EmailServiceFileDescriptorSupplier() {}
  }

  private static final class EmailServiceMethodDescriptorSupplier
      extends EmailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmailServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmailServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmailServiceFileDescriptorSupplier())
              .addMethod(getSendNowMethod())
              .addMethod(getSendLaterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
