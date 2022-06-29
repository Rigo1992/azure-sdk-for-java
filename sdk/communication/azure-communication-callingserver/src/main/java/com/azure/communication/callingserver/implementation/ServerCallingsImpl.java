// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation;

import com.azure.communication.callingserver.implementation.models.AnswerCallRequestInternal;
import com.azure.communication.callingserver.implementation.models.CallConnectionPropertiesDto;
import com.azure.communication.callingserver.implementation.models.CreateCallRequestInternal;
import com.azure.communication.callingserver.implementation.models.RedirectCallRequestInternal;
import com.azure.communication.callingserver.implementation.models.RejectCallRequestInternal;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
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

/** An instance of this class provides access to all the operations defined in ServerCallings. */
public final class ServerCallingsImpl {
    /** The proxy service used to perform REST calls. */
    private final ServerCallingsService service;

    /** The service client containing this operation class. */
    private final AzureCommunicationCallingServerServiceImpl client;

    /**
     * Initializes an instance of ServerCallingsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ServerCallingsImpl(AzureCommunicationCallingServerServiceImpl client) {
        this.service =
                RestProxy.create(ServerCallingsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureCommunicationCallingServerServiceServerCallings to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "AzureCommunicationCa")
    public interface ServerCallingsService {
        @Post("/calling/callConnections")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<CallConnectionPropertiesDto>> createCall(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") CreateCallRequestInternal body,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/calling/callConnections:answer")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<CallConnectionPropertiesDto>> answerCall(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") AnswerCallRequestInternal answerCallRequest,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/calling/callConnections:redirect")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> redirectCall(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") RedirectCallRequestInternal redirectCallRequest,
                Context context);

        @Post("/calling/callConnections:reject")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> rejectCall(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") RejectCallRequestInternal rejectCallRequest,
                Context context);
    }

    /**
     * Create an outbound call.
     *
     * @param body The create call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CallConnectionPropertiesDto>> createCallWithResponseAsync(CreateCallRequestInternal body) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.createCall(
                                this.client.getEndpoint(), this.client.getApiVersion(), body, accept, context));
    }

    /**
     * Create an outbound call.
     *
     * @param body The create call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CallConnectionPropertiesDto>> createCallWithResponseAsync(
            CreateCallRequestInternal body, Context context) {
        final String accept = "application/json";
        return service.createCall(this.client.getEndpoint(), this.client.getApiVersion(), body, accept, context);
    }

    /**
     * Create an outbound call.
     *
     * @param body The create call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CallConnectionPropertiesDto> createCallAsync(CreateCallRequestInternal body) {
        return createCallWithResponseAsync(body)
                .flatMap(
                        (Response<CallConnectionPropertiesDto> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create an outbound call.
     *
     * @param body The create call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CallConnectionPropertiesDto> createCallAsync(CreateCallRequestInternal body, Context context) {
        return createCallWithResponseAsync(body, context)
                .flatMap(
                        (Response<CallConnectionPropertiesDto> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create an outbound call.
     *
     * @param body The create call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CallConnectionPropertiesDto createCall(CreateCallRequestInternal body) {
        return createCallAsync(body).block();
    }

    /**
     * Create an outbound call.
     *
     * @param body The create call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CallConnectionPropertiesDto> createCallWithResponse(
            CreateCallRequestInternal body, Context context) {
        return createCallWithResponseAsync(body, context).block();
    }

    /**
     * Answer a call using the IncomingCallContext from Event Grid.
     *
     * @param answerCallRequest The answer call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CallConnectionPropertiesDto>> answerCallWithResponseAsync(
            AnswerCallRequestInternal answerCallRequest) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.answerCall(
                                this.client.getEndpoint(),
                                this.client.getApiVersion(),
                                answerCallRequest,
                                accept,
                                context));
    }

    /**
     * Answer a call using the IncomingCallContext from Event Grid.
     *
     * @param answerCallRequest The answer call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CallConnectionPropertiesDto>> answerCallWithResponseAsync(
            AnswerCallRequestInternal answerCallRequest, Context context) {
        final String accept = "application/json";
        return service.answerCall(
                this.client.getEndpoint(), this.client.getApiVersion(), answerCallRequest, accept, context);
    }

    /**
     * Answer a call using the IncomingCallContext from Event Grid.
     *
     * @param answerCallRequest The answer call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CallConnectionPropertiesDto> answerCallAsync(AnswerCallRequestInternal answerCallRequest) {
        return answerCallWithResponseAsync(answerCallRequest)
                .flatMap(
                        (Response<CallConnectionPropertiesDto> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Answer a call using the IncomingCallContext from Event Grid.
     *
     * @param answerCallRequest The answer call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CallConnectionPropertiesDto> answerCallAsync(
            AnswerCallRequestInternal answerCallRequest, Context context) {
        return answerCallWithResponseAsync(answerCallRequest, context)
                .flatMap(
                        (Response<CallConnectionPropertiesDto> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Answer a call using the IncomingCallContext from Event Grid.
     *
     * @param answerCallRequest The answer call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CallConnectionPropertiesDto answerCall(AnswerCallRequestInternal answerCallRequest) {
        return answerCallAsync(answerCallRequest).block();
    }

    /**
     * Answer a call using the IncomingCallContext from Event Grid.
     *
     * @param answerCallRequest The answer call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CallConnectionPropertiesDto> answerCallWithResponse(
            AnswerCallRequestInternal answerCallRequest, Context context) {
        return answerCallWithResponseAsync(answerCallRequest, context).block();
    }

    /**
     * Redirect a call.
     *
     * @param redirectCallRequest The request payload for redirecting the call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> redirectCallWithResponseAsync(RedirectCallRequestInternal redirectCallRequest) {
        return FluxUtil.withContext(
                context ->
                        service.redirectCall(
                                this.client.getEndpoint(), this.client.getApiVersion(), redirectCallRequest, context));
    }

    /**
     * Redirect a call.
     *
     * @param redirectCallRequest The request payload for redirecting the call.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> redirectCallWithResponseAsync(
            RedirectCallRequestInternal redirectCallRequest, Context context) {
        return service.redirectCall(
                this.client.getEndpoint(), this.client.getApiVersion(), redirectCallRequest, context);
    }

    /**
     * Redirect a call.
     *
     * @param redirectCallRequest The request payload for redirecting the call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> redirectCallAsync(RedirectCallRequestInternal redirectCallRequest) {
        return redirectCallWithResponseAsync(redirectCallRequest).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Redirect a call.
     *
     * @param redirectCallRequest The request payload for redirecting the call.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> redirectCallAsync(RedirectCallRequestInternal redirectCallRequest, Context context) {
        return redirectCallWithResponseAsync(redirectCallRequest, context)
                .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Redirect a call.
     *
     * @param redirectCallRequest The request payload for redirecting the call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void redirectCall(RedirectCallRequestInternal redirectCallRequest) {
        redirectCallAsync(redirectCallRequest).block();
    }

    /**
     * Redirect a call.
     *
     * @param redirectCallRequest The request payload for redirecting the call.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> redirectCallWithResponse(RedirectCallRequestInternal redirectCallRequest, Context context) {
        return redirectCallWithResponseAsync(redirectCallRequest, context).block();
    }

    /**
     * Reject the call.
     *
     * @param rejectCallRequest The reject call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> rejectCallWithResponseAsync(RejectCallRequestInternal rejectCallRequest) {
        return FluxUtil.withContext(
                context ->
                        service.rejectCall(
                                this.client.getEndpoint(), this.client.getApiVersion(), rejectCallRequest, context));
    }

    /**
     * Reject the call.
     *
     * @param rejectCallRequest The reject call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> rejectCallWithResponseAsync(
            RejectCallRequestInternal rejectCallRequest, Context context) {
        return service.rejectCall(this.client.getEndpoint(), this.client.getApiVersion(), rejectCallRequest, context);
    }

    /**
     * Reject the call.
     *
     * @param rejectCallRequest The reject call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> rejectCallAsync(RejectCallRequestInternal rejectCallRequest) {
        return rejectCallWithResponseAsync(rejectCallRequest).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Reject the call.
     *
     * @param rejectCallRequest The reject call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> rejectCallAsync(RejectCallRequestInternal rejectCallRequest, Context context) {
        return rejectCallWithResponseAsync(rejectCallRequest, context).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Reject the call.
     *
     * @param rejectCallRequest The reject call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void rejectCall(RejectCallRequestInternal rejectCallRequest) {
        rejectCallAsync(rejectCallRequest).block();
    }

    /**
     * Reject the call.
     *
     * @param rejectCallRequest The reject call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> rejectCallWithResponse(RejectCallRequestInternal rejectCallRequest, Context context) {
        return rejectCallWithResponseAsync(rejectCallRequest, context).block();
    }
}
