// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PaymentGatewayService.proto

package local.example.sample.api.grpc.v1;

public interface CreateSourceReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:local.example.sample.api.grpc.v1.CreateSourceReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string type = 1;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>uint32 amount = 2;</code>
   * @return The amount.
   */
  int getAmount();

  /**
   * <code>string currency = 3;</code>
   * @return The currency.
   */
  java.lang.String getCurrency();
  /**
   * <code>string currency = 3;</code>
   * @return The bytes for currency.
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <code>.local.example.sample.api.grpc.v1.Owner owner = 4;</code>
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   * <code>.local.example.sample.api.grpc.v1.Owner owner = 4;</code>
   * @return The owner.
   */
  local.example.sample.api.grpc.v1.Owner getOwner();
  /**
   * <code>.local.example.sample.api.grpc.v1.Owner owner = 4;</code>
   */
  local.example.sample.api.grpc.v1.OwnerOrBuilder getOwnerOrBuilder();

  /**
   * <code>string statementDescriptor = 5;</code>
   * @return The statementDescriptor.
   */
  java.lang.String getStatementDescriptor();
  /**
   * <code>string statementDescriptor = 5;</code>
   * @return The bytes for statementDescriptor.
   */
  com.google.protobuf.ByteString
      getStatementDescriptorBytes();

  /**
   * <code>.local.example.sample.api.grpc.v1.Flow flow = 6;</code>
   * @return The enum numeric value on the wire for flow.
   */
  int getFlowValue();
  /**
   * <code>.local.example.sample.api.grpc.v1.Flow flow = 6;</code>
   * @return The flow.
   */
  local.example.sample.api.grpc.v1.Flow getFlow();

  /**
   * <code>.local.example.sample.api.grpc.v1.Receiver receiver = 7;</code>
   * @return Whether the receiver field is set.
   */
  boolean hasReceiver();
  /**
   * <code>.local.example.sample.api.grpc.v1.Receiver receiver = 7;</code>
   * @return The receiver.
   */
  local.example.sample.api.grpc.v1.Receiver getReceiver();
  /**
   * <code>.local.example.sample.api.grpc.v1.Receiver receiver = 7;</code>
   */
  local.example.sample.api.grpc.v1.ReceiverOrBuilder getReceiverOrBuilder();

  /**
   * <code>.local.example.sample.api.grpc.v1.Usage usage = 8;</code>
   * @return The enum numeric value on the wire for usage.
   */
  int getUsageValue();
  /**
   * <code>.local.example.sample.api.grpc.v1.Usage usage = 8;</code>
   * @return The usage.
   */
  local.example.sample.api.grpc.v1.Usage getUsage();
}
