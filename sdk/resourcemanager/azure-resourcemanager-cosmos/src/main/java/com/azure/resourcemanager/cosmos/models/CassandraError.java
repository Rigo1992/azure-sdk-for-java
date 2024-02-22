// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CassandraError model.
 */
@Fluent
public final class CassandraError {
    /*
     * The code of error that occurred.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The message of the error.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The target resource of the error.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * Additional information about the error.
     */
    @JsonProperty(value = "additionalErrorInfo")
    private String additionalErrorInfo;

    /**
     * Creates an instance of CassandraError class.
     */
    public CassandraError() {
    }

    /**
     * Get the code property: The code of error that occurred.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The code of error that occurred.
     * 
     * @param code the code value to set.
     * @return the CassandraError object itself.
     */
    public CassandraError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The message of the error.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The message of the error.
     * 
     * @param message the message value to set.
     * @return the CassandraError object itself.
     */
    public CassandraError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target property: The target resource of the error.
     * 
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The target resource of the error.
     * 
     * @param target the target value to set.
     * @return the CassandraError object itself.
     */
    public CassandraError withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the additionalErrorInfo property: Additional information about the error.
     * 
     * @return the additionalErrorInfo value.
     */
    public String additionalErrorInfo() {
        return this.additionalErrorInfo;
    }

    /**
     * Set the additionalErrorInfo property: Additional information about the error.
     * 
     * @param additionalErrorInfo the additionalErrorInfo value to set.
     * @return the CassandraError object itself.
     */
    public CassandraError withAdditionalErrorInfo(String additionalErrorInfo) {
        this.additionalErrorInfo = additionalErrorInfo;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
