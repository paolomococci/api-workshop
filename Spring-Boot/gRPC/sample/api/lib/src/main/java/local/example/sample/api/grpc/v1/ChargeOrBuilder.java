// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PaymentGatewayService.proto

package local.example.sample.api.grpc.v1;

public interface ChargeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:local.example.sample.api.grpc.v1.Charge)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>uint32 amount = 2;</code>
   * @return The amount.
   */
  int getAmount();

  /**
   * <code>uint32 amountCaptured = 3;</code>
   * @return The amountCaptured.
   */
  int getAmountCaptured();

  /**
   * <code>uint32 amountRefunded = 4;</code>
   * @return The amountRefunded.
   */
  int getAmountRefunded();

  /**
   * <code>string balanceTransactionId = 5;</code>
   * @return The balanceTransactionId.
   */
  java.lang.String getBalanceTransactionId();
  /**
   * <code>string balanceTransactionId = 5;</code>
   * @return The bytes for balanceTransactionId.
   */
  com.google.protobuf.ByteString
      getBalanceTransactionIdBytes();

  /**
   * <code>.local.example.sample.api.grpc.v1.BillingDetails billingDetails = 6;</code>
   * @return Whether the billingDetails field is set.
   */
  boolean hasBillingDetails();
  /**
   * <code>.local.example.sample.api.grpc.v1.BillingDetails billingDetails = 6;</code>
   * @return The billingDetails.
   */
  local.example.sample.api.grpc.v1.BillingDetails getBillingDetails();
  /**
   * <code>.local.example.sample.api.grpc.v1.BillingDetails billingDetails = 6;</code>
   */
  local.example.sample.api.grpc.v1.BillingDetailsOrBuilder getBillingDetailsOrBuilder();

  /**
   * <code>string calculatedStatementDescriptor = 7;</code>
   * @return The calculatedStatementDescriptor.
   */
  java.lang.String getCalculatedStatementDescriptor();
  /**
   * <code>string calculatedStatementDescriptor = 7;</code>
   * @return The bytes for calculatedStatementDescriptor.
   */
  com.google.protobuf.ByteString
      getCalculatedStatementDescriptorBytes();

  /**
   * <code>bool captured = 8;</code>
   * @return The captured.
   */
  boolean getCaptured();

  /**
   * <code>uint64 created = 9;</code>
   * @return The created.
   */
  long getCreated();

  /**
   * <code>string currency = 10;</code>
   * @return The currency.
   */
  java.lang.String getCurrency();
  /**
   * <code>string currency = 10;</code>
   * @return The bytes for currency.
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <code>string customerId = 11;</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <code>string customerId = 11;</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <code>string description = 12;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 12;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>bool disputed = 13;</code>
   * @return The disputed.
   */
  boolean getDisputed();

  /**
   * <code>uint32 failureCode = 14;</code>
   * @return The failureCode.
   */
  int getFailureCode();

  /**
   * <code>string failureMessage = 15;</code>
   * @return The failureMessage.
   */
  java.lang.String getFailureMessage();
  /**
   * <code>string failureMessage = 15;</code>
   * @return The bytes for failureMessage.
   */
  com.google.protobuf.ByteString
      getFailureMessageBytes();

  /**
   * <code>string invoiceId = 16;</code>
   * @return The invoiceId.
   */
  java.lang.String getInvoiceId();
  /**
   * <code>string invoiceId = 16;</code>
   * @return The bytes for invoiceId.
   */
  com.google.protobuf.ByteString
      getInvoiceIdBytes();

  /**
   * <code>string orderId = 17;</code>
   * @return The orderId.
   */
  java.lang.String getOrderId();
  /**
   * <code>string orderId = 17;</code>
   * @return The bytes for orderId.
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  /**
   * <code>bool paid = 18;</code>
   * @return The paid.
   */
  boolean getPaid();

  /**
   * <code>string paymentMethodId = 19;</code>
   * @return The paymentMethodId.
   */
  java.lang.String getPaymentMethodId();
  /**
   * <code>string paymentMethodId = 19;</code>
   * @return The bytes for paymentMethodId.
   */
  com.google.protobuf.ByteString
      getPaymentMethodIdBytes();

  /**
   * <code>.local.example.sample.api.grpc.v1.PaymentMethodDetails paymentMethodDetails = 20;</code>
   * @return Whether the paymentMethodDetails field is set.
   */
  boolean hasPaymentMethodDetails();
  /**
   * <code>.local.example.sample.api.grpc.v1.PaymentMethodDetails paymentMethodDetails = 20;</code>
   * @return The paymentMethodDetails.
   */
  local.example.sample.api.grpc.v1.PaymentMethodDetails getPaymentMethodDetails();
  /**
   * <code>.local.example.sample.api.grpc.v1.PaymentMethodDetails paymentMethodDetails = 20;</code>
   */
  local.example.sample.api.grpc.v1.PaymentMethodDetailsOrBuilder getPaymentMethodDetailsOrBuilder();

  /**
   * <code>string receiptEmail = 21;</code>
   * @return The receiptEmail.
   */
  java.lang.String getReceiptEmail();
  /**
   * <code>string receiptEmail = 21;</code>
   * @return The bytes for receiptEmail.
   */
  com.google.protobuf.ByteString
      getReceiptEmailBytes();

  /**
   * <code>string receiptNumber = 22;</code>
   * @return The receiptNumber.
   */
  java.lang.String getReceiptNumber();
  /**
   * <code>string receiptNumber = 22;</code>
   * @return The bytes for receiptNumber.
   */
  com.google.protobuf.ByteString
      getReceiptNumberBytes();

  /**
   * <code>bool refunded = 23;</code>
   * @return The refunded.
   */
  boolean getRefunded();

  /**
   * <code>repeated .local.example.sample.api.grpc.v1.Refund refunds = 24;</code>
   */
  java.util.List<local.example.sample.api.grpc.v1.Refund> 
      getRefundsList();
  /**
   * <code>repeated .local.example.sample.api.grpc.v1.Refund refunds = 24;</code>
   */
  local.example.sample.api.grpc.v1.Refund getRefunds(int index);
  /**
   * <code>repeated .local.example.sample.api.grpc.v1.Refund refunds = 24;</code>
   */
  int getRefundsCount();
  /**
   * <code>repeated .local.example.sample.api.grpc.v1.Refund refunds = 24;</code>
   */
  java.util.List<? extends local.example.sample.api.grpc.v1.RefundOrBuilder> 
      getRefundsOrBuilderList();
  /**
   * <code>repeated .local.example.sample.api.grpc.v1.Refund refunds = 24;</code>
   */
  local.example.sample.api.grpc.v1.RefundOrBuilder getRefundsOrBuilder(
      int index);

  /**
   * <code>string statementDescriptor = 25;</code>
   * @return The statementDescriptor.
   */
  java.lang.String getStatementDescriptor();
  /**
   * <code>string statementDescriptor = 25;</code>
   * @return The bytes for statementDescriptor.
   */
  com.google.protobuf.ByteString
      getStatementDescriptorBytes();

  /**
   * <code>.local.example.sample.api.grpc.v1.Charge.Status status = 26;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.local.example.sample.api.grpc.v1.Charge.Status status = 26;</code>
   * @return The status.
   */
  local.example.sample.api.grpc.v1.Charge.Status getStatus();

  /**
   * <code>string sourceId = 27;</code>
   * @return The sourceId.
   */
  java.lang.String getSourceId();
  /**
   * <code>string sourceId = 27;</code>
   * @return The bytes for sourceId.
   */
  com.google.protobuf.ByteString
      getSourceIdBytes();
}
