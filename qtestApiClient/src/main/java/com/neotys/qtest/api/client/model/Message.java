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
 * Message
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-14T16:24:25.829Z")
public class Message {
  @SerializedName("noLogging")
  private Boolean noLogging = false;

  @SerializedName("message")
  private String message = null;

  public Message noLogging(Boolean noLogging) {
    this.noLogging = noLogging;
    return this;
  }

   /**
   * Get noLogging
   * @return noLogging
  **/
  @ApiModelProperty(value = "")
  public Boolean isNoLogging() {
    return noLogging;
  }

  public void setNoLogging(Boolean noLogging) {
    this.noLogging = noLogging;
  }

   /**
   * Error message text
   * @return message
  **/
  @ApiModelProperty(example = "Error message", value = "Error message text")
  public String getMessage() {
    return message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.noLogging, message.noLogging) &&
        Objects.equals(this.message, message.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noLogging, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    noLogging: ").append(toIndentedString(noLogging)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

