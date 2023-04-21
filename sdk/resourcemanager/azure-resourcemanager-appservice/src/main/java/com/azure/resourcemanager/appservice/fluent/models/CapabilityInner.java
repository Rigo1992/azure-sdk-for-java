// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the capabilities/features allowed for a specific SKU. */
@Fluent
public final class CapabilityInner {
    /*
     * Name of the SKU capability.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Value of the SKU capability.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Reason of the SKU capability.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /** Creates an instance of CapabilityInner class. */
    public CapabilityInner() {
    }

    /**
     * Get the name property: Name of the SKU capability.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the SKU capability.
     *
     * @param name the name value to set.
     * @return the CapabilityInner object itself.
     */
    public CapabilityInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Value of the SKU capability.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of the SKU capability.
     *
     * @param value the value value to set.
     * @return the CapabilityInner object itself.
     */
    public CapabilityInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the reason property: Reason of the SKU capability.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: Reason of the SKU capability.
     *
     * @param reason the reason value to set.
     * @return the CapabilityInner object itself.
     */
    public CapabilityInner withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
