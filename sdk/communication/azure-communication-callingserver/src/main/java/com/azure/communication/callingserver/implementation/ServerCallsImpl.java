// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation;

import com.azure.communication.callingserver.implementation.models.RecordingStateResponseInternal;
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
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ServerCalls. */
public final class ServerCallsImpl {
    /** The proxy service used to perform REST calls. */
    private final ServerCallsService service;

    /** The service client containing this operation class. */
    private final AzureCommunicationCallingServerServiceImpl client;

    /**
     * Initializes an instance of ServerCallsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ServerCallsImpl(AzureCommunicationCallingServerServiceImpl client) {
        this.service =
                RestProxy.create(ServerCallsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureCommunicationCallingServerServiceServerCalls to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "AzureCommunicationCa")
    public interface ServerCallsService {
        @Get("/calling/recordings/{recordingId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<RecordingStateResponseInternal>> getRecordingProperties(
                @HostParam("endpoint") String endpoint,
                @PathParam("recordingId") String recordingId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Delete("/calling/recordings/{recordingId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> stopRecording(
                @HostParam("endpoint") String endpoint,
                @PathParam("recordingId") String recordingId,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Post("/calling/recordings:pause")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> pauseRecording(
                @HostParam("endpoint") String endpoint,
                @QueryParam("recordingId") String recordingId,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Post("/calling/recordings:resume")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> resumeRecording(
                @HostParam("endpoint") String endpoint,
                @QueryParam("recordingId") String recordingId,
                @QueryParam("api-version") String apiVersion,
                Context context);
    }

    /**
     * Get call recording properties.
     *
     * @param recordingId The recording id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> stopRecordingWithResponseAsync(String recordingId) {
        return FluxUtil.withContext(
                context ->
                        service.stopRecording(
                                this.client.getEndpoint(), recordingId, this.client.getApiVersion(), context));
    }

    /**
     * Stop recording the call.
     *
     * @param recordingId The recording id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> stopRecordingWithResponseAsync(String recordingId, Context context) {
        return service.stopRecording(this.client.getEndpoint(), recordingId, this.client.getApiVersion(), context);
    }

    /**
     * Stop recording the call.
     *
     * @param recordingId The recording id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> pauseRecordingWithResponseAsync(String recordingId) {
        return FluxUtil.withContext(
                context ->
                        service.pauseRecording(
                                this.client.getEndpoint(), recordingId, this.client.getApiVersion(), context));
    }

    /**
     * Pause recording the call.
     *
     * @param recordingId The recording id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> pauseRecordingWithResponseAsync(String recordingId, Context context) {
        return service.pauseRecording(this.client.getEndpoint(), recordingId, this.client.getApiVersion(), context);
    }

    /**
     * Pause recording the call.
     *
     * @param recordingId The recording id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> resumeRecordingWithResponseAsync(String recordingId) {
        return FluxUtil.withContext(
                context ->
                        service.resumeRecording(
                                this.client.getEndpoint(), recordingId, this.client.getApiVersion(), context));
    }

    /**
     * Resume recording the call.
     *
     * @param recordingId The recording id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> resumeRecordingWithResponseAsync(String recordingId, Context context) {
        return service.resumeRecording(this.client.getEndpoint(), recordingId, this.client.getApiVersion(), context);
    }

    /**
     * Resume recording the call.
     *
     * @param recordingId The recording id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> resumeRecordingWithResponse(String recordingId, Context context) {
        return resumeRecordingWithResponseAsync(recordingId, context).block();
    }
}
