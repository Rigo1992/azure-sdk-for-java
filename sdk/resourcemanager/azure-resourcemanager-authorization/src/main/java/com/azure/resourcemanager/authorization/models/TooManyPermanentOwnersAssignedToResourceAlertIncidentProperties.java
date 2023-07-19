// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Too many permanent owners assigned to resource alert incident properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "alertIncidentType")
@JsonTypeName("TooManyPermanentOwnersAssignedToResourceAlertIncident")
@Immutable
public final class TooManyPermanentOwnersAssignedToResourceAlertIncidentProperties extends AlertIncidentProperties {
    /*
     * The assignee name.
     */
    @JsonProperty(value = "assigneeName", access = JsonProperty.Access.WRITE_ONLY)
    private String assigneeName;

    /*
     * The assignee type.
     */
    @JsonProperty(value = "assigneeType", access = JsonProperty.Access.WRITE_ONLY)
    private String assigneeType;

    /** Creates an instance of TooManyPermanentOwnersAssignedToResourceAlertIncidentProperties class. */
    public TooManyPermanentOwnersAssignedToResourceAlertIncidentProperties() {
    }

    /**
     * Get the assigneeName property: The assignee name.
     *
     * @return the assigneeName value.
     */
    public String assigneeName() {
        return this.assigneeName;
    }

    /**
     * Get the assigneeType property: The assignee type.
     *
     * @return the assigneeType value.
     */
    public String assigneeType() {
        return this.assigneeType;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
