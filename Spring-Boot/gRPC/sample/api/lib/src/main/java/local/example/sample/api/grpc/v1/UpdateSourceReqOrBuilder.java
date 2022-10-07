// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PaymentGatewayService.proto

package local.example.sample.api.grpc.v1;

public interface UpdateSourceReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:local.example.sample.api.grpc.v1.UpdateSourceReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sourceId = 1;</code>
   * @return The sourceId.
   */
  java.lang.String getSourceId();
  /**
   * <code>string sourceId = 1;</code>
   * @return The bytes for sourceId.
   */
  com.google.protobuf.ByteString
      getSourceIdBytes();

  /**
   * <code>uint32 amount = 2;</code>
   * @return The amount.
   */
  int getAmount();

  /**
   * <code>.local.example.sample.api.grpc.v1.Owner owner = 3;</code>
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   * <code>.local.example.sample.api.grpc.v1.Owner owner = 3;</code>
   * @return The owner.
   */
  local.example.sample.api.grpc.v1.Owner getOwner();
  /**
   * <code>.local.example.sample.api.grpc.v1.Owner owner = 3;</code>
   */
  local.example.sample.api.grpc.v1.OwnerOrBuilder getOwnerOrBuilder();
}