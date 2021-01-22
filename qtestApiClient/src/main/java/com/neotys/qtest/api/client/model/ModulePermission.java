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
 * ModulePermission
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-14T16:24:25.829Z")
public class ModulePermission {
  @SerializedName("create")
  private Boolean create = false;

  @SerializedName("edit")
  private Boolean edit = false;

  @SerializedName("delete")
  private Boolean delete = false;

  @SerializedName("view")
  private Boolean view = false;

  public ModulePermission create(Boolean create) {
    this.create = create;
    return this;
  }

   /**
   * Can create Module
   * @return create
  **/
  @ApiModelProperty(example = "true", value = "Can create Module")
  public Boolean isCreate() {
    return create;
  }

  public void setCreate(Boolean create) {
    this.create = create;
  }

  public ModulePermission edit(Boolean edit) {
    this.edit = edit;
    return this;
  }

   /**
   * Can edit Module
   * @return edit
  **/
  @ApiModelProperty(example = "true", value = "Can edit Module")
  public Boolean isEdit() {
    return edit;
  }

  public void setEdit(Boolean edit) {
    this.edit = edit;
  }

  public ModulePermission delete(Boolean delete) {
    this.delete = delete;
    return this;
  }

   /**
   * Can delete Module
   * @return delete
  **/
  @ApiModelProperty(example = "true", value = "Can delete Module")
  public Boolean isDelete() {
    return delete;
  }

  public void setDelete(Boolean delete) {
    this.delete = delete;
  }

  public ModulePermission view(Boolean view) {
    this.view = view;
    return this;
  }

   /**
   * Can view Module
   * @return view
  **/
  @ApiModelProperty(example = "true", value = "Can view Module")
  public Boolean isView() {
    return view;
  }

  public void setView(Boolean view) {
    this.view = view;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModulePermission modulePermission = (ModulePermission) o;
    return Objects.equals(this.create, modulePermission.create) &&
        Objects.equals(this.edit, modulePermission.edit) &&
        Objects.equals(this.delete, modulePermission.delete) &&
        Objects.equals(this.view, modulePermission.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, edit, delete, view);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModulePermission {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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
