// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The context info.
 */
@Fluent
public final class Context {
    /*
     * The source of the notification request
     */
    @JsonProperty(value = "notificationSource")
    private String notificationSource;

    /*
     * The context id type
     */
    @JsonProperty(value = "contextType")
    private String contextType;

    /**
     * Creates an instance of Context class.
     */
    public Context() {
    }

    /**
     * Get the notificationSource property: The source of the notification request.
     *
     * @return the notificationSource value.
     */
    public String notificationSource() {
        return this.notificationSource;
    }

    /**
     * Set the notificationSource property: The source of the notification request.
     *
     * @param notificationSource the notificationSource value to set.
     * @return the Context object itself.
     */
    public Context withNotificationSource(String notificationSource) {
        this.notificationSource = notificationSource;
        return this;
    }

    /**
     * Get the contextType property: The context id type.
     *
     * @return the contextType value.
     */
    public String contextType() {
        return this.contextType;
    }

    /**
     * Set the contextType property: The context id type.
     *
     * @param contextType the contextType value to set.
     * @return the Context object itself.
     */
    public Context withContextType(String contextType) {
        this.contextType = contextType;
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
