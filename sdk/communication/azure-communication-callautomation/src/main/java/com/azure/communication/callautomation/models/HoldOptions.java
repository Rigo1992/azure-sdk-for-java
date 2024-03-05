// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.models;

import com.azure.communication.common.CommunicationIdentifier;

/**
 * Options for the Hold operation.
 */
public class HoldOptions {

    /**
     * Participant to put on hold.
     */
    private final CommunicationIdentifier targetParticipant;

    /**
     * Audio to play while on hold.
     */
    private final PlaySource playSourceInfo;

    /**
     * Operation context.
     */
    private String operationContext;

    /**
     * Create a new HoldOptions object.
     * @param targetParticipant Participant to be put on hold.
     * @param playSourceInfo Audio to be played while on hold.
     */
    public HoldOptions(CommunicationIdentifier targetParticipant, PlaySource playSourceInfo) {
        this.targetParticipant = targetParticipant;
        this.playSourceInfo = playSourceInfo;
    }

    /**
     * Get Participant to be put on hold.
     * @return participant.
     */
    public CommunicationIdentifier getTargetParticipant() {
        return targetParticipant;
    }

    /**
     * Get PlaySourceInfo
     * @return the playSourceInfo.
     */
    public PlaySource getPlaySourceInfo() {
        return playSourceInfo;
    }

    /**
     * Get the operation context.
     * @return operation context.
     */
    public String getOperationContext() {
        return operationContext;
    }

    /**
     * Sets the operation context.
     * @param operationContext Operation Context
     * @return The HoldOptions object.
     */
    public HoldOptions setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}
