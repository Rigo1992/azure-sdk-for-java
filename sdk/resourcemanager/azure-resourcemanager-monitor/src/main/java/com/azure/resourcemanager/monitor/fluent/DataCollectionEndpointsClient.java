// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.fluent.models.DataCollectionEndpointResourceInner;
import com.azure.resourcemanager.monitor.models.ResourceForUpdate;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in DataCollectionEndpointsClient.
 */
public interface DataCollectionEndpointsClient extends InnerSupportsGet<DataCollectionEndpointResourceInner>, InnerSupportsListing<DataCollectionEndpointResourceInner>, InnerSupportsDelete<Void> {
    /**
     * Lists all data collection endpoints in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DataCollectionEndpointResourceInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists all data collection endpoints in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataCollectionEndpointResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all data collection endpoints in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataCollectionEndpointResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all data collection endpoints in the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DataCollectionEndpointResourceInner> listAsync();

    /**
     * Lists all data collection endpoints in the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataCollectionEndpointResourceInner> list();

    /**
     * Lists all data collection endpoints in the specified subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pageable list of resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataCollectionEndpointResourceInner> list(Context context);

    /**
     * Returns the specified data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DataCollectionEndpointResourceInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String dataCollectionEndpointName);

    /**
     * Returns the specified data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DataCollectionEndpointResourceInner> getByResourceGroupAsync(String resourceGroupName, String dataCollectionEndpointName);

    /**
     * Returns the specified data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataCollectionEndpointResourceInner> getByResourceGroupWithResponse(String resourceGroupName, String dataCollectionEndpointName, Context context);

    /**
     * Returns the specified data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataCollectionEndpointResourceInner getByResourceGroup(String resourceGroupName, String dataCollectionEndpointName);

    /**
     * Creates or updates a data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @param body The payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DataCollectionEndpointResourceInner>> createWithResponseAsync(String resourceGroupName, String dataCollectionEndpointName, DataCollectionEndpointResourceInner body);

    /**
     * Creates or updates a data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DataCollectionEndpointResourceInner> createAsync(String resourceGroupName, String dataCollectionEndpointName);

    /**
     * Creates or updates a data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @param body The payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataCollectionEndpointResourceInner> createWithResponse(String resourceGroupName, String dataCollectionEndpointName, DataCollectionEndpointResourceInner body, Context context);

    /**
     * Creates or updates a data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataCollectionEndpointResourceInner create(String resourceGroupName, String dataCollectionEndpointName);

    /**
     * Updates part of a data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @param body The payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DataCollectionEndpointResourceInner>> updateWithResponseAsync(String resourceGroupName, String dataCollectionEndpointName, ResourceForUpdate body);

    /**
     * Updates part of a data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DataCollectionEndpointResourceInner> updateAsync(String resourceGroupName, String dataCollectionEndpointName);

    /**
     * Updates part of a data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @param body The payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataCollectionEndpointResourceInner> updateWithResponse(String resourceGroupName, String dataCollectionEndpointName, ResourceForUpdate body, Context context);

    /**
     * Updates part of a data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of ARM tracked top level resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataCollectionEndpointResourceInner update(String resourceGroupName, String dataCollectionEndpointName);

    /**
     * Deletes a data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String dataCollectionEndpointName);

    /**
     * Deletes a data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String dataCollectionEndpointName);

    /**
     * Deletes a data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String dataCollectionEndpointName, Context context);

    /**
     * Deletes a data collection endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param dataCollectionEndpointName The name of the data collection endpoint. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String dataCollectionEndpointName);
}
