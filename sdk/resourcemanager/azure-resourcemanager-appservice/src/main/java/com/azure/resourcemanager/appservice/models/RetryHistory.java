// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The retry history. */
@Fluent
public final class RetryHistory {
    /*
     * Gets the start time.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * Gets the end time.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * Gets the status code.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * Gets the client request Id.
     */
    @JsonProperty(value = "clientRequestId")
    private String clientRequestId;

    /*
     * Gets the service request Id.
     */
    @JsonProperty(value = "serviceRequestId")
    private String serviceRequestId;

    /*
     * Gets the error response.
     */
    @JsonProperty(value = "error")
    private ManagementError error;

    /** Creates an instance of RetryHistory class. */
    public RetryHistory() {
    }

    /**
     * Get the startTime property: Gets the start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Gets the start time.
     *
     * @param startTime the startTime value to set.
     * @return the RetryHistory object itself.
     */
    public RetryHistory withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: Gets the end time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: Gets the end time.
     *
     * @param endTime the endTime value to set.
     * @return the RetryHistory object itself.
     */
    public RetryHistory withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the code property: Gets the status code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: Gets the status code.
     *
     * @param code the code value to set.
     * @return the RetryHistory object itself.
     */
    public RetryHistory withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the clientRequestId property: Gets the client request Id.
     *
     * @return the clientRequestId value.
     */
    public String clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: Gets the client request Id.
     *
     * @param clientRequestId the clientRequestId value to set.
     * @return the RetryHistory object itself.
     */
    public RetryHistory withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the serviceRequestId property: Gets the service request Id.
     *
     * @return the serviceRequestId value.
     */
    public String serviceRequestId() {
        return this.serviceRequestId;
    }

    /**
     * Set the serviceRequestId property: Gets the service request Id.
     *
     * @param serviceRequestId the serviceRequestId value to set.
     * @return the RetryHistory object itself.
     */
    public RetryHistory withServiceRequestId(String serviceRequestId) {
        this.serviceRequestId = serviceRequestId;
        return this;
    }

    /**
     * Get the error property: Gets the error response.
     *
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Set the error property: Gets the error response.
     *
     * @param error the error value to set.
     * @return the RetryHistory object itself.
     */
    public RetryHistory withError(ManagementError error) {
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
