// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver;

import com.azure.communication.callingserver.implementation.AzureCommunicationCallingServerServiceImpl;
import com.azure.communication.callingserver.implementation.CallConnectionsImpl;
import com.azure.communication.callingserver.implementation.ServerCallingsImpl;
import com.azure.communication.callingserver.implementation.converters.CommunicationIdentifierConverter;
import com.azure.communication.callingserver.implementation.models.CommunicationIdentifierModel;
import com.azure.communication.callingserver.implementation.models.CreateCallRequestInternal;
import com.azure.communication.callingserver.implementation.models.AnswerCallRequestInternal;
import com.azure.communication.callingserver.implementation.models.RedirectCallRequestInternal;
import com.azure.communication.callingserver.implementation.models.RejectCallRequestInternal;
import com.azure.communication.callingserver.implementation.models.CallRejectReason;
import com.azure.communication.callingserver.implementation.models.CallSourceDto;
import com.azure.communication.callingserver.implementation.models.PhoneNumberIdentifierModel;
import com.azure.communication.common.CommunicationIdentifier;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Mono;
import java.util.List;

import static com.azure.core.util.FluxUtil.monoError;
import static com.azure.core.util.FluxUtil.withContext;

/**
 * Asynchronous client that supports calling server operations.
 *
 * <p><strong>Instantiating a asynchronous CallingServer client</strong></p>
 *
 * <p>View {@link CallingServerClientBuilder this} for additional ways to construct the client.</p>
 *
 * @see CallingServerClientBuilder
 */
@ServiceClient(builder = CallingServerClientBuilder.class, isAsync = true)
public final class CallingServerAsyncClient {
    private final CallConnectionsImpl callConnectionInternal;
    private final ServerCallingsImpl serverCallingInternal;
    private final ClientLogger logger;

    CallingServerAsyncClient(AzureCommunicationCallingServerServiceImpl callServiceClient) {
        callConnectionInternal = callServiceClient.getCallConnections();
        serverCallingInternal = callServiceClient.getServerCallings();
        logger = new ClientLogger(CallingServerAsyncClient.class);
    }

    /**
     * Get call connection properties.
     *
     * @param callConnectionId the call connection Id
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response payload for a successful get call connection request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CallConnectionAsync> getCall(String callConnectionId) {
        return getCallWithResponse(callConnectionId).flatMap(FluxUtil::toMono);
    }

    /**
     * Get call connection properties.
     *
     * @param callConnectionId the call connection Id
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response payload for a successful get call connection request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CallConnectionAsync>> getCallWithResponse(String callConnectionId) {
        return withContext(context -> getCallWithResponseInternal(callConnectionId, context));
    }

    Mono<Response<CallConnectionAsync>> getCallWithResponseInternal(String callConnectionId, Context context) {
        try {
            context = context == null ? Context.NONE : context;

            return callConnectionInternal.getCallWithResponseAsync(callConnectionId, context).map(response ->
                new SimpleResponse<>(response, new CallConnectionAsync(response.getValue(), callConnectionInternal)));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Create a call connection request from a source identity to a target identity.
     *
     * @param source The source property.
     * @param targets The targets of the call.
     * @param callbackUri The call back URI.
     * @param sourceCallerId The source caller Id that's shown to the PSTN participant being invited.
     *                       Required only when inviting a PSTN participant. Optional
     * @param subject The subject. Optional
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful CreateCallConnection request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CallConnectionAsync> createCall(CommunicationIdentifier source, List<CommunicationIdentifier> targets,
                                                String callbackUri, String sourceCallerId, String subject) {
        return createCallWithResponse(source, targets, callbackUri, sourceCallerId, subject).flatMap(FluxUtil::toMono);
    }

    /**
     * Create a call connection request from a source identity to a target identity.
     *
     * @param source The source property.
     * @param targets The targets of the call.
     * @param callbackUri The call back URI.
     * @param sourceCallerId The source caller Id that's shown to the PSTN participant being invited.
     *                       Required only when inviting a PSTN participant. Optional
     * @param subject The subject. Optional
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful CreateCallConnection request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CallConnectionAsync>> createCallWithResponse(CommunicationIdentifier source,
                                                                      List<CommunicationIdentifier> targets,
                                                                      String callbackUri, String sourceCallerId,
                                                                      String subject) {
        return withContext(context -> createCallWithResponseInternal(source, targets, callbackUri, sourceCallerId,
            subject, context));
    }

    Mono<Response<CallConnectionAsync>> createCallWithResponseInternal(CommunicationIdentifier source,
                                                                       List<CommunicationIdentifier> targets,
                                                                       String callbackUri, String sourceCallerId,
                                                                       String subject,
                                                                       Context context) {
        try {
            context = context == null ? Context.NONE : context;
            List<CommunicationIdentifierModel> targetsModel = null;
            for (CommunicationIdentifier target : targets) {
                targetsModel.add(CommunicationIdentifierConverter.convert(target));
            }
            CallSourceDto callSourceDto = new CallSourceDto().setIdentifier(CommunicationIdentifierConverter.convert(source));
            if (sourceCallerId != null) {
                callSourceDto.setCallerId(new PhoneNumberIdentifierModel().setValue(sourceCallerId));
            }

            CreateCallRequestInternal request = new CreateCallRequestInternal()
                .setSource(callSourceDto)
                .setTargets(targetsModel)
                .setCallbackUri(callbackUri)
                .setSubject(subject);

            return serverCallingInternal.createCallWithResponseAsync(request, context).map(
                response -> new SimpleResponse<>(response, new CallConnectionAsync(response.getValue(),
                    callConnectionInternal)));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Answer an incoming call
     *
     * @param incomingCallContext The incoming call context.
     * @param callbackUri The call back uri. Optional
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful CreateCallConnection request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CallConnectionAsync> answerCall(String incomingCallContext, String callbackUri) {
        return answerCallWithResponse(incomingCallContext, callbackUri).flatMap(FluxUtil::toMono);
    }

    /**
     * Create a call connection request from a source identity to a target identity.
     *
     * @param incomingCallContext The incoming call context.
     * @param callbackUri The call back uri. Optional
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful CreateCallConnection request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CallConnectionAsync>> answerCallWithResponse(String incomingCallContext,
                                                                      String callbackUri) {
        return withContext(context -> answerCallWithResponseInternal(incomingCallContext, callbackUri, context));
    }

    Mono<Response<CallConnectionAsync>> answerCallWithResponseInternal(String incomingCallContext, String callbackUri,
                                                                       Context context) {
        try {
            context = context == null ? Context.NONE : context;

            AnswerCallRequestInternal request = new AnswerCallRequestInternal()
                .setIncomingCallContext(incomingCallContext)
                .setCallbackUri(callbackUri);

            return serverCallingInternal.answerCallWithResponseAsync(request, context)
                .map(response -> new SimpleResponse<>(response,
                    new CallConnectionAsync(response.getValue(), callConnectionInternal)));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Redirect a call
     *
     * @param incomingCallContext The incoming call context.
     * @param target The target identity.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful CreateCallConnection request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> redirectCall(String incomingCallContext, CommunicationIdentifier target) {
        return redirectCallWithResponse(incomingCallContext, target).flatMap(FluxUtil::toMono);
    }

    /**
     * Redirect a call
     *
     * @param incomingCallContext The incoming call context.
     * @param target The target identity.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful CreateCallConnection request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> redirectCallWithResponse(String incomingCallContext, CommunicationIdentifier target) {
        return withContext(context -> redirectCallWithResponseInternal(incomingCallContext, target, context));
    }

    Mono<Response<Void>> redirectCallWithResponseInternal(String incomingCallContext, CommunicationIdentifier target,
                                                          Context context) {
        try {
            context = context == null ? Context.NONE : context;

            RedirectCallRequestInternal request = new RedirectCallRequestInternal()
                .setIncomingCallContext(incomingCallContext)
                .setTarget(CommunicationIdentifierConverter.convert(target));

            return serverCallingInternal.redirectCallWithResponseAsync(request, context);
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Reject a call
     *
     * @param incomingCallContext The incoming call context.
     * @param callRejectReason The reason why call is rejected. Optional
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful CreateCallConnection request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> rejectCall(String incomingCallContext, String callRejectReason) {
        return rejectCallWithResponse(incomingCallContext, callRejectReason).flatMap(FluxUtil::toMono);
    }

    /**
     * Reject a call
     *
     * @param incomingCallContext The incoming call context.
     * @param callRejectReason The reason why call is rejected. Optional
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response for a successful CreateCallConnection request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> rejectCallWithResponse(String incomingCallContext, String callRejectReason) {
        return withContext(context -> rejectCallWithResponseInternal(incomingCallContext, callRejectReason, context));
    }

    Mono<Response<Void>> rejectCallWithResponseInternal(String incomingCallContext, String callRejectReason,
                                                        Context context) {
        try {
            context = context == null ? Context.NONE : context;

            RejectCallRequestInternal request = new RejectCallRequestInternal()
                .setIncomingCallContext(incomingCallContext)
                .setCallRejectReason(CallRejectReason.fromString(callRejectReason));

            return serverCallingInternal.rejectCallWithResponseAsync(request, context);
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }
}
