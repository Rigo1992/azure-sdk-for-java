// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The request payload for muting participants from the call. */
@Fluent
public final class MuteParticipantsRequest {
    /*
     * Participants to be muted from the call.
     * Only ACS Users are supported.
     */
    @JsonProperty(value = "targetParticipants", required = true)
    private List<CommunicationIdentifierModel> targetParticipants;

    /*
     * Used by customers when calling mid-call actions to correlate the request
     * to the response event.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /**
     * Get the targetParticipants property: Participants to be muted from the call. Only ACS Users are supported.
     *
     * @return the targetParticipants value.
     */
    public List<CommunicationIdentifierModel> getTargetParticipants() {
        return this.targetParticipants;
    }

    /**
     * Set the targetParticipants property: Participants to be muted from the call. Only ACS Users are supported.
     *
     * @param targetParticipants the targetParticipants value to set.
     * @return the MuteParticipantsRequest object itself.
     */
    public MuteParticipantsRequest setTargetParticipants(List<CommunicationIdentifierModel> targetParticipants) {
        this.targetParticipants = targetParticipants;
        return this;
    }

    /**
     * Get the operationContext property: Used by customers when calling mid-call actions to correlate the request to
     * the response event.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: Used by customers when calling mid-call actions to correlate the request to
     * the response event.
     *
     * @param operationContext the operationContext value to set.
     * @return the MuteParticipantsRequest object itself.
     */
    public MuteParticipantsRequest setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}
