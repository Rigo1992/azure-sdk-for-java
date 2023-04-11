// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cognitiveservices.fluent.models.CommitmentPlanInner;

/** Resource collection API of CommitmentPlans. */
public interface CommitmentPlans {
    /**
     * Gets the commitmentPlans associated with the Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the commitmentPlans associated with the Cognitive Services account as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<CommitmentPlan> list(String resourceGroupName, String accountName);

    /**
     * Gets the commitmentPlans associated with the Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the commitmentPlans associated with the Cognitive Services account as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<CommitmentPlan> list(String resourceGroupName, String accountName, Context context);

    /**
     * Gets the specified commitmentPlans associated with the Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified commitmentPlans associated with the Cognitive Services account along with {@link Response}.
     */
    Response<CommitmentPlan> getWithResponse(
        String resourceGroupName, String accountName, String commitmentPlanName, Context context);

    /**
     * Gets the specified commitmentPlans associated with the Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified commitmentPlans associated with the Cognitive Services account.
     */
    CommitmentPlan get(String resourceGroupName, String accountName, String commitmentPlanName);

    /**
     * Update the state of specified commitmentPlans associated with the Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
     * @param commitmentPlan The commitmentPlan properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services account commitment plan along with {@link Response}.
     */
    Response<CommitmentPlan> createOrUpdateWithResponse(
        String resourceGroupName,
        String accountName,
        String commitmentPlanName,
        CommitmentPlanInner commitmentPlan,
        Context context);

    /**
     * Update the state of specified commitmentPlans associated with the Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
     * @param commitmentPlan The commitmentPlan properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services account commitment plan.
     */
    CommitmentPlan createOrUpdate(
        String resourceGroupName, String accountName, String commitmentPlanName, CommitmentPlanInner commitmentPlan);

    /**
     * Deletes the specified commitmentPlan associated with the Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String commitmentPlanName);

    /**
     * Deletes the specified commitmentPlan associated with the Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String commitmentPlanName, Context context);

    /**
     * Deletes a Cognitive Services commitment plan from the resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deletePlan(String resourceGroupName, String commitmentPlanName);

    /**
     * Deletes a Cognitive Services commitment plan from the resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deletePlan(String resourceGroupName, String commitmentPlanName, Context context);

    /**
     * Returns a Cognitive Services commitment plan specified by the parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services account commitment plan along with {@link Response}.
     */
    Response<CommitmentPlan> getByResourceGroupWithResponse(
        String resourceGroupName, String commitmentPlanName, Context context);

    /**
     * Returns a Cognitive Services commitment plan specified by the parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services account commitment plan.
     */
    CommitmentPlan getByResourceGroup(String resourceGroupName, String commitmentPlanName);

    /**
     * Returns all the resources of a particular type belonging to a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<CommitmentPlan> listByResourceGroup(String resourceGroupName);

    /**
     * Returns all the resources of a particular type belonging to a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<CommitmentPlan> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Returns all the resources of a particular type belonging to a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<CommitmentPlan> listPlansBySubscription();

    /**
     * Returns all the resources of a particular type belonging to a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<CommitmentPlan> listPlansBySubscription(Context context);

    /**
     * Gets the associations of the Cognitive Services commitment plan.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the associations of the Cognitive Services commitment plan as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<CommitmentPlanAccountAssociation> listAssociations(
        String resourceGroupName, String commitmentPlanName);

    /**
     * Gets the associations of the Cognitive Services commitment plan.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the associations of the Cognitive Services commitment plan as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<CommitmentPlanAccountAssociation> listAssociations(
        String resourceGroupName, String commitmentPlanName, Context context);

    /**
     * Gets the association of the Cognitive Services commitment plan.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
     * @param commitmentPlanAssociationName The name of the commitment plan association with the Cognitive Services
     *     Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the association of the Cognitive Services commitment plan along with {@link Response}.
     */
    Response<CommitmentPlanAccountAssociation> getAssociationWithResponse(
        String resourceGroupName, String commitmentPlanName, String commitmentPlanAssociationName, Context context);

    /**
     * Gets the association of the Cognitive Services commitment plan.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
     * @param commitmentPlanAssociationName The name of the commitment plan association with the Cognitive Services
     *     Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the association of the Cognitive Services commitment plan.
     */
    CommitmentPlanAccountAssociation getAssociation(
        String resourceGroupName, String commitmentPlanName, String commitmentPlanAssociationName);

    /**
     * Deletes the association of the Cognitive Services commitment plan.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
     * @param commitmentPlanAssociationName The name of the commitment plan association with the Cognitive Services
     *     Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAssociation(String resourceGroupName, String commitmentPlanName, String commitmentPlanAssociationName);

    /**
     * Deletes the association of the Cognitive Services commitment plan.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param commitmentPlanName The name of the commitmentPlan associated with the Cognitive Services Account.
     * @param commitmentPlanAssociationName The name of the commitment plan association with the Cognitive Services
     *     Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAssociation(
        String resourceGroupName, String commitmentPlanName, String commitmentPlanAssociationName, Context context);

    /**
     * Returns a Cognitive Services commitment plan specified by the parameters.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services account commitment plan along with {@link Response}.
     */
    CommitmentPlan getById(String id);

    /**
     * Returns a Cognitive Services commitment plan specified by the parameters.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services account commitment plan along with {@link Response}.
     */
    Response<CommitmentPlan> getByIdWithResponse(String id, Context context);

    /**
     * Gets the association of the Cognitive Services commitment plan.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the association of the Cognitive Services commitment plan along with {@link Response}.
     */
    CommitmentPlanAccountAssociation getAssociationById(String id);

    /**
     * Gets the association of the Cognitive Services commitment plan.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the association of the Cognitive Services commitment plan along with {@link Response}.
     */
    Response<CommitmentPlanAccountAssociation> getAssociationByIdWithResponse(String id, Context context);

    /**
     * Deletes a Cognitive Services commitment plan from the resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deletePlanById(String id);

    /**
     * Deletes a Cognitive Services commitment plan from the resource group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deletePlanByIdWithResponse(String id, Context context);

    /**
     * Deletes the association of the Cognitive Services commitment plan.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAssociationById(String id);

    /**
     * Deletes the association of the Cognitive Services commitment plan.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAssociationByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new CommitmentPlan resource.
     *
     * @param name resource name.
     * @return the first stage of the new CommitmentPlan definition.
     */
    CommitmentPlan.DefinitionStages.Blank definePlan(String name);

    /**
     * Begins definition for a new CommitmentPlanAccountAssociation resource.
     *
     * @param name resource name.
     * @return the first stage of the new CommitmentPlanAccountAssociation definition.
     */
    CommitmentPlanAccountAssociation.DefinitionStages.Blank defineAssociation(String name);
}
