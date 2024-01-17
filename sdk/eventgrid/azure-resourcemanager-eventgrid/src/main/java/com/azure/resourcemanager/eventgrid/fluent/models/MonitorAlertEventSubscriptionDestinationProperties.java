// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.models.MonitorAlertSeverity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The properties that represent the Monitor Alert destination of an event subscription.
 */
@Fluent
public final class MonitorAlertEventSubscriptionDestinationProperties {
    /*
     * The severity that will be attached to every Alert fired through this event subscription.
     * This field must be provided.
     */
    @JsonProperty(value = "severity")
    private MonitorAlertSeverity severity;

    /*
     * The description that will be attached to every Alert fired through this event subscription.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The list of ARM Ids of Action Groups that will be triggered on every Alert fired through this event
     * subscription.
     * Each resource ARM Id should follow this pattern:
     * /subscriptions/{AzureSubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.Insights/actionGroups
     * /{ActionGroupName}.
     */
    @JsonProperty(value = "actionGroups")
    private List<String> actionGroups;

    /**
     * Creates an instance of MonitorAlertEventSubscriptionDestinationProperties class.
     */
    public MonitorAlertEventSubscriptionDestinationProperties() {
    }

    /**
     * Get the severity property: The severity that will be attached to every Alert fired through this event
     * subscription.
     * This field must be provided.
     * 
     * @return the severity value.
     */
    public MonitorAlertSeverity severity() {
        return this.severity;
    }

    /**
     * Set the severity property: The severity that will be attached to every Alert fired through this event
     * subscription.
     * This field must be provided.
     * 
     * @param severity the severity value to set.
     * @return the MonitorAlertEventSubscriptionDestinationProperties object itself.
     */
    public MonitorAlertEventSubscriptionDestinationProperties withSeverity(MonitorAlertSeverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the description property: The description that will be attached to every Alert fired through this event
     * subscription.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description that will be attached to every Alert fired through this event
     * subscription.
     * 
     * @param description the description value to set.
     * @return the MonitorAlertEventSubscriptionDestinationProperties object itself.
     */
    public MonitorAlertEventSubscriptionDestinationProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionGroups property: The list of ARM Ids of Action Groups that will be triggered on every Alert fired
     * through this event subscription.
     * Each resource ARM Id should follow this pattern:
     * /subscriptions/{AzureSubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.Insights/actionGroups/{ActionGroupName}.
     * 
     * @return the actionGroups value.
     */
    public List<String> actionGroups() {
        return this.actionGroups;
    }

    /**
     * Set the actionGroups property: The list of ARM Ids of Action Groups that will be triggered on every Alert fired
     * through this event subscription.
     * Each resource ARM Id should follow this pattern:
     * /subscriptions/{AzureSubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.Insights/actionGroups/{ActionGroupName}.
     * 
     * @param actionGroups the actionGroups value to set.
     * @return the MonitorAlertEventSubscriptionDestinationProperties object itself.
     */
    public MonitorAlertEventSubscriptionDestinationProperties withActionGroups(List<String> actionGroups) {
        this.actionGroups = actionGroups;
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
