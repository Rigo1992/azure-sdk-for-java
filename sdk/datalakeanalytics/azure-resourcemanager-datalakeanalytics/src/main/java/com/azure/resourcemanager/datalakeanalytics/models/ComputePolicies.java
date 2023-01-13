// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ComputePolicies. */
public interface ComputePolicies {
    /**
     * Lists the Data Lake Analytics compute policies within the specified Data Lake Analytics account. An account
     * supports, at most, 50 policies.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of compute policies in the account as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ComputePolicy> listByAccount(String resourceGroupName, String accountName);

    /**
     * Lists the Data Lake Analytics compute policies within the specified Data Lake Analytics account. An account
     * supports, at most, 50 policies.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of compute policies in the account as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ComputePolicy> listByAccount(String resourceGroupName, String accountName, Context context);

    /**
     * Gets the specified Data Lake Analytics compute policy.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param computePolicyName The name of the compute policy to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Data Lake Analytics compute policy along with {@link Response}.
     */
    Response<ComputePolicy> getWithResponse(
        String resourceGroupName, String accountName, String computePolicyName, Context context);

    /**
     * Gets the specified Data Lake Analytics compute policy.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param computePolicyName The name of the compute policy to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Data Lake Analytics compute policy.
     */
    ComputePolicy get(String resourceGroupName, String accountName, String computePolicyName);

    /**
     * Deletes the specified compute policy from the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param computePolicyName The name of the compute policy to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String computePolicyName, Context context);

    /**
     * Deletes the specified compute policy from the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param computePolicyName The name of the compute policy to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String computePolicyName);

    /**
     * Gets the specified Data Lake Analytics compute policy.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Data Lake Analytics compute policy along with {@link Response}.
     */
    ComputePolicy getById(String id);

    /**
     * Gets the specified Data Lake Analytics compute policy.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Data Lake Analytics compute policy along with {@link Response}.
     */
    Response<ComputePolicy> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified compute policy from the specified Data Lake Analytics account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified compute policy from the specified Data Lake Analytics account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ComputePolicy resource.
     *
     * @param name resource name.
     * @return the first stage of the new ComputePolicy definition.
     */
    ComputePolicy.DefinitionStages.Blank define(String name);
}
