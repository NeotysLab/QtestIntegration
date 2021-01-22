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


package com.neotys.qtest.api.client.api;

import com.neotys.qtest.api.client.QtestApiException;
import com.neotys.qtest.api.client.model.ProjectQueryParams;
import com.neotys.qtest.api.client.model.ProjectResource;
import com.neotys.qtest.api.client.model.ProjectUpdateResource;
import com.neotys.qtest.api.client.model.UserProfile;
import com.neotys.qtest.api.client.model.UserResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for ProjectApi
 */
@Ignore
public class ProjectApiTest {

    private final ProjectApi api = new ProjectApi();

    
    /**
     * Creates a Project
     *
     * To create a new Project  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 4+
     *
     * @throws QtestApiException
     *          if the Api call fails
     */
    @Test
    public void createProjectTest() throws QtestApiException {
        ProjectResource body = null;
        ProjectResource response = api.createProject(body);

        // TODO: test validations
    }
    
    /**
     * Gets current user Permissions in a Project
     *
     * To retrieve your Permissions in a Project  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 4+
     *
     * @throws QtestApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentProfileTest() throws QtestApiException {
        Long projectId = null;
        UserProfile response = api.getCurrentProfile(projectId);

        // TODO: test validations
    }
    
    /**
     * Gets a Project
     *
     * To retrieve a specific Project
     *
     * @throws QtestApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectTest() throws QtestApiException {
        Long projectId = null;
        String expand = null;
        ProjectResource response = api.getProject(projectId, expand);

        // TODO: test validations
    }
    
    /**
     * Gets multiple Projects
     *
     * To retrieve all Projects which the requested qTest  Manager account can access to  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 4+
     *
     * @throws QtestApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectsTest() throws QtestApiException {
        String expand = null;
        Boolean assigned = null;
        Long page = null;
        Long pageSize = null;
        List<ProjectResource> response = api.getProjects(expand, assigned, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Gets all Users in a Project
     *
     * To retrieve all members in a qTest Manager Project  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 8.4.2+
     *
     * @throws QtestApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() throws QtestApiException {
        Long projectId = null;
        Boolean inactive = null;
        List<UserResource> response = api.getUsers(projectId, inactive);

        // TODO: test validations
    }
    
    /**
     * Search for projects
     *
     * 
     *
     * @throws QtestApiException
     *          if the Api call fails
     */
    @Test
    public void searchProjectsTest() throws QtestApiException {
        ProjectQueryParams body = null;
        List<ProjectResource> response = api.searchProjects(body);

        // TODO: test validations
    }
    
    /**
     * Updates a Project
     *
     * 
     *
     * @throws QtestApiException
     *          if the Api call fails
     */
    @Test
    public void updateProjectTest() throws QtestApiException {
        Long projectId = null;
        ProjectUpdateResource body = null;
        ProjectResource response = api.updateProject(projectId, body);

        // TODO: test validations
    }
    
}
