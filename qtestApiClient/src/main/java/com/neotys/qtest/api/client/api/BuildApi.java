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
import com.neotys.qtest.api.client.QtestApiClient;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.neotys.qtest.api.client.model.BuildResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuildApi {
    private QtestApiClient qtestApiClient;

    public BuildApi() {
        this(Configuration.getDefaultQtestApiClient());
    }

    public BuildApi(QtestApiClient qtestApiClient) {
        this.qtestApiClient = qtestApiClient;
    }

    public QtestApiClient getQtestApiClient() {
        return qtestApiClient;
    }

    public void setQtestApiClient(QtestApiClient qtestApiClient) {
        this.qtestApiClient = qtestApiClient;
    }

    /**
     * Build call for create
     * @param projectId ID of the project (required)
     * @param body &lt;em&gt;name (required):&lt;/em&gt; Build name  &lt;em&gt;release (required):&lt;/em&gt; The parent Release under which the Build will be located  &lt;em&gt;properties:&lt;/em&gt; An array of field-value pairs (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws QtestApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createCall(Long projectId, BuildResource body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/v3/projects/{projectId}/builds"
            .replaceAll("\\{" + "projectId" + "\\}", qtestApiClient.escapeString(projectId.toString()));

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
    private com.squareup.okhttp.Call createValidateBeforeCall(Long projectId, BuildResource body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new QtestApiException("Missing the required parameter 'projectId' when calling create(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new QtestApiException("Missing the required parameter 'body' when calling create(Async)");
        }
        

        com.squareup.okhttp.Call call = createCall(projectId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a Build
     * To create a Build under a parent Release  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 4+
     * @param projectId ID of the project (required)
     * @param body &lt;em&gt;name (required):&lt;/em&gt; Build name  &lt;em&gt;release (required):&lt;/em&gt; The parent Release under which the Build will be located  &lt;em&gt;properties:&lt;/em&gt; An array of field-value pairs (required)
     * @return BuildResource
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BuildResource create(Long projectId, BuildResource body) throws QtestApiException {
        ApiResponse<BuildResource> resp = createWithHttpInfo(projectId, body);
        return resp.getData();
    }

    /**
     * Creates a Build
     * To create a Build under a parent Release  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 4+
     * @param projectId ID of the project (required)
     * @param body &lt;em&gt;name (required):&lt;/em&gt; Build name  &lt;em&gt;release (required):&lt;/em&gt; The parent Release under which the Build will be located  &lt;em&gt;properties:&lt;/em&gt; An array of field-value pairs (required)
     * @return ApiResponse&lt;BuildResource&gt;
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BuildResource> createWithHttpInfo(Long projectId, BuildResource body) throws QtestApiException {
        com.squareup.okhttp.Call call = createValidateBeforeCall(projectId, body, null, null);
        Type localVarReturnType = new TypeToken<BuildResource>(){}.getType();
        return qtestApiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a Build (asynchronously)
     * To create a Build under a parent Release  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 4+
     * @param projectId ID of the project (required)
     * @param body &lt;em&gt;name (required):&lt;/em&gt; Build name  &lt;em&gt;release (required):&lt;/em&gt; The parent Release under which the Build will be located  &lt;em&gt;properties:&lt;/em&gt; An array of field-value pairs (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QtestApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAsync(Long projectId, BuildResource body, final ApiCallback<BuildResource> callback) throws QtestApiException {

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

        com.squareup.okhttp.Call call = createValidateBeforeCall(projectId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BuildResource>(){}.getType();
        qtestApiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for delete
     * @param projectId ID of the project (required)
     * @param buildId ID of the Build to delete (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws QtestApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCall(Long projectId, Long buildId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v3/projects/{projectId}/builds/{buildId}"
            .replaceAll("\\{" + "projectId" + "\\}", qtestApiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "buildId" + "\\}", qtestApiClient.escapeString(buildId.toString()));

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
        return qtestApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteValidateBeforeCall(Long projectId, Long buildId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new QtestApiException("Missing the required parameter 'projectId' when calling delete(Async)");
        }
        
        // verify the required parameter 'buildId' is set
        if (buildId == null) {
            throw new QtestApiException("Missing the required parameter 'buildId' when calling delete(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteCall(projectId, buildId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes a Build
     * To delete a Build  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     * @param projectId ID of the project (required)
     * @param buildId ID of the Build to delete (required)
     * @return Object
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object delete(Long projectId, Long buildId) throws QtestApiException {
        ApiResponse<Object> resp = deleteWithHttpInfo(projectId, buildId);
        return resp.getData();
    }

    /**
     * Deletes a Build
     * To delete a Build  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     * @param projectId ID of the project (required)
     * @param buildId ID of the Build to delete (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> deleteWithHttpInfo(Long projectId, Long buildId) throws QtestApiException {
        com.squareup.okhttp.Call call = deleteValidateBeforeCall(projectId, buildId, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return qtestApiClient.execute(call, localVarReturnType);
    }

    /**
     * Deletes a Build (asynchronously)
     * To delete a Build  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     * @param projectId ID of the project (required)
     * @param buildId ID of the Build to delete (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QtestApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAsync(Long projectId, Long buildId, final ApiCallback<Object> callback) throws QtestApiException {

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

        com.squareup.okhttp.Call call = deleteValidateBeforeCall(projectId, buildId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        qtestApiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for get
     * @param projectId ID of the project (required)
     * @param buildId ID of the Build (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws QtestApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCall(Long projectId, Long buildId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v3/projects/{projectId}/builds/{buildId}"
            .replaceAll("\\{" + "projectId" + "\\}", qtestApiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "buildId" + "\\}", qtestApiClient.escapeString(buildId.toString()));

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
        return qtestApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getValidateBeforeCall(Long projectId, Long buildId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new QtestApiException("Missing the required parameter 'projectId' when calling get(Async)");
        }
        
        // verify the required parameter 'buildId' is set
        if (buildId == null) {
            throw new QtestApiException("Missing the required parameter 'buildId' when calling get(Async)");
        }
        

        com.squareup.okhttp.Call call = getCall(projectId, buildId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a Build
     * To retrieve a Build&lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     * @param projectId ID of the project (required)
     * @param buildId ID of the Build (required)
     * @return BuildResource
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BuildResource get(Long projectId, Long buildId) throws QtestApiException {
        ApiResponse<BuildResource> resp = getWithHttpInfo(projectId, buildId);
        return resp.getData();
    }

    /**
     * Gets a Build
     * To retrieve a Build&lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     * @param projectId ID of the project (required)
     * @param buildId ID of the Build (required)
     * @return ApiResponse&lt;BuildResource&gt;
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BuildResource> getWithHttpInfo(Long projectId, Long buildId) throws QtestApiException {
        com.squareup.okhttp.Call call = getValidateBeforeCall(projectId, buildId, null, null);
        Type localVarReturnType = new TypeToken<BuildResource>(){}.getType();
        return qtestApiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a Build (asynchronously)
     * To retrieve a Build&lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     * @param projectId ID of the project (required)
     * @param buildId ID of the Build (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QtestApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAsync(Long projectId, Long buildId, final ApiCallback<BuildResource> callback) throws QtestApiException {

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

        com.squareup.okhttp.Call call = getValidateBeforeCall(projectId, buildId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BuildResource>(){}.getType();
        qtestApiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getBuilds
     * @param projectId ID of the project (required)
     * @param releaseId ID of the parent Release (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws QtestApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBuildsCall(Long projectId, Long releaseId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v3/projects/{projectId}/builds"
            .replaceAll("\\{" + "projectId" + "\\}", qtestApiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (releaseId != null)
        localVarQueryParams.addAll(qtestApiClient.parameterToPair("releaseId", releaseId));

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
        return qtestApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBuildsValidateBeforeCall(Long projectId, Long releaseId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new QtestApiException("Missing the required parameter 'projectId' when calling getBuilds(Async)");
        }
        
        // verify the required parameter 'releaseId' is set
        if (releaseId == null) {
            throw new QtestApiException("Missing the required parameter 'releaseId' when calling getBuilds(Async)");
        }
        

        com.squareup.okhttp.Call call = getBuildsCall(projectId, releaseId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets multiple Builds
     * To retrieve all Builds under a Release  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     * @param projectId ID of the project (required)
     * @param releaseId ID of the parent Release (required)
     * @return List&lt;BuildResource&gt;
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<BuildResource> getBuilds(Long projectId, Long releaseId) throws QtestApiException {
        ApiResponse<List<BuildResource>> resp = getBuildsWithHttpInfo(projectId, releaseId);
        return resp.getData();
    }

    /**
     * Gets multiple Builds
     * To retrieve all Builds under a Release  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     * @param projectId ID of the project (required)
     * @param releaseId ID of the parent Release (required)
     * @return ApiResponse&lt;List&lt;BuildResource&gt;&gt;
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<BuildResource>> getBuildsWithHttpInfo(Long projectId, Long releaseId) throws QtestApiException {
        com.squareup.okhttp.Call call = getBuildsValidateBeforeCall(projectId, releaseId, null, null);
        Type localVarReturnType = new TypeToken<List<BuildResource>>(){}.getType();
        return qtestApiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets multiple Builds (asynchronously)
     * To retrieve all Builds under a Release  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     * @param projectId ID of the project (required)
     * @param releaseId ID of the parent Release (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QtestApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBuildsAsync(Long projectId, Long releaseId, final ApiCallback<List<BuildResource>> callback) throws QtestApiException {

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

        com.squareup.okhttp.Call call = getBuildsValidateBeforeCall(projectId, releaseId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<BuildResource>>(){}.getType();
        qtestApiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for update
     * @param projectId ID of the project (required)
     * @param buildId ID of the Build (required)
     * @param body The Build&#39;s updated properties (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws QtestApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCall(Long projectId, Long buildId, BuildResource body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/v3/projects/{projectId}/builds/{buildId}"
            .replaceAll("\\{" + "projectId" + "\\}", qtestApiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "buildId" + "\\}", qtestApiClient.escapeString(buildId.toString()));

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
        return qtestApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateValidateBeforeCall(Long projectId, Long buildId, BuildResource body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new QtestApiException("Missing the required parameter 'projectId' when calling update(Async)");
        }
        
        // verify the required parameter 'buildId' is set
        if (buildId == null) {
            throw new QtestApiException("Missing the required parameter 'buildId' when calling update(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new QtestApiException("Missing the required parameter 'body' when calling update(Async)");
        }
        

        com.squareup.okhttp.Call call = updateCall(projectId, buildId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates a Build
     * To update a Build  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     * @param projectId ID of the project (required)
     * @param buildId ID of the Build (required)
     * @param body The Build&#39;s updated properties (required)
     * @return BuildResource
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BuildResource update(Long projectId, Long buildId, BuildResource body) throws QtestApiException {
        ApiResponse<BuildResource> resp = updateWithHttpInfo(projectId, buildId, body);
        return resp.getData();
    }

    /**
     * Updates a Build
     * To update a Build  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     * @param projectId ID of the project (required)
     * @param buildId ID of the Build (required)
     * @param body The Build&#39;s updated properties (required)
     * @return ApiResponse&lt;BuildResource&gt;
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BuildResource> updateWithHttpInfo(Long projectId, Long buildId, BuildResource body) throws QtestApiException {
        com.squareup.okhttp.Call call = updateValidateBeforeCall(projectId, buildId, body, null, null);
        Type localVarReturnType = new TypeToken<BuildResource>(){}.getType();
        return qtestApiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Build (asynchronously)
     * To update a Build  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     * @param projectId ID of the project (required)
     * @param buildId ID of the Build (required)
     * @param body The Build&#39;s updated properties (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QtestApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAsync(Long projectId, Long buildId, BuildResource body, final ApiCallback<BuildResource> callback) throws QtestApiException {

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

        com.squareup.okhttp.Call call = updateValidateBeforeCall(projectId, buildId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BuildResource>(){}.getType();
        qtestApiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
