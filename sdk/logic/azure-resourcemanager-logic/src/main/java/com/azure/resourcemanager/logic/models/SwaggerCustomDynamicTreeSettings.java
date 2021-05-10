// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The swagger custom dynamic tree settings. */
@Fluent
public final class SwaggerCustomDynamicTreeSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SwaggerCustomDynamicTreeSettings.class);

    /*
     * Indicates whether parent nodes can be selected.
     */
    @JsonProperty(value = "CanSelectParentNodes")
    private Boolean canSelectParentNodes;

    /*
     * Indicates whether leaf nodes can be selected.
     */
    @JsonProperty(value = "CanSelectLeafNodes")
    private Boolean canSelectLeafNodes;

    /**
     * Get the canSelectParentNodes property: Indicates whether parent nodes can be selected.
     *
     * @return the canSelectParentNodes value.
     */
    public Boolean canSelectParentNodes() {
        return this.canSelectParentNodes;
    }

    /**
     * Set the canSelectParentNodes property: Indicates whether parent nodes can be selected.
     *
     * @param canSelectParentNodes the canSelectParentNodes value to set.
     * @return the SwaggerCustomDynamicTreeSettings object itself.
     */
    public SwaggerCustomDynamicTreeSettings withCanSelectParentNodes(Boolean canSelectParentNodes) {
        this.canSelectParentNodes = canSelectParentNodes;
        return this;
    }

    /**
     * Get the canSelectLeafNodes property: Indicates whether leaf nodes can be selected.
     *
     * @return the canSelectLeafNodes value.
     */
    public Boolean canSelectLeafNodes() {
        return this.canSelectLeafNodes;
    }

    /**
     * Set the canSelectLeafNodes property: Indicates whether leaf nodes can be selected.
     *
     * @param canSelectLeafNodes the canSelectLeafNodes value to set.
     * @return the SwaggerCustomDynamicTreeSettings object itself.
     */
    public SwaggerCustomDynamicTreeSettings withCanSelectLeafNodes(Boolean canSelectLeafNodes) {
        this.canSelectLeafNodes = canSelectLeafNodes;
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
