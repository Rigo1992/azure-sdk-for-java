// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.fluent.models.PredictiveResponseInner;
import java.time.Duration;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in PredictiveMetricsClient.
 */
public interface PredictiveMetricsClient {
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
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return predictive autoscale metric future data along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PredictiveResponseInner>> getWithResponseAsync(String resourceGroupName, String autoscaleSettingName, String timespan, Duration interval, String metricNamespace, String metricName, String aggregation);

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
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return predictive autoscale metric future data on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PredictiveResponseInner> getAsync(String resourceGroupName, String autoscaleSettingName, String timespan, Duration interval, String metricNamespace, String metricName, String aggregation);

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
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return predictive autoscale metric future data along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PredictiveResponseInner> getWithResponse(String resourceGroupName, String autoscaleSettingName, String timespan, Duration interval, String metricNamespace, String metricName, String aggregation, Context context);

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
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return predictive autoscale metric future data.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PredictiveResponseInner get(String resourceGroupName, String autoscaleSettingName, String timespan, Duration interval, String metricNamespace, String metricName, String aggregation);
}
