// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Cosmos DB location metadata. */
@Immutable
public final class LocationProperties {
    /*
     * Flag indicating whether the location supports availability zones or not.
     */
    @JsonProperty(value = "supportsAvailabilityZone", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean supportsAvailabilityZone;

    /*
     * Flag indicating whether the location is residency sensitive.
     */
    @JsonProperty(value = "isResidencyRestricted", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isResidencyRestricted;

    /*
     * The properties of available backup storage redundancies.
     */
    @JsonProperty(value = "backupStorageRedundancies", access = JsonProperty.Access.WRITE_ONLY)
    private List<BackupStorageRedundancy> backupStorageRedundancies;

    /**
     * Get the supportsAvailabilityZone property: Flag indicating whether the location supports availability zones or
     * not.
     *
     * @return the supportsAvailabilityZone value.
     */
    public Boolean supportsAvailabilityZone() {
        return this.supportsAvailabilityZone;
    }

    /**
     * Get the isResidencyRestricted property: Flag indicating whether the location is residency sensitive.
     *
     * @return the isResidencyRestricted value.
     */
    public Boolean isResidencyRestricted() {
        return this.isResidencyRestricted;
    }

    /**
     * Get the backupStorageRedundancies property: The properties of available backup storage redundancies.
     *
     * @return the backupStorageRedundancies value.
     */
    public List<BackupStorageRedundancy> backupStorageRedundancies() {
        return this.backupStorageRedundancies;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
