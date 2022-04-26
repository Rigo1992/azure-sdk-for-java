// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.rooms.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Communication Services error. */
@Fluent
public final class CommunicationError {
    /*
     * The error code.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * The error message.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * If applicable, would be used to indicate the property causing the error.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * Further details about specific errors that led to this error.
     */
    @JsonProperty(value = "details")
    private List<CommunicationError> details;

    /*
     * The Communication Services error.
     */
    @JsonProperty(value = "innerError")
    private CommunicationError innerError;

    /**
     * Get the code property: The error code.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: The error code.
     *
     * @param code the code value to set.
     * @return the CommunicationError object itself.
     */
    public CommunicationError setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The error message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: The error message.
     *
     * @param message the message value to set.
     * @return the CommunicationError object itself.
     */
    public CommunicationError setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target property: If applicable, would be used to indicate the property causing the error.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target property: If applicable, would be used to indicate the property causing the error.
     *
     * @param target the target value to set.
     * @return the CommunicationError object itself.
     */
    public CommunicationError setTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the details property: Further details about specific errors that led to this error.
     *
     * @return the details value.
     */
    public List<CommunicationError> getDetails() {
        return this.details;
    }

    /**
     * Set the details property: Further details about specific errors that led to this error.
     *
     * @param details the details value to set.
     * @return the CommunicationError object itself.
     */
    public CommunicationError setDetails(List<CommunicationError> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the innerError property: The Communication Services error.
     *
     * @return the innerError value.
     */
    public CommunicationError getInnerError() {
        return this.innerError;
    }

    /**
     * Set the innerError property: The Communication Services error.
     *
     * @param innerError the innerError value to set.
     * @return the CommunicationError object itself.
     */
    public CommunicationError setInnerError(CommunicationError innerError) {
        this.innerError = innerError;
        return this;
    }
}
