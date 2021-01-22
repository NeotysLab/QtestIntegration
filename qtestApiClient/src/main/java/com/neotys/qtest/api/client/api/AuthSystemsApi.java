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
import com.neotys.qtest.api.client.model.AuthSystemResponse;
import com.neotys.qtest.api.client.model.LDAPUsersResponse;
import com.neotys.qtest.api.client.model.LdapUserResource;
import com.neotys.qtest.api.client.model.ResponseWrapper;
import com.neotys.qtest.api.client.QtestApiClient;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthSystemsApi {
    private QtestApiClient qtestApiClient;

    public AuthSystemsApi() {
        this(Configuration.getDefaultQtestApiClient());
    }

    public AuthSystemsApi(QtestApiClient qtestApiClient) {
        this.qtestApiClient = qtestApiClient;
    }

    public QtestApiClient getQtestApiClient() {
        return qtestApiClient;
    }

    public void setQtestApiClient(QtestApiClient qtestApiClient) {
        this.qtestApiClient = qtestApiClient;
    }

    /**
     * Build call for getAll
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws QtestApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v3/auth-systems";

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
    private com.squareup.okhttp.Call getAllValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        

        com.squareup.okhttp.Call call = getAllCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get multiple Authentication Systems
     * To get multiple Authentication Systems
     * @return AuthSystemResponse
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AuthSystemResponse getAll() throws QtestApiException {
        ApiResponse<AuthSystemResponse> resp = getAllWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get multiple Authentication Systems
     * To get multiple Authentication Systems
     * @return ApiResponse&lt;AuthSystemResponse&gt;
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AuthSystemResponse> getAllWithHttpInfo() throws QtestApiException {
        com.squareup.okhttp.Call call = getAllValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<AuthSystemResponse>(){}.getType();
        return qtestApiClient.execute(call, localVarReturnType);
    }

    /**
     * Get multiple Authentication Systems (asynchronously)
     * To get multiple Authentication Systems
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QtestApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllAsync(final ApiCallback<AuthSystemResponse> callback) throws QtestApiException {

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

        com.squareup.okhttp.Call call = getAllValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AuthSystemResponse>(){}.getType();
        qtestApiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllLdapUsers
     * @param ldapAuthConfigId Id of the Authentication config (required)
     * @param pageSize Number of of item count per page. If this &lt;strong&gt;pageSize&lt;/strong&gt; and &lt;strong&gt;page&lt;/strong&gt; is omitted, all users will be returned without any default paging data. (optional, default to 100)
     * @param page Page number that you want to get the result. If this &lt;strong&gt;pageSize&lt;/strong&gt; and &lt;strong&gt;page&lt;/strong&gt; is omitted, all users will be returned without any default paging data. (optional, default to 1)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws QtestApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllLdapUsersCall(Long ldapAuthConfigId, Long pageSize, Long page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v3/auth-systems/ldap/{ldapAuthConfigId}/users"
            .replaceAll("\\{" + "ldapAuthConfigId" + "\\}", qtestApiClient.escapeString(ldapAuthConfigId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pageSize != null)
        localVarQueryParams.addAll(qtestApiClient.parameterToPair("pageSize", pageSize));
        if (page != null)
        localVarQueryParams.addAll(qtestApiClient.parameterToPair("page", page));

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
    private com.squareup.okhttp.Call getAllLdapUsersValidateBeforeCall(Long ldapAuthConfigId, Long pageSize, Long page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        
        // verify the required parameter 'ldapAuthConfigId' is set
        if (ldapAuthConfigId == null) {
            throw new QtestApiException("Missing the required parameter 'ldapAuthConfigId' when calling getAllLdapUsers(Async)");
        }
        

        com.squareup.okhttp.Call call = getAllLdapUsersCall(ldapAuthConfigId, pageSize, page, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all LDAP users of an authentication LDAP config
     * Get all LDAP users of an authentication LDAP config with pagination supported. Users are mapped with qTest users won&#39;t be returned.  If &lt;strong&gt;pageSize&lt;/strong&gt; and &lt;strong&gt;page&lt;/strong&gt; is omitted, all users will be returned without any default paging data.
     * @param ldapAuthConfigId Id of the Authentication config (required)
     * @param pageSize Number of of item count per page. If this &lt;strong&gt;pageSize&lt;/strong&gt; and &lt;strong&gt;page&lt;/strong&gt; is omitted, all users will be returned without any default paging data. (optional, default to 100)
     * @param page Page number that you want to get the result. If this &lt;strong&gt;pageSize&lt;/strong&gt; and &lt;strong&gt;page&lt;/strong&gt; is omitted, all users will be returned without any default paging data. (optional, default to 1)
     * @return LDAPUsersResponse
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LDAPUsersResponse getAllLdapUsers(Long ldapAuthConfigId, Long pageSize, Long page) throws QtestApiException {
        ApiResponse<LDAPUsersResponse> resp = getAllLdapUsersWithHttpInfo(ldapAuthConfigId, pageSize, page);
        return resp.getData();
    }

    /**
     * Get all LDAP users of an authentication LDAP config
     * Get all LDAP users of an authentication LDAP config with pagination supported. Users are mapped with qTest users won&#39;t be returned.  If &lt;strong&gt;pageSize&lt;/strong&gt; and &lt;strong&gt;page&lt;/strong&gt; is omitted, all users will be returned without any default paging data.
     * @param ldapAuthConfigId Id of the Authentication config (required)
     * @param pageSize Number of of item count per page. If this &lt;strong&gt;pageSize&lt;/strong&gt; and &lt;strong&gt;page&lt;/strong&gt; is omitted, all users will be returned without any default paging data. (optional, default to 100)
     * @param page Page number that you want to get the result. If this &lt;strong&gt;pageSize&lt;/strong&gt; and &lt;strong&gt;page&lt;/strong&gt; is omitted, all users will be returned without any default paging data. (optional, default to 1)
     * @return ApiResponse&lt;LDAPUsersResponse&gt;
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LDAPUsersResponse> getAllLdapUsersWithHttpInfo(Long ldapAuthConfigId, Long pageSize, Long page) throws QtestApiException {
        com.squareup.okhttp.Call call = getAllLdapUsersValidateBeforeCall(ldapAuthConfigId, pageSize, page, null, null);
        Type localVarReturnType = new TypeToken<LDAPUsersResponse>(){}.getType();
        return qtestApiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all LDAP users of an authentication LDAP config (asynchronously)
     * Get all LDAP users of an authentication LDAP config with pagination supported. Users are mapped with qTest users won&#39;t be returned.  If &lt;strong&gt;pageSize&lt;/strong&gt; and &lt;strong&gt;page&lt;/strong&gt; is omitted, all users will be returned without any default paging data.
     * @param ldapAuthConfigId Id of the Authentication config (required)
     * @param pageSize Number of of item count per page. If this &lt;strong&gt;pageSize&lt;/strong&gt; and &lt;strong&gt;page&lt;/strong&gt; is omitted, all users will be returned without any default paging data. (optional, default to 100)
     * @param page Page number that you want to get the result. If this &lt;strong&gt;pageSize&lt;/strong&gt; and &lt;strong&gt;page&lt;/strong&gt; is omitted, all users will be returned without any default paging data. (optional, default to 1)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QtestApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllLdapUsersAsync(Long ldapAuthConfigId, Long pageSize, Long page, final ApiCallback<LDAPUsersResponse> callback) throws QtestApiException {

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

        com.squareup.okhttp.Call call = getAllLdapUsersValidateBeforeCall(ldapAuthConfigId, pageSize, page, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LDAPUsersResponse>(){}.getType();
        qtestApiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for importLDapUsers
     * @param ldapAuthConfigId Id of the Authentication config (required)
     * @param body  (required)
     * @param mergeUser Option to merge LDAP account to qTest account if qTest email already exists in qTest (support true/false value, &lt;strong&gt;default &#x3D; false&lt;/strong&gt;) (optional)
     * @param mergeUser2 Option to merge LDAP account to qTest account if qTest email already exists in qTest (support true/false value, &lt;strong&gt;default &#x3D; false&lt;/strong&gt;) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws QtestApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call importLDapUsersCall(Long ldapAuthConfigId, List<LdapUserResource> body, Boolean mergeUser, String mergeUser2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/v3/auth-systems/ldap/{ldapAuthConfigId}/import"
            .replaceAll("\\{" + "ldapAuthConfigId" + "\\}", qtestApiClient.escapeString(ldapAuthConfigId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (mergeUser != null)
        localVarQueryParams.addAll(qtestApiClient.parameterToPair("mergeUser", mergeUser));
        if (mergeUser2 != null)
        localVarQueryParams.addAll(qtestApiClient.parameterToPair("mergeUser", mergeUser2));

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
    private com.squareup.okhttp.Call importLDapUsersValidateBeforeCall(Long ldapAuthConfigId, List<LdapUserResource> body, Boolean mergeUser, String mergeUser2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws QtestApiException {
        
        // verify the required parameter 'ldapAuthConfigId' is set
        if (ldapAuthConfigId == null) {
            throw new QtestApiException("Missing the required parameter 'ldapAuthConfigId' when calling importLDapUsers(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new QtestApiException("Missing the required parameter 'body' when calling importLDapUsers(Async)");
        }
        

        com.squareup.okhttp.Call call = importLDapUsersCall(ldapAuthConfigId, body, mergeUser, mergeUser2, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Associate Manager users with LDAP users
     * Associate Manager users with LDAP users authentication LDAP config
     * @param ldapAuthConfigId Id of the Authentication config (required)
     * @param body  (required)
     * @param mergeUser Option to merge LDAP account to qTest account if qTest email already exists in qTest (support true/false value, &lt;strong&gt;default &#x3D; false&lt;/strong&gt;) (optional)
     * @param mergeUser2 Option to merge LDAP account to qTest account if qTest email already exists in qTest (support true/false value, &lt;strong&gt;default &#x3D; false&lt;/strong&gt;) (optional)
     * @return ResponseWrapper
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseWrapper importLDapUsers(Long ldapAuthConfigId, List<LdapUserResource> body, Boolean mergeUser, String mergeUser2) throws QtestApiException {
        ApiResponse<ResponseWrapper> resp = importLDapUsersWithHttpInfo(ldapAuthConfigId, body, mergeUser, mergeUser2);
        return resp.getData();
    }

    /**
     * Associate Manager users with LDAP users
     * Associate Manager users with LDAP users authentication LDAP config
     * @param ldapAuthConfigId Id of the Authentication config (required)
     * @param body  (required)
     * @param mergeUser Option to merge LDAP account to qTest account if qTest email already exists in qTest (support true/false value, &lt;strong&gt;default &#x3D; false&lt;/strong&gt;) (optional)
     * @param mergeUser2 Option to merge LDAP account to qTest account if qTest email already exists in qTest (support true/false value, &lt;strong&gt;default &#x3D; false&lt;/strong&gt;) (optional)
     * @return ApiResponse&lt;ResponseWrapper&gt;
     * @throws QtestApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseWrapper> importLDapUsersWithHttpInfo(Long ldapAuthConfigId, List<LdapUserResource> body, Boolean mergeUser, String mergeUser2) throws QtestApiException {
        com.squareup.okhttp.Call call = importLDapUsersValidateBeforeCall(ldapAuthConfigId, body, mergeUser, mergeUser2, null, null);
        Type localVarReturnType = new TypeToken<ResponseWrapper>(){}.getType();
        return qtestApiClient.execute(call, localVarReturnType);
    }

    /**
     * Associate Manager users with LDAP users (asynchronously)
     * Associate Manager users with LDAP users authentication LDAP config
     * @param ldapAuthConfigId Id of the Authentication config (required)
     * @param body  (required)
     * @param mergeUser Option to merge LDAP account to qTest account if qTest email already exists in qTest (support true/false value, &lt;strong&gt;default &#x3D; false&lt;/strong&gt;) (optional)
     * @param mergeUser2 Option to merge LDAP account to qTest account if qTest email already exists in qTest (support true/false value, &lt;strong&gt;default &#x3D; false&lt;/strong&gt;) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QtestApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call importLDapUsersAsync(Long ldapAuthConfigId, List<LdapUserResource> body, Boolean mergeUser, String mergeUser2, final ApiCallback<ResponseWrapper> callback) throws QtestApiException {

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

        com.squareup.okhttp.Call call = importLDapUsersValidateBeforeCall(ldapAuthConfigId, body, mergeUser, mergeUser2, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseWrapper>(){}.getType();
        qtestApiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}