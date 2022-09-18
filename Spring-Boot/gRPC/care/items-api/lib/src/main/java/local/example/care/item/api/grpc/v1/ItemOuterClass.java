// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Item.proto

package local.example.care.item.api.grpc.v1;

public final class ItemOuterClass {
  private ItemOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_local_example_care_item_api_v1_Item_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_local_example_care_item_api_v1_Item_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_local_example_care_item_api_v1_Item_Storage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_local_example_care_item_api_v1_Item_Storage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_local_example_care_item_api_v1_Item_AvailabilityEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_local_example_care_item_api_v1_Item_AvailabilityEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_local_example_care_item_api_v1_ItemCreateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_local_example_care_item_api_v1_ItemCreateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nItem.proto\022\036local.example.care.item.ap" +
      "i.v1\032\037google/protobuf/timestamp.proto\"\215\003" +
      "\n\004Item\022\n\n\002id\030\001 \001(\003\022+\n\007created\030\002 \001(\0132\032.go" +
      "ogle.protobuf.Timestamp\022\024\n\014denomination\030" +
      "\003 \001(\t\022\023\n\013description\030\004 \001(\t\022\014\n\004code\030\005 \001(\t" +
      "\022\r\n\005price\030\006 \001(\001\022\020\n\010quantity\030\007 \001(\t\022\020\n\010sto" +
      "ckOut\030\010 \001(\010\022L\n\014availability\030\t \003(\01326.loca" +
      "l.example.care.item.api.v1.Item.Availabi" +
      "lityEntry\032\036\n\007Storage\022\023\n\013positioning\030\001 \001(" +
      "\t\0323\n\021AvailabilityEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v" +
      "alue\030\002 \001(\005:\0028\001\"=\n\014Availability\022\r\n\tAVAILA" +
      "BLE\020\000\022\014\n\010ARRIVING\020\001\022\020\n\014OUT_OF_STOCK\020\002\" \n" +
      "\022ItemCreateResponse\022\n\n\002id\030\001 \001(\0032q\n\013ItemS" +
      "ervice\022b\n\006Create\022$.local.example.care.it" +
      "em.api.v1.Item\0322.local.example.care.item" +
      ".api.v1.ItemCreateResponseB\'\n#local.exam" +
      "ple.care.item.api.grpc.v1P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_local_example_care_item_api_v1_Item_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_local_example_care_item_api_v1_Item_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_local_example_care_item_api_v1_Item_descriptor,
        new java.lang.String[] { "Id", "Created", "Denomination", "Description", "Code", "Price", "Quantity", "StockOut", "Availability", });
    internal_static_local_example_care_item_api_v1_Item_Storage_descriptor =
      internal_static_local_example_care_item_api_v1_Item_descriptor.getNestedTypes().get(0);
    internal_static_local_example_care_item_api_v1_Item_Storage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_local_example_care_item_api_v1_Item_Storage_descriptor,
        new java.lang.String[] { "Positioning", });
    internal_static_local_example_care_item_api_v1_Item_AvailabilityEntry_descriptor =
      internal_static_local_example_care_item_api_v1_Item_descriptor.getNestedTypes().get(1);
    internal_static_local_example_care_item_api_v1_Item_AvailabilityEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_local_example_care_item_api_v1_Item_AvailabilityEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_local_example_care_item_api_v1_ItemCreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_local_example_care_item_api_v1_ItemCreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_local_example_care_item_api_v1_ItemCreateResponse_descriptor,
        new java.lang.String[] { "Id", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
