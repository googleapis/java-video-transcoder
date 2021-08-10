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

public interface PreprocessingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.transcoder.v1beta1.PreprocessingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Color preprocessing configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Color color = 1;</code>
   *
   * @return Whether the color field is set.
   */
  boolean hasColor();
  /**
   *
   *
   * <pre>
   * Color preprocessing configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Color color = 1;</code>
   *
   * @return The color.
   */
  com.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Color getColor();
  /**
   *
   *
   * <pre>
   * Color preprocessing configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Color color = 1;</code>
   */
  com.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.ColorOrBuilder getColorOrBuilder();

  /**
   *
   *
   * <pre>
   * Denoise preprocessing configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Denoise denoise = 2;</code>
   *
   * @return Whether the denoise field is set.
   */
  boolean hasDenoise();
  /**
   *
   *
   * <pre>
   * Denoise preprocessing configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Denoise denoise = 2;</code>
   *
   * @return The denoise.
   */
  com.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Denoise getDenoise();
  /**
   *
   *
   * <pre>
   * Denoise preprocessing configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Denoise denoise = 2;</code>
   */
  com.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.DenoiseOrBuilder
      getDenoiseOrBuilder();

  /**
   *
   *
   * <pre>
   * Deblock preprocessing configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Deblock deblock = 3;</code>
   *
   * @return Whether the deblock field is set.
   */
  boolean hasDeblock();
  /**
   *
   *
   * <pre>
   * Deblock preprocessing configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Deblock deblock = 3;</code>
   *
   * @return The deblock.
   */
  com.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Deblock getDeblock();
  /**
   *
   *
   * <pre>
   * Deblock preprocessing configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Deblock deblock = 3;</code>
   */
  com.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.DeblockOrBuilder
      getDeblockOrBuilder();

  /**
   *
   *
   * <pre>
   * Audio preprocessing configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Audio audio = 4;</code>
   *
   * @return Whether the audio field is set.
   */
  boolean hasAudio();
  /**
   *
   *
   * <pre>
   * Audio preprocessing configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Audio audio = 4;</code>
   *
   * @return The audio.
   */
  com.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Audio getAudio();
  /**
   *
   *
   * <pre>
   * Audio preprocessing configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Audio audio = 4;</code>
   */
  com.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.AudioOrBuilder getAudioOrBuilder();

  /**
   *
   *
   * <pre>
   * Specify the video cropping configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Crop crop = 5;</code>
   *
   * @return Whether the crop field is set.
   */
  boolean hasCrop();
  /**
   *
   *
   * <pre>
   * Specify the video cropping configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Crop crop = 5;</code>
   *
   * @return The crop.
   */
  com.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Crop getCrop();
  /**
   *
   *
   * <pre>
   * Specify the video cropping configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Crop crop = 5;</code>
   */
  com.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.CropOrBuilder getCropOrBuilder();

  /**
   *
   *
   * <pre>
   * Specify the video pad filter configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Pad pad = 6;</code>
   *
   * @return Whether the pad field is set.
   */
  boolean hasPad();
  /**
   *
   *
   * <pre>
   * Specify the video pad filter configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Pad pad = 6;</code>
   *
   * @return The pad.
   */
  com.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Pad getPad();
  /**
   *
   *
   * <pre>
   * Specify the video pad filter configuration.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.Pad pad = 6;</code>
   */
  com.google.cloud.video.transcoder.v1beta1.PreprocessingConfig.PadOrBuilder getPadOrBuilder();
}
