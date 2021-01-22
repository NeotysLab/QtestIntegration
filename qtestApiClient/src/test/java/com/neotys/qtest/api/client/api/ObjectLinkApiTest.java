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

import com.neotys.qtest.api.client.model.LinkedArtifactContainer;
import com.neotys.qtest.api.client.QtestApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for ObjectLinkApi
 */
@Ignore
public class ObjectLinkApiTest {

    private final ObjectLinkApi api = new ObjectLinkApi();

    
    /**
     * Gets associated objects of given objects
     *
     * To retrieve associated objects of given objects  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 7.5+
     *
     * @throws QtestApiException
     *          if the Api call fails
     */
    @Test
    public void findTest() throws QtestApiException {
        Long projectId = null;
        String type = null;
        List<Long> ids = null;
        List<String> pids = null;
        Boolean trofSharedprojects = null;
        List<LinkedArtifactContainer> response = api.find(projectId, type, ids, pids, trofSharedprojects);

        // TODO: test validations
    }
    
    /**
     * Creates links between objects
     *
     * To add associated objects to another object
     *
     * @throws QtestApiException
     *          if the Api call fails
     */
    @Test
    public void linkArtifactsTest() throws QtestApiException {
        Long projectId = null;
        String objectType = null;
        String type = null;
        List<Long> body = null;
        Long objectId = null;
        List<LinkedArtifactContainer> response = api.linkArtifacts(projectId, objectType, type, body, objectId);

        // TODO: test validations
    }
    
    /**
     * Removes links between objects
     *
     * To remove associated objects from another object
     *
     * @throws QtestApiException
     *          if the Api call fails
     */
    @Test
    public void unlinkArtifactsTest() throws QtestApiException {
        Long projectId = null;
        String objectType = null;
        String type = null;
        List<Long> body = null;
        Long objectId = null;
        Object response = api.unlinkArtifacts(projectId, objectType, type, body, objectId);

        // TODO: test validations
    }
    
}