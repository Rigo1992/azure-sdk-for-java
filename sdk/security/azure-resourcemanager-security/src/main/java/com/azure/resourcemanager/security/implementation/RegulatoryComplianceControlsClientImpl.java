// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

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
import com.azure.resourcemanager.security.fluent.RegulatoryComplianceControlsClient;
import com.azure.resourcemanager.security.fluent.models.RegulatoryComplianceControlInner;
import com.azure.resourcemanager.security.models.RegulatoryComplianceControlList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RegulatoryComplianceControlsClient. */
public final class RegulatoryComplianceControlsClientImpl implements RegulatoryComplianceControlsClient {
    /** The proxy service used to perform REST calls. */
    private final RegulatoryComplianceControlsService service;

    /** The service client containing this operation class. */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of RegulatoryComplianceControlsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RegulatoryComplianceControlsClientImpl(SecurityCenterImpl client) {
        this.service =
            RestProxy
                .create(
                    RegulatoryComplianceControlsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterRegulatoryComplianceControls to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterRegula")
    public interface RegulatoryComplianceControlsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Security/regulatoryComplianceStandards/{regulatoryComplianceStandardName}/regulatoryComplianceControls")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RegulatoryComplianceControlList>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("regulatoryComplianceStandardName") String regulatoryComplianceStandardName,
            @QueryParam("$filter") String filter,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Security/regulatoryComplianceStandards/{regulatoryComplianceStandardName}/regulatoryComplianceControls/{regulatoryComplianceControlName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RegulatoryComplianceControlInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("regulatoryComplianceStandardName") String regulatoryComplianceStandardName,
            @PathParam("regulatoryComplianceControlName") String regulatoryComplianceControlName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RegulatoryComplianceControlList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * All supported regulatory compliance controls details and state for selected standard.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param filter OData filter. Optional.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance controls response along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RegulatoryComplianceControlInner>> listSinglePageAsync(
        String regulatoryComplianceStandardName, String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (regulatoryComplianceStandardName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceStandardName is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            regulatoryComplianceStandardName,
                            filter,
                            accept,
                            context))
            .<PagedResponse<RegulatoryComplianceControlInner>>map(
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
     * All supported regulatory compliance controls details and state for selected standard.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param filter OData filter. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance controls response along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RegulatoryComplianceControlInner>> listSinglePageAsync(
        String regulatoryComplianceStandardName, String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (regulatoryComplianceStandardName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceStandardName is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                regulatoryComplianceStandardName,
                filter,
                accept,
                context)
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
     * All supported regulatory compliance controls details and state for selected standard.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param filter OData filter. Optional.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance controls response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RegulatoryComplianceControlInner> listAsync(
        String regulatoryComplianceStandardName, String filter) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(regulatoryComplianceStandardName, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * All supported regulatory compliance controls details and state for selected standard.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance controls response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RegulatoryComplianceControlInner> listAsync(String regulatoryComplianceStandardName) {
        final String filter = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(regulatoryComplianceStandardName, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * All supported regulatory compliance controls details and state for selected standard.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param filter OData filter. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance controls response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RegulatoryComplianceControlInner> listAsync(
        String regulatoryComplianceStandardName, String filter, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(regulatoryComplianceStandardName, filter, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * All supported regulatory compliance controls details and state for selected standard.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance controls response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RegulatoryComplianceControlInner> list(String regulatoryComplianceStandardName) {
        final String filter = null;
        return new PagedIterable<>(listAsync(regulatoryComplianceStandardName, filter));
    }

    /**
     * All supported regulatory compliance controls details and state for selected standard.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param filter OData filter. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance controls response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RegulatoryComplianceControlInner> list(
        String regulatoryComplianceStandardName, String filter, Context context) {
        return new PagedIterable<>(listAsync(regulatoryComplianceStandardName, filter, context));
    }

    /**
     * Selected regulatory compliance control details and state.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance control details and state along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RegulatoryComplianceControlInner>> getWithResponseAsync(
        String regulatoryComplianceStandardName, String regulatoryComplianceControlName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (regulatoryComplianceStandardName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceStandardName is required and cannot be null."));
        }
        if (regulatoryComplianceControlName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceControlName is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            regulatoryComplianceStandardName,
                            regulatoryComplianceControlName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Selected regulatory compliance control details and state.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance control details and state along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RegulatoryComplianceControlInner>> getWithResponseAsync(
        String regulatoryComplianceStandardName, String regulatoryComplianceControlName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (regulatoryComplianceStandardName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceStandardName is required and cannot be null."));
        }
        if (regulatoryComplianceControlName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceControlName is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                regulatoryComplianceStandardName,
                regulatoryComplianceControlName,
                accept,
                context);
    }

    /**
     * Selected regulatory compliance control details and state.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance control details and state on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<RegulatoryComplianceControlInner> getAsync(
        String regulatoryComplianceStandardName, String regulatoryComplianceControlName) {
        return getWithResponseAsync(regulatoryComplianceStandardName, regulatoryComplianceControlName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Selected regulatory compliance control details and state.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance control details and state along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RegulatoryComplianceControlInner> getWithResponse(
        String regulatoryComplianceStandardName, String regulatoryComplianceControlName, Context context) {
        return getWithResponseAsync(regulatoryComplianceStandardName, regulatoryComplianceControlName, context).block();
    }

    /**
     * Selected regulatory compliance control details and state.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance control details and state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RegulatoryComplianceControlInner get(
        String regulatoryComplianceStandardName, String regulatoryComplianceControlName) {
        return getWithResponse(regulatoryComplianceStandardName, regulatoryComplianceControlName, Context.NONE)
            .getValue();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance controls response along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RegulatoryComplianceControlInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<RegulatoryComplianceControlInner>>map(
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
     * @return list of regulatory compliance controls response along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RegulatoryComplianceControlInner>> listNextSinglePageAsync(
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
