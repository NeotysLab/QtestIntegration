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

import java.util.List;

/**
 * StatusResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-14T16:24:25.829Z")
public class StatusResource {
  @SerializedName("links")
  private List<Link> links = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("is_default")
  private Boolean isDefault = false;

  @SerializedName("color")
  private String color = null;

  @SerializedName("active")
  private Boolean active = false;

   /**
   * Link to resource
   * @return links
  **/
  @ApiModelProperty(value = "Link to resource")
  public List<Link> getLinks() {
    return links;
  }

  public StatusResource id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of Test Run&#39;s status
   * @return id
  **/
  @ApiModelProperty(example = "601", value = "ID of Test Run's status")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public StatusResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Test Run&#39;s status
   * @return name
  **/
  @ApiModelProperty(example = "Passed", value = "Name of Test Run's status")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StatusResource isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Is default or not
   * @return isDefault
  **/
  @ApiModelProperty(example = "false", value = "Is default or not")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public StatusResource color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Color of Test Run&#39;s status
   * @return color
  **/
  @ApiModelProperty(example = "#0cdda8", value = "Color of Test Run's status")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public StatusResource active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Active or not
   * @return active
  **/
  @ApiModelProperty(example = "true", value = "Active or not")
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
    StatusResource statusResource = (StatusResource) o;
    return Objects.equals(this.links, statusResource.links) &&
        Objects.equals(this.id, statusResource.id) &&
        Objects.equals(this.name, statusResource.name) &&
        Objects.equals(this.isDefault, statusResource.isDefault) &&
        Objects.equals(this.color, statusResource.color) &&
        Objects.equals(this.active, statusResource.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, name, isDefault, color, active);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusResource {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

