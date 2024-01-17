// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Update properties for the corresponding partner topic of a channel.
 */
@Fluent
public final class PartnerUpdateTopicInfo {
    /*
     * Event type info for the partner topic
     */
    @JsonProperty(value = "eventTypeInfo")
    private EventTypeInfo eventTypeInfo;

    /**
     * Creates an instance of PartnerUpdateTopicInfo class.
     */
    public PartnerUpdateTopicInfo() {
    }

    /**
     * Get the eventTypeInfo property: Event type info for the partner topic.
     * 
     * @return the eventTypeInfo value.
     */
    public EventTypeInfo eventTypeInfo() {
        return this.eventTypeInfo;
    }

    /**
     * Set the eventTypeInfo property: Event type info for the partner topic.
     * 
     * @param eventTypeInfo the eventTypeInfo value to set.
     * @return the PartnerUpdateTopicInfo object itself.
     */
    public PartnerUpdateTopicInfo withEventTypeInfo(EventTypeInfo eventTypeInfo) {
        this.eventTypeInfo = eventTypeInfo;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (eventTypeInfo() != null) {
            eventTypeInfo().validate();
        }
    }
}
