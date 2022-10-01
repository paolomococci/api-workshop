// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PaymentGatewayService.proto

package local.example.sample.api.grpc.v1;

public interface CreateChargeReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:local.example.sample.api.grpc.v1.CreateChargeReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 amount = 1;</code>
   * @return The amount.
   */
  int getAmount();

  /**
   * <code>string currency = 2;</code>
   * @return The currency.
   */
  java.lang.String getCurrency();
  /**
   * <code>string currency = 2;</code>
   * @return The bytes for currency.
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <code>string customerId = 3;</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <code>string customerId = 3;</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <code>string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string receiptEmail = 5;</code>
   * @return The receiptEmail.
   */
  java.lang.String getReceiptEmail();
  /**
   * <code>string receiptEmail = 5;</code>
   * @return The bytes for receiptEmail.
   */
  com.google.protobuf.ByteString
      getReceiptEmailBytes();

  /**
   * <code>string sourceId = 6;</code>
   * @return The sourceId.
   */
  java.lang.String getSourceId();
  /**
   * <code>string sourceId = 6;</code>
   * @return The bytes for sourceId.
   */
  com.google.protobuf.ByteString
      getSourceIdBytes();

  /**
   * <code>string statementDescriptor = 7;</code>
   * @return The statementDescriptor.
   */
  java.lang.String getStatementDescriptor();
  /**
   * <code>string statementDescriptor = 7;</code>
   * @return The bytes for statementDescriptor.
   */
  com.google.protobuf.ByteString
      getStatementDescriptorBytes();
}
