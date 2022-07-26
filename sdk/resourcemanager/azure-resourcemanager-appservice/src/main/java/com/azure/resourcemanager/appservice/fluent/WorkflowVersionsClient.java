// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.fluent.models.WorkflowVersionInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in WorkflowVersionsClient. */
public interface WorkflowVersionsClient {
    /**
     * Gets a list of workflow versions.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param top The number of items to be included in the result.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow versions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<WorkflowVersionInner> listAsync(String resourceGroupName, String name, String workflowName, Integer top);

    /**
     * Gets a list of workflow versions.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow versions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<WorkflowVersionInner> listAsync(String resourceGroupName, String name, String workflowName);

    /**
     * Gets a list of workflow versions.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow versions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkflowVersionInner> list(String resourceGroupName, String name, String workflowName);

    /**
     * Gets a list of workflow versions.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param top The number of items to be included in the result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow versions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkflowVersionInner> list(
        String resourceGroupName, String name, String workflowName, Integer top, Context context);

    /**
     * Gets a workflow version.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param versionId The workflow versionId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow version along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<WorkflowVersionInner>> getWithResponseAsync(
        String resourceGroupName, String name, String workflowName, String versionId);

    /**
     * Gets a workflow version.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param versionId The workflow versionId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow version on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<WorkflowVersionInner> getAsync(String resourceGroupName, String name, String workflowName, String versionId);

    /**
     * Gets a workflow version.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param versionId The workflow versionId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkflowVersionInner get(String resourceGroupName, String name, String workflowName, String versionId);

    /**
     * Gets a workflow version.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param versionId The workflow versionId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow version along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkflowVersionInner> getWithResponse(
        String resourceGroupName, String name, String workflowName, String versionId, Context context);
}
