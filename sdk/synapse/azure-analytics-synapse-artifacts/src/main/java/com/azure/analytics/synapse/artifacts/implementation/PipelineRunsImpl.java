// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.implementation;

import com.azure.analytics.synapse.artifacts.models.ActivityRunsQueryResponse;
import com.azure.analytics.synapse.artifacts.models.CloudErrorAutoGeneratedException;
import com.azure.analytics.synapse.artifacts.models.PipelineRun;
import com.azure.analytics.synapse.artifacts.models.PipelineRunsQueryResponse;
import com.azure.analytics.synapse.artifacts.models.RunFilterParameters;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PipelineRuns. */
public final class PipelineRunsImpl {
    /** The proxy service used to perform REST calls. */
    private final PipelineRunsService service;

    /** The service client containing this operation class. */
    private final ArtifactsClientImpl client;

    /**
     * Initializes an instance of PipelineRunsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PipelineRunsImpl(ArtifactsClientImpl client) {
        this.service =
                RestProxy.create(PipelineRunsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ArtifactsClientPipelineRuns to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ArtifactsClientPipel")
    private interface PipelineRunsService {
        @Post("/queryPipelineRuns")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorAutoGeneratedException.class)
        Mono<Response<PipelineRunsQueryResponse>> queryPipelineRunsByWorkspace(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") RunFilterParameters filterParameters,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/pipelineruns/{runId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorAutoGeneratedException.class)
        Mono<Response<PipelineRun>> getPipelineRun(
                @HostParam("endpoint") String endpoint,
                @PathParam("runId") String runId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/pipelines/{pipelineName}/pipelineruns/{runId}/queryActivityruns")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorAutoGeneratedException.class)
        Mono<Response<ActivityRunsQueryResponse>> queryActivityRuns(
                @HostParam("endpoint") String endpoint,
                @PathParam("pipelineName") String pipelineName,
                @PathParam("runId") String runId,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") RunFilterParameters filterParameters,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/pipelineruns/{runId}/cancel")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorAutoGeneratedException.class)
        Mono<Response<Void>> cancelPipelineRun(
                @HostParam("endpoint") String endpoint,
                @PathParam("runId") String runId,
                @QueryParam("isRecursive") Boolean isRecursive,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Query pipeline runs in the workspace based on input filter conditions.
     *
     * @param filterParameters Parameters to filter the pipeline run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list pipeline runs along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PipelineRunsQueryResponse>> queryPipelineRunsByWorkspaceWithResponseAsync(
            RunFilterParameters filterParameters) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.queryPipelineRunsByWorkspace(
                                this.client.getEndpoint(), apiVersion, filterParameters, accept, context));
    }

    /**
     * Query pipeline runs in the workspace based on input filter conditions.
     *
     * @param filterParameters Parameters to filter the pipeline run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list pipeline runs along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PipelineRunsQueryResponse>> queryPipelineRunsByWorkspaceWithResponseAsync(
            RunFilterParameters filterParameters, Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.queryPipelineRunsByWorkspace(
                this.client.getEndpoint(), apiVersion, filterParameters, accept, context);
    }

    /**
     * Query pipeline runs in the workspace based on input filter conditions.
     *
     * @param filterParameters Parameters to filter the pipeline run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list pipeline runs on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PipelineRunsQueryResponse> queryPipelineRunsByWorkspaceAsync(RunFilterParameters filterParameters) {
        return queryPipelineRunsByWorkspaceWithResponseAsync(filterParameters)
                .flatMap(
                        (Response<PipelineRunsQueryResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Query pipeline runs in the workspace based on input filter conditions.
     *
     * @param filterParameters Parameters to filter the pipeline run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list pipeline runs on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PipelineRunsQueryResponse> queryPipelineRunsByWorkspaceAsync(
            RunFilterParameters filterParameters, Context context) {
        return queryPipelineRunsByWorkspaceWithResponseAsync(filterParameters, context)
                .flatMap(
                        (Response<PipelineRunsQueryResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Query pipeline runs in the workspace based on input filter conditions.
     *
     * @param filterParameters Parameters to filter the pipeline run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list pipeline runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PipelineRunsQueryResponse queryPipelineRunsByWorkspace(RunFilterParameters filterParameters) {
        return queryPipelineRunsByWorkspaceAsync(filterParameters).block();
    }

    /**
     * Query pipeline runs in the workspace based on input filter conditions.
     *
     * @param filterParameters Parameters to filter the pipeline run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list pipeline runs along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PipelineRunsQueryResponse> queryPipelineRunsByWorkspaceWithResponse(
            RunFilterParameters filterParameters, Context context) {
        return queryPipelineRunsByWorkspaceWithResponseAsync(filterParameters, context).block();
    }

    /**
     * Get a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline run by its run ID along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PipelineRun>> getPipelineRunWithResponseAsync(String runId) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.getPipelineRun(this.client.getEndpoint(), runId, apiVersion, accept, context));
    }

    /**
     * Get a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline run by its run ID along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PipelineRun>> getPipelineRunWithResponseAsync(String runId, Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.getPipelineRun(this.client.getEndpoint(), runId, apiVersion, accept, context);
    }

    /**
     * Get a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline run by its run ID on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PipelineRun> getPipelineRunAsync(String runId) {
        return getPipelineRunWithResponseAsync(runId)
                .flatMap(
                        (Response<PipelineRun> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline run by its run ID on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PipelineRun> getPipelineRunAsync(String runId, Context context) {
        return getPipelineRunWithResponseAsync(runId, context)
                .flatMap(
                        (Response<PipelineRun> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline run by its run ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PipelineRun getPipelineRun(String runId) {
        return getPipelineRunAsync(runId).block();
    }

    /**
     * Get a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline run by its run ID along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PipelineRun> getPipelineRunWithResponse(String runId, Context context) {
        return getPipelineRunWithResponseAsync(runId, context).block();
    }

    /**
     * Query activity runs based on input filter conditions.
     *
     * @param pipelineName The pipeline name.
     * @param runId The pipeline run identifier.
     * @param filterParameters Parameters to filter the activity runs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list activity runs along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ActivityRunsQueryResponse>> queryActivityRunsWithResponseAsync(
            String pipelineName, String runId, RunFilterParameters filterParameters) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.queryActivityRuns(
                                this.client.getEndpoint(),
                                pipelineName,
                                runId,
                                apiVersion,
                                filterParameters,
                                accept,
                                context));
    }

    /**
     * Query activity runs based on input filter conditions.
     *
     * @param pipelineName The pipeline name.
     * @param runId The pipeline run identifier.
     * @param filterParameters Parameters to filter the activity runs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list activity runs along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ActivityRunsQueryResponse>> queryActivityRunsWithResponseAsync(
            String pipelineName, String runId, RunFilterParameters filterParameters, Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.queryActivityRuns(
                this.client.getEndpoint(), pipelineName, runId, apiVersion, filterParameters, accept, context);
    }

    /**
     * Query activity runs based on input filter conditions.
     *
     * @param pipelineName The pipeline name.
     * @param runId The pipeline run identifier.
     * @param filterParameters Parameters to filter the activity runs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list activity runs on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ActivityRunsQueryResponse> queryActivityRunsAsync(
            String pipelineName, String runId, RunFilterParameters filterParameters) {
        return queryActivityRunsWithResponseAsync(pipelineName, runId, filterParameters)
                .flatMap(
                        (Response<ActivityRunsQueryResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Query activity runs based on input filter conditions.
     *
     * @param pipelineName The pipeline name.
     * @param runId The pipeline run identifier.
     * @param filterParameters Parameters to filter the activity runs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list activity runs on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ActivityRunsQueryResponse> queryActivityRunsAsync(
            String pipelineName, String runId, RunFilterParameters filterParameters, Context context) {
        return queryActivityRunsWithResponseAsync(pipelineName, runId, filterParameters, context)
                .flatMap(
                        (Response<ActivityRunsQueryResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Query activity runs based on input filter conditions.
     *
     * @param pipelineName The pipeline name.
     * @param runId The pipeline run identifier.
     * @param filterParameters Parameters to filter the activity runs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list activity runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ActivityRunsQueryResponse queryActivityRuns(
            String pipelineName, String runId, RunFilterParameters filterParameters) {
        return queryActivityRunsAsync(pipelineName, runId, filterParameters).block();
    }

    /**
     * Query activity runs based on input filter conditions.
     *
     * @param pipelineName The pipeline name.
     * @param runId The pipeline run identifier.
     * @param filterParameters Parameters to filter the activity runs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list activity runs along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ActivityRunsQueryResponse> queryActivityRunsWithResponse(
            String pipelineName, String runId, RunFilterParameters filterParameters, Context context) {
        return queryActivityRunsWithResponseAsync(pipelineName, runId, filterParameters, context).block();
    }

    /**
     * Cancel a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @param isRecursive If true, cancel all the Child pipelines that are triggered by the current pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelPipelineRunWithResponseAsync(String runId, Boolean isRecursive) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.cancelPipelineRun(
                                this.client.getEndpoint(), runId, isRecursive, apiVersion, accept, context));
    }

    /**
     * Cancel a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @param isRecursive If true, cancel all the Child pipelines that are triggered by the current pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelPipelineRunWithResponseAsync(String runId, Boolean isRecursive, Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.cancelPipelineRun(this.client.getEndpoint(), runId, isRecursive, apiVersion, accept, context);
    }

    /**
     * Cancel a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @param isRecursive If true, cancel all the Child pipelines that are triggered by the current pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelPipelineRunAsync(String runId, Boolean isRecursive) {
        return cancelPipelineRunWithResponseAsync(runId, isRecursive).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Cancel a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelPipelineRunAsync(String runId) {
        final Boolean isRecursive = null;
        return cancelPipelineRunWithResponseAsync(runId, isRecursive).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Cancel a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @param isRecursive If true, cancel all the Child pipelines that are triggered by the current pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelPipelineRunAsync(String runId, Boolean isRecursive, Context context) {
        return cancelPipelineRunWithResponseAsync(runId, isRecursive, context)
                .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Cancel a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @param isRecursive If true, cancel all the Child pipelines that are triggered by the current pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void cancelPipelineRun(String runId, Boolean isRecursive) {
        cancelPipelineRunAsync(runId, isRecursive).block();
    }

    /**
     * Cancel a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void cancelPipelineRun(String runId) {
        final Boolean isRecursive = null;
        cancelPipelineRunAsync(runId, isRecursive).block();
    }

    /**
     * Cancel a pipeline run by its run ID.
     *
     * @param runId The pipeline run identifier.
     * @param isRecursive If true, cancel all the Child pipelines that are triggered by the current pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> cancelPipelineRunWithResponse(String runId, Boolean isRecursive, Context context) {
        return cancelPipelineRunWithResponseAsync(runId, isRecursive, context).block();
    }
}
