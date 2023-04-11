// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.resourcemanager.netapp.fluent.NetAppResourcesClient;
import com.azure.resourcemanager.netapp.fluent.models.CheckAvailabilityResponseInner;
import com.azure.resourcemanager.netapp.fluent.models.RegionInfoInner;
import com.azure.resourcemanager.netapp.models.FilePathAvailabilityRequest;
import com.azure.resourcemanager.netapp.models.QuotaAvailabilityRequest;
import com.azure.resourcemanager.netapp.models.ResourceNameAvailabilityRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in NetAppResourcesClient. */
public final class NetAppResourcesClientImpl implements NetAppResourcesClient {
    /** The proxy service used to perform REST calls. */
    private final NetAppResourcesService service;

    /** The service client containing this operation class. */
    private final NetAppManagementClientImpl client;

    /**
     * Initializes an instance of NetAppResourcesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    NetAppResourcesClientImpl(NetAppManagementClientImpl client) {
        this.service =
            RestProxy.create(NetAppResourcesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetAppManagementClientNetAppResources to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetAppManagementClie")
    public interface NetAppResourcesService {
        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.NetApp/locations/{location}/checkNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckAvailabilityResponseInner>> checkNameAvailability(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ResourceNameAvailabilityRequest body,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.NetApp/locations/{location}/checkFilePathAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckAvailabilityResponseInner>> checkFilePathAvailability(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") FilePathAvailabilityRequest body,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.NetApp/locations/{location}/checkQuotaAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckAvailabilityResponseInner>> checkQuotaAvailability(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") QuotaAvailabilityRequest body,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.NetApp/locations/{location}/regionInfo")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RegionInfoInner>> queryRegionInfo(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Check resource name availability
     *
     * <p>Check if a resource name is available.
     *
     * @param location The name of Azure region.
     * @param body Name availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckAvailabilityResponseInner>> checkNameAvailabilityWithResponseAsync(
        String location, ResourceNameAvailabilityRequest body) {
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
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkNameAvailability(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            body,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Check resource name availability
     *
     * <p>Check if a resource name is available.
     *
     * @param location The name of Azure region.
     * @param body Name availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckAvailabilityResponseInner>> checkNameAvailabilityWithResponseAsync(
        String location, ResourceNameAvailabilityRequest body, Context context) {
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
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkNameAvailability(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                body,
                accept,
                context);
    }

    /**
     * Check resource name availability
     *
     * <p>Check if a resource name is available.
     *
     * @param location The name of Azure region.
     * @param body Name availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckAvailabilityResponseInner> checkNameAvailabilityAsync(
        String location, ResourceNameAvailabilityRequest body) {
        return checkNameAvailabilityWithResponseAsync(location, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Check resource name availability
     *
     * <p>Check if a resource name is available.
     *
     * @param location The name of Azure region.
     * @param body Name availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckAvailabilityResponseInner> checkNameAvailabilityWithResponse(
        String location, ResourceNameAvailabilityRequest body, Context context) {
        return checkNameAvailabilityWithResponseAsync(location, body, context).block();
    }

    /**
     * Check resource name availability
     *
     * <p>Check if a resource name is available.
     *
     * @param location The name of Azure region.
     * @param body Name availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckAvailabilityResponseInner checkNameAvailability(String location, ResourceNameAvailabilityRequest body) {
        return checkNameAvailabilityWithResponse(location, body, Context.NONE).getValue();
    }

    /**
     * Check file path availability
     *
     * <p>Check if a file path is available.
     *
     * @param location The name of Azure region.
     * @param body File path availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckAvailabilityResponseInner>> checkFilePathAvailabilityWithResponseAsync(
        String location, FilePathAvailabilityRequest body) {
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
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkFilePathAvailability(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            body,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Check file path availability
     *
     * <p>Check if a file path is available.
     *
     * @param location The name of Azure region.
     * @param body File path availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckAvailabilityResponseInner>> checkFilePathAvailabilityWithResponseAsync(
        String location, FilePathAvailabilityRequest body, Context context) {
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
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkFilePathAvailability(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                body,
                accept,
                context);
    }

    /**
     * Check file path availability
     *
     * <p>Check if a file path is available.
     *
     * @param location The name of Azure region.
     * @param body File path availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckAvailabilityResponseInner> checkFilePathAvailabilityAsync(
        String location, FilePathAvailabilityRequest body) {
        return checkFilePathAvailabilityWithResponseAsync(location, body)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Check file path availability
     *
     * <p>Check if a file path is available.
     *
     * @param location The name of Azure region.
     * @param body File path availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckAvailabilityResponseInner> checkFilePathAvailabilityWithResponse(
        String location, FilePathAvailabilityRequest body, Context context) {
        return checkFilePathAvailabilityWithResponseAsync(location, body, context).block();
    }

    /**
     * Check file path availability
     *
     * <p>Check if a file path is available.
     *
     * @param location The name of Azure region.
     * @param body File path availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckAvailabilityResponseInner checkFilePathAvailability(String location, FilePathAvailabilityRequest body) {
        return checkFilePathAvailabilityWithResponse(location, body, Context.NONE).getValue();
    }

    /**
     * Check quota availability
     *
     * <p>Check if a quota is available.
     *
     * @param location The name of Azure region.
     * @param body Quota availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckAvailabilityResponseInner>> checkQuotaAvailabilityWithResponseAsync(
        String location, QuotaAvailabilityRequest body) {
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
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkQuotaAvailability(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            body,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Check quota availability
     *
     * <p>Check if a quota is available.
     *
     * @param location The name of Azure region.
     * @param body Quota availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckAvailabilityResponseInner>> checkQuotaAvailabilityWithResponseAsync(
        String location, QuotaAvailabilityRequest body, Context context) {
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
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkQuotaAvailability(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                body,
                accept,
                context);
    }

    /**
     * Check quota availability
     *
     * <p>Check if a quota is available.
     *
     * @param location The name of Azure region.
     * @param body Quota availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckAvailabilityResponseInner> checkQuotaAvailabilityAsync(
        String location, QuotaAvailabilityRequest body) {
        return checkQuotaAvailabilityWithResponseAsync(location, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Check quota availability
     *
     * <p>Check if a quota is available.
     *
     * @param location The name of Azure region.
     * @param body Quota availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckAvailabilityResponseInner> checkQuotaAvailabilityWithResponse(
        String location, QuotaAvailabilityRequest body, Context context) {
        return checkQuotaAvailabilityWithResponseAsync(location, body, context).block();
    }

    /**
     * Check quota availability
     *
     * <p>Check if a quota is available.
     *
     * @param location The name of Azure region.
     * @param body Quota availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckAvailabilityResponseInner checkQuotaAvailability(String location, QuotaAvailabilityRequest body) {
        return checkQuotaAvailabilityWithResponse(location, body, Context.NONE).getValue();
    }

    /**
     * Describes region specific information.
     *
     * <p>Provides storage to network proximity and logical zone mapping information.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provides region specific information along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RegionInfoInner>> queryRegionInfoWithResponseAsync(String location) {
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
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .queryRegionInfo(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Describes region specific information.
     *
     * <p>Provides storage to network proximity and logical zone mapping information.
     *
     * @param location The name of Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provides region specific information along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RegionInfoInner>> queryRegionInfoWithResponseAsync(String location, Context context) {
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
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .queryRegionInfo(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Describes region specific information.
     *
     * <p>Provides storage to network proximity and logical zone mapping information.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provides region specific information on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<RegionInfoInner> queryRegionInfoAsync(String location) {
        return queryRegionInfoWithResponseAsync(location).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Describes region specific information.
     *
     * <p>Provides storage to network proximity and logical zone mapping information.
     *
     * @param location The name of Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provides region specific information along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RegionInfoInner> queryRegionInfoWithResponse(String location, Context context) {
        return queryRegionInfoWithResponseAsync(location, context).block();
    }

    /**
     * Describes region specific information.
     *
     * <p>Provides storage to network proximity and logical zone mapping information.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provides region specific information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RegionInfoInner queryRegionInfo(String location) {
        return queryRegionInfoWithResponse(location, Context.NONE).getValue();
    }
}
