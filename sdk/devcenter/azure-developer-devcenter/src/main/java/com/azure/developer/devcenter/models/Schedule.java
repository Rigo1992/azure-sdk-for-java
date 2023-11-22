// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.devcenter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Schedule to execute action.
 */
@Immutable
public final class Schedule {
    /*
     * Display name for the Schedule
     */
    @Generated
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Supported type this scheduled task represents.
     */
    @Generated
    @JsonProperty(value = "type")
    private ScheduledType type;

    /*
     * The frequency of this scheduled task.
     */
    @Generated
    @JsonProperty(value = "frequency")
    private ScheduledFrequency frequency;

    /*
     * The target time to trigger the action. The format is HH:MM.
     */
    @Generated
    @JsonProperty(value = "time")
    private String time;

    /*
     * The IANA timezone id at which the schedule should execute.
     */
    @Generated
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /**
     * Creates an instance of Schedule class.
     * 
     * @param type the type value to set.
     * @param frequency the frequency value to set.
     * @param time the time value to set.
     * @param timeZone the timeZone value to set.
     */
    @Generated
    @JsonCreator
    private Schedule(@JsonProperty(value = "type") ScheduledType type,
        @JsonProperty(value = "frequency") ScheduledFrequency frequency, @JsonProperty(value = "time") String time,
        @JsonProperty(value = "timeZone") String timeZone) {
        this.type = type;
        this.frequency = frequency;
        this.time = time;
        this.timeZone = timeZone;
    }

    /**
     * Get the name property: Display name for the Schedule.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the type property: Supported type this scheduled task represents.
     * 
     * @return the type value.
     */
    @Generated
    public ScheduledType getType() {
        return this.type;
    }

    /**
     * Get the frequency property: The frequency of this scheduled task.
     * 
     * @return the frequency value.
     */
    @Generated
    public ScheduledFrequency getFrequency() {
        return this.frequency;
    }

    /**
     * Get the time property: The target time to trigger the action. The format is HH:MM.
     * 
     * @return the time value.
     */
    @Generated
    public String getTime() {
        return this.time;
    }

    /**
     * Get the timeZone property: The IANA timezone id at which the schedule should execute.
     * 
     * @return the timeZone value.
     */
    @Generated
    public String getTimeZone() {
        return this.timeZone;
    }
}
