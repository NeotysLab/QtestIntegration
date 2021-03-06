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

import com.neotys.qtest.api.client.*;
import com.neotys.qtest.api.client.model.AutomationScheduleCreationAPI;
import com.neotys.qtest.api.client.QtestApiClient;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutomationJobApi {
    private QtestApiClient qtestApiClient;

    public AutomationJobApi() {
        this(Configuration.getDefaultQtestApiClient());
    }

    public AutomationJobApi(QtestApiClient qtestApiClient) {
        this.qtestApiClient = qtestApiClient;
    }

    public QtestApiClient getQtestApiClient() {
        return qtestApiClient;
    }

    public void setQtestApiClient(QtestApiClient qtestApiClient) {
        this.qtestApiClient = qtestApiClient;
    }

    /**
     * Build call for createSchedule
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws QtestApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createScheduleCall(AutomationScheduleCreationAPI body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/v3/automation/jobs/schedule/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = qtestApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = qtestApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            qtestApiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return qtestApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createScheduleValidateBeforeCall(AutomationScheduleCreationAPI body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new QtestApiException("Missing the required parameter 'body' when calling createSchedule(Async)");
        }
        

        com.squareup.okhttp.Call call = createScheduleCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a Schedule
     * To create a new Schedule which will be executed immediately  &lt;strong&gt;NOTE:&lt;/strong&gt; Try It Out function will not work for this API  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+\&quot;
     * @param body  (required)
     * @return Long
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Long createSchedule(AutomationScheduleCreationAPI body) throws QtestApiException {
        ApiResponse<Long> resp = createScheduleWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create a Schedule
     * To create a new Schedule which will be executed immediately  &lt;strong&gt;NOTE:&lt;/strong&gt; Try It Out function will not work for this API  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+\&quot;
     * @param body  (required)
     * @return ApiResponse&lt;Long&gt;
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Long> createScheduleWithHttpInfo(AutomationScheduleCreationAPI body) throws QtestApiException {
        com.squareup.okhttp.Call call = createScheduleValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        return qtestApiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a Schedule (asynchronously)
     * To create a new Schedule which will be executed immediately  &lt;strong&gt;NOTE:&lt;/strong&gt; Try It Out function will not work for this API  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+\&quot;
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QtestApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createScheduleAsync(AutomationScheduleCreationAPI body, final ApiCallback<Long> callback) throws QtestApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createScheduleValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        qtestApiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
