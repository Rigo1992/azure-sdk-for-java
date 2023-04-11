// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.storagemover.fluent.models.AgentInner;
import com.azure.resourcemanager.storagemover.models.AgentUpdateParameters;

/** An instance of this class provides access to all the operations defined in AgentsClient. */
public interface AgentsClient {
    /**
     * Lists all Agents in a Storage Mover.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Agents as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AgentInner> list(String resourceGroupName, String storageMoverName);

    /**
     * Lists all Agents in a Storage Mover.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Agents as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AgentInner> list(String resourceGroupName, String storageMoverName, Context context);

    /**
     * Gets an Agent resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param agentName The name of the Agent resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Agent resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AgentInner> getWithResponse(
        String resourceGroupName, String storageMoverName, String agentName, Context context);

    /**
     * Gets an Agent resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param agentName The name of the Agent resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Agent resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentInner get(String resourceGroupName, String storageMoverName, String agentName);

    /**
     * Creates or updates an Agent resource, which references a hybrid compute machine that can run jobs.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param agentName The name of the Agent resource.
     * @param agent The Agent resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Agent resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AgentInner> createOrUpdateWithResponse(
        String resourceGroupName, String storageMoverName, String agentName, AgentInner agent, Context context);

    /**
     * Creates or updates an Agent resource, which references a hybrid compute machine that can run jobs.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param agentName The name of the Agent resource.
     * @param agent The Agent resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Agent resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentInner createOrUpdate(String resourceGroupName, String storageMoverName, String agentName, AgentInner agent);

    /**
     * Creates or updates an Agent resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param agentName The name of the Agent resource.
     * @param agent The Agent resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Agent resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AgentInner> updateWithResponse(
        String resourceGroupName,
        String storageMoverName,
        String agentName,
        AgentUpdateParameters agent,
        Context context);

    /**
     * Creates or updates an Agent resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param agentName The name of the Agent resource.
     * @param agent The Agent resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Agent resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentInner update(String resourceGroupName, String storageMoverName, String agentName, AgentUpdateParameters agent);

    /**
     * Deletes an Agent resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param agentName The name of the Agent resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String storageMoverName, String agentName);

    /**
     * Deletes an Agent resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param agentName The name of the Agent resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String storageMoverName, String agentName, Context context);

    /**
     * Deletes an Agent resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param agentName The name of the Agent resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String storageMoverName, String agentName);

    /**
     * Deletes an Agent resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param agentName The name of the Agent resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String storageMoverName, String agentName, Context context);
}
