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
 * UserProfile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-14T16:24:25.829Z")
public class UserProfile {
  @SerializedName("user_id")
  private Long userId = null;

  @SerializedName("project_id")
  private Long projectId = null;

  @SerializedName("release")
  private ReleasePermission release = null;

  @SerializedName("build")
  private BuildPermission build = null;

  @SerializedName("module")
  private ModulePermission module = null;

  @SerializedName("requirement")
  private RequirementPermission requirement = null;

  @SerializedName("test_case")
  private TestCasePermission testCase = null;

  @SerializedName("test_cycle")
  private TestCyclePermission testCycle = null;

  @SerializedName("test_suite")
  private TestSuitePermission testSuite = null;

  @SerializedName("test_run")
  private TestRunPermission testRun = null;

  @SerializedName("defect")
  private DefectPermission defect = null;

  @SerializedName("report")
  private ReportPermission report = null;

  @SerializedName("project_setting")
  private ProjectSettingPermission projectSetting = null;

  @SerializedName("session")
  private SessionManagerPermission session = null;

  @SerializedName("project")
  private ProjectAdminPermission project = null;

  @SerializedName("schedule")
  private SchedulePermission schedule = null;

  public UserProfile userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * ID of the User
   * @return userId
  **/
  @ApiModelProperty(example = "1", value = "ID of the User")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public UserProfile projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * ID of the Project
   * @return projectId
  **/
  @ApiModelProperty(example = "1", value = "ID of the Project")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public UserProfile release(ReleasePermission release) {
    this.release = release;
    return this;
  }

   /**
   * Permission on Release
   * @return release
  **/
  @ApiModelProperty(value = "Permission on Release")
  public ReleasePermission getRelease() {
    return release;
  }

  public void setRelease(ReleasePermission release) {
    this.release = release;
  }

  public UserProfile build(BuildPermission build) {
    this.build = build;
    return this;
  }

   /**
   * Permission on Build
   * @return build
  **/
  @ApiModelProperty(value = "Permission on Build")
  public BuildPermission getBuild() {
    return build;
  }

  public void setBuild(BuildPermission build) {
    this.build = build;
  }

  public UserProfile module(ModulePermission module) {
    this.module = module;
    return this;
  }

   /**
   * Permission on Module
   * @return module
  **/
  @ApiModelProperty(value = "Permission on Module")
  public ModulePermission getModule() {
    return module;
  }

  public void setModule(ModulePermission module) {
    this.module = module;
  }

  public UserProfile requirement(RequirementPermission requirement) {
    this.requirement = requirement;
    return this;
  }

   /**
   * Permission on Requirement
   * @return requirement
  **/
  @ApiModelProperty(value = "Permission on Requirement")
  public RequirementPermission getRequirement() {
    return requirement;
  }

  public void setRequirement(RequirementPermission requirement) {
    this.requirement = requirement;
  }

  public UserProfile testCase(TestCasePermission testCase) {
    this.testCase = testCase;
    return this;
  }

   /**
   * Permission on Test Case
   * @return testCase
  **/
  @ApiModelProperty(value = "Permission on Test Case")
  public TestCasePermission getTestCase() {
    return testCase;
  }

  public void setTestCase(TestCasePermission testCase) {
    this.testCase = testCase;
  }

  public UserProfile testCycle(TestCyclePermission testCycle) {
    this.testCycle = testCycle;
    return this;
  }

   /**
   * Permission on Test Cycle
   * @return testCycle
  **/
  @ApiModelProperty(value = "Permission on Test Cycle")
  public TestCyclePermission getTestCycle() {
    return testCycle;
  }

  public void setTestCycle(TestCyclePermission testCycle) {
    this.testCycle = testCycle;
  }

  public UserProfile testSuite(TestSuitePermission testSuite) {
    this.testSuite = testSuite;
    return this;
  }

   /**
   * Permission on Test Suite
   * @return testSuite
  **/
  @ApiModelProperty(value = "Permission on Test Suite")
  public TestSuitePermission getTestSuite() {
    return testSuite;
  }

  public void setTestSuite(TestSuitePermission testSuite) {
    this.testSuite = testSuite;
  }

  public UserProfile testRun(TestRunPermission testRun) {
    this.testRun = testRun;
    return this;
  }

   /**
   * Permission on Test Run
   * @return testRun
  **/
  @ApiModelProperty(value = "Permission on Test Run")
  public TestRunPermission getTestRun() {
    return testRun;
  }

  public void setTestRun(TestRunPermission testRun) {
    this.testRun = testRun;
  }

  public UserProfile defect(DefectPermission defect) {
    this.defect = defect;
    return this;
  }

   /**
   * Permission on Defect
   * @return defect
  **/
  @ApiModelProperty(value = "Permission on Defect")
  public DefectPermission getDefect() {
    return defect;
  }

  public void setDefect(DefectPermission defect) {
    this.defect = defect;
  }

  public UserProfile report(ReportPermission report) {
    this.report = report;
    return this;
  }

   /**
   * Permission on Report
   * @return report
  **/
  @ApiModelProperty(value = "Permission on Report")
  public ReportPermission getReport() {
    return report;
  }

  public void setReport(ReportPermission report) {
    this.report = report;
  }

  public UserProfile projectSetting(ProjectSettingPermission projectSetting) {
    this.projectSetting = projectSetting;
    return this;
  }

   /**
   * Permission on Project Setting
   * @return projectSetting
  **/
  @ApiModelProperty(value = "Permission on Project Setting")
  public ProjectSettingPermission getProjectSetting() {
    return projectSetting;
  }

  public void setProjectSetting(ProjectSettingPermission projectSetting) {
    this.projectSetting = projectSetting;
  }

  public UserProfile session(SessionManagerPermission session) {
    this.session = session;
    return this;
  }

   /**
   * Permission on qTest Explorer Sessions
   * @return session
  **/
  @ApiModelProperty(value = "Permission on qTest Explorer Sessions")
  public SessionManagerPermission getSession() {
    return session;
  }

  public void setSession(SessionManagerPermission session) {
    this.session = session;
  }

  public UserProfile project(ProjectAdminPermission project) {
    this.project = project;
    return this;
  }

   /**
   * Permission on manage Project
   * @return project
  **/
  @ApiModelProperty(value = "Permission on manage Project")
  public ProjectAdminPermission getProject() {
    return project;
  }

  public void setProject(ProjectAdminPermission project) {
    this.project = project;
  }

  public UserProfile schedule(SchedulePermission schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Permission on manage Schedule
   * @return schedule
  **/
  @ApiModelProperty(value = "Permission on manage Schedule")
  public SchedulePermission getSchedule() {
    return schedule;
  }

  public void setSchedule(SchedulePermission schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfile userProfile = (UserProfile) o;
    return Objects.equals(this.userId, userProfile.userId) &&
        Objects.equals(this.projectId, userProfile.projectId) &&
        Objects.equals(this.release, userProfile.release) &&
        Objects.equals(this.build, userProfile.build) &&
        Objects.equals(this.module, userProfile.module) &&
        Objects.equals(this.requirement, userProfile.requirement) &&
        Objects.equals(this.testCase, userProfile.testCase) &&
        Objects.equals(this.testCycle, userProfile.testCycle) &&
        Objects.equals(this.testSuite, userProfile.testSuite) &&
        Objects.equals(this.testRun, userProfile.testRun) &&
        Objects.equals(this.defect, userProfile.defect) &&
        Objects.equals(this.report, userProfile.report) &&
        Objects.equals(this.projectSetting, userProfile.projectSetting) &&
        Objects.equals(this.session, userProfile.session) &&
        Objects.equals(this.project, userProfile.project) &&
        Objects.equals(this.schedule, userProfile.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, projectId, release, build, module, requirement, testCase, testCycle, testSuite, testRun, defect, report, projectSetting, session, project, schedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfile {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    requirement: ").append(toIndentedString(requirement)).append("\n");
    sb.append("    testCase: ").append(toIndentedString(testCase)).append("\n");
    sb.append("    testCycle: ").append(toIndentedString(testCycle)).append("\n");
    sb.append("    testSuite: ").append(toIndentedString(testSuite)).append("\n");
    sb.append("    testRun: ").append(toIndentedString(testRun)).append("\n");
    sb.append("    defect: ").append(toIndentedString(defect)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    projectSetting: ").append(toIndentedString(projectSetting)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

