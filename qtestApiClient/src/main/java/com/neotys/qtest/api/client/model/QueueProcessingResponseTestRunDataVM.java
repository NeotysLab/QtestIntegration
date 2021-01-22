/*
 * qTest Manager API Version 8.6 - 10.2
 * qTest Manager API Version 8.6 - 10.2
 *
 * OpenAPI spec version: 8.6 - 10.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.neotys.qtest.api.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * QueueProcessingResponseTestRunDataVM
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-14T16:24:25.829Z")
public class QueueProcessingResponseTestRunDataVM {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("contentType")
  private String contentType = null;

  @SerializedName("content")
  private String content = null;

  public QueueProcessingResponseTestRunDataVM id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public QueueProcessingResponseTestRunDataVM type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "CREATE_TEST_RUN_WITH_PARAMETER", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public QueueProcessingResponseTestRunDataVM state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "IN_PROCESSING", value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public QueueProcessingResponseTestRunDataVM contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @ApiModelProperty(example = "application/json", value = "")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public QueueProcessingResponseTestRunDataVM content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueProcessingResponseTestRunDataVM queueProcessingResponseTestRunDataVM = (QueueProcessingResponseTestRunDataVM) o;
    return Objects.equals(this.id, queueProcessingResponseTestRunDataVM.id) &&
        Objects.equals(this.type, queueProcessingResponseTestRunDataVM.type) &&
        Objects.equals(this.state, queueProcessingResponseTestRunDataVM.state) &&
        Objects.equals(this.contentType, queueProcessingResponseTestRunDataVM.contentType) &&
        Objects.equals(this.content, queueProcessingResponseTestRunDataVM.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, state, contentType, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueProcessingResponseTestRunDataVM {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

