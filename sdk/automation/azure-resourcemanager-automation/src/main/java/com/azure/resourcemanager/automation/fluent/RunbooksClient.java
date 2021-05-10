// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.automation.fluent.models.RunbookCreateOrUpdateParametersInner;
import com.azure.resourcemanager.automation.fluent.models.RunbookInner;
import com.azure.resourcemanager.automation.models.RunbookUpdateParameters;

/** An instance of this class provides access to all the operations defined in RunbooksClient. */
public interface RunbooksClient {
    /**
     * Publish runbook draft.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The parameters supplied to the publish runbook operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginPublish(
        String resourceGroupName, String automationAccountName, String runbookName);

    /**
     * Publish runbook draft.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The parameters supplied to the publish runbook operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginPublish(
        String resourceGroupName, String automationAccountName, String runbookName, Context context);

    /**
     * Publish runbook draft.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The parameters supplied to the publish runbook operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void publish(String resourceGroupName, String automationAccountName, String runbookName);

    /**
     * Publish runbook draft.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The parameters supplied to the publish runbook operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void publish(String resourceGroupName, String automationAccountName, String runbookName, Context context);

    /**
     * Retrieve the content of runbook identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    String getContent(String resourceGroupName, String automationAccountName, String runbookName);

    /**
     * Retrieve the content of runbook identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<String> getContentWithResponse(
        String resourceGroupName, String automationAccountName, String runbookName, Context context);

    /**
     * Retrieve the runbook identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the runbook type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RunbookInner get(String resourceGroupName, String automationAccountName, String runbookName);

    /**
     * Retrieve the runbook identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the runbook type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RunbookInner> getWithResponse(
        String resourceGroupName, String automationAccountName, String runbookName, Context context);

    /**
     * Create the runbook identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param parameters The create or update parameters for runbook. Provide either content link for a published
     *     runbook or draft, not both.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the runbook type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RunbookInner createOrUpdate(
        String resourceGroupName,
        String automationAccountName,
        String runbookName,
        RunbookCreateOrUpdateParametersInner parameters);

    /**
     * Create the runbook identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param parameters The create or update parameters for runbook. Provide either content link for a published
     *     runbook or draft, not both.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the runbook type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RunbookInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String runbookName,
        RunbookCreateOrUpdateParametersInner parameters,
        Context context);

    /**
     * Update the runbook identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param parameters The update parameters for runbook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the runbook type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RunbookInner update(
        String resourceGroupName, String automationAccountName, String runbookName, RunbookUpdateParameters parameters);

    /**
     * Update the runbook identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param parameters The update parameters for runbook.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the runbook type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RunbookInner> updateWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String runbookName,
        RunbookUpdateParameters parameters,
        Context context);

    /**
     * Delete the runbook by name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String automationAccountName, String runbookName);

    /**
     * Delete the runbook by name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String automationAccountName, String runbookName, Context context);

    /**
     * Retrieve a list of runbooks.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list runbook operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RunbookInner> listByAutomationAccount(String resourceGroupName, String automationAccountName);

    /**
     * Retrieve a list of runbooks.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list runbook operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RunbookInner> listByAutomationAccount(
        String resourceGroupName, String automationAccountName, Context context);
}
