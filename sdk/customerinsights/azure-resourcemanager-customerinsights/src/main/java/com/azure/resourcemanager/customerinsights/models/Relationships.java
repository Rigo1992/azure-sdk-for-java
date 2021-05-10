// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Relationships. */
public interface Relationships {
    /**
     * Gets information about the specified relationship.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param relationshipName The name of the relationship.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified relationship.
     */
    RelationshipResourceFormat get(String resourceGroupName, String hubName, String relationshipName);

    /**
     * Gets information about the specified relationship.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param relationshipName The name of the relationship.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified relationship.
     */
    Response<RelationshipResourceFormat> getWithResponse(
        String resourceGroupName, String hubName, String relationshipName, Context context);

    /**
     * Deletes a relationship within a hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param relationshipName The name of the relationship.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String hubName, String relationshipName);

    /**
     * Deletes a relationship within a hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param relationshipName The name of the relationship.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String hubName, String relationshipName, Context context);

    /**
     * Gets all relationships in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all relationships in the hub.
     */
    PagedIterable<RelationshipResourceFormat> listByHub(String resourceGroupName, String hubName);

    /**
     * Gets all relationships in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all relationships in the hub.
     */
    PagedIterable<RelationshipResourceFormat> listByHub(String resourceGroupName, String hubName, Context context);

    /**
     * Gets information about the specified relationship.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified relationship.
     */
    RelationshipResourceFormat getById(String id);

    /**
     * Gets information about the specified relationship.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified relationship.
     */
    Response<RelationshipResourceFormat> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a relationship within a hub.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a relationship within a hub.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new RelationshipResourceFormat resource.
     *
     * @param name resource name.
     * @return the first stage of the new RelationshipResourceFormat definition.
     */
    RelationshipResourceFormat.DefinitionStages.Blank define(String name);
}
