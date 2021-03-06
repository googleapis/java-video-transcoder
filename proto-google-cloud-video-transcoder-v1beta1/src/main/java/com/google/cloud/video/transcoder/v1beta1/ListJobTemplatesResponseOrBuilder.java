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
// source: google/cloud/video/transcoder/v1beta1/services.proto

package com.google.cloud.video.transcoder.v1beta1;

public interface ListJobTemplatesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.transcoder.v1beta1.ListJobTemplatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of job templates in the specified region.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1beta1.JobTemplate job_templates = 1;</code>
   */
  java.util.List<com.google.cloud.video.transcoder.v1beta1.JobTemplate> getJobTemplatesList();
  /**
   *
   *
   * <pre>
   * List of job templates in the specified region.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1beta1.JobTemplate job_templates = 1;</code>
   */
  com.google.cloud.video.transcoder.v1beta1.JobTemplate getJobTemplates(int index);
  /**
   *
   *
   * <pre>
   * List of job templates in the specified region.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1beta1.JobTemplate job_templates = 1;</code>
   */
  int getJobTemplatesCount();
  /**
   *
   *
   * <pre>
   * List of job templates in the specified region.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1beta1.JobTemplate job_templates = 1;</code>
   */
  java.util.List<? extends com.google.cloud.video.transcoder.v1beta1.JobTemplateOrBuilder>
      getJobTemplatesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of job templates in the specified region.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1beta1.JobTemplate job_templates = 1;</code>
   */
  com.google.cloud.video.transcoder.v1beta1.JobTemplateOrBuilder getJobTemplatesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The pagination token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * The pagination token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
