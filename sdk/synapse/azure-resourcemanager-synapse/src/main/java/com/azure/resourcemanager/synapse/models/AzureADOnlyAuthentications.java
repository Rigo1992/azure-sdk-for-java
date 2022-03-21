// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AzureADOnlyAuthentications. */
public interface AzureADOnlyAuthentications {
    /**
     * Gets a Azure Active Directory only authentication property.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param azureADOnlyAuthenticationName name of the property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Azure Active Directory only authentication property.
     */
    AzureADOnlyAuthentication get(
        String resourceGroupName, String workspaceName, AzureADOnlyAuthenticationName azureADOnlyAuthenticationName);

    /**
     * Gets a Azure Active Directory only authentication property.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param azureADOnlyAuthenticationName name of the property.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Azure Active Directory only authentication property along with {@link Response}.
     */
    Response<AzureADOnlyAuthentication> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        AzureADOnlyAuthenticationName azureADOnlyAuthenticationName,
        Context context);

    /**
     * Gets a list of Azure Active Directory only authentication property for a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure Active Directory only authentication property for a workspace.
     */
    PagedIterable<AzureADOnlyAuthentication> list(String resourceGroupName, String workspaceName);

    /**
     * Gets a list of Azure Active Directory only authentication property for a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure Active Directory only authentication property for a workspace.
     */
    PagedIterable<AzureADOnlyAuthentication> list(String resourceGroupName, String workspaceName, Context context);

    /**
     * Gets a Azure Active Directory only authentication property.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Azure Active Directory only authentication property along with {@link Response}.
     */
    AzureADOnlyAuthentication getById(String id);

    /**
     * Gets a Azure Active Directory only authentication property.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Azure Active Directory only authentication property along with {@link Response}.
     */
    Response<AzureADOnlyAuthentication> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AzureADOnlyAuthentication resource.
     *
     * @param name resource name.
     * @return the first stage of the new AzureADOnlyAuthentication definition.
     */
    AzureADOnlyAuthentication.DefinitionStages.Blank define(AzureADOnlyAuthenticationName name);
}
