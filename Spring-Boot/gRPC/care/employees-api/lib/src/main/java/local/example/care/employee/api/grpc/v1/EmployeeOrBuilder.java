// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Employee.proto

package local.example.care.employee.api.grpc.v1;

public interface EmployeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:local.example.care.employee.api.v1.Employee)
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
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string surname = 4;</code>
   * @return The surname.
   */
  java.lang.String getSurname();
  /**
   * <code>string surname = 4;</code>
   * @return The bytes for surname.
   */
  com.google.protobuf.ByteString
      getSurnameBytes();

  /**
   * <code>int64 departmentId = 5;</code>
   * @return The departmentId.
   */
  long getDepartmentId();

  /**
   * <code>string task = 6;</code>
   * @return The task.
   */
  java.lang.String getTask();
  /**
   * <code>string task = 6;</code>
   * @return The bytes for task.
   */
  com.google.protobuf.ByteString
      getTaskBytes();

  /**
   * <code>double salary = 7;</code>
   * @return The salary.
   */
  double getSalary();

  /**
   * <code>.local.example.care.employee.api.v1.Employee.Level level = 8;</code>
   * @return The enum numeric value on the wire for level.
   */
  int getLevelValue();
  /**
   * <code>.local.example.care.employee.api.v1.Employee.Level level = 8;</code>
   * @return The level.
   */
  local.example.care.employee.api.grpc.v1.Employee.Level getLevel();

  /**
   * <code>.local.example.care.employee.api.v1.Employee.Status status = 9;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.local.example.care.employee.api.v1.Employee.Status status = 9;</code>
   * @return The status.
   */
  local.example.care.employee.api.grpc.v1.Employee.Status getStatus();
}
