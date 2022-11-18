// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PlaySourceInternal model. */
@Fluent
public final class PlaySourceInternal {
    /*
     * Defines the type of the play source
     */
    @JsonProperty(value = "sourceType", required = true)
    private PlaySourceTypeInternal sourceType;

    /*
     * Defines the identifier to be used for caching related media
     */
    @JsonProperty(value = "playSourceId")
    private String playSourceId;

    /*
     * Defines the file source info to be used for play
     */
    @JsonProperty(value = "fileSource")
    private FileSourceInternal fileSource;

    /*
     * Defines the text source info to be used for play
     */
    @JsonProperty(value = "textSource")
    private TextSourceInternal textSource;

    /**
     * Get the sourceType property: Defines the type of the play source.
     *
     * @return the sourceType value.
     */
    public PlaySourceTypeInternal getSourceType() {
        return this.sourceType;
    }

    /**
     * Set the sourceType property: Defines the type of the play source.
     *
     * @param sourceType the sourceType value to set.
     * @return the PlaySourceInternal object itself.
     */
    public PlaySourceInternal setSourceType(PlaySourceTypeInternal sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get the playSourceId property: Defines the identifier to be used for caching related media.
     *
     * @return the playSourceId value.
     */
    public String getPlaySourceId() {
        return this.playSourceId;
    }

    /**
     * Set the playSourceId property: Defines the identifier to be used for caching related media.
     *
     * @param playSourceId the playSourceId value to set.
     * @return the PlaySourceInternal object itself.
     */
    public PlaySourceInternal setPlaySourceId(String playSourceId) {
        this.playSourceId = playSourceId;
        return this;
    }

    /**
     * Get the fileSource property: Defines the file source info to be used for play.
     *
     * @return the fileSource value.
     */
    public FileSourceInternal getFileSource() {
        return this.fileSource;
    }

    /**
     * Set the fileSource property: Defines the file source info to be used for play.
     *
     * @param fileSource the fileSource value to set.
     * @return the PlaySourceInternal object itself.
     */
    public PlaySourceInternal setFileSource(FileSourceInternal fileSource) {
        this.fileSource = fileSource;
        return this;
    }

    /**
     * Get the textSource property: Defines the text source info to be used for play.
     *
     * @return the textSource value.
     */
    public TextSourceInternal getTextSource() {
        return this.textSource;
    }

    /**
     * Set the textSource property: Defines the text source info to be used for play.
     *
     * @param textSource the textSource value to set.
     * @return the PlaySourceInternal object itself.
     */
    public PlaySourceInternal setTextSource(TextSourceInternal textSource) {
        this.textSource = textSource;
        return this;
    }
}
