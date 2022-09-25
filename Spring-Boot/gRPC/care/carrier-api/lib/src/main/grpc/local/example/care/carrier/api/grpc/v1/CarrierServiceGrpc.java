package local.example.care.carrier.api.grpc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.1)",
    comments = "Source: carrier.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CarrierServiceGrpc {

  private CarrierServiceGrpc() {}

  public static final String SERVICE_NAME = "local.example.care.carrier.api.v1.CarrierService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<local.example.care.carrier.api.grpc.v1.Carrier,
      local.example.care.carrier.api.grpc.v1.CarrierCreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = local.example.care.carrier.api.grpc.v1.Carrier.class,
      responseType = local.example.care.carrier.api.grpc.v1.CarrierCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<local.example.care.carrier.api.grpc.v1.Carrier,
      local.example.care.carrier.api.grpc.v1.CarrierCreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<local.example.care.carrier.api.grpc.v1.Carrier, local.example.care.carrier.api.grpc.v1.CarrierCreateResponse> getCreateMethod;
    if ((getCreateMethod = CarrierServiceGrpc.getCreateMethod) == null) {
      synchronized (CarrierServiceGrpc.class) {
        if ((getCreateMethod = CarrierServiceGrpc.getCreateMethod) == null) {
          CarrierServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<local.example.care.carrier.api.grpc.v1.Carrier, local.example.care.carrier.api.grpc.v1.CarrierCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.care.carrier.api.grpc.v1.Carrier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  local.example.care.carrier.api.grpc.v1.CarrierCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CarrierServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarrierServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarrierServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarrierServiceStub>() {
        @java.lang.Override
        public CarrierServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarrierServiceStub(channel, callOptions);
        }
      };
    return CarrierServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarrierServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarrierServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarrierServiceBlockingStub>() {
        @java.lang.Override
        public CarrierServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarrierServiceBlockingStub(channel, callOptions);
        }
      };
    return CarrierServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarrierServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarrierServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarrierServiceFutureStub>() {
        @java.lang.Override
        public CarrierServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarrierServiceFutureStub(channel, callOptions);
        }
      };
    return CarrierServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CarrierServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(local.example.care.carrier.api.grpc.v1.Carrier request,
        io.grpc.stub.StreamObserver<local.example.care.carrier.api.grpc.v1.CarrierCreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                local.example.care.carrier.api.grpc.v1.Carrier,
                local.example.care.carrier.api.grpc.v1.CarrierCreateResponse>(
                  this, METHODID_CREATE)))
          .build();
    }
  }

  /**
   */
  public static final class CarrierServiceStub extends io.grpc.stub.AbstractAsyncStub<CarrierServiceStub> {
    private CarrierServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarrierServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarrierServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(local.example.care.carrier.api.grpc.v1.Carrier request,
        io.grpc.stub.StreamObserver<local.example.care.carrier.api.grpc.v1.CarrierCreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CarrierServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CarrierServiceBlockingStub> {
    private CarrierServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarrierServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarrierServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public local.example.care.carrier.api.grpc.v1.CarrierCreateResponse create(local.example.care.carrier.api.grpc.v1.Carrier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CarrierServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CarrierServiceFutureStub> {
    private CarrierServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarrierServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarrierServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<local.example.care.carrier.api.grpc.v1.CarrierCreateResponse> create(
        local.example.care.carrier.api.grpc.v1.Carrier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CarrierServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CarrierServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((local.example.care.carrier.api.grpc.v1.Carrier) request,
              (io.grpc.stub.StreamObserver<local.example.care.carrier.api.grpc.v1.CarrierCreateResponse>) responseObserver);
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

  private static abstract class CarrierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarrierServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return local.example.care.carrier.api.grpc.v1.CarrierOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarrierService");
    }
  }

  private static final class CarrierServiceFileDescriptorSupplier
      extends CarrierServiceBaseDescriptorSupplier {
    CarrierServiceFileDescriptorSupplier() {}
  }

  private static final class CarrierServiceMethodDescriptorSupplier
      extends CarrierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarrierServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CarrierServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarrierServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
