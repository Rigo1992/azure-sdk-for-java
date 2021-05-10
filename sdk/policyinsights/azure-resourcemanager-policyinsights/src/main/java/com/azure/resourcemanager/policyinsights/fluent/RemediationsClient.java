// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.fluent.models.RemediationDeploymentInner;
import com.azure.resourcemanager.policyinsights.fluent.models.RemediationInner;

/** An instance of this class provides access to all the operations defined in RemediationsClient. */
public interface RemediationsClient {
    /**
     * Gets all deployments for a remediation at management group scope.
     *
     * @param managementGroupId Management group ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deployments for a remediation at management group scope.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemediationDeploymentInner> listDeploymentsAtManagementGroup(
        String managementGroupId, String remediationName);

    /**
     * Gets all deployments for a remediation at management group scope.
     *
     * @param managementGroupId Management group ID.
     * @param remediationName The name of the remediation.
     * @param top Maximum number of records to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deployments for a remediation at management group scope.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemediationDeploymentInner> listDeploymentsAtManagementGroup(
        String managementGroupId, String remediationName, Integer top, Context context);

    /**
     * Cancels a remediation at management group scope.
     *
     * @param managementGroupId Management group ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemediationInner cancelAtManagementGroup(String managementGroupId, String remediationName);

    /**
     * Cancels a remediation at management group scope.
     *
     * @param managementGroupId Management group ID.
     * @param remediationName The name of the remediation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemediationInner> cancelAtManagementGroupWithResponse(
        String managementGroupId, String remediationName, Context context);

    /**
     * Gets all remediations for the management group.
     *
     * @param managementGroupId Management group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all remediations for the management group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemediationInner> listForManagementGroup(String managementGroupId);

    /**
     * Gets all remediations for the management group.
     *
     * @param managementGroupId Management group ID.
     * @param top Maximum number of records to return.
     * @param filter OData filter expression.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all remediations for the management group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemediationInner> listForManagementGroup(
        String managementGroupId, Integer top, String filter, Context context);

    /**
     * Creates or updates a remediation at management group scope.
     *
     * @param managementGroupId Management group ID.
     * @param remediationName The name of the remediation.
     * @param parameters The remediation parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemediationInner createOrUpdateAtManagementGroup(
        String managementGroupId, String remediationName, RemediationInner parameters);

    /**
     * Creates or updates a remediation at management group scope.
     *
     * @param managementGroupId Management group ID.
     * @param remediationName The name of the remediation.
     * @param parameters The remediation parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemediationInner> createOrUpdateAtManagementGroupWithResponse(
        String managementGroupId, String remediationName, RemediationInner parameters, Context context);

    /**
     * Gets an existing remediation at management group scope.
     *
     * @param managementGroupId Management group ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing remediation at management group scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemediationInner getAtManagementGroup(String managementGroupId, String remediationName);

    /**
     * Gets an existing remediation at management group scope.
     *
     * @param managementGroupId Management group ID.
     * @param remediationName The name of the remediation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing remediation at management group scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemediationInner> getAtManagementGroupWithResponse(
        String managementGroupId, String remediationName, Context context);

    /**
     * Deletes an existing remediation at management group scope.
     *
     * @param managementGroupId Management group ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemediationInner deleteAtManagementGroup(String managementGroupId, String remediationName);

    /**
     * Deletes an existing remediation at management group scope.
     *
     * @param managementGroupId Management group ID.
     * @param remediationName The name of the remediation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemediationInner> deleteAtManagementGroupWithResponse(
        String managementGroupId, String remediationName, Context context);

    /**
     * Gets all deployments for a remediation at subscription scope.
     *
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deployments for a remediation at subscription scope.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemediationDeploymentInner> listDeploymentsAtSubscription(String remediationName);

    /**
     * Gets all deployments for a remediation at subscription scope.
     *
     * @param remediationName The name of the remediation.
     * @param top Maximum number of records to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deployments for a remediation at subscription scope.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemediationDeploymentInner> listDeploymentsAtSubscription(
        String remediationName, Integer top, Context context);

    /**
     * Cancels a remediation at subscription scope.
     *
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemediationInner cancelAtSubscription(String remediationName);

    /**
     * Cancels a remediation at subscription scope.
     *
     * @param remediationName The name of the remediation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemediationInner> cancelAtSubscriptionWithResponse(String remediationName, Context context);

    /**
     * Gets all remediations for the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all remediations for the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemediationInner> list();

    /**
     * Gets all remediations for the subscription.
     *
     * @param top Maximum number of records to return.
     * @param filter OData filter expression.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all remediations for the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemediationInner> list(Integer top, String filter, Context context);

    /**
     * Creates or updates a remediation at subscription scope.
     *
     * @param remediationName The name of the remediation.
     * @param parameters The remediation parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemediationInner createOrUpdateAtSubscription(String remediationName, RemediationInner parameters);

    /**
     * Creates or updates a remediation at subscription scope.
     *
     * @param remediationName The name of the remediation.
     * @param parameters The remediation parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemediationInner> createOrUpdateAtSubscriptionWithResponse(
        String remediationName, RemediationInner parameters, Context context);

    /**
     * Gets an existing remediation at subscription scope.
     *
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing remediation at subscription scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemediationInner getAtSubscription(String remediationName);

    /**
     * Gets an existing remediation at subscription scope.
     *
     * @param remediationName The name of the remediation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing remediation at subscription scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemediationInner> getAtSubscriptionWithResponse(String remediationName, Context context);

    /**
     * Deletes an existing remediation at subscription scope.
     *
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemediationInner deleteAtSubscription(String remediationName);

    /**
     * Deletes an existing remediation at subscription scope.
     *
     * @param remediationName The name of the remediation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemediationInner> deleteAtSubscriptionWithResponse(String remediationName, Context context);

    /**
     * Gets all deployments for a remediation at resource group scope.
     *
     * @param resourceGroupName Resource group name.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deployments for a remediation at resource group scope.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemediationDeploymentInner> listDeploymentsAtResourceGroup(
        String resourceGroupName, String remediationName);

    /**
     * Gets all deployments for a remediation at resource group scope.
     *
     * @param resourceGroupName Resource group name.
     * @param remediationName The name of the remediation.
     * @param top Maximum number of records to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deployments for a remediation at resource group scope.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemediationDeploymentInner> listDeploymentsAtResourceGroup(
        String resourceGroupName, String remediationName, Integer top, Context context);

    /**
     * Cancels a remediation at resource group scope.
     *
     * @param resourceGroupName Resource group name.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemediationInner cancelAtResourceGroup(String resourceGroupName, String remediationName);

    /**
     * Cancels a remediation at resource group scope.
     *
     * @param resourceGroupName Resource group name.
     * @param remediationName The name of the remediation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemediationInner> cancelAtResourceGroupWithResponse(
        String resourceGroupName, String remediationName, Context context);

    /**
     * Gets all remediations for the subscription.
     *
     * @param resourceGroupName Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all remediations for the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemediationInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all remediations for the subscription.
     *
     * @param resourceGroupName Resource group name.
     * @param top Maximum number of records to return.
     * @param filter OData filter expression.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all remediations for the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemediationInner> listByResourceGroup(
        String resourceGroupName, Integer top, String filter, Context context);

    /**
     * Creates or updates a remediation at resource group scope.
     *
     * @param resourceGroupName Resource group name.
     * @param remediationName The name of the remediation.
     * @param parameters The remediation parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemediationInner createOrUpdateAtResourceGroup(
        String resourceGroupName, String remediationName, RemediationInner parameters);

    /**
     * Creates or updates a remediation at resource group scope.
     *
     * @param resourceGroupName Resource group name.
     * @param remediationName The name of the remediation.
     * @param parameters The remediation parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemediationInner> createOrUpdateAtResourceGroupWithResponse(
        String resourceGroupName, String remediationName, RemediationInner parameters, Context context);

    /**
     * Gets an existing remediation at resource group scope.
     *
     * @param resourceGroupName Resource group name.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing remediation at resource group scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemediationInner getByResourceGroup(String resourceGroupName, String remediationName);

    /**
     * Gets an existing remediation at resource group scope.
     *
     * @param resourceGroupName Resource group name.
     * @param remediationName The name of the remediation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing remediation at resource group scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemediationInner> getByResourceGroupWithResponse(
        String resourceGroupName, String remediationName, Context context);

    /**
     * Deletes an existing remediation at resource group scope.
     *
     * @param resourceGroupName Resource group name.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemediationInner delete(String resourceGroupName, String remediationName);

    /**
     * Deletes an existing remediation at resource group scope.
     *
     * @param resourceGroupName Resource group name.
     * @param remediationName The name of the remediation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemediationInner> deleteWithResponse(String resourceGroupName, String remediationName, Context context);

    /**
     * Gets all deployments for a remediation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deployments for a remediation at resource scope.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemediationDeploymentInner> listDeploymentsAtResource(String resourceId, String remediationName);

    /**
     * Gets all deployments for a remediation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param remediationName The name of the remediation.
     * @param top Maximum number of records to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deployments for a remediation at resource scope.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemediationDeploymentInner> listDeploymentsAtResource(
        String resourceId, String remediationName, Integer top, Context context);

    /**
     * Cancel a remediation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemediationInner cancelAtResource(String resourceId, String remediationName);

    /**
     * Cancel a remediation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param remediationName The name of the remediation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemediationInner> cancelAtResourceWithResponse(String resourceId, String remediationName, Context context);

    /**
     * Gets all remediations for a resource.
     *
     * @param resourceId Resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all remediations for a resource.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemediationInner> listForResource(String resourceId);

    /**
     * Gets all remediations for a resource.
     *
     * @param resourceId Resource ID.
     * @param top Maximum number of records to return.
     * @param filter OData filter expression.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all remediations for a resource.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemediationInner> listForResource(String resourceId, Integer top, String filter, Context context);

    /**
     * Creates or updates a remediation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param remediationName The name of the remediation.
     * @param parameters The remediation parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemediationInner createOrUpdateAtResource(String resourceId, String remediationName, RemediationInner parameters);

    /**
     * Creates or updates a remediation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param remediationName The name of the remediation.
     * @param parameters The remediation parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemediationInner> createOrUpdateAtResourceWithResponse(
        String resourceId, String remediationName, RemediationInner parameters, Context context);

    /**
     * Gets an existing remediation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing remediation at resource scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemediationInner getAtResource(String resourceId, String remediationName);

    /**
     * Gets an existing remediation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param remediationName The name of the remediation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing remediation at resource scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemediationInner> getAtResourceWithResponse(String resourceId, String remediationName, Context context);

    /**
     * Deletes an existing remediation at individual resource scope.
     *
     * @param resourceId Resource ID.
     * @param remediationName The name of the remediation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemediationInner deleteAtResource(String resourceId, String remediationName);

    /**
     * Deletes an existing remediation at individual resource scope.
     *
     * @param resourceId Resource ID.
     * @param remediationName The name of the remediation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remediation definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemediationInner> deleteAtResourceWithResponse(String resourceId, String remediationName, Context context);
}
