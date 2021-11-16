// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.communication.callingserver.models.CallingOperationStatus;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The add participant result event. */
@Fluent
public final class AddParticipantResultEventInternal {
    /*
     * The result details.
     */
    @JsonProperty(value = "resultInfo")
    private CallingOperationResultDetailsInternal resultInfo;

    /*
     * The operation context.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /*
     * The status of the operation
     */
    @JsonProperty(value = "status", required = true)
    private CallingOperationStatus status;

    /**
     * Get the resultInfo property: The result details.
     *
     * @return the resultInfo value.
     */
    public CallingOperationResultDetailsInternal getResultInfo() {
        return this.resultInfo;
    }

    /**
     * Set the resultInfo property: The result details.
     *
     * @param resultInfo the resultInfo value to set.
     * @return the AddParticipantResultEventInternal object itself.
     */
    public AddParticipantResultEventInternal setResultInfo(CallingOperationResultDetailsInternal resultInfo) {
        this.resultInfo = resultInfo;
        return this;
    }

    /**
     * Get the operationContext property: The operation context.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The operation context.
     *
     * @param operationContext the operationContext value to set.
     * @return the AddParticipantResultEventInternal object itself.
     */
    public AddParticipantResultEventInternal setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Get the status property: The status of the operation.
     *
     * @return the status value.
     */
    public CallingOperationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of the operation.
     *
     * @param status the status value to set.
     * @return the AddParticipantResultEventInternal object itself.
     */
    public AddParticipantResultEventInternal setStatus(CallingOperationStatus status) {
        this.status = status;
        return this;
    }
}
