/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/transcoder/v1beta1/resources.proto

package com.google.cloud.video.transcoder.v1beta1;

public interface VideoStreamOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.transcoder.v1beta1.VideoStream)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Codec type. The default is `"h264"`.
   * Supported codecs:
   * - 'h264'
   * - 'h265'
   * - 'vp9'
   * </pre>
   *
   * <code>string codec = 1;</code>
   *
   * @return The codec.
   */
  java.lang.String getCodec();
  /**
   *
   *
   * <pre>
   * Codec type. The default is `"h264"`.
   * Supported codecs:
   * - 'h264'
   * - 'h265'
   * - 'vp9'
   * </pre>
   *
   * <code>string codec = 1;</code>
   *
   * @return The bytes for codec.
   */
  com.google.protobuf.ByteString getCodecBytes();

  /**
   *
   *
   * <pre>
   * Enforce specified codec profile. The default is `"high"`.
   * Supported codec profiles:
   * - 'baseline'
   * - 'main'
   * - 'high'
   * </pre>
   *
   * <code>string profile = 2;</code>
   *
   * @return The profile.
   */
  java.lang.String getProfile();
  /**
   *
   *
   * <pre>
   * Enforce specified codec profile. The default is `"high"`.
   * Supported codec profiles:
   * - 'baseline'
   * - 'main'
   * - 'high'
   * </pre>
   *
   * <code>string profile = 2;</code>
   *
   * @return The bytes for profile.
   */
  com.google.protobuf.ByteString getProfileBytes();

  /**
   *
   *
   * <pre>
   * Enforce specified codec tune.
   * </pre>
   *
   * <code>string tune = 3;</code>
   *
   * @return The tune.
   */
  java.lang.String getTune();
  /**
   *
   *
   * <pre>
   * Enforce specified codec tune.
   * </pre>
   *
   * <code>string tune = 3;</code>
   *
   * @return The bytes for tune.
   */
  com.google.protobuf.ByteString getTuneBytes();

  /**
   *
   *
   * <pre>
   * Enforce specified codec preset. The default is `"veryfast"`.
   * </pre>
   *
   * <code>string preset = 4;</code>
   *
   * @return The preset.
   */
  java.lang.String getPreset();
  /**
   *
   *
   * <pre>
   * Enforce specified codec preset. The default is `"veryfast"`.
   * </pre>
   *
   * <code>string preset = 4;</code>
   *
   * @return The bytes for preset.
   */
  com.google.protobuf.ByteString getPresetBytes();

  /**
   *
   *
   * <pre>
   * The height of the video in pixels. Must be an even integer.
   * When not specified, the height is adjusted to match the specified width and
   * input aspect ratio. If both are omitted, the input height is used.
   * </pre>
   *
   * <code>int32 height_pixels = 5;</code>
   *
   * @return The heightPixels.
   */
  int getHeightPixels();

  /**
   *
   *
   * <pre>
   * The width of the video in pixels. Must be an even integer.
   * When not specified, the width is adjusted to match the specified height and
   * input aspect ratio. If both are omitted, the input width is used.
   * </pre>
   *
   * <code>int32 width_pixels = 6;</code>
   *
   * @return The widthPixels.
   */
  int getWidthPixels();

  /**
   *
   *
   * <pre>
   * Pixel format to use. The default is `"yuv420p"`.
   * Supported pixel formats:
   * - 'yuv420p' pixel format.
   * - 'yuv422p' pixel format.
   * - 'yuv444p' pixel format.
   * - 'yuv420p10' 10-bit HDR pixel format.
   * - 'yuv422p10' 10-bit HDR pixel format.
   * - 'yuv444p10' 10-bit HDR pixel format.
   * - 'yuv420p12' 12-bit HDR pixel format.
   * - 'yuv422p12' 12-bit HDR pixel format.
   * - 'yuv444p12' 12-bit HDR pixel format.
   * </pre>
   *
   * <code>string pixel_format = 7;</code>
   *
   * @return The pixelFormat.
   */
  java.lang.String getPixelFormat();
  /**
   *
   *
   * <pre>
   * Pixel format to use. The default is `"yuv420p"`.
   * Supported pixel formats:
   * - 'yuv420p' pixel format.
   * - 'yuv422p' pixel format.
   * - 'yuv444p' pixel format.
   * - 'yuv420p10' 10-bit HDR pixel format.
   * - 'yuv422p10' 10-bit HDR pixel format.
   * - 'yuv444p10' 10-bit HDR pixel format.
   * - 'yuv420p12' 12-bit HDR pixel format.
   * - 'yuv422p12' 12-bit HDR pixel format.
   * - 'yuv444p12' 12-bit HDR pixel format.
   * </pre>
   *
   * <code>string pixel_format = 7;</code>
   *
   * @return The bytes for pixelFormat.
   */
  com.google.protobuf.ByteString getPixelFormatBytes();

  /**
   *
   *
   * <pre>
   * Required. The video bitrate in bits per second. Must be between 1 and 1,000,000,000.
   * </pre>
   *
   * <code>int32 bitrate_bps = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bitrateBps.
   */
  int getBitrateBps();

  /**
   *
   *
   * <pre>
   * Specify the `rate_control_mode`. The default is `"vbr"`.
   * Supported rate control modes:
   * - 'vbr' - variable bitrate
   * - 'crf' - constant rate factor
   * </pre>
   *
   * <code>string rate_control_mode = 9;</code>
   *
   * @return The rateControlMode.
   */
  java.lang.String getRateControlMode();
  /**
   *
   *
   * <pre>
   * Specify the `rate_control_mode`. The default is `"vbr"`.
   * Supported rate control modes:
   * - 'vbr' - variable bitrate
   * - 'crf' - constant rate factor
   * </pre>
   *
   * <code>string rate_control_mode = 9;</code>
   *
   * @return The bytes for rateControlMode.
   */
  com.google.protobuf.ByteString getRateControlModeBytes();

  /**
   *
   *
   * <pre>
   * Use two-pass encoding strategy to achieve better video quality.
   * `VideoStream.rate_control_mode` must be `"vbr"`. The default is `false`.
   * </pre>
   *
   * <code>bool enable_two_pass = 10;</code>
   *
   * @return The enableTwoPass.
   */
  boolean getEnableTwoPass();

  /**
   *
   *
   * <pre>
   * Target CRF level. Must be between 10 and 36, where 10 is the highest
   * quality and 36 is the most efficient compression. The default is 21.
   * </pre>
   *
   * <code>int32 crf_level = 11;</code>
   *
   * @return The crfLevel.
   */
  int getCrfLevel();

  /**
   *
   *
   * <pre>
   * Size of the Video Buffering Verifier (VBV) buffer in bits. Must be greater
   * than zero. The default is equal to `VideoStream.bitrate_bps`.
   * </pre>
   *
   * <code>int32 vbv_size_bits = 12;</code>
   *
   * @return The vbvSizeBits.
   */
  int getVbvSizeBits();

  /**
   *
   *
   * <pre>
   * Initial fullness of the Video Buffering Verifier (VBV) buffer in bits. Must
   * be greater than zero. The default is equal to 90% of
   * `VideoStream.vbv_size_bits`.
   * </pre>
   *
   * <code>int32 vbv_fullness_bits = 13;</code>
   *
   * @return The vbvFullnessBits.
   */
  int getVbvFullnessBits();

  /**
   *
   *
   * <pre>
   * Specifies whether an open Group of Pictures (GOP) structure should be
   * allowed or not. The default is `false`.
   * </pre>
   *
   * <code>bool allow_open_gop = 14;</code>
   *
   * @return The allowOpenGop.
   */
  boolean getAllowOpenGop();

  /**
   *
   *
   * <pre>
   * Select the GOP size based on the specified frame count. Must be greater
   * than zero.
   * </pre>
   *
   * <code>int32 gop_frame_count = 15;</code>
   *
   * @return Whether the gopFrameCount field is set.
   */
  boolean hasGopFrameCount();
  /**
   *
   *
   * <pre>
   * Select the GOP size based on the specified frame count. Must be greater
   * than zero.
   * </pre>
   *
   * <code>int32 gop_frame_count = 15;</code>
   *
   * @return The gopFrameCount.
   */
  int getGopFrameCount();

  /**
   *
   *
   * <pre>
   * Select the GOP size based on the specified duration. The default is
   * `"3s"`.
   * </pre>
   *
   * <code>.google.protobuf.Duration gop_duration = 16;</code>
   *
   * @return Whether the gopDuration field is set.
   */
  boolean hasGopDuration();
  /**
   *
   *
   * <pre>
   * Select the GOP size based on the specified duration. The default is
   * `"3s"`.
   * </pre>
   *
   * <code>.google.protobuf.Duration gop_duration = 16;</code>
   *
   * @return The gopDuration.
   */
  com.google.protobuf.Duration getGopDuration();
  /**
   *
   *
   * <pre>
   * Select the GOP size based on the specified duration. The default is
   * `"3s"`.
   * </pre>
   *
   * <code>.google.protobuf.Duration gop_duration = 16;</code>
   */
  com.google.protobuf.DurationOrBuilder getGopDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * The entropy coder to use. The default is `"cabac"`.
   * Supported entropy coders:
   * - 'cavlc'
   * - 'cabac'
   * </pre>
   *
   * <code>string entropy_coder = 17;</code>
   *
   * @return The entropyCoder.
   */
  java.lang.String getEntropyCoder();
  /**
   *
   *
   * <pre>
   * The entropy coder to use. The default is `"cabac"`.
   * Supported entropy coders:
   * - 'cavlc'
   * - 'cabac'
   * </pre>
   *
   * <code>string entropy_coder = 17;</code>
   *
   * @return The bytes for entropyCoder.
   */
  com.google.protobuf.ByteString getEntropyCoderBytes();

  /**
   *
   *
   * <pre>
   * Allow B-pyramid for reference frame selection. This may not be supported
   * on all decoders. The default is `false`.
   * </pre>
   *
   * <code>bool b_pyramid = 18;</code>
   *
   * @return The bPyramid.
   */
  boolean getBPyramid();

  /**
   *
   *
   * <pre>
   * The number of consecutive B-frames. Must be greater than or equal to zero.
   * Must be less than `VideoStream.gop_frame_count` if set. The default is 0.
   * </pre>
   *
   * <code>int32 b_frame_count = 19;</code>
   *
   * @return The bFrameCount.
   */
  int getBFrameCount();

  /**
   *
   *
   * <pre>
   * Required. The target video frame rate in frames per second (FPS). Must be less than
   * or equal to 120. Will default to the input frame rate if larger than the
   * input frame rate. The API will generate an output FPS that is divisible by
   * the input FPS, and smaller or equal to the target FPS.
   * The following table shows the computed video FPS given the target FPS (in
   * parenthesis) and input FPS (in the first column):
   * ```
   * |        | (30)   | (60)   | (25) | (50) |
   * |--------|--------|--------|------|------|
   * | 240    | Fail   | Fail   | Fail | Fail |
   * | 120    | 30     | 60     | 20   | 30   |
   * | 100    | 25     | 50     | 20   | 30   |
   * | 50     | 25     | 50     | 20   | 30   |
   * | 60     | 30     | 60     | 20   | 30   |
   * | 59.94  | 29.97  | 59.94  | 20   | 30   |
   * | 48     | 24     | 48     | 20   | 30   |
   * | 30     | 30     | 30     | 20   | 30   |
   * | 25     | 25     | 25     | 20   | 30   |
   * | 24     | 24     | 24     | 20   | 30   |
   * | 23.976 | 23.976 | 23.976 | 20   | 30   |
   * | 15     | 15     | 15     | 20   | 30   |
   * | 12     | 12     | 12     | 20   | 30   |
   * | 10     | 10     | 10     | 20   | 30   |
   * ```
   * </pre>
   *
   * <code>double frame_rate = 20 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The frameRate.
   */
  double getFrameRate();

  /**
   *
   *
   * <pre>
   * Specify the intensity of the adaptive quantizer (AQ). Must be between 0 and
   * 1, where 0 disables the quantizer and 1 maximizes the quantizer. A
   * higher value equals a lower bitrate but smoother image. The default is 0.
   * </pre>
   *
   * <code>double aq_strength = 21;</code>
   *
   * @return The aqStrength.
   */
  double getAqStrength();

  public com.google.cloud.video.transcoder.v1beta1.VideoStream.GopModeCase getGopModeCase();
}
