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
 * AdminProfile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-14T16:24:25.829Z")
public class AdminProfile {
  @SerializedName("user_id")
  private Long userId = null;

  @SerializedName("create_project")
  private Boolean createProject = false;

  @SerializedName("edit_project")
  private Boolean editProject = false;

  @SerializedName("archive_project")
  private Boolean archiveProject = false;

  @SerializedName("list_project")
  private Boolean listProject = false;

  @SerializedName("manage_client_user")
  private Boolean manageClientUser = false;

  @SerializedName("edit_user_profile")
  private Boolean editUserProfile = false;

  @SerializedName("view_user_profile")
  private Boolean viewUserProfile = false;

  @SerializedName("manage_client_info")
  private Boolean manageClientInfo = false;

  @SerializedName("manage_system_conf")
  private Boolean manageSystemConf = false;

  @SerializedName("site_level_field")
  private Boolean siteLevelField = false;

  @SerializedName("manage_user_group")
  private Boolean manageUserGroup = false;

  @SerializedName("insight_viewer")
  private Boolean insightViewer = false;

  @SerializedName("insight_editor")
  private Boolean insightEditor = false;

  @SerializedName("pulse_access")
  private Boolean pulseAccess = false;

  @SerializedName("launch_access")
  private Boolean launchAccess = false;

  @SerializedName("analytics_viewer")
  private Boolean analyticsViewer = false;

  @SerializedName("analytics_designer")
  private Boolean analyticsDesigner = false;

  @SerializedName("analytics_admin")
  private Boolean analyticsAdmin = false;

  public AdminProfile userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * ID of the user
   * @return userId
  **/
  @ApiModelProperty(example = "1", value = "ID of the user")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public AdminProfile createProject(Boolean createProject) {
    this.createProject = createProject;
    return this;
  }

   /**
   * Has permission on create Project
   * @return createProject
  **/
  @ApiModelProperty(example = "true", value = "Has permission on create Project")
  public Boolean isCreateProject() {
    return createProject;
  }

  public void setCreateProject(Boolean createProject) {
    this.createProject = createProject;
  }

  public AdminProfile editProject(Boolean editProject) {
    this.editProject = editProject;
    return this;
  }

   /**
   * Has permission on edit Project
   * @return editProject
  **/
  @ApiModelProperty(example = "true", value = "Has permission on edit Project")
  public Boolean isEditProject() {
    return editProject;
  }

  public void setEditProject(Boolean editProject) {
    this.editProject = editProject;
  }

  public AdminProfile archiveProject(Boolean archiveProject) {
    this.archiveProject = archiveProject;
    return this;
  }

   /**
   * Has permission on archive Project
   * @return archiveProject
  **/
  @ApiModelProperty(example = "true", value = "Has permission on archive Project")
  public Boolean isArchiveProject() {
    return archiveProject;
  }

  public void setArchiveProject(Boolean archiveProject) {
    this.archiveProject = archiveProject;
  }

  public AdminProfile listProject(Boolean listProject) {
    this.listProject = listProject;
    return this;
  }

   /**
   * Has permission on view Project
   * @return listProject
  **/
  @ApiModelProperty(example = "true", value = "Has permission on view Project")
  public Boolean isListProject() {
    return listProject;
  }

  public void setListProject(Boolean listProject) {
    this.listProject = listProject;
  }

  public AdminProfile manageClientUser(Boolean manageClientUser) {
    this.manageClientUser = manageClientUser;
    return this;
  }

   /**
   * Has permission on Invite/Edit Users
   * @return manageClientUser
  **/
  @ApiModelProperty(example = "true", value = "Has permission on Invite/Edit Users")
  public Boolean isManageClientUser() {
    return manageClientUser;
  }

  public void setManageClientUser(Boolean manageClientUser) {
    this.manageClientUser = manageClientUser;
  }

  public AdminProfile editUserProfile(Boolean editUserProfile) {
    this.editUserProfile = editUserProfile;
    return this;
  }

   /**
   * Has permission on edit Profiles
   * @return editUserProfile
  **/
  @ApiModelProperty(example = "true", value = "Has permission on edit Profiles")
  public Boolean isEditUserProfile() {
    return editUserProfile;
  }

  public void setEditUserProfile(Boolean editUserProfile) {
    this.editUserProfile = editUserProfile;
  }

  public AdminProfile viewUserProfile(Boolean viewUserProfile) {
    this.viewUserProfile = viewUserProfile;
    return this;
  }

   /**
   * Has permission on view Profiles
   * @return viewUserProfile
  **/
  @ApiModelProperty(example = "true", value = "Has permission on view Profiles")
  public Boolean isViewUserProfile() {
    return viewUserProfile;
  }

  public void setViewUserProfile(Boolean viewUserProfile) {
    this.viewUserProfile = viewUserProfile;
  }

  public AdminProfile manageClientInfo(Boolean manageClientInfo) {
    this.manageClientInfo = manageClientInfo;
    return this;
  }

   /**
   * Has permission on update Company&#39;s information
   * @return manageClientInfo
  **/
  @ApiModelProperty(example = "true", value = "Has permission on update Company's information")
  public Boolean isManageClientInfo() {
    return manageClientInfo;
  }

  public void setManageClientInfo(Boolean manageClientInfo) {
    this.manageClientInfo = manageClientInfo;
  }

  public AdminProfile manageSystemConf(Boolean manageSystemConf) {
    this.manageSystemConf = manageSystemConf;
    return this;
  }

   /**
   * Has permission on manage System configuration
   * @return manageSystemConf
  **/
  @ApiModelProperty(example = "true", value = "Has permission on manage System configuration")
  public Boolean isManageSystemConf() {
    return manageSystemConf;
  }

  public void setManageSystemConf(Boolean manageSystemConf) {
    this.manageSystemConf = manageSystemConf;
  }

  public AdminProfile siteLevelField(Boolean siteLevelField) {
    this.siteLevelField = siteLevelField;
    return this;
  }

   /**
   * Has permission on manage site level field setting
   * @return siteLevelField
  **/
  @ApiModelProperty(example = "true", value = "Has permission on manage site level field setting")
  public Boolean isSiteLevelField() {
    return siteLevelField;
  }

  public void setSiteLevelField(Boolean siteLevelField) {
    this.siteLevelField = siteLevelField;
  }

  public AdminProfile manageUserGroup(Boolean manageUserGroup) {
    this.manageUserGroup = manageUserGroup;
    return this;
  }

   /**
   * Get manageUserGroup
   * @return manageUserGroup
  **/
  @ApiModelProperty(value = "")
  public Boolean isManageUserGroup() {
    return manageUserGroup;
  }

  public void setManageUserGroup(Boolean manageUserGroup) {
    this.manageUserGroup = manageUserGroup;
  }

  public AdminProfile insightViewer(Boolean insightViewer) {
    this.insightViewer = insightViewer;
    return this;
  }

   /**
   * Get insightViewer
   * @return insightViewer
  **/
  @ApiModelProperty(value = "")
  public Boolean isInsightViewer() {
    return insightViewer;
  }

  public void setInsightViewer(Boolean insightViewer) {
    this.insightViewer = insightViewer;
  }

  public AdminProfile insightEditor(Boolean insightEditor) {
    this.insightEditor = insightEditor;
    return this;
  }

   /**
   * Get insightEditor
   * @return insightEditor
  **/
  @ApiModelProperty(value = "")
  public Boolean isInsightEditor() {
    return insightEditor;
  }

  public void setInsightEditor(Boolean insightEditor) {
    this.insightEditor = insightEditor;
  }

  public AdminProfile pulseAccess(Boolean pulseAccess) {
    this.pulseAccess = pulseAccess;
    return this;
  }

   /**
   * Get pulseAccess
   * @return pulseAccess
  **/
  @ApiModelProperty(value = "")
  public Boolean isPulseAccess() {
    return pulseAccess;
  }

  public void setPulseAccess(Boolean pulseAccess) {
    this.pulseAccess = pulseAccess;
  }

  public AdminProfile launchAccess(Boolean launchAccess) {
    this.launchAccess = launchAccess;
    return this;
  }

   /**
   * Get launchAccess
   * @return launchAccess
  **/
  @ApiModelProperty(value = "")
  public Boolean isLaunchAccess() {
    return launchAccess;
  }

  public void setLaunchAccess(Boolean launchAccess) {
    this.launchAccess = launchAccess;
  }

  public AdminProfile analyticsViewer(Boolean analyticsViewer) {
    this.analyticsViewer = analyticsViewer;
    return this;
  }

   /**
   * Get analyticsViewer
   * @return analyticsViewer
  **/
  @ApiModelProperty(value = "")
  public Boolean isAnalyticsViewer() {
    return analyticsViewer;
  }

  public void setAnalyticsViewer(Boolean analyticsViewer) {
    this.analyticsViewer = analyticsViewer;
  }

  public AdminProfile analyticsDesigner(Boolean analyticsDesigner) {
    this.analyticsDesigner = analyticsDesigner;
    return this;
  }

   /**
   * Get analyticsDesigner
   * @return analyticsDesigner
  **/
  @ApiModelProperty(value = "")
  public Boolean isAnalyticsDesigner() {
    return analyticsDesigner;
  }

  public void setAnalyticsDesigner(Boolean analyticsDesigner) {
    this.analyticsDesigner = analyticsDesigner;
  }

  public AdminProfile analyticsAdmin(Boolean analyticsAdmin) {
    this.analyticsAdmin = analyticsAdmin;
    return this;
  }

   /**
   * Get analyticsAdmin
   * @return analyticsAdmin
  **/
  @ApiModelProperty(value = "")
  public Boolean isAnalyticsAdmin() {
    return analyticsAdmin;
  }

  public void setAnalyticsAdmin(Boolean analyticsAdmin) {
    this.analyticsAdmin = analyticsAdmin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminProfile adminProfile = (AdminProfile) o;
    return Objects.equals(this.userId, adminProfile.userId) &&
        Objects.equals(this.createProject, adminProfile.createProject) &&
        Objects.equals(this.editProject, adminProfile.editProject) &&
        Objects.equals(this.archiveProject, adminProfile.archiveProject) &&
        Objects.equals(this.listProject, adminProfile.listProject) &&
        Objects.equals(this.manageClientUser, adminProfile.manageClientUser) &&
        Objects.equals(this.editUserProfile, adminProfile.editUserProfile) &&
        Objects.equals(this.viewUserProfile, adminProfile.viewUserProfile) &&
        Objects.equals(this.manageClientInfo, adminProfile.manageClientInfo) &&
        Objects.equals(this.manageSystemConf, adminProfile.manageSystemConf) &&
        Objects.equals(this.siteLevelField, adminProfile.siteLevelField) &&
        Objects.equals(this.manageUserGroup, adminProfile.manageUserGroup) &&
        Objects.equals(this.insightViewer, adminProfile.insightViewer) &&
        Objects.equals(this.insightEditor, adminProfile.insightEditor) &&
        Objects.equals(this.pulseAccess, adminProfile.pulseAccess) &&
        Objects.equals(this.launchAccess, adminProfile.launchAccess) &&
        Objects.equals(this.analyticsViewer, adminProfile.analyticsViewer) &&
        Objects.equals(this.analyticsDesigner, adminProfile.analyticsDesigner) &&
        Objects.equals(this.analyticsAdmin, adminProfile.analyticsAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, createProject, editProject, archiveProject, listProject, manageClientUser, editUserProfile, viewUserProfile, manageClientInfo, manageSystemConf, siteLevelField, manageUserGroup, insightViewer, insightEditor, pulseAccess, launchAccess, analyticsViewer, analyticsDesigner, analyticsAdmin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminProfile {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createProject: ").append(toIndentedString(createProject)).append("\n");
    sb.append("    editProject: ").append(toIndentedString(editProject)).append("\n");
    sb.append("    archiveProject: ").append(toIndentedString(archiveProject)).append("\n");
    sb.append("    listProject: ").append(toIndentedString(listProject)).append("\n");
    sb.append("    manageClientUser: ").append(toIndentedString(manageClientUser)).append("\n");
    sb.append("    editUserProfile: ").append(toIndentedString(editUserProfile)).append("\n");
    sb.append("    viewUserProfile: ").append(toIndentedString(viewUserProfile)).append("\n");
    sb.append("    manageClientInfo: ").append(toIndentedString(manageClientInfo)).append("\n");
    sb.append("    manageSystemConf: ").append(toIndentedString(manageSystemConf)).append("\n");
    sb.append("    siteLevelField: ").append(toIndentedString(siteLevelField)).append("\n");
    sb.append("    manageUserGroup: ").append(toIndentedString(manageUserGroup)).append("\n");
    sb.append("    insightViewer: ").append(toIndentedString(insightViewer)).append("\n");
    sb.append("    insightEditor: ").append(toIndentedString(insightEditor)).append("\n");
    sb.append("    pulseAccess: ").append(toIndentedString(pulseAccess)).append("\n");
    sb.append("    launchAccess: ").append(toIndentedString(launchAccess)).append("\n");
    sb.append("    analyticsViewer: ").append(toIndentedString(analyticsViewer)).append("\n");
    sb.append("    analyticsDesigner: ").append(toIndentedString(analyticsDesigner)).append("\n");
    sb.append("    analyticsAdmin: ").append(toIndentedString(analyticsAdmin)).append("\n");
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

