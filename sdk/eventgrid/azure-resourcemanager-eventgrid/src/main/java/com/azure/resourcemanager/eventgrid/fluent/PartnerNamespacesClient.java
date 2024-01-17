// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerNamespaceInner;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerNamespaceSharedAccessKeysInner;
import com.azure.resourcemanager.eventgrid.models.PartnerNamespaceRegenerateKeyRequest;
import com.azure.resourcemanager.eventgrid.models.PartnerNamespaceUpdateParameters;

/**
 * An instance of this class provides access to all the operations defined in PartnerNamespacesClient.
 */
public interface PartnerNamespacesClient {
    /**
     * Get a partner namespace.
     * 
     * Get properties of a partner namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a partner namespace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PartnerNamespaceInner> getByResourceGroupWithResponse(String resourceGroupName,
        String partnerNamespaceName, Context context);

    /**
     * Get a partner namespace.
     * 
     * Get properties of a partner namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a partner namespace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerNamespaceInner getByResourceGroup(String resourceGroupName, String partnerNamespaceName);

    /**
     * Create a partner namespace.
     * 
     * Asynchronously creates a new partner namespace with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param partnerNamespaceInfo PartnerNamespace information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of eventGrid Partner Namespace.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PartnerNamespaceInner>, PartnerNamespaceInner> beginCreateOrUpdate(String resourceGroupName,
        String partnerNamespaceName, PartnerNamespaceInner partnerNamespaceInfo);

    /**
     * Create a partner namespace.
     * 
     * Asynchronously creates a new partner namespace with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param partnerNamespaceInfo PartnerNamespace information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of eventGrid Partner Namespace.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PartnerNamespaceInner>, PartnerNamespaceInner> beginCreateOrUpdate(String resourceGroupName,
        String partnerNamespaceName, PartnerNamespaceInner partnerNamespaceInfo, Context context);

    /**
     * Create a partner namespace.
     * 
     * Asynchronously creates a new partner namespace with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param partnerNamespaceInfo PartnerNamespace information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return eventGrid Partner Namespace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerNamespaceInner createOrUpdate(String resourceGroupName, String partnerNamespaceName,
        PartnerNamespaceInner partnerNamespaceInfo);

    /**
     * Create a partner namespace.
     * 
     * Asynchronously creates a new partner namespace with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param partnerNamespaceInfo PartnerNamespace information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return eventGrid Partner Namespace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerNamespaceInner createOrUpdate(String resourceGroupName, String partnerNamespaceName,
        PartnerNamespaceInner partnerNamespaceInfo, Context context);

    /**
     * Delete a partner namespace.
     * 
     * Delete existing partner namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String partnerNamespaceName);

    /**
     * Delete a partner namespace.
     * 
     * Delete existing partner namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String partnerNamespaceName,
        Context context);

    /**
     * Delete a partner namespace.
     * 
     * Delete existing partner namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String partnerNamespaceName);

    /**
     * Delete a partner namespace.
     * 
     * Delete existing partner namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String partnerNamespaceName, Context context);

    /**
     * Update a partner namespace.
     * 
     * Asynchronously updates a partner namespace with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param partnerNamespaceUpdateParameters Partner namespace update information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PartnerNamespaceInner>, PartnerNamespaceInner> beginUpdate(String resourceGroupName,
        String partnerNamespaceName, PartnerNamespaceUpdateParameters partnerNamespaceUpdateParameters);

    /**
     * Update a partner namespace.
     * 
     * Asynchronously updates a partner namespace with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param partnerNamespaceUpdateParameters Partner namespace update information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PartnerNamespaceInner>, PartnerNamespaceInner> beginUpdate(String resourceGroupName,
        String partnerNamespaceName, PartnerNamespaceUpdateParameters partnerNamespaceUpdateParameters,
        Context context);

    /**
     * Update a partner namespace.
     * 
     * Asynchronously updates a partner namespace with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param partnerNamespaceUpdateParameters Partner namespace update information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerNamespaceInner update(String resourceGroupName, String partnerNamespaceName,
        PartnerNamespaceUpdateParameters partnerNamespaceUpdateParameters);

    /**
     * Update a partner namespace.
     * 
     * Asynchronously updates a partner namespace with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param partnerNamespaceUpdateParameters Partner namespace update information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerNamespaceInner update(String resourceGroupName, String partnerNamespaceName,
        PartnerNamespaceUpdateParameters partnerNamespaceUpdateParameters, Context context);

    /**
     * List partner namespaces under an Azure subscription.
     * 
     * List all the partner namespaces under an Azure subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Namespaces operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerNamespaceInner> list();

    /**
     * List partner namespaces under an Azure subscription.
     * 
     * List all the partner namespaces under an Azure subscription.
     * 
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     * 'name' property only and with limited number of OData operations. These operations are: the 'contains' function
     * as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal). No arithmetic
     * operations are supported. The following is a valid filter example: $filter=contains(namE, 'PATTERN') and name ne
     * 'PATTERN-1'. The following is not a valid filter example: $filter=location eq 'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     * 100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Namespaces operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerNamespaceInner> list(String filter, Integer top, Context context);

    /**
     * List partner namespaces under a resource group.
     * 
     * List all the partner namespaces under a resource group.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Namespaces operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerNamespaceInner> listByResourceGroup(String resourceGroupName);

    /**
     * List partner namespaces under a resource group.
     * 
     * List all the partner namespaces under a resource group.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     * 'name' property only and with limited number of OData operations. These operations are: the 'contains' function
     * as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal). No arithmetic
     * operations are supported. The following is a valid filter example: $filter=contains(namE, 'PATTERN') and name ne
     * 'PATTERN-1'. The following is not a valid filter example: $filter=location eq 'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     * 100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Namespaces operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerNamespaceInner> listByResourceGroup(String resourceGroupName, String filter, Integer top,
        Context context);

    /**
     * List keys for a partner namespace.
     * 
     * List the two keys used to publish to a partner namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the partner namespace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PartnerNamespaceSharedAccessKeysInner> listSharedAccessKeysWithResponse(String resourceGroupName,
        String partnerNamespaceName, Context context);

    /**
     * List keys for a partner namespace.
     * 
     * List the two keys used to publish to a partner namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the partner namespace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerNamespaceSharedAccessKeysInner listSharedAccessKeys(String resourceGroupName, String partnerNamespaceName);

    /**
     * Regenerate key for a partner namespace.
     * 
     * Regenerate a shared access key for a partner namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param regenerateKeyRequest Request body to regenerate key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the partner namespace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PartnerNamespaceSharedAccessKeysInner> regenerateKeyWithResponse(String resourceGroupName,
        String partnerNamespaceName, PartnerNamespaceRegenerateKeyRequest regenerateKeyRequest, Context context);

    /**
     * Regenerate key for a partner namespace.
     * 
     * Regenerate a shared access key for a partner namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param regenerateKeyRequest Request body to regenerate key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the partner namespace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerNamespaceSharedAccessKeysInner regenerateKey(String resourceGroupName, String partnerNamespaceName,
        PartnerNamespaceRegenerateKeyRequest regenerateKeyRequest);
}
