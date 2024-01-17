// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Output of the validate probe API. */
@Immutable
public final class ValidateProbeOutputInner {
    /*
     * Indicates whether the probe URL is accepted or not.
     */
    @JsonProperty(value = "isValid", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isValid;

    /*
     * Specifies the error code when the probe url is not accepted.
     */
    @JsonProperty(value = "errorCode", access = JsonProperty.Access.WRITE_ONLY)
    private String errorCode;

    /*
     * The detailed error message describing why the probe URL is not accepted.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /** Creates an instance of ValidateProbeOutputInner class. */
    public ValidateProbeOutputInner() {
    }

    /**
     * Get the isValid property: Indicates whether the probe URL is accepted or not.
     *
     * @return the isValid value.
     */
    public Boolean isValid() {
        return this.isValid;
    }

    /**
     * Get the errorCode property: Specifies the error code when the probe url is not accepted.
     *
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Get the message property: The detailed error message describing why the probe URL is not accepted.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
