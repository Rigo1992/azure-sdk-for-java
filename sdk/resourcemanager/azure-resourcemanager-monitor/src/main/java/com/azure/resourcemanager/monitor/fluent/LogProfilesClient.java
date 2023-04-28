// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.fluent.models.LogProfileResourceInner;
import com.azure.resourcemanager.monitor.models.LogProfileResourcePatch;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in LogProfilesClient.
 */
public interface LogProfilesClient {
    /**
     * Deletes the log profile.
     *
     * @param logProfileName The name of the log profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String logProfileName);

    /**
     * Deletes the log profile.
     *
     * @param logProfileName The name of the log profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String logProfileName);

    /**
     * Deletes the log profile.
     *
     * @param logProfileName The name of the log profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String logProfileName, Context context);

    /**
     * Deletes the log profile.
     *
     * @param logProfileName The name of the log profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String logProfileName);

    /**
     * Gets the log profile.
     *
     * @param logProfileName The name of the log profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the log profile along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<LogProfileResourceInner>> getWithResponseAsync(String logProfileName);

    /**
     * Gets the log profile.
     *
     * @param logProfileName The name of the log profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the log profile on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LogProfileResourceInner> getAsync(String logProfileName);

    /**
     * Gets the log profile.
     *
     * @param logProfileName The name of the log profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the log profile along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LogProfileResourceInner> getWithResponse(String logProfileName, Context context);

    /**
     * Gets the log profile.
     *
     * @param logProfileName The name of the log profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the log profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogProfileResourceInner get(String logProfileName);

    /**
     * Create or update a log profile in Azure Monitoring REST API.
     *
     * @param logProfileName The name of the log profile.
     * @param parameters Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the log profile resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<LogProfileResourceInner>> createOrUpdateWithResponseAsync(String logProfileName, LogProfileResourceInner parameters);

    /**
     * Create or update a log profile in Azure Monitoring REST API.
     *
     * @param logProfileName The name of the log profile.
     * @param parameters Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the log profile resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LogProfileResourceInner> createOrUpdateAsync(String logProfileName, LogProfileResourceInner parameters);

    /**
     * Create or update a log profile in Azure Monitoring REST API.
     *
     * @param logProfileName The name of the log profile.
     * @param parameters Parameters supplied to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the log profile resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LogProfileResourceInner> createOrUpdateWithResponse(String logProfileName, LogProfileResourceInner parameters, Context context);

    /**
     * Create or update a log profile in Azure Monitoring REST API.
     *
     * @param logProfileName The name of the log profile.
     * @param parameters Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the log profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogProfileResourceInner createOrUpdate(String logProfileName, LogProfileResourceInner parameters);

    /**
     * Updates an existing LogProfilesResource. To update other fields use the CreateOrUpdate method.
     *
     * @param logProfileName The name of the log profile.
     * @param logProfilesResource Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the log profile resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<LogProfileResourceInner>> updateWithResponseAsync(String logProfileName, LogProfileResourcePatch logProfilesResource);

    /**
     * Updates an existing LogProfilesResource. To update other fields use the CreateOrUpdate method.
     *
     * @param logProfileName The name of the log profile.
     * @param logProfilesResource Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the log profile resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LogProfileResourceInner> updateAsync(String logProfileName, LogProfileResourcePatch logProfilesResource);

    /**
     * Updates an existing LogProfilesResource. To update other fields use the CreateOrUpdate method.
     *
     * @param logProfileName The name of the log profile.
     * @param logProfilesResource Parameters supplied to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the log profile resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LogProfileResourceInner> updateWithResponse(String logProfileName, LogProfileResourcePatch logProfilesResource, Context context);

    /**
     * Updates an existing LogProfilesResource. To update other fields use the CreateOrUpdate method.
     *
     * @param logProfileName The name of the log profile.
     * @param logProfilesResource Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the log profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogProfileResourceInner update(String logProfileName, LogProfileResourcePatch logProfilesResource);

    /**
     * List the log profiles.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of log profiles as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<LogProfileResourceInner> listAsync();

    /**
     * List the log profiles.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of log profiles as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LogProfileResourceInner> list();

    /**
     * List the log profiles.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of log profiles as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LogProfileResourceInner> list(Context context);
}
