// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Options for continuous speech recognition. */
@Fluent
public final class SpeechOptions {
    /*
     * The length of end silence when user stops speaking and cogservice send
     * response.
     */
    @JsonProperty(value = "endSilenceTimeoutInMs")
    private Long endSilenceTimeoutInMs;

    /**
     * Get the endSilenceTimeoutInMs property: The length of end silence when user stops speaking and cogservice send
     * response.
     *
     * @return the endSilenceTimeoutInMs value.
     */
    public Long getEndSilenceTimeoutInMs() {
        return this.endSilenceTimeoutInMs;
    }

    /**
     * Set the endSilenceTimeoutInMs property: The length of end silence when user stops speaking and cogservice send
     * response.
     *
     * @param endSilenceTimeoutInMs the endSilenceTimeoutInMs value to set.
     * @return the SpeechOptions object itself.
     */
    public SpeechOptions setEndSilenceTimeoutInMs(Long endSilenceTimeoutInMs) {
        this.endSilenceTimeoutInMs = endSilenceTimeoutInMs;
        return this;
    }
}
