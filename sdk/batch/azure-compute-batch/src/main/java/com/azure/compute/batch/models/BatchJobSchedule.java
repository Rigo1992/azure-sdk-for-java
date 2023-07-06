// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * A Job Schedule that allows recurring Jobs by specifying when to run Jobs and a specification used to create each Job.
 */
@Fluent
public final class BatchJobSchedule {

    /*
     * A string that uniquely identifies the schedule within the Account.
     */
    @Generated
    @JsonProperty(value = "id")
    private String id;

    /*
     * The display name for the schedule.
     */
    @Generated
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The URL of the Job Schedule.
     */
    @Generated
    @JsonProperty(value = "url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /*
     * This is an opaque string. You can use it to detect whether the Job Schedule has
     * changed between requests. In particular, you can be pass the ETag with an
     * Update Job Schedule request to specify that your changes should take effect
     * only if nobody else has modified the schedule in the meantime.
     */
    @Generated
    @JsonProperty(value = "eTag", access = JsonProperty.Access.WRITE_ONLY)
    private String eTag;

    /*
     * This is the last time at which the schedule level data, such as the Job
     * specification or recurrence information, changed. It does not factor in
     * job-level changes such as new Jobs being created or Jobs changing state.
     */
    @Generated
    @JsonProperty(value = "lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /*
     * The creation time of the Job Schedule.
     */
    @Generated
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * The state of the Job Schedule.
     */
    @Generated
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private JobScheduleState state;

    /*
     * The time at which the Job Schedule entered the current state.
     */
    @Generated
    @JsonProperty(value = "stateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime stateTransitionTime;

    /*
     * This property is not present if the Job Schedule is in its initial active state.
     */
    @Generated
    @JsonProperty(value = "previousState", access = JsonProperty.Access.WRITE_ONLY)
    private JobScheduleState previousState;

    /*
     * This property is not present if the Job Schedule is in its initial active state.
     */
    @Generated
    @JsonProperty(value = "previousStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime previousStateTransitionTime;

    /*
     * All times are fixed respective to UTC and are not impacted by daylight saving
     * time.
     */
    @Generated
    @JsonProperty(value = "schedule")
    private Schedule schedule;

    /*
     * Specifies details of the Jobs to be created on a schedule.
     */
    @Generated
    @JsonProperty(value = "jobSpecification")
    private JobSpecification jobSpecification;

    /*
     * Contains information about Jobs that have been and will be run under a Job
     * Schedule.
     */
    @Generated
    @JsonProperty(value = "executionInfo", access = JsonProperty.Access.WRITE_ONLY)
    private JobScheduleExecutionInformation executionInfo;

    /*
     * The Batch service does not assign any meaning to metadata; it is solely for the
     * use of user code.
     */
    @Generated
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /*
     * Resource usage statistics for a Job Schedule.
     */
    @Generated
    @JsonProperty(value = "stats", access = JsonProperty.Access.WRITE_ONLY)
    private JobScheduleStatistics stats;

    /** Creates an instance of BatchJobSchedule class. */
    @Generated
    public BatchJobSchedule() {}

    /**
     * Get the id property: A string that uniquely identifies the schedule within the Account.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: A string that uniquely identifies the schedule within the Account.
     *
     * @param id the id value to set.
     * @return the BatchJobSchedule object itself.
     */
    @Generated
    public BatchJobSchedule setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the displayName property: The display name for the schedule.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for the schedule.
     *
     * @param displayName the displayName value to set.
     * @return the BatchJobSchedule object itself.
     */
    @Generated
    public BatchJobSchedule setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the url property: The URL of the Job Schedule.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the eTag property: This is an opaque string. You can use it to detect whether the Job Schedule has changed
     * between requests. In particular, you can be pass the ETag with an Update Job Schedule request to specify that
     * your changes should take effect only if nobody else has modified the schedule in the meantime.
     *
     * @return the eTag value.
     */
    @Generated
    public String getETag() {
        return this.eTag;
    }

    /**
     * Get the lastModified property: This is the last time at which the schedule level data, such as the Job
     * specification or recurrence information, changed. It does not factor in job-level changes such as new Jobs being
     * created or Jobs changing state.
     *
     * @return the lastModified value.
     */
    @Generated
    public OffsetDateTime getLastModified() {
        return this.lastModified;
    }

    /**
     * Get the creationTime property: The creation time of the Job Schedule.
     *
     * @return the creationTime value.
     */
    @Generated
    public OffsetDateTime getCreationTime() {
        return this.creationTime;
    }

    /**
     * Get the state property: The state of the Job Schedule.
     *
     * @return the state value.
     */
    @Generated
    public JobScheduleState getState() {
        return this.state;
    }

    /**
     * Get the stateTransitionTime property: The time at which the Job Schedule entered the current state.
     *
     * @return the stateTransitionTime value.
     */
    @Generated
    public OffsetDateTime getStateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Get the previousState property: This property is not present if the Job Schedule is in its initial active state.
     *
     * @return the previousState value.
     */
    @Generated
    public JobScheduleState getPreviousState() {
        return this.previousState;
    }

    /**
     * Get the previousStateTransitionTime property: This property is not present if the Job Schedule is in its initial
     * active state.
     *
     * @return the previousStateTransitionTime value.
     */
    @Generated
    public OffsetDateTime getPreviousStateTransitionTime() {
        return this.previousStateTransitionTime;
    }

    /**
     * Get the schedule property: All times are fixed respective to UTC and are not impacted by daylight saving time.
     *
     * @return the schedule value.
     */
    @Generated
    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: All times are fixed respective to UTC and are not impacted by daylight saving time.
     *
     * @param schedule the schedule value to set.
     * @return the BatchJobSchedule object itself.
     */
    @Generated
    public BatchJobSchedule setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the jobSpecification property: Specifies details of the Jobs to be created on a schedule.
     *
     * @return the jobSpecification value.
     */
    @Generated
    public JobSpecification getJobSpecification() {
        return this.jobSpecification;
    }

    /**
     * Set the jobSpecification property: Specifies details of the Jobs to be created on a schedule.
     *
     * @param jobSpecification the jobSpecification value to set.
     * @return the BatchJobSchedule object itself.
     */
    @Generated
    public BatchJobSchedule setJobSpecification(JobSpecification jobSpecification) {
        this.jobSpecification = jobSpecification;
        return this;
    }

    /**
     * Get the executionInfo property: Contains information about Jobs that have been and will be run under a Job
     * Schedule.
     *
     * @return the executionInfo value.
     */
    @Generated
    public JobScheduleExecutionInformation getExecutionInfo() {
        return this.executionInfo;
    }

    /**
     * Get the metadata property: The Batch service does not assign any meaning to metadata; it is solely for the use of
     * user code.
     *
     * @return the metadata value.
     */
    @Generated
    public List<MetadataItem> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The Batch service does not assign any meaning to metadata; it is solely for the use of
     * user code.
     *
     * @param metadata the metadata value to set.
     * @return the BatchJobSchedule object itself.
     */
    @Generated
    public BatchJobSchedule setMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the stats property: Resource usage statistics for a Job Schedule.
     *
     * @return the stats value.
     */
    @Generated
    public JobScheduleStatistics getStats() {
        return this.stats;
    }
}
