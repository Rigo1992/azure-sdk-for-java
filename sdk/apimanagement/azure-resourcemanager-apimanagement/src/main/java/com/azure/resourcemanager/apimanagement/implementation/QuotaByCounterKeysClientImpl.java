// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
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
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.QuotaByCounterKeysClient;
import com.azure.resourcemanager.apimanagement.fluent.models.QuotaCounterCollectionInner;
import com.azure.resourcemanager.apimanagement.models.QuotaCounterValueUpdateContract;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in QuotaByCounterKeysClient. */
public final class QuotaByCounterKeysClientImpl implements QuotaByCounterKeysClient {
    private final ClientLogger logger = new ClientLogger(QuotaByCounterKeysClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final QuotaByCounterKeysService service;

    /** The service client containing this operation class. */
    private final ApiManagementClientImpl client;

    /**
     * Initializes an instance of QuotaByCounterKeysClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    QuotaByCounterKeysClientImpl(ApiManagementClientImpl client) {
        this.service =
            RestProxy.create(QuotaByCounterKeysService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiManagementClientQuotaByCounterKeys to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ApiManagementClientQ")
    private interface QuotaByCounterKeysService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement"
                + "/service/{serviceName}/quotas/{quotaCounterKey}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<QuotaCounterCollectionInner>> listByService(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @PathParam("quotaCounterKey") String quotaCounterKey,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement"
                + "/service/{serviceName}/quotas/{quotaCounterKey}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<QuotaCounterCollectionInner>> update(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @PathParam("quotaCounterKey") String quotaCounterKey,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") QuotaCounterValueUpdateContract parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists a collection of current quota counter periods associated with the counter-key configured in the policy on
     * the specified service instance. The api does not support paging yet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Quota Counter list representation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QuotaCounterCollectionInner>> listByServiceWithResponseAsync(
        String resourceGroupName, String serviceName, String quotaCounterKey) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (quotaCounterKey == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter quotaCounterKey is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByService(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serviceName,
                            quotaCounterKey,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists a collection of current quota counter periods associated with the counter-key configured in the policy on
     * the specified service instance. The api does not support paging yet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Quota Counter list representation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QuotaCounterCollectionInner>> listByServiceWithResponseAsync(
        String resourceGroupName, String serviceName, String quotaCounterKey, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (quotaCounterKey == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter quotaCounterKey is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByService(
                this.client.getEndpoint(),
                resourceGroupName,
                serviceName,
                quotaCounterKey,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Lists a collection of current quota counter periods associated with the counter-key configured in the policy on
     * the specified service instance. The api does not support paging yet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Quota Counter list representation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<QuotaCounterCollectionInner> listByServiceAsync(
        String resourceGroupName, String serviceName, String quotaCounterKey) {
        return listByServiceWithResponseAsync(resourceGroupName, serviceName, quotaCounterKey)
            .flatMap(
                (Response<QuotaCounterCollectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Lists a collection of current quota counter periods associated with the counter-key configured in the policy on
     * the specified service instance. The api does not support paging yet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Quota Counter list representation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public QuotaCounterCollectionInner listByService(
        String resourceGroupName, String serviceName, String quotaCounterKey) {
        return listByServiceAsync(resourceGroupName, serviceName, quotaCounterKey).block();
    }

    /**
     * Lists a collection of current quota counter periods associated with the counter-key configured in the policy on
     * the specified service instance. The api does not support paging yet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Quota Counter list representation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<QuotaCounterCollectionInner> listByServiceWithResponse(
        String resourceGroupName, String serviceName, String quotaCounterKey, Context context) {
        return listByServiceWithResponseAsync(resourceGroupName, serviceName, quotaCounterKey, context).block();
    }

    /**
     * Updates all the quota counter values specified with the existing quota counter key to a value in the specified
     * service instance. This should be used for reset of the quota counter values.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param parameters The value of the quota counter to be applied to all quota counter periods.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Quota Counter list representation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QuotaCounterCollectionInner>> updateWithResponseAsync(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        QuotaCounterValueUpdateContract parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (quotaCounterKey == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter quotaCounterKey is required and cannot be null."));
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
                        .update(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serviceName,
                            quotaCounterKey,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Updates all the quota counter values specified with the existing quota counter key to a value in the specified
     * service instance. This should be used for reset of the quota counter values.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param parameters The value of the quota counter to be applied to all quota counter periods.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Quota Counter list representation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QuotaCounterCollectionInner>> updateWithResponseAsync(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        QuotaCounterValueUpdateContract parameters,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (quotaCounterKey == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter quotaCounterKey is required and cannot be null."));
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
            .update(
                this.client.getEndpoint(),
                resourceGroupName,
                serviceName,
                quotaCounterKey,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                parameters,
                accept,
                context);
    }

    /**
     * Updates all the quota counter values specified with the existing quota counter key to a value in the specified
     * service instance. This should be used for reset of the quota counter values.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param parameters The value of the quota counter to be applied to all quota counter periods.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Quota Counter list representation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<QuotaCounterCollectionInner> updateAsync(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        QuotaCounterValueUpdateContract parameters) {
        return updateWithResponseAsync(resourceGroupName, serviceName, quotaCounterKey, parameters)
            .flatMap(
                (Response<QuotaCounterCollectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Updates all the quota counter values specified with the existing quota counter key to a value in the specified
     * service instance. This should be used for reset of the quota counter values.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param parameters The value of the quota counter to be applied to all quota counter periods.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Quota Counter list representation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public QuotaCounterCollectionInner update(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        QuotaCounterValueUpdateContract parameters) {
        return updateAsync(resourceGroupName, serviceName, quotaCounterKey, parameters).block();
    }

    /**
     * Updates all the quota counter values specified with the existing quota counter key to a value in the specified
     * service instance. This should be used for reset of the quota counter values.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param parameters The value of the quota counter to be applied to all quota counter periods.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Quota Counter list representation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<QuotaCounterCollectionInner> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        QuotaCounterValueUpdateContract parameters,
        Context context) {
        return updateWithResponseAsync(resourceGroupName, serviceName, quotaCounterKey, parameters, context).block();
    }
}
