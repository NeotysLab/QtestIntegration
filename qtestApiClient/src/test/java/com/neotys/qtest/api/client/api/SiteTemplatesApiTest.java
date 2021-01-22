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

import com.neotys.qtest.api.client.model.ApplyTemplateQueryObject;
import com.neotys.qtest.api.client.model.ProjectResource;
import com.neotys.qtest.api.client.model.SiteTemplateResponse;
import com.neotys.qtest.api.client.QtestApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for SiteTemplatesApi
 */
@Ignore
public class SiteTemplatesApiTest {

    private final SiteTemplatesApi api = new SiteTemplatesApi();

    
    /**
     * Apply template to existing projects.
     *
     * To apply template to existing projects.
     *
     * @throws QtestApiException
     *          if the Api call fails
     */
    @Test
    public void addProjectsTest() throws QtestApiException {
        Long templateId = null;
        ApplyTemplateQueryObject body = null;
        List<ProjectResource> response = api.addProjects(templateId, body);

        // TODO: test validations
    }
    
    /**
     * Get all site-templates
     *
     * To retrieve all site-templates
     *
     * @throws QtestApiException
     *          if the Api call fails
     */
    @Test
    public void getAllTest() throws QtestApiException {
        List<SiteTemplateResponse> response = api.getAll();

        // TODO: test validations
    }
    
    /**
     * Remove projects from a site template.
     *
     * To remove projects from a site template.
     *
     * @throws QtestApiException
     *          if the Api call fails
     */
    @Test
    public void removeProjectTemplatesTest() throws QtestApiException {
        Long templateId = null;
        List<Long> body = null;
        List<ProjectResource> response = api.removeProjectTemplates(templateId, body);

        // TODO: test validations
    }
    
}
