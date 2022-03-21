// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.msi.fluent.models.IdentityInner;
import com.azure.resourcemanager.msi.models.IdentityUpdate;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in UserAssignedIdentitiesClient. */
public interface UserAssignedIdentitiesClient
    extends InnerSupportsGet<IdentityInner>, InnerSupportsListing<IdentityInner>, InnerSupportsDelete<Void> {
    /**
     * Lists all the userAssignedIdentities available under the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<IdentityInner> listAsync();

    /**
     * Lists all the userAssignedIdentities available under the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IdentityInner> list();

    /**
     * Lists all the userAssignedIdentities available under the specified subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IdentityInner> list(Context context);

    /**
     * Lists all the userAssignedIdentities available under the specified ResourceGroup.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<IdentityInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists all the userAssignedIdentities available under the specified ResourceGroup.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IdentityInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the userAssignedIdentities available under the specified ResourceGroup.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IdentityInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Create or update an identity in the specified subscription and resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @param parameters Parameters to create or update the identity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an identity resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<IdentityInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String resourceName, IdentityInner parameters);

    /**
     * Create or update an identity in the specified subscription and resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @param parameters Parameters to create or update the identity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an identity resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<IdentityInner> createOrUpdateAsync(String resourceGroupName, String resourceName, IdentityInner parameters);

    /**
     * Create or update an identity in the specified subscription and resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @param parameters Parameters to create or update the identity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an identity resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IdentityInner createOrUpdate(String resourceGroupName, String resourceName, IdentityInner parameters);

    /**
     * Create or update an identity in the specified subscription and resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @param parameters Parameters to create or update the identity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an identity resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IdentityInner> createOrUpdateWithResponse(
        String resourceGroupName, String resourceName, IdentityInner parameters, Context context);

    /**
     * Update an identity in the specified subscription and resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @param parameters Parameters to update the identity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an identity resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<IdentityInner>> updateWithResponseAsync(
        String resourceGroupName, String resourceName, IdentityUpdate parameters);

    /**
     * Update an identity in the specified subscription and resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @param parameters Parameters to update the identity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an identity resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<IdentityInner> updateAsync(String resourceGroupName, String resourceName, IdentityUpdate parameters);

    /**
     * Update an identity in the specified subscription and resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @param parameters Parameters to update the identity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an identity resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IdentityInner update(String resourceGroupName, String resourceName, IdentityUpdate parameters);

    /**
     * Update an identity in the specified subscription and resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @param parameters Parameters to update the identity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an identity resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IdentityInner> updateWithResponse(
        String resourceGroupName, String resourceName, IdentityUpdate parameters, Context context);

    /**
     * Gets the identity.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the identity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<IdentityInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String resourceName);

    /**
     * Gets the identity.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the identity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<IdentityInner> getByResourceGroupAsync(String resourceGroupName, String resourceName);

    /**
     * Gets the identity.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the identity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IdentityInner getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Gets the identity.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the identity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IdentityInner> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Deletes the identity.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String resourceName);

    /**
     * Deletes the identity.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String resourceName);

    /**
     * Deletes the identity.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName);

    /**
     * Deletes the identity.
     *
     * @param resourceGroupName The name of the Resource Group to which the identity belongs.
     * @param resourceName The name of the identity resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String resourceName, Context context);
}
