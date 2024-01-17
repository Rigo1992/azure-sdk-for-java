// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * A time range.
 *
 * For example, between 2021-05-25T13:00:00Z and 2021-05-25T14:00:00Z.
 */
@Fluent
public final class TimeSpan {
    /*
     * The start of a time span
     */
    @JsonProperty(value = "start")
    private OffsetDateTime start;

    /*
     * The end of a time span
     */
    @JsonProperty(value = "end")
    private OffsetDateTime end;

    /**
     * Creates an instance of TimeSpan class.
     */
    public TimeSpan() {
    }

    /**
     * Get the start property: The start of a time span.
     *
     * @return the start value.
     */
    public OffsetDateTime start() {
        return this.start;
    }

    /**
     * Set the start property: The start of a time span.
     *
     * @param start the start value to set.
     * @return the TimeSpan object itself.
     */
    public TimeSpan withStart(OffsetDateTime start) {
        this.start = start;
        return this;
    }

    /**
     * Get the end property: The end of a time span.
     *
     * @return the end value.
     */
    public OffsetDateTime end() {
        return this.end;
    }

    /**
     * Set the end property: The end of a time span.
     *
     * @param end the end value to set.
     * @return the TimeSpan object itself.
     */
    public TimeSpan withEnd(OffsetDateTime end) {
        this.end = end;
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
