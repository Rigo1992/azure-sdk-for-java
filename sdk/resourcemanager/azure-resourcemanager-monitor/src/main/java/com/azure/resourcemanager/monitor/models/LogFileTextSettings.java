// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings for text log files.
 */
@Fluent
public class LogFileTextSettings {
    /*
     * One of the supported timestamp formats
     */
    @JsonProperty(value = "recordStartTimestampFormat", required = true)
    private KnownLogFileTextSettingsRecordStartTimestampFormat recordStartTimestampFormat;

    /**
     * Creates an instance of LogFileTextSettings class.
     */
    public LogFileTextSettings() {
    }

    /**
     * Get the recordStartTimestampFormat property: One of the supported timestamp formats.
     * 
     * @return the recordStartTimestampFormat value.
     */
    public KnownLogFileTextSettingsRecordStartTimestampFormat recordStartTimestampFormat() {
        return this.recordStartTimestampFormat;
    }

    /**
     * Set the recordStartTimestampFormat property: One of the supported timestamp formats.
     * 
     * @param recordStartTimestampFormat the recordStartTimestampFormat value to set.
     * @return the LogFileTextSettings object itself.
     */
    public LogFileTextSettings
        withRecordStartTimestampFormat(KnownLogFileTextSettingsRecordStartTimestampFormat recordStartTimestampFormat) {
        this.recordStartTimestampFormat = recordStartTimestampFormat;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (recordStartTimestampFormat() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property recordStartTimestampFormat in model LogFileTextSettings"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LogFileTextSettings.class);
}
