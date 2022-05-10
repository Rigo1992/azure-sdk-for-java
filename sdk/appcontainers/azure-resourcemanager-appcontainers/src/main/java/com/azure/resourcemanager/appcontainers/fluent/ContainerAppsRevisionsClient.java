// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.RevisionInner;

/** An instance of this class provides access to all the operations defined in ContainerAppsRevisionsClient. */
public interface ContainerAppsRevisionsClient {
    /**
     * Get the Revisions for a given Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App for which Revisions are needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Revisions for a given Container App as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RevisionInner> listRevisions(String resourceGroupName, String containerAppName);

    /**
     * Get the Revisions for a given Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App for which Revisions are needed.
     * @param filter The filter to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Revisions for a given Container App as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RevisionInner> listRevisions(
        String resourceGroupName, String containerAppName, String filter, Context context);

    /**
     * Get a revision of a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param name Name of the Container App Revision.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a revision of a Container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RevisionInner getRevision(String resourceGroupName, String containerAppName, String name);

    /**
     * Get a revision of a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param name Name of the Container App Revision.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a revision of a Container App along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RevisionInner> getRevisionWithResponse(
        String resourceGroupName, String containerAppName, String name, Context context);

    /**
     * Activates a revision for a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param name Name of the Container App Revision.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void activateRevision(String resourceGroupName, String containerAppName, String name);

    /**
     * Activates a revision for a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param name Name of the Container App Revision.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> activateRevisionWithResponse(
        String resourceGroupName, String containerAppName, String name, Context context);

    /**
     * Deactivates a revision for a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param name Name of the Container App Revision.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deactivateRevision(String resourceGroupName, String containerAppName, String name);

    /**
     * Deactivates a revision for a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param name Name of the Container App Revision.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deactivateRevisionWithResponse(
        String resourceGroupName, String containerAppName, String name, Context context);

    /**
     * Restarts a revision for a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param name Name of the Container App Revision.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restartRevision(String resourceGroupName, String containerAppName, String name);

    /**
     * Restarts a revision for a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param name Name of the Container App Revision.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> restartRevisionWithResponse(
        String resourceGroupName, String containerAppName, String name, Context context);
}
