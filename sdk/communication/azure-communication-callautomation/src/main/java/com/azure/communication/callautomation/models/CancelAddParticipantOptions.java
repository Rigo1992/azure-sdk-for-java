// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.models;

import com.azure.core.annotation.Fluent;

/**
 * The options for cancelling add participant.
 */
@Fluent
public final class CancelAddParticipantOptions {
    /**
     * The inviation ID used to cancel the add participant request.
     */
    private final String invitationId;

    /**
     * The operational context
     */
    private String operationContext;

    /**
     * Set a callback URI that overrides the default callback URI set by CreateCall/AnswerCall for this operation.
     * This setup is per-action. If this is not set, the default callback URI set by CreateCall/AnswerCall will be used.
     */
    private String overrideCallbackUrl;

    /**
     * Constructor
     *
     * @param invitationId The inviation ID used to cancel the add participant request.
     */
    public CancelAddParticipantOptions(String invitationId) {
        this.invitationId = invitationId;
    }

    /**
     * Get the invitationId.
     *
     * @return invitationId
     */
    public String getInvitationId() {
        return invitationId;
    }

    /**
     * Get the operationContext.
     *
     * @return the operationContext
     */
    public String getOperationContext() {
        return operationContext;
    }

    /**
     * Get the callback URI override.
     *
     * @return the overrideCallbackUrl
     */
    public String getOverrideCallbackUrl() {
        return overrideCallbackUrl;
    }

    /**
     * Set the operationContext.
     *
     * @param operationContext the operationContext to set
     * @return the CancelAddParticipantOptions object itself.
     */
    public CancelAddParticipantOptions setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Set the overrideCallbackUrl.
     *
     * @param overrideCallbackUrl the overrideCallbackUrl to set
     * @return the CancelAddParticipantOptions object itself.
     */
    public CancelAddParticipantOptions setOverrideCallbackUrl(String overrideCallbackUrl) {
        this.overrideCallbackUrl = overrideCallbackUrl;
        return this;
    }
}
