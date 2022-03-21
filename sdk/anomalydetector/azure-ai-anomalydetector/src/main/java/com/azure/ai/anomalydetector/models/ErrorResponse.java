// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ErrorResponse model. */
@Fluent
public final class ErrorResponse {
    /*
     * The error code.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * The message explaining the error reported by the service.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

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
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The message explaining the error reported by the service.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: The message explaining the error reported by the service.
     *
     * @param message the message value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse setMessage(String message) {
        this.message = message;
        return this;
    }
}
