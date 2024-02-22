// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An Activity Log Alert rule properties for patch operations.
 */
@Fluent
public final class AlertRulePatchProperties {
    /*
     * Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert rule is not enabled, then
     * none of its actions will be activated.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Creates an instance of AlertRulePatchProperties class.
     */
    public AlertRulePatchProperties() {
    }

    /**
     * Get the enabled property: Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert
     * rule is not enabled, then none of its actions will be activated.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert
     * rule is not enabled, then none of its actions will be activated.
     * 
     * @param enabled the enabled value to set.
     * @return the AlertRulePatchProperties object itself.
     */
    public AlertRulePatchProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
