// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.schemaregistry.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.data.schemaregistry.implementation.models.ErrorException;
import com.azure.data.schemaregistry.implementation.models.SchemaGroups;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SchemaGroupsOperations. */
public final class SchemaGroupsOperationsImpl {
    /** The proxy service used to perform REST calls. */
    private final SchemaGroupsService service;

    /** The service client containing this operation class. */
    private final AzureSchemaRegistryImpl client;

    /**
     * Initializes an instance of SchemaGroupsOperationsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SchemaGroupsOperationsImpl(AzureSchemaRegistryImpl client) {
        this.service =
                RestProxy.create(SchemaGroupsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureSchemaRegistrySchemaGroupsOperations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("https://{endpoint}")
    @ServiceInterface(name = "AzureSchemaRegistryS")
    public interface SchemaGroupsService {
        @Get("/$schemaGroups")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<SchemaGroups>> list(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<SchemaGroups>> listNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Get list of schema groups.
     *
     * <p>Gets the list of schema groups user is authorized to access.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of schema groups user is authorized to access along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<String>> listSinglePageAsync(Context context) {
        final String accept = "application/json";
        return service.list(this.client.getEndpoint(), this.client.getApiVersion(), accept, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getGroups(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get list of schema groups.
     *
     * <p>Gets the list of schema groups user is authorized to access.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of schema groups user is authorized to access as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<String> listAsync() {
        return listAsync(Context.NONE);
    }

    /**
     * Get list of schema groups.
     *
     * <p>Gets the list of schema groups user is authorized to access.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of schema groups user is authorized to access as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<String> listAsync(Context context) {
        return new PagedFlux<>(
                () -> listSinglePageAsync(context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object received from the registry containing the list of schema groups and link to next batch page along
     *     with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<String>> listNextSinglePageAsync(String nextLink, Context context) {
        final String accept = "application/json";
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getGroups(),
                                        res.getValue().getNextLink(),
                                        null));
    }
}
