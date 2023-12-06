// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Assignment details of a job to a worker.
 */
@Immutable
public final class RouterJobAssignment {

    /*
     * Id of a job assignment.
     */
    @Generated
    @JsonProperty(value = "assignmentId", access = JsonProperty.Access.WRITE_ONLY)
    private String assignmentId;

    /*
     * Id of the Worker assigned to the job.
     */
    @Generated
    @JsonProperty(value = "workerId")
    private String workerId;

    /*
     * Timestamp when the job was assigned to a worker in UTC.
     */
    @Generated
    @JsonProperty(value = "assignedAt")
    private OffsetDateTime assignedAt;

    /*
     * Timestamp when the job was marked as completed after being assigned in UTC.
     */
    @Generated
    @JsonProperty(value = "completedAt")
    private OffsetDateTime completedAt;

    /*
     * Timestamp when the job was marked as closed after being completed in UTC.
     */
    @Generated
    @JsonProperty(value = "closedAt")
    private OffsetDateTime closedAt;

    /**
     * Get the assignmentId property: Id of a job assignment.
     *
     * @return the assignmentId value.
     */
    @Generated
    public String getAssignmentId() {
        return this.assignmentId;
    }

    /**
     * Get the workerId property: Id of the Worker assigned to the job.
     *
     * @return the workerId value.
     */
    @Generated
    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * Get the assignedAt property: Timestamp when the job was assigned to a worker in UTC.
     *
     * @return the assignedAt value.
     */
    @Generated
    public OffsetDateTime getAssignedAt() {
        return this.assignedAt;
    }

    /**
     * Get the completedAt property: Timestamp when the job was marked as completed after being assigned in UTC.
     *
     * @return the completedAt value.
     */
    @Generated
    public OffsetDateTime getCompletedAt() {
        return this.completedAt;
    }

    /**
     * Get the closedAt property: Timestamp when the job was marked as closed after being completed in UTC.
     *
     * @return the closedAt value.
     */
    @Generated
    public OffsetDateTime getClosedAt() {
        return this.closedAt;
    }

    /**
     * Creates an instance of RouterJobAssignment class.
     *
     * @param assignedAt the assignedAt value to set.
     */
    @Generated
    @JsonCreator
    private RouterJobAssignment(@JsonProperty(value = "assignedAt") OffsetDateTime assignedAt) {
        this.assignedAt = assignedAt;
    }
}
