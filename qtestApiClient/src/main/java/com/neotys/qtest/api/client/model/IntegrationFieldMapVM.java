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
 * IntegrationFieldMapVM
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-14T16:24:25.829Z")
public class IntegrationFieldMapVM {
  @SerializedName("externalFieldId")
  private String externalFieldId = null;

  @SerializedName("externalFieldName")
  private String externalFieldName = null;

  @SerializedName("active")
  private Boolean active = false;

  public IntegrationFieldMapVM externalFieldId(String externalFieldId) {
    this.externalFieldId = externalFieldId;
    return this;
  }

   /**
   * Get externalFieldId
   * @return externalFieldId
  **/
  @ApiModelProperty(example = "id", value = "")
  public String getExternalFieldId() {
    return externalFieldId;
  }

  public void setExternalFieldId(String externalFieldId) {
    this.externalFieldId = externalFieldId;
  }

  public IntegrationFieldMapVM externalFieldName(String externalFieldName) {
    this.externalFieldName = externalFieldName;
    return this;
  }

   /**
   * Get externalFieldName
   * @return externalFieldName
  **/
  @ApiModelProperty(example = "ID", value = "")
  public String getExternalFieldName() {
    return externalFieldName;
  }

  public void setExternalFieldName(String externalFieldName) {
    this.externalFieldName = externalFieldName;
  }

  public IntegrationFieldMapVM active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationFieldMapVM integrationFieldMapVM = (IntegrationFieldMapVM) o;
    return Objects.equals(this.externalFieldId, integrationFieldMapVM.externalFieldId) &&
        Objects.equals(this.externalFieldName, integrationFieldMapVM.externalFieldName) &&
        Objects.equals(this.active, integrationFieldMapVM.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalFieldId, externalFieldName, active);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationFieldMapVM {\n");
    
    sb.append("    externalFieldId: ").append(toIndentedString(externalFieldId)).append("\n");
    sb.append("    externalFieldName: ").append(toIndentedString(externalFieldName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

