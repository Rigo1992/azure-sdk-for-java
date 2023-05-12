// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.fluent.models.DedicatedHostInner;
import com.azure.resourcemanager.compute.models.DedicatedHostUpdate;
import com.azure.resourcemanager.compute.models.InstanceViewTypes;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DedicatedHostsClient. */
public interface DedicatedHostsClient {
    /**
     * Create or update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Create Dedicated Host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String hostGroupName, String hostname, DedicatedHostInner parameters);

    /**
     * Create or update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Create Dedicated Host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<DedicatedHostInner>, DedicatedHostInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String hostGroupName, String hostname, DedicatedHostInner parameters);

    /**
     * Create or update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Create Dedicated Host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DedicatedHostInner>, DedicatedHostInner> beginCreateOrUpdate(
        String resourceGroupName, String hostGroupName, String hostname, DedicatedHostInner parameters);

    /**
     * Create or update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Create Dedicated Host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DedicatedHostInner>, DedicatedHostInner> beginCreateOrUpdate(
        String resourceGroupName,
        String hostGroupName,
        String hostname,
        DedicatedHostInner parameters,
        Context context);

    /**
     * Create or update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Create Dedicated Host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DedicatedHostInner> createOrUpdateAsync(
        String resourceGroupName, String hostGroupName, String hostname, DedicatedHostInner parameters);

    /**
     * Create or update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Create Dedicated Host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedHostInner createOrUpdate(
        String resourceGroupName, String hostGroupName, String hostname, DedicatedHostInner parameters);

    /**
     * Create or update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Create Dedicated Host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedHostInner createOrUpdate(
        String resourceGroupName,
        String hostGroupName,
        String hostname,
        DedicatedHostInner parameters,
        Context context);

    /**
     * Update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Update Dedicated Host operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName, String hostGroupName, String hostname, DedicatedHostUpdate parameters);

    /**
     * Update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Update Dedicated Host operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<DedicatedHostInner>, DedicatedHostInner> beginUpdateAsync(
        String resourceGroupName, String hostGroupName, String hostname, DedicatedHostUpdate parameters);

    /**
     * Update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Update Dedicated Host operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DedicatedHostInner>, DedicatedHostInner> beginUpdate(
        String resourceGroupName, String hostGroupName, String hostname, DedicatedHostUpdate parameters);

    /**
     * Update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Update Dedicated Host operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DedicatedHostInner>, DedicatedHostInner> beginUpdate(
        String resourceGroupName,
        String hostGroupName,
        String hostname,
        DedicatedHostUpdate parameters,
        Context context);

    /**
     * Update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Update Dedicated Host operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DedicatedHostInner> updateAsync(
        String resourceGroupName, String hostGroupName, String hostname, DedicatedHostUpdate parameters);

    /**
     * Update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Update Dedicated Host operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedHostInner update(
        String resourceGroupName, String hostGroupName, String hostname, DedicatedHostUpdate parameters);

    /**
     * Update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Update Dedicated Host operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedHostInner update(
        String resourceGroupName,
        String hostGroupName,
        String hostname,
        DedicatedHostUpdate parameters,
        Context context);

    /**
     * Delete a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Delete a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Delete a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Delete a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String hostGroupName, String hostname, Context context);

    /**
     * Delete a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Delete a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Delete a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hostGroupName, String hostname, Context context);

    /**
     * Retrieves information about a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @param expand The expand expression to apply on the operation. 'InstanceView' will retrieve the list of instance
     *     views of the dedicated host. 'UserData' is not supported for dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DedicatedHostInner>> getWithResponseAsync(
        String resourceGroupName, String hostGroupName, String hostname, InstanceViewTypes expand);

    /**
     * Retrieves information about a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DedicatedHostInner> getAsync(String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Retrieves information about a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @param expand The expand expression to apply on the operation. 'InstanceView' will retrieve the list of instance
     *     views of the dedicated host. 'UserData' is not supported for dedicated host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DedicatedHostInner> getWithResponse(
        String resourceGroupName, String hostGroupName, String hostname, InstanceViewTypes expand, Context context);

    /**
     * Retrieves information about a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedHostInner get(String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Lists all of the dedicated hosts in the specified dedicated host group. Use the nextLink property in the response
     * to get the next page of dedicated hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list dedicated host operation response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DedicatedHostInner> listByHostGroupAsync(String resourceGroupName, String hostGroupName);

    /**
     * Lists all of the dedicated hosts in the specified dedicated host group. Use the nextLink property in the response
     * to get the next page of dedicated hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list dedicated host operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DedicatedHostInner> listByHostGroup(String resourceGroupName, String hostGroupName);

    /**
     * Lists all of the dedicated hosts in the specified dedicated host group. Use the nextLink property in the response
     * to get the next page of dedicated hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list dedicated host operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DedicatedHostInner> listByHostGroup(String resourceGroupName, String hostGroupName, Context context);

    /**
     * Restart the dedicated host. The operation will complete successfully once the dedicated host has restarted and is
     * running. To determine the health of VMs deployed on the dedicated host after the restart check the Resource
     * Health Center in the Azure Portal. Please refer to
     * https://docs.microsoft.com/azure/service-health/resource-health-overview for more details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> restartWithResponseAsync(
        String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Restart the dedicated host. The operation will complete successfully once the dedicated host has restarted and is
     * running. To determine the health of VMs deployed on the dedicated host after the restart check the Resource
     * Health Center in the Azure Portal. Please refer to
     * https://docs.microsoft.com/azure/service-health/resource-health-overview for more details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginRestartAsync(
        String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Restart the dedicated host. The operation will complete successfully once the dedicated host has restarted and is
     * running. To determine the health of VMs deployed on the dedicated host after the restart check the Resource
     * Health Center in the Azure Portal. Please refer to
     * https://docs.microsoft.com/azure/service-health/resource-health-overview for more details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestart(String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Restart the dedicated host. The operation will complete successfully once the dedicated host has restarted and is
     * running. To determine the health of VMs deployed on the dedicated host after the restart check the Resource
     * Health Center in the Azure Portal. Please refer to
     * https://docs.microsoft.com/azure/service-health/resource-health-overview for more details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestart(
        String resourceGroupName, String hostGroupName, String hostname, Context context);

    /**
     * Restart the dedicated host. The operation will complete successfully once the dedicated host has restarted and is
     * running. To determine the health of VMs deployed on the dedicated host after the restart check the Resource
     * Health Center in the Azure Portal. Please refer to
     * https://docs.microsoft.com/azure/service-health/resource-health-overview for more details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> restartAsync(String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Restart the dedicated host. The operation will complete successfully once the dedicated host has restarted and is
     * running. To determine the health of VMs deployed on the dedicated host after the restart check the Resource
     * Health Center in the Azure Portal. Please refer to
     * https://docs.microsoft.com/azure/service-health/resource-health-overview for more details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Restart the dedicated host. The operation will complete successfully once the dedicated host has restarted and is
     * running. To determine the health of VMs deployed on the dedicated host after the restart check the Resource
     * Health Center in the Azure Portal. Please refer to
     * https://docs.microsoft.com/azure/service-health/resource-health-overview for more details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceGroupName, String hostGroupName, String hostname, Context context);

    /**
     * Lists all available dedicated host sizes to which the specified dedicated host can be resized. NOTE: The
     * dedicated host sizes provided can be used to only scale up the existing dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Dedicated Host sizes operation response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<String> listAvailableSizesAsync(String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Lists all available dedicated host sizes to which the specified dedicated host can be resized. NOTE: The
     * dedicated host sizes provided can be used to only scale up the existing dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Dedicated Host sizes operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<String> listAvailableSizes(String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Lists all available dedicated host sizes to which the specified dedicated host can be resized. NOTE: The
     * dedicated host sizes provided can be used to only scale up the existing dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Dedicated Host sizes operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<String> listAvailableSizes(
        String resourceGroupName, String hostGroupName, String hostname, Context context);
}
