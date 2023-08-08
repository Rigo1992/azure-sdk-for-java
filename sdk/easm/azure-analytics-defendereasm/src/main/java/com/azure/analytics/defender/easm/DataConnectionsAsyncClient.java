// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.defender.easm;

import com.azure.analytics.defender.easm.implementation.DataConnectionsImpl;
import com.azure.analytics.defender.easm.models.DataConnection;
import com.azure.analytics.defender.easm.models.DataConnectionData;
import com.azure.analytics.defender.easm.models.DataConnectionPageResponse;
import com.azure.analytics.defender.easm.models.ValidateResponse;
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
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous EasmDefenderClient type. */
@ServiceClient(builder = EasmDefenderClientBuilder.class, isAsync = true)
public final class DataConnectionsAsyncClient {
    @Generated private final DataConnectionsImpl serviceClient;

    /**
     * Initializes an instance of DataConnectionsAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    DataConnectionsAsyncClient(DataConnectionsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Retrieve a list of data connections.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
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
     *             content: String(assets/attackSurfaceInsights) (Optional)
     *             createdDate: OffsetDateTime (Optional)
     *             frequency: String(daily/weekly/monthly) (Optional)
     *             frequencyOffset: Integer (Optional)
     *             updatedDate: OffsetDateTime (Optional)
     *             userUpdatedAt: OffsetDateTime (Optional)
     *             active: Boolean (Optional)
     *             inactiveMessage: String (Optional)
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
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.listWithResponseAsync(requestOptions);
    }

    /**
     * Validate a data connection with a given dataConnectionName.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Optional)
     *     content: String(assets/attackSurfaceInsights) (Optional)
     *     frequency: String(daily/weekly/monthly) (Optional)
     *     frequencyOffset: Integer (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     error (Optional): {
     *         code: String (Required)
     *         message: String (Required)
     *         target: String (Optional)
     *         details (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         innererror (Optional): {
     *             code: String (Optional)
     *             value: Object (Optional)
     *         }
     *     }
     * }
     * }</pre>
     *
     * @param dataConnectionData The dataConnectionData parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> validateWithResponse(
            BinaryData dataConnectionData, RequestOptions requestOptions) {
        return this.serviceClient.validateWithResponseAsync(dataConnectionData, requestOptions);
    }

    /**
     * Retrieve a data connection with a given dataConnectionName.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Optional)
     *     name: String (Required)
     *     displayName: String (Optional)
     *     content: String(assets/attackSurfaceInsights) (Optional)
     *     createdDate: OffsetDateTime (Optional)
     *     frequency: String(daily/weekly/monthly) (Optional)
     *     frequencyOffset: Integer (Optional)
     *     updatedDate: OffsetDateTime (Optional)
     *     userUpdatedAt: OffsetDateTime (Optional)
     *     active: Boolean (Optional)
     *     inactiveMessage: String (Optional)
     * }
     * }</pre>
     *
     * @param dataConnectionName The caller provided unique name for the resource.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(String dataConnectionName, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(dataConnectionName, requestOptions);
    }

    /**
     * Create or update a data connection with a given dataConnectionName.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Optional)
     *     content: String(assets/attackSurfaceInsights) (Optional)
     *     frequency: String(daily/weekly/monthly) (Optional)
     *     frequencyOffset: Integer (Optional)
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
     *     content: String(assets/attackSurfaceInsights) (Optional)
     *     createdDate: OffsetDateTime (Optional)
     *     frequency: String(daily/weekly/monthly) (Optional)
     *     frequencyOffset: Integer (Optional)
     *     updatedDate: OffsetDateTime (Optional)
     *     userUpdatedAt: OffsetDateTime (Optional)
     *     active: Boolean (Optional)
     *     inactiveMessage: String (Optional)
     * }
     * }</pre>
     *
     * @param dataConnectionName The caller provided unique name for the resource.
     * @param dataConnectionData The dataConnectionData parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> putWithResponse(
            String dataConnectionName, BinaryData dataConnectionData, RequestOptions requestOptions) {
        return this.serviceClient.putWithResponseAsync(dataConnectionName, dataConnectionData, requestOptions);
    }

    /**
     * Delete a data connection with a given dataConnectionName.
     *
     * @param dataConnectionName The caller provided unique name for the resource.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse(String dataConnectionName, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponseAsync(dataConnectionName, requestOptions);
    }

    /**
     * Retrieve a list of data connections.
     *
     * @param skip The number of result items to skip.
     * @param maxPageSize The maximum number of result items per page.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataConnectionPageResponse> list(Integer skip, Integer maxPageSize) {
        // Generated convenience method for listWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (skip != null) {
            requestOptions.addQueryParam("skip", String.valueOf(skip), false);
        }
        if (maxPageSize != null) {
            requestOptions.addQueryParam("maxpagesize", String.valueOf(maxPageSize), false);
        }
        return listWithResponse(requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(DataConnectionPageResponse.class));
    }

    /**
     * Retrieve a list of data connections.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataConnectionPageResponse> list() {
        // Generated convenience method for listWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return listWithResponse(requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(DataConnectionPageResponse.class));
    }

    /**
     * Validate a data connection with a given dataConnectionName.
     *
     * @param dataConnectionData The dataConnectionData parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ValidateResponse> validate(DataConnectionData dataConnectionData) {
        // Generated convenience method for validateWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return validateWithResponse(BinaryData.fromObject(dataConnectionData), requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(ValidateResponse.class));
    }

    /**
     * Retrieve a data connection with a given dataConnectionName.
     *
     * @param dataConnectionName The caller provided unique name for the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataConnection> get(String dataConnectionName) {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getWithResponse(dataConnectionName, requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(DataConnection.class));
    }

    /**
     * Create or update a data connection with a given dataConnectionName.
     *
     * @param dataConnectionName The caller provided unique name for the resource.
     * @param dataConnectionData The dataConnectionData parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataConnection> put(String dataConnectionName, DataConnectionData dataConnectionData) {
        // Generated convenience method for putWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return putWithResponse(dataConnectionName, BinaryData.fromObject(dataConnectionData), requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(DataConnection.class));
    }

    /**
     * Delete a data connection with a given dataConnectionName.
     *
     * @param dataConnectionName The caller provided unique name for the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String dataConnectionName) {
        // Generated convenience method for deleteWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return deleteWithResponse(dataConnectionName, requestOptions).flatMap(FluxUtil::toMono);
    }
}
