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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.monitor.fluent.PredictiveMetricsClient;
import com.azure.resourcemanager.monitor.fluent.models.PredictiveResponseInner;
import java.time.Duration;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in PredictiveMetricsClient.
 */
public final class PredictiveMetricsClientImpl implements PredictiveMetricsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final PredictiveMetricsService service;

    /**
     * The service client containing this operation class.
     */
    private final MonitorClientImpl client;

    /**
     * Initializes an instance of PredictiveMetricsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
     PredictiveMetricsClientImpl(MonitorClientImpl client) {
        this.service = RestProxy.create(PredictiveMetricsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientPredictiveMetrics to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientPredict")
    public interface PredictiveMetricsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Insights/autoscalesettings/{autoscaleSettingName}/predictiveMetrics")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PredictiveResponseInner>> get(@HostParam("$host") String endpoint, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("autoscaleSettingName") String autoscaleSettingName, @QueryParam("timespan") String timespan, @QueryParam("interval") Duration interval, @QueryParam("metricNamespace") String metricNamespace, @QueryParam("metricName") String metricName, @QueryParam("aggregation") String aggregation, @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * get predictive autoscale metric future data.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autoscaleSettingName The autoscale setting name.
     * @param timespan The timespan of the query. It is a string with the following format 'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricNamespace Metric namespace to query metric definitions for.
     * @param metricName The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return predictive autoscale metric future data along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PredictiveResponseInner>> getWithResponseAsync(String resourceGroupName, String autoscaleSettingName, String timespan, Duration interval, String metricNamespace, String metricName, String aggregation) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (autoscaleSettingName == null) {
            return Mono.error(new IllegalArgumentException("Parameter autoscaleSettingName is required and cannot be null."));
        }
        if (timespan == null) {
            return Mono.error(new IllegalArgumentException("Parameter timespan is required and cannot be null."));
        }
        if (interval == null) {
            return Mono.error(new IllegalArgumentException("Parameter interval is required and cannot be null."));
        }
        if (metricNamespace == null) {
            return Mono.error(new IllegalArgumentException("Parameter metricNamespace is required and cannot be null."));
        }
        if (metricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter metricName is required and cannot be null."));
        }
        if (aggregation == null) {
            return Mono.error(new IllegalArgumentException("Parameter aggregation is required and cannot be null."));
        }
        final String apiVersion = "2022-10-01";
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, autoscaleSettingName, timespan, interval, metricNamespace, metricName, aggregation, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * get predictive autoscale metric future data.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autoscaleSettingName The autoscale setting name.
     * @param timespan The timespan of the query. It is a string with the following format 'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricNamespace Metric namespace to query metric definitions for.
     * @param metricName The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return predictive autoscale metric future data along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PredictiveResponseInner>> getWithResponseAsync(String resourceGroupName, String autoscaleSettingName, String timespan, Duration interval, String metricNamespace, String metricName, String aggregation, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (autoscaleSettingName == null) {
            return Mono.error(new IllegalArgumentException("Parameter autoscaleSettingName is required and cannot be null."));
        }
        if (timespan == null) {
            return Mono.error(new IllegalArgumentException("Parameter timespan is required and cannot be null."));
        }
        if (interval == null) {
            return Mono.error(new IllegalArgumentException("Parameter interval is required and cannot be null."));
        }
        if (metricNamespace == null) {
            return Mono.error(new IllegalArgumentException("Parameter metricNamespace is required and cannot be null."));
        }
        if (metricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter metricName is required and cannot be null."));
        }
        if (aggregation == null) {
            return Mono.error(new IllegalArgumentException("Parameter aggregation is required and cannot be null."));
        }
        final String apiVersion = "2022-10-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, autoscaleSettingName, timespan, interval, metricNamespace, metricName, aggregation, apiVersion, accept, context);
    }

    /**
     * get predictive autoscale metric future data.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autoscaleSettingName The autoscale setting name.
     * @param timespan The timespan of the query. It is a string with the following format 'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricNamespace Metric namespace to query metric definitions for.
     * @param metricName The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return predictive autoscale metric future data on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PredictiveResponseInner> getAsync(String resourceGroupName, String autoscaleSettingName, String timespan, Duration interval, String metricNamespace, String metricName, String aggregation) {
        return getWithResponseAsync(resourceGroupName, autoscaleSettingName, timespan, interval, metricNamespace, metricName, aggregation)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));}

    /**
     * get predictive autoscale metric future data.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autoscaleSettingName The autoscale setting name.
     * @param timespan The timespan of the query. It is a string with the following format 'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricNamespace Metric namespace to query metric definitions for.
     * @param metricName The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return predictive autoscale metric future data along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PredictiveResponseInner> getWithResponse(String resourceGroupName, String autoscaleSettingName, String timespan, Duration interval, String metricNamespace, String metricName, String aggregation, Context context) {
        return getWithResponseAsync(resourceGroupName, autoscaleSettingName, timespan, interval, metricNamespace, metricName, aggregation, context).block();
    }

    /**
     * get predictive autoscale metric future data.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autoscaleSettingName The autoscale setting name.
     * @param timespan The timespan of the query. It is a string with the following format 'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricNamespace Metric namespace to query metric definitions for.
     * @param metricName The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return predictive autoscale metric future data.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PredictiveResponseInner get(String resourceGroupName, String autoscaleSettingName, String timespan, Duration interval, String metricNamespace, String metricName, String aggregation) {
        return getWithResponse(resourceGroupName, autoscaleSettingName, timespan, interval, metricNamespace, metricName, aggregation, Context.NONE).getValue();
    }
}
