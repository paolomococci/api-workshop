package local.example.sample.api.grpc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.1)",
    comments = "Source: PaymentGatewayService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SourceServiceGrpc {

  private SourceServiceGrpc() {}

  public static final String SERVICE_NAME = "local.example.sample.api.grpc.v1.SourceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.CreateSourceReq,
      local.example.sample.api.grpc.v1.CreateSourceReq.Response> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = local.example.sample.api.grpc.v1.CreateSourceReq.class,
      responseType = local.example.sample.api.grpc.v1.CreateSourceReq.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.CreateSourceReq,
      local.example.sample.api.grpc.v1.CreateSourceReq.Response> getCreateMethod() {
    io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.CreateSourceReq, local.example.sample.api.grpc.v1.CreateSourceReq.Response> getCreateMethod;
    if ((getCreateMethod = SourceServiceGrpc.getCreateMethod) == null) {
      synchronized (SourceServiceGrpc.class) {
        if ((getCreateMethod = SourceServiceGrpc.getCreateMethod) == null) {
          SourceServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<local.example.sample.api.grpc.v1.CreateSourceReq, local.example.sample.api.grpc.v1.CreateSourceReq.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.CreateSourceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.CreateSourceReq.Response.getDefaultInstance()))
              .setSchemaDescriptor(new SourceServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.SourceId,
      local.example.sample.api.grpc.v1.SourceId.Response> getRetrieveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Retrieve",
      requestType = local.example.sample.api.grpc.v1.SourceId.class,
      responseType = local.example.sample.api.grpc.v1.SourceId.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.SourceId,
      local.example.sample.api.grpc.v1.SourceId.Response> getRetrieveMethod() {
    io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.SourceId, local.example.sample.api.grpc.v1.SourceId.Response> getRetrieveMethod;
    if ((getRetrieveMethod = SourceServiceGrpc.getRetrieveMethod) == null) {
      synchronized (SourceServiceGrpc.class) {
        if ((getRetrieveMethod = SourceServiceGrpc.getRetrieveMethod) == null) {
          SourceServiceGrpc.getRetrieveMethod = getRetrieveMethod =
              io.grpc.MethodDescriptor.<local.example.sample.api.grpc.v1.SourceId, local.example.sample.api.grpc.v1.SourceId.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Retrieve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.SourceId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.SourceId.Response.getDefaultInstance()))
              .setSchemaDescriptor(new SourceServiceMethodDescriptorSupplier("Retrieve"))
              .build();
        }
      }
    }
    return getRetrieveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.UpdateSourceReq,
      local.example.sample.api.grpc.v1.UpdateSourceReq.Response> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = local.example.sample.api.grpc.v1.UpdateSourceReq.class,
      responseType = local.example.sample.api.grpc.v1.UpdateSourceReq.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.UpdateSourceReq,
      local.example.sample.api.grpc.v1.UpdateSourceReq.Response> getUpdateMethod() {
    io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.UpdateSourceReq, local.example.sample.api.grpc.v1.UpdateSourceReq.Response> getUpdateMethod;
    if ((getUpdateMethod = SourceServiceGrpc.getUpdateMethod) == null) {
      synchronized (SourceServiceGrpc.class) {
        if ((getUpdateMethod = SourceServiceGrpc.getUpdateMethod) == null) {
          SourceServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<local.example.sample.api.grpc.v1.UpdateSourceReq, local.example.sample.api.grpc.v1.UpdateSourceReq.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.UpdateSourceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.UpdateSourceReq.Response.getDefaultInstance()))
              .setSchemaDescriptor(new SourceServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.AttachOrDetachReq,
      local.example.sample.api.grpc.v1.AttachOrDetachReq.Response> getAttachMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Attach",
      requestType = local.example.sample.api.grpc.v1.AttachOrDetachReq.class,
      responseType = local.example.sample.api.grpc.v1.AttachOrDetachReq.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.AttachOrDetachReq,
      local.example.sample.api.grpc.v1.AttachOrDetachReq.Response> getAttachMethod() {
    io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.AttachOrDetachReq, local.example.sample.api.grpc.v1.AttachOrDetachReq.Response> getAttachMethod;
    if ((getAttachMethod = SourceServiceGrpc.getAttachMethod) == null) {
      synchronized (SourceServiceGrpc.class) {
        if ((getAttachMethod = SourceServiceGrpc.getAttachMethod) == null) {
          SourceServiceGrpc.getAttachMethod = getAttachMethod =
              io.grpc.MethodDescriptor.<local.example.sample.api.grpc.v1.AttachOrDetachReq, local.example.sample.api.grpc.v1.AttachOrDetachReq.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Attach"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.AttachOrDetachReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.AttachOrDetachReq.Response.getDefaultInstance()))
              .setSchemaDescriptor(new SourceServiceMethodDescriptorSupplier("Attach"))
              .build();
        }
      }
    }
    return getAttachMethod;
  }

  private static volatile io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.AttachOrDetachReq,
      local.example.sample.api.grpc.v1.AttachOrDetachReq.Response> getDetachMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detach",
      requestType = local.example.sample.api.grpc.v1.AttachOrDetachReq.class,
      responseType = local.example.sample.api.grpc.v1.AttachOrDetachReq.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.AttachOrDetachReq,
      local.example.sample.api.grpc.v1.AttachOrDetachReq.Response> getDetachMethod() {
    io.grpc.MethodDescriptor<local.example.sample.api.grpc.v1.AttachOrDetachReq, local.example.sample.api.grpc.v1.AttachOrDetachReq.Response> getDetachMethod;
    if ((getDetachMethod = SourceServiceGrpc.getDetachMethod) == null) {
      synchronized (SourceServiceGrpc.class) {
        if ((getDetachMethod = SourceServiceGrpc.getDetachMethod) == null) {
          SourceServiceGrpc.getDetachMethod = getDetachMethod =
              io.grpc.MethodDescriptor.<local.example.sample.api.grpc.v1.AttachOrDetachReq, local.example.sample.api.grpc.v1.AttachOrDetachReq.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detach"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.AttachOrDetachReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.sample.api.grpc.v1.AttachOrDetachReq.Response.getDefaultInstance()))
              .setSchemaDescriptor(new SourceServiceMethodDescriptorSupplier("Detach"))
              .build();
        }
      }
    }
    return getDetachMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SourceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SourceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SourceServiceStub>() {
        @java.lang.Override
        public SourceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SourceServiceStub(channel, callOptions);
        }
      };
    return SourceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SourceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SourceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SourceServiceBlockingStub>() {
        @java.lang.Override
        public SourceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SourceServiceBlockingStub(channel, callOptions);
        }
      };
    return SourceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SourceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SourceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SourceServiceFutureStub>() {
        @java.lang.Override
        public SourceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SourceServiceFutureStub(channel, callOptions);
        }
      };
    return SourceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SourceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(local.example.sample.api.grpc.v1.CreateSourceReq request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.CreateSourceReq.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void retrieve(local.example.sample.api.grpc.v1.SourceId request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.SourceId.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveMethod(), responseObserver);
    }

    /**
     */
    public void update(local.example.sample.api.grpc.v1.UpdateSourceReq request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.UpdateSourceReq.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void attach(local.example.sample.api.grpc.v1.AttachOrDetachReq request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.AttachOrDetachReq.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAttachMethod(), responseObserver);
    }

    /**
     */
    public void detach(local.example.sample.api.grpc.v1.AttachOrDetachReq request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.AttachOrDetachReq.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetachMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                local.example.sample.api.grpc.v1.CreateSourceReq,
                local.example.sample.api.grpc.v1.CreateSourceReq.Response>(
                  this, METHODID_CREATE)))
          .addMethod(
            getRetrieveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                local.example.sample.api.grpc.v1.SourceId,
                local.example.sample.api.grpc.v1.SourceId.Response>(
                  this, METHODID_RETRIEVE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                local.example.sample.api.grpc.v1.UpdateSourceReq,
                local.example.sample.api.grpc.v1.UpdateSourceReq.Response>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getAttachMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                local.example.sample.api.grpc.v1.AttachOrDetachReq,
                local.example.sample.api.grpc.v1.AttachOrDetachReq.Response>(
                  this, METHODID_ATTACH)))
          .addMethod(
            getDetachMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                local.example.sample.api.grpc.v1.AttachOrDetachReq,
                local.example.sample.api.grpc.v1.AttachOrDetachReq.Response>(
                  this, METHODID_DETACH)))
          .build();
    }
  }

  /**
   */
  public static final class SourceServiceStub extends io.grpc.stub.AbstractAsyncStub<SourceServiceStub> {
    private SourceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SourceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SourceServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(local.example.sample.api.grpc.v1.CreateSourceReq request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.CreateSourceReq.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieve(local.example.sample.api.grpc.v1.SourceId request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.SourceId.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(local.example.sample.api.grpc.v1.UpdateSourceReq request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.UpdateSourceReq.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void attach(local.example.sample.api.grpc.v1.AttachOrDetachReq request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.AttachOrDetachReq.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAttachMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void detach(local.example.sample.api.grpc.v1.AttachOrDetachReq request,
        io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.AttachOrDetachReq.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetachMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SourceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SourceServiceBlockingStub> {
    private SourceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SourceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SourceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public local.example.sample.api.grpc.v1.CreateSourceReq.Response create(local.example.sample.api.grpc.v1.CreateSourceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public local.example.sample.api.grpc.v1.SourceId.Response retrieve(local.example.sample.api.grpc.v1.SourceId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveMethod(), getCallOptions(), request);
    }

    /**
     */
    public local.example.sample.api.grpc.v1.UpdateSourceReq.Response update(local.example.sample.api.grpc.v1.UpdateSourceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public local.example.sample.api.grpc.v1.AttachOrDetachReq.Response attach(local.example.sample.api.grpc.v1.AttachOrDetachReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAttachMethod(), getCallOptions(), request);
    }

    /**
     */
    public local.example.sample.api.grpc.v1.AttachOrDetachReq.Response detach(local.example.sample.api.grpc.v1.AttachOrDetachReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetachMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SourceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SourceServiceFutureStub> {
    private SourceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SourceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SourceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<local.example.sample.api.grpc.v1.CreateSourceReq.Response> create(
        local.example.sample.api.grpc.v1.CreateSourceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<local.example.sample.api.grpc.v1.SourceId.Response> retrieve(
        local.example.sample.api.grpc.v1.SourceId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<local.example.sample.api.grpc.v1.UpdateSourceReq.Response> update(
        local.example.sample.api.grpc.v1.UpdateSourceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<local.example.sample.api.grpc.v1.AttachOrDetachReq.Response> attach(
        local.example.sample.api.grpc.v1.AttachOrDetachReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAttachMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<local.example.sample.api.grpc.v1.AttachOrDetachReq.Response> detach(
        local.example.sample.api.grpc.v1.AttachOrDetachReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetachMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_RETRIEVE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_ATTACH = 3;
  private static final int METHODID_DETACH = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SourceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SourceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((local.example.sample.api.grpc.v1.CreateSourceReq) request,
              (io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.CreateSourceReq.Response>) responseObserver);
          break;
        case METHODID_RETRIEVE:
          serviceImpl.retrieve((local.example.sample.api.grpc.v1.SourceId) request,
              (io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.SourceId.Response>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((local.example.sample.api.grpc.v1.UpdateSourceReq) request,
              (io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.UpdateSourceReq.Response>) responseObserver);
          break;
        case METHODID_ATTACH:
          serviceImpl.attach((local.example.sample.api.grpc.v1.AttachOrDetachReq) request,
              (io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.AttachOrDetachReq.Response>) responseObserver);
          break;
        case METHODID_DETACH:
          serviceImpl.detach((local.example.sample.api.grpc.v1.AttachOrDetachReq) request,
              (io.grpc.stub.StreamObserver<local.example.sample.api.grpc.v1.AttachOrDetachReq.Response>) responseObserver);
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

  private static abstract class SourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SourceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return local.example.sample.api.grpc.v1.PaymentGatewayService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SourceService");
    }
  }

  private static final class SourceServiceFileDescriptorSupplier
      extends SourceServiceBaseDescriptorSupplier {
    SourceServiceFileDescriptorSupplier() {}
  }

  private static final class SourceServiceMethodDescriptorSupplier
      extends SourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SourceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SourceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SourceServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getRetrieveMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getAttachMethod())
              .addMethod(getDetachMethod())
              .build();
        }
      }
    }
    return result;
  }
}
