// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The information about the tone. */
@Fluent
public final class ToneInfo {
    /*
     * The sequence id which can be used to determine if the same tone was
     * played multiple times or if any tones were missed.
     */
    @JsonProperty(value = "sequenceId", required = true)
    private int sequenceId;

    /*
     * The tone property.
     */
    @JsonProperty(value = "tone", required = true)
    private DtmfToneInternal tone;

    /*
     * The id of participant.
     */
    @JsonProperty(value = "participantId", required = true)
    private String participantId;

    /**
     * Get the sequenceId property: The sequence id which can be used to determine if the same tone was played multiple
     * times or if any tones were missed.
     *
     * @return the sequenceId value.
     */
    public int getSequenceId() {
        return this.sequenceId;
    }

    /**
     * Set the sequenceId property: The sequence id which can be used to determine if the same tone was played multiple
     * times or if any tones were missed.
     *
     * @param sequenceId the sequenceId value to set.
     * @return the ToneInfo object itself.
     */
    public ToneInfo setSequenceId(int sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }

    /**
     * Get the tone property: The tone property.
     *
     * @return the tone value.
     */
    public DtmfToneInternal getTone() {
        return this.tone;
    }

    /**
     * Set the tone property: The tone property.
     *
     * @param tone the tone value to set.
     * @return the ToneInfo object itself.
     */
    public ToneInfo setTone(DtmfToneInternal tone) {
        this.tone = tone;
        return this;
    }

    /**
     * Get the participantId property: The id of participant.
     *
     * @return the participantId value.
     */
    public String getParticipantId() {
        return this.participantId;
    }

    /**
     * Set the participantId property: The id of participant.
     *
     * @param participantId the participantId value to set.
     * @return the ToneInfo object itself.
     */
    public ToneInfo setParticipantId(String participantId) {
        this.participantId = participantId;
        return this;
    }
}
