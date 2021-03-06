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
 * ProjectSettingPermission
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-14T16:24:25.829Z")
public class ProjectSettingPermission {
  @SerializedName("manage")
  private Boolean manage = false;

  public ProjectSettingPermission manage(Boolean manage) {
    this.manage = manage;
    return this;
  }

   /**
   * Can manage project setting or not
   * @return manage
  **/
  @ApiModelProperty(example = "true", value = "Can manage project setting or not")
  public Boolean isManage() {
    return manage;
  }

  public void setManage(Boolean manage) {
    this.manage = manage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectSettingPermission projectSettingPermission = (ProjectSettingPermission) o;
    return Objects.equals(this.manage, projectSettingPermission.manage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectSettingPermission {\n");
    
    sb.append("    manage: ").append(toIndentedString(manage)).append("\n");
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

