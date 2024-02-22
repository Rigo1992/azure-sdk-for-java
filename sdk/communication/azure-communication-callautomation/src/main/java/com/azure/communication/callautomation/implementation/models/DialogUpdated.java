// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DialogUpdated model. */
@Fluent
public final class DialogUpdated {
    /*
     * Used by customers when calling answerCall action to correlate the
     * request to the response event.
     */
    @JsonProperty(value = "operationContext", access = JsonProperty.Access.WRITE_ONLY)
    private String operationContext;

    /*
     * Contains the resulting SIP code/sub-code and message from NGC services.
     */
    @JsonProperty(value = "resultInformation", access = JsonProperty.Access.WRITE_ONLY)
    private ResultInformation resultInformation;

    /*
     * Determines the type of the dialog.
     */
    @JsonProperty(value = "dialogInputType")
    private DialogInputType dialogInputType;

    /*
     * Dialog ID
     */
    @JsonProperty(value = "dialogId", access = JsonProperty.Access.WRITE_ONLY)
    private String dialogId;

    /*
     * Ivr Context
     */
    @JsonProperty(value = "ivrContext", access = JsonProperty.Access.WRITE_ONLY)
    private Object ivrContext;

    /*
     * Call connection ID.
     */
    @JsonProperty(value = "callConnectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String callConnectionId;

    /*
     * Server call ID.
     */
    @JsonProperty(value = "serverCallId", access = JsonProperty.Access.WRITE_ONLY)
    private String serverCallId;

    /*
     * Correlation ID for event to call correlation. Also called ChainId for
     * skype chain ID.
     */
    @JsonProperty(value = "correlationId", access = JsonProperty.Access.WRITE_ONLY)
    private String correlationId;

    /**
     * Get the operationContext property: Used by customers when calling answerCall action to correlate the request to
     * the response event.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Get the resultInformation property: Contains the resulting SIP code/sub-code and message from NGC services.
     *
     * @return the resultInformation value.
     */
    public ResultInformation getResultInformation() {
        return this.resultInformation;
    }

    /**
     * Get the dialogInputType property: Determines the type of the dialog.
     *
     * @return the dialogInputType value.
     */
    public DialogInputType getDialogInputType() {
        return this.dialogInputType;
    }

    /**
     * Set the dialogInputType property: Determines the type of the dialog.
     *
     * @param dialogInputType the dialogInputType value to set.
     * @return the DialogUpdated object itself.
     */
    public DialogUpdated setDialogInputType(DialogInputType dialogInputType) {
        this.dialogInputType = dialogInputType;
        return this;
    }

    /**
     * Get the dialogId property: Dialog ID.
     *
     * @return the dialogId value.
     */
    public String getDialogId() {
        return this.dialogId;
    }

    /**
     * Get the ivrContext property: Ivr Context.
     *
     * @return the ivrContext value.
     */
    public Object getIvrContext() {
        return this.ivrContext;
    }

    /**
     * Get the callConnectionId property: Call connection ID.
     *
     * @return the callConnectionId value.
     */
    public String getCallConnectionId() {
        return this.callConnectionId;
    }

    /**
     * Get the serverCallId property: Server call ID.
     *
     * @return the serverCallId value.
     */
    public String getServerCallId() {
        return this.serverCallId;
    }

    /**
     * Get the correlationId property: Correlation ID for event to call correlation. Also called ChainId for skype chain
     * ID.
     *
     * @return the correlationId value.
     */
    public String getCorrelationId() {
        return this.correlationId;
    }
}
