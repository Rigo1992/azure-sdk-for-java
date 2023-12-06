// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The recurrence schedule.
 */
@Fluent
public final class RecurrenceSchedule {
    /*
     * The minutes.
     */
    @JsonProperty(value = "minutes")
    private List<Integer> minutes;

    /*
     * The hours.
     */
    @JsonProperty(value = "hours")
    private List<Integer> hours;

    /*
     * The days of the week.
     */
    @JsonProperty(value = "weekDays")
    private List<DaysOfWeek> weekDays;

    /*
     * The month days.
     */
    @JsonProperty(value = "monthDays")
    private List<Integer> monthDays;

    /*
     * The monthly occurrences.
     */
    @JsonProperty(value = "monthlyOccurrences")
    private List<RecurrenceScheduleOccurrence> monthlyOccurrences;

    /**
     * Creates an instance of RecurrenceSchedule class.
     */
    public RecurrenceSchedule() {
    }

    /**
     * Get the minutes property: The minutes.
     * 
     * @return the minutes value.
     */
    public List<Integer> minutes() {
        return this.minutes;
    }

    /**
     * Set the minutes property: The minutes.
     * 
     * @param minutes the minutes value to set.
     * @return the RecurrenceSchedule object itself.
     */
    public RecurrenceSchedule withMinutes(List<Integer> minutes) {
        this.minutes = minutes;
        return this;
    }

    /**
     * Get the hours property: The hours.
     * 
     * @return the hours value.
     */
    public List<Integer> hours() {
        return this.hours;
    }

    /**
     * Set the hours property: The hours.
     * 
     * @param hours the hours value to set.
     * @return the RecurrenceSchedule object itself.
     */
    public RecurrenceSchedule withHours(List<Integer> hours) {
        this.hours = hours;
        return this;
    }

    /**
     * Get the weekDays property: The days of the week.
     * 
     * @return the weekDays value.
     */
    public List<DaysOfWeek> weekDays() {
        return this.weekDays;
    }

    /**
     * Set the weekDays property: The days of the week.
     * 
     * @param weekDays the weekDays value to set.
     * @return the RecurrenceSchedule object itself.
     */
    public RecurrenceSchedule withWeekDays(List<DaysOfWeek> weekDays) {
        this.weekDays = weekDays;
        return this;
    }

    /**
     * Get the monthDays property: The month days.
     * 
     * @return the monthDays value.
     */
    public List<Integer> monthDays() {
        return this.monthDays;
    }

    /**
     * Set the monthDays property: The month days.
     * 
     * @param monthDays the monthDays value to set.
     * @return the RecurrenceSchedule object itself.
     */
    public RecurrenceSchedule withMonthDays(List<Integer> monthDays) {
        this.monthDays = monthDays;
        return this;
    }

    /**
     * Get the monthlyOccurrences property: The monthly occurrences.
     * 
     * @return the monthlyOccurrences value.
     */
    public List<RecurrenceScheduleOccurrence> monthlyOccurrences() {
        return this.monthlyOccurrences;
    }

    /**
     * Set the monthlyOccurrences property: The monthly occurrences.
     * 
     * @param monthlyOccurrences the monthlyOccurrences value to set.
     * @return the RecurrenceSchedule object itself.
     */
    public RecurrenceSchedule withMonthlyOccurrences(List<RecurrenceScheduleOccurrence> monthlyOccurrences) {
        this.monthlyOccurrences = monthlyOccurrences;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (monthlyOccurrences() != null) {
            monthlyOccurrences().forEach(e -> e.validate());
        }
    }
}
