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
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreDataPlaneInner;
import com.azure.resourcemanager.mobilenetwork.models.TagsObject;

/** An instance of this class provides access to all the operations defined in PacketCoreDataPlanesClient. */
public interface PacketCoreDataPlanesClient {
    /**
     * Deletes the specified packet core data plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCoreDataPlaneName);

    /**
     * Deletes the specified packet core data plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCoreDataPlaneName, Context context);

    /**
     * Deletes the specified packet core data plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String packetCoreControlPlaneName, String packetCoreDataPlaneName);

    /**
     * Deletes the specified packet core data plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCoreDataPlaneName, Context context);

    /**
     * Gets information about the specified packet core data plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet core data plane along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PacketCoreDataPlaneInner> getWithResponse(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCoreDataPlaneName, Context context);

    /**
     * Gets information about the specified packet core data plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet core data plane.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PacketCoreDataPlaneInner get(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCoreDataPlaneName);

    /**
     * Creates or updates a packet core data plane. Must be created in the same location as its parent packet core
     * control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @param parameters Parameters supplied to the create or update packet core data plane operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of packet core data plane resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PacketCoreDataPlaneInner>, PacketCoreDataPlaneInner> beginCreateOrUpdate(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCoreDataPlaneName,
        PacketCoreDataPlaneInner parameters);

    /**
     * Creates or updates a packet core data plane. Must be created in the same location as its parent packet core
     * control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @param parameters Parameters supplied to the create or update packet core data plane operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of packet core data plane resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PacketCoreDataPlaneInner>, PacketCoreDataPlaneInner> beginCreateOrUpdate(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCoreDataPlaneName,
        PacketCoreDataPlaneInner parameters,
        Context context);

    /**
     * Creates or updates a packet core data plane. Must be created in the same location as its parent packet core
     * control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @param parameters Parameters supplied to the create or update packet core data plane operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return packet core data plane resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PacketCoreDataPlaneInner createOrUpdate(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCoreDataPlaneName,
        PacketCoreDataPlaneInner parameters);

    /**
     * Creates or updates a packet core data plane. Must be created in the same location as its parent packet core
     * control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @param parameters Parameters supplied to the create or update packet core data plane operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return packet core data plane resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PacketCoreDataPlaneInner createOrUpdate(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCoreDataPlaneName,
        PacketCoreDataPlaneInner parameters,
        Context context);

    /**
     * Updates packet core data planes tags.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @param parameters Parameters supplied to update packet core data plane tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return packet core data plane resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PacketCoreDataPlaneInner> updateTagsWithResponse(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCoreDataPlaneName,
        TagsObject parameters,
        Context context);

    /**
     * Updates packet core data planes tags.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @param parameters Parameters supplied to update packet core data plane tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return packet core data plane resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PacketCoreDataPlaneInner updateTags(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCoreDataPlaneName,
        TagsObject parameters);

    /**
     * Lists all the packet core data planes associated with a packet core control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core data planes API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PacketCoreDataPlaneInner> listByPacketCoreControlPlane(
        String resourceGroupName, String packetCoreControlPlaneName);

    /**
     * Lists all the packet core data planes associated with a packet core control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core data planes API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PacketCoreDataPlaneInner> listByPacketCoreControlPlane(
        String resourceGroupName, String packetCoreControlPlaneName, Context context);
}
