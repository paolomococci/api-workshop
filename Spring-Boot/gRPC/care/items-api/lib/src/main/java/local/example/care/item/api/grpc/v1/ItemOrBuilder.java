// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Item.proto

package local.example.care.item.api.grpc.v1;

public interface ItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:local.example.care.item.api.v1.Item)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.google.protobuf.Timestamp created = 2;</code>
   * @return Whether the created field is set.
   */
  boolean hasCreated();
  /**
   * <code>.google.protobuf.Timestamp created = 2;</code>
   * @return The created.
   */
  com.google.protobuf.Timestamp getCreated();
  /**
   * <code>.google.protobuf.Timestamp created = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedOrBuilder();

  /**
   * <code>string denomination = 3;</code>
   * @return The denomination.
   */
  java.lang.String getDenomination();
  /**
   * <code>string denomination = 3;</code>
   * @return The bytes for denomination.
   */
  com.google.protobuf.ByteString
      getDenominationBytes();

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
   * <code>string code = 5;</code>
   * @return The code.
   */
  java.lang.String getCode();
  /**
   * <code>string code = 5;</code>
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <code>double price = 6;</code>
   * @return The price.
   */
  double getPrice();

  /**
   * <code>string quantity = 7;</code>
   * @return The quantity.
   */
  java.lang.String getQuantity();
  /**
   * <code>string quantity = 7;</code>
   * @return The bytes for quantity.
   */
  com.google.protobuf.ByteString
      getQuantityBytes();

  /**
   * <code>bool stockOut = 8;</code>
   * @return The stockOut.
   */
  boolean getStockOut();

  /**
   * <code>map&lt;string, int32&gt; availability = 9;</code>
   */
  int getAvailabilityCount();
  /**
   * <code>map&lt;string, int32&gt; availability = 9;</code>
   */
  boolean containsAvailability(
      java.lang.String key);
  /**
   * Use {@link #getAvailabilityMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer>
  getAvailability();
  /**
   * <code>map&lt;string, int32&gt; availability = 9;</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer>
  getAvailabilityMap();
  /**
   * <code>map&lt;string, int32&gt; availability = 9;</code>
   */

  int getAvailabilityOrDefault(
      java.lang.String key,
      int defaultValue);
  /**
   * <code>map&lt;string, int32&gt; availability = 9;</code>
   */

  int getAvailabilityOrThrow(
      java.lang.String key);
}
