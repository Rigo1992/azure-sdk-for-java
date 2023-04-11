// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.implementation;

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
import com.azure.resourcemanager.storagemover.fluent.JobRunsClient;
import com.azure.resourcemanager.storagemover.fluent.models.JobRunInner;
import com.azure.resourcemanager.storagemover.models.JobRunList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in JobRunsClient. */
public final class JobRunsClientImpl implements JobRunsClient {
    /** The proxy service used to perform REST calls. */
    private final JobRunsService service;

    /** The service client containing this operation class. */
    private final StorageMoverClientImpl client;

    /**
     * Initializes an instance of JobRunsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    JobRunsClientImpl(StorageMoverClientImpl client) {
        this.service = RestProxy.create(JobRunsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageMoverClientJobRuns to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageMoverClientJo")
    public interface JobRunsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.StorageMover"
                + "/storageMovers/{storageMoverName}/projects/{projectName}/jobDefinitions/{jobDefinitionName}/jobRuns")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<JobRunList>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("storageMoverName") String storageMoverName,
            @PathParam("projectName") String projectName,
            @PathParam("jobDefinitionName") String jobDefinitionName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.StorageMover"
                + "/storageMovers/{storageMoverName}/projects/{projectName}/jobDefinitions/{jobDefinitionName}/jobRuns"
                + "/{jobRunName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<JobRunInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("storageMoverName") String storageMoverName,
            @PathParam("projectName") String projectName,
            @PathParam("jobDefinitionName") String jobDefinitionName,
            @PathParam("jobRunName") String jobRunName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<JobRunList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists all Job Runs in a Job Definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Job Runs along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<JobRunInner>> listSinglePageAsync(
        String resourceGroupName, String storageMoverName, String projectName, String jobDefinitionName) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (storageMoverName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter storageMoverName is required and cannot be null."));
        }
        if (projectName == null) {
            return Mono.error(new IllegalArgumentException("Parameter projectName is required and cannot be null."));
        }
        if (jobDefinitionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter jobDefinitionName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            storageMoverName,
                            projectName,
                            jobDefinitionName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<JobRunInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists all Job Runs in a Job Definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Job Runs along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<JobRunInner>> listSinglePageAsync(
        String resourceGroupName,
        String storageMoverName,
        String projectName,
        String jobDefinitionName,
        Context context) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (storageMoverName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter storageMoverName is required and cannot be null."));
        }
        if (projectName == null) {
            return Mono.error(new IllegalArgumentException("Parameter projectName is required and cannot be null."));
        }
        if (jobDefinitionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter jobDefinitionName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                storageMoverName,
                projectName,
                jobDefinitionName,
                this.client.getApiVersion(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Lists all Job Runs in a Job Definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Job Runs as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<JobRunInner> listAsync(
        String resourceGroupName, String storageMoverName, String projectName, String jobDefinitionName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, storageMoverName, projectName, jobDefinitionName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all Job Runs in a Job Definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Job Runs as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<JobRunInner> listAsync(
        String resourceGroupName,
        String storageMoverName,
        String projectName,
        String jobDefinitionName,
        Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, storageMoverName, projectName, jobDefinitionName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists all Job Runs in a Job Definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Job Runs as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<JobRunInner> list(
        String resourceGroupName, String storageMoverName, String projectName, String jobDefinitionName) {
        return new PagedIterable<>(listAsync(resourceGroupName, storageMoverName, projectName, jobDefinitionName));
    }

    /**
     * Lists all Job Runs in a Job Definition.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Job Runs as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<JobRunInner> list(
        String resourceGroupName,
        String storageMoverName,
        String projectName,
        String jobDefinitionName,
        Context context) {
        return new PagedIterable<>(
            listAsync(resourceGroupName, storageMoverName, projectName, jobDefinitionName, context));
    }

    /**
     * Gets a Job Run resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param jobRunName The name of the Job Run resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Job Run resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<JobRunInner>> getWithResponseAsync(
        String resourceGroupName,
        String storageMoverName,
        String projectName,
        String jobDefinitionName,
        String jobRunName) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (storageMoverName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter storageMoverName is required and cannot be null."));
        }
        if (projectName == null) {
            return Mono.error(new IllegalArgumentException("Parameter projectName is required and cannot be null."));
        }
        if (jobDefinitionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter jobDefinitionName is required and cannot be null."));
        }
        if (jobRunName == null) {
            return Mono.error(new IllegalArgumentException("Parameter jobRunName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            storageMoverName,
                            projectName,
                            jobDefinitionName,
                            jobRunName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a Job Run resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param jobRunName The name of the Job Run resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Job Run resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<JobRunInner>> getWithResponseAsync(
        String resourceGroupName,
        String storageMoverName,
        String projectName,
        String jobDefinitionName,
        String jobRunName,
        Context context) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (storageMoverName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter storageMoverName is required and cannot be null."));
        }
        if (projectName == null) {
            return Mono.error(new IllegalArgumentException("Parameter projectName is required and cannot be null."));
        }
        if (jobDefinitionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter jobDefinitionName is required and cannot be null."));
        }
        if (jobRunName == null) {
            return Mono.error(new IllegalArgumentException("Parameter jobRunName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                storageMoverName,
                projectName,
                jobDefinitionName,
                jobRunName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets a Job Run resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param jobRunName The name of the Job Run resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Job Run resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<JobRunInner> getAsync(
        String resourceGroupName,
        String storageMoverName,
        String projectName,
        String jobDefinitionName,
        String jobRunName) {
        return getWithResponseAsync(resourceGroupName, storageMoverName, projectName, jobDefinitionName, jobRunName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a Job Run resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param jobRunName The name of the Job Run resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Job Run resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<JobRunInner> getWithResponse(
        String resourceGroupName,
        String storageMoverName,
        String projectName,
        String jobDefinitionName,
        String jobRunName,
        Context context) {
        return getWithResponseAsync(
                resourceGroupName, storageMoverName, projectName, jobDefinitionName, jobRunName, context)
            .block();
    }

    /**
     * Gets a Job Run resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageMoverName The name of the Storage Mover resource.
     * @param projectName The name of the Project resource.
     * @param jobDefinitionName The name of the Job Definition resource.
     * @param jobRunName The name of the Job Run resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Job Run resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobRunInner get(
        String resourceGroupName,
        String storageMoverName,
        String projectName,
        String jobDefinitionName,
        String jobRunName) {
        return getWithResponse(
                resourceGroupName, storageMoverName, projectName, jobDefinitionName, jobRunName, Context.NONE)
            .getValue();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Job Runs along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<JobRunInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<JobRunInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Job Runs along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<JobRunInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
