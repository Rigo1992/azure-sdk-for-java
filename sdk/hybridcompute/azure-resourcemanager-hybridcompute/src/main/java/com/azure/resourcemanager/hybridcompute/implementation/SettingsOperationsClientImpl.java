// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
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
import com.azure.resourcemanager.hybridcompute.fluent.SettingsOperationsClient;
import com.azure.resourcemanager.hybridcompute.fluent.models.SettingsInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in SettingsOperationsClient.
 */
public final class SettingsOperationsClientImpl implements SettingsOperationsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final SettingsOperationsService service;

    /**
     * The service client containing this operation class.
     */
    private final HybridComputeManagementClientImpl client;

    /**
     * Initializes an instance of SettingsOperationsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    SettingsOperationsClientImpl(HybridComputeManagementClientImpl client) {
        this.service = RestProxy.create(SettingsOperationsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for HybridComputeManagementClientSettingsOperations to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "HybridComputeManagem")
    public interface SettingsOperationsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{baseProvider}/{baseResourceType}/{baseResourceName}/providers/Microsoft.HybridCompute/settings/{settingsResourceName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SettingsInner>> get(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("baseProvider") String baseProvider,
            @PathParam("baseResourceType") String baseResourceType,
            @PathParam("baseResourceName") String baseResourceName,
            @PathParam("settingsResourceName") String settingsResourceName, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{baseProvider}/{baseResourceType}/{baseResourceName}/providers/Microsoft.HybridCompute/settings/{settingsResourceName}")
        @ExpectedResponses({ 200, 201 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SettingsInner>> update(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("baseProvider") String baseProvider,
            @PathParam("baseResourceType") String baseResourceType,
            @PathParam("baseResourceName") String baseResourceName,
            @PathParam("settingsResourceName") String settingsResourceName,
            @BodyParam("application/json") SettingsInner parameters, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{baseProvider}/{baseResourceType}/{baseResourceName}/providers/Microsoft.HybridCompute/settings/{settingsResourceName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SettingsInner>> patch(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("baseProvider") String baseProvider,
            @PathParam("baseResourceType") String baseResourceType,
            @PathParam("baseResourceName") String baseResourceName,
            @PathParam("settingsResourceName") String settingsResourceName,
            @BodyParam("application/json") SettingsInner parameters, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Returns the base Settings for the target resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param baseProvider The name of the base Resource Provider.
     * @param baseResourceType The name of the base Resource Type.
     * @param baseResourceName The name of the base resource.
     * @param settingsResourceName The name of the settings resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SettingsInner>> getWithResponseAsync(String resourceGroupName, String baseProvider,
        String baseResourceType, String baseResourceName, String settingsResourceName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (baseProvider == null) {
            return Mono.error(new IllegalArgumentException("Parameter baseProvider is required and cannot be null."));
        }
        if (baseResourceType == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter baseResourceType is required and cannot be null."));
        }
        if (baseResourceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter baseResourceName is required and cannot be null."));
        }
        if (settingsResourceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter settingsResourceName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, baseProvider, baseResourceType, baseResourceName,
                settingsResourceName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Returns the base Settings for the target resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param baseProvider The name of the base Resource Provider.
     * @param baseResourceType The name of the base Resource Type.
     * @param baseResourceName The name of the base resource.
     * @param settingsResourceName The name of the settings resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SettingsInner>> getWithResponseAsync(String resourceGroupName, String baseProvider,
        String baseResourceType, String baseResourceName, String settingsResourceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (baseProvider == null) {
            return Mono.error(new IllegalArgumentException("Parameter baseProvider is required and cannot be null."));
        }
        if (baseResourceType == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter baseResourceType is required and cannot be null."));
        }
        if (baseResourceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter baseResourceName is required and cannot be null."));
        }
        if (settingsResourceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter settingsResourceName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
            resourceGroupName, baseProvider, baseResourceType, baseResourceName, settingsResourceName, accept, context);
    }

    /**
     * Returns the base Settings for the target resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param baseProvider The name of the base Resource Provider.
     * @param baseResourceType The name of the base Resource Type.
     * @param baseResourceName The name of the base resource.
     * @param settingsResourceName The name of the settings resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SettingsInner> getAsync(String resourceGroupName, String baseProvider, String baseResourceType,
        String baseResourceName, String settingsResourceName) {
        return getWithResponseAsync(resourceGroupName, baseProvider, baseResourceType, baseResourceName,
            settingsResourceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Returns the base Settings for the target resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param baseProvider The name of the base Resource Provider.
     * @param baseResourceType The name of the base Resource Type.
     * @param baseResourceName The name of the base resource.
     * @param settingsResourceName The name of the settings resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SettingsInner> getWithResponse(String resourceGroupName, String baseProvider,
        String baseResourceType, String baseResourceName, String settingsResourceName, Context context) {
        return getWithResponseAsync(resourceGroupName, baseProvider, baseResourceType, baseResourceName,
            settingsResourceName, context).block();
    }

    /**
     * Returns the base Settings for the target resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param baseProvider The name of the base Resource Provider.
     * @param baseResourceType The name of the base Resource Type.
     * @param baseResourceName The name of the base resource.
     * @param settingsResourceName The name of the settings resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SettingsInner get(String resourceGroupName, String baseProvider, String baseResourceType,
        String baseResourceName, String settingsResourceName) {
        return getWithResponse(resourceGroupName, baseProvider, baseResourceType, baseResourceName,
            settingsResourceName, Context.NONE).getValue();
    }

    /**
     * Updates the base Settings of the target resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param baseProvider The name of the base Resource Provider.
     * @param baseResourceType The name of the base Resource Type.
     * @param baseResourceName The name of the base resource.
     * @param settingsResourceName The name of the settings resource.
     * @param parameters Settings details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SettingsInner>> updateWithResponseAsync(String resourceGroupName, String baseProvider,
        String baseResourceType, String baseResourceName, String settingsResourceName, SettingsInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (baseProvider == null) {
            return Mono.error(new IllegalArgumentException("Parameter baseProvider is required and cannot be null."));
        }
        if (baseResourceType == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter baseResourceType is required and cannot be null."));
        }
        if (baseResourceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter baseResourceName is required and cannot be null."));
        }
        if (settingsResourceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter settingsResourceName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.update(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, baseProvider, baseResourceType, baseResourceName,
                settingsResourceName, parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Updates the base Settings of the target resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param baseProvider The name of the base Resource Provider.
     * @param baseResourceType The name of the base Resource Type.
     * @param baseResourceName The name of the base resource.
     * @param settingsResourceName The name of the settings resource.
     * @param parameters Settings details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SettingsInner>> updateWithResponseAsync(String resourceGroupName, String baseProvider,
        String baseResourceType, String baseResourceName, String settingsResourceName, SettingsInner parameters,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (baseProvider == null) {
            return Mono.error(new IllegalArgumentException("Parameter baseProvider is required and cannot be null."));
        }
        if (baseResourceType == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter baseResourceType is required and cannot be null."));
        }
        if (baseResourceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter baseResourceName is required and cannot be null."));
        }
        if (settingsResourceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter settingsResourceName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.update(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
            resourceGroupName, baseProvider, baseResourceType, baseResourceName, settingsResourceName, parameters,
            accept, context);
    }

    /**
     * Updates the base Settings of the target resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param baseProvider The name of the base Resource Provider.
     * @param baseResourceType The name of the base Resource Type.
     * @param baseResourceName The name of the base resource.
     * @param settingsResourceName The name of the settings resource.
     * @param parameters Settings details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SettingsInner> updateAsync(String resourceGroupName, String baseProvider, String baseResourceType,
        String baseResourceName, String settingsResourceName, SettingsInner parameters) {
        return updateWithResponseAsync(resourceGroupName, baseProvider, baseResourceType, baseResourceName,
            settingsResourceName, parameters).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Updates the base Settings of the target resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param baseProvider The name of the base Resource Provider.
     * @param baseResourceType The name of the base Resource Type.
     * @param baseResourceName The name of the base resource.
     * @param settingsResourceName The name of the settings resource.
     * @param parameters Settings details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SettingsInner> updateWithResponse(String resourceGroupName, String baseProvider,
        String baseResourceType, String baseResourceName, String settingsResourceName, SettingsInner parameters,
        Context context) {
        return updateWithResponseAsync(resourceGroupName, baseProvider, baseResourceType, baseResourceName,
            settingsResourceName, parameters, context).block();
    }

    /**
     * Updates the base Settings of the target resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param baseProvider The name of the base Resource Provider.
     * @param baseResourceType The name of the base Resource Type.
     * @param baseResourceName The name of the base resource.
     * @param settingsResourceName The name of the settings resource.
     * @param parameters Settings details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SettingsInner update(String resourceGroupName, String baseProvider, String baseResourceType,
        String baseResourceName, String settingsResourceName, SettingsInner parameters) {
        return updateWithResponse(resourceGroupName, baseProvider, baseResourceType, baseResourceName,
            settingsResourceName, parameters, Context.NONE).getValue();
    }

    /**
     * Update the base Settings of the target resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param baseProvider The name of the base Resource Provider.
     * @param baseResourceType The name of the base Resource Type.
     * @param baseResourceName The name of the base resource.
     * @param settingsResourceName The name of the settings resource.
     * @param parameters Settings details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SettingsInner>> patchWithResponseAsync(String resourceGroupName, String baseProvider,
        String baseResourceType, String baseResourceName, String settingsResourceName, SettingsInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (baseProvider == null) {
            return Mono.error(new IllegalArgumentException("Parameter baseProvider is required and cannot be null."));
        }
        if (baseResourceType == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter baseResourceType is required and cannot be null."));
        }
        if (baseResourceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter baseResourceName is required and cannot be null."));
        }
        if (settingsResourceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter settingsResourceName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.patch(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, baseProvider, baseResourceType, baseResourceName,
                settingsResourceName, parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Update the base Settings of the target resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param baseProvider The name of the base Resource Provider.
     * @param baseResourceType The name of the base Resource Type.
     * @param baseResourceName The name of the base resource.
     * @param settingsResourceName The name of the settings resource.
     * @param parameters Settings details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SettingsInner>> patchWithResponseAsync(String resourceGroupName, String baseProvider,
        String baseResourceType, String baseResourceName, String settingsResourceName, SettingsInner parameters,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (baseProvider == null) {
            return Mono.error(new IllegalArgumentException("Parameter baseProvider is required and cannot be null."));
        }
        if (baseResourceType == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter baseResourceType is required and cannot be null."));
        }
        if (baseResourceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter baseResourceName is required and cannot be null."));
        }
        if (settingsResourceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter settingsResourceName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.patch(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
            resourceGroupName, baseProvider, baseResourceType, baseResourceName, settingsResourceName, parameters,
            accept, context);
    }

    /**
     * Update the base Settings of the target resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param baseProvider The name of the base Resource Provider.
     * @param baseResourceType The name of the base Resource Type.
     * @param baseResourceName The name of the base resource.
     * @param settingsResourceName The name of the settings resource.
     * @param parameters Settings details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SettingsInner> patchAsync(String resourceGroupName, String baseProvider, String baseResourceType,
        String baseResourceName, String settingsResourceName, SettingsInner parameters) {
        return patchWithResponseAsync(resourceGroupName, baseProvider, baseResourceType, baseResourceName,
            settingsResourceName, parameters).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update the base Settings of the target resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param baseProvider The name of the base Resource Provider.
     * @param baseResourceType The name of the base Resource Type.
     * @param baseResourceName The name of the base resource.
     * @param settingsResourceName The name of the settings resource.
     * @param parameters Settings details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SettingsInner> patchWithResponse(String resourceGroupName, String baseProvider,
        String baseResourceType, String baseResourceName, String settingsResourceName, SettingsInner parameters,
        Context context) {
        return patchWithResponseAsync(resourceGroupName, baseProvider, baseResourceType, baseResourceName,
            settingsResourceName, parameters, context).block();
    }

    /**
     * Update the base Settings of the target resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param baseProvider The name of the base Resource Provider.
     * @param baseResourceType The name of the base Resource Type.
     * @param baseResourceName The name of the base resource.
     * @param settingsResourceName The name of the settings resource.
     * @param parameters Settings details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SettingsInner patch(String resourceGroupName, String baseProvider, String baseResourceType,
        String baseResourceName, String settingsResourceName, SettingsInner parameters) {
        return patchWithResponse(resourceGroupName, baseProvider, baseResourceType, baseResourceName,
            settingsResourceName, parameters, Context.NONE).getValue();
    }
}
