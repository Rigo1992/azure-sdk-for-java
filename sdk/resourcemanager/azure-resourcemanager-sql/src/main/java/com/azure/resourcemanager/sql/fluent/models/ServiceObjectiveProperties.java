// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents the properties of a database service objective. */
@Immutable
public final class ServiceObjectiveProperties {
    /*
     * The name for the service objective.
     */
    @JsonProperty(value = "serviceObjectiveName", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceObjectiveName;

    /*
     * Gets whether the service level objective is the default service
     * objective.
     */
    @JsonProperty(value = "isDefault", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDefault;

    /*
     * Gets whether the service level objective is a system service objective.
     */
    @JsonProperty(value = "isSystem", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isSystem;

    /*
     * The description for the service level objective.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Gets whether the service level objective is enabled.
     */
    @JsonProperty(value = "enabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean enabled;

    /**
     * Get the serviceObjectiveName property: The name for the service objective.
     *
     * @return the serviceObjectiveName value.
     */
    public String serviceObjectiveName() {
        return this.serviceObjectiveName;
    }

    /**
     * Get the isDefault property: Gets whether the service level objective is the default service objective.
     *
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Get the isSystem property: Gets whether the service level objective is a system service objective.
     *
     * @return the isSystem value.
     */
    public Boolean isSystem() {
        return this.isSystem;
    }

    /**
     * Get the description property: The description for the service level objective.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the enabled property: Gets whether the service level objective is enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
