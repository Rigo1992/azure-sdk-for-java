// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.deviceregistry.fluent.models.AssetInner;
import com.azure.resourcemanager.deviceregistry.models.AssetUpdate;

/**
 * An instance of this class provides access to all the operations defined in AssetsClient.
 */
public interface AssetsClient {
    /**
     * Get a Asset.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param assetName Asset name parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Asset along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AssetInner> getByResourceGroupWithResponse(String resourceGroupName, String assetName, Context context);

    /**
     * Get a Asset.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param assetName Asset name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Asset.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetInner getByResourceGroup(String resourceGroupName, String assetName);

    /**
     * Create a Asset.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param assetName Asset name parameter.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of asset definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AssetInner>, AssetInner> beginCreateOrReplace(String resourceGroupName, String assetName,
        AssetInner resource);

    /**
     * Create a Asset.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param assetName Asset name parameter.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of asset definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AssetInner>, AssetInner> beginCreateOrReplace(String resourceGroupName, String assetName,
        AssetInner resource, Context context);

    /**
     * Create a Asset.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param assetName Asset name parameter.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return asset definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetInner createOrReplace(String resourceGroupName, String assetName, AssetInner resource);

    /**
     * Create a Asset.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param assetName Asset name parameter.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return asset definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetInner createOrReplace(String resourceGroupName, String assetName, AssetInner resource, Context context);

    /**
     * Update a Asset.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param assetName Asset name parameter.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of asset definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AssetInner>, AssetInner> beginUpdate(String resourceGroupName, String assetName,
        AssetUpdate properties);

    /**
     * Update a Asset.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param assetName Asset name parameter.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of asset definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AssetInner>, AssetInner> beginUpdate(String resourceGroupName, String assetName,
        AssetUpdate properties, Context context);

    /**
     * Update a Asset.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param assetName Asset name parameter.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return asset definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetInner update(String resourceGroupName, String assetName, AssetUpdate properties);

    /**
     * Update a Asset.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param assetName Asset name parameter.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return asset definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssetInner update(String resourceGroupName, String assetName, AssetUpdate properties, Context context);

    /**
     * Delete a Asset.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param assetName Asset name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String assetName);

    /**
     * Delete a Asset.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param assetName Asset name parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String assetName, Context context);

    /**
     * Delete a Asset.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param assetName Asset name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String assetName);

    /**
     * Delete a Asset.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param assetName Asset name parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String assetName, Context context);

    /**
     * List Asset resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Asset list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AssetInner> listByResourceGroup(String resourceGroupName);

    /**
     * List Asset resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Asset list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AssetInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List Asset resources by subscription ID.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Asset list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AssetInner> list();

    /**
     * List Asset resources by subscription ID.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Asset list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AssetInner> list(Context context);
}
