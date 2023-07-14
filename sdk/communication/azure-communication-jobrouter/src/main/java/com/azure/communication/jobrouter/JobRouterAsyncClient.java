// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.jobrouter;

import com.azure.communication.jobrouter.implementation.AzureCommunicationServicesImpl;
import com.azure.communication.jobrouter.implementation.JobRoutersImpl;
import com.azure.communication.jobrouter.implementation.convertors.JobAdapter;
import com.azure.communication.jobrouter.implementation.convertors.WorkerAdapter;
import com.azure.communication.jobrouter.implementation.models.CommunicationErrorResponseException;
import com.azure.communication.jobrouter.implementation.models.DeclineJobOfferRequest;
import com.azure.communication.jobrouter.implementation.models.UnassignJobRequest;
import com.azure.communication.jobrouter.models.AcceptJobOfferResult;
import com.azure.communication.jobrouter.models.RouterJob;
import com.azure.communication.jobrouter.models.RouterJobItem;
import com.azure.communication.jobrouter.models.RouterJobPositionDetails;
import com.azure.communication.jobrouter.models.RouterQueueStatistics;
import com.azure.communication.jobrouter.models.RouterWorker;
import com.azure.communication.jobrouter.models.RouterWorkerItem;
import com.azure.communication.jobrouter.models.UnassignJobResult;
import com.azure.communication.jobrouter.models.CloseJobOptions;
import com.azure.communication.jobrouter.models.CreateJobOptions;
import com.azure.communication.jobrouter.models.CreateWorkerOptions;
import com.azure.communication.jobrouter.models.ListJobsOptions;
import com.azure.communication.jobrouter.models.ListWorkersOptions;
import com.azure.communication.jobrouter.models.UnassignJobOptions;
import com.azure.communication.jobrouter.models.UpdateJobOptions;
import com.azure.communication.jobrouter.models.UpdateWorkerOptions;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Mono;

import static com.azure.core.util.FluxUtil.monoError;
import static com.azure.core.util.FluxUtil.pagedFluxError;
import static com.azure.core.util.FluxUtil.withContext;

/**
 * Async Client that supports job router operations.
 *
 * <p><strong>Instantiating an asynchronous job router Client</strong></p>
 * <!-- src_embed com.azure.communication.jobrouter.routerasyncclient.instantiation -->
 * <pre>
 * &#47;&#47; Initialize the router client builder
 * final JobRouterClientBuilder builder = new JobRouterClientBuilder&#40;&#41;
 *     .connectionString&#40;connectionString&#41;;
 * &#47;&#47; Build the router client
 * JobRouterAsyncClient jobRouterAsyncClient = builder.buildAsyncClient&#40;&#41;;
 *
 * </pre>
 * <!-- end com.azure.communication.jobrouter.routerasyncclient.instantiation -->
 *
 * <p>View {@link JobRouterClientBuilder this} for additional ways to construct the client.</p>
 *
 * @see JobRouterClientBuilder
 */
@ServiceClient(builder = JobRouterClientBuilder.class, isAsync = true)
public final class JobRouterAsyncClient {
    private static final ClientLogger LOGGER = new ClientLogger(JobRouterAsyncClient.class);

    private final JobRoutersImpl jobRouter;

    JobRouterAsyncClient(AzureCommunicationServicesImpl jobRouterService) {
        this.jobRouter = jobRouterService.getJobRouters();
    }

    /**
     * Create a job.
     *
     * @param createJobOptions Options to create RouterJob.
     * @return a unit of work to be routed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouterJob> createJob(CreateJobOptions createJobOptions) {
        try {
            RouterJob routerJob = JobAdapter.convertCreateJobOptionsToRouterJob(createJobOptions);
            return withContext(context -> upsertJobWithResponse(createJobOptions.getId(), routerJob, context)
                .flatMap(
                    (Response<RouterJob> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Create a job.
     *
     * @param createJobOptions Options to create RouterJob.
     * @return a unit of work to be routed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RouterJob>> createJobWithResponse(CreateJobOptions createJobOptions) {
        try {
            RouterJob routerJob = JobAdapter.convertCreateJobOptionsToRouterJob(createJobOptions);
            return withContext(context -> upsertJobWithResponse(createJobOptions.getId(), routerJob, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Updates a job.
     *
     * @param updateJobOptions Options to update RouterJob.
     * @return a unit of work to be routed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouterJob> updateJob(UpdateJobOptions updateJobOptions) {
        try {
            RouterJob routerJob = JobAdapter.convertUpdateJobOptionsToRouterJob(updateJobOptions);
            return withContext(context -> upsertJobWithResponse(updateJobOptions.getId(), routerJob, context)
                .flatMap(
                    (Response<RouterJob> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Updates a job.
     *
     * @param updateJobOptions Options to update RouterJob.
     * @return a unit of work to be routed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RouterJob>> updateJobWithResponse(UpdateJobOptions updateJobOptions) {
        try {
            RouterJob routerJob = JobAdapter.convertUpdateJobOptionsToRouterJob(updateJobOptions);
            return withContext(context -> upsertJobWithResponse(updateJobOptions.getId(), routerJob, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    Mono<Response<RouterJob>> upsertJobWithResponse(String id, RouterJob routerJob, Context context) {
        try {
            return jobRouter.upsertJobWithResponseAsync(id, routerJob, context);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Retrieves an existing job by Id.
     *
     * @param jobId Id of the job to retrieve.
     * @return a unit of work to be routed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouterJob> getJob(String jobId) {
        try {
            return withContext(context -> getJobWithResponse(jobId, context)
                .flatMap(
                    (Response<RouterJob> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Retrieves an existing job by Id.
     *
     * @param jobId Id of the job to retrieve.
     * @return a unit of work to be routed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RouterJob>> getJobWithResponse(String jobId) {
        try {
            return withContext(context -> getJobWithResponse(jobId, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    Mono<Response<RouterJob>> getJobWithResponse(String id, Context context) {
        try {
            return jobRouter.getJobWithResponseAsync(id, context);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Deletes a job and all of its traces.
     *
     * @param jobId Id of the job.
     * @return void.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteJob(String jobId) {
        try {
            return withContext(context -> deleteJobWithResponse(jobId, context)
                .flatMap(
                    (Response<Void> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Deletes a job and all of its traces.
     *
     * @param jobId Id of the job.
     * @return void.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteJobWithResponse(String jobId) {
        try {
            return withContext(context -> deleteJobWithResponse(jobId, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    Mono<Response<Void>> deleteJobWithResponse(String id, Context context) {
        try {
            return jobRouter.deleteJobWithResponseAsync(id, context);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Reclassify a job.
     *
     * @param jobId Id of the job.
     * @return void.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> reclassifyJob(String jobId) {
        try {
            return withContext(context -> reclassifyJobWithResponse(jobId, context)
                .flatMap(
                    (Response<Void> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Reclassify a job.
     *
     * @param jobId Id of the job.
     * @return void.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> reclassifyJobWithResponse(String jobId) {
        try {
            return withContext(context -> reclassifyJobWithResponse(jobId, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    Mono<Response<Void>> reclassifyJobWithResponse(String id, Context context) {
        try {
            return jobRouter.reclassifyJobActionWithResponseAsync(id, null, context)
                .map(result -> new SimpleResponse<Void>(
                    result.getRequest(), result.getStatusCode(), result.getHeaders(), null));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Submits request to cancel an existing job by Id while supplying free-form cancellation reason.
     *
     * @param jobId Id of the job.
     * @param note (Optional) A note that will be appended to the jobs' Notes collection with th current timestamp.
     * @param dispositionCode Indicates the outcome of the job, populate this field with your own custom values. If not
     * provided, default value of "Cancelled" is set.
     * @return void.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelJob(String jobId, String note, String dispositionCode) {
        try {
            return withContext(context -> cancelJobWithResponse(jobId, note, dispositionCode, context)
                .flatMap(
                    (Response<Void> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Submits request to cancel an existing job by Id while supplying free-form cancellation reason.
     *
     * @param jobId Id of the job.
     * @param note (Optional) A note that will be appended to the jobs' Notes collection with th current timestamp.
     * @param dispositionCode Indicates the outcome of the job, populate this field with your own custom values. If not
     * provided, default value of "Cancelled" is set.
     * @return void.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelJobWithResponse(String jobId, String note, String dispositionCode) {
        try {
            return withContext(context -> cancelJobWithResponse(jobId, note, dispositionCode, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    Mono<Response<Void>> cancelJobWithResponse(String id, String note, String dispositionCode, Context context) {
        try {
            return jobRouter.cancelJobActionWithResponseAsync(id, note, dispositionCode, context)
                .map(result -> new SimpleResponse<Void>(
                    result.getRequest(), result.getStatusCode(), result.getHeaders(), null));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Completes an assigned job.
     *
     * @param jobId Id of the job.
     * @param assignmentId The assignment within the job to complete.
     * @param note (Optional) A note that will be appended to the jobs' Notes collection with th current timestamp.
     * @return void.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> completeJob(String jobId, String assignmentId, String note) {
        try {
            return withContext(context -> completeJobWithResponse(jobId, assignmentId, note, context)
                .flatMap(
                    (Response<Void> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Completes an assigned job.
     *
     * @param jobId Id of the job.
     * @param assignmentId The assignment within the job to complete.
     * @param note (Optional) A note that will be appended to the jobs' Notes collection with th current timestamp.
     * @return void.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> completeJobWithResponse(String jobId, String assignmentId, String note) {
        try {
            return withContext(context -> completeJobWithResponse(jobId, assignmentId, note, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    Mono<Response<Void>> completeJobWithResponse(String jobId, String assignmentId, String note, Context context) {
        try {
            return jobRouter.completeJobActionWithResponseAsync(jobId, assignmentId, note, context)
                .map(result -> new SimpleResponse<Void>(
                    result.getRequest(), result.getStatusCode(), result.getHeaders(), null));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Closes a completed job.
     *
     * @param closeJobOptions Options object for close job operation.
     * @return void.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> closeJob(CloseJobOptions closeJobOptions) {
        try {
            return withContext(context -> closeJobWithResponse(closeJobOptions, context)
                .flatMap(
                    (Response<Void> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Closes a completed job.
     *
     * @param closeJobOptions Options object for close job operation.
     * @return void.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> closeJobWithResponse(CloseJobOptions closeJobOptions) {
        try {
            return withContext(context -> closeJobWithResponse(closeJobOptions, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    Mono<Response<Void>> closeJobWithResponse(CloseJobOptions closeJobOptions, Context context) {
        try {
            return jobRouter.closeJobActionWithResponseAsync(
                    closeJobOptions.getJobId(),
                    closeJobOptions.getAssignmentId(),
                    closeJobOptions.getDispositionCode(),
                    closeJobOptions.getCloseTime(),
                    closeJobOptions.getNote(),
                    context
                ).map(result -> new SimpleResponse<Void>(
                    result.getRequest(), result.getStatusCode(), result.getHeaders(), null
                ));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Unassigns a job from a worker.
     *
     * @param unassignJobOptions Options object for unassign job operation.
     * @return result as mentioned in {@link  com.azure.communication.jobrouter.models.UnassignJobResult}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<UnassignJobResult> unassignJob(UnassignJobOptions unassignJobOptions) {
        try {
            return withContext(context -> unassignJobWithResponse(unassignJobOptions, context)
                .flatMap(
                    (Response<UnassignJobResult> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Unassigns a job from the assigned worker.
     *
     * @param unassignJobOptions Options object for unassign job operation.
     * @return result as mentioned in {@link  com.azure.communication.jobrouter.models.UnassignJobResult}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<UnassignJobResult>> unassignJobWithResponse(UnassignJobOptions unassignJobOptions) {
        try {
            return withContext(context -> unassignJobWithResponse(unassignJobOptions, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    Mono<Response<UnassignJobResult>> unassignJobWithResponse(UnassignJobOptions unassignJobOptions, Context context) {
        try {
            return jobRouter.unassignJobActionWithResponseAsync(
                unassignJobOptions.getJobId(),
                unassignJobOptions.getAssignmentId(),
                new UnassignJobRequest(),
                context
            );
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Retrieves list of jobs based on filter parameters.
     *
     * @return a paged collection of jobs.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RouterJobItem> listJobs() {
        try {
            return jobRouter.listJobsAsync(null, null, null, null, null, null, null);
        } catch (RuntimeException ex) {
            return pagedFluxError(LOGGER, ex);
        }
    }

    /**
     * Retrieves list of jobs based on filter parameters.
     *
     * @param listJobsOptions options for listJobs.
     * @return a paged collection of jobs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RouterJobItem> listJobs(ListJobsOptions listJobsOptions) {
        try {
            return jobRouter.listJobsAsync(listJobsOptions.getJobStateSelector(),
                listJobsOptions.getQueueId(),
                listJobsOptions.getChannelId(),
                listJobsOptions.getClassificationPolicyId(),
                listJobsOptions.getScheduledBefore(),
                listJobsOptions.getScheduledAfter(),
                listJobsOptions.getMaxPageSize());
        } catch (RuntimeException ex) {
            return pagedFluxError(LOGGER, ex);
        }
    }

    /**
     * Retrieves list of jobs based on filter parameters.
     *
     * @param listJobsOptions options for listJobs.
     * @param context Context for listJobs.
     * @return a paged collection of jobs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    PagedFlux<RouterJobItem> listJobs(ListJobsOptions listJobsOptions, Context context) {
        try {
            return jobRouter.listJobsAsync(listJobsOptions.getJobStateSelector(),
                listJobsOptions.getQueueId(),
                listJobsOptions.getChannelId(),
                listJobsOptions.getClassificationPolicyId(),
                listJobsOptions.getScheduledBefore(),
                listJobsOptions.getScheduledAfter(),
                listJobsOptions.getMaxPageSize(),
                context);
        } catch (RuntimeException ex) {
            return pagedFluxError(LOGGER, ex);
        }
    }

    /**
     * Gets a job's position details.
     *
     * @param jobId Id of the job.
     * @return a job's position details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouterJobPositionDetails> getQueuePosition(String jobId) {
        try {
            return withContext(context -> getQueuePositionWithResponse(jobId, context)
                .flatMap(
                    (Response<RouterJobPositionDetails> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Gets a job's position details.
     *
     * @param jobId Id of the job.
     * @return a job's position details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RouterJobPositionDetails>> getQueuePositionWithResponse(String jobId) {
        try {
            return withContext(context -> getQueuePositionWithResponse(jobId, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    Mono<Response<RouterJobPositionDetails>> getQueuePositionWithResponse(String id, Context context) {
        try {
            return jobRouter.getInQueuePositionWithResponseAsync(id, context);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Accepts an offer to work on a job and returns a 409/Conflict if another agent accepted the job already.
     *
     * @param workerId Id of the worker.
     * @param offerId Id of the offer.
     * @return response containing Id's for the worker, job, and assignment from an accepted offer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AcceptJobOfferResult> acceptJobOffer(String workerId, String offerId) {
        try {
            return withContext(context -> acceptJobOfferWithResponse(workerId, offerId, context)
                .flatMap(
                    (Response<AcceptJobOfferResult> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Accepts an offer to work on a job and returns a 409/Conflict if another agent accepted the job already.
     *
     * @param workerId Id of the worker.
     * @param offerId Id of the offer.
     * @return response containing Id's for the worker, job, and assignment from an accepted offer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AcceptJobOfferResult>> acceptJobOfferWithResponse(String workerId, String offerId) {
        try {
            return withContext(context -> acceptJobOfferWithResponse(workerId, offerId, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    Mono<Response<AcceptJobOfferResult>> acceptJobOfferWithResponse(String workerId, String offerId, Context context) {
        try {
            return jobRouter.acceptJobActionWithResponseAsync(workerId, offerId, context);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Declines an offer to work on a job.
     *
     * @param workerId Id of the worker.
     * @param offerId Id of the offer.
     * @return void.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> declineJobOffer(String workerId, String offerId) {
        try {
            return withContext(context -> declineJobOfferWithResponse(workerId, offerId, context)
                .flatMap(
                    (Response<Void> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Declines an offer to work on a job.
     *
     * @param workerId Id of the worker.
     * @param offerId Id of the offer.
     * @return void.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> declineJobOfferWithResponse(String workerId, String offerId) {
        try {
            return withContext(context -> declineJobOfferWithResponse(workerId, offerId, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    Mono<Response<Void>> declineJobOfferWithResponse(String workerId, String offerId, Context context) {
        try {
            return jobRouter.declineJobActionWithResponseAsync(workerId, offerId, new DeclineJobOfferRequest(), context)
                .map(result -> new SimpleResponse<Void>(
                    result.getRequest(), result.getStatusCode(), result.getHeaders(), null));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Retrieves a queue's statistics.
     *
     * @param queueId Id of the queue to retrieve statistics.
     * @return statistics for the queue.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouterQueueStatistics> getQueueStatistics(String queueId) {
        try {
            return withContext(context -> getQueueStatisticsWithResponse(queueId, context)
                .flatMap(
                    (Response<RouterQueueStatistics> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Retrieves a queue's statistics.
     *
     * @param queueId Id of the queue to retrieve statistics.
     * @return statistics for the queue.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RouterQueueStatistics>> getQueueStatisticsWithResponse(String queueId) {
        try {
            return withContext(context -> getQueueStatisticsWithResponse(queueId, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    Mono<Response<RouterQueueStatistics>> getQueueStatisticsWithResponse(String id, Context context) {
        try {
            return jobRouter.getQueueStatisticsWithResponseAsync(id, context);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Create a worker.
     *
     * @param createWorkerOptions Container for inputs to create a worker.
     * @return an entity for jobs to be routed to.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouterWorker> createWorker(CreateWorkerOptions createWorkerOptions) {
        try {
            RouterWorker routerWorker = WorkerAdapter.convertCreateWorkerOptionsToRouterWorker(createWorkerOptions);
            return withContext(context -> upsertWorkerWithResponse(createWorkerOptions.getWorkerId(), routerWorker, context)
                .flatMap(
                    (Response<RouterWorker> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Create a worker.
     *
     * @param createWorkerOptions Container for inputs to create a worker.
     * @return an entity for jobs to be routed to.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RouterWorker>> createWorkerWithResponse(CreateWorkerOptions createWorkerOptions) {
        try {
            RouterWorker routerWorker = WorkerAdapter.convertCreateWorkerOptionsToRouterWorker(createWorkerOptions);
            return withContext(context -> upsertWorkerWithResponse(createWorkerOptions.getWorkerId(), routerWorker, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Update a worker.
     *
     * @param updateWorkerOptions Container for inputs to update a worker.
     * @return an entity for jobs to be routed to.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouterWorker> updateWorker(UpdateWorkerOptions updateWorkerOptions) {
        try {
            RouterWorker routerWorker = WorkerAdapter.convertUpdateWorkerOptionsToRouterWorker(updateWorkerOptions);
            return withContext(context -> upsertWorkerWithResponse(updateWorkerOptions.getWorkerId(), routerWorker, context)
                .flatMap(
                    (Response<RouterWorker> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Update a worker.
     *
     * @param updateWorkerOptions Container for inputs to update a worker.
     * @return an entity for jobs to be routed to.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RouterWorker>> updateWorkerWithResponse(UpdateWorkerOptions updateWorkerOptions) {
        try {
            RouterWorker routerWorker = WorkerAdapter.convertUpdateWorkerOptionsToRouterWorker(updateWorkerOptions);
            return withContext(context -> upsertWorkerWithResponse(updateWorkerOptions.getWorkerId(), routerWorker, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    Mono<Response<RouterWorker>> upsertWorkerWithResponse(String id, RouterWorker routerWorker, Context context) {
        try {
            return jobRouter.upsertWorkerWithResponseAsync(id, routerWorker, context);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Retrieves an existing worker by Id.
     *
     * @param workerId Id of the worker to retrieve.
     * @return an entity for jobs to be routed to.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouterWorker> getWorker(String workerId) {
        try {
            return withContext(context -> getWorkerWithResponse(workerId, context)
                .flatMap(
                    (Response<RouterWorker> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Retrieves an existing worker by Id.
     *
     * @param workerId Id of the worker to retrieve.
     * @return an entity for jobs to be routed to.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RouterWorker>> getWorkerWithResponse(String workerId) {
        try {
            return withContext(context -> getWorkerWithResponse(workerId, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    Mono<Response<RouterWorker>> getWorkerWithResponse(String id, Context context) {
        try {
            return jobRouter.getWorkerWithResponseAsync(id, context);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Deletes a worker and all of its traces.
     *
     * @param workerId Id of the worker to delete.
     * @return void.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteWorker(String workerId) {
        try {
            return withContext(context -> deleteWorkerWithResponse(workerId, context)
                .flatMap(
                    (Response<Void> res) -> {
                        if (res.getValue() != null) {
                            return Mono.just(res.getValue());
                        } else {
                            return Mono.empty();
                        }
                    }));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Deletes a worker and all of its traces.
     *
     * @param workerId Id of the worker to delete.
     * @return void.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWorkerWithResponse(String workerId) {
        try {
            return withContext(context -> deleteWorkerWithResponse(workerId, context));
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    Mono<Response<Void>> deleteWorkerWithResponse(String id, Context context) {
        try {
            return jobRouter.deleteWorkerWithResponseAsync(id, context);
        } catch (RuntimeException ex) {
            return monoError(LOGGER, ex);
        }
    }

    /**
     * Retrieves existing workers.
     *
     * @return a paged collection of workers.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RouterWorkerItem> listWorkers() {
        try {
            return jobRouter.listWorkersAsync(null, null, null, null, null);
        } catch (RuntimeException ex) {
            return pagedFluxError(LOGGER, ex);
        }
    }

    /**
     * Retrieves existing workers.
     *
     * @param listWorkersOptions options for listWorkers.
     * @return a paged collection of workers.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RouterWorkerItem> listWorkers(ListWorkersOptions listWorkersOptions) {
        try {
            return jobRouter.listWorkersAsync(listWorkersOptions.getWorkerStateSelector(),
                listWorkersOptions.getChannelId(),
                listWorkersOptions.getQueueId(),
                listWorkersOptions.getHasCapacity(),
                listWorkersOptions.getMaxPageSize());
        } catch (RuntimeException ex) {
            return pagedFluxError(LOGGER, ex);
        }
    }

    PagedFlux<RouterWorkerItem> listWorkers(ListWorkersOptions listWorkersOptions, Context context) {
        try {
            return jobRouter.listWorkersAsync(listWorkersOptions.getWorkerStateSelector(),
                listWorkersOptions.getChannelId(),
                listWorkersOptions.getQueueId(),
                listWorkersOptions.getHasCapacity(),
                listWorkersOptions.getMaxPageSize(),
                context);
        } catch (RuntimeException ex) {
            return pagedFluxError(LOGGER, ex);
        }
    }
}