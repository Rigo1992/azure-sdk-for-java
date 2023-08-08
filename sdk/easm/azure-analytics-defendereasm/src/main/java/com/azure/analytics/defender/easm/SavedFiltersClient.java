// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.defender.easm;

import com.azure.analytics.defender.easm.implementation.SavedFiltersImpl;
import com.azure.analytics.defender.easm.models.SavedFilter;
import com.azure.analytics.defender.easm.models.SavedFilterData;
import com.azure.analytics.defender.easm.models.SavedFilterPageResponse;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous EasmDefenderClient type. */
@ServiceClient(builder = EasmDefenderClientBuilder.class)
public final class SavedFiltersClient {
    @Generated private final SavedFiltersImpl serviceClient;

    /**
     * Initializes an instance of SavedFiltersClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    SavedFiltersClient(SavedFiltersImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Retrieve a list of saved filters for the provided search parameters.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>Filter the result list using the given expression.</td></tr>
     *     <tr><td>skip</td><td>Integer</td><td>No</td><td>The number of result items to skip.</td></tr>
     *     <tr><td>maxpagesize</td><td>Integer</td><td>No</td><td>The maximum number of result items per page.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     totalElements: Long (Optional)
     *     nextLink: String (Optional)
     *     value (Optional): [
     *          (Optional){
     *             id: String (Optional)
     *             name: String (Required)
     *             displayName: String (Optional)
     *             filter: String (Optional)
     *             description: String (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> listWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.listWithResponse(requestOptions);
    }

    /**
     * Retrieve a saved filter by filterName.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Optional)
     *     name: String (Required)
     *     displayName: String (Optional)
     *     filter: String (Optional)
     *     description: String (Optional)
     * }
     * }</pre>
     *
     * @param filterName The caller provided unique name for the resource.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String filterName, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponse(filterName, requestOptions);
    }

    /**
     * Create or update a saved filter with a given filterName.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     filter: String (Required)
     *     description: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Optional)
     *     name: String (Required)
     *     displayName: String (Optional)
     *     filter: String (Optional)
     *     description: String (Optional)
     * }
     * }</pre>
     *
     * @param filterName The caller provided unique name for the resource.
     * @param savedFilterData A request body used to create a saved filter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> putWithResponse(
            String filterName, BinaryData savedFilterData, RequestOptions requestOptions) {
        return this.serviceClient.putWithResponse(filterName, savedFilterData, requestOptions);
    }

    /**
     * Delete a saved filter with a given filterName.
     *
     * @param filterName The caller provided unique name for the resource.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String filterName, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponse(filterName, requestOptions);
    }

    /**
     * Retrieve a list of saved filters for the provided search parameters.
     *
     * @param filter Filter the result list using the given expression.
     * @param skip The number of result items to skip.
     * @param maxPageSize The maximum number of result items per page.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SavedFilterPageResponse list(String filter, Integer skip, Integer maxPageSize) {
        // Generated convenience method for listWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (filter != null) {
            requestOptions.addQueryParam("filter", filter, false);
        }
        if (skip != null) {
            requestOptions.addQueryParam("skip", String.valueOf(skip), false);
        }
        if (maxPageSize != null) {
            requestOptions.addQueryParam("maxpagesize", String.valueOf(maxPageSize), false);
        }
        return cleanUp(listWithResponse(requestOptions).getValue()).toObject(SavedFilterPageResponse.class);
    }

    /**
     * Retrieve a list of saved filters for the provided search parameters.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SavedFilterPageResponse list() {
        // Generated convenience method for listWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return cleanUp(listWithResponse(requestOptions).getValue()).toObject(SavedFilterPageResponse.class);
    }

    /**
     * Retrieve a saved filter by filterName.
     *
     * @param filterName The caller provided unique name for the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SavedFilter get(String filterName) {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return cleanUp(getWithResponse(filterName, requestOptions).getValue()).toObject(SavedFilter.class);
    }

    /**
     * Create or update a saved filter with a given filterName.
     *
     * @param filterName The caller provided unique name for the resource.
     * @param savedFilterData A request body used to create a saved filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SavedFilter put(String filterName, SavedFilterData savedFilterData) {
        // Generated convenience method for putWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return cleanUp(putWithResponse(filterName, BinaryData.fromObject(savedFilterData), requestOptions)
                .getValue())
                .toObject(SavedFilter.class);
    }

    /**
     * Delete a saved filter with a given filterName.
     *
     * @param filterName The caller provided unique name for the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String filterName) {
        // Generated convenience method for deleteWithResponse
        RequestOptions requestOptions = new RequestOptions();
        deleteWithResponse(filterName, requestOptions).getValue();
    }

    private BinaryData cleanUp(BinaryData input){
        return BinaryData.fromString(input.toString().replaceAll("\\+0000", "+00:00"));
    }
}
