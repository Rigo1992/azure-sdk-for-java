// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

/**
 * Response payload for cancel add participant request.
 */
@Fluent
public final class CancelAddParticipantResponse {
    /*
     * Invitation ID used to cancel the add participant action.
     */
    @JsonProperty(value = "invitationId")
    private String invitationId;

    /*
     * The operation context provided by client.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /**
     * Creates an instance of CancelAddParticipantResponse class.
     */
    public CancelAddParticipantResponse() {
    }

    /**
     * Get the invitationId property: Invitation ID used to cancel the add participant action.
     * 
     * @return the invitationId value.
     */
    public String getInvitationId() {
        return this.invitationId;
    }

    /**
     * Set the invitationId property: Invitation ID used to cancel the add participant action.
     * 
     * @param invitationId the invitationId value to set.
     * @return the CancelAddParticipantResponse object itself.
     */
    public CancelAddParticipantResponse setInvitationId(String invitationId) {
        this.invitationId = invitationId;
        return this;
    }

    /**
     * Get the operationContext property: The operation context provided by client.
     * 
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The operation context provided by client.
     * 
     * @param operationContext the operationContext value to set.
     * @return the CancelAddParticipantResponse object itself.
     */
    public CancelAddParticipantResponse setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}
