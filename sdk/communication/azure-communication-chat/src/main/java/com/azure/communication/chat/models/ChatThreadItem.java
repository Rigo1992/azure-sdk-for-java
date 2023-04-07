// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.models;

import com.azure.communication.chat.models.ChatRetentionPolicy;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Summary information of a chat thread. */
@Fluent
public final class ChatThreadItem {
    /*
     * Chat thread id.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Chat thread topic.
     */
    @JsonProperty(value = "topic", required = true)
    private String topic;

    /*
     * The timestamp when the chat thread was deleted. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "deletedOn")
    private OffsetDateTime deletedOn;

    /*
     * The timestamp when the last message arrived at the server. The timestamp
     * is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "lastMessageReceivedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastMessageReceivedOn;

    /*
     * Data retention policy for auto deletion. It's not updatable after
     * creation.
     */
    @JsonProperty(value = "retentionPolicy")
    private ChatRetentionPolicy retentionPolicy;

    /**
     * Get the id property: Chat thread id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Chat thread id.
     *
     * @param id the id value to set.
     * @return the ChatThreadItem object itself.
     */
    public ChatThreadItem setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the topic property: Chat thread topic.
     *
     * @return the topic value.
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * Set the topic property: Chat thread topic.
     *
     * @param topic the topic value to set.
     * @return the ChatThreadItem object itself.
     */
    public ChatThreadItem setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Get the deletedOn property: The timestamp when the chat thread was deleted. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the deletedOn value.
     */
    public OffsetDateTime getDeletedOn() {
        return this.deletedOn;
    }

    /**
     * Set the deletedOn property: The timestamp when the chat thread was deleted. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param deletedOn the deletedOn value to set.
     * @return the ChatThreadItem object itself.
     */
    public ChatThreadItem setDeletedOn(OffsetDateTime deletedOn) {
        this.deletedOn = deletedOn;
        return this;
    }

    /**
     * Get the lastMessageReceivedOn property: The timestamp when the last message arrived at the server. The timestamp
     * is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the lastMessageReceivedOn value.
     */
    public OffsetDateTime getLastMessageReceivedOn() {
        return this.lastMessageReceivedOn;
    }

    /**
     * Get the retentionPolicy property: Data retention policy for auto deletion. It's not updatable after creation.
     *
     * @return the retentionPolicy value.
     */
    public ChatRetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: Data retention policy for auto deletion. It's not updatable after creation.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the ChatThreadItem object itself.
     */
    public ChatThreadItem setRetentionPolicy(ChatRetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }
}
