// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mobilenetwork.fluent.models.DataNetworkInner;
import com.azure.resourcemanager.mobilenetwork.models.TagsObject;

/** An instance of this class provides access to all the operations defined in DataNetworksClient. */
public interface DataNetworksClient {
    /**
     * Deletes the specified mobile network dataNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param dataNetworkName The name of the mobile network dataNetwork.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String mobileNetworkName, String dataNetworkName);

    /**
     * Deletes the specified mobile network dataNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param dataNetworkName The name of the mobile network dataNetwork.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String mobileNetworkName, String dataNetworkName, Context context);

    /**
     * Deletes the specified mobile network dataNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param dataNetworkName The name of the mobile network dataNetwork.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String mobileNetworkName, String dataNetworkName);

    /**
     * Deletes the specified mobile network dataNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param dataNetworkName The name of the mobile network dataNetwork.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String mobileNetworkName, String dataNetworkName, Context context);

    /**
     * Gets information about the specified mobile network dataNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param dataNetworkName The name of the mobile network dataNetwork.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified mobile network dataNetwork.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataNetworkInner get(String resourceGroupName, String mobileNetworkName, String dataNetworkName);

    /**
     * Gets information about the specified mobile network dataNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param dataNetworkName The name of the mobile network dataNetwork.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified mobile network dataNetwork along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataNetworkInner> getWithResponse(
        String resourceGroupName, String mobileNetworkName, String dataNetworkName, Context context);

    /**
     * Creates or updates a mobile network dataNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param dataNetworkName The name of the mobile network dataNetwork.
     * @param parameters Parameters supplied to the create or update mobile network dataNetwork operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of data network resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DataNetworkInner>, DataNetworkInner> beginCreateOrUpdate(
        String resourceGroupName, String mobileNetworkName, String dataNetworkName, DataNetworkInner parameters);

    /**
     * Creates or updates a mobile network dataNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param dataNetworkName The name of the mobile network dataNetwork.
     * @param parameters Parameters supplied to the create or update mobile network dataNetwork operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of data network resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DataNetworkInner>, DataNetworkInner> beginCreateOrUpdate(
        String resourceGroupName,
        String mobileNetworkName,
        String dataNetworkName,
        DataNetworkInner parameters,
        Context context);

    /**
     * Creates or updates a mobile network dataNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param dataNetworkName The name of the mobile network dataNetwork.
     * @param parameters Parameters supplied to the create or update mobile network dataNetwork operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataNetworkInner createOrUpdate(
        String resourceGroupName, String mobileNetworkName, String dataNetworkName, DataNetworkInner parameters);

    /**
     * Creates or updates a mobile network dataNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param dataNetworkName The name of the mobile network dataNetwork.
     * @param parameters Parameters supplied to the create or update mobile network dataNetwork operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataNetworkInner createOrUpdate(
        String resourceGroupName,
        String mobileNetworkName,
        String dataNetworkName,
        DataNetworkInner parameters,
        Context context);

    /**
     * Update data network tags.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param dataNetworkName The name of the mobile network dataNetwork.
     * @param parameters Parameters supplied to update data network tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataNetworkInner updateTags(
        String resourceGroupName, String mobileNetworkName, String dataNetworkName, TagsObject parameters);

    /**
     * Update data network tags.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param dataNetworkName The name of the mobile network dataNetwork.
     * @param parameters Parameters supplied to update data network tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data network resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataNetworkInner> updateTagsWithResponse(
        String resourceGroupName,
        String mobileNetworkName,
        String dataNetworkName,
        TagsObject parameters,
        Context context);

    /**
     * Lists all dataNetworks in the mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for data network API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataNetworkInner> listByMobileNetwork(String resourceGroupName, String mobileNetworkName);

    /**
     * Lists all dataNetworks in the mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for data network API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataNetworkInner> listByMobileNetwork(
        String resourceGroupName, String mobileNetworkName, Context context);
}
