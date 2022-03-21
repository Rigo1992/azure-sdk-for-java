// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.DataMaskingRuleInner;

/** An instance of this class provides access to all the operations defined in DataMaskingRulesClient. */
public interface DataMaskingRulesClient {
    /**
     * Creates or updates a Sql pool data masking rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param dataMaskingRuleName The name of the data masking rule.
     * @param parameters The required parameters for creating or updating a data masking rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Sql pool data masking rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataMaskingRuleInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String dataMaskingRuleName,
        DataMaskingRuleInner parameters);

    /**
     * Creates or updates a Sql pool data masking rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param dataMaskingRuleName The name of the data masking rule.
     * @param parameters The required parameters for creating or updating a data masking rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Sql pool data masking rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataMaskingRuleInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String dataMaskingRuleName,
        DataMaskingRuleInner parameters,
        Context context);

    /**
     * Gets the specific Sql pool data masking rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param dataMaskingRuleName The name of the data masking rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific Sql pool data masking rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataMaskingRuleInner get(
        String resourceGroupName, String workspaceName, String sqlPoolName, String dataMaskingRuleName);

    /**
     * Gets the specific Sql pool data masking rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param dataMaskingRuleName The name of the data masking rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific Sql pool data masking rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataMaskingRuleInner> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String dataMaskingRuleName,
        Context context);

    /**
     * Gets a list of Sql pool data masking rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Sql pool data masking rules.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataMaskingRuleInner> listBySqlPool(
        String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * Gets a list of Sql pool data masking rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Sql pool data masking rules.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataMaskingRuleInner> listBySqlPool(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context);
}
