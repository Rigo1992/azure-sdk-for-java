// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/**
 * Azure IaaS VM workload-specific job task details.
 */
@Fluent
public final class AzureIaaSvmJobTaskDetails {
    /*
     * The task display name.
     */
    @JsonProperty(value = "taskId")
    private String taskId;

    /*
     * The start time.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * The end time.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * The instanceId.
     */
    @JsonProperty(value = "instanceId")
    private String instanceId;

    /*
     * Time elapsed for task.
     */
    @JsonProperty(value = "duration")
    private Duration duration;

    /*
     * The status.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Progress of the task.
     */
    @JsonProperty(value = "progressPercentage")
    private Double progressPercentage;

    /*
     * Details about execution of the task.
     * eg: number of bytes transferred etc
     */
    @JsonProperty(value = "taskExecutionDetails")
    private String taskExecutionDetails;

    /**
     * Creates an instance of AzureIaaSvmJobTaskDetails class.
     */
    public AzureIaaSvmJobTaskDetails() {
    }

    /**
     * Get the taskId property: The task display name.
     * 
     * @return the taskId value.
     */
    public String taskId() {
        return this.taskId;
    }

    /**
     * Set the taskId property: The task display name.
     * 
     * @param taskId the taskId value to set.
     * @return the AzureIaaSvmJobTaskDetails object itself.
     */
    public AzureIaaSvmJobTaskDetails withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get the startTime property: The start time.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time.
     * 
     * @param startTime the startTime value to set.
     * @return the AzureIaaSvmJobTaskDetails object itself.
     */
    public AzureIaaSvmJobTaskDetails withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time.
     * 
     * @param endTime the endTime value to set.
     * @return the AzureIaaSvmJobTaskDetails object itself.
     */
    public AzureIaaSvmJobTaskDetails withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the instanceId property: The instanceId.
     * 
     * @return the instanceId value.
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Set the instanceId property: The instanceId.
     * 
     * @param instanceId the instanceId value to set.
     * @return the AzureIaaSvmJobTaskDetails object itself.
     */
    public AzureIaaSvmJobTaskDetails withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Get the duration property: Time elapsed for task.
     * 
     * @return the duration value.
     */
    public Duration duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Time elapsed for task.
     * 
     * @param duration the duration value to set.
     * @return the AzureIaaSvmJobTaskDetails object itself.
     */
    public AzureIaaSvmJobTaskDetails withDuration(Duration duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the status property: The status.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The status.
     * 
     * @param status the status value to set.
     * @return the AzureIaaSvmJobTaskDetails object itself.
     */
    public AzureIaaSvmJobTaskDetails withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the progressPercentage property: Progress of the task.
     * 
     * @return the progressPercentage value.
     */
    public Double progressPercentage() {
        return this.progressPercentage;
    }

    /**
     * Set the progressPercentage property: Progress of the task.
     * 
     * @param progressPercentage the progressPercentage value to set.
     * @return the AzureIaaSvmJobTaskDetails object itself.
     */
    public AzureIaaSvmJobTaskDetails withProgressPercentage(Double progressPercentage) {
        this.progressPercentage = progressPercentage;
        return this;
    }

    /**
     * Get the taskExecutionDetails property: Details about execution of the task.
     * eg: number of bytes transferred etc.
     * 
     * @return the taskExecutionDetails value.
     */
    public String taskExecutionDetails() {
        return this.taskExecutionDetails;
    }

    /**
     * Set the taskExecutionDetails property: Details about execution of the task.
     * eg: number of bytes transferred etc.
     * 
     * @param taskExecutionDetails the taskExecutionDetails value to set.
     * @return the AzureIaaSvmJobTaskDetails object itself.
     */
    public AzureIaaSvmJobTaskDetails withTaskExecutionDetails(String taskExecutionDetails) {
        this.taskExecutionDetails = taskExecutionDetails;
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
