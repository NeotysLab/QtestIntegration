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
 * ToscaExecutionEntryResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-14T16:24:25.829Z")
public class ToscaExecutionEntryResource {
  @SerializedName("toscaUniqueId")
  private String toscaUniqueId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("toscaNodePath")
  private String toscaNodePath = null;

  @SerializedName("toscaUrl")
  private String toscaUrl = null;

  @SerializedName("getqTestUniqueId")
  private Long getqTestUniqueId = null;

  @SerializedName("associatedToscaTestCase")
  private ToscaTestCaseResource associatedToscaTestCase = null;

  @SerializedName("associatedToscaTestCaseId")
  private String associatedToscaTestCaseId = null;

  public ToscaExecutionEntryResource toscaUniqueId(String toscaUniqueId) {
    this.toscaUniqueId = toscaUniqueId;
    return this;
  }

   /**
   * Get toscaUniqueId
   * @return toscaUniqueId
  **/
  @ApiModelProperty(example = "cd0de9f4-acef-47a4-b91d-99791c4d8e1c", required = true, value = "")
  public String getToscaUniqueId() {
    return toscaUniqueId;
  }

  public void setToscaUniqueId(String toscaUniqueId) {
    this.toscaUniqueId = toscaUniqueId;
  }

  public ToscaExecutionEntryResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Execution Entry", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ToscaExecutionEntryResource toscaNodePath(String toscaNodePath) {
    this.toscaNodePath = toscaNodePath;
    return this;
  }

   /**
   * Get toscaNodePath
   * @return toscaNodePath
  **/
  @ApiModelProperty(example = "/Execution/ExecutionLists/ExecutionEntry Folder/Execution List/Execution Entry", required = true, value = "")
  public String getToscaNodePath() {
    return toscaNodePath;
  }

  public void setToscaNodePath(String toscaNodePath) {
    this.toscaNodePath = toscaNodePath;
  }

  public ToscaExecutionEntryResource toscaUrl(String toscaUrl) {
    this.toscaUrl = toscaUrl;
    return this;
  }

   /**
   * Get toscaUrl
   * @return toscaUrl
  **/
  @ApiModelProperty(value = "")
  public String getToscaUrl() {
    return toscaUrl;
  }

  public void setToscaUrl(String toscaUrl) {
    this.toscaUrl = toscaUrl;
  }

  public ToscaExecutionEntryResource getqTestUniqueId(Long getqTestUniqueId) {
    this.getqTestUniqueId = getqTestUniqueId;
    return this;
  }

   /**
   * Get getqTestUniqueId
   * @return getqTestUniqueId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getGetqTestUniqueId() {
    return getqTestUniqueId;
  }

  public void setGetqTestUniqueId(Long getqTestUniqueId) {
    this.getqTestUniqueId = getqTestUniqueId;
  }

  public ToscaExecutionEntryResource associatedToscaTestCase(ToscaTestCaseResource associatedToscaTestCase) {
    this.associatedToscaTestCase = associatedToscaTestCase;
    return this;
  }

   /**
   * Get associatedToscaTestCase
   * @return associatedToscaTestCase
  **/
  @ApiModelProperty(value = "")
  public ToscaTestCaseResource getAssociatedToscaTestCase() {
    return associatedToscaTestCase;
  }

  public void setAssociatedToscaTestCase(ToscaTestCaseResource associatedToscaTestCase) {
    this.associatedToscaTestCase = associatedToscaTestCase;
  }

  public ToscaExecutionEntryResource associatedToscaTestCaseId(String associatedToscaTestCaseId) {
    this.associatedToscaTestCaseId = associatedToscaTestCaseId;
    return this;
  }

   /**
   * Get associatedToscaTestCaseId
   * @return associatedToscaTestCaseId
  **/
  @ApiModelProperty(value = "")
  public String getAssociatedToscaTestCaseId() {
    return associatedToscaTestCaseId;
  }

  public void setAssociatedToscaTestCaseId(String associatedToscaTestCaseId) {
    this.associatedToscaTestCaseId = associatedToscaTestCaseId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToscaExecutionEntryResource toscaExecutionEntryResource = (ToscaExecutionEntryResource) o;
    return Objects.equals(this.toscaUniqueId, toscaExecutionEntryResource.toscaUniqueId) &&
        Objects.equals(this.name, toscaExecutionEntryResource.name) &&
        Objects.equals(this.toscaNodePath, toscaExecutionEntryResource.toscaNodePath) &&
        Objects.equals(this.toscaUrl, toscaExecutionEntryResource.toscaUrl) &&
        Objects.equals(this.getqTestUniqueId, toscaExecutionEntryResource.getqTestUniqueId) &&
        Objects.equals(this.associatedToscaTestCase, toscaExecutionEntryResource.associatedToscaTestCase) &&
        Objects.equals(this.associatedToscaTestCaseId, toscaExecutionEntryResource.associatedToscaTestCaseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toscaUniqueId, name, toscaNodePath, toscaUrl, getqTestUniqueId, associatedToscaTestCase, associatedToscaTestCaseId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToscaExecutionEntryResource {\n");
    
    sb.append("    toscaUniqueId: ").append(toIndentedString(toscaUniqueId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    toscaNodePath: ").append(toIndentedString(toscaNodePath)).append("\n");
    sb.append("    toscaUrl: ").append(toIndentedString(toscaUrl)).append("\n");
    sb.append("    getqTestUniqueId: ").append(toIndentedString(getqTestUniqueId)).append("\n");
    sb.append("    associatedToscaTestCase: ").append(toIndentedString(associatedToscaTestCase)).append("\n");
    sb.append("    associatedToscaTestCaseId: ").append(toIndentedString(associatedToscaTestCaseId)).append("\n");
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
