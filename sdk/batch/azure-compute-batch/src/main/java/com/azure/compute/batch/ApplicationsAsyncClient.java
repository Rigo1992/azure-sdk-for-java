// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch;

import com.azure.compute.batch.implementation.ApplicationsImpl;
import com.azure.compute.batch.models.Application;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.FluxUtil;
import java.util.stream.Collectors;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous BatchServiceClient type. */
@ServiceClient(builder = BatchServiceClientBuilder.class, isAsync = true)
public final class ApplicationsAsyncClient {
    @Generated private final ApplicationsImpl serviceClient;

    /**
     * Initializes an instance of ApplicationsAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    ApplicationsAsyncClient(ApplicationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists all of the applications available in the specified Account.
     *
     * <p>This operation returns only Applications and versions that are available for use on Compute Nodes; that is,
     * that can be used in an Package reference. For administrator information about applications and versions that are
     * not yet available to Compute Nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>maxresults</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     *     <tr><td>timeOut</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>ocp-date</td><td>String</td><td>No</td><td>The time the request was issued. Client libraries typically set this to the
     * current system clock time; set it explicitly if you are calling the REST API
     * directly.</td></tr>
     *     <tr><td>client-request-id</td><td>String</td><td>No</td><td>The caller-generated request identity, in the form of a GUID with no decoration
     * such as curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.</td></tr>
     *     <tr><td>return-client-request-id</td><td>Boolean</td><td>No</td><td>Whether the server should return the client-request-id in the response.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     displayName: String (Required)
     *     versions (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of listing the applications available in an Account as paginated response with {@link
     *     PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> list(RequestOptions requestOptions) {
        return this.serviceClient.listAsync(requestOptions);
    }

    /**
     * Gets information about the specified Application.
     *
     * <p>This operation returns only Applications and versions that are available for use on Compute Nodes; that is,
     * that can be used in an Package reference. For administrator information about Applications and versions that are
     * not yet available to Compute Nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     displayName: String (Required)
     *     versions (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param applicationId A string that uniquely identifies the application within the Account.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return contains information about an application in an Azure Batch Account along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(String applicationId, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(applicationId, requestOptions);
    }

    /**
     * Lists all of the applications available in the specified Account.
     *
     * <p>This operation returns only Applications and versions that are available for use on Compute Nodes; that is,
     * that can be used in an Package reference. For administrator information about applications and versions that are
     * not yet available to Compute Nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @param maxresults The maximum number of items to return in the response. A maximum of 1000 applications can be
     *     returned.
     * @param ocpDate The time the request was issued. Client libraries typically set this to the current system clock
     *     time; set it explicitly if you are calling the REST API directly.
     * @param timeOut The maximum number of items to return in the response. A maximum of 1000 applications can be
     *     returned.
     * @param clientRequestId The caller-generated request identity, in the form of a GUID with no decoration such as
     *     curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     * @param returnClientRequestId Whether the server should return the client-request-id in the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of listing the applications available in an Account as paginated response with {@link
     *     PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<Application> list(
            Integer maxresults,
            String ocpDate,
            Integer timeOut,
            String clientRequestId,
            Boolean returnClientRequestId) {
        // Generated convenience method for list
        RequestOptions requestOptions = new RequestOptions();
        if (maxresults != null) {
            requestOptions.addQueryParam("maxresults", String.valueOf(maxresults), false);
        }
        if (ocpDate != null) {
            requestOptions.setHeader("ocp-date", ocpDate);
        }
        if (timeOut != null) {
            requestOptions.addQueryParam("timeOut", String.valueOf(timeOut), false);
        }
        if (clientRequestId != null) {
            requestOptions.setHeader("client-request-id", clientRequestId);
        }
        if (returnClientRequestId != null) {
            requestOptions.setHeader("return-client-request-id", String.valueOf(returnClientRequestId));
        }
        PagedFlux<BinaryData> pagedFluxResponse = list(requestOptions);
        return PagedFlux.create(
                () ->
                        (continuationToken, pageSize) -> {
                            Flux<PagedResponse<BinaryData>> flux =
                                    (continuationToken == null)
                                            ? pagedFluxResponse.byPage().take(1)
                                            : pagedFluxResponse.byPage(continuationToken).take(1);
                            return flux.map(
                                    pagedResponse ->
                                            new PagedResponseBase<Void, Application>(
                                                    pagedResponse.getRequest(),
                                                    pagedResponse.getStatusCode(),
                                                    pagedResponse.getHeaders(),
                                                    pagedResponse.getValue().stream()
                                                            .map(
                                                                    protocolMethodData ->
                                                                            protocolMethodData.toObject(
                                                                                    Application.class))
                                                            .collect(Collectors.toList()),
                                                    pagedResponse.getContinuationToken(),
                                                    null));
                        });
    }

    /**
     * Lists all of the applications available in the specified Account.
     *
     * <p>This operation returns only Applications and versions that are available for use on Compute Nodes; that is,
     * that can be used in an Package reference. For administrator information about applications and versions that are
     * not yet available to Compute Nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of listing the applications available in an Account as paginated response with {@link
     *     PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<Application> list() {
        // Generated convenience method for list
        RequestOptions requestOptions = new RequestOptions();
        PagedFlux<BinaryData> pagedFluxResponse = list(requestOptions);
        return PagedFlux.create(
                () ->
                        (continuationToken, pageSize) -> {
                            Flux<PagedResponse<BinaryData>> flux =
                                    (continuationToken == null)
                                            ? pagedFluxResponse.byPage().take(1)
                                            : pagedFluxResponse.byPage(continuationToken).take(1);
                            return flux.map(
                                    pagedResponse ->
                                            new PagedResponseBase<Void, Application>(
                                                    pagedResponse.getRequest(),
                                                    pagedResponse.getStatusCode(),
                                                    pagedResponse.getHeaders(),
                                                    pagedResponse.getValue().stream()
                                                            .map(
                                                                    protocolMethodData ->
                                                                            protocolMethodData.toObject(
                                                                                    Application.class))
                                                            .collect(Collectors.toList()),
                                                    pagedResponse.getContinuationToken(),
                                                    null));
                        });
    }

    /**
     * Gets information about the specified Application.
     *
     * <p>This operation returns only Applications and versions that are available for use on Compute Nodes; that is,
     * that can be used in an Package reference. For administrator information about Applications and versions that are
     * not yet available to Compute Nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * @param applicationId A string that uniquely identifies the application within the Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about an application in an Azure Batch Account on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Application> get(String applicationId) {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getWithResponse(applicationId, requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(Application.class));
    }
}
