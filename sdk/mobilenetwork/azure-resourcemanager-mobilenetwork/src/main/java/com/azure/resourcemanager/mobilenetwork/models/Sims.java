// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Sims. */
public interface Sims {
    /**
     * Deletes the specified SIM.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param simName The name of the SIM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String simGroupName, String simName);

    /**
     * Deletes the specified SIM.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param simName The name of the SIM.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String simGroupName, String simName, Context context);

    /**
     * Gets information about the specified SIM.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param simName The name of the SIM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified SIM.
     */
    Sim get(String resourceGroupName, String simGroupName, String simName);

    /**
     * Gets information about the specified SIM.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param simName The name of the SIM.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified SIM along with {@link Response}.
     */
    Response<Sim> getWithResponse(String resourceGroupName, String simGroupName, String simName, Context context);

    /**
     * Gets all the SIMs in a SIM group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the SIMs in a SIM group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Sim> listBySimGroup(String resourceGroupName, String simGroupName);

    /**
     * Gets all the SIMs in a SIM group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the SIMs in a SIM group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Sim> listBySimGroup(String resourceGroupName, String simGroupName, Context context);

    /**
     * Gets information about the specified SIM.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified SIM along with {@link Response}.
     */
    Sim getById(String id);

    /**
     * Gets information about the specified SIM.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified SIM along with {@link Response}.
     */
    Response<Sim> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified SIM.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified SIM.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Sim resource.
     *
     * @param name resource name.
     * @return the first stage of the new Sim definition.
     */
    Sim.DefinitionStages.Blank define(String name);
}
