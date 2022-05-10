// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.scvmm.fluent.models.CloudInner;
import com.azure.resourcemanager.scvmm.models.ResourcePatch;

/** An instance of this class provides access to all the operations defined in CloudsClient. */
public interface CloudsClient {
    /**
     * Implements Cloud GET method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudName Name of the Cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudInner getByResourceGroup(String resourceGroupName, String cloudName);

    /**
     * Implements Cloud GET method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudName Name of the Cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Clouds resource definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CloudInner> getByResourceGroupWithResponse(String resourceGroupName, String cloudName, Context context);

    /**
     * Onboards the ScVmm fabric cloud as an Azure cloud resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudName Name of the Cloud.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudInner>, CloudInner> beginCreateOrUpdate(
        String resourceGroupName, String cloudName, CloudInner body);

    /**
     * Onboards the ScVmm fabric cloud as an Azure cloud resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudName Name of the Cloud.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudInner>, CloudInner> beginCreateOrUpdate(
        String resourceGroupName, String cloudName, CloudInner body, Context context);

    /**
     * Onboards the ScVmm fabric cloud as an Azure cloud resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudName Name of the Cloud.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudInner createOrUpdate(String resourceGroupName, String cloudName, CloudInner body);

    /**
     * Onboards the ScVmm fabric cloud as an Azure cloud resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudName Name of the Cloud.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudInner createOrUpdate(String resourceGroupName, String cloudName, CloudInner body, Context context);

    /**
     * Deregisters the ScVmm fabric cloud from Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudName Name of the Cloud.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String cloudName, Boolean force);

    /**
     * Deregisters the ScVmm fabric cloud from Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudName Name of the Cloud.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String cloudName, Boolean force, Context context);

    /**
     * Deregisters the ScVmm fabric cloud from Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudName Name of the Cloud.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String cloudName, Boolean force);

    /**
     * Deregisters the ScVmm fabric cloud from Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudName Name of the Cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String cloudName);

    /**
     * Deregisters the ScVmm fabric cloud from Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudName Name of the Cloud.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String cloudName, Boolean force, Context context);

    /**
     * Updates the Clouds resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudName Name of the Cloud.
     * @param body Clouds patch payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudInner>, CloudInner> beginUpdate(
        String resourceGroupName, String cloudName, ResourcePatch body);

    /**
     * Updates the Clouds resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudName Name of the Cloud.
     * @param body Clouds patch payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CloudInner>, CloudInner> beginUpdate(
        String resourceGroupName, String cloudName, ResourcePatch body, Context context);

    /**
     * Updates the Clouds resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudName Name of the Cloud.
     * @param body Clouds patch payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudInner update(String resourceGroupName, String cloudName, ResourcePatch body);

    /**
     * Updates the Clouds resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudName Name of the Cloud.
     * @param body Clouds patch payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Clouds resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CloudInner update(String resourceGroupName, String cloudName, ResourcePatch body, Context context);

    /**
     * List of Clouds in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Clouds as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudInner> listByResourceGroup(String resourceGroupName);

    /**
     * List of Clouds in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Clouds as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List of Clouds in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Clouds as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudInner> list();

    /**
     * List of Clouds in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Clouds as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CloudInner> list(Context context);
}
