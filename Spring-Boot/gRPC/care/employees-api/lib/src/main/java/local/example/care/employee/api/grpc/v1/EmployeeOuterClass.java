// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Employee.proto

package local.example.care.employee.api.grpc.v1;

public final class EmployeeOuterClass {
  private EmployeeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_local_example_care_employee_api_v1_Employee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_local_example_care_employee_api_v1_Employee_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_local_example_care_employee_api_v1_Employee_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_local_example_care_employee_api_v1_Employee_Address_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_local_example_care_employee_api_v1_EmployeeCreateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_local_example_care_employee_api_v1_EmployeeCreateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Employee.proto\022\"local.example.care.emp" +
      "loyee.api.v1\032\037google/protobuf/timestamp." +
      "proto\"\222\004\n\010Employee\022\n\n\002id\030\001 \001(\003\022+\n\007create" +
      "d\030\002 \001(\0132\032.google.protobuf.Timestamp\022\014\n\004n" +
      "ame\030\003 \001(\t\022\017\n\007surname\030\004 \001(\t\022\024\n\014department" +
      "Id\030\005 \001(\003\022\014\n\004task\030\006 \001(\t\022\016\n\006salary\030\007 \001(\001\022A" +
      "\n\005level\030\010 \001(\01622.local.example.care.emplo" +
      "yee.api.v1.Employee.Level\022C\n\006status\030\t \001(" +
      "\01623.local.example.care.employee.api.v1.E" +
      "mployee.Status\032q\n\007Address\022\r\n\005civic\030\001 \001(\t" +
      "\022\016\n\006street\030\002 \001(\t\022\014\n\004city\030\003 \001(\t\022\r\n\005state\030" +
      "\004 \001(\t\022\017\n\007country\030\005 \001(\t\022\031\n\021postalIndexNum" +
      "ber\030\006 \001(\t\":\n\005Level\022\n\n\006MASTER\020\000\022\n\n\006EXPERT" +
      "\020\001\022\014\n\010BEGINNER\020\003\022\013\n\007TRAINEE\020\004\"C\n\006Status\022" +
      "\n\n\006ACTIVE\020\000\022\014\n\010TRANSFER\020\001\022\014\n\010HOLIDAYS\020\002\022" +
      "\021\n\rINDISPOSITION\020\003\"$\n\026EmployeeCreateResp" +
      "onse\022\n\n\002id\030\001 \001(\0032\205\001\n\017EmployeeService\022r\n\006" +
      "Create\022,.local.example.care.employee.api" +
      ".v1.Employee\032:.local.example.care.employ" +
      "ee.api.v1.EmployeeCreateResponseB+\n\'loca" +
      "l.example.care.employee.api.grpc.v1P\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_local_example_care_employee_api_v1_Employee_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_local_example_care_employee_api_v1_Employee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_local_example_care_employee_api_v1_Employee_descriptor,
        new java.lang.String[] { "Id", "Created", "Name", "Surname", "DepartmentId", "Task", "Salary", "Level", "Status", });
    internal_static_local_example_care_employee_api_v1_Employee_Address_descriptor =
      internal_static_local_example_care_employee_api_v1_Employee_descriptor.getNestedTypes().get(0);
    internal_static_local_example_care_employee_api_v1_Employee_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_local_example_care_employee_api_v1_Employee_Address_descriptor,
        new java.lang.String[] { "Civic", "Street", "City", "State", "Country", "PostalIndexNumber", });
    internal_static_local_example_care_employee_api_v1_EmployeeCreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_local_example_care_employee_api_v1_EmployeeCreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_local_example_care_employee_api_v1_EmployeeCreateResponse_descriptor,
        new java.lang.String[] { "Id", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}