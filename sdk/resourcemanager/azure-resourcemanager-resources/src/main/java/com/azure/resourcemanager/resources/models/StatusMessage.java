// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operation status message object.
 */
@Fluent
public final class StatusMessage {
    /*
     * Status of the deployment operation.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Error Response
     * 
     * The error reported by the operation.
     */
    @JsonProperty(value = "error")
    private ManagementError error;

    /**
     * Creates an instance of StatusMessage class.
     */
    public StatusMessage() {
    }

    /**
     * Get the status property: Status of the deployment operation.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the deployment operation.
     * 
     * @param status the status value to set.
     * @return the StatusMessage object itself.
     */
    public StatusMessage withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the error property: Error Response
     * 
     * The error reported by the operation.
     * 
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Set the error property: Error Response
     * 
     * The error reported by the operation.
     * 
     * @param error the error value to set.
     * @return the StatusMessage object itself.
     */
    public StatusMessage withError(ManagementError error) {
        this.error = error;
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
