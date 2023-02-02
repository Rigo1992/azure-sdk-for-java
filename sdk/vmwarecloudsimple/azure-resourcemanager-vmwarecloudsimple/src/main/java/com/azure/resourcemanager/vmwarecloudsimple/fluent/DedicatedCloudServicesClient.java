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
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.DedicatedCloudServiceInner;
import com.azure.resourcemanager.vmwarecloudsimple.models.PatchPayload;

/** An instance of this class provides access to all the operations defined in DedicatedCloudServicesClient. */
public interface DedicatedCloudServicesClient {
    /**
     * Implements list of dedicatedCloudService objects within subscription method
     *
     * <p>Returns list of dedicated cloud services within a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of dedicated cloud services as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DedicatedCloudServiceInner> list();

    /**
     * Implements list of dedicatedCloudService objects within subscription method
     *
     * <p>Returns list of dedicated cloud services within a subscription.
     *
     * @param filter The filter to apply on the list operation.
     * @param top The maximum number of record sets to return.
     * @param skipToken to be used by nextLink implementation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of dedicated cloud services as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DedicatedCloudServiceInner> list(String filter, Integer top, String skipToken, Context context);

    /**
     * Implements list of dedicatedCloudService objects within RG method
     *
     * <p>Returns list of dedicated cloud services within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of dedicated cloud services as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DedicatedCloudServiceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Implements list of dedicatedCloudService objects within RG method
     *
     * <p>Returns list of dedicated cloud services within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param filter The filter to apply on the list operation.
     * @param top The maximum number of record sets to return.
     * @param skipToken to be used by nextLink implementation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of dedicated cloud services as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DedicatedCloudServiceInner> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, String skipToken, Context context);

    /**
     * Implements dedicatedCloudService GET method
     *
     * <p>Returns Dedicate Cloud Service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudServiceName dedicated cloud Service name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dedicated cloud service model along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DedicatedCloudServiceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String dedicatedCloudServiceName, Context context);

    /**
     * Implements dedicatedCloudService GET method
     *
     * <p>Returns Dedicate Cloud Service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudServiceName dedicated cloud Service name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dedicated cloud service model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedCloudServiceInner getByResourceGroup(String resourceGroupName, String dedicatedCloudServiceName);

    /**
     * Implements dedicated cloud service PUT method
     *
     * <p>Create dedicate cloud service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudServiceName dedicated cloud Service name.
     * @param dedicatedCloudServiceRequest Create Dedicated Cloud Service request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dedicated cloud service model along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DedicatedCloudServiceInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String dedicatedCloudServiceName,
        DedicatedCloudServiceInner dedicatedCloudServiceRequest,
        Context context);

    /**
     * Implements dedicated cloud service PUT method
     *
     * <p>Create dedicate cloud service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudServiceName dedicated cloud Service name.
     * @param dedicatedCloudServiceRequest Create Dedicated Cloud Service request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dedicated cloud service model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedCloudServiceInner createOrUpdate(
        String resourceGroupName,
        String dedicatedCloudServiceName,
        DedicatedCloudServiceInner dedicatedCloudServiceRequest);

    /**
     * Implements dedicatedCloudService DELETE method
     *
     * <p>Delete dedicate cloud service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudServiceName dedicated cloud service name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String dedicatedCloudServiceName);

    /**
     * Implements dedicatedCloudService DELETE method
     *
     * <p>Delete dedicate cloud service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudServiceName dedicated cloud service name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String dedicatedCloudServiceName, Context context);

    /**
     * Implements dedicatedCloudService DELETE method
     *
     * <p>Delete dedicate cloud service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudServiceName dedicated cloud service name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String dedicatedCloudServiceName);

    /**
     * Implements dedicatedCloudService DELETE method
     *
     * <p>Delete dedicate cloud service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudServiceName dedicated cloud service name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String dedicatedCloudServiceName, Context context);

    /**
     * Implements dedicatedCloudService PATCH method
     *
     * <p>Patch dedicated cloud service's properties.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudServiceName dedicated cloud service name.
     * @param dedicatedCloudServiceRequest Patch Dedicated Cloud Service request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dedicated cloud service model along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DedicatedCloudServiceInner> updateWithResponse(
        String resourceGroupName,
        String dedicatedCloudServiceName,
        PatchPayload dedicatedCloudServiceRequest,
        Context context);

    /**
     * Implements dedicatedCloudService PATCH method
     *
     * <p>Patch dedicated cloud service's properties.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudServiceName dedicated cloud service name.
     * @param dedicatedCloudServiceRequest Patch Dedicated Cloud Service request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dedicated cloud service model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedCloudServiceInner update(
        String resourceGroupName, String dedicatedCloudServiceName, PatchPayload dedicatedCloudServiceRequest);
}
