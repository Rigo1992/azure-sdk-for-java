// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import com.azure.resourcemanager.search.fluent.AdminKeysClient;
import com.azure.resourcemanager.search.fluent.NetworkSecurityPerimeterConfigurationsClient;
import com.azure.resourcemanager.search.fluent.OperationsClient;
import com.azure.resourcemanager.search.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.search.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.search.fluent.QueryKeysClient;
import com.azure.resourcemanager.search.fluent.SearchManagementClient;
import com.azure.resourcemanager.search.fluent.ServicesClient;
import com.azure.resourcemanager.search.fluent.SharedPrivateLinkResourcesClient;
import com.azure.resourcemanager.search.fluent.UsagesClient;
import com.azure.resourcemanager.search.fluent.models.QuotaUsageResultInner;
import java.time.Duration;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the SearchManagementClientImpl type.
 */
@ServiceClient(builder = SearchManagementClientBuilder.class)
public final class SearchManagementClientImpl extends AzureServiceClient implements SearchManagementClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final SearchManagementClientService service;

    /**
     * The unique identifier for a Microsoft Azure subscription. You can obtain this value from the Azure Resource
     * Manager API or the portal.
     */
    private final String subscriptionId;

    /**
     * Gets The unique identifier for a Microsoft Azure subscription. You can obtain this value from the Azure Resource
     * Manager API or the portal.
     * 
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * server parameter.
     */
    private final String endpoint;

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Api Version.
     */
    private final String apiVersion;

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The default poll interval for long-running operation.
     */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /**
     * The OperationsClient object to access its operations.
     */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /**
     * The AdminKeysClient object to access its operations.
     */
    private final AdminKeysClient adminKeys;

    /**
     * Gets the AdminKeysClient object to access its operations.
     * 
     * @return the AdminKeysClient object.
     */
    public AdminKeysClient getAdminKeys() {
        return this.adminKeys;
    }

    /**
     * The QueryKeysClient object to access its operations.
     */
    private final QueryKeysClient queryKeys;

    /**
     * Gets the QueryKeysClient object to access its operations.
     * 
     * @return the QueryKeysClient object.
     */
    public QueryKeysClient getQueryKeys() {
        return this.queryKeys;
    }

    /**
     * The ServicesClient object to access its operations.
     */
    private final ServicesClient services;

    /**
     * Gets the ServicesClient object to access its operations.
     * 
     * @return the ServicesClient object.
     */
    public ServicesClient getServices() {
        return this.services;
    }

    /**
     * The PrivateLinkResourcesClient object to access its operations.
     */
    private final PrivateLinkResourcesClient privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     * 
     * @return the PrivateLinkResourcesClient object.
     */
    public PrivateLinkResourcesClient getPrivateLinkResources() {
        return this.privateLinkResources;
    }

    /**
     * The PrivateEndpointConnectionsClient object to access its operations.
     */
    private final PrivateEndpointConnectionsClient privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     * 
     * @return the PrivateEndpointConnectionsClient object.
     */
    public PrivateEndpointConnectionsClient getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * The SharedPrivateLinkResourcesClient object to access its operations.
     */
    private final SharedPrivateLinkResourcesClient sharedPrivateLinkResources;

    /**
     * Gets the SharedPrivateLinkResourcesClient object to access its operations.
     * 
     * @return the SharedPrivateLinkResourcesClient object.
     */
    public SharedPrivateLinkResourcesClient getSharedPrivateLinkResources() {
        return this.sharedPrivateLinkResources;
    }

    /**
     * The UsagesClient object to access its operations.
     */
    private final UsagesClient usages;

    /**
     * Gets the UsagesClient object to access its operations.
     * 
     * @return the UsagesClient object.
     */
    public UsagesClient getUsages() {
        return this.usages;
    }

    /**
     * The NetworkSecurityPerimeterConfigurationsClient object to access its operations.
     */
    private final NetworkSecurityPerimeterConfigurationsClient networkSecurityPerimeterConfigurations;

    /**
     * Gets the NetworkSecurityPerimeterConfigurationsClient object to access its operations.
     * 
     * @return the NetworkSecurityPerimeterConfigurationsClient object.
     */
    public NetworkSecurityPerimeterConfigurationsClient getNetworkSecurityPerimeterConfigurations() {
        return this.networkSecurityPerimeterConfigurations;
    }

    /**
     * Initializes an instance of SearchManagementClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The unique identifier for a Microsoft Azure subscription. You can obtain this value from
     * the Azure Resource Manager API or the portal.
     * @param endpoint server parameter.
     */
    SearchManagementClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter,
        Duration defaultPollInterval, AzureEnvironment environment, String subscriptionId, String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2024-03-01-preview";
        this.operations = new OperationsClientImpl(this);
        this.adminKeys = new AdminKeysClientImpl(this);
        this.queryKeys = new QueryKeysClientImpl(this);
        this.services = new ServicesClientImpl(this);
        this.privateLinkResources = new PrivateLinkResourcesClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
        this.sharedPrivateLinkResources = new SharedPrivateLinkResourcesClientImpl(this);
        this.usages = new UsagesClientImpl(this);
        this.networkSecurityPerimeterConfigurations = new NetworkSecurityPerimeterConfigurationsClientImpl(this);
        this.service
            = RestProxy.create(SearchManagementClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for SearchManagementClient to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SearchManagementClie")
    public interface SearchManagementClientService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Search/locations/{location}/usages/{skuName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<QuotaUsageResultInner>> usageBySubscriptionSku(@HostParam("$host") String endpoint,
            @HeaderParam("x-ms-client-request-id") UUID clientRequestId, @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("skuName") String skuName, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets the quota usage for a search sku in the given subscription.
     * 
     * @param location The unique location name for a Microsoft Azure geographic region.
     * @param skuName The unique SKU name that identifies a billable tier.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota usage for a search sku in the given subscription along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<QuotaUsageResultInner>> usageBySubscriptionSkuWithResponseAsync(String location,
        String skuName, UUID clientRequestId) {
        if (this.getEndpoint() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.getSubscriptionId() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.getSubscriptionId() is required and cannot be null."));
        }
        if (skuName == null) {
            return Mono.error(new IllegalArgumentException("Parameter skuName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.usageBySubscriptionSku(this.getEndpoint(), clientRequestId, location,
                this.getApiVersion(), this.getSubscriptionId(), skuName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.getContext()).readOnly()));
    }

    /**
     * Gets the quota usage for a search sku in the given subscription.
     * 
     * @param location The unique location name for a Microsoft Azure geographic region.
     * @param skuName The unique SKU name that identifies a billable tier.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota usage for a search sku in the given subscription along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QuotaUsageResultInner>> usageBySubscriptionSkuWithResponseAsync(String location,
        String skuName, UUID clientRequestId, Context context) {
        if (this.getEndpoint() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.getSubscriptionId() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.getSubscriptionId() is required and cannot be null."));
        }
        if (skuName == null) {
            return Mono.error(new IllegalArgumentException("Parameter skuName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.mergeContext(context);
        return service.usageBySubscriptionSku(this.getEndpoint(), clientRequestId, location, this.getApiVersion(),
            this.getSubscriptionId(), skuName, accept, context);
    }

    /**
     * Gets the quota usage for a search sku in the given subscription.
     * 
     * @param location The unique location name for a Microsoft Azure geographic region.
     * @param skuName The unique SKU name that identifies a billable tier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota usage for a search sku in the given subscription on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<QuotaUsageResultInner> usageBySubscriptionSkuAsync(String location, String skuName) {
        final UUID clientRequestId = null;
        return usageBySubscriptionSkuWithResponseAsync(location, skuName, clientRequestId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the quota usage for a search sku in the given subscription.
     * 
     * @param location The unique location name for a Microsoft Azure geographic region.
     * @param skuName The unique SKU name that identifies a billable tier.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota usage for a search sku in the given subscription along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<QuotaUsageResultInner> usageBySubscriptionSkuWithResponse(String location, String skuName,
        UUID clientRequestId, Context context) {
        return usageBySubscriptionSkuWithResponseAsync(location, skuName, clientRequestId, context).block();
    }

    /**
     * Gets the quota usage for a search sku in the given subscription.
     * 
     * @param location The unique location name for a Microsoft Azure geographic region.
     * @param skuName The unique SKU name that identifies a billable tier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota usage for a search sku in the given subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public QuotaUsageResultInner usageBySubscriptionSku(String location, String skuName) {
        final UUID clientRequestId = null;
        return usageBySubscriptionSkuWithResponse(location, skuName, clientRequestId, Context.NONE).getValue();
    }
}
