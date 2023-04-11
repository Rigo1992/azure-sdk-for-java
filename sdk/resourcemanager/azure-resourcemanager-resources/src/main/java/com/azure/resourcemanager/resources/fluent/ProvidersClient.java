// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.fluent.models.ProviderInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ProvidersClient. */
public interface ProvidersClient {
    /**
     * Unregisters a subscription from a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to unregister.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource provider information along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ProviderInner>> unregisterWithResponseAsync(String resourceProviderNamespace);

    /**
     * Unregisters a subscription from a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to unregister.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource provider information on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ProviderInner> unregisterAsync(String resourceProviderNamespace);

    /**
     * Unregisters a subscription from a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to unregister.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource provider information along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProviderInner> unregisterWithResponse(String resourceProviderNamespace, Context context);

    /**
     * Unregisters a subscription from a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to unregister.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource provider information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProviderInner unregister(String resourceProviderNamespace);

    /**
     * Registers a management group with a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to register.
     * @param groupId The management group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> registerAtManagementGroupScopeWithResponseAsync(
        String resourceProviderNamespace, String groupId);

    /**
     * Registers a management group with a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to register.
     * @param groupId The management group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> registerAtManagementGroupScopeAsync(String resourceProviderNamespace, String groupId);

    /**
     * Registers a management group with a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to register.
     * @param groupId The management group ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> registerAtManagementGroupScopeWithResponse(
        String resourceProviderNamespace, String groupId, Context context);

    /**
     * Registers a management group with a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to register.
     * @param groupId The management group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void registerAtManagementGroupScope(String resourceProviderNamespace, String groupId);

    /**
     * Registers a subscription with a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to register.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource provider information along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ProviderInner>> registerWithResponseAsync(String resourceProviderNamespace);

    /**
     * Registers a subscription with a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to register.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource provider information on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ProviderInner> registerAsync(String resourceProviderNamespace);

    /**
     * Registers a subscription with a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to register.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource provider information along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProviderInner> registerWithResponse(String resourceProviderNamespace, Context context);

    /**
     * Registers a subscription with a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to register.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource provider information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProviderInner register(String resourceProviderNamespace);

    /**
     * Gets all resource providers for a subscription.
     *
     * @param top The number of results to return. If null is passed returns all deployments.
     * @param expand The properties to include in the results. For example, use &amp;$expand=metadata in the query
     *     string to retrieve resource provider metadata. To include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for a subscription as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ProviderInner> listAsync(Integer top, String expand);

    /**
     * Gets all resource providers for a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for a subscription as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ProviderInner> listAsync();

    /**
     * Gets all resource providers for a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProviderInner> list();

    /**
     * Gets all resource providers for a subscription.
     *
     * @param top The number of results to return. If null is passed returns all deployments.
     * @param expand The properties to include in the results. For example, use &amp;$expand=metadata in the query
     *     string to retrieve resource provider metadata. To include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProviderInner> list(Integer top, String expand, Context context);

    /**
     * Gets all resource providers for the tenant.
     *
     * @param top The number of results to return. If null is passed returns all providers.
     * @param expand The properties to include in the results. For example, use &amp;$expand=metadata in the query
     *     string to retrieve resource provider metadata. To include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for the tenant as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ProviderInner> listAtTenantScopeAsync(Integer top, String expand);

    /**
     * Gets all resource providers for the tenant.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for the tenant as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ProviderInner> listAtTenantScopeAsync();

    /**
     * Gets all resource providers for the tenant.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for the tenant as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProviderInner> listAtTenantScope();

    /**
     * Gets all resource providers for the tenant.
     *
     * @param top The number of results to return. If null is passed returns all providers.
     * @param expand The properties to include in the results. For example, use &amp;$expand=metadata in the query
     *     string to retrieve resource provider metadata. To include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for the tenant as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProviderInner> listAtTenantScope(Integer top, String expand, Context context);

    /**
     * Gets the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand The $expand query parameter. For example, to include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ProviderInner>> getWithResponseAsync(String resourceProviderNamespace, String expand);

    /**
     * Gets the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ProviderInner> getAsync(String resourceProviderNamespace);

    /**
     * Gets the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand The $expand query parameter. For example, to include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProviderInner> getWithResponse(String resourceProviderNamespace, String expand, Context context);

    /**
     * Gets the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProviderInner get(String resourceProviderNamespace);

    /**
     * Gets the specified resource provider at the tenant level.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand The $expand query parameter. For example, to include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider at the tenant level along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ProviderInner>> getAtTenantScopeWithResponseAsync(String resourceProviderNamespace, String expand);

    /**
     * Gets the specified resource provider at the tenant level.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider at the tenant level on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ProviderInner> getAtTenantScopeAsync(String resourceProviderNamespace);

    /**
     * Gets the specified resource provider at the tenant level.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand The $expand query parameter. For example, to include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider at the tenant level along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProviderInner> getAtTenantScopeWithResponse(
        String resourceProviderNamespace, String expand, Context context);

    /**
     * Gets the specified resource provider at the tenant level.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider at the tenant level.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProviderInner getAtTenantScope(String resourceProviderNamespace);
}
