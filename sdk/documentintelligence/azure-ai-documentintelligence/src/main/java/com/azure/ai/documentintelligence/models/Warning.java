// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The error object.
 */
@Immutable
public final class Warning {
    /*
     * One of a server-defined set of warning codes.
     */
    @Generated
    @JsonProperty(value = "code")
    private String code;

    /*
     * A human-readable representation of the warning.
     */
    @Generated
    @JsonProperty(value = "message")
    private String message;

    /*
     * The target of the error.
     */
    @Generated
    @JsonProperty(value = "target")
    private String target;

    /**
     * Creates an instance of Warning class.
     * 
     * @param code the code value to set.
     * @param message the message value to set.
     */
    @Generated
    @JsonCreator
    private Warning(@JsonProperty(value = "code") String code, @JsonProperty(value = "message") String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Get the code property: One of a server-defined set of warning codes.
     * 
     * @return the code value.
     */
    @Generated
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A human-readable representation of the warning.
     * 
     * @return the message value.
     */
    @Generated
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the target property: The target of the error.
     * 
     * @return the target value.
     */
    @Generated
    public String getTarget() {
        return this.target;
    }
}
