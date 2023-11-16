// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PrivateLinkResourceProperties model. */
@Fluent
public final class PrivateLinkResourceProperties {
    /*
     * The groupId property.
     */
    @JsonProperty(value = "groupId")
    private String groupId;

    /*
     * The displayName property.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The requiredMembers property.
     */
    @JsonProperty(value = "requiredMembers")
    private List<String> requiredMembers;

    /*
     * The requiredZoneNames property.
     */
    @JsonProperty(value = "requiredZoneNames")
    private List<String> requiredZoneNames;

    /** Creates an instance of PrivateLinkResourceProperties class. */
    public PrivateLinkResourceProperties() {
    }

    /**
     * Get the groupId property: The groupId property.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The groupId property.
     *
     * @param groupId the groupId value to set.
     * @return the PrivateLinkResourceProperties object itself.
     */
    public PrivateLinkResourceProperties withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
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
     * Set the displayName property: The displayName property.
     *
     * @param displayName the displayName value to set.
     * @return the PrivateLinkResourceProperties object itself.
     */
    public PrivateLinkResourceProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the requiredMembers property: The requiredMembers property.
     *
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Set the requiredMembers property: The requiredMembers property.
     *
     * @param requiredMembers the requiredMembers value to set.
     * @return the PrivateLinkResourceProperties object itself.
     */
    public PrivateLinkResourceProperties withRequiredMembers(List<String> requiredMembers) {
        this.requiredMembers = requiredMembers;
        return this;
    }

    /**
     * Get the requiredZoneNames property: The requiredZoneNames property.
     *
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.requiredZoneNames;
    }

    /**
     * Set the requiredZoneNames property: The requiredZoneNames property.
     *
     * @param requiredZoneNames the requiredZoneNames value to set.
     * @return the PrivateLinkResourceProperties object itself.
     */
    public PrivateLinkResourceProperties withRequiredZoneNames(List<String> requiredZoneNames) {
        this.requiredZoneNames = requiredZoneNames;
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
