// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.netapp.fluent.models.VolumeGroupDetailsInner;
import com.azure.resourcemanager.netapp.fluent.models.VolumeGroupInner;

/** An instance of this class provides access to all the operations defined in VolumeGroupsClient. */
public interface VolumeGroupsClient {
    /**
     * Describe all volume groups
     *
     * <p>List all volume groups for given account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of volume group resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VolumeGroupInner> listByNetAppAccount(String resourceGroupName, String accountName);

    /**
     * Describe all volume groups
     *
     * <p>List all volume groups for given account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of volume group resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VolumeGroupInner> listByNetAppAccount(String resourceGroupName, String accountName, Context context);

    /**
     * Describe a Volume Group
     *
     * <p>Get details of the specified volume group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param volumeGroupName The name of the volumeGroup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified volume group along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VolumeGroupDetailsInner> getWithResponse(
        String resourceGroupName, String accountName, String volumeGroupName, Context context);

    /**
     * Describe a Volume Group
     *
     * <p>Get details of the specified volume group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param volumeGroupName The name of the volumeGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified volume group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VolumeGroupDetailsInner get(String resourceGroupName, String accountName, String volumeGroupName);

    /**
     * Create the specified volume group and volumes. Creating volume group will create all the volumes specified in
     * request body implicitly. Once volumes are created using volume group, those will be treated as regular volumes
     * thereafter.
     *
     * <p>Create a volume group along with specified volumes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param volumeGroupName The name of the volumeGroup.
     * @param body Volume Group object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of volume group resource for create.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VolumeGroupDetailsInner>, VolumeGroupDetailsInner> beginCreate(
        String resourceGroupName, String accountName, String volumeGroupName, VolumeGroupDetailsInner body);

    /**
     * Create the specified volume group and volumes. Creating volume group will create all the volumes specified in
     * request body implicitly. Once volumes are created using volume group, those will be treated as regular volumes
     * thereafter.
     *
     * <p>Create a volume group along with specified volumes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param volumeGroupName The name of the volumeGroup.
     * @param body Volume Group object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of volume group resource for create.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VolumeGroupDetailsInner>, VolumeGroupDetailsInner> beginCreate(
        String resourceGroupName,
        String accountName,
        String volumeGroupName,
        VolumeGroupDetailsInner body,
        Context context);

    /**
     * Create the specified volume group and volumes. Creating volume group will create all the volumes specified in
     * request body implicitly. Once volumes are created using volume group, those will be treated as regular volumes
     * thereafter.
     *
     * <p>Create a volume group along with specified volumes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param volumeGroupName The name of the volumeGroup.
     * @param body Volume Group object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return volume group resource for create.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VolumeGroupDetailsInner create(
        String resourceGroupName, String accountName, String volumeGroupName, VolumeGroupDetailsInner body);

    /**
     * Create the specified volume group and volumes. Creating volume group will create all the volumes specified in
     * request body implicitly. Once volumes are created using volume group, those will be treated as regular volumes
     * thereafter.
     *
     * <p>Create a volume group along with specified volumes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param volumeGroupName The name of the volumeGroup.
     * @param body Volume Group object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return volume group resource for create.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VolumeGroupDetailsInner create(
        String resourceGroupName,
        String accountName,
        String volumeGroupName,
        VolumeGroupDetailsInner body,
        Context context);

    /**
     * Delete a volume group
     *
     * <p>Delete the specified volume group only if there are no volumes under volume group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param volumeGroupName The name of the volumeGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String volumeGroupName);

    /**
     * Delete a volume group
     *
     * <p>Delete the specified volume group only if there are no volumes under volume group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param volumeGroupName The name of the volumeGroup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String volumeGroupName, Context context);

    /**
     * Delete a volume group
     *
     * <p>Delete the specified volume group only if there are no volumes under volume group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param volumeGroupName The name of the volumeGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String volumeGroupName);

    /**
     * Delete a volume group
     *
     * <p>Delete the specified volume group only if there are no volumes under volume group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param volumeGroupName The name of the volumeGroup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String volumeGroupName, Context context);
}
