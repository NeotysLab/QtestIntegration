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

import com.neotys.qtest.api.client.model.AutomationScheduleCreationAPI;
import com.neotys.qtest.api.client.QtestApiException;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for AutomationJobApi
 */
@Ignore
public class AutomationJobApiTest {

    private final AutomationJobApi api = new AutomationJobApi();

    
    /**
     * Create a Schedule
     *
     * To create a new Schedule which will be executed immediately  &lt;strong&gt;NOTE:&lt;/strong&gt; Try It Out function will not work for this API  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+\&quot;
     *
     * @throws QtestApiException
     *          if the Api call fails
     */
    @Test
    public void createScheduleTest() throws QtestApiException {
        AutomationScheduleCreationAPI body = null;
        Long response = api.createSchedule(body);

        // TODO: test validations
    }
    
}