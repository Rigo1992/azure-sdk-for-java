// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.cognitiveservices.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.cognitiveservices.fluent.models.DomainAvailabilityInner;
import com.azure.resourcemanager.cognitiveservices.fluent.models.SkuAvailabilityListResultInner;
import com.azure.resourcemanager.cognitiveservices.models.CheckDomainAvailabilityParameter;
import com.azure.resourcemanager.cognitiveservices.models.CheckSkuAvailabilityParameter;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ResourceProvidersClient. */
public final class ResourceProvidersClientImpl implements ResourceProvidersClient {
    /** The proxy service used to perform REST calls. */
    private final ResourceProvidersService service;

    /** The service client containing this operation class. */
    private final CognitiveServicesManagementClientImpl client;

    /**
     * Initializes an instance of ResourceProvidersClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ResourceProvidersClientImpl(CognitiveServicesManagementClientImpl client) {
        this.service =
            RestProxy.create(ResourceProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CognitiveServicesManagementClientResourceProviders to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CognitiveServicesMan")
    private interface ResourceProvidersService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.CognitiveServices/locations/{location}"
                + "/checkSkuAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SkuAvailabilityListResultInner>> checkSkuAvailability(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("location") String location,
            @BodyParam("application/json") CheckSkuAvailabilityParameter parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.CognitiveServices/checkDomainAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DomainAvailabilityInner>> checkDomainAvailability(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CheckDomainAvailabilityParameter parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Check available SKUs.
     *
     * @param location Resource location.
     * @param parameters Check SKU Availability POST body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check SKU availability result list along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SkuAvailabilityListResultInner>> checkSkuAvailabilityWithResponseAsync(
        String location, CheckSkuAvailabilityParameter parameters) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkSkuAvailability(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            location,
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Check available SKUs.
     *
     * @param location Resource location.
     * @param parameters Check SKU Availability POST body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check SKU availability result list along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SkuAvailabilityListResultInner>> checkSkuAvailabilityWithResponseAsync(
        String location, CheckSkuAvailabilityParameter parameters, Context context) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkSkuAvailability(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                location,
                parameters,
                accept,
                context);
    }

    /**
     * Check available SKUs.
     *
     * @param location Resource location.
     * @param parameters Check SKU Availability POST body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check SKU availability result list on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SkuAvailabilityListResultInner> checkSkuAvailabilityAsync(
        String location, CheckSkuAvailabilityParameter parameters) {
        return checkSkuAvailabilityWithResponseAsync(location, parameters)
            .flatMap(
                (Response<SkuAvailabilityListResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Check available SKUs.
     *
     * @param location Resource location.
     * @param parameters Check SKU Availability POST body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check SKU availability result list.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SkuAvailabilityListResultInner checkSkuAvailability(
        String location, CheckSkuAvailabilityParameter parameters) {
        return checkSkuAvailabilityAsync(location, parameters).block();
    }

    /**
     * Check available SKUs.
     *
     * @param location Resource location.
     * @param parameters Check SKU Availability POST body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check SKU availability result list along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SkuAvailabilityListResultInner> checkSkuAvailabilityWithResponse(
        String location, CheckSkuAvailabilityParameter parameters, Context context) {
        return checkSkuAvailabilityWithResponseAsync(location, parameters, context).block();
    }

    /**
     * Check whether a domain is available.
     *
     * @param parameters Check Domain Availability parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain availability along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DomainAvailabilityInner>> checkDomainAvailabilityWithResponseAsync(
        CheckDomainAvailabilityParameter parameters) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkDomainAvailability(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Check whether a domain is available.
     *
     * @param parameters Check Domain Availability parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain availability along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DomainAvailabilityInner>> checkDomainAvailabilityWithResponseAsync(
        CheckDomainAvailabilityParameter parameters, Context context) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkDomainAvailability(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                parameters,
                accept,
                context);
    }

    /**
     * Check whether a domain is available.
     *
     * @param parameters Check Domain Availability parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain availability on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DomainAvailabilityInner> checkDomainAvailabilityAsync(CheckDomainAvailabilityParameter parameters) {
        return checkDomainAvailabilityWithResponseAsync(parameters)
            .flatMap(
                (Response<DomainAvailabilityInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Check whether a domain is available.
     *
     * @param parameters Check Domain Availability parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain availability.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DomainAvailabilityInner checkDomainAvailability(CheckDomainAvailabilityParameter parameters) {
        return checkDomainAvailabilityAsync(parameters).block();
    }

    /**
     * Check whether a domain is available.
     *
     * @param parameters Check Domain Availability parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain availability along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DomainAvailabilityInner> checkDomainAvailabilityWithResponse(
        CheckDomainAvailabilityParameter parameters, Context context) {
        return checkDomainAvailabilityWithResponseAsync(parameters, context).block();
    }
}
