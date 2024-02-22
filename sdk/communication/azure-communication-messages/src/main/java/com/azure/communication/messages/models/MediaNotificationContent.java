// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.communication.messages.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A request to send a media notification.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("image")
@Fluent
public final class MediaNotificationContent extends NotificationContent {
    /*
     * Optional text content.
     */
    @Generated
    @JsonProperty(value = "content")
    private String content;

    /*
     * A media url for the file. Required if the type is one of the supported media types, e.g. image
     */
    @Generated
    @JsonProperty(value = "mediaUri")
    private String mediaUrl;

    /**
     * Creates an instance of MediaNotificationContent class.
     * 
     * @param channelRegistrationId the channelRegistrationId value to set.
     * @param to the to value to set.
     * @param mediaUrl the mediaUrl value to set.
     */
    @Generated
    @JsonCreator
    public MediaNotificationContent(@JsonProperty(value = "channelRegistrationId") String channelRegistrationId,
        @JsonProperty(value = "to") List<String> to, @JsonProperty(value = "mediaUri") String mediaUrl) {
        super(channelRegistrationId, to);
        this.mediaUrl = mediaUrl;
    }

    /**
     * Get the content property: Optional text content.
     * 
     * @return the content value.
     */
    @Generated
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content property: Optional text content.
     * 
     * @param content the content value to set.
     * @return the MediaNotificationContent object itself.
     */
    @Generated
    public MediaNotificationContent setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the mediaUrl property: A media url for the file. Required if the type is one of the supported media types,
     * e.g. image.
     * 
     * @return the mediaUrl value.
     */
    @Generated
    public String getMediaUrl() {
        return this.mediaUrl;
    }
}
