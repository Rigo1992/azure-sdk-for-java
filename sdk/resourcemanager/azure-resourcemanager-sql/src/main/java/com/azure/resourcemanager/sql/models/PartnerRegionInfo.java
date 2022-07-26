// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Partner region information for the failover group. */
@Fluent
public final class PartnerRegionInfo {
    /*
     * Geo location of the partner managed instances.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Replication role of the partner managed instances.
     */
    @JsonProperty(value = "replicationRole", access = JsonProperty.Access.WRITE_ONLY)
    private InstanceFailoverGroupReplicationRole replicationRole;

    /**
     * Get the location property: Geo location of the partner managed instances.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Geo location of the partner managed instances.
     *
     * @param location the location value to set.
     * @return the PartnerRegionInfo object itself.
     */
    public PartnerRegionInfo withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the replicationRole property: Replication role of the partner managed instances.
     *
     * @return the replicationRole value.
     */
    public InstanceFailoverGroupReplicationRole replicationRole() {
        return this.replicationRole;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
