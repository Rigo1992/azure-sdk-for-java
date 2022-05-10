// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of IntegrationRuntimes. */
public interface IntegrationRuntimes {
    /**
     * Get an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime.
     */
    IntegrationRuntimeResource get(String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Get an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param ifNoneMatch ETag of the integration runtime entity. Should only be specified for get. If the ETag matches
     *     the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime along with {@link Response}.
     */
    Response<IntegrationRuntimeResource> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String ifNoneMatch,
        Context context);

    /**
     * Delete an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Delete an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * Upgrade an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void upgrade(String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Upgrade an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> upgradeWithResponse(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * List all integration runtimes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration runtime resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<IntegrationRuntimeResource> listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * List all integration runtimes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration runtime resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<IntegrationRuntimeResource> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Start an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime status response.
     */
    IntegrationRuntimeStatusResponse start(
        String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Start an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime status response.
     */
    IntegrationRuntimeStatusResponse start(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * Stop an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Stop an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * Gets the list of outbound network dependencies for a given Azure-SSIS integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of outbound network dependencies for a given Azure-SSIS integration runtime.
     */
    IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse listOutboundNetworkDependenciesEndpoints(
        String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Gets the list of outbound network dependencies for a given Azure-SSIS integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of outbound network dependencies for a given Azure-SSIS integration runtime along with {@link
     *     Response}.
     */
    Response<IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse>
        listOutboundNetworkDependenciesEndpointsWithResponse(
            String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * Enable interactive query in integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enableInteractiveQuery(String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Enable interactive query in integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enableInteractiveQuery(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * Disable interactive query in integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void disableInteractiveQuery(String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Disable interactive query in integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void disableInteractiveQuery(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * Get an integration runtime.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime along with {@link Response}.
     */
    IntegrationRuntimeResource getById(String id);

    /**
     * Get an integration runtime.
     *
     * @param id the resource ID.
     * @param ifNoneMatch ETag of the integration runtime entity. Should only be specified for get. If the ETag matches
     *     the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime along with {@link Response}.
     */
    Response<IntegrationRuntimeResource> getByIdWithResponse(String id, String ifNoneMatch, Context context);

    /**
     * Delete an integration runtime.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete an integration runtime.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new IntegrationRuntimeResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new IntegrationRuntimeResource definition.
     */
    IntegrationRuntimeResource.DefinitionStages.Blank define(String name);
}
