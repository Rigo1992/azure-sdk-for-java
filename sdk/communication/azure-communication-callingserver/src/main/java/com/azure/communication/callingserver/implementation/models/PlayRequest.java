// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PlayRequest model. */
@Fluent
public final class PlayRequest {
    /*
     * The source of the audio to be played.
     */
    @JsonProperty(value = "playSourceInfo", required = true)
    private PlaySource playSourceInfo;

    /*
     * The list of call participants play provided audio to.
     * Plays to everyone in the call when not provided.
     */
    @JsonProperty(value = "playTo", required = true)
    private List<CommunicationIdentifierModel> playTo;

    /*
     * Defines options for playing the audio.
     */
    @JsonProperty(value = "playOptions")
    private PlayOptions playOptions;

    /**
     * Get the playSourceInfo property: The source of the audio to be played.
     *
     * @return the playSourceInfo value.
     */
    public PlaySource getPlaySourceInfo() {
        return this.playSourceInfo;
    }

    /**
     * Set the playSourceInfo property: The source of the audio to be played.
     *
     * @param playSourceInfo the playSourceInfo value to set.
     * @return the PlayRequest object itself.
     */
    public PlayRequest setPlaySourceInfo(PlaySource playSourceInfo) {
        this.playSourceInfo = playSourceInfo;
        return this;
    }

    /**
     * Get the playTo property: The list of call participants play provided audio to. Plays to everyone in the call when
     * not provided.
     *
     * @return the playTo value.
     */
    public List<CommunicationIdentifierModel> getPlayTo() {
        return this.playTo;
    }

    /**
     * Set the playTo property: The list of call participants play provided audio to. Plays to everyone in the call when
     * not provided.
     *
     * @param playTo the playTo value to set.
     * @return the PlayRequest object itself.
     */
    public PlayRequest setPlayTo(List<CommunicationIdentifierModel> playTo) {
        this.playTo = playTo;
        return this;
    }

    /**
     * Get the playOptions property: Defines options for playing the audio.
     *
     * @return the playOptions value.
     */
    public PlayOptions getPlayOptions() {
        return this.playOptions;
    }

    /**
     * Set the playOptions property: Defines options for playing the audio.
     *
     * @param playOptions the playOptions value to set.
     * @return the PlayRequest object itself.
     */
    public PlayRequest setPlayOptions(PlayOptions playOptions) {
        this.playOptions = playOptions;
        return this;
    }
}
