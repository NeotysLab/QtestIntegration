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
import org.threeten.bp.OffsetDateTime;

/**
 * WebhookVM
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-14T16:24:25.829Z")
public class WebhookVM {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("events")
  private List<String> events = null;

  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("lastModifiedDate")
  private OffsetDateTime lastModifiedDate = null;

  @SerializedName("secretKey")
  private String secretKey = null;

  public WebhookVM id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public WebhookVM name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WebhookVM url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public WebhookVM events(List<String> events) {
    this.events = events;
    return this;
  }

  public WebhookVM addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<String>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(value = "")
  public List<String> getEvents() {
    return events;
  }

  public void setEvents(List<String> events) {
    this.events = events;
  }

  public WebhookVM createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public WebhookVM lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public WebhookVM secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @ApiModelProperty(value = "")
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookVM webhookVM = (WebhookVM) o;
    return Objects.equals(this.id, webhookVM.id) &&
        Objects.equals(this.name, webhookVM.name) &&
        Objects.equals(this.url, webhookVM.url) &&
        Objects.equals(this.events, webhookVM.events) &&
        Objects.equals(this.createdDate, webhookVM.createdDate) &&
        Objects.equals(this.lastModifiedDate, webhookVM.lastModifiedDate) &&
        Objects.equals(this.secretKey, webhookVM.secretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, url, events, createdDate, lastModifiedDate, secretKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookVM {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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

