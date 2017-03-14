// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/util/test_log.proto

package org.tensorflow.util.testlog;

public final class TestLogProtos {
  private TestLogProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_EntryValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_EntryValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_BenchmarkEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_BenchmarkEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_BenchmarkEntry_ExtrasEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_BenchmarkEntry_ExtrasEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_BenchmarkEntries_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_BenchmarkEntries_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_BuildConfiguration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_BuildConfiguration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CommitId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CommitId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CPUInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CPUInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CPUInfo_CacheSizeEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CPUInfo_CacheSizeEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_MemoryInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_MemoryInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GPUInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GPUInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_PlatformInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_PlatformInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_AvailableDeviceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_AvailableDeviceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_MachineConfiguration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_MachineConfiguration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RunConfiguration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RunConfiguration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_TestResults_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_TestResults_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#tensorflow/core/util/test_log.proto\022\nt" +
      "ensorflow\032\031google/protobuf/any.proto\"D\n\n" +
      "EntryValue\022\026\n\014double_value\030\001 \001(\001H\000\022\026\n\014st" +
      "ring_value\030\002 \001(\tH\000B\006\n\004kind\"\345\001\n\016Benchmark" +
      "Entry\022\014\n\004name\030\001 \001(\t\022\r\n\005iters\030\002 \001(\003\022\020\n\010cp" +
      "u_time\030\003 \001(\001\022\021\n\twall_time\030\004 \001(\001\022\022\n\nthrou" +
      "ghput\030\005 \001(\001\0226\n\006extras\030\006 \003(\0132&.tensorflow" +
      ".BenchmarkEntry.ExtrasEntry\032E\n\013ExtrasEnt" +
      "ry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.tensorf" +
      "low.EntryValue:\0028\001\"=\n\020BenchmarkEntries\022)",
      "\n\005entry\030\001 \003(\0132\032.tensorflow.BenchmarkEntr" +
      "y\"B\n\022BuildConfiguration\022\014\n\004mode\030\001 \001(\t\022\020\n" +
      "\010cc_flags\030\002 \003(\t\022\014\n\004opts\030\003 \003(\t\"J\n\010CommitI" +
      "d\022\024\n\nchangelist\030\001 \001(\003H\000\022\016\n\004hash\030\002 \001(\tH\000\022" +
      "\020\n\010snapshot\030\003 \001(\tB\006\n\004kind\"\336\001\n\007CPUInfo\022\021\n" +
      "\tnum_cores\030\001 \001(\003\022\031\n\021num_cores_allowed\030\002 " +
      "\001(\003\022\023\n\013mhz_per_cpu\030\003 \001(\001\022\020\n\010cpu_info\030\004 \001" +
      "(\t\022\024\n\014cpu_governor\030\005 \001(\t\0226\n\ncache_size\030\006" +
      " \003(\0132\".tensorflow.CPUInfo.CacheSizeEntry" +
      "\0320\n\016CacheSizeEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value",
      "\030\002 \001(\003:\0028\001\".\n\nMemoryInfo\022\r\n\005total\030\001 \001(\003\022" +
      "\021\n\tavailable\030\002 \001(\003\"6\n\007GPUInfo\022\r\n\005model\030\001" +
      " \001(\t\022\014\n\004uuid\030\002 \001(\t\022\016\n\006bus_id\030\003 \001(\t\"p\n\014Pl" +
      "atformInfo\022\014\n\004bits\030\001 \001(\t\022\017\n\007linkage\030\002 \001(" +
      "\t\022\017\n\007machine\030\003 \001(\t\022\017\n\007release\030\004 \001(\t\022\016\n\006s" +
      "ystem\030\005 \001(\t\022\017\n\007version\030\006 \001(\t\"e\n\023Availabl" +
      "eDeviceInfo\022\014\n\004name\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\022" +
      "\024\n\014memory_limit\030\003 \001(\003\022\034\n\024physical_descri" +
      "ption\030\004 \001(\t\"\263\002\n\024MachineConfiguration\022\020\n\010" +
      "hostname\030\001 \001(\t\022\031\n\021serial_identifier\030\007 \001(",
      "\t\022/\n\rplatform_info\030\002 \001(\0132\030.tensorflow.Pl" +
      "atformInfo\022%\n\010cpu_info\030\003 \001(\0132\023.tensorflo" +
      "w.CPUInfo\022)\n\013device_info\030\004 \003(\0132\024.google." +
      "protobuf.Any\022>\n\025available_device_info\030\005 " +
      "\003(\0132\037.tensorflow.AvailableDeviceInfo\022+\n\013" +
      "memory_info\030\006 \001(\0132\026.tensorflow.MemoryInf" +
      "o\"$\n\020RunConfiguration\022\020\n\010argument\030\001 \003(\t\"" +
      "\340\002\n\013TestResults\022\016\n\006target\030\001 \001(\t\022-\n\007entri" +
      "es\030\002 \001(\0132\034.tensorflow.BenchmarkEntries\022;" +
      "\n\023build_configuration\030\003 \001(\0132\036.tensorflow",
      ".BuildConfiguration\022\'\n\tcommit_id\030\004 \001(\0132\024" +
      ".tensorflow.CommitId\022\022\n\nstart_time\030\005 \001(\003" +
      "\022\020\n\010run_time\030\006 \001(\001\022?\n\025machine_configurat" +
      "ion\030\007 \001(\0132 .tensorflow.MachineConfigurat" +
      "ion\0227\n\021run_configuration\030\010 \001(\0132\034.tensorf" +
      "low.RunConfiguration\022\014\n\004name\030\t \001(\tB1\n\033or" +
      "g.tensorflow.util.testlogB\rTestLogProtos" +
      "P\001\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_EntryValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_EntryValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_EntryValue_descriptor,
        new java.lang.String[] { "DoubleValue", "StringValue", "Kind", });
    internal_static_tensorflow_BenchmarkEntry_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_BenchmarkEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_BenchmarkEntry_descriptor,
        new java.lang.String[] { "Name", "Iters", "CpuTime", "WallTime", "Throughput", "Extras", });
    internal_static_tensorflow_BenchmarkEntry_ExtrasEntry_descriptor =
      internal_static_tensorflow_BenchmarkEntry_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_BenchmarkEntry_ExtrasEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_BenchmarkEntry_ExtrasEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_BenchmarkEntries_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_BenchmarkEntries_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_BenchmarkEntries_descriptor,
        new java.lang.String[] { "Entry", });
    internal_static_tensorflow_BuildConfiguration_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_BuildConfiguration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_BuildConfiguration_descriptor,
        new java.lang.String[] { "Mode", "CcFlags", "Opts", });
    internal_static_tensorflow_CommitId_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_CommitId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CommitId_descriptor,
        new java.lang.String[] { "Changelist", "Hash", "Snapshot", "Kind", });
    internal_static_tensorflow_CPUInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_CPUInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CPUInfo_descriptor,
        new java.lang.String[] { "NumCores", "NumCoresAllowed", "MhzPerCpu", "CpuInfo", "CpuGovernor", "CacheSize", });
    internal_static_tensorflow_CPUInfo_CacheSizeEntry_descriptor =
      internal_static_tensorflow_CPUInfo_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_CPUInfo_CacheSizeEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CPUInfo_CacheSizeEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_MemoryInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tensorflow_MemoryInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_MemoryInfo_descriptor,
        new java.lang.String[] { "Total", "Available", });
    internal_static_tensorflow_GPUInfo_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_tensorflow_GPUInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GPUInfo_descriptor,
        new java.lang.String[] { "Model", "Uuid", "BusId", });
    internal_static_tensorflow_PlatformInfo_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_tensorflow_PlatformInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_PlatformInfo_descriptor,
        new java.lang.String[] { "Bits", "Linkage", "Machine", "Release", "System", "Version", });
    internal_static_tensorflow_AvailableDeviceInfo_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_tensorflow_AvailableDeviceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_AvailableDeviceInfo_descriptor,
        new java.lang.String[] { "Name", "Type", "MemoryLimit", "PhysicalDescription", });
    internal_static_tensorflow_MachineConfiguration_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_tensorflow_MachineConfiguration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_MachineConfiguration_descriptor,
        new java.lang.String[] { "Hostname", "SerialIdentifier", "PlatformInfo", "CpuInfo", "DeviceInfo", "AvailableDeviceInfo", "MemoryInfo", });
    internal_static_tensorflow_RunConfiguration_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_tensorflow_RunConfiguration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RunConfiguration_descriptor,
        new java.lang.String[] { "Argument", });
    internal_static_tensorflow_TestResults_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_tensorflow_TestResults_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_TestResults_descriptor,
        new java.lang.String[] { "Target", "Entries", "BuildConfiguration", "CommitId", "StartTime", "RunTime", "MachineConfiguration", "RunConfiguration", "Name", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
