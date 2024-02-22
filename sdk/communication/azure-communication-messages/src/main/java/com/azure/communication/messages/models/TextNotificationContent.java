// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.communication.messages.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A request to send a text notification.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("text")
@Immutable
public final class TextNotificationContent extends NotificationContent {
    /*
     * Message content.
     */
    @Generated
    @JsonProperty(value = "content")
    private String content;

    /**
     * Creates an instance of TextNotificationContent class.
     * 
     * @param channelRegistrationId the channelRegistrationId value to set.
     * @param to the to value to set.
     * @param content the content value to set.
     */
    @Generated
    @JsonCreator
    public TextNotificationContent(@JsonProperty(value = "channelRegistrationId") String channelRegistrationId,
        @JsonProperty(value = "to") List<String> to, @JsonProperty(value = "content") String content) {
        super(channelRegistrationId, to);
        this.content = content;
    }

    /**
     * Get the content property: Message content.
     * 
     * @return the content value.
     */
    @Generated
    public String getContent() {
        return this.content;
    }
}
