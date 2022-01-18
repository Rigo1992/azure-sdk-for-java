// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

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
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.datafactory.fluent.models.PrivateLinkResourcesWrapperInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrivateLinkResourcesClient. */
public final class PrivateLinkResourcesClientImpl implements PrivateLinkResourcesClient {
    private final ClientLogger logger = new ClientLogger(PrivateLinkResourcesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final PrivateLinkResourcesService service;

    /** The service client containing this operation class. */
    private final DataFactoryManagementClientImpl client;

    /**
     * Initializes an instance of PrivateLinkResourcesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PrivateLinkResourcesClientImpl(DataFactoryManagementClientImpl client) {
        this.service =
            RestProxy
                .create(PrivateLinkResourcesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataFactoryManagementClientPrivateLinkResources to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataFactoryManagemen")
    private interface PrivateLinkResourcesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory"
                + "/factories/{factoryName}/privateLinkResources")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateLinkResourcesWrapperInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("factoryName") String factoryName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the private link resources.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateLinkResourcesWrapperInner>> getWithResponseAsync(
        String resourceGroupName, String factoryName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            factoryName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the private link resources.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateLinkResourcesWrapperInner>> getWithResponseAsync(
        String resourceGroupName, String factoryName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                factoryName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets the private link resources.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PrivateLinkResourcesWrapperInner> getAsync(String resourceGroupName, String factoryName) {
        return getWithResponseAsync(resourceGroupName, factoryName)
            .flatMap(
                (Response<PrivateLinkResourcesWrapperInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the private link resources.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkResourcesWrapperInner get(String resourceGroupName, String factoryName) {
        return getAsync(resourceGroupName, factoryName).block();
    }

    /**
     * Gets the private link resources.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PrivateLinkResourcesWrapperInner> getWithResponse(
        String resourceGroupName, String factoryName, Context context) {
        return getWithResponseAsync(resourceGroupName, factoryName, context).block();
    }
}
