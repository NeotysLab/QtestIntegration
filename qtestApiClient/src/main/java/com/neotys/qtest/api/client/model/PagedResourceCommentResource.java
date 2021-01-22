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
 * PagedResourceCommentResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-14T16:24:25.829Z")
public class PagedResourceCommentResource {
  @SerializedName("links")
  private List<Link> links = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("page_size")
  private Integer pageSize = null;

  @SerializedName("total")
  private Long total = null;

  @SerializedName("items")
  private List<CommentResource> items = null;

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public PagedResourceCommentResource page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Current page
   * @return page
  **/
  @ApiModelProperty(example = "1", value = "Current page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public PagedResourceCommentResource pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Current page size
   * @return pageSize
  **/
  @ApiModelProperty(example = "25", value = "Current page size")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public PagedResourceCommentResource total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Total record found
   * @return total
  **/
  @ApiModelProperty(example = "100", value = "Total record found")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public PagedResourceCommentResource items(List<CommentResource> items) {
    this.items = items;
    return this;
  }

  public PagedResourceCommentResource addItemsItem(CommentResource itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<CommentResource>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Data of records
   * @return items
  **/
  @ApiModelProperty(value = "Data of records")
  public List<CommentResource> getItems() {
    return items;
  }

  public void setItems(List<CommentResource> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedResourceCommentResource pagedResourceCommentResource = (PagedResourceCommentResource) o;
    return Objects.equals(this.links, pagedResourceCommentResource.links) &&
        Objects.equals(this.page, pagedResourceCommentResource.page) &&
        Objects.equals(this.pageSize, pagedResourceCommentResource.pageSize) &&
        Objects.equals(this.total, pagedResourceCommentResource.total) &&
        Objects.equals(this.items, pagedResourceCommentResource.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, page, pageSize, total, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResourceCommentResource {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

