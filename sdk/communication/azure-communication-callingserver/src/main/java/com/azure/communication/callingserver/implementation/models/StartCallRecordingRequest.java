// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request payload start for call recording operation with call locator. */
@Fluent
public final class StartCallRecordingRequest {
    /*
     * The call locator.
     */
    @JsonProperty(value = "callLocator", required = true)
    private CallLocator callLocator;

    /*
     * The uri to send notifications to.
     */
    @JsonProperty(value = "recordingStateCallbackUri")
    private String recordingStateCallbackUri;

    /*
     * The content type of call recording.
     */
    @JsonProperty(value = "recordingContentType")
    private RecordingContent recordingContentType;

    /*
     * The channel type of call recording.
     */
    @JsonProperty(value = "recordingChannelType")
    private RecordingChannel recordingChannelType;

    /*
     * The format type of call recording.
     */
    @JsonProperty(value = "recordingFormatType")
    private RecordingFormat recordingFormatType;

    /**
     * Get the callLocator property: The call locator.
     *
     * @return the callLocator value.
     */
    public CallLocator getCallLocator() {
        return this.callLocator;
    }

    /**
     * Set the callLocator property: The call locator.
     *
     * @param callLocator the callLocator value to set.
     * @return the StartCallRecordingRequest object itself.
     */
    public StartCallRecordingRequest setCallLocator(CallLocator callLocator) {
        this.callLocator = callLocator;
        return this;
    }

    /**
     * Get the recordingStateCallbackUri property: The uri to send notifications to.
     *
     * @return the recordingStateCallbackUri value.
     */
    public String getRecordingStateCallbackUri() {
        return this.recordingStateCallbackUri;
    }

    /**
     * Set the recordingStateCallbackUri property: The uri to send notifications to.
     *
     * @param recordingStateCallbackUri the recordingStateCallbackUri value to set.
     * @return the StartCallRecordingRequest object itself.
     */
    public StartCallRecordingRequest setRecordingStateCallbackUri(String recordingStateCallbackUri) {
        this.recordingStateCallbackUri = recordingStateCallbackUri;
        return this;
    }

    /**
     * Get the recordingContentType property: The content type of call recording.
     *
     * @return the recordingContentType value.
     */
    public RecordingContent getRecordingContentType() {
        return this.recordingContentType;
    }

    /**
     * Set the recordingContentType property: The content type of call recording.
     *
     * @param recordingContentType the recordingContentType value to set.
     * @return the StartCallRecordingRequest object itself.
     */
    public StartCallRecordingRequest setRecordingContentType(RecordingContent recordingContentType) {
        this.recordingContentType = recordingContentType;
        return this;
    }

    /**
     * Get the recordingChannelType property: The channel type of call recording.
     *
     * @return the recordingChannelType value.
     */
    public RecordingChannel getRecordingChannelType() {
        return this.recordingChannelType;
    }

    /**
     * Set the recordingChannelType property: The channel type of call recording.
     *
     * @param recordingChannelType the recordingChannelType value to set.
     * @return the StartCallRecordingRequest object itself.
     */
    public StartCallRecordingRequest setRecordingChannelType(RecordingChannel recordingChannelType) {
        this.recordingChannelType = recordingChannelType;
        return this;
    }

    /**
     * Get the recordingFormatType property: The format type of call recording.
     *
     * @return the recordingFormatType value.
     */
    public RecordingFormat getRecordingFormatType() {
        return this.recordingFormatType;
    }

    /**
     * Set the recordingFormatType property: The format type of call recording.
     *
     * @param recordingFormatType the recordingFormatType value to set.
     * @return the StartCallRecordingRequest object itself.
     */
    public StartCallRecordingRequest setRecordingFormatType(RecordingFormat recordingFormatType) {
        this.recordingFormatType = recordingFormatType;
        return this;
    }
}
