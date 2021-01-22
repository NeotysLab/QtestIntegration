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
 * TestCaseWithParameterResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-14T16:24:25.829Z")
public class TestCaseWithParameterResource {
  @SerializedName("test_case_version_id")
  private Long testCaseVersionId = null;

  @SerializedName("id")
  private Long id = null;

  public TestCaseWithParameterResource testCaseVersionId(Long testCaseVersionId) {
    this.testCaseVersionId = testCaseVersionId;
    return this;
  }

   /**
   * Get testCaseVersionId
   * @return testCaseVersionId
  **/
  @ApiModelProperty(value = "")
  public Long getTestCaseVersionId() {
    return testCaseVersionId;
  }

  public void setTestCaseVersionId(Long testCaseVersionId) {
    this.testCaseVersionId = testCaseVersionId;
  }

  public TestCaseWithParameterResource id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestCaseWithParameterResource testCaseWithParameterResource = (TestCaseWithParameterResource) o;
    return Objects.equals(this.testCaseVersionId, testCaseWithParameterResource.testCaseVersionId) &&
        Objects.equals(this.id, testCaseWithParameterResource.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testCaseVersionId, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCaseWithParameterResource {\n");
    
    sb.append("    testCaseVersionId: ").append(toIndentedString(testCaseVersionId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

