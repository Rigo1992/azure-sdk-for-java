// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.ScheduleTriggerRecurrence;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schedule Trigger properties.
 */
@Fluent
public final class ScheduleTriggerTypeProperties {
    /*
     * Recurrence schedule configuration.
     */
    @JsonProperty(value = "recurrence", required = true)
    private ScheduleTriggerRecurrence recurrence;

    /**
     * Creates an instance of ScheduleTriggerTypeProperties class.
     */
    public ScheduleTriggerTypeProperties() {
    }

    /**
     * Get the recurrence property: Recurrence schedule configuration.
     * 
     * @return the recurrence value.
     */
    public ScheduleTriggerRecurrence recurrence() {
        return this.recurrence;
    }

    /**
     * Set the recurrence property: Recurrence schedule configuration.
     * 
     * @param recurrence the recurrence value to set.
     * @return the ScheduleTriggerTypeProperties object itself.
     */
    public ScheduleTriggerTypeProperties withRecurrence(ScheduleTriggerRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (recurrence() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property recurrence in model ScheduleTriggerTypeProperties"));
        } else {
            recurrence().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ScheduleTriggerTypeProperties.class);
}
