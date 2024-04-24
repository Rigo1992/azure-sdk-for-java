// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Request payload for creating a chat thread.
 */
@Fluent
public final class CreateChatThreadOptions {
    /*
     * The chat thread topic.
     */
    @JsonProperty(value = "topic", required = true)
    private String topic;

    /*
     * Participants to be added to the chat thread.
     */
    @JsonProperty(value = "participants")
    private List<ChatParticipant> participants;

    /**
     * Creates an instance of CreateChatThreadOptions class.
     */
    public CreateChatThreadOptions() {
    }

    /**
     * Get the topic property: The chat thread topic.
     * 
     * @return the topic value.
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * Set the topic property: The chat thread topic.
     * 
     * @param topic the topic value to set.
     * @return the CreateChatThreadOptions object itself.
     */
    public CreateChatThreadOptions setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Get the participants property: Participants to be added to the chat thread.
     * 
     * @return the participants value.
     */
    public List<ChatParticipant> getParticipants() {
        return this.participants;
    }

    /**
     * Set the participants property: Participants to be added to the chat thread.
     * 
     * @param participants the participants value to set.
     * @return the CreateChatThreadOptions object itself.
     */
    public CreateChatThreadOptions setParticipants(List<ChatParticipant> participants) {
        this.participants = participants;
        return this;
    }
}
