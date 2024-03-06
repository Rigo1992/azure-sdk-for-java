// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appplatform.fluent.models.PredefinedAcceleratorResourceInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in PredefinedAcceleratorsClient.
 */
public interface PredefinedAcceleratorsClient {
    /**
     * Handle requests to list all predefined accelerators.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PredefinedAcceleratorResourceInner> listAsync(String resourceGroupName, String serviceName,
        String applicationAcceleratorName);

    /**
     * Handle requests to list all predefined accelerators.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PredefinedAcceleratorResourceInner> list(String resourceGroupName, String serviceName,
        String applicationAcceleratorName);

    /**
     * Handle requests to list all predefined accelerators.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PredefinedAcceleratorResourceInner> list(String resourceGroupName, String serviceName,
        String applicationAcceleratorName, Context context);

    /**
     * Get the predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the predefined accelerator along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PredefinedAcceleratorResourceInner>> getWithResponseAsync(String resourceGroupName,
        String serviceName, String applicationAcceleratorName, String predefinedAcceleratorName);

    /**
     * Get the predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the predefined accelerator on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PredefinedAcceleratorResourceInner> getAsync(String resourceGroupName, String serviceName,
        String applicationAcceleratorName, String predefinedAcceleratorName);

    /**
     * Get the predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the predefined accelerator along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PredefinedAcceleratorResourceInner> getWithResponse(String resourceGroupName, String serviceName,
        String applicationAcceleratorName, String predefinedAcceleratorName, Context context);

    /**
     * Get the predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the predefined accelerator.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PredefinedAcceleratorResourceInner get(String resourceGroupName, String serviceName,
        String applicationAcceleratorName, String predefinedAcceleratorName);

    /**
     * Disable predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> disableWithResponseAsync(String resourceGroupName, String serviceName,
        String applicationAcceleratorName, String predefinedAcceleratorName);

    /**
     * Disable predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDisableAsync(String resourceGroupName, String serviceName,
        String applicationAcceleratorName, String predefinedAcceleratorName);

    /**
     * Disable predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDisable(String resourceGroupName, String serviceName,
        String applicationAcceleratorName, String predefinedAcceleratorName);

    /**
     * Disable predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDisable(String resourceGroupName, String serviceName,
        String applicationAcceleratorName, String predefinedAcceleratorName, Context context);

    /**
     * Disable predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> disableAsync(String resourceGroupName, String serviceName, String applicationAcceleratorName,
        String predefinedAcceleratorName);

    /**
     * Disable predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disable(String resourceGroupName, String serviceName, String applicationAcceleratorName,
        String predefinedAcceleratorName);

    /**
     * Disable predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disable(String resourceGroupName, String serviceName, String applicationAcceleratorName,
        String predefinedAcceleratorName, Context context);

    /**
     * Enable predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> enableWithResponseAsync(String resourceGroupName, String serviceName,
        String applicationAcceleratorName, String predefinedAcceleratorName);

    /**
     * Enable predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginEnableAsync(String resourceGroupName, String serviceName,
        String applicationAcceleratorName, String predefinedAcceleratorName);

    /**
     * Enable predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginEnable(String resourceGroupName, String serviceName,
        String applicationAcceleratorName, String predefinedAcceleratorName);

    /**
     * Enable predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginEnable(String resourceGroupName, String serviceName,
        String applicationAcceleratorName, String predefinedAcceleratorName, Context context);

    /**
     * Enable predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> enableAsync(String resourceGroupName, String serviceName, String applicationAcceleratorName,
        String predefinedAcceleratorName);

    /**
     * Enable predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enable(String resourceGroupName, String serviceName, String applicationAcceleratorName,
        String predefinedAcceleratorName);

    /**
     * Enable predefined accelerator.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationAcceleratorName The name of the application accelerator.
     * @param predefinedAcceleratorName The name of the predefined accelerator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enable(String resourceGroupName, String serviceName, String applicationAcceleratorName,
        String predefinedAcceleratorName, Context context);
}
