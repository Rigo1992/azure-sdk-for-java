// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation;

import com.azure.communication.callautomation.implementation.models.CommunicationErrorResponseException;
import com.azure.communication.callautomation.implementation.models.RecordingStateResponseInternal;
import com.azure.communication.callautomation.implementation.models.StartCallRecordingRequestInternal;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
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
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CallRecordings. */
public final class CallRecordingsImpl {
    /** The proxy service used to perform REST calls. */
    private final CallRecordingsService service;

    /** The service client containing this operation class. */
    private final AzureCommunicationCallAutomationServiceImpl client;

    /**
     * Initializes an instance of CallRecordingsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CallRecordingsImpl(AzureCommunicationCallAutomationServiceImpl client) {
        this.service =
                RestProxy.create(CallRecordingsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureCommunicationCallAutomationServiceCallRecordings to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "AzureCommunicationCa")
    public interface CallRecordingsService {
        @Post("/calling/recordings")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<RecordingStateResponseInternal>> startRecording(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Repeatability-Request-ID") UUID repeatabilityRequestID,
                @HeaderParam("Repeatability-First-Sent") String repeatabilityFirstSent,
                @BodyParam("application/json") StartCallRecordingRequestInternal startCallRecording,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/calling/recordings/{recordingId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<RecordingStateResponseInternal>> getRecordingProperties(
                @HostParam("endpoint") String endpoint,
                @PathParam("recordingId") String recordingId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Delete("/calling/recordings/{recordingId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<Void>> stopRecording(
                @HostParam("endpoint") String endpoint,
                @PathParam("recordingId") String recordingId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/calling/recordings/{recordingId}:pause")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<Void>> pauseRecording(
                @HostParam("endpoint") String endpoint,
                @PathParam("recordingId") String recordingId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/calling/recordings/{recordingId}:resume")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<Void>> resumeRecording(
                @HostParam("endpoint") String endpoint,
                @PathParam("recordingId") String recordingId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Start recording the call.
     *
     * @param startCallRecording The request body of start call recording request.
     * @param repeatabilityRequestID If specified, the client directs that the request is repeatable; that is, that the
     *     client can make the request multiple times with the same Repeatability-Request-Id and get back an appropriate
     *     response without the server executing the request multiple times. The value of the Repeatability-Request-Id
     *     is an opaque string representing a client-generated unique identifier for the request. It is a version 4
     *     (random) UUID.
     * @param repeatabilityFirstSent If Repeatability-Request-ID header is specified, then Repeatability-First-Sent
     *     header must also be specified. The value should be the date and time at which the request was first created,
     *     expressed using the IMF-fixdate form of HTTP-date. Example: Sun, 06 Nov 1994 08:49:37 GMT.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RecordingStateResponseInternal>> startRecordingWithResponseAsync(
            StartCallRecordingRequestInternal startCallRecording,
            UUID repeatabilityRequestID,
            String repeatabilityFirstSent) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.startRecording(
                                this.client.getEndpoint(),
                                this.client.getApiVersion(),
                                repeatabilityRequestID,
                                repeatabilityFirstSent,
                                startCallRecording,
                                accept,
                                context));
    }

    /**
     * Start recording the call.
     *
     * @param startCallRecording The request body of start call recording request.
     * @param repeatabilityRequestID If specified, the client directs that the request is repeatable; that is, that the
     *     client can make the request multiple times with the same Repeatability-Request-Id and get back an appropriate
     *     response without the server executing the request multiple times. The value of the Repeatability-Request-Id
     *     is an opaque string representing a client-generated unique identifier for the request. It is a version 4
     *     (random) UUID.
     * @param repeatabilityFirstSent If Repeatability-Request-ID header is specified, then Repeatability-First-Sent
     *     header must also be specified. The value should be the date and time at which the request was first created,
     *     expressed using the IMF-fixdate form of HTTP-date. Example: Sun, 06 Nov 1994 08:49:37 GMT.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RecordingStateResponseInternal>> startRecordingWithResponseAsync(
            StartCallRecordingRequestInternal startCallRecording,
            UUID repeatabilityRequestID,
            String repeatabilityFirstSent,
            Context context) {
        final String accept = "application/json";
        return service.startRecording(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                repeatabilityRequestID,
                repeatabilityFirstSent,
                startCallRecording,
                accept,
                context);
    }

    /**
     * Start recording the call.
     *
     * @param startCallRecording The request body of start call recording request.
     * @param repeatabilityRequestID If specified, the client directs that the request is repeatable; that is, that the
     *     client can make the request multiple times with the same Repeatability-Request-Id and get back an appropriate
     *     response without the server executing the request multiple times. The value of the Repeatability-Request-Id
     *     is an opaque string representing a client-generated unique identifier for the request. It is a version 4
     *     (random) UUID.
     * @param repeatabilityFirstSent If Repeatability-Request-ID header is specified, then Repeatability-First-Sent
     *     header must also be specified. The value should be the date and time at which the request was first created,
     *     expressed using the IMF-fixdate form of HTTP-date. Example: Sun, 06 Nov 1994 08:49:37 GMT.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RecordingStateResponseInternal> startRecordingAsync(
            StartCallRecordingRequestInternal startCallRecording,
            UUID repeatabilityRequestID,
            String repeatabilityFirstSent) {
        return startRecordingWithResponseAsync(startCallRecording, repeatabilityRequestID, repeatabilityFirstSent)
                .flatMap(
                        (Response<RecordingStateResponseInternal> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Start recording the call.
     *
     * @param startCallRecording The request body of start call recording request.
     * @param repeatabilityRequestID If specified, the client directs that the request is repeatable; that is, that the
     *     client can make the request multiple times with the same Repeatability-Request-Id and get back an appropriate
     *     response without the server executing the request multiple times. The value of the Repeatability-Request-Id
     *     is an opaque string representing a client-generated unique identifier for the request. It is a version 4
     *     (random) UUID.
     * @param repeatabilityFirstSent If Repeatability-Request-ID header is specified, then Repeatability-First-Sent
     *     header must also be specified. The value should be the date and time at which the request was first created,
     *     expressed using the IMF-fixdate form of HTTP-date. Example: Sun, 06 Nov 1994 08:49:37 GMT.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RecordingStateResponseInternal> startRecordingAsync(
            StartCallRecordingRequestInternal startCallRecording,
            UUID repeatabilityRequestID,
            String repeatabilityFirstSent,
            Context context) {
        return startRecordingWithResponseAsync(
                        startCallRecording, repeatabilityRequestID, repeatabilityFirstSent, context)
                .flatMap(
                        (Response<RecordingStateResponseInternal> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Start recording the call.
     *
     * @param startCallRecording The request body of start call recording request.
     * @param repeatabilityRequestID If specified, the client directs that the request is repeatable; that is, that the
     *     client can make the request multiple times with the same Repeatability-Request-Id and get back an appropriate
     *     response without the server executing the request multiple times. The value of the Repeatability-Request-Id
     *     is an opaque string representing a client-generated unique identifier for the request. It is a version 4
     *     (random) UUID.
     * @param repeatabilityFirstSent If Repeatability-Request-ID header is specified, then Repeatability-First-Sent
     *     header must also be specified. The value should be the date and time at which the request was first created,
     *     expressed using the IMF-fixdate form of HTTP-date. Example: Sun, 06 Nov 1994 08:49:37 GMT.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RecordingStateResponseInternal startRecording(
            StartCallRecordingRequestInternal startCallRecording,
            UUID repeatabilityRequestID,
            String repeatabilityFirstSent) {
        return startRecordingAsync(startCallRecording, repeatabilityRequestID, repeatabilityFirstSent).block();
    }

    /**
     * Start recording the call.
     *
     * @param startCallRecording The request body of start call recording request.
     * @param repeatabilityRequestID If specified, the client directs that the request is repeatable; that is, that the
     *     client can make the request multiple times with the same Repeatability-Request-Id and get back an appropriate
     *     response without the server executing the request multiple times. The value of the Repeatability-Request-Id
     *     is an opaque string representing a client-generated unique identifier for the request. It is a version 4
     *     (random) UUID.
     * @param repeatabilityFirstSent If Repeatability-Request-ID header is specified, then Repeatability-First-Sent
     *     header must also be specified. The value should be the date and time at which the request was first created,
     *     expressed using the IMF-fixdate form of HTTP-date. Example: Sun, 06 Nov 1994 08:49:37 GMT.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RecordingStateResponseInternal> startRecordingWithResponse(
            StartCallRecordingRequestInternal startCallRecording,
            UUID repeatabilityRequestID,
            String repeatabilityFirstSent,
            Context context) {
        return startRecordingWithResponseAsync(
                        startCallRecording, repeatabilityRequestID, repeatabilityFirstSent, context)
                .block();
    }

    /**
     * Get call recording properties.
     *
     * @param recordingId The recording id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return call recording properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RecordingStateResponseInternal>> getRecordingPropertiesWithResponseAsync(String recordingId) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.getRecordingProperties(
                                this.client.getEndpoint(), recordingId, this.client.getApiVersion(), accept, context));
    }

    /**
     * Get call recording properties.
     *
     * @param recordingId The recording id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return call recording properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RecordingStateResponseInternal>> getRecordingPropertiesWithResponseAsync(
            String recordingId, Context context) {
        final String accept = "application/json";
        return service.getRecordingProperties(
                this.client.getEndpoint(), recordingId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Get call recording properties.
     *
     * @param recordingId The recording id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return call recording properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RecordingStateResponseInternal> getRecordingPropertiesAsync(String recordingId) {
        return getRecordingPropertiesWithResponseAsync(recordingId)
                .flatMap(
                        (Response<RecordingStateResponseInternal> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get call recording properties.
     *
     * @param recordingId The recording id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return call recording properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RecordingStateResponseInternal> getRecordingPropertiesAsync(String recordingId, Context context) {
        return getRecordingPropertiesWithResponseAsync(recordingId, context)
                .flatMap(
                        (Response<RecordingStateResponseInternal> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get call recording properties.
     *
     * @param recordingId The recording id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return call recording properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RecordingStateResponseInternal getRecordingProperties(String recordingId) {
        return getRecordingPropertiesAsync(recordingId).block();
    }

    /**
     * Get call recording properties.
     *
     * @param recordingId The recording id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return call recording properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RecordingStateResponseInternal> getRecordingPropertiesWithResponse(
            String recordingId, Context context) {
        return getRecordingPropertiesWithResponseAsync(recordingId, context).block();
    }

    /**
     * Stop recording the call.
     *
     * @param recordingId The recording id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> stopRecordingWithResponseAsync(String recordingId) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.stopRecording(
                                this.client.getEndpoint(), recordingId, this.client.getApiVersion(), accept, context));
    }

    /**
     * Stop recording the call.
     *
     * @param recordingId The recording id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> stopRecordingWithResponseAsync(String recordingId, Context context) {
        final String accept = "application/json";
        return service.stopRecording(
                this.client.getEndpoint(), recordingId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Stop recording the call.
     *
     * @param recordingId The recording id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> stopRecordingAsync(String recordingId) {
        return stopRecordingWithResponseAsync(recordingId).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Stop recording the call.
     *
     * @param recordingId The recording id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> stopRecordingAsync(String recordingId, Context context) {
        return stopRecordingWithResponseAsync(recordingId, context).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Stop recording the call.
     *
     * @param recordingId The recording id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void stopRecording(String recordingId) {
        stopRecordingAsync(recordingId).block();
    }

    /**
     * Stop recording the call.
     *
     * @param recordingId The recording id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> stopRecordingWithResponse(String recordingId, Context context) {
        return stopRecordingWithResponseAsync(recordingId, context).block();
    }

    /**
     * Pause recording the call.
     *
     * @param recordingId The recording id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> pauseRecordingWithResponseAsync(String recordingId) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.pauseRecording(
                                this.client.getEndpoint(), recordingId, this.client.getApiVersion(), accept, context));
    }

    /**
     * Pause recording the call.
     *
     * @param recordingId The recording id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> pauseRecordingWithResponseAsync(String recordingId, Context context) {
        final String accept = "application/json";
        return service.pauseRecording(
                this.client.getEndpoint(), recordingId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Pause recording the call.
     *
     * @param recordingId The recording id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> pauseRecordingAsync(String recordingId) {
        return pauseRecordingWithResponseAsync(recordingId).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Pause recording the call.
     *
     * @param recordingId The recording id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> pauseRecordingAsync(String recordingId, Context context) {
        return pauseRecordingWithResponseAsync(recordingId, context).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Pause recording the call.
     *
     * @param recordingId The recording id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void pauseRecording(String recordingId) {
        pauseRecordingAsync(recordingId).block();
    }

    /**
     * Pause recording the call.
     *
     * @param recordingId The recording id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> pauseRecordingWithResponse(String recordingId, Context context) {
        return pauseRecordingWithResponseAsync(recordingId, context).block();
    }

    /**
     * Resume recording the call.
     *
     * @param recordingId The recording id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> resumeRecordingWithResponseAsync(String recordingId) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.resumeRecording(
                                this.client.getEndpoint(), recordingId, this.client.getApiVersion(), accept, context));
    }

    /**
     * Resume recording the call.
     *
     * @param recordingId The recording id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> resumeRecordingWithResponseAsync(String recordingId, Context context) {
        final String accept = "application/json";
        return service.resumeRecording(
                this.client.getEndpoint(), recordingId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Resume recording the call.
     *
     * @param recordingId The recording id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> resumeRecordingAsync(String recordingId) {
        return resumeRecordingWithResponseAsync(recordingId).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Resume recording the call.
     *
     * @param recordingId The recording id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> resumeRecordingAsync(String recordingId, Context context) {
        return resumeRecordingWithResponseAsync(recordingId, context).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Resume recording the call.
     *
     * @param recordingId The recording id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void resumeRecording(String recordingId) {
        resumeRecordingAsync(recordingId).block();
    }

    /**
     * Resume recording the call.
     *
     * @param recordingId The recording id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> resumeRecordingWithResponse(String recordingId, Context context) {
        return resumeRecordingWithResponseAsync(recordingId, context).block();
    }
}
