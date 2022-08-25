// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.models;

import com.azure.communication.common.CommunicationIdentifier;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Channel affinity for a participant. */
@Fluent
public final class ChannelAffinity {
    /*
     * Channel number to which bitstream from a particular participant will be
     * written.
     */
    @JsonProperty(value = "channel")
    private final Integer channel;

    /*
     * The identifier for the participant whose bitstream will be written to
     * the channel
     * represented by the channel number.
     */
    @JsonProperty(value = "participant")
    private final CommunicationIdentifier participant;

    /**
     * Constructor
     *
     * @param channel Either a {@link GroupCallLocator} or {@link ServerCallLocator} for locating the call.
     * @param participant Either a {@link GroupCallLocator} or {@link ServerCallLocator} for locating the call.
     */
    public ChannelAffinity(Integer channel, CommunicationIdentifier participant) {
        this.channel = channel;
        this.participant = participant;
    }

    /**
     * Get the channel property: Channel number to which bitstream from a particular participant will be written.
     *
     * @return the channel value.
     */
    public Integer getChannel() {
        return this.channel;
    }

    /**
     * Get the participant property: The identifier for the participant whose bitstream will be written to the channel
     * represented by the channel number.
     *
     * @return the participant value.
     */
    public CommunicationIdentifier getParticipant() {
        return this.participant;
    }
}
