// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The settings of config server.
 */
@Fluent
public final class ConfigServerSettings {
    /*
     * Property of git environment.
     */
    @JsonProperty(value = "gitProperty")
    private ConfigServerGitProperty gitProperty;

    /**
     * Creates an instance of ConfigServerSettings class.
     */
    public ConfigServerSettings() {
    }

    /**
     * Get the gitProperty property: Property of git environment.
     * 
     * @return the gitProperty value.
     */
    public ConfigServerGitProperty gitProperty() {
        return this.gitProperty;
    }

    /**
     * Set the gitProperty property: Property of git environment.
     * 
     * @param gitProperty the gitProperty value to set.
     * @return the ConfigServerSettings object itself.
     */
    public ConfigServerSettings withGitProperty(ConfigServerGitProperty gitProperty) {
        this.gitProperty = gitProperty;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (gitProperty() != null) {
            gitProperty().validate();
        }
    }
}
