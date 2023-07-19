// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.authorization.fluent.ScopeAccessReviewInstanceDecisionsClient;
import com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionInner;
import com.azure.resourcemanager.authorization.models.AccessReviewDecisionListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ScopeAccessReviewInstanceDecisionsClient.
 */
public final class ScopeAccessReviewInstanceDecisionsClientImpl implements ScopeAccessReviewInstanceDecisionsClient {
    /** The proxy service used to perform REST calls. */
    private final ScopeAccessReviewInstanceDecisionsService service;

    /** The service client containing this operation class. */
    private final AuthorizationManagementClientImpl client;

    /**
     * Initializes an instance of ScopeAccessReviewInstanceDecisionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ScopeAccessReviewInstanceDecisionsClientImpl(AuthorizationManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ScopeAccessReviewInstanceDecisionsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AuthorizationManagementClientScopeAccessReviewInstanceDecisions to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AuthorizationManagem")
    public interface ScopeAccessReviewInstanceDecisionsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/{scope}/providers/Microsoft.Authorization/accessReviewScheduleDefinitions/{scheduleDefinitionId}/instances/{id}/decisions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AccessReviewDecisionListResult>> list(
            @HostParam("$host") String endpoint,
            @PathParam("scope") String scope,
            @PathParam("scheduleDefinitionId") String scheduleDefinitionId,
            @PathParam("id") String id,
            @QueryParam("api-version") String apiVersion,
            @QueryParam(value = "$filter", encoded = true) String filter,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AccessReviewDecisionListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get access review instance decisions.
     *
     * @param scope The scope of the resource.
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @param filter The filter to apply on the operation. Other than standard filters, one custom filter option is
     *     supported : 'assignedToMeToReview()'. When one specified $filter=assignedToMeToReview(), only items that are
     *     assigned to the calling user to review are returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instance decisions along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AccessReviewDecisionInner>> listSinglePageAsync(
        String scope, String scheduleDefinitionId, String id, String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        if (scheduleDefinitionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter scheduleDefinitionId is required and cannot be null."));
        }
        if (id == null) {
            return Mono.error(new IllegalArgumentException("Parameter id is required and cannot be null."));
        }
        final String apiVersion = "2021-12-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            scope,
                            scheduleDefinitionId,
                            id,
                            apiVersion,
                            filter,
                            accept,
                            context))
            .<PagedResponse<AccessReviewDecisionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get access review instance decisions.
     *
     * @param scope The scope of the resource.
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @param filter The filter to apply on the operation. Other than standard filters, one custom filter option is
     *     supported : 'assignedToMeToReview()'. When one specified $filter=assignedToMeToReview(), only items that are
     *     assigned to the calling user to review are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instance decisions along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AccessReviewDecisionInner>> listSinglePageAsync(
        String scope, String scheduleDefinitionId, String id, String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        if (scheduleDefinitionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter scheduleDefinitionId is required and cannot be null."));
        }
        if (id == null) {
            return Mono.error(new IllegalArgumentException("Parameter id is required and cannot be null."));
        }
        final String apiVersion = "2021-12-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), scope, scheduleDefinitionId, id, apiVersion, filter, accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Get access review instance decisions.
     *
     * @param scope The scope of the resource.
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @param filter The filter to apply on the operation. Other than standard filters, one custom filter option is
     *     supported : 'assignedToMeToReview()'. When one specified $filter=assignedToMeToReview(), only items that are
     *     assigned to the calling user to review are returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instance decisions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<AccessReviewDecisionInner> listAsync(
        String scope, String scheduleDefinitionId, String id, String filter) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(scope, scheduleDefinitionId, id, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get access review instance decisions.
     *
     * @param scope The scope of the resource.
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instance decisions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<AccessReviewDecisionInner> listAsync(String scope, String scheduleDefinitionId, String id) {
        final String filter = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(scope, scheduleDefinitionId, id, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get access review instance decisions.
     *
     * @param scope The scope of the resource.
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @param filter The filter to apply on the operation. Other than standard filters, one custom filter option is
     *     supported : 'assignedToMeToReview()'. When one specified $filter=assignedToMeToReview(), only items that are
     *     assigned to the calling user to review are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instance decisions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AccessReviewDecisionInner> listAsync(
        String scope, String scheduleDefinitionId, String id, String filter, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(scope, scheduleDefinitionId, id, filter, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get access review instance decisions.
     *
     * @param scope The scope of the resource.
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instance decisions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AccessReviewDecisionInner> list(String scope, String scheduleDefinitionId, String id) {
        final String filter = null;
        return new PagedIterable<>(listAsync(scope, scheduleDefinitionId, id, filter));
    }

    /**
     * Get access review instance decisions.
     *
     * @param scope The scope of the resource.
     * @param scheduleDefinitionId The id of the access review schedule definition.
     * @param id The id of the access review instance.
     * @param filter The filter to apply on the operation. Other than standard filters, one custom filter option is
     *     supported : 'assignedToMeToReview()'. When one specified $filter=assignedToMeToReview(), only items that are
     *     assigned to the calling user to review are returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access review instance decisions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AccessReviewDecisionInner> list(
        String scope, String scheduleDefinitionId, String id, String filter, Context context) {
        return new PagedIterable<>(listAsync(scope, scheduleDefinitionId, id, filter, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of access review decisions along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AccessReviewDecisionInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<AccessReviewDecisionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of access review decisions along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AccessReviewDecisionInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
