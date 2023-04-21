// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ProvisionedClustersOperations. */
public interface ProvisionedClustersOperations {
    /**
     * Gets the provisioned cluster
     *
     * <p>Gets the Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Hybrid AKS provisioned cluster along with {@link Response}.
     */
    Response<ProvisionedClustersResponse> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Gets the provisioned cluster
     *
     * <p>Gets the Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Hybrid AKS provisioned cluster.
     */
    ProvisionedClustersResponse getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Deletes the provisioned cluster
     *
     * <p>Deletes the Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String resourceName, Context context);

    /**
     * Deletes the provisioned cluster
     *
     * <p>Deletes the Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Gets the provisioned clusters in a resource group
     *
     * <p>Gets the Hybrid AKS provisioned cluster in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Hybrid AKS provisioned cluster in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ProvisionedClustersResponse> listByResourceGroup(String resourceGroupName);

    /**
     * Gets the provisioned clusters in a resource group
     *
     * <p>Gets the Hybrid AKS provisioned cluster in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Hybrid AKS provisioned cluster in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ProvisionedClustersResponse> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the provisioned clusters in a subscription
     *
     * <p>Gets the Hybrid AKS provisioned cluster in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Hybrid AKS provisioned cluster in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ProvisionedClustersResponse> list();

    /**
     * Gets the provisioned clusters in a subscription
     *
     * <p>Gets the Hybrid AKS provisioned cluster in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Hybrid AKS provisioned cluster in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ProvisionedClustersResponse> list(Context context);

    /**
     * Gets the upgrade profile of a provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the upgrade profile of a provisioned cluster along with {@link Response}.
     */
    Response<ProvisionedClusterUpgradeProfile> getUpgradeProfileWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Gets the upgrade profile of a provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the upgrade profile of a provisioned cluster.
     */
    ProvisionedClusterUpgradeProfile getUpgradeProfile(String resourceGroupName, String resourceName);

    /**
     * Upgrades the node image version of the cluster control plane and all agent pools to the latest.
     *
     * <p>Upgrading the node image version of a cluster applies the newest OS and runtime updates to the nodes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void upgradeNodeImageVersionForEntireCluster(String resourceGroupName, String resourceName);

    /**
     * Upgrades the node image version of the cluster control plane and all agent pools to the latest.
     *
     * <p>Upgrading the node image version of a cluster applies the newest OS and runtime updates to the nodes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void upgradeNodeImageVersionForEntireCluster(String resourceGroupName, String resourceName, Context context);

    /**
     * Gets the provisioned cluster
     *
     * <p>Gets the Hybrid AKS provisioned cluster.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Hybrid AKS provisioned cluster along with {@link Response}.
     */
    ProvisionedClustersResponse getById(String id);

    /**
     * Gets the provisioned cluster
     *
     * <p>Gets the Hybrid AKS provisioned cluster.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Hybrid AKS provisioned cluster along with {@link Response}.
     */
    Response<ProvisionedClustersResponse> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the provisioned cluster
     *
     * <p>Deletes the Hybrid AKS provisioned cluster.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the provisioned cluster
     *
     * <p>Deletes the Hybrid AKS provisioned cluster.
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
     * Begins definition for a new ProvisionedClustersResponse resource.
     *
     * @param name resource name.
     * @return the first stage of the new ProvisionedClustersResponse definition.
     */
    ProvisionedClustersResponse.DefinitionStages.Blank define(String name);
}
