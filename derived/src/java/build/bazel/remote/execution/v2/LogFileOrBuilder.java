// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/remote/execution/v2/remote_execution.proto

package build.bazel.remote.execution.v2;

public interface LogFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.bazel.remote.execution.v2.LogFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The digest of the log contents.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
   */
  boolean hasDigest();
  /**
   * <pre>
   * The digest of the log contents.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
   */
  build.bazel.remote.execution.v2.Digest getDigest();
  /**
   * <pre>
   * The digest of the log contents.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
   */
  build.bazel.remote.execution.v2.DigestOrBuilder getDigestOrBuilder();

  /**
   * <pre>
   * This is a hint as to the purpose of the log, and is set to true if the log
   * is human-readable text that can be usefully displayed to a user, and false
   * otherwise. For instance, if a command-line client wishes to print the
   * server logs to the terminal for a failed action, this allows it to avoid
   * displaying a binary file.
   * </pre>
   *
   * <code>bool human_readable = 2;</code>
   */
  boolean getHumanReadable();
}
