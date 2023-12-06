// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.implementation;

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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.appservice.fluent.CertificateOrdersDiagnosticsClient;
import com.azure.resourcemanager.appservice.fluent.models.DetectorResponseInner;
import com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException;
import com.azure.resourcemanager.appservice.models.DetectorResponseCollection;
import java.time.OffsetDateTime;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in CertificateOrdersDiagnosticsClient.
 */
public final class CertificateOrdersDiagnosticsClientImpl implements CertificateOrdersDiagnosticsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final CertificateOrdersDiagnosticsService service;

    /**
     * The service client containing this operation class.
     */
    private final WebSiteManagementClientImpl client;

    /**
     * Initializes an instance of CertificateOrdersDiagnosticsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    CertificateOrdersDiagnosticsClientImpl(WebSiteManagementClientImpl client) {
        this.service = RestProxy.create(CertificateOrdersDiagnosticsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for WebSiteManagementClientCertificateOrdersDiagnostics to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "WebSiteManagementCli")
    public interface CertificateOrdersDiagnosticsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CertificateRegistration/certificateOrders/{certificateOrderName}/detectors")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<Response<DetectorResponseCollection>> listAppServiceCertificateOrderDetectorResponse(
            @HostParam("$host") String endpoint, @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("certificateOrderName") String certificateOrderName,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CertificateRegistration/certificateOrders/{certificateOrderName}/detectors/{detectorName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<Response<DetectorResponseInner>> getAppServiceCertificateOrderDetectorResponse(
            @HostParam("$host") String endpoint, @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("certificateOrderName") String certificateOrderName,
            @PathParam("detectorName") String detectorName, @QueryParam("startTime") OffsetDateTime startTime,
            @QueryParam("endTime") OffsetDateTime endTime, @QueryParam("timeGrain") String timeGrain,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<Response<DetectorResponseCollection>> listAppServiceCertificateOrderDetectorResponseNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Microsoft.CertificateRegistration to get the list of detectors for this RP.
     * 
     * Description for Microsoft.CertificateRegistration to get the list of detectors for this RP.
     * 
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of detector responses along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DetectorResponseInner>> listAppServiceCertificateOrderDetectorResponseSinglePageAsync(
        String resourceGroupName, String certificateOrderName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (certificateOrderName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter certificateOrderName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listAppServiceCertificateOrderDetectorResponse(this.client.getEndpoint(),
                resourceGroupName, certificateOrderName, this.client.getSubscriptionId(), this.client.getApiVersion(),
                accept, context))
            .<PagedResponse<DetectorResponseInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Microsoft.CertificateRegistration to get the list of detectors for this RP.
     * 
     * Description for Microsoft.CertificateRegistration to get the list of detectors for this RP.
     * 
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of detector responses along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DetectorResponseInner>> listAppServiceCertificateOrderDetectorResponseSinglePageAsync(
        String resourceGroupName, String certificateOrderName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (certificateOrderName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter certificateOrderName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listAppServiceCertificateOrderDetectorResponse(this.client.getEndpoint(), resourceGroupName,
                certificateOrderName, this.client.getSubscriptionId(), this.client.getApiVersion(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Microsoft.CertificateRegistration to get the list of detectors for this RP.
     * 
     * Description for Microsoft.CertificateRegistration to get the list of detectors for this RP.
     * 
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of detector responses as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DetectorResponseInner>
        listAppServiceCertificateOrderDetectorResponseAsync(String resourceGroupName, String certificateOrderName) {
        return new PagedFlux<>(
            () -> listAppServiceCertificateOrderDetectorResponseSinglePageAsync(resourceGroupName,
                certificateOrderName),
            nextLink -> listAppServiceCertificateOrderDetectorResponseNextSinglePageAsync(nextLink));
    }

    /**
     * Microsoft.CertificateRegistration to get the list of detectors for this RP.
     * 
     * Description for Microsoft.CertificateRegistration to get the list of detectors for this RP.
     * 
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of detector responses as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DetectorResponseInner> listAppServiceCertificateOrderDetectorResponseAsync(
        String resourceGroupName, String certificateOrderName, Context context) {
        return new PagedFlux<>(
            () -> listAppServiceCertificateOrderDetectorResponseSinglePageAsync(resourceGroupName, certificateOrderName,
                context),
            nextLink -> listAppServiceCertificateOrderDetectorResponseNextSinglePageAsync(nextLink, context));
    }

    /**
     * Microsoft.CertificateRegistration to get the list of detectors for this RP.
     * 
     * Description for Microsoft.CertificateRegistration to get the list of detectors for this RP.
     * 
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of detector responses as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DetectorResponseInner> listAppServiceCertificateOrderDetectorResponse(String resourceGroupName,
        String certificateOrderName) {
        return new PagedIterable<>(
            listAppServiceCertificateOrderDetectorResponseAsync(resourceGroupName, certificateOrderName));
    }

    /**
     * Microsoft.CertificateRegistration to get the list of detectors for this RP.
     * 
     * Description for Microsoft.CertificateRegistration to get the list of detectors for this RP.
     * 
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of detector responses as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DetectorResponseInner> listAppServiceCertificateOrderDetectorResponse(String resourceGroupName,
        String certificateOrderName, Context context) {
        return new PagedIterable<>(
            listAppServiceCertificateOrderDetectorResponseAsync(resourceGroupName, certificateOrderName, context));
    }

    /**
     * Microsoft.CertificateRegistration call to get a detector response from App Lens.
     * 
     * Description for Microsoft.CertificateRegistration call to get a detector response from App Lens.
     * 
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @param detectorName The detector name which needs to be run.
     * @param startTime The start time for detector response.
     * @param endTime The end time for the detector response.
     * @param timeGrain The time grain for the detector response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing Response from Detector along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DetectorResponseInner>> getAppServiceCertificateOrderDetectorResponseWithResponseAsync(
        String resourceGroupName, String certificateOrderName, String detectorName, OffsetDateTime startTime,
        OffsetDateTime endTime, String timeGrain) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (certificateOrderName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter certificateOrderName is required and cannot be null."));
        }
        if (detectorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter detectorName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.getAppServiceCertificateOrderDetectorResponse(this.client.getEndpoint(),
                resourceGroupName, certificateOrderName, detectorName, startTime, endTime, timeGrain,
                this.client.getSubscriptionId(), this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Microsoft.CertificateRegistration call to get a detector response from App Lens.
     * 
     * Description for Microsoft.CertificateRegistration call to get a detector response from App Lens.
     * 
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @param detectorName The detector name which needs to be run.
     * @param startTime The start time for detector response.
     * @param endTime The end time for the detector response.
     * @param timeGrain The time grain for the detector response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing Response from Detector along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DetectorResponseInner>> getAppServiceCertificateOrderDetectorResponseWithResponseAsync(
        String resourceGroupName, String certificateOrderName, String detectorName, OffsetDateTime startTime,
        OffsetDateTime endTime, String timeGrain, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (certificateOrderName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter certificateOrderName is required and cannot be null."));
        }
        if (detectorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter detectorName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.getAppServiceCertificateOrderDetectorResponse(this.client.getEndpoint(), resourceGroupName,
            certificateOrderName, detectorName, startTime, endTime, timeGrain, this.client.getSubscriptionId(),
            this.client.getApiVersion(), accept, context);
    }

    /**
     * Microsoft.CertificateRegistration call to get a detector response from App Lens.
     * 
     * Description for Microsoft.CertificateRegistration call to get a detector response from App Lens.
     * 
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @param detectorName The detector name which needs to be run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing Response from Detector on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DetectorResponseInner> getAppServiceCertificateOrderDetectorResponseAsync(String resourceGroupName,
        String certificateOrderName, String detectorName) {
        final OffsetDateTime startTime = null;
        final OffsetDateTime endTime = null;
        final String timeGrain = null;
        return getAppServiceCertificateOrderDetectorResponseWithResponseAsync(resourceGroupName, certificateOrderName,
            detectorName, startTime, endTime, timeGrain).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Microsoft.CertificateRegistration call to get a detector response from App Lens.
     * 
     * Description for Microsoft.CertificateRegistration call to get a detector response from App Lens.
     * 
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @param detectorName The detector name which needs to be run.
     * @param startTime The start time for detector response.
     * @param endTime The end time for the detector response.
     * @param timeGrain The time grain for the detector response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing Response from Detector along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DetectorResponseInner> getAppServiceCertificateOrderDetectorResponseWithResponse(
        String resourceGroupName, String certificateOrderName, String detectorName, OffsetDateTime startTime,
        OffsetDateTime endTime, String timeGrain, Context context) {
        return getAppServiceCertificateOrderDetectorResponseWithResponseAsync(resourceGroupName, certificateOrderName,
            detectorName, startTime, endTime, timeGrain, context).block();
    }

    /**
     * Microsoft.CertificateRegistration call to get a detector response from App Lens.
     * 
     * Description for Microsoft.CertificateRegistration call to get a detector response from App Lens.
     * 
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param certificateOrderName The certificate order name for which the response is needed.
     * @param detectorName The detector name which needs to be run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing Response from Detector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DetectorResponseInner getAppServiceCertificateOrderDetectorResponse(String resourceGroupName,
        String certificateOrderName, String detectorName) {
        final OffsetDateTime startTime = null;
        final OffsetDateTime endTime = null;
        final String timeGrain = null;
        return getAppServiceCertificateOrderDetectorResponseWithResponse(resourceGroupName, certificateOrderName,
            detectorName, startTime, endTime, timeGrain, Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of detector responses along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DetectorResponseInner>>
        listAppServiceCertificateOrderDetectorResponseNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listAppServiceCertificateOrderDetectorResponseNext(nextLink,
                this.client.getEndpoint(), accept, context))
            .<PagedResponse<DetectorResponseInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of detector responses along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DetectorResponseInner>>
        listAppServiceCertificateOrderDetectorResponseNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listAppServiceCertificateOrderDetectorResponseNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
