// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.loganalytics.fluent.OperationStatusesClient;
import com.azure.resourcemanager.loganalytics.fluent.models.OperationStatusInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in OperationStatusesClient. */
public final class OperationStatusesClientImpl implements OperationStatusesClient {
    /** The proxy service used to perform REST calls. */
    private final OperationStatusesService service;

    /** The service client containing this operation class. */
    private final OperationalInsightsManagementClientImpl client;

    /**
     * Initializes an instance of OperationStatusesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    OperationStatusesClientImpl(OperationalInsightsManagementClientImpl client) {
        this.service =
            RestProxy.create(OperationStatusesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for OperationalInsightsManagementClientOperationStatuses to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "OperationalInsightsM")
    private interface OperationStatusesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.OperationalInsights/locations/{location}"
                + "/operationStatuses/{asyncOperationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OperationStatusInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @PathParam("asyncOperationId") String asyncOperationId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get the status of a long running azure asynchronous operation.
     *
     * @param location The region name of operation.
     * @param asyncOperationId The operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a long running azure asynchronous operation along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OperationStatusInner>> getWithResponseAsync(String location, String asyncOperationId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (asyncOperationId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter asyncOperationId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-08-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            location,
                            asyncOperationId,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the status of a long running azure asynchronous operation.
     *
     * @param location The region name of operation.
     * @param asyncOperationId The operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a long running azure asynchronous operation along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OperationStatusInner>> getWithResponseAsync(
        String location, String asyncOperationId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (asyncOperationId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter asyncOperationId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-08-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                location,
                asyncOperationId,
                apiVersion,
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Get the status of a long running azure asynchronous operation.
     *
     * @param location The region name of operation.
     * @param asyncOperationId The operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a long running azure asynchronous operation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationStatusInner> getAsync(String location, String asyncOperationId) {
        return getWithResponseAsync(location, asyncOperationId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get the status of a long running azure asynchronous operation.
     *
     * @param location The region name of operation.
     * @param asyncOperationId The operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a long running azure asynchronous operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationStatusInner get(String location, String asyncOperationId) {
        return getAsync(location, asyncOperationId).block();
    }

    /**
     * Get the status of a long running azure asynchronous operation.
     *
     * @param location The region name of operation.
     * @param asyncOperationId The operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a long running azure asynchronous operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<OperationStatusInner> getWithResponse(String location, String asyncOperationId, Context context) {
        return getWithResponseAsync(location, asyncOperationId, context).block();
    }
}
