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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SSOSamlConfigDetailResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-14T16:24:25.829Z")
public class SSOSamlConfigDetailResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("is_activated")
  private Boolean isActivated = false;

  /**
   * Type of authentication system
   */
  @JsonAdapter(AuthTypeEnum.Adapter.class)
  public enum AuthTypeEnum {
    INTERNAL("INTERNAL"),
    
    LDAP("LDAP"),
    
    SSO_SAML2("SSO_SAML2"),
    
    TUA_OPENID("TUA_OPENID");

    private String value;

    AuthTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthTypeEnum fromValue(String text) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AuthTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AuthTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("auth_type")
  private AuthTypeEnum authType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("metadata_link")
  private String metadataLink = null;

  @SerializedName("auto_create_user")
  private Boolean autoCreateUser = false;

  @SerializedName("metadata_filename")
  private String metadataFilename = null;

  public SSOSamlConfigDetailResponse id(Long id) {
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

  public SSOSamlConfigDetailResponse isActivated(Boolean isActivated) {
    this.isActivated = isActivated;
    return this;
  }

   /**
   * Get isActivated
   * @return isActivated
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsActivated() {
    return isActivated;
  }

  public void setIsActivated(Boolean isActivated) {
    this.isActivated = isActivated;
  }

  public SSOSamlConfigDetailResponse authType(AuthTypeEnum authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Type of authentication system
   * @return authType
  **/
  @ApiModelProperty(example = "SSO_SAML2", value = "Type of authentication system")
  public AuthTypeEnum getAuthType() {
    return authType;
  }

  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }

  public SSOSamlConfigDetailResponse name(String name) {
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

  public SSOSamlConfigDetailResponse metadataLink(String metadataLink) {
    this.metadataLink = metadataLink;
    return this;
  }

   /**
   * Metadata link of SSO system
   * @return metadataLink
  **/
  @ApiModelProperty(value = "Metadata link of SSO system")
  public String getMetadataLink() {
    return metadataLink;
  }

  public void setMetadataLink(String metadataLink) {
    this.metadataLink = metadataLink;
  }

  public SSOSamlConfigDetailResponse autoCreateUser(Boolean autoCreateUser) {
    this.autoCreateUser = autoCreateUser;
    return this;
  }

   /**
   * Auto create user or not
   * @return autoCreateUser
  **/
  @ApiModelProperty(value = "Auto create user or not")
  public Boolean isAutoCreateUser() {
    return autoCreateUser;
  }

  public void setAutoCreateUser(Boolean autoCreateUser) {
    this.autoCreateUser = autoCreateUser;
  }

  public SSOSamlConfigDetailResponse metadataFilename(String metadataFilename) {
    this.metadataFilename = metadataFilename;
    return this;
  }

   /**
   * Get metadataFilename
   * @return metadataFilename
  **/
  @ApiModelProperty(value = "")
  public String getMetadataFilename() {
    return metadataFilename;
  }

  public void setMetadataFilename(String metadataFilename) {
    this.metadataFilename = metadataFilename;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSOSamlConfigDetailResponse ssOSamlConfigDetailResponse = (SSOSamlConfigDetailResponse) o;
    return Objects.equals(this.id, ssOSamlConfigDetailResponse.id) &&
        Objects.equals(this.isActivated, ssOSamlConfigDetailResponse.isActivated) &&
        Objects.equals(this.authType, ssOSamlConfigDetailResponse.authType) &&
        Objects.equals(this.name, ssOSamlConfigDetailResponse.name) &&
        Objects.equals(this.metadataLink, ssOSamlConfigDetailResponse.metadataLink) &&
        Objects.equals(this.autoCreateUser, ssOSamlConfigDetailResponse.autoCreateUser) &&
        Objects.equals(this.metadataFilename, ssOSamlConfigDetailResponse.metadataFilename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isActivated, authType, name, metadataLink, autoCreateUser, metadataFilename);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSOSamlConfigDetailResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActivated: ").append(toIndentedString(isActivated)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    metadataLink: ").append(toIndentedString(metadataLink)).append("\n");
    sb.append("    autoCreateUser: ").append(toIndentedString(autoCreateUser)).append("\n");
    sb.append("    metadataFilename: ").append(toIndentedString(metadataFilename)).append("\n");
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

