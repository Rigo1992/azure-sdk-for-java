// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.servicebus.models.AccessRights;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Description of a namespace authorization rule. */
@Fluent
public final class SBAuthorizationRuleInner extends Resource {
    /*
     * AuthorizationRule properties.
     */
    @JsonProperty(value = "properties")
    private SBAuthorizationRuleProperties innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Get the innerProperties property: AuthorizationRule properties.
     *
     * @return the innerProperties value.
     */
    private SBAuthorizationRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the rights property: The rights associated with the rule.
     *
     * @return the rights value.
     */
    public List<AccessRights> rights() {
        return this.innerProperties() == null ? null : this.innerProperties().rights();
    }

    /**
     * Set the rights property: The rights associated with the rule.
     *
     * @param rights the rights value to set.
     * @return the SBAuthorizationRuleInner object itself.
     */
    public SBAuthorizationRuleInner withRights(List<AccessRights> rights) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBAuthorizationRuleProperties();
        }
        this.innerProperties().withRights(rights);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
