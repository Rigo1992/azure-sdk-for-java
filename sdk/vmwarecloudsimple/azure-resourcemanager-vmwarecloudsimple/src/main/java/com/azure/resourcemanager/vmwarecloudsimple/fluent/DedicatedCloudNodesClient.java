// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.DedicatedCloudNodeInner;
import com.azure.resourcemanager.vmwarecloudsimple.models.PatchPayload;

/** An instance of this class provides access to all the operations defined in DedicatedCloudNodesClient. */
public interface DedicatedCloudNodesClient {
    /**
     * Implements list of dedicated cloud nodes within subscription method
     *
     * <p>Returns list of dedicate cloud nodes within subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of dedicated nodes response model as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DedicatedCloudNodeInner> list();

    /**
     * Implements list of dedicated cloud nodes within subscription method
     *
     * <p>Returns list of dedicate cloud nodes within subscription.
     *
     * @param filter The filter to apply on the list operation.
     * @param top The maximum number of record sets to return.
     * @param skipToken to be used by nextLink implementation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of dedicated nodes response model as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DedicatedCloudNodeInner> list(String filter, Integer top, String skipToken, Context context);

    /**
     * Implements list of dedicated cloud nodes within RG method
     *
     * <p>Returns list of dedicate cloud nodes within resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of dedicated nodes response model as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DedicatedCloudNodeInner> listByResourceGroup(String resourceGroupName);

    /**
     * Implements list of dedicated cloud nodes within RG method
     *
     * <p>Returns list of dedicate cloud nodes within resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param filter The filter to apply on the list operation.
     * @param top The maximum number of record sets to return.
     * @param skipToken to be used by nextLink implementation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of dedicated nodes response model as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DedicatedCloudNodeInner> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, String skipToken, Context context);

    /**
     * Implements dedicated cloud node GET method
     *
     * <p>Returns dedicated cloud node.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudNodeName dedicated cloud node name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dedicated cloud node model along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DedicatedCloudNodeInner> getByResourceGroupWithResponse(
        String resourceGroupName, String dedicatedCloudNodeName, Context context);

    /**
     * Implements dedicated cloud node GET method
     *
     * <p>Returns dedicated cloud node.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudNodeName dedicated cloud node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dedicated cloud node model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedCloudNodeInner getByResourceGroup(String resourceGroupName, String dedicatedCloudNodeName);

    /**
     * Implements dedicated cloud node PUT method
     *
     * <p>Returns dedicated cloud node by its name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param referer referer url.
     * @param dedicatedCloudNodeName dedicated cloud node name.
     * @param dedicatedCloudNodeRequest Create Dedicated Cloud Node request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of dedicated cloud node model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DedicatedCloudNodeInner>, DedicatedCloudNodeInner> beginCreateOrUpdate(
        String resourceGroupName,
        String referer,
        String dedicatedCloudNodeName,
        DedicatedCloudNodeInner dedicatedCloudNodeRequest);

    /**
     * Implements dedicated cloud node PUT method
     *
     * <p>Returns dedicated cloud node by its name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param referer referer url.
     * @param dedicatedCloudNodeName dedicated cloud node name.
     * @param dedicatedCloudNodeRequest Create Dedicated Cloud Node request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of dedicated cloud node model.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DedicatedCloudNodeInner>, DedicatedCloudNodeInner> beginCreateOrUpdate(
        String resourceGroupName,
        String referer,
        String dedicatedCloudNodeName,
        DedicatedCloudNodeInner dedicatedCloudNodeRequest,
        Context context);

    /**
     * Implements dedicated cloud node PUT method
     *
     * <p>Returns dedicated cloud node by its name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param referer referer url.
     * @param dedicatedCloudNodeName dedicated cloud node name.
     * @param dedicatedCloudNodeRequest Create Dedicated Cloud Node request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dedicated cloud node model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedCloudNodeInner createOrUpdate(
        String resourceGroupName,
        String referer,
        String dedicatedCloudNodeName,
        DedicatedCloudNodeInner dedicatedCloudNodeRequest);

    /**
     * Implements dedicated cloud node PUT method
     *
     * <p>Returns dedicated cloud node by its name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param referer referer url.
     * @param dedicatedCloudNodeName dedicated cloud node name.
     * @param dedicatedCloudNodeRequest Create Dedicated Cloud Node request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dedicated cloud node model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedCloudNodeInner createOrUpdate(
        String resourceGroupName,
        String referer,
        String dedicatedCloudNodeName,
        DedicatedCloudNodeInner dedicatedCloudNodeRequest,
        Context context);

    /**
     * Implements dedicated cloud node DELETE method
     *
     * <p>Delete dedicated cloud node.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudNodeName dedicated cloud node name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String dedicatedCloudNodeName, Context context);

    /**
     * Implements dedicated cloud node DELETE method
     *
     * <p>Delete dedicated cloud node.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudNodeName dedicated cloud node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String dedicatedCloudNodeName);

    /**
     * Implements dedicated cloud node PATCH method
     *
     * <p>Patches dedicated node properties.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudNodeName dedicated cloud node name.
     * @param dedicatedCloudNodeRequest Patch Dedicated Cloud Node request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dedicated cloud node model along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DedicatedCloudNodeInner> updateWithResponse(
        String resourceGroupName,
        String dedicatedCloudNodeName,
        PatchPayload dedicatedCloudNodeRequest,
        Context context);

    /**
     * Implements dedicated cloud node PATCH method
     *
     * <p>Patches dedicated node properties.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudNodeName dedicated cloud node name.
     * @param dedicatedCloudNodeRequest Patch Dedicated Cloud Node request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dedicated cloud node model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedCloudNodeInner update(
        String resourceGroupName, String dedicatedCloudNodeName, PatchPayload dedicatedCloudNodeRequest);
}
