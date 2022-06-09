// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.synapse.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.synapse.fluent.models.ClusterPrincipalAssignmentInner;
import com.azure.resourcemanager.synapse.models.ClusterPrincipalAssignmentCheckNameRequest;

/** An instance of this class provides access to all the operations defined in KustoPoolPrincipalAssignmentsClient. */
public interface KustoPoolPrincipalAssignmentsClient {
    /**
     * Checks that the principal assignment name is valid and is not already in use.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param principalAssignmentName The name of the principal assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameResultInner checkNameAvailability(
        String workspaceName,
        String kustoPoolName,
        String resourceGroupName,
        ClusterPrincipalAssignmentCheckNameRequest principalAssignmentName);

    /**
     * Checks that the principal assignment name is valid and is not already in use.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param principalAssignmentName The name of the principal assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameResultInner> checkNameAvailabilityWithResponse(
        String workspaceName,
        String kustoPoolName,
        String resourceGroupName,
        ClusterPrincipalAssignmentCheckNameRequest principalAssignmentName,
        Context context);

    /**
     * Lists all Kusto pool principalAssignments.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto cluster principal assignments operation response as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterPrincipalAssignmentInner> list(
        String workspaceName, String kustoPoolName, String resourceGroupName);

    /**
     * Lists all Kusto pool principalAssignments.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto cluster principal assignments operation response as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterPrincipalAssignmentInner> list(
        String workspaceName, String kustoPoolName, String resourceGroupName, Context context);

    /**
     * Gets a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto pool principalAssignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterPrincipalAssignmentInner get(
        String workspaceName, String kustoPoolName, String principalAssignmentName, String resourceGroupName);

    /**
     * Gets a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto pool principalAssignment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterPrincipalAssignmentInner> getWithResponse(
        String workspaceName,
        String kustoPoolName,
        String principalAssignmentName,
        String resourceGroupName,
        Context context);

    /**
     * Create a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The Kusto pool principalAssignment's parameters supplied for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing a cluster principal assignment.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ClusterPrincipalAssignmentInner>, ClusterPrincipalAssignmentInner> beginCreateOrUpdate(
        String workspaceName,
        String kustoPoolName,
        String principalAssignmentName,
        String resourceGroupName,
        ClusterPrincipalAssignmentInner parameters);

    /**
     * Create a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The Kusto pool principalAssignment's parameters supplied for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing a cluster principal assignment.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ClusterPrincipalAssignmentInner>, ClusterPrincipalAssignmentInner> beginCreateOrUpdate(
        String workspaceName,
        String kustoPoolName,
        String principalAssignmentName,
        String resourceGroupName,
        ClusterPrincipalAssignmentInner parameters,
        Context context);

    /**
     * Create a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The Kusto pool principalAssignment's parameters supplied for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a cluster principal assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterPrincipalAssignmentInner createOrUpdate(
        String workspaceName,
        String kustoPoolName,
        String principalAssignmentName,
        String resourceGroupName,
        ClusterPrincipalAssignmentInner parameters);

    /**
     * Create a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The Kusto pool principalAssignment's parameters supplied for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a cluster principal assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterPrincipalAssignmentInner createOrUpdate(
        String workspaceName,
        String kustoPoolName,
        String principalAssignmentName,
        String resourceGroupName,
        ClusterPrincipalAssignmentInner parameters,
        Context context);

    /**
     * Deletes a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String workspaceName, String kustoPoolName, String principalAssignmentName, String resourceGroupName);

    /**
     * Deletes a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String workspaceName,
        String kustoPoolName,
        String principalAssignmentName,
        String resourceGroupName,
        Context context);

    /**
     * Deletes a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String workspaceName, String kustoPoolName, String principalAssignmentName, String resourceGroupName);

    /**
     * Deletes a Kusto pool principalAssignment.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String workspaceName,
        String kustoPoolName,
        String principalAssignmentName,
        String resourceGroupName,
        Context context);
}
