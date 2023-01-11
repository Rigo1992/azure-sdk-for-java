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
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimInner;

/** An instance of this class provides access to all the operations defined in SimsClient. */
public interface SimsClient {
    /**
     * Deletes the specified SIM.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param simName The name of the SIM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String simGroupName, String simName);

    /**
     * Deletes the specified SIM.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param simName The name of the SIM.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String simGroupName, String simName, Context context);

    /**
     * Deletes the specified SIM.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param simName The name of the SIM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String simGroupName, String simName);

    /**
     * Deletes the specified SIM.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param simName The name of the SIM.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String simGroupName, String simName, Context context);

    /**
     * Gets information about the specified SIM.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param simName The name of the SIM.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified SIM along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SimInner> getWithResponse(String resourceGroupName, String simGroupName, String simName, Context context);

    /**
     * Gets information about the specified SIM.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param simName The name of the SIM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified SIM.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SimInner get(String resourceGroupName, String simGroupName, String simName);

    /**
     * Creates or updates a SIM.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param simName The name of the SIM.
     * @param parameters Parameters supplied to the create or update SIM operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of sIM resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SimInner>, SimInner> beginCreateOrUpdate(
        String resourceGroupName, String simGroupName, String simName, SimInner parameters);

    /**
     * Creates or updates a SIM.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param simName The name of the SIM.
     * @param parameters Parameters supplied to the create or update SIM operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of sIM resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SimInner>, SimInner> beginCreateOrUpdate(
        String resourceGroupName, String simGroupName, String simName, SimInner parameters, Context context);

    /**
     * Creates or updates a SIM.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param simName The name of the SIM.
     * @param parameters Parameters supplied to the create or update SIM operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sIM resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SimInner createOrUpdate(String resourceGroupName, String simGroupName, String simName, SimInner parameters);

    /**
     * Creates or updates a SIM.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param simName The name of the SIM.
     * @param parameters Parameters supplied to the create or update SIM operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sIM resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SimInner createOrUpdate(
        String resourceGroupName, String simGroupName, String simName, SimInner parameters, Context context);

    /**
     * Gets all the SIMs in a SIM group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the SIMs in a SIM group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SimInner> listByGroup(String resourceGroupName, String simGroupName);

    /**
     * Gets all the SIMs in a SIM group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the SIMs in a SIM group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SimInner> listByGroup(String resourceGroupName, String simGroupName, Context context);
}
