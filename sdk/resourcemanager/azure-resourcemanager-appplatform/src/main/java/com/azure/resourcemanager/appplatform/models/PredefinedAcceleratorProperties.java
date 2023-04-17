// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Predefined accelerator properties payload. */
@Fluent
public final class PredefinedAcceleratorProperties {
    /*
     * Provisioning state of the predefined accelerator.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private PredefinedAcceleratorProvisioningState provisioningState;

    /*
     * The displayName property.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The description property.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * The iconUrl property.
     */
    @JsonProperty(value = "iconUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String iconUrl;

    /*
     * The acceleratorTags property.
     */
    @JsonProperty(value = "acceleratorTags", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> acceleratorTags;

    /*
     * State of the predefined accelerator.
     */
    @JsonProperty(value = "state")
    private PredefinedAcceleratorState state;

    /** Creates an instance of PredefinedAcceleratorProperties class. */
    public PredefinedAcceleratorProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state of the predefined accelerator.
     *
     * @return the provisioningState value.
     */
    public PredefinedAcceleratorProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the displayName property: The displayName property.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the description property: The description property.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the iconUrl property: The iconUrl property.
     *
     * @return the iconUrl value.
     */
    public String iconUrl() {
        return this.iconUrl;
    }

    /**
     * Get the acceleratorTags property: The acceleratorTags property.
     *
     * @return the acceleratorTags value.
     */
    public List<String> acceleratorTags() {
        return this.acceleratorTags;
    }

    /**
     * Get the state property: State of the predefined accelerator.
     *
     * @return the state value.
     */
    public PredefinedAcceleratorState state() {
        return this.state;
    }

    /**
     * Set the state property: State of the predefined accelerator.
     *
     * @param state the state value to set.
     * @return the PredefinedAcceleratorProperties object itself.
     */
    public PredefinedAcceleratorProperties withState(PredefinedAcceleratorState state) {
        this.state = state;
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
