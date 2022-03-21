// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.fluent.models.MetadataModelInner;
import com.azure.resourcemanager.securityinsights.models.MetadataPatch;

/** An instance of this class provides access to all the operations defined in MetadatasClient. */
public interface MetadatasClient {
    /**
     * List of all metadata.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the metadata.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MetadataModelInner> list(String resourceGroupName, String workspaceName);

    /**
     * List of all metadata.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param filter Filters the results, based on a Boolean condition. Optional.
     * @param orderby Sorts the results. Optional.
     * @param top Returns only the first n results. Optional.
     * @param skip Used to skip n elements in the OData query (offset). Returns a nextLink to the next page of results
     *     if there are any left.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the metadata.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MetadataModelInner> list(
        String resourceGroupName,
        String workspaceName,
        String filter,
        String orderby,
        Integer top,
        Integer skip,
        Context context);

    /**
     * Get a Metadata.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param metadataName The Metadata name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Metadata.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MetadataModelInner get(String resourceGroupName, String workspaceName, String metadataName);

    /**
     * Get a Metadata.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param metadataName The Metadata name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Metadata along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MetadataModelInner> getWithResponse(
        String resourceGroupName, String workspaceName, String metadataName, Context context);

    /**
     * Delete a Metadata.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param metadataName The Metadata name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String metadataName);

    /**
     * Delete a Metadata.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param metadataName The Metadata name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String metadataName, Context context);

    /**
     * Create a Metadata.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param metadataName The Metadata name.
     * @param metadata Metadata resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MetadataModelInner create(
        String resourceGroupName, String workspaceName, String metadataName, MetadataModelInner metadata);

    /**
     * Create a Metadata.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param metadataName The Metadata name.
     * @param metadata Metadata resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata resource definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MetadataModelInner> createWithResponse(
        String resourceGroupName,
        String workspaceName,
        String metadataName,
        MetadataModelInner metadata,
        Context context);

    /**
     * Update an existing Metadata.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param metadataName The Metadata name.
     * @param metadataPatch Partial metadata request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MetadataModelInner update(
        String resourceGroupName, String workspaceName, String metadataName, MetadataPatch metadataPatch);

    /**
     * Update an existing Metadata.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param metadataName The Metadata name.
     * @param metadataPatch Partial metadata request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata resource definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MetadataModelInner> updateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String metadataName,
        MetadataPatch metadataPatch,
        Context context);
}
