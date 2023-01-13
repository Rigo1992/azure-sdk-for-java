// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.customerinsights.fluent.models.ViewResourceFormatInner;

/** An instance of this class provides access to all the operations defined in ViewsClient. */
public interface ViewsClient {
    /**
     * Gets all available views for given user in the specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param userId The user ID. Use * to retrieve hub level views.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available views for given user in the specified hub as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ViewResourceFormatInner> listByHub(String resourceGroupName, String hubName, String userId);

    /**
     * Gets all available views for given user in the specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param userId The user ID. Use * to retrieve hub level views.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available views for given user in the specified hub as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ViewResourceFormatInner> listByHub(
        String resourceGroupName, String hubName, String userId, Context context);

    /**
     * Creates a view or updates an existing view in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param viewName The name of the view.
     * @param parameters Parameters supplied to the CreateOrUpdate View operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the view resource format along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ViewResourceFormatInner> createOrUpdateWithResponse(
        String resourceGroupName, String hubName, String viewName, ViewResourceFormatInner parameters, Context context);

    /**
     * Creates a view or updates an existing view in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param viewName The name of the view.
     * @param parameters Parameters supplied to the CreateOrUpdate View operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the view resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ViewResourceFormatInner createOrUpdate(
        String resourceGroupName, String hubName, String viewName, ViewResourceFormatInner parameters);

    /**
     * Gets a view in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param viewName The name of the view.
     * @param userId The user ID. Use * to retrieve hub level view.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a view in the hub along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ViewResourceFormatInner> getWithResponse(
        String resourceGroupName, String hubName, String viewName, String userId, Context context);

    /**
     * Gets a view in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param viewName The name of the view.
     * @param userId The user ID. Use * to retrieve hub level view.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a view in the hub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ViewResourceFormatInner get(String resourceGroupName, String hubName, String viewName, String userId);

    /**
     * Deletes a view in the specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param viewName The name of the view.
     * @param userId The user ID. Use * to retrieve hub level view.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String hubName, String viewName, String userId, Context context);

    /**
     * Deletes a view in the specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param viewName The name of the view.
     * @param userId The user ID. Use * to retrieve hub level view.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hubName, String viewName, String userId);
}
