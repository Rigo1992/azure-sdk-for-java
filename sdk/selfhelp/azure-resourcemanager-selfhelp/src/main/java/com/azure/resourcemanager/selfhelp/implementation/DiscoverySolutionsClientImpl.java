// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.implementation;

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
import com.azure.resourcemanager.selfhelp.fluent.DiscoverySolutionsClient;
import com.azure.resourcemanager.selfhelp.fluent.models.SolutionMetadataResourceInner;
import com.azure.resourcemanager.selfhelp.models.DiscoveryResponse;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in DiscoverySolutionsClient.
 */
public final class DiscoverySolutionsClientImpl implements DiscoverySolutionsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final DiscoverySolutionsService service;

    /**
     * The service client containing this operation class.
     */
    private final HelpRPImpl client;

    /**
     * Initializes an instance of DiscoverySolutionsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    DiscoverySolutionsClientImpl(HelpRPImpl client) {
        this.service = RestProxy.create(DiscoverySolutionsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for HelpRPDiscoverySolutions to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "HelpRPDiscoverySolut")
    public interface DiscoverySolutionsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/{scope}/providers/Microsoft.Help/discoverySolutions")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DiscoveryResponse>> list(@HostParam("$host") String endpoint,
            @PathParam(value = "scope", encoded = true) String scope, @QueryParam("api-version") String apiVersion,
            @QueryParam(value = "$filter", encoded = true) String filter, @QueryParam("$skiptoken") String skiptoken,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DiscoveryResponse>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Lists the relevant Azure diagnostics and solutions using [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) AND resourceUri or
     * resourceType.&lt;br/&gt; Discovery Solutions is the initial entry point within Help API, which identifies
     * relevant Azure diagnostics and solutions. &lt;br/&gt;&lt;br/&gt; Required Input : problemClassificationId (Use
     * the [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) &lt;br/&gt;Optional
     * input: resourceUri OR resource Type &lt;br/&gt;&lt;br/&gt; &lt;b&gt;Note: &lt;/b&gt; ‘requiredInputs’ from
     * Discovery solutions response must be passed via ‘additionalParameters’ as an input to Diagnostics and Solutions
     * API.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param filter 'ProblemClassificationId' is a mandatory filter to get solutions ids. It also supports optional
     * 'ResourceType' and 'SolutionType' filters. The
     * [$filter](https://learn.microsoft.com/en-us/odata/webapi/first-odata-api#filter) supports only 'and', 'or' and
     * 'eq' operators. Example: $filter=ProblemClassificationId eq '1ddda5b4-cf6c-4d4f-91ad-bc38ab0e811e'.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return discovery response along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SolutionMetadataResourceInner>> listSinglePageAsync(String scope, String filter,
        String skiptoken) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), scope, this.client.getApiVersion(), filter,
                skiptoken, accept, context))
            .<PagedResponse<SolutionMetadataResourceInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists the relevant Azure diagnostics and solutions using [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) AND resourceUri or
     * resourceType.&lt;br/&gt; Discovery Solutions is the initial entry point within Help API, which identifies
     * relevant Azure diagnostics and solutions. &lt;br/&gt;&lt;br/&gt; Required Input : problemClassificationId (Use
     * the [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) &lt;br/&gt;Optional
     * input: resourceUri OR resource Type &lt;br/&gt;&lt;br/&gt; &lt;b&gt;Note: &lt;/b&gt; ‘requiredInputs’ from
     * Discovery solutions response must be passed via ‘additionalParameters’ as an input to Diagnostics and Solutions
     * API.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param filter 'ProblemClassificationId' is a mandatory filter to get solutions ids. It also supports optional
     * 'ResourceType' and 'SolutionType' filters. The
     * [$filter](https://learn.microsoft.com/en-us/odata/webapi/first-odata-api#filter) supports only 'and', 'or' and
     * 'eq' operators. Example: $filter=ProblemClassificationId eq '1ddda5b4-cf6c-4d4f-91ad-bc38ab0e811e'.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return discovery response along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SolutionMetadataResourceInner>> listSinglePageAsync(String scope, String filter,
        String skiptoken, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), scope, this.client.getApiVersion(), filter, skiptoken, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Lists the relevant Azure diagnostics and solutions using [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) AND resourceUri or
     * resourceType.&lt;br/&gt; Discovery Solutions is the initial entry point within Help API, which identifies
     * relevant Azure diagnostics and solutions. &lt;br/&gt;&lt;br/&gt; Required Input : problemClassificationId (Use
     * the [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) &lt;br/&gt;Optional
     * input: resourceUri OR resource Type &lt;br/&gt;&lt;br/&gt; &lt;b&gt;Note: &lt;/b&gt; ‘requiredInputs’ from
     * Discovery solutions response must be passed via ‘additionalParameters’ as an input to Diagnostics and Solutions
     * API.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param filter 'ProblemClassificationId' is a mandatory filter to get solutions ids. It also supports optional
     * 'ResourceType' and 'SolutionType' filters. The
     * [$filter](https://learn.microsoft.com/en-us/odata/webapi/first-odata-api#filter) supports only 'and', 'or' and
     * 'eq' operators. Example: $filter=ProblemClassificationId eq '1ddda5b4-cf6c-4d4f-91ad-bc38ab0e811e'.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return discovery response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SolutionMetadataResourceInner> listAsync(String scope, String filter, String skiptoken) {
        return new PagedFlux<>(() -> listSinglePageAsync(scope, filter, skiptoken),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the relevant Azure diagnostics and solutions using [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) AND resourceUri or
     * resourceType.&lt;br/&gt; Discovery Solutions is the initial entry point within Help API, which identifies
     * relevant Azure diagnostics and solutions. &lt;br/&gt;&lt;br/&gt; Required Input : problemClassificationId (Use
     * the [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) &lt;br/&gt;Optional
     * input: resourceUri OR resource Type &lt;br/&gt;&lt;br/&gt; &lt;b&gt;Note: &lt;/b&gt; ‘requiredInputs’ from
     * Discovery solutions response must be passed via ‘additionalParameters’ as an input to Diagnostics and Solutions
     * API.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return discovery response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SolutionMetadataResourceInner> listAsync(String scope) {
        final String filter = null;
        final String skiptoken = null;
        return new PagedFlux<>(() -> listSinglePageAsync(scope, filter, skiptoken),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the relevant Azure diagnostics and solutions using [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) AND resourceUri or
     * resourceType.&lt;br/&gt; Discovery Solutions is the initial entry point within Help API, which identifies
     * relevant Azure diagnostics and solutions. &lt;br/&gt;&lt;br/&gt; Required Input : problemClassificationId (Use
     * the [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) &lt;br/&gt;Optional
     * input: resourceUri OR resource Type &lt;br/&gt;&lt;br/&gt; &lt;b&gt;Note: &lt;/b&gt; ‘requiredInputs’ from
     * Discovery solutions response must be passed via ‘additionalParameters’ as an input to Diagnostics and Solutions
     * API.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param filter 'ProblemClassificationId' is a mandatory filter to get solutions ids. It also supports optional
     * 'ResourceType' and 'SolutionType' filters. The
     * [$filter](https://learn.microsoft.com/en-us/odata/webapi/first-odata-api#filter) supports only 'and', 'or' and
     * 'eq' operators. Example: $filter=ProblemClassificationId eq '1ddda5b4-cf6c-4d4f-91ad-bc38ab0e811e'.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return discovery response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SolutionMetadataResourceInner> listAsync(String scope, String filter, String skiptoken,
        Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(scope, filter, skiptoken, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists the relevant Azure diagnostics and solutions using [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) AND resourceUri or
     * resourceType.&lt;br/&gt; Discovery Solutions is the initial entry point within Help API, which identifies
     * relevant Azure diagnostics and solutions. &lt;br/&gt;&lt;br/&gt; Required Input : problemClassificationId (Use
     * the [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) &lt;br/&gt;Optional
     * input: resourceUri OR resource Type &lt;br/&gt;&lt;br/&gt; &lt;b&gt;Note: &lt;/b&gt; ‘requiredInputs’ from
     * Discovery solutions response must be passed via ‘additionalParameters’ as an input to Diagnostics and Solutions
     * API.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return discovery response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SolutionMetadataResourceInner> list(String scope) {
        final String filter = null;
        final String skiptoken = null;
        return new PagedIterable<>(listAsync(scope, filter, skiptoken));
    }

    /**
     * Lists the relevant Azure diagnostics and solutions using [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) AND resourceUri or
     * resourceType.&lt;br/&gt; Discovery Solutions is the initial entry point within Help API, which identifies
     * relevant Azure diagnostics and solutions. &lt;br/&gt;&lt;br/&gt; Required Input : problemClassificationId (Use
     * the [problemClassification
     * API](https://learn.microsoft.com/rest/api/support/problem-classifications/list?tabs=HTTP)) &lt;br/&gt;Optional
     * input: resourceUri OR resource Type &lt;br/&gt;&lt;br/&gt; &lt;b&gt;Note: &lt;/b&gt; ‘requiredInputs’ from
     * Discovery solutions response must be passed via ‘additionalParameters’ as an input to Diagnostics and Solutions
     * API.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param filter 'ProblemClassificationId' is a mandatory filter to get solutions ids. It also supports optional
     * 'ResourceType' and 'SolutionType' filters. The
     * [$filter](https://learn.microsoft.com/en-us/odata/webapi/first-odata-api#filter) supports only 'and', 'or' and
     * 'eq' operators. Example: $filter=ProblemClassificationId eq '1ddda5b4-cf6c-4d4f-91ad-bc38ab0e811e'.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return discovery response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SolutionMetadataResourceInner> list(String scope, String filter, String skiptoken,
        Context context) {
        return new PagedIterable<>(listAsync(scope, filter, skiptoken, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return discovery response along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SolutionMetadataResourceInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<SolutionMetadataResourceInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
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
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return discovery response along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SolutionMetadataResourceInner>> listNextSinglePageAsync(String nextLink,
        Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
