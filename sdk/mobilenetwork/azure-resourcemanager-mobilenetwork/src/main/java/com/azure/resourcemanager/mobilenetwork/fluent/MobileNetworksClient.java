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
import com.azure.resourcemanager.mobilenetwork.fluent.models.MobileNetworkInner;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimIdListResultInner;
import com.azure.resourcemanager.mobilenetwork.models.TagsObject;

/** An instance of this class provides access to all the operations defined in MobileNetworksClient. */
public interface MobileNetworksClient {
    /**
     * Deletes the specified mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String mobileNetworkName);

    /**
     * Deletes the specified mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String mobileNetworkName, Context context);

    /**
     * Deletes the specified mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String mobileNetworkName);

    /**
     * Deletes the specified mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String mobileNetworkName, Context context);

    /**
     * Gets information about the specified mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified mobile network.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MobileNetworkInner getByResourceGroup(String resourceGroupName, String mobileNetworkName);

    /**
     * Gets information about the specified mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified mobile network along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MobileNetworkInner> getByResourceGroupWithResponse(
        String resourceGroupName, String mobileNetworkName, Context context);

    /**
     * Creates or updates a mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param parameters Parameters supplied to the create or update mobile network operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of mobile network resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MobileNetworkInner>, MobileNetworkInner> beginCreateOrUpdate(
        String resourceGroupName, String mobileNetworkName, MobileNetworkInner parameters);

    /**
     * Creates or updates a mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param parameters Parameters supplied to the create or update mobile network operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of mobile network resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MobileNetworkInner>, MobileNetworkInner> beginCreateOrUpdate(
        String resourceGroupName, String mobileNetworkName, MobileNetworkInner parameters, Context context);

    /**
     * Creates or updates a mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param parameters Parameters supplied to the create or update mobile network operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return mobile network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MobileNetworkInner createOrUpdate(
        String resourceGroupName, String mobileNetworkName, MobileNetworkInner parameters);

    /**
     * Creates or updates a mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param parameters Parameters supplied to the create or update mobile network operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return mobile network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MobileNetworkInner createOrUpdate(
        String resourceGroupName, String mobileNetworkName, MobileNetworkInner parameters, Context context);

    /**
     * Updates mobile network tags.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param parameters Parameters supplied to update mobile network tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return mobile network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MobileNetworkInner updateTags(String resourceGroupName, String mobileNetworkName, TagsObject parameters);

    /**
     * Updates mobile network tags.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param parameters Parameters supplied to update mobile network tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return mobile network resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MobileNetworkInner> updateTagsWithResponse(
        String resourceGroupName, String mobileNetworkName, TagsObject parameters, Context context);

    /**
     * Lists all the mobile networks in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for mobile networks API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MobileNetworkInner> list();

    /**
     * Lists all the mobile networks in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for mobile networks API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MobileNetworkInner> list(Context context);

    /**
     * Lists all the mobile networks in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for mobile networks API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MobileNetworkInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the mobile networks in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for mobile networks API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MobileNetworkInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists the IDs of all provisioned SIMs in a mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of response for list SIM IDs API service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SimIdListResultInner>, SimIdListResultInner> beginListSimIds(
        String resourceGroupName, String mobileNetworkName);

    /**
     * Lists the IDs of all provisioned SIMs in a mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of response for list SIM IDs API service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SimIdListResultInner>, SimIdListResultInner> beginListSimIds(
        String resourceGroupName, String mobileNetworkName, Context context);

    /**
     * Lists the IDs of all provisioned SIMs in a mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list SIM IDs API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SimIdListResultInner listSimIds(String resourceGroupName, String mobileNetworkName);

    /**
     * Lists the IDs of all provisioned SIMs in a mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list SIM IDs API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SimIdListResultInner listSimIds(String resourceGroupName, String mobileNetworkName, Context context);
}
