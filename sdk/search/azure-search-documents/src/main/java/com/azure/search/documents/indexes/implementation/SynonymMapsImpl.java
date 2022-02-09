// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.search.documents.indexes.implementation.models.ListSynonymMapsResult;
import com.azure.search.documents.indexes.implementation.models.RequestOptions;
import com.azure.search.documents.indexes.implementation.models.SearchErrorException;
import com.azure.search.documents.indexes.models.SynonymMap;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SynonymMaps. */
public final class SynonymMapsImpl {
    /** The proxy service used to perform REST calls. */
    private final SynonymMapsService service;

    /** The service client containing this operation class. */
    private final SearchServiceClientImpl client;

    /**
     * Initializes an instance of SynonymMapsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SynonymMapsImpl(SearchServiceClientImpl client) {
        this.service =
                RestProxy.create(SynonymMapsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SearchServiceClientSynonymMaps to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "SearchServiceClientS")
    public interface SynonymMapsService {
        @Put("/synonymmaps('{synonymMapName}')")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SynonymMap>> createOrUpdate(
                @HostParam("endpoint") String endpoint,
                @PathParam("synonymMapName") String synonymMapName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("Prefer") String prefer,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                @BodyParam("application/json") SynonymMap synonymMap,
                Context context);

        @Delete("/synonymmaps('{synonymMapName}')")
        @ExpectedResponses({204, 404})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<Void>> delete(
                @HostParam("endpoint") String endpoint,
                @PathParam("synonymMapName") String synonymMapName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/synonymmaps('{synonymMapName}')")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SynonymMap>> get(
                @HostParam("endpoint") String endpoint,
                @PathParam("synonymMapName") String synonymMapName,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/synonymmaps")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<ListSynonymMapsResult>> list(
                @HostParam("endpoint") String endpoint,
                @QueryParam("$select") String select,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/synonymmaps")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SynonymMap>> create(
                @HostParam("endpoint") String endpoint,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                @BodyParam("application/json") SynonymMap synonymMap,
                Context context);
    }

    /**
     * Creates a new synonym map or updates a synonym map if it already exists.
     *
     * @param synonymMapName The name of the synonym map to create or update.
     * @param synonymMap The definition of the synonym map to create or update.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server
     *     matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the
     *     server does not match this value.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a synonym map definition along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SynonymMap>> createOrUpdateWithResponseAsync(
            String synonymMapName,
            SynonymMap synonymMap,
            String ifMatch,
            String ifNoneMatch,
            RequestOptions requestOptions,
            Context context) {
        final String prefer = "return=representation";
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.createOrUpdate(
                this.client.getEndpoint(),
                synonymMapName,
                xMsClientRequestId,
                ifMatch,
                ifNoneMatch,
                prefer,
                this.client.getApiVersion(),
                accept,
                synonymMap,
                context);
    }

    /**
     * Deletes a synonym map.
     *
     * @param synonymMapName The name of the synonym map to delete.
     * @param ifMatch Defines the If-Match condition. The operation will be performed only if the ETag on the server
     *     matches this value.
     * @param ifNoneMatch Defines the If-None-Match condition. The operation will be performed only if the ETag on the
     *     server does not match this value.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
            String synonymMapName, String ifMatch, String ifNoneMatch, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.delete(
                this.client.getEndpoint(),
                synonymMapName,
                xMsClientRequestId,
                ifMatch,
                ifNoneMatch,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Retrieves a synonym map definition.
     *
     * @param synonymMapName The name of the synonym map to retrieve.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a synonym map definition along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SynonymMap>> getWithResponseAsync(
            String synonymMapName, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.get(
                this.client.getEndpoint(),
                synonymMapName,
                xMsClientRequestId,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Lists all synonym maps available for a search service.
     *
     * @param select Selects which top-level properties of the synonym maps to retrieve. Specified as a comma-separated
     *     list of JSON property names, or '*' for all properties. The default is all properties.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response from a List SynonymMaps request along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ListSynonymMapsResult>> listWithResponseAsync(
            String select, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.list(
                this.client.getEndpoint(), select, xMsClientRequestId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Creates a new synonym map.
     *
     * @param synonymMap The definition of the synonym map to create.
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a synonym map definition along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SynonymMap>> createWithResponseAsync(
            SynonymMap synonymMap, RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.create(
                this.client.getEndpoint(),
                xMsClientRequestId,
                this.client.getApiVersion(),
                accept,
                synonymMap,
                context);
    }
}
