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
import com.neotys.qtest.api.client.model.OAuthResponse;
import com.neotys.qtest.api.client.QtestApiClient;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginApi {
    private QtestApiClient qtestApiClient;

    public LoginApi() {
        this(Configuration.getDefaultQtestApiClient());
    }

    public LoginApi(QtestApiClient qtestApiClient) {
        this.qtestApiClient = qtestApiClient;
    }

    public QtestApiClient getQtestApiClient() {
        return qtestApiClient;
    }

    public void setQtestApiClient(QtestApiClient qtestApiClient) {
        this.qtestApiClient = qtestApiClient;
    }

    /**
     * Build call for postAccessToken
     * @param grantType always use &lt;em&gt;grant_type&#x3D;password&lt;/em&gt; (optional, default to password)
     * @param username Your qTest Manager username (optional)
     * @param password Your qTest Manager password (optional)
     * @param authorization Basic + [base64 string of \&quot;&lt;strong&gt;your qTest site name and colon&lt;/strong&gt;\&quot;]  Example: qTest Manager site is: apitryout.qtestnet.com then site name is: apitryout + &#39;:&#39;, then Authorization is: Basic YXBpdHJ5b3V0Og&#x3D;&#x3D; (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws QtestApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postAccessTokenCall(String grantType, String username, String password, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/oauth/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", qtestApiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (grantType != null)
        localVarFormParams.put("grant_type", grantType);
        if (username != null)
        localVarFormParams.put("username", username);
        if (password != null)
        localVarFormParams.put("password", password);

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = qtestApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
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

        String[] localVarAuthNames = new String[] {  };
        return qtestApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postAccessTokenValidateBeforeCall(String grantType, String username, String password, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        

        com.squareup.okhttp.Call call = postAccessTokenCall(grantType, username, password, authorization, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Log in
     * To authenticate the API client against qTest Manager and acquire authorized access token.    Note: Please choose parameter &lt;em&gt;content-type&#x3D;application/x-www-form-urlencoded&lt;/em&gt;
     * @param grantType always use &lt;em&gt;grant_type&#x3D;password&lt;/em&gt; (optional, default to password)
     * @param username Your qTest Manager username (optional)
     * @param password Your qTest Manager password (optional)
     * @param authorization Basic + [base64 string of \&quot;&lt;strong&gt;your qTest site name and colon&lt;/strong&gt;\&quot;]  Example: qTest Manager site is: apitryout.qtestnet.com then site name is: apitryout + &#39;:&#39;, then Authorization is: Basic YXBpdHJ5b3V0Og&#x3D;&#x3D; (optional)
     * @return OAuthResponse
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OAuthResponse postAccessToken(String grantType, String username, String password, String authorization) throws QtestApiException {
        ApiResponse<OAuthResponse> resp = postAccessTokenWithHttpInfo(grantType, username, password, authorization);
        return resp.getData();
    }

    /**
     * Log in
     * To authenticate the API client against qTest Manager and acquire authorized access token.    Note: Please choose parameter &lt;em&gt;content-type&#x3D;application/x-www-form-urlencoded&lt;/em&gt;
     * @param grantType always use &lt;em&gt;grant_type&#x3D;password&lt;/em&gt; (optional, default to password)
     * @param username Your qTest Manager username (optional)
     * @param password Your qTest Manager password (optional)
     * @param authorization Basic + [base64 string of \&quot;&lt;strong&gt;your qTest site name and colon&lt;/strong&gt;\&quot;]  Example: qTest Manager site is: apitryout.qtestnet.com then site name is: apitryout + &#39;:&#39;, then Authorization is: Basic YXBpdHJ5b3V0Og&#x3D;&#x3D; (optional)
     * @return ApiResponse&lt;OAuthResponse&gt;
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OAuthResponse> postAccessTokenWithHttpInfo(String grantType, String username, String password, String authorization) throws QtestApiException {
        com.squareup.okhttp.Call call = postAccessTokenValidateBeforeCall(grantType, username, password, authorization, null, null);
        Type localVarReturnType = new TypeToken<OAuthResponse>(){}.getType();
        return qtestApiClient.execute(call, localVarReturnType);
    }

    /**
     * Log in (asynchronously)
     * To authenticate the API client against qTest Manager and acquire authorized access token.    Note: Please choose parameter &lt;em&gt;content-type&#x3D;application/x-www-form-urlencoded&lt;/em&gt;
     * @param grantType always use &lt;em&gt;grant_type&#x3D;password&lt;/em&gt; (optional, default to password)
     * @param username Your qTest Manager username (optional)
     * @param password Your qTest Manager password (optional)
     * @param authorization Basic + [base64 string of \&quot;&lt;strong&gt;your qTest site name and colon&lt;/strong&gt;\&quot;]  Example: qTest Manager site is: apitryout.qtestnet.com then site name is: apitryout + &#39;:&#39;, then Authorization is: Basic YXBpdHJ5b3V0Og&#x3D;&#x3D; (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QtestApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postAccessTokenAsync(String grantType, String username, String password, String authorization, final ApiCallback<OAuthResponse> callback) throws QtestApiException {

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

        com.squareup.okhttp.Call call = postAccessTokenValidateBeforeCall(grantType, username, password, authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OAuthResponse>(){}.getType();
        qtestApiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}