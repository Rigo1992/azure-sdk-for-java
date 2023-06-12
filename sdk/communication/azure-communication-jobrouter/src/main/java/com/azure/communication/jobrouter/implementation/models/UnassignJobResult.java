// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response payload after a job has been successfully unassigned. */
@Immutable
public final class UnassignJobResult {
    /*
     * The Id of the job unassigned.
     */
    @JsonProperty(value = "jobId", required = true)
    private String jobId;

    /*
     * The number of times a job is unassigned. At a maximum 3.
     */
    @JsonProperty(value = "unassignmentCount", required = true)
    private int unassignmentCount;

    /**
     * Creates an instance of UnassignJobResult class.
     *
     * @param jobId the jobId value to set.
     * @param unassignmentCount the unassignmentCount value to set.
     */
    @JsonCreator
    public UnassignJobResult(
            @JsonProperty(value = "jobId", required = true) String jobId,
            @JsonProperty(value = "unassignmentCount", required = true) int unassignmentCount) {
        this.jobId = jobId;
        this.unassignmentCount = unassignmentCount;
    }

    /**
     * Get the jobId property: The Id of the job unassigned.
     *
     * @return the jobId value.
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Get the unassignmentCount property: The number of times a job is unassigned. At a maximum 3.
     *
     * @return the unassignmentCount value.
     */
    public int getUnassignmentCount() {
        return this.unassignmentCount;
    }
}
