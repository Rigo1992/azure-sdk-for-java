// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.implementation;

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
import com.azure.resourcemanager.monitor.fluent.MetricNamespacesClient;
import com.azure.resourcemanager.monitor.fluent.models.MetricNamespaceInner;
import com.azure.resourcemanager.monitor.models.MetricNamespaceCollection;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in MetricNamespacesClient.
 */
public final class MetricNamespacesClientImpl implements MetricNamespacesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final MetricNamespacesService service;

    /**
     * The service client containing this operation class.
     */
    private final MonitorClientImpl client;

    /**
     * Initializes an instance of MetricNamespacesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
     MetricNamespacesClientImpl(MonitorClientImpl client) {
        this.service = RestProxy.create(MetricNamespacesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientMetricNamespaces to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientMetricN")
    public interface MetricNamespacesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/{resourceUri}/providers/microsoft.insights/metricNamespaces")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MetricNamespaceCollection>> list(@HostParam("$host") String endpoint, @PathParam(value = "resourceUri", encoded = true) String resourceUri, @QueryParam("api-version") String apiVersion, @QueryParam("startTime") String startTime, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Lists the metric namespaces for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param startTime The ISO 8601 conform Date start time from which to query for metric namespaces.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric namespaces along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MetricNamespaceInner>> listSinglePageAsync(String resourceUri, String startTime) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String apiVersion = "2017-12-01-preview";
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.list(this.client.getEndpoint(), resourceUri, apiVersion, startTime, accept, context))
            .<PagedResponse<MetricNamespaceInner>>map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                null,
                null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists the metric namespaces for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param startTime The ISO 8601 conform Date start time from which to query for metric namespaces.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric namespaces along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MetricNamespaceInner>> listSinglePageAsync(String resourceUri, String startTime, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String apiVersion = "2017-12-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), resourceUri, apiVersion, startTime, accept, context)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                null,
                null));
    }

    /**
     * Lists the metric namespaces for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param startTime The ISO 8601 conform Date start time from which to query for metric namespaces.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric namespaces as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<MetricNamespaceInner> listAsync(String resourceUri, String startTime) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceUri, startTime));
    }

    /**
     * Lists the metric namespaces for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric namespaces as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<MetricNamespaceInner> listAsync(String resourceUri) {
        final String startTime = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceUri, startTime));
    }

    /**
     * Lists the metric namespaces for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param startTime The ISO 8601 conform Date start time from which to query for metric namespaces.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric namespaces as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<MetricNamespaceInner> listAsync(String resourceUri, String startTime, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceUri, startTime, context));
    }

    /**
     * Lists the metric namespaces for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric namespaces as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<MetricNamespaceInner> list(String resourceUri) {
        final String startTime = null;
        return new PagedIterable<>(listAsync(resourceUri, startTime));
    }

    /**
     * Lists the metric namespaces for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param startTime The ISO 8601 conform Date start time from which to query for metric namespaces.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric namespaces as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<MetricNamespaceInner> list(String resourceUri, String startTime, Context context) {
        return new PagedIterable<>(listAsync(resourceUri, startTime, context));
    }
}
