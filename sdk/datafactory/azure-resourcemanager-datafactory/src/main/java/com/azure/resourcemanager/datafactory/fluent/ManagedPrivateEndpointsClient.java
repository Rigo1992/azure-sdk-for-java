// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedPrivateEndpointResourceInner;

/** An instance of this class provides access to all the operations defined in ManagedPrivateEndpointsClient. */
public interface ManagedPrivateEndpointsClient {
    /**
     * Lists managed private endpoints.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param managedVirtualNetworkName Managed virtual network name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoint resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedPrivateEndpointResourceInner> listByFactory(
        String resourceGroupName, String factoryName, String managedVirtualNetworkName);

    /**
     * Lists managed private endpoints.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoint resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedPrivateEndpointResourceInner> listByFactory(
        String resourceGroupName, String factoryName, String managedVirtualNetworkName, Context context);

    /**
     * Creates or updates a managed private endpoint.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param managedPrivateEndpoint Managed private endpoint resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed private endpoint resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedPrivateEndpointResourceInner createOrUpdate(
        String resourceGroupName,
        String factoryName,
        String managedVirtualNetworkName,
        String managedPrivateEndpointName,
        ManagedPrivateEndpointResourceInner managedPrivateEndpoint);

    /**
     * Creates or updates a managed private endpoint.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param managedPrivateEndpoint Managed private endpoint resource definition.
     * @param ifMatch ETag of the managed private endpoint entity. Should only be specified for update, for which it
     *     should match existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed private endpoint resource type along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedPrivateEndpointResourceInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String factoryName,
        String managedVirtualNetworkName,
        String managedPrivateEndpointName,
        ManagedPrivateEndpointResourceInner managedPrivateEndpoint,
        String ifMatch,
        Context context);

    /**
     * Gets a managed private endpoint.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed private endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedPrivateEndpointResourceInner get(
        String resourceGroupName,
        String factoryName,
        String managedVirtualNetworkName,
        String managedPrivateEndpointName);

    /**
     * Gets a managed private endpoint.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param ifNoneMatch ETag of the managed private endpoint entity. Should only be specified for get. If the ETag
     *     matches the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed private endpoint along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedPrivateEndpointResourceInner> getWithResponse(
        String resourceGroupName,
        String factoryName,
        String managedVirtualNetworkName,
        String managedPrivateEndpointName,
        String ifNoneMatch,
        Context context);

    /**
     * Deletes a managed private endpoint.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName,
        String factoryName,
        String managedVirtualNetworkName,
        String managedPrivateEndpointName);

    /**
     * Deletes a managed private endpoint.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String factoryName,
        String managedVirtualNetworkName,
        String managedPrivateEndpointName,
        Context context);
}
