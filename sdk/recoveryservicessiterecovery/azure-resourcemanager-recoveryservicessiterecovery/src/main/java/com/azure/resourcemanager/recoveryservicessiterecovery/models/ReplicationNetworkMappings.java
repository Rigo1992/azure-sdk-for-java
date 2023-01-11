// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ReplicationNetworkMappings. */
public interface ReplicationNetworkMappings {
    /**
     * Gets all the network mappings under a network.
     *
     * <p>Lists all ASR network mappings for the specified network.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of network mappings as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkMapping> listByReplicationNetworks(
        String resourceName, String resourceGroupName, String fabricName, String networkName);

    /**
     * Gets all the network mappings under a network.
     *
     * <p>Lists all ASR network mappings for the specified network.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of network mappings as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkMapping> listByReplicationNetworks(
        String resourceName, String resourceGroupName, String fabricName, String networkName, Context context);

    /**
     * Gets network mapping by name.
     *
     * <p>Gets the details of an ASR network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName Network mapping name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an ASR network mapping along with {@link Response}.
     */
    Response<NetworkMapping> getWithResponse(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName,
        Context context);

    /**
     * Gets network mapping by name.
     *
     * <p>Gets the details of an ASR network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName Network mapping name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an ASR network mapping.
     */
    NetworkMapping get(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName);

    /**
     * Delete network mapping.
     *
     * <p>The operation to delete a network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName ARM Resource Name for network mapping.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName);

    /**
     * Delete network mapping.
     *
     * <p>The operation to delete a network mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Primary fabric name.
     * @param networkName Primary network name.
     * @param networkMappingName ARM Resource Name for network mapping.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String networkName,
        String networkMappingName,
        Context context);

    /**
     * Gets all the network mappings under a vault.
     *
     * <p>Lists all ASR network mappings in the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of network mappings as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkMapping> list(String resourceName, String resourceGroupName);

    /**
     * Gets all the network mappings under a vault.
     *
     * <p>Lists all ASR network mappings in the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of network mappings as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkMapping> list(String resourceName, String resourceGroupName, Context context);

    /**
     * Gets network mapping by name.
     *
     * <p>Gets the details of an ASR network mapping.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an ASR network mapping along with {@link Response}.
     */
    NetworkMapping getById(String id);

    /**
     * Gets network mapping by name.
     *
     * <p>Gets the details of an ASR network mapping.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an ASR network mapping along with {@link Response}.
     */
    Response<NetworkMapping> getByIdWithResponse(String id, Context context);

    /**
     * Delete network mapping.
     *
     * <p>The operation to delete a network mapping.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete network mapping.
     *
     * <p>The operation to delete a network mapping.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new NetworkMapping resource.
     *
     * @param name resource name.
     * @return the first stage of the new NetworkMapping definition.
     */
    NetworkMapping.DefinitionStages.Blank define(String name);
}
