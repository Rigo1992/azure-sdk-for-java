// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.eventhubs.fluent.models.AvailableClustersListInner;
import com.azure.resourcemanager.eventhubs.fluent.models.ClusterInner;
import com.azure.resourcemanager.eventhubs.fluent.models.EHNamespaceIdListResultInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ClustersClient.
 */
public interface ClustersClient extends InnerSupportsGet<ClusterInner>, InnerSupportsListing<ClusterInner>, InnerSupportsDelete<Void> {
    /**
     * List the quantity of available pre-provisioned Event Hubs Clusters, indexed by Azure region.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Available Clusters operation along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AvailableClustersListInner>> listAvailableClusterRegionWithResponseAsync();

    /**
     * List the quantity of available pre-provisioned Event Hubs Clusters, indexed by Azure region.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Available Clusters operation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AvailableClustersListInner> listAvailableClusterRegionAsync();

    /**
     * List the quantity of available pre-provisioned Event Hubs Clusters, indexed by Azure region.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Available Clusters operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AvailableClustersListInner> listAvailableClusterRegionWithResponse(Context context);

    /**
     * List the quantity of available pre-provisioned Event Hubs Clusters, indexed by Azure region.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Available Clusters operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AvailableClustersListInner listAvailableClusterRegion();

    /**
     * Lists the available Event Hubs Clusters within an ARM resource group.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Event Hubs Clusters operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ClusterInner> listAsync();

    /**
     * Lists the available Event Hubs Clusters within an ARM resource group.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Event Hubs Clusters operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> list();

    /**
     * Lists the available Event Hubs Clusters within an ARM resource group.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Event Hubs Clusters operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> list(Context context);

    /**
     * Lists the available Event Hubs Clusters within an ARM resource group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Event Hubs Clusters operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ClusterInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists the available Event Hubs Clusters within an ARM resource group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Event Hubs Clusters operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists the available Event Hubs Clusters within an ARM resource group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Event Hubs Clusters operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the resource description of the specified Event Hubs Cluster.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource description of the specified Event Hubs Cluster along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ClusterInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String clusterName);

    /**
     * Gets the resource description of the specified Event Hubs Cluster.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource description of the specified Event Hubs Cluster on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ClusterInner> getByResourceGroupAsync(String resourceGroupName, String clusterName);

    /**
     * Gets the resource description of the specified Event Hubs Cluster.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource description of the specified Event Hubs Cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterInner> getByResourceGroupWithResponse(String resourceGroupName, String clusterName, Context context);

    /**
     * Gets the resource description of the specified Event Hubs Cluster.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource description of the specified Event Hubs Cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner getByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Creates or updates an instance of an Event Hubs Cluster.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters Parameters for creating a eventhub cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single Event Hubs Cluster resource in List or Get operations along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String clusterName, ClusterInner parameters);

    /**
     * Creates or updates an instance of an Event Hubs Cluster.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters Parameters for creating a eventhub cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of single Event Hubs Cluster resource in List or Get operations.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ClusterInner>, ClusterInner> beginCreateOrUpdateAsync(String resourceGroupName, String clusterName, ClusterInner parameters);

    /**
     * Creates or updates an instance of an Event Hubs Cluster.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters Parameters for creating a eventhub cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of single Event Hubs Cluster resource in List or Get operations.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginCreateOrUpdate(String resourceGroupName, String clusterName, ClusterInner parameters);

    /**
     * Creates or updates an instance of an Event Hubs Cluster.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters Parameters for creating a eventhub cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of single Event Hubs Cluster resource in List or Get operations.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginCreateOrUpdate(String resourceGroupName, String clusterName, ClusterInner parameters, Context context);

    /**
     * Creates or updates an instance of an Event Hubs Cluster.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters Parameters for creating a eventhub cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single Event Hubs Cluster resource in List or Get operations on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ClusterInner> createOrUpdateAsync(String resourceGroupName, String clusterName, ClusterInner parameters);

    /**
     * Creates or updates an instance of an Event Hubs Cluster.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters Parameters for creating a eventhub cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single Event Hubs Cluster resource in List or Get operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner createOrUpdate(String resourceGroupName, String clusterName, ClusterInner parameters);

    /**
     * Creates or updates an instance of an Event Hubs Cluster.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters Parameters for creating a eventhub cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single Event Hubs Cluster resource in List or Get operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner createOrUpdate(String resourceGroupName, String clusterName, ClusterInner parameters, Context context);

    /**
     * Modifies mutable properties on the Event Hubs Cluster. This operation is idempotent.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters The properties of the Event Hubs Cluster which should be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single Event Hubs Cluster resource in List or Get operations along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String clusterName, ClusterInner parameters);

    /**
     * Modifies mutable properties on the Event Hubs Cluster. This operation is idempotent.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters The properties of the Event Hubs Cluster which should be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of single Event Hubs Cluster resource in List or Get operations.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ClusterInner>, ClusterInner> beginUpdateAsync(String resourceGroupName, String clusterName, ClusterInner parameters);

    /**
     * Modifies mutable properties on the Event Hubs Cluster. This operation is idempotent.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters The properties of the Event Hubs Cluster which should be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of single Event Hubs Cluster resource in List or Get operations.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginUpdate(String resourceGroupName, String clusterName, ClusterInner parameters);

    /**
     * Modifies mutable properties on the Event Hubs Cluster. This operation is idempotent.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters The properties of the Event Hubs Cluster which should be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of single Event Hubs Cluster resource in List or Get operations.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginUpdate(String resourceGroupName, String clusterName, ClusterInner parameters, Context context);

    /**
     * Modifies mutable properties on the Event Hubs Cluster. This operation is idempotent.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters The properties of the Event Hubs Cluster which should be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single Event Hubs Cluster resource in List or Get operations on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ClusterInner> updateAsync(String resourceGroupName, String clusterName, ClusterInner parameters);

    /**
     * Modifies mutable properties on the Event Hubs Cluster. This operation is idempotent.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters The properties of the Event Hubs Cluster which should be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single Event Hubs Cluster resource in List or Get operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner update(String resourceGroupName, String clusterName, ClusterInner parameters);

    /**
     * Modifies mutable properties on the Event Hubs Cluster. This operation is idempotent.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters The properties of the Event Hubs Cluster which should be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return single Event Hubs Cluster resource in List or Get operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner update(String resourceGroupName, String clusterName, ClusterInner parameters, Context context);

    /**
     * Deletes an existing Event Hubs Cluster. This operation is idempotent.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String clusterName);

    /**
     * Deletes an existing Event Hubs Cluster. This operation is idempotent.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String clusterName);

    /**
     * Deletes an existing Event Hubs Cluster. This operation is idempotent.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName);

    /**
     * Deletes an existing Event Hubs Cluster. This operation is idempotent.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName, Context context);

    /**
     * Deletes an existing Event Hubs Cluster. This operation is idempotent.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String clusterName);

    /**
     * Deletes an existing Event Hubs Cluster. This operation is idempotent.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName);

    /**
     * Deletes an existing Event Hubs Cluster. This operation is idempotent.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, Context context);

    /**
     * List all Event Hubs Namespace IDs in an Event Hubs Dedicated Cluster.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace IDs operation along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<EHNamespaceIdListResultInner>> listNamespacesWithResponseAsync(String resourceGroupName, String clusterName);

    /**
     * List all Event Hubs Namespace IDs in an Event Hubs Dedicated Cluster.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace IDs operation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<EHNamespaceIdListResultInner> listNamespacesAsync(String resourceGroupName, String clusterName);

    /**
     * List all Event Hubs Namespace IDs in an Event Hubs Dedicated Cluster.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace IDs operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EHNamespaceIdListResultInner> listNamespacesWithResponse(String resourceGroupName, String clusterName, Context context);

    /**
     * List all Event Hubs Namespace IDs in an Event Hubs Dedicated Cluster.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace IDs operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EHNamespaceIdListResultInner listNamespaces(String resourceGroupName, String clusterName);
}
