// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation;

import com.azure.communication.callautomation.implementation.CallConnectionsImpl;
import com.azure.communication.callautomation.implementation.CallMediasImpl;
import com.azure.communication.callautomation.implementation.accesshelpers.AddParticipantResponseConstructorProxy;
import com.azure.communication.callautomation.implementation.accesshelpers.CallConnectionPropertiesConstructorProxy;
import com.azure.communication.callautomation.implementation.accesshelpers.CancelAddParticipantResponseConstructorProxy;
import com.azure.communication.callautomation.implementation.accesshelpers.MuteParticipantsResponseConstructorProxy;
import com.azure.communication.callautomation.implementation.accesshelpers.RemoveParticipantResponseConstructorProxy;
import com.azure.communication.callautomation.implementation.accesshelpers.TransferCallResponseConstructorProxy;
import com.azure.communication.callautomation.implementation.converters.CallParticipantConverter;
import com.azure.communication.callautomation.implementation.converters.CommunicationIdentifierConverter;
import com.azure.communication.callautomation.implementation.converters.PhoneNumberIdentifierConverter;
import com.azure.communication.callautomation.implementation.models.AddParticipantRequestInternal;
import com.azure.communication.callautomation.implementation.models.CancelAddParticipantRequest;
import com.azure.communication.callautomation.implementation.models.CustomContext;
import com.azure.communication.callautomation.implementation.models.MuteParticipantsRequestInternal;
import com.azure.communication.callautomation.implementation.models.RemoveParticipantRequestInternal;
import com.azure.communication.callautomation.implementation.models.TransferToParticipantRequestInternal;
import com.azure.communication.callautomation.models.AddParticipantResult;
import com.azure.communication.callautomation.models.CallParticipant;
import com.azure.communication.callautomation.models.CancelAddParticipantOptions;
import com.azure.communication.callautomation.models.CancelAddParticipantResult;
import com.azure.communication.callautomation.models.AddParticipantOptions;
import com.azure.communication.callautomation.models.CallConnectionProperties;
import com.azure.communication.callautomation.models.CallInvite;
import com.azure.communication.callautomation.models.MuteParticipantsOptions;
import com.azure.communication.callautomation.models.MuteParticipantsResult;
import com.azure.communication.callautomation.models.RemoveParticipantOptions;
import com.azure.communication.callautomation.models.RemoveParticipantResult;
import com.azure.communication.callautomation.models.TransferCallResult;
import com.azure.communication.callautomation.models.TransferCallToParticipantOptions;

import com.azure.communication.common.CommunicationIdentifier;
import com.azure.communication.common.CommunicationUserIdentifier;
import com.azure.communication.common.MicrosoftTeamsUserIdentifier;
import com.azure.communication.common.PhoneNumberIdentifier;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Mono;

import java.net.URISyntaxException;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.azure.core.util.FluxUtil.monoError;
import static com.azure.core.util.FluxUtil.withContext;

/**
 * CallConnectionAsync for mid-call actions
 */
public final class CallConnectionAsync {
    private final String callConnectionId;
    private final CallConnectionsImpl callConnectionInternal;
    private final CallMediasImpl callMediasInternal;
    private final ClientLogger logger;

    CallConnectionAsync(
        String callConnectionId,
        CallConnectionsImpl callConnectionInternal,
        CallMediasImpl contentsInternal) {
        this.callConnectionId = callConnectionId;
        this.callConnectionInternal = callConnectionInternal;
        this.callMediasInternal = contentsInternal;
        this.logger = new ClientLogger(CallConnectionAsync.class);
    }

    /**
     * Get call connection properties.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response payload for a successful get call connection request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CallConnectionProperties> getCallProperties() {
        return getCallPropertiesWithResponse().flatMap(FluxUtil::toMono);
    }

    /**
     * Get call connection properties.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response payload for a successful get call connection request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CallConnectionProperties>> getCallPropertiesWithResponse() {
        return withContext(this::getCallPropertiesWithResponseInternal);
    }

    Mono<Response<CallConnectionProperties>> getCallPropertiesWithResponseInternal(Context context) {
        try {
            context = context == null ? Context.NONE : context;

            return callConnectionInternal.getCallWithResponseAsync(callConnectionId, context)
                .map(response -> {
                    try {
                        return new SimpleResponse<>(response, CallConnectionPropertiesConstructorProxy.create(response.getValue()));
                    } catch (URISyntaxException e) {
                        throw logger.logExceptionAsError(new RuntimeException(e));
                    }
                });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Hangup a call.
     *
     * @param isForEveryone determine if the call is handed up for all participants.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Void.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> hangUp(boolean isForEveryone) {
        return hangUpWithResponse(isForEveryone).flatMap(FluxUtil::toMono);
    }

    /**
     * Hangup a call.
     *
     * @param isForEveryone determine if the call is handed up for all participants.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response with Void.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> hangUpWithResponse(boolean isForEveryone) {
        return withContext(context -> hangUpWithResponseInternal(isForEveryone, context));
    }

    Mono<Response<Void>> hangUpWithResponseInternal(boolean isForEveryone, Context context) {
        try {
            context = context == null ? Context.NONE : context;

            return (isForEveryone ? callConnectionInternal.terminateCallWithResponseAsync(
                    callConnectionId,
                    context)
                : callConnectionInternal.hangupCallWithResponseAsync(callConnectionId, context));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Get a specific participant.
     *
     * @param targetParticipant The participant to retrieve.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Result of getting a desired participant in the call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CallParticipant> getParticipant(CommunicationIdentifier targetParticipant) {
        return getParticipantWithResponse(targetParticipant).flatMap(FluxUtil::toMono);
    }

    /**
     * Get a specific participant.
     *
     * @param targetParticipant The participant to retrieve.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response with the result of getting a desired participant in the call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CallParticipant>> getParticipantWithResponse(CommunicationIdentifier targetParticipant) {
        return withContext(context -> getParticipantWithResponseInternal(targetParticipant, context));
    }

    Mono<Response<CallParticipant>> getParticipantWithResponseInternal(CommunicationIdentifier targetParticipant, Context context) {
        try {
            context = context == null ? Context.NONE : context;

            String participantMri = targetParticipant.getRawId();
            return callConnectionInternal.getParticipantWithResponseAsync(callConnectionId, participantMri, context)
                .map(response ->
                    new SimpleResponse<>(response, CallParticipantConverter.convert(response.getValue())));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Get all participants.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response with result of getting all participants in the call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<CallParticipant> listParticipants() {
        try {
            return new PagedFlux<>(
                () -> withContext(context ->  this.callConnectionInternal.getParticipantsSinglePageAsync(
                        callConnectionId, context)),
                nextLink -> withContext(context -> this.callConnectionInternal.getParticipantsNextSinglePageAsync(
                        nextLink, context)))
                .mapPage(CallParticipantConverter::convert);
        } catch (RuntimeException ex) {
            return new PagedFlux<>(() -> monoError(logger, ex));
        }
    }

    PagedFlux<CallParticipant> listParticipantsWithContext(Context context) {
        try {
            final Context serviceContext = context == null ? Context.NONE : context;
            return callConnectionInternal.getParticipantsAsync(callConnectionId, serviceContext).mapPage(CallParticipantConverter::convert);
        } catch (RuntimeException ex) {
            return new PagedFlux<>(() -> monoError(logger, ex));
        }
    }

    /**
     * Transfer the call to a participant.
     *
     * @param targetParticipant A {@link CommunicationIdentifier} representing the targetParticipant participant of this transfer.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws IllegalArgumentException if the targetParticipant is not ACS, phone nor teams user
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Result of transferring the call to a designated participant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TransferCallResult> transferCallToParticipant(CommunicationIdentifier targetParticipant) {

        if (targetParticipant instanceof CommunicationUserIdentifier) {
            return transferCallToParticipantWithResponse(new TransferCallToParticipantOptions(targetParticipant)).flatMap(FluxUtil::toMono);
        } else if (targetParticipant instanceof PhoneNumberIdentifier) {
            return transferCallToParticipantWithResponse(new TransferCallToParticipantOptions(targetParticipant)).flatMap(FluxUtil::toMono);
        } else if (targetParticipant instanceof MicrosoftTeamsUserIdentifier) {
            return transferCallToParticipantWithResponse(new TransferCallToParticipantOptions(targetParticipant)).flatMap(FluxUtil::toMono);
        } else {
            throw logger.logExceptionAsError(new IllegalArgumentException("targetParticipant type is invalid."));
        }
    }

    /**
     * Transfer the call to a participant.
     *
     * @param transferCallToParticipantOptions Options bag for transferToParticipantCall
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response with result of transferring the call to a designated participant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TransferCallResult>> transferCallToParticipantWithResponse(
        TransferCallToParticipantOptions transferCallToParticipantOptions) {
        return withContext(context -> transferCallToParticipantWithResponseInternal(transferCallToParticipantOptions, context));
    }

    Mono<Response<TransferCallResult>> transferCallToParticipantWithResponseInternal(
        TransferCallToParticipantOptions transferCallToParticipantOptions, Context context) {
        try {
            context = context == null ? Context.NONE : context;

            TransferToParticipantRequestInternal request = new TransferToParticipantRequestInternal()
                .setTargetParticipant(CommunicationIdentifierConverter.convert(transferCallToParticipantOptions.getTargetParticipant()))
                .setOperationContext(transferCallToParticipantOptions.getOperationContext())
                .setOverrideCallbackUri(transferCallToParticipantOptions.getOverrideCallbackUrl());

            if (transferCallToParticipantOptions.getCustomContext().getSipHeaders() != null || transferCallToParticipantOptions.getCustomContext().getVoipHeaders() != null) {
                request.setCustomContext(new CustomContext()
                            .setSipHeaders(transferCallToParticipantOptions.getCustomContext().getSipHeaders())
                            .setVoipHeaders(transferCallToParticipantOptions.getCustomContext().getVoipHeaders()));
            }

            if (transferCallToParticipantOptions.getTransferee() != null) {
                request.setTransferee(CommunicationIdentifierConverter.convert(transferCallToParticipantOptions.getTransferee()));
            }

            return callConnectionInternal.transferToParticipantWithResponseAsync(
                callConnectionId,
                request,
                context).map(response -> new SimpleResponse<>(response, TransferCallResponseConstructorProxy.create(response.getValue())));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Add a participant to the call.
     *
     * @param participant participant to invite.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Result of adding a participant to the call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AddParticipantResult> addParticipant(CallInvite participant) {
        return addParticipantWithResponse(new AddParticipantOptions(participant)).flatMap(FluxUtil::toMono);
    }

    /**
     * Add a participant to the call.
     *
     * @param addParticipantOptions Options bag for addParticipant
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response with result of adding a participant to the call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AddParticipantResult>> addParticipantWithResponse(AddParticipantOptions addParticipantOptions) {
        return withContext(context -> addParticipantWithResponseInternal(addParticipantOptions, context));
    }

    Mono<Response<AddParticipantResult>> addParticipantWithResponseInternal(AddParticipantOptions addParticipantOptions,
                                                                              Context context) {
        try {
            AddParticipantRequestInternal request = new AddParticipantRequestInternal()
                .setParticipantToAdd(CommunicationIdentifierConverter.convert(addParticipantOptions.getTargetParticipant().getTargetParticipant()))
                .setSourceDisplayName(addParticipantOptions.getTargetParticipant().getSourceDisplayName())
                .setSourceCallerIdNumber(PhoneNumberIdentifierConverter.convert(addParticipantOptions.getTargetParticipant().getSourceCallerIdNumber()))
                .setOperationContext(addParticipantOptions.getOperationContext())
                .setOverrideCallbackUri(addParticipantOptions.getOverrideCallbackUrl());

            // Need to do a null check since it is optional; it might be a null and breaks the get function as well as type casting.
            if (addParticipantOptions.getInvitationTimeout() != null) {
                request.setInvitationTimeoutInSeconds((int) addParticipantOptions.getInvitationTimeout().getSeconds());
            }

            return callConnectionInternal.addParticipantWithResponseAsync(
                callConnectionId,
                request,
                context
            ).map(response -> new SimpleResponse<>(response, AddParticipantResponseConstructorProxy.create(response.getValue())));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Remove a participant from the call.
     *
     * @param participantToRemove participant to remove.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Result of removing a participant from the call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RemoveParticipantResult> removeParticipant(CommunicationIdentifier participantToRemove) {
        return removeParticipantWithResponse(new RemoveParticipantOptions(participantToRemove)).flatMap(FluxUtil::toMono);
    }

    /**
     * Remove a participant from the call.
     *
     * @param removeParticipantOptions Options bag for removeParticipant
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response with result of removing a participant from the call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RemoveParticipantResult>> removeParticipantWithResponse(RemoveParticipantOptions removeParticipantOptions) {
        return withContext(context -> removeParticipantWithResponseInternal(removeParticipantOptions, context));
    }

    Mono<Response<RemoveParticipantResult>> removeParticipantWithResponseInternal(RemoveParticipantOptions removeParticipantOptions, Context context) {
        try {
            context = context == null ? Context.NONE : context;

            RemoveParticipantRequestInternal request = new RemoveParticipantRequestInternal()
                .setParticipantToRemove(CommunicationIdentifierConverter.convert(removeParticipantOptions.getParticipant()))
                .setOperationContext(removeParticipantOptions.getOperationContext())
                .setOverrideCallbackUri(removeParticipantOptions.getOverrideCallbackUrl());

            return callConnectionInternal.removeParticipantWithResponseAsync(
                    callConnectionId,
                    request,
                    context).map(response -> new SimpleResponse<>(response, RemoveParticipantResponseConstructorProxy.create(response.getValue())));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Mutes a participant in the call.
     * @param targetParticipant - Participant to be muted. Only ACS Users are currently supported.
     * @return A MuteParticipantResult object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MuteParticipantResult> muteParticipant(CommunicationIdentifier targetParticipant) {
        return muteParticipantWithResponse(targetParticipant, null).flatMap(FluxUtil::toMono);
    }

    /**
     * Mutes a participant in the call.
     * @param targetParticipant - Participant to be muted. Only ACS Users are currently supported.
     * @param operationContext operationContext (pass null if not applicable)
     * @return Response with result of muting a participant from the call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MuteParticipantResult>> muteParticipantWithResponse(CommunicationIdentifier targetParticipant, String operationContext) {
        return withContext(context -> muteParticipantWithResponseInternal(targetParticipant, operationContext, context));
    }

    Mono<Response<MuteParticipantResult>> muteParticipantWithResponseInternal(CommunicationIdentifier targetParticipant, String operationContext, Context context) {
        try {
            context = context == null ? Context.NONE : context;
            MuteParticipantsRequestInternal request = new MuteParticipantsRequestInternal()
                .setTargetParticipants(Collections.singletonList(CommunicationIdentifierConverter.convert(targetParticipant)))
                .setOperationContext(operationContext);

            return callConnectionInternal.muteWithResponseAsync(
                callConnectionId,
                request,
                context).map(internalResponse -> new SimpleResponse<>(internalResponse, MuteParticipantsResponseConstructorProxy.create(internalResponse.getValue())));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }


    /**
     * Cancel add participant request.
     *
     * @param invitationId invitation ID used to add participant.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Result of cancelling add participant request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CancelAddParticipantResult> cancelAddParticipant(String invitationId) {
        return cancelAddParticipantWithResponse(new CancelAddParticipantOptions(invitationId)).flatMap(FluxUtil::toMono);
    }

    /**
     * Cancel add participant request.
     *
     * @param cancelAddParticipantOptions Options bag for cancelAddParticipant.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response with result of cancelling add participant request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CancelAddParticipantResult>> cancelAddParticipantWithResponse(CancelAddParticipantOptions cancelAddParticipantOptions) {
        return withContext(context -> cancelAddParticipantWithResponseInternal(cancelAddParticipantOptions, context));
    }

    Mono<Response<CancelAddParticipantResult>> cancelAddParticipantWithResponseInternal(CancelAddParticipantOptions cancelAddParticipantOptions, Context context) {
        try {
            context = context == null ? Context.NONE : context;

            CancelAddParticipantRequest request = new CancelAddParticipantRequest()
                .setInvitationId((cancelAddParticipantOptions.getInvitationId()))
                .setOperationContext(cancelAddParticipantOptions.getOperationContext())
                .setOverrideCallbackUri(cancelAddParticipantOptions.getOverrideCallbackUrl());

            return callConnectionInternal.cancelAddParticipantWithResponseAsync(
                    callConnectionId,
                    request,
                    context).map(response -> new SimpleResponse<>(response, CancelAddParticipantResponseConstructorProxy.create(response.getValue())));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }


    //region Content management Actions
    /***
     * Returns an object of CallContentAsync
     *
     * @return a CallContentAsync.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CallMediaAsync getCallMediaAsync() {
        return new CallMediaAsync(callConnectionId, callMediasInternal);
    }
    //endregion
}
