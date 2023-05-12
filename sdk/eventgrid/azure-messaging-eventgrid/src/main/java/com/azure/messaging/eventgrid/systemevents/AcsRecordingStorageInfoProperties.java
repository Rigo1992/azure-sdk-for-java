// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Schema for all properties of Recording Storage Information. */
@Fluent
public final class AcsRecordingStorageInfoProperties {
    /*
     * List of details of recording chunks information
     */
    @JsonProperty(value = "recordingChunks")
    private List<AcsRecordingChunkInfoProperties> recordingChunks;

    /** Creates an instance of AcsRecordingStorageInfoProperties class. */
    public AcsRecordingStorageInfoProperties() {}

    /**
     * Get the recordingChunks property: List of details of recording chunks information.
     *
     * @return the recordingChunks value.
     */
    public List<AcsRecordingChunkInfoProperties> getRecordingChunks() {
        return this.recordingChunks;
    }

    /**
     * Set the recordingChunks property: List of details of recording chunks information.
     *
     * @param recordingChunks the recordingChunks value to set.
     * @return the AcsRecordingStorageInfoProperties object itself.
     */
    public AcsRecordingStorageInfoProperties setRecordingChunks(List<AcsRecordingChunkInfoProperties> recordingChunks) {
        this.recordingChunks = recordingChunks;
        return this;
    }
}
