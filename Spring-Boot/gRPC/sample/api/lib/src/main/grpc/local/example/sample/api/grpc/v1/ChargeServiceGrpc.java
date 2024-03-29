package local.example.sample.api.grpc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.1)",
    comments = "Source: PaymentGatewayService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ChargeServiceGrpc {

  private ChargeServiceGrpc() {}

  public static final String SERVICE_NAME = "local.example.sample.api.grpc.v1.ChargeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.CreateChargeReq,
      local.example.sample.api.grpc.v1.CreateChargeReq.Response> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = local.example.sample.api.grpc.v1.CreateChargeReq.class,
      responseType = local.example.sample.api.grpc.v1.CreateChargeReq.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.CreateChargeReq,
      local.example.sample.api.grpc.v1.CreateChargeReq.Response> getCreateMethod() {
    io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.CreateChargeReq, local.example.sample.api.grpc.v1.CreateChargeReq.Response> getCreateMethod;
    if ((getCreateMethod = ChargeServiceGrpc.getCreateMethod) == null) {
      synchronized (ChargeServiceGrpc.class) {
        if ((getCreateMethod = ChargeServiceGrpc.getCreateMethod) == null) {
          ChargeServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<local.example.sample.api.grpc.v1.CreateChargeReq, local.example.sample.api.grpc.v1.CreateChargeReq.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.CreateChargeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.CreateChargeReq.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ChargeServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.ChargeId,
      local.example.sample.api.grpc.v1.ChargeId.Response> getRetrieveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Retrieve",
      requestType = local.example.sample.api.grpc.v1.ChargeId.class,
      responseType = local.example.sample.api.grpc.v1.ChargeId.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.ChargeId,
      local.example.sample.api.grpc.v1.ChargeId.Response> getRetrieveMethod() {
    io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.ChargeId, local.example.sample.api.grpc.v1.ChargeId.Response> getRetrieveMethod;
    if ((getRetrieveMethod = ChargeServiceGrpc.getRetrieveMethod) == null) {
      synchronized (ChargeServiceGrpc.class) {
        if ((getRetrieveMethod = ChargeServiceGrpc.getRetrieveMethod) == null) {
          ChargeServiceGrpc.getRetrieveMethod = getRetrieveMethod =
              io.grpc.MethodDescriptor.<local.example.sample.api.grpc.v1.ChargeId, local.example.sample.api.grpc.v1.ChargeId.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Retrieve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.ChargeId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.ChargeId.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ChargeServiceMethodDescriptorSupplier("Retrieve"))
              .build();
        }
      }
    }
    return getRetrieveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.UpdateChargeReq,
      local.example.sample.api.grpc.v1.UpdateChargeReq.Response> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = local.example.sample.api.grpc.v1.UpdateChargeReq.class,
      responseType = local.example.sample.api.grpc.v1.UpdateChargeReq.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.UpdateChargeReq,
      local.example.sample.api.grpc.v1.UpdateChargeReq.Response> getUpdateMethod() {
    io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.UpdateChargeReq, local.example.sample.api.grpc.v1.UpdateChargeReq.Response> getUpdateMethod;
    if ((getUpdateMethod = ChargeServiceGrpc.getUpdateMethod) == null) {
      synchronized (ChargeServiceGrpc.class) {
        if ((getUpdateMethod = ChargeServiceGrpc.getUpdateMethod) == null) {
          ChargeServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<local.example.sample.api.grpc.v1.UpdateChargeReq, local.example.sample.api.grpc.v1.UpdateChargeReq.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.UpdateChargeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.UpdateChargeReq.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ChargeServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.CaptureChargeReq,
      local.example.sample.api.grpc.v1.CaptureChargeReq.Response> getCaptureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Capture",
      requestType = local.example.sample.api.grpc.v1.CaptureChargeReq.class,
      responseType = local.example.sample.api.grpc.v1.CaptureChargeReq.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.CaptureChargeReq,
      local.example.sample.api.grpc.v1.CaptureChargeReq.Response> getCaptureMethod() {
    io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.CaptureChargeReq, local.example.sample.api.grpc.v1.CaptureChargeReq.Response> getCaptureMethod;
    if ((getCaptureMethod = ChargeServiceGrpc.getCaptureMethod) == null) {
      synchronized (ChargeServiceGrpc.class) {
        if ((getCaptureMethod = ChargeServiceGrpc.getCaptureMethod) == null) {
          ChargeServiceGrpc.getCaptureMethod = getCaptureMethod =
              io.grpc.MethodDescriptor.<local.example.sample.api.grpc.v1.CaptureChargeReq, local.example.sample.api.grpc.v1.CaptureChargeReq.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Capture"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.CaptureChargeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.CaptureChargeReq.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ChargeServiceMethodDescriptorSupplier("Capture"))
              .build();
        }
      }
    }
    return getCaptureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.CustomerId,
      local.example.sample.api.grpc.v1.CustomerId.Response> getRetrieveAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveAll",
      requestType = local.example.sample.api.grpc.v1.CustomerId.class,
      responseType = local.example.sample.api.grpc.v1.CustomerId.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.CustomerId,
      local.example.sample.api.grpc.v1.CustomerId.Response> getRetrieveAllMethod() {
    io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.CustomerId, local.example.sample.api.grpc.v1.CustomerId.Response> getRetrieveAllMethod;
    if ((getRetrieveAllMethod = ChargeServiceGrpc.getRetrieveAllMethod) == null) {
      synchronized (ChargeServiceGrpc.class) {
        if ((getRetrieveAllMethod = ChargeServiceGrpc.getRetrieveAllMethod) == null) {
          ChargeServiceGrpc.getRetrieveAllMethod = getRetrieveAllMethod =
              io.grpc.MethodDescriptor.<local.example.sample.api.grpc.v1.CustomerId, local.example.sample.api.grpc.v1.CustomerId.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.CustomerId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.CustomerId.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ChargeServiceMethodDescriptorSupplier("RetrieveAll"))
              .build();
        }
      }
    }
    return getRetrieveAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChargeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChargeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChargeServiceStub>() {
        @java.lang.Override
        public ChargeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChargeServiceStub(channel, callOptions);
        }
      };
    return ChargeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChargeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChargeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChargeServiceBlockingStub>() {
        @java.lang.Override
        public ChargeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChargeServiceBlockingStub(channel, callOptions);
        }
      };
    return ChargeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChargeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChargeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChargeServiceFutureStub>() {
        @java.lang.Override
        public ChargeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChargeServiceFutureStub(channel, callOptions);
        }
      };
    return ChargeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ChargeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(local.example.sample.api.grpc.v1.CreateChargeReq request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.CreateChargeReq.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void retrieve(local.example.sample.api.grpc.v1.ChargeId request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.ChargeId.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveMethod(), responseObserver);
    }

    /**
     */
    public void update(local.example.sample.api.grpc.v1.UpdateChargeReq request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.UpdateChargeReq.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void capture(local.example.sample.api.grpc.v1.CaptureChargeReq request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.CaptureChargeReq.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCaptureMethod(), responseObserver);
    }

    /**
     */
    public void retrieveAll(local.example.sample.api.grpc.v1.CustomerId request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.CustomerId.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                local.example.sample.api.grpc.v1.CreateChargeReq,
                local.example.sample.api.grpc.v1.CreateChargeReq.Response>(
                  this, METHODID_CREATE)))
          .addMethod(
            getRetrieveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                local.example.sample.api.grpc.v1.ChargeId,
                local.example.sample.api.grpc.v1.ChargeId.Response>(
                  this, METHODID_RETRIEVE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                local.example.sample.api.grpc.v1.UpdateChargeReq,
                local.example.sample.api.grpc.v1.UpdateChargeReq.Response>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getCaptureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                local.example.sample.api.grpc.v1.CaptureChargeReq,
                local.example.sample.api.grpc.v1.CaptureChargeReq.Response>(
                  this, METHODID_CAPTURE)))
          .addMethod(
            getRetrieveAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                local.example.sample.api.grpc.v1.CustomerId,
                local.example.sample.api.grpc.v1.CustomerId.Response>(
                  this, METHODID_RETRIEVE_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class ChargeServiceStub extends io.grpc.stub.AbstractAsyncStub<ChargeServiceStub> {
    private ChargeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChargeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChargeServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(local.example.sample.api.grpc.v1.CreateChargeReq request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.CreateChargeReq.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieve(local.example.sample.api.grpc.v1.ChargeId request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.ChargeId.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(local.example.sample.api.grpc.v1.UpdateChargeReq request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.UpdateChargeReq.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void capture(local.example.sample.api.grpc.v1.CaptureChargeReq request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.CaptureChargeReq.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCaptureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieveAll(local.example.sample.api.grpc.v1.CustomerId request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.CustomerId.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChargeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ChargeServiceBlockingStub> {
    private ChargeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChargeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChargeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public local.example.sample.api.grpc.v1.CreateChargeReq.Response create(local.example.sample.api.grpc.v1.CreateChargeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public local.example.sample.api.grpc.v1.ChargeId.Response retrieve(local.example.sample.api.grpc.v1.ChargeId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveMethod(), getCallOptions(), request);
    }

    /**
     */
    public local.example.sample.api.grpc.v1.UpdateChargeReq.Response update(local.example.sample.api.grpc.v1.UpdateChargeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public local.example.sample.api.grpc.v1.CaptureChargeReq.Response capture(local.example.sample.api.grpc.v1.CaptureChargeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCaptureMethod(), getCallOptions(), request);
    }

    /**
     */
    public local.example.sample.api.grpc.v1.CustomerId.Response retrieveAll(local.example.sample.api.grpc.v1.CustomerId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChargeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ChargeServiceFutureStub> {
    private ChargeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChargeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChargeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<local.example.sample.api.grpc.v1.CreateChargeReq.Response> create(
        local.example.sample.api.grpc.v1.CreateChargeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<local.example.sample.api.grpc.v1.ChargeId.Response> retrieve(
        local.example.sample.api.grpc.v1.ChargeId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<local.example.sample.api.grpc.v1.UpdateChargeReq.Response> update(
        local.example.sample.api.grpc.v1.UpdateChargeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<local.example.sample.api.grpc.v1.CaptureChargeReq.Response> capture(
        local.example.sample.api.grpc.v1.CaptureChargeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCaptureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<local.example.sample.api.grpc.v1.CustomerId.Response> retrieveAll(
        local.example.sample.api.grpc.v1.CustomerId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_RETRIEVE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_CAPTURE = 3;
  private static final int METHODID_RETRIEVE_ALL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChargeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChargeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((local.example.sample.api.grpc.v1.CreateChargeReq) request,
              (io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.CreateChargeReq.Response>) responseObserver);
          break;
        case METHODID_RETRIEVE:
          serviceImpl.retrieve((local.example.sample.api.grpc.v1.ChargeId) request,
              (io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.ChargeId.Response>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((local.example.sample.api.grpc.v1.UpdateChargeReq) request,
              (io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.UpdateChargeReq.Response>) responseObserver);
          break;
        case METHODID_CAPTURE:
          serviceImpl.capture((local.example.sample.api.grpc.v1.CaptureChargeReq) request,
              (io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.CaptureChargeReq.Response>) responseObserver);
          break;
        case METHODID_RETRIEVE_ALL:
          serviceImpl.retrieveAll((local.example.sample.api.grpc.v1.CustomerId) request,
              (io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.CustomerId.Response>) responseObserver);
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

  private static abstract class ChargeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChargeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return local.example.sample.api.grpc.v1.PaymentGatewayService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChargeService");
    }
  }

  private static final class ChargeServiceFileDescriptorSupplier
      extends ChargeServiceBaseDescriptorSupplier {
    ChargeServiceFileDescriptorSupplier() {}
  }

  private static final class ChargeServiceMethodDescriptorSupplier
      extends ChargeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChargeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChargeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChargeServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getRetrieveMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getCaptureMethod())
              .addMethod(getRetrieveAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
