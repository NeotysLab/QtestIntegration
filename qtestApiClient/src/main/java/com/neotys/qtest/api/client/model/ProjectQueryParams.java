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

import java.util.ArrayList;
import java.util.List;

/**
 * ProjectQueryParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-14T16:24:25.829Z")
public class ProjectQueryParams {
  @SerializedName("uuid")
  private List<String> uuid = null;

  public ProjectQueryParams uuid(List<String> uuid) {
    this.uuid = uuid;
    return this;
  }

  public ProjectQueryParams addUuidItem(String uuidItem) {
    if (this.uuid == null) {
      this.uuid = new ArrayList<String>();
    }
    this.uuid.add(uuidItem);
    return this;
  }

   /**
   * UUID of the Project
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the Project")
  public List<String> getUuid() {
    return uuid;
  }

  public void setUuid(List<String> uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectQueryParams projectQueryParams = (ProjectQueryParams) o;
    return Objects.equals(this.uuid, projectQueryParams.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectQueryParams {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

