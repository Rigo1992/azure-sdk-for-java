// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

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
import com.azure.resourcemanager.support.fluent.ServicesClient;
import com.azure.resourcemanager.support.fluent.models.ServiceInner;
import com.azure.resourcemanager.support.models.ServicesListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ServicesClient.
 */
public final class ServicesClientImpl implements ServicesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ServicesService service;

    /**
     * The service client containing this operation class.
     */
    private final MicrosoftSupportImpl client;

    /**
     * Initializes an instance of ServicesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ServicesClientImpl(MicrosoftSupportImpl client) {
        this.service = RestProxy.create(ServicesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftSupportServices to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftSupportServ")
    public interface ServicesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/providers/Microsoft.Support/services")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServicesListResult>> list(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/providers/Microsoft.Support/services/{serviceName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServiceInner>> get(@HostParam("$host") String endpoint,
            @PathParam("serviceName") String serviceName, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Lists all the Azure services available for support ticket creation. For **Technical** issues, select the Service
     * Id that maps to the Azure service/product as displayed in the **Services** drop-down list on the Azure portal's
     * [New support request](https://portal.azure.com/#blade/Microsoft_Azure_Support/HelpAndSupportBlade/overview) page.
     * Always use the service and its corresponding problem classification(s) obtained programmatically for support
     * ticket creation. This practice ensures that you always have the most recent set of service and problem
     * classification Ids.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Service resources along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ServiceInner>> listSinglePageAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.list(this.client.getEndpoint(), this.client.getApiVersion(), accept, context))
            .<PagedResponse<ServiceInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists all the Azure services available for support ticket creation. For **Technical** issues, select the Service
     * Id that maps to the Azure service/product as displayed in the **Services** drop-down list on the Azure portal's
     * [New support request](https://portal.azure.com/#blade/Microsoft_Azure_Support/HelpAndSupportBlade/overview) page.
     * Always use the service and its corresponding problem classification(s) obtained programmatically for support
     * ticket creation. This practice ensures that you always have the most recent set of service and problem
     * classification Ids.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Service resources along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ServiceInner>> listSinglePageAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), this.client.getApiVersion(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), null, null));
    }

    /**
     * Lists all the Azure services available for support ticket creation. For **Technical** issues, select the Service
     * Id that maps to the Azure service/product as displayed in the **Services** drop-down list on the Azure portal's
     * [New support request](https://portal.azure.com/#blade/Microsoft_Azure_Support/HelpAndSupportBlade/overview) page.
     * Always use the service and its corresponding problem classification(s) obtained programmatically for support
     * ticket creation. This practice ensures that you always have the most recent set of service and problem
     * classification Ids.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Service resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ServiceInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync());
    }

    /**
     * Lists all the Azure services available for support ticket creation. For **Technical** issues, select the Service
     * Id that maps to the Azure service/product as displayed in the **Services** drop-down list on the Azure portal's
     * [New support request](https://portal.azure.com/#blade/Microsoft_Azure_Support/HelpAndSupportBlade/overview) page.
     * Always use the service and its corresponding problem classification(s) obtained programmatically for support
     * ticket creation. This practice ensures that you always have the most recent set of service and problem
     * classification Ids.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Service resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ServiceInner> listAsync(Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(context));
    }

    /**
     * Lists all the Azure services available for support ticket creation. For **Technical** issues, select the Service
     * Id that maps to the Azure service/product as displayed in the **Services** drop-down list on the Azure portal's
     * [New support request](https://portal.azure.com/#blade/Microsoft_Azure_Support/HelpAndSupportBlade/overview) page.
     * Always use the service and its corresponding problem classification(s) obtained programmatically for support
     * ticket creation. This practice ensures that you always have the most recent set of service and problem
     * classification Ids.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Service resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServiceInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Lists all the Azure services available for support ticket creation. For **Technical** issues, select the Service
     * Id that maps to the Azure service/product as displayed in the **Services** drop-down list on the Azure portal's
     * [New support request](https://portal.azure.com/#blade/Microsoft_Azure_Support/HelpAndSupportBlade/overview) page.
     * Always use the service and its corresponding problem classification(s) obtained programmatically for support
     * ticket creation. This practice ensures that you always have the most recent set of service and problem
     * classification Ids.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Service resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServiceInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Gets a specific Azure service for support ticket creation.
     * 
     * @param serviceName Name of the Azure service for which the problem classifications need to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific Azure service for support ticket creation along with {@link Response} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServiceInner>> getWithResponseAsync(String serviceName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), serviceName, this.client.getApiVersion(),
                accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a specific Azure service for support ticket creation.
     * 
     * @param serviceName Name of the Azure service for which the problem classifications need to be retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific Azure service for support ticket creation along with {@link Response} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServiceInner>> getWithResponseAsync(String serviceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), serviceName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Gets a specific Azure service for support ticket creation.
     * 
     * @param serviceName Name of the Azure service for which the problem classifications need to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific Azure service for support ticket creation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ServiceInner> getAsync(String serviceName) {
        return getWithResponseAsync(serviceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a specific Azure service for support ticket creation.
     * 
     * @param serviceName Name of the Azure service for which the problem classifications need to be retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific Azure service for support ticket creation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ServiceInner> getWithResponse(String serviceName, Context context) {
        return getWithResponseAsync(serviceName, context).block();
    }

    /**
     * Gets a specific Azure service for support ticket creation.
     * 
     * @param serviceName Name of the Azure service for which the problem classifications need to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific Azure service for support ticket creation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceInner get(String serviceName) {
        return getWithResponse(serviceName, Context.NONE).getValue();
    }
}
