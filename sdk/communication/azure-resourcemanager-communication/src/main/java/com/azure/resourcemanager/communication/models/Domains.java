// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Domains. */
public interface Domains {
    /**
     * Get the Domains resource and its properties.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param domainName The name of the Domains resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Domains resource and its properties.
     */
    DomainResource get(String resourceGroupName, String emailServiceName, String domainName);

    /**
     * Get the Domains resource and its properties.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param domainName The name of the Domains resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Domains resource and its properties along with {@link Response}.
     */
    Response<DomainResource> getWithResponse(
        String resourceGroupName, String emailServiceName, String domainName, Context context);

    /**
     * Operation to delete a Domains resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param domainName The name of the Domains resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String emailServiceName, String domainName);

    /**
     * Operation to delete a Domains resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param domainName The name of the Domains resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String emailServiceName, String domainName, Context context);

    /**
     * Handles requests to list all Domains resources under the parent EmailServices resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of Domains resource and a possible link for next set as paginated response
     *     with {@link PagedIterable}.
     */
    PagedIterable<DomainResource> listByEmailServiceResource(String resourceGroupName, String emailServiceName);

    /**
     * Handles requests to list all Domains resources under the parent EmailServices resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of Domains resource and a possible link for next set as paginated response
     *     with {@link PagedIterable}.
     */
    PagedIterable<DomainResource> listByEmailServiceResource(
        String resourceGroupName, String emailServiceName, Context context);

    /**
     * Initiate verification of DNS record.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param domainName The name of the Domains resource.
     * @param parameters Type of verification to be initiated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void initiateVerification(
        String resourceGroupName, String emailServiceName, String domainName, VerificationParameter parameters);

    /**
     * Initiate verification of DNS record.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param domainName The name of the Domains resource.
     * @param parameters Type of verification to be initiated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void initiateVerification(
        String resourceGroupName,
        String emailServiceName,
        String domainName,
        VerificationParameter parameters,
        Context context);

    /**
     * Cancel verification of DNS record.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param domainName The name of the Domains resource.
     * @param parameters Type of verification to be canceled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancelVerification(
        String resourceGroupName, String emailServiceName, String domainName, VerificationParameter parameters);

    /**
     * Cancel verification of DNS record.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param emailServiceName The name of the EmailService resource.
     * @param domainName The name of the Domains resource.
     * @param parameters Type of verification to be canceled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancelVerification(
        String resourceGroupName,
        String emailServiceName,
        String domainName,
        VerificationParameter parameters,
        Context context);

    /**
     * Get the Domains resource and its properties.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Domains resource and its properties along with {@link Response}.
     */
    DomainResource getById(String id);

    /**
     * Get the Domains resource and its properties.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Domains resource and its properties along with {@link Response}.
     */
    Response<DomainResource> getByIdWithResponse(String id, Context context);

    /**
     * Operation to delete a Domains resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Operation to delete a Domains resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DomainResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new DomainResource definition.
     */
    DomainResource.DefinitionStages.Blank define(String name);
}
