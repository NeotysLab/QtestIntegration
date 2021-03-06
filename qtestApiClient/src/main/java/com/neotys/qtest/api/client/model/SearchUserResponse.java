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
 * SearchUserResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-14T16:24:25.829Z")
public class SearchUserResponse {
  @SerializedName("links")
  private List<Link> links = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("page_size")
  private Integer pageSize = null;

  @SerializedName("total")
  private Long total = null;

  @SerializedName("items")
  private List<SearchUserResource> items = null;

  @SerializedName("total_project")
  private Long totalProject = null;

   /**
   * Link to resource
   * @return links
  **/
  @ApiModelProperty(value = "Link to resource")
  public List<Link> getLinks() {
    return links;
  }

  public SearchUserResponse page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Current page number
   * @return page
  **/
  @ApiModelProperty(example = "1", value = "Current page number")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public SearchUserResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Current page size number
   * @return pageSize
  **/
  @ApiModelProperty(example = "25", value = "Current page size number")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public SearchUserResponse total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Total user found
   * @return total
  **/
  @ApiModelProperty(example = "100", value = "Total user found")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public SearchUserResponse items(List<SearchUserResource> items) {
    this.items = items;
    return this;
  }

  public SearchUserResponse addItemsItem(SearchUserResource itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<SearchUserResource>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Arrays of User
   * @return items
  **/
  @ApiModelProperty(value = "Arrays of User")
  public List<SearchUserResource> getItems() {
    return items;
  }

  public void setItems(List<SearchUserResource> items) {
    this.items = items;
  }

  public SearchUserResponse totalProject(Long totalProject) {
    this.totalProject = totalProject;
    return this;
  }

   /**
   * Total Project found
   * @return totalProject
  **/
  @ApiModelProperty(example = "10", value = "Total Project found")
  public Long getTotalProject() {
    return totalProject;
  }

  public void setTotalProject(Long totalProject) {
    this.totalProject = totalProject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchUserResponse searchUserResponse = (SearchUserResponse) o;
    return Objects.equals(this.links, searchUserResponse.links) &&
        Objects.equals(this.page, searchUserResponse.page) &&
        Objects.equals(this.pageSize, searchUserResponse.pageSize) &&
        Objects.equals(this.total, searchUserResponse.total) &&
        Objects.equals(this.items, searchUserResponse.items) &&
        Objects.equals(this.totalProject, searchUserResponse.totalProject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, page, pageSize, total, items, totalProject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchUserResponse {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    totalProject: ").append(toIndentedString(totalProject)).append("\n");
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

