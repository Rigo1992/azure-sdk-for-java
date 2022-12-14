// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.maps.search.implementation.models.OperatingHoursTime;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

/** Open time range for a day. */
@Fluent
public final class OperatingHoursTimeRange {
    /*
     * The point in the next 7 days range when a given POI is being opened, or the beginning of the range if it was
     * opened before the range.
     */
    @JsonProperty(value = "startTime")
    private OperatingHoursTime startTime;

    /*
     * The point in the next 7 days range when a given POI is being closed, or the beginning of the range if it was
     * closed before the range.
     */
    @JsonProperty(value = "endTime")
    private OperatingHoursTime endTime;

    /** Creates an instance of OperatingHoursTimeRange class. */
    @JsonCreator
    private OperatingHoursTimeRange() {}

    /**
     * OperatingHoursTimeRange constructor
     *
     * @param startTime The point in the next 7 days range when a given POI is being opened, or the beginning of the
     *     range if it was opened before the range.
     * @param endTime The point in the next 7 days range when a given POI is being closed, or the beginning of the range
     *     if it was closed before the range.
     */
    public OperatingHoursTimeRange(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime =
                new OperatingHoursTime(startTime.toLocalDate().toString(), startTime.getHour(), startTime.getMinute());
        this.endTime = new OperatingHoursTime(endTime.toLocalDate().toString(), endTime.getHour(), endTime.getMinute());
    }

    /**
     * Get the startTime property: The point in the next 7 days range when a given POI is being opened, or the beginning
     * of the range if it was opened before the range.
     *
     * @return the startTime value
     */
    public LocalDateTime getStartTime() {
        String[] date = this.startTime.toString().split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return LocalDateTime.of(year, month, day, this.startTime.getHour(), this.startTime.getMinute());
    }

    /**
     * Get the endTime property: The point in the next 7 days range when a given POI is being closed, or the beginning
     * of the range if it was closed before the range
     *
     * @return the endTime value.
     */
    public LocalDateTime getEndTime() {
        String[] date = this.endTime.toString().split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return LocalDateTime.of(year, month, day, this.endTime.getHour(), this.endTime.getMinute());
    }

    /**
     * Set the startTime property: The point in the next 7 days range when a given POI is being opened, or the beginning
     * of the range if it was opened before the range
     *
     * @param startTime the startTime value to set.
     * @return the OperatingHoursTimeRange object itself.
     */
    public OperatingHoursTimeRange setStartTime(LocalDateTime startTime) {
        this.startTime =
                new OperatingHoursTime(startTime.toLocalDate().toString(), startTime.getHour(), startTime.getMinute());
        return this;
    }

    /**
     * Set the endTime property: The point in the next 7 days range when a given POI is being closed, or the beginning
     * of the range if it was closed before the range.
     *
     * @param endTime the endTime value to set
     * @return the OperatingHoursTimeRange object itself
     */
    public OperatingHoursTimeRange setEndTime(LocalDateTime endTime) {
        this.endTime = new OperatingHoursTime(endTime.toLocalDate().toString(), endTime.getHour(), endTime.getMinute());
        return this;
    }
}
