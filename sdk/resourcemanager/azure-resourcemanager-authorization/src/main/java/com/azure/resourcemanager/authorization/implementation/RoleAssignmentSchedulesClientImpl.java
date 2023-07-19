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
import com.azure.resourcemanager.authorization.fluent.RoleAssignmentSchedulesClient;
import com.azure.resourcemanager.authorization.fluent.models.RoleAssignmentScheduleInner;
import com.azure.resourcemanager.authorization.models.RoleAssignmentScheduleListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RoleAssignmentSchedulesClient. */
public final class RoleAssignmentSchedulesClientImpl implements RoleAssignmentSchedulesClient {
    /** The proxy service used to perform REST calls. */
    private final RoleAssignmentSchedulesService service;

    /** The service client containing this operation class. */
    private final AuthorizationManagementClientImpl client;

    /**
     * Initializes an instance of RoleAssignmentSchedulesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RoleAssignmentSchedulesClientImpl(AuthorizationManagementClientImpl client) {
        this.service =
            RestProxy
                .create(RoleAssignmentSchedulesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AuthorizationManagementClientRoleAssignmentSchedules to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AuthorizationManagem")
    public interface RoleAssignmentSchedulesService {
        @Headers({"Content-Type: application/json"})
        @Get("/{scope}/providers/Microsoft.Authorization/roleAssignmentSchedules/{roleAssignmentScheduleName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RoleAssignmentScheduleInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam(value = "scope", encoded = true) String scope,
            @PathParam("roleAssignmentScheduleName") String roleAssignmentScheduleName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/{scope}/providers/Microsoft.Authorization/roleAssignmentSchedules")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RoleAssignmentScheduleListResult>> listForScope(
            @HostParam("$host") String endpoint,
            @PathParam(value = "scope", encoded = true) String scope,
            @QueryParam("$filter") String filter,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RoleAssignmentScheduleListResult>> listForScopeNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get the specified role assignment schedule for a resource scope.
     *
     * @param scope The scope of the role assignment schedule.
     * @param roleAssignmentScheduleName The name (guid) of the role assignment schedule to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role assignment schedule for a resource scope along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RoleAssignmentScheduleInner>> getWithResponseAsync(
        String scope, String roleAssignmentScheduleName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        if (roleAssignmentScheduleName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter roleAssignmentScheduleName is required and cannot be null."));
        }
        final String apiVersion = "2020-10-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(this.client.getEndpoint(), scope, roleAssignmentScheduleName, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the specified role assignment schedule for a resource scope.
     *
     * @param scope The scope of the role assignment schedule.
     * @param roleAssignmentScheduleName The name (guid) of the role assignment schedule to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role assignment schedule for a resource scope along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RoleAssignmentScheduleInner>> getWithResponseAsync(
        String scope, String roleAssignmentScheduleName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        if (roleAssignmentScheduleName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter roleAssignmentScheduleName is required and cannot be null."));
        }
        final String apiVersion = "2020-10-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), scope, roleAssignmentScheduleName, apiVersion, accept, context);
    }

    /**
     * Get the specified role assignment schedule for a resource scope.
     *
     * @param scope The scope of the role assignment schedule.
     * @param roleAssignmentScheduleName The name (guid) of the role assignment schedule to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role assignment schedule for a resource scope on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoleAssignmentScheduleInner> getAsync(String scope, String roleAssignmentScheduleName) {
        return getWithResponseAsync(scope, roleAssignmentScheduleName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get the specified role assignment schedule for a resource scope.
     *
     * @param scope The scope of the role assignment schedule.
     * @param roleAssignmentScheduleName The name (guid) of the role assignment schedule to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role assignment schedule for a resource scope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RoleAssignmentScheduleInner> getWithResponse(
        String scope, String roleAssignmentScheduleName, Context context) {
        return getWithResponseAsync(scope, roleAssignmentScheduleName, context).block();
    }

    /**
     * Get the specified role assignment schedule for a resource scope.
     *
     * @param scope The scope of the role assignment schedule.
     * @param roleAssignmentScheduleName The name (guid) of the role assignment schedule to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role assignment schedule for a resource scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RoleAssignmentScheduleInner get(String scope, String roleAssignmentScheduleName) {
        return getWithResponse(scope, roleAssignmentScheduleName, Context.NONE).getValue();
    }

    /**
     * Gets role assignment schedules for a resource scope.
     *
     * @param scope The scope of the role assignments schedules.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignment schedules
     *     at or above the scope. Use $filter=principalId eq {id} to return all role assignment schedules at, above or
     *     below the scope for the specified principal. Use $filter=assignedTo('{userId}') to return all role assignment
     *     schedules for the current user. Use $filter=asTarget() to return all role assignment schedules created for
     *     the current user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment schedules for a resource scope along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RoleAssignmentScheduleInner>> listForScopeSinglePageAsync(String scope, String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String apiVersion = "2020-10-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.listForScope(this.client.getEndpoint(), scope, filter, apiVersion, accept, context))
            .<PagedResponse<RoleAssignmentScheduleInner>>map(
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
     * Gets role assignment schedules for a resource scope.
     *
     * @param scope The scope of the role assignments schedules.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignment schedules
     *     at or above the scope. Use $filter=principalId eq {id} to return all role assignment schedules at, above or
     *     below the scope for the specified principal. Use $filter=assignedTo('{userId}') to return all role assignment
     *     schedules for the current user. Use $filter=asTarget() to return all role assignment schedules created for
     *     the current user.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment schedules for a resource scope along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RoleAssignmentScheduleInner>> listForScopeSinglePageAsync(
        String scope, String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String apiVersion = "2020-10-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listForScope(this.client.getEndpoint(), scope, filter, apiVersion, accept, context)
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
     * Gets role assignment schedules for a resource scope.
     *
     * @param scope The scope of the role assignments schedules.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignment schedules
     *     at or above the scope. Use $filter=principalId eq {id} to return all role assignment schedules at, above or
     *     below the scope for the specified principal. Use $filter=assignedTo('{userId}') to return all role assignment
     *     schedules for the current user. Use $filter=asTarget() to return all role assignment schedules created for
     *     the current user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment schedules for a resource scope as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RoleAssignmentScheduleInner> listForScopeAsync(String scope, String filter) {
        return new PagedFlux<>(
            () -> listForScopeSinglePageAsync(scope, filter), nextLink -> listForScopeNextSinglePageAsync(nextLink));
    }

    /**
     * Gets role assignment schedules for a resource scope.
     *
     * @param scope The scope of the role assignments schedules.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment schedules for a resource scope as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RoleAssignmentScheduleInner> listForScopeAsync(String scope) {
        final String filter = null;
        return new PagedFlux<>(
            () -> listForScopeSinglePageAsync(scope, filter), nextLink -> listForScopeNextSinglePageAsync(nextLink));
    }

    /**
     * Gets role assignment schedules for a resource scope.
     *
     * @param scope The scope of the role assignments schedules.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignment schedules
     *     at or above the scope. Use $filter=principalId eq {id} to return all role assignment schedules at, above or
     *     below the scope for the specified principal. Use $filter=assignedTo('{userId}') to return all role assignment
     *     schedules for the current user. Use $filter=asTarget() to return all role assignment schedules created for
     *     the current user.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment schedules for a resource scope as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RoleAssignmentScheduleInner> listForScopeAsync(String scope, String filter, Context context) {
        return new PagedFlux<>(
            () -> listForScopeSinglePageAsync(scope, filter, context),
            nextLink -> listForScopeNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets role assignment schedules for a resource scope.
     *
     * @param scope The scope of the role assignments schedules.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment schedules for a resource scope as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RoleAssignmentScheduleInner> listForScope(String scope) {
        final String filter = null;
        return new PagedIterable<>(listForScopeAsync(scope, filter));
    }

    /**
     * Gets role assignment schedules for a resource scope.
     *
     * @param scope The scope of the role assignments schedules.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignment schedules
     *     at or above the scope. Use $filter=principalId eq {id} to return all role assignment schedules at, above or
     *     below the scope for the specified principal. Use $filter=assignedTo('{userId}') to return all role assignment
     *     schedules for the current user. Use $filter=asTarget() to return all role assignment schedules created for
     *     the current user.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment schedules for a resource scope as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RoleAssignmentScheduleInner> listForScope(String scope, String filter, Context context) {
        return new PagedIterable<>(listForScopeAsync(scope, filter, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment schedule list operation result along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RoleAssignmentScheduleInner>> listForScopeNextSinglePageAsync(String nextLink) {
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
            .withContext(context -> service.listForScopeNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<RoleAssignmentScheduleInner>>map(
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
     * @return role assignment schedule list operation result along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RoleAssignmentScheduleInner>> listForScopeNextSinglePageAsync(
        String nextLink, Context context) {
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
            .listForScopeNext(nextLink, this.client.getEndpoint(), accept, context)
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
