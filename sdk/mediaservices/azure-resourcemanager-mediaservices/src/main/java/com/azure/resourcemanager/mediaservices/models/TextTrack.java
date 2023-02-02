// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a text track in an asset. A text track is usually used for sparse data related to the audio or video
 * tracks.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.TextTrack")
@Fluent
public final class TextTrack extends TrackBase {
    /*
     * The file name to the source file. This file is located in the storage container of the asset.
     */
    @JsonProperty(value = "fileName")
    private String fileName;

    /*
     * The display name of the text track on a video player. In HLS, this maps to the NAME attribute of EXT-X-MEDIA.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The RFC5646 language code for the text track.
     */
    @JsonProperty(value = "languageCode", access = JsonProperty.Access.WRITE_ONLY)
    private String languageCode;

    /*
     * When PlayerVisibility is set to "Visible", the text track will be present in the DASH manifest or HLS playlist
     * when requested by a client. When the PlayerVisibility is set to "Hidden", the text will not be available to the
     * client. The default value is "Visible".
     */
    @JsonProperty(value = "playerVisibility")
    private Visibility playerVisibility;

    /*
     * The HLS specific setting for the text track.
     */
    @JsonProperty(value = "hlsSettings")
    private HlsSettings hlsSettings;

    /** Creates an instance of TextTrack class. */
    public TextTrack() {
    }

    /**
     * Get the fileName property: The file name to the source file. This file is located in the storage container of the
     * asset.
     *
     * @return the fileName value.
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: The file name to the source file. This file is located in the storage container of the
     * asset.
     *
     * @param fileName the fileName value to set.
     * @return the TextTrack object itself.
     */
    public TextTrack withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the displayName property: The display name of the text track on a video player. In HLS, this maps to the NAME
     * attribute of EXT-X-MEDIA.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the text track on a video player. In HLS, this maps to the NAME
     * attribute of EXT-X-MEDIA.
     *
     * @param displayName the displayName value to set.
     * @return the TextTrack object itself.
     */
    public TextTrack withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the languageCode property: The RFC5646 language code for the text track.
     *
     * @return the languageCode value.
     */
    public String languageCode() {
        return this.languageCode;
    }

    /**
     * Get the playerVisibility property: When PlayerVisibility is set to "Visible", the text track will be present in
     * the DASH manifest or HLS playlist when requested by a client. When the PlayerVisibility is set to "Hidden", the
     * text will not be available to the client. The default value is "Visible".
     *
     * @return the playerVisibility value.
     */
    public Visibility playerVisibility() {
        return this.playerVisibility;
    }

    /**
     * Set the playerVisibility property: When PlayerVisibility is set to "Visible", the text track will be present in
     * the DASH manifest or HLS playlist when requested by a client. When the PlayerVisibility is set to "Hidden", the
     * text will not be available to the client. The default value is "Visible".
     *
     * @param playerVisibility the playerVisibility value to set.
     * @return the TextTrack object itself.
     */
    public TextTrack withPlayerVisibility(Visibility playerVisibility) {
        this.playerVisibility = playerVisibility;
        return this;
    }

    /**
     * Get the hlsSettings property: The HLS specific setting for the text track.
     *
     * @return the hlsSettings value.
     */
    public HlsSettings hlsSettings() {
        return this.hlsSettings;
    }

    /**
     * Set the hlsSettings property: The HLS specific setting for the text track.
     *
     * @param hlsSettings the hlsSettings value to set.
     * @return the TextTrack object itself.
     */
    public TextTrack withHlsSettings(HlsSettings hlsSettings) {
        this.hlsSettings = hlsSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (hlsSettings() != null) {
            hlsSettings().validate();
        }
    }
}
