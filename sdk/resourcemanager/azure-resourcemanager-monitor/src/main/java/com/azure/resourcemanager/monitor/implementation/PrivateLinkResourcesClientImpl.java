// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.implementation;

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
import com.azure.resourcemanager.monitor.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.monitor.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.monitor.fluent.models.PrivateLinkResourceListResultInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in PrivateLinkResourcesClient.
 */
public final class PrivateLinkResourcesClientImpl implements PrivateLinkResourcesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final PrivateLinkResourcesService service;

    /**
     * The service client containing this operation class.
     */
    private final MonitorClientImpl client;

    /**
     * Initializes an instance of PrivateLinkResourcesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
     PrivateLinkResourcesClientImpl(MonitorClientImpl client) {
        this.service = RestProxy.create(PrivateLinkResourcesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientPrivateLinkResources to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientPrivate")
    public interface PrivateLinkResourcesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/privateLinkScopes/{scopeName}/privateLinkResources")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateLinkResourceListResultInner>> listByPrivateLinkScope(@HostParam("$host") String endpoint, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion, @PathParam("scopeName") String scopeName, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/privateLinkScopes/{scopeName}/privateLinkResources/{groupName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateLinkResourceInner>> get(@HostParam("$host") String endpoint, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion, @PathParam("scopeName") String scopeName, @PathParam("groupName") String groupName, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PrivateLinkResourceListResultInner>> listByPrivateLinkScopeWithResponseAsync(String resourceGroupName, String scopeName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (scopeName == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeName is required and cannot be null."));
        }
        final String apiVersion = "2021-07-01-preview";
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listByPrivateLinkScope(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, apiVersion, scopeName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateLinkResourceListResultInner>> listByPrivateLinkScopeWithResponseAsync(String resourceGroupName, String scopeName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (scopeName == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeName is required and cannot be null."));
        }
        final String apiVersion = "2021-07-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listByPrivateLinkScope(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, apiVersion, scopeName, accept, context);
    }

    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateLinkResourceListResultInner> listByPrivateLinkScopeAsync(String resourceGroupName, String scopeName) {
        return listByPrivateLinkScopeWithResponseAsync(resourceGroupName, scopeName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PrivateLinkResourceListResultInner> listByPrivateLinkScopeWithResponse(String resourceGroupName, String scopeName, Context context) {
        return listByPrivateLinkScopeWithResponseAsync(resourceGroupName, scopeName, context).block();
    }

    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkResourceListResultInner listByPrivateLinkScope(String resourceGroupName, String scopeName) {
        return listByPrivateLinkScopeWithResponse(resourceGroupName, scopeName, Context.NONE).getValue();
    }

    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param groupName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PrivateLinkResourceInner>> getWithResponseAsync(String resourceGroupName, String scopeName, String groupName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (scopeName == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeName is required and cannot be null."));
        }
        if (groupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupName is required and cannot be null."));
        }
        final String apiVersion = "2021-07-01-preview";
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, apiVersion, scopeName, groupName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param groupName The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateLinkResourceInner>> getWithResponseAsync(String resourceGroupName, String scopeName, String groupName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (scopeName == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeName is required and cannot be null."));
        }
        if (groupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupName is required and cannot be null."));
        }
        final String apiVersion = "2021-07-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, apiVersion, scopeName, groupName, accept, context);
    }

    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param groupName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateLinkResourceInner> getAsync(String resourceGroupName, String scopeName, String groupName) {
        return getWithResponseAsync(resourceGroupName, scopeName, groupName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param groupName The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PrivateLinkResourceInner> getWithResponse(String resourceGroupName, String scopeName, String groupName, Context context) {
        return getWithResponseAsync(resourceGroupName, scopeName, groupName, context).block();
    }

    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param groupName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkResourceInner get(String resourceGroupName, String scopeName, String groupName) {
        return getWithResponse(resourceGroupName, scopeName, groupName, Context.NONE).getValue();
    }
}
