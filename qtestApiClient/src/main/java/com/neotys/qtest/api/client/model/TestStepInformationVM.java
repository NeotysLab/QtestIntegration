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
 * TestStepInformationVM
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-14T16:24:25.829Z")
public class TestStepInformationVM {
  @SerializedName("description")
  private String description = null;

  @SerializedName("descriptionInfo")
  private ParameterizationText descriptionInfo = null;

  @SerializedName("expectedResult")
  private String expectedResult = null;

  @SerializedName("actualResult")
  private String actualResult = null;

  public TestStepInformationVM description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TestStepInformationVM descriptionInfo(ParameterizationText descriptionInfo) {
    this.descriptionInfo = descriptionInfo;
    return this;
  }

   /**
   * Get descriptionInfo
   * @return descriptionInfo
  **/
  @ApiModelProperty(value = "")
  public ParameterizationText getDescriptionInfo() {
    return descriptionInfo;
  }

  public void setDescriptionInfo(ParameterizationText descriptionInfo) {
    this.descriptionInfo = descriptionInfo;
  }

  public TestStepInformationVM expectedResult(String expectedResult) {
    this.expectedResult = expectedResult;
    return this;
  }

   /**
   * Get expectedResult
   * @return expectedResult
  **/
  @ApiModelProperty(value = "")
  public String getExpectedResult() {
    return expectedResult;
  }

  public void setExpectedResult(String expectedResult) {
    this.expectedResult = expectedResult;
  }

  public TestStepInformationVM actualResult(String actualResult) {
    this.actualResult = actualResult;
    return this;
  }

   /**
   * Get actualResult
   * @return actualResult
  **/
  @ApiModelProperty(value = "")
  public String getActualResult() {
    return actualResult;
  }

  public void setActualResult(String actualResult) {
    this.actualResult = actualResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestStepInformationVM testStepInformationVM = (TestStepInformationVM) o;
    return Objects.equals(this.description, testStepInformationVM.description) &&
        Objects.equals(this.descriptionInfo, testStepInformationVM.descriptionInfo) &&
        Objects.equals(this.expectedResult, testStepInformationVM.expectedResult) &&
        Objects.equals(this.actualResult, testStepInformationVM.actualResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, descriptionInfo, expectedResult, actualResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestStepInformationVM {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionInfo: ").append(toIndentedString(descriptionInfo)).append("\n");
    sb.append("    expectedResult: ").append(toIndentedString(expectedResult)).append("\n");
    sb.append("    actualResult: ").append(toIndentedString(actualResult)).append("\n");
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

