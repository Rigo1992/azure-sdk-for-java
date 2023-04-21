// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.metrics;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.monitor.query.implementation.metrics.models.ErrorResponseException;
import com.azure.monitor.query.implementation.metrics.models.MetricsResponse;
import com.azure.monitor.query.implementation.metrics.models.ResultType;
import java.time.Duration;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Metrics. */
public final class MetricsImpl {
    /** The proxy service used to perform REST calls. */
    private final MetricsService service;

    /** The service client containing this operation class. */
    private final MonitorManagementClientImpl client;

    /**
     * Initializes an instance of Metrics.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MetricsImpl(MonitorManagementClientImpl client) {
        this.service = RestProxy.create(MetricsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorManagementClientMetrics to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorManagementCli")
    public interface MetricsService {
        @Get("/{resourceUri}/providers/Microsoft.Insights/metrics")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<MetricsResponse>> list(
                @HostParam("$host") String host,
                @PathParam(value = "resourceUri", encoded = true) String resourceUri,
                @QueryParam("timespan") String timespan,
                @QueryParam("interval") Duration interval,
                @QueryParam("metricnames") String metricnames,
                @QueryParam("aggregation") String aggregation,
                @QueryParam("top") Integer top,
                @QueryParam("orderby") String orderBy,
                @QueryParam("$filter") String filter,
                @QueryParam("resultType") ResultType resultType,
                @QueryParam("api-version") String apiVersion,
                @QueryParam("metricnamespace") String metricnamespace,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/{resourceUri}/providers/Microsoft.Insights/metrics")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Response<MetricsResponse> listSync(
                @HostParam("$host") String host,
                @PathParam(value = "resourceUri", encoded = true) String resourceUri,
                @QueryParam("timespan") String timespan,
                @QueryParam("interval") Duration interval,
                @QueryParam("metricnames") String metricnames,
                @QueryParam("aggregation") String aggregation,
                @QueryParam("top") Integer top,
                @QueryParam("orderby") String orderBy,
                @QueryParam("$filter") String filter,
                @QueryParam("resultType") ResultType resultType,
                @QueryParam("api-version") String apiVersion,
                @QueryParam("metricnamespace") String metricnamespace,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricnames The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself
     *     has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve. Valid only if $filter is specified. Defaults to 10.
     * @param orderBy The aggregation to use for sorting results and the direction of the sort. Only one order can be
     *     specified. Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data returned. Example: Metric contains
     *     metadata A, B and C. - Return all time series of C where A = a1 and B = b1 or b2 **$filter=A eq 'a1' and B eq
     *     'b1' or B eq 'b2' and C eq '*'** - Invalid variant: **$filter=A eq 'a1' and B eq 'b1' and C eq '*' or B =
     *     'b2'** This is invalid because the logical or operator cannot separate two different metadata names. - Return
     *     all time series where A = a1, B = b1 and C = c1: **$filter=A eq 'a1' and B eq 'b1' and C eq 'c1'** - Return
     *     all time series where A = a1 **$filter=A eq 'a1' and B eq '*' and C eq '*'**. Special case: When dimension
     *     name or dimension value uses round brackets. Eg: When dimension name is **dim (test) 1** Instead of using
     *     $filter= "dim (test) 1 eq '*' " use **$filter= "dim %2528test%2529 1 eq '*' "** When dimension name is **dim
     *     (test) 3** and dimension value is **dim3 (test) val** Instead of using $filter= "dim (test) 3 eq 'dim3 (test)
     *     val' " use **$filter= "dim %2528test%2529 3 eq 'dim3 %2528test%2529 val' "**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the
     *     operation's description for details.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MetricsResponse>> listWithResponseAsync(
            String resourceUri,
            String timespan,
            Duration interval,
            String metricnames,
            String aggregation,
            Integer top,
            String orderBy,
            String filter,
            ResultType resultType,
            String metricnamespace) {
        if (this.client.getHost() == null) {
            throw new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null.");
        }
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.list(
                                this.client.getHost(),
                                resourceUri,
                                timespan,
                                interval,
                                metricnames,
                                aggregation,
                                top,
                                orderBy,
                                filter,
                                resultType,
                                this.client.getApiVersion(),
                                metricnamespace,
                                accept,
                                context));
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricnames The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself
     *     has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve. Valid only if $filter is specified. Defaults to 10.
     * @param orderBy The aggregation to use for sorting results and the direction of the sort. Only one order can be
     *     specified. Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data returned. Example: Metric contains
     *     metadata A, B and C. - Return all time series of C where A = a1 and B = b1 or b2 **$filter=A eq 'a1' and B eq
     *     'b1' or B eq 'b2' and C eq '*'** - Invalid variant: **$filter=A eq 'a1' and B eq 'b1' and C eq '*' or B =
     *     'b2'** This is invalid because the logical or operator cannot separate two different metadata names. - Return
     *     all time series where A = a1, B = b1 and C = c1: **$filter=A eq 'a1' and B eq 'b1' and C eq 'c1'** - Return
     *     all time series where A = a1 **$filter=A eq 'a1' and B eq '*' and C eq '*'**. Special case: When dimension
     *     name or dimension value uses round brackets. Eg: When dimension name is **dim (test) 1** Instead of using
     *     $filter= "dim (test) 1 eq '*' " use **$filter= "dim %2528test%2529 1 eq '*' "** When dimension name is **dim
     *     (test) 3** and dimension value is **dim3 (test) val** Instead of using $filter= "dim (test) 3 eq 'dim3 (test)
     *     val' " use **$filter= "dim %2528test%2529 3 eq 'dim3 %2528test%2529 val' "**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the
     *     operation's description for details.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MetricsResponse>> listWithResponseAsync(
            String resourceUri,
            String timespan,
            Duration interval,
            String metricnames,
            String aggregation,
            Integer top,
            String orderBy,
            String filter,
            ResultType resultType,
            String metricnamespace,
            Context context) {
        if (this.client.getHost() == null) {
            throw new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null.");
        }
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        final String accept = "application/json";
        return service.list(
                this.client.getHost(),
                resourceUri,
                timespan,
                interval,
                metricnames,
                aggregation,
                top,
                orderBy,
                filter,
                resultType,
                this.client.getApiVersion(),
                metricnamespace,
                accept,
                context);
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricnames The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself
     *     has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve. Valid only if $filter is specified. Defaults to 10.
     * @param orderBy The aggregation to use for sorting results and the direction of the sort. Only one order can be
     *     specified. Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data returned. Example: Metric contains
     *     metadata A, B and C. - Return all time series of C where A = a1 and B = b1 or b2 **$filter=A eq 'a1' and B eq
     *     'b1' or B eq 'b2' and C eq '*'** - Invalid variant: **$filter=A eq 'a1' and B eq 'b1' and C eq '*' or B =
     *     'b2'** This is invalid because the logical or operator cannot separate two different metadata names. - Return
     *     all time series where A = a1, B = b1 and C = c1: **$filter=A eq 'a1' and B eq 'b1' and C eq 'c1'** - Return
     *     all time series where A = a1 **$filter=A eq 'a1' and B eq '*' and C eq '*'**. Special case: When dimension
     *     name or dimension value uses round brackets. Eg: When dimension name is **dim (test) 1** Instead of using
     *     $filter= "dim (test) 1 eq '*' " use **$filter= "dim %2528test%2529 1 eq '*' "** When dimension name is **dim
     *     (test) 3** and dimension value is **dim3 (test) val** Instead of using $filter= "dim (test) 3 eq 'dim3 (test)
     *     val' " use **$filter= "dim %2528test%2529 3 eq 'dim3 %2528test%2529 val' "**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the
     *     operation's description for details.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MetricsResponse> listAsync(
            String resourceUri,
            String timespan,
            Duration interval,
            String metricnames,
            String aggregation,
            Integer top,
            String orderBy,
            String filter,
            ResultType resultType,
            String metricnamespace) {
        return listWithResponseAsync(
                        resourceUri,
                        timespan,
                        interval,
                        metricnames,
                        aggregation,
                        top,
                        orderBy,
                        filter,
                        resultType,
                        metricnamespace)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricnames The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself
     *     has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve. Valid only if $filter is specified. Defaults to 10.
     * @param orderBy The aggregation to use for sorting results and the direction of the sort. Only one order can be
     *     specified. Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data returned. Example: Metric contains
     *     metadata A, B and C. - Return all time series of C where A = a1 and B = b1 or b2 **$filter=A eq 'a1' and B eq
     *     'b1' or B eq 'b2' and C eq '*'** - Invalid variant: **$filter=A eq 'a1' and B eq 'b1' and C eq '*' or B =
     *     'b2'** This is invalid because the logical or operator cannot separate two different metadata names. - Return
     *     all time series where A = a1, B = b1 and C = c1: **$filter=A eq 'a1' and B eq 'b1' and C eq 'c1'** - Return
     *     all time series where A = a1 **$filter=A eq 'a1' and B eq '*' and C eq '*'**. Special case: When dimension
     *     name or dimension value uses round brackets. Eg: When dimension name is **dim (test) 1** Instead of using
     *     $filter= "dim (test) 1 eq '*' " use **$filter= "dim %2528test%2529 1 eq '*' "** When dimension name is **dim
     *     (test) 3** and dimension value is **dim3 (test) val** Instead of using $filter= "dim (test) 3 eq 'dim3 (test)
     *     val' " use **$filter= "dim %2528test%2529 3 eq 'dim3 %2528test%2529 val' "**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the
     *     operation's description for details.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MetricsResponse> listAsync(
            String resourceUri,
            String timespan,
            Duration interval,
            String metricnames,
            String aggregation,
            Integer top,
            String orderBy,
            String filter,
            ResultType resultType,
            String metricnamespace,
            Context context) {
        return listWithResponseAsync(
                        resourceUri,
                        timespan,
                        interval,
                        metricnames,
                        aggregation,
                        top,
                        orderBy,
                        filter,
                        resultType,
                        metricnamespace,
                        context)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricnames The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself
     *     has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve. Valid only if $filter is specified. Defaults to 10.
     * @param orderBy The aggregation to use for sorting results and the direction of the sort. Only one order can be
     *     specified. Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data returned. Example: Metric contains
     *     metadata A, B and C. - Return all time series of C where A = a1 and B = b1 or b2 **$filter=A eq 'a1' and B eq
     *     'b1' or B eq 'b2' and C eq '*'** - Invalid variant: **$filter=A eq 'a1' and B eq 'b1' and C eq '*' or B =
     *     'b2'** This is invalid because the logical or operator cannot separate two different metadata names. - Return
     *     all time series where A = a1, B = b1 and C = c1: **$filter=A eq 'a1' and B eq 'b1' and C eq 'c1'** - Return
     *     all time series where A = a1 **$filter=A eq 'a1' and B eq '*' and C eq '*'**. Special case: When dimension
     *     name or dimension value uses round brackets. Eg: When dimension name is **dim (test) 1** Instead of using
     *     $filter= "dim (test) 1 eq '*' " use **$filter= "dim %2528test%2529 1 eq '*' "** When dimension name is **dim
     *     (test) 3** and dimension value is **dim3 (test) val** Instead of using $filter= "dim (test) 3 eq 'dim3 (test)
     *     val' " use **$filter= "dim %2528test%2529 3 eq 'dim3 %2528test%2529 val' "**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the
     *     operation's description for details.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MetricsResponse> listWithResponse(
            String resourceUri,
            String timespan,
            Duration interval,
            String metricnames,
            String aggregation,
            Integer top,
            String orderBy,
            String filter,
            ResultType resultType,
            String metricnamespace,
            Context context) {
        if (this.client.getHost() == null) {
            throw new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null.");
        }
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        final String accept = "application/json";
        return service.listSync(
                this.client.getHost(),
                resourceUri,
                timespan,
                interval,
                metricnames,
                aggregation,
                top,
                orderBy,
                filter,
                resultType,
                this.client.getApiVersion(),
                metricnamespace,
                accept,
                context);
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricnames The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself
     *     has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve. Valid only if $filter is specified. Defaults to 10.
     * @param orderBy The aggregation to use for sorting results and the direction of the sort. Only one order can be
     *     specified. Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data returned. Example: Metric contains
     *     metadata A, B and C. - Return all time series of C where A = a1 and B = b1 or b2 **$filter=A eq 'a1' and B eq
     *     'b1' or B eq 'b2' and C eq '*'** - Invalid variant: **$filter=A eq 'a1' and B eq 'b1' and C eq '*' or B =
     *     'b2'** This is invalid because the logical or operator cannot separate two different metadata names. - Return
     *     all time series where A = a1, B = b1 and C = c1: **$filter=A eq 'a1' and B eq 'b1' and C eq 'c1'** - Return
     *     all time series where A = a1 **$filter=A eq 'a1' and B eq '*' and C eq '*'**. Special case: When dimension
     *     name or dimension value uses round brackets. Eg: When dimension name is **dim (test) 1** Instead of using
     *     $filter= "dim (test) 1 eq '*' " use **$filter= "dim %2528test%2529 1 eq '*' "** When dimension name is **dim
     *     (test) 3** and dimension value is **dim3 (test) val** Instead of using $filter= "dim (test) 3 eq 'dim3 (test)
     *     val' " use **$filter= "dim %2528test%2529 3 eq 'dim3 %2528test%2529 val' "**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the
     *     operation's description for details.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MetricsResponse list(
            String resourceUri,
            String timespan,
            Duration interval,
            String metricnames,
            String aggregation,
            Integer top,
            String orderBy,
            String filter,
            ResultType resultType,
            String metricnamespace) {
        return listWithResponse(
                        resourceUri,
                        timespan,
                        interval,
                        metricnames,
                        aggregation,
                        top,
                        orderBy,
                        filter,
                        resultType,
                        metricnamespace,
                        Context.NONE)
                .getValue();
    }
}
