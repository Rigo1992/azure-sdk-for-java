// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The error information associated with a failed run step.
 */
@Immutable
public final class RunStepError {

    /*
     * The error code for this error.
     */
    @Generated
    @JsonProperty(value = "code")
    private RunStepErrorCode code;

    /*
     * The human-readable text associated with this error.
     */
    @Generated
    @JsonProperty(value = "message")
    private String message;

    /**
     * Creates an instance of RunStepError class.
     *
     * @param code the code value to set.
     * @param message the message value to set.
     */
    @Generated
    @JsonCreator
    private RunStepError(@JsonProperty(value = "code") RunStepErrorCode code,
        @JsonProperty(value = "message") String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Get the code property: The error code for this error.
     *
     * @return the code value.
     */
    @Generated
    public RunStepErrorCode getCode() {
        return this.code;
    }

    /**
     * Get the message property: The human-readable text associated with this error.
     *
     * @return the message value.
     */
    @Generated
    public String getMessage() {
        return this.message;
    }
}
