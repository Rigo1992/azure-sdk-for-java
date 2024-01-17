// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.devcenter.fluent.models.CatalogInner;
import com.azure.resourcemanager.devcenter.fluent.models.SyncErrorDetailsInner;
import com.azure.resourcemanager.devcenter.models.CatalogUpdate;

/** An instance of this class provides access to all the operations defined in CatalogsClient. */
public interface CatalogsClient {
    /**
     * Lists catalogs for a devcenter.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the catalog list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CatalogInner> listByDevCenter(String resourceGroupName, String devCenterName);

    /**
     * Lists catalogs for a devcenter.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the catalog list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CatalogInner> listByDevCenter(
        String resourceGroupName, String devCenterName, Integer top, Context context);

    /**
     * Gets a catalog.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a catalog along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CatalogInner> getWithResponse(
        String resourceGroupName, String devCenterName, String catalogName, Context context);

    /**
     * Gets a catalog.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a catalog.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CatalogInner get(String resourceGroupName, String devCenterName, String catalogName);

    /**
     * Creates or updates a catalog.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param body Represents a catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a catalog.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CatalogInner>, CatalogInner> beginCreateOrUpdate(
        String resourceGroupName, String devCenterName, String catalogName, CatalogInner body);

    /**
     * Creates or updates a catalog.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param body Represents a catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a catalog.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CatalogInner>, CatalogInner> beginCreateOrUpdate(
        String resourceGroupName, String devCenterName, String catalogName, CatalogInner body, Context context);

    /**
     * Creates or updates a catalog.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param body Represents a catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a catalog.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CatalogInner createOrUpdate(String resourceGroupName, String devCenterName, String catalogName, CatalogInner body);

    /**
     * Creates or updates a catalog.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param body Represents a catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a catalog.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CatalogInner createOrUpdate(
        String resourceGroupName, String devCenterName, String catalogName, CatalogInner body, Context context);

    /**
     * Partially updates a catalog.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param body Updatable catalog properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a catalog.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CatalogInner>, CatalogInner> beginUpdate(
        String resourceGroupName, String devCenterName, String catalogName, CatalogUpdate body);

    /**
     * Partially updates a catalog.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param body Updatable catalog properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a catalog.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CatalogInner>, CatalogInner> beginUpdate(
        String resourceGroupName, String devCenterName, String catalogName, CatalogUpdate body, Context context);

    /**
     * Partially updates a catalog.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param body Updatable catalog properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a catalog.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CatalogInner update(String resourceGroupName, String devCenterName, String catalogName, CatalogUpdate body);

    /**
     * Partially updates a catalog.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param body Updatable catalog properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a catalog.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CatalogInner update(
        String resourceGroupName, String devCenterName, String catalogName, CatalogUpdate body, Context context);

    /**
     * Deletes a catalog resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String devCenterName, String catalogName);

    /**
     * Deletes a catalog resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String devCenterName, String catalogName, Context context);

    /**
     * Deletes a catalog resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String devCenterName, String catalogName);

    /**
     * Deletes a catalog resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String devCenterName, String catalogName, Context context);

    /**
     * Gets catalog synchronization error details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return catalog synchronization error details along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SyncErrorDetailsInner> getSyncErrorDetailsWithResponse(
        String resourceGroupName, String devCenterName, String catalogName, Context context);

    /**
     * Gets catalog synchronization error details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return catalog synchronization error details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncErrorDetailsInner getSyncErrorDetails(String resourceGroupName, String devCenterName, String catalogName);

    /**
     * Syncs templates for a template source.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginSync(String resourceGroupName, String devCenterName, String catalogName);

    /**
     * Syncs templates for a template source.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginSync(
        String resourceGroupName, String devCenterName, String catalogName, Context context);

    /**
     * Syncs templates for a template source.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void sync(String resourceGroupName, String devCenterName, String catalogName);

    /**
     * Syncs templates for a template source.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void sync(String resourceGroupName, String devCenterName, String catalogName, Context context);

    /**
     * Connects a catalog to enable syncing.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginConnect(String resourceGroupName, String devCenterName, String catalogName);

    /**
     * Connects a catalog to enable syncing.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginConnect(
        String resourceGroupName, String devCenterName, String catalogName, Context context);

    /**
     * Connects a catalog to enable syncing.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void connect(String resourceGroupName, String devCenterName, String catalogName);

    /**
     * Connects a catalog to enable syncing.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void connect(String resourceGroupName, String devCenterName, String catalogName, Context context);
}
