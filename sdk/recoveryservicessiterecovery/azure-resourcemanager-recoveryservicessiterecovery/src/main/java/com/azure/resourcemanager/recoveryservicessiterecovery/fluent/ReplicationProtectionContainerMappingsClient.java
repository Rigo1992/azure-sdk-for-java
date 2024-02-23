// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ProtectionContainerMappingInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreateProtectionContainerMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RemoveProtectionContainerMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateProtectionContainerMappingInput;

/**
 * An instance of this class provides access to all the operations defined in
 * ReplicationProtectionContainerMappingsClient.
 */
public interface ReplicationProtectionContainerMappingsClient {
    /**
     * Gets the list of protection container mappings for a protection container.
     * 
     * Lists the protection container mappings for a protection container.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container mapping collection class as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProtectionContainerMappingInner> listByReplicationProtectionContainers(String resourceName,
        String resourceGroupName, String fabricName, String protectionContainerName);

    /**
     * Gets the list of protection container mappings for a protection container.
     * 
     * Lists the protection container mappings for a protection container.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container mapping collection class as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProtectionContainerMappingInner> listByReplicationProtectionContainers(String resourceName,
        String resourceGroupName, String fabricName, String protectionContainerName, Context context);

    /**
     * Gets a protection container mapping.
     * 
     * Gets the details of a protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection Container mapping name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a protection container mapping along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProtectionContainerMappingInner> getWithResponse(String resourceName, String resourceGroupName,
        String fabricName, String protectionContainerName, String mappingName, Context context);

    /**
     * Gets a protection container mapping.
     * 
     * Gets the details of a protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection Container mapping name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a protection container mapping.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProtectionContainerMappingInner get(String resourceName, String resourceGroupName, String fabricName,
        String protectionContainerName, String mappingName);

    /**
     * Create protection container mapping.
     * 
     * The operation to create a protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @param creationInput Mapping creation input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of protection container mapping object.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProtectionContainerMappingInner>, ProtectionContainerMappingInner> beginCreate(
        String resourceName, String resourceGroupName, String fabricName, String protectionContainerName,
        String mappingName, CreateProtectionContainerMappingInput creationInput);

    /**
     * Create protection container mapping.
     * 
     * The operation to create a protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @param creationInput Mapping creation input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of protection container mapping object.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProtectionContainerMappingInner>, ProtectionContainerMappingInner> beginCreate(
        String resourceName, String resourceGroupName, String fabricName, String protectionContainerName,
        String mappingName, CreateProtectionContainerMappingInput creationInput, Context context);

    /**
     * Create protection container mapping.
     * 
     * The operation to create a protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @param creationInput Mapping creation input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container mapping object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProtectionContainerMappingInner create(String resourceName, String resourceGroupName, String fabricName,
        String protectionContainerName, String mappingName, CreateProtectionContainerMappingInput creationInput);

    /**
     * Create protection container mapping.
     * 
     * The operation to create a protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @param creationInput Mapping creation input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container mapping object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProtectionContainerMappingInner create(String resourceName, String resourceGroupName, String fabricName,
        String protectionContainerName, String mappingName, CreateProtectionContainerMappingInput creationInput,
        Context context);

    /**
     * Purge protection container mapping.
     * 
     * The operation to purge(force delete) a protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginPurge(String resourceName, String resourceGroupName, String fabricName,
        String protectionContainerName, String mappingName);

    /**
     * Purge protection container mapping.
     * 
     * The operation to purge(force delete) a protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginPurge(String resourceName, String resourceGroupName, String fabricName,
        String protectionContainerName, String mappingName, Context context);

    /**
     * Purge protection container mapping.
     * 
     * The operation to purge(force delete) a protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void purge(String resourceName, String resourceGroupName, String fabricName, String protectionContainerName,
        String mappingName);

    /**
     * Purge protection container mapping.
     * 
     * The operation to purge(force delete) a protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void purge(String resourceName, String resourceGroupName, String fabricName, String protectionContainerName,
        String mappingName, Context context);

    /**
     * Update protection container mapping.
     * 
     * The operation to update protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @param updateInput Mapping update input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of protection container mapping object.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProtectionContainerMappingInner>, ProtectionContainerMappingInner> beginUpdate(
        String resourceName, String resourceGroupName, String fabricName, String protectionContainerName,
        String mappingName, UpdateProtectionContainerMappingInput updateInput);

    /**
     * Update protection container mapping.
     * 
     * The operation to update protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @param updateInput Mapping update input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of protection container mapping object.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProtectionContainerMappingInner>, ProtectionContainerMappingInner> beginUpdate(
        String resourceName, String resourceGroupName, String fabricName, String protectionContainerName,
        String mappingName, UpdateProtectionContainerMappingInput updateInput, Context context);

    /**
     * Update protection container mapping.
     * 
     * The operation to update protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @param updateInput Mapping update input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container mapping object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProtectionContainerMappingInner update(String resourceName, String resourceGroupName, String fabricName,
        String protectionContainerName, String mappingName, UpdateProtectionContainerMappingInput updateInput);

    /**
     * Update protection container mapping.
     * 
     * The operation to update protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @param updateInput Mapping update input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container mapping object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProtectionContainerMappingInner update(String resourceName, String resourceGroupName, String fabricName,
        String protectionContainerName, String mappingName, UpdateProtectionContainerMappingInput updateInput,
        Context context);

    /**
     * Remove protection container mapping.
     * 
     * The operation to delete or remove a protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @param removalInput Removal input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceName, String resourceGroupName, String fabricName,
        String protectionContainerName, String mappingName, RemoveProtectionContainerMappingInput removalInput);

    /**
     * Remove protection container mapping.
     * 
     * The operation to delete or remove a protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @param removalInput Removal input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceName, String resourceGroupName, String fabricName,
        String protectionContainerName, String mappingName, RemoveProtectionContainerMappingInput removalInput,
        Context context);

    /**
     * Remove protection container mapping.
     * 
     * The operation to delete or remove a protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @param removalInput Removal input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceName, String resourceGroupName, String fabricName, String protectionContainerName,
        String mappingName, RemoveProtectionContainerMappingInput removalInput);

    /**
     * Remove protection container mapping.
     * 
     * The operation to delete or remove a protection container mapping.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @param removalInput Removal input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceName, String resourceGroupName, String fabricName, String protectionContainerName,
        String mappingName, RemoveProtectionContainerMappingInput removalInput, Context context);

    /**
     * Gets the list of all protection container mappings in a vault.
     * 
     * Lists the protection container mappings in the vault.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container mapping collection class as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProtectionContainerMappingInner> list(String resourceName, String resourceGroupName);

    /**
     * Gets the list of all protection container mappings in a vault.
     * 
     * Lists the protection container mappings in the vault.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container mapping collection class as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProtectionContainerMappingInner> list(String resourceName, String resourceGroupName, Context context);
}
