// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A range of exit codes and how the Batch service should respond to exit codes within that range. */
@Immutable
public final class ExitCodeRangeMapping {

    /*
     * The first exit code in the range.
     */
    @Generated
    @JsonProperty(value = "start")
    private int start;

    /*
     * The last exit code in the range.
     */
    @Generated
    @JsonProperty(value = "end")
    private int end;

    /*
     * How the Batch service should respond if the Task exits with an exit code in the range start to end (inclusive).
     */
    @Generated
    @JsonProperty(value = "exitOptions")
    private ExitOptions exitOptions;

    /**
     * Creates an instance of ExitCodeRangeMapping class.
     *
     * @param start the start value to set.
     * @param end the end value to set.
     * @param exitOptions the exitOptions value to set.
     */
    @Generated
    @JsonCreator
    public ExitCodeRangeMapping(
            @JsonProperty(value = "start") int start,
            @JsonProperty(value = "end") int end,
            @JsonProperty(value = "exitOptions") ExitOptions exitOptions) {
        this.start = start;
        this.end = end;
        this.exitOptions = exitOptions;
    }

    /**
     * Get the start property: The first exit code in the range.
     *
     * @return the start value.
     */
    @Generated
    public int getStart() {
        return this.start;
    }

    /**
     * Get the end property: The last exit code in the range.
     *
     * @return the end value.
     */
    @Generated
    public int getEnd() {
        return this.end;
    }

    /**
     * Get the exitOptions property: How the Batch service should respond if the Task exits with an exit code in the
     * range start to end (inclusive).
     *
     * @return the exitOptions value.
     */
    @Generated
    public ExitOptions getExitOptions() {
        return this.exitOptions;
    }
}
