// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of Activity Log Alert rule actions.
 */
@Fluent
public final class ActionList {
    /*
     * The list of the Action Groups.
     */
    @JsonProperty(value = "actionGroups")
    private List<ActivityLogAlertActionGroup> actionGroups;

    /**
     * Creates an instance of ActionList class.
     */
    public ActionList() {
    }

    /**
     * Get the actionGroups property: The list of the Action Groups.
     *
     * @return the actionGroups value.
     */
    public List<ActivityLogAlertActionGroup> actionGroups() {
        return this.actionGroups;
    }

    /**
     * Set the actionGroups property: The list of the Action Groups.
     *
     * @param actionGroups the actionGroups value to set.
     * @return the ActionList object itself.
     */
    public ActionList withActionGroups(List<ActivityLogAlertActionGroup> actionGroups) {
        this.actionGroups = actionGroups;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (actionGroups() != null) {
            actionGroups().forEach(e -> e.validate());
        }
    }
}
