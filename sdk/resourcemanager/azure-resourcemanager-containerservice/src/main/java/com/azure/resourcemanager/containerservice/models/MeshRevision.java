// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Holds information on upgrades and compatibility for given major.minor mesh release.
 */
@Fluent
public class MeshRevision {
    /*
     * The revision of the mesh release.
     */
    @JsonProperty(value = "revision")
    private String revision;

    /*
     * List of revisions available for upgrade of a specific mesh revision
     */
    @JsonProperty(value = "upgrades")
    private List<String> upgrades;

    /*
     * List of items this revision of service mesh is compatible with, and their associated versions.
     */
    @JsonProperty(value = "compatibleWith")
    private List<CompatibleVersions> compatibleWith;

    /**
     * Creates an instance of MeshRevision class.
     */
    public MeshRevision() {
    }

    /**
     * Get the revision property: The revision of the mesh release.
     *
     * @return the revision value.
     */
    public String revision() {
        return this.revision;
    }

    /**
     * Set the revision property: The revision of the mesh release.
     *
     * @param revision the revision value to set.
     * @return the MeshRevision object itself.
     */
    public MeshRevision withRevision(String revision) {
        this.revision = revision;
        return this;
    }

    /**
     * Get the upgrades property: List of revisions available for upgrade of a specific mesh revision.
     *
     * @return the upgrades value.
     */
    public List<String> upgrades() {
        return this.upgrades;
    }

    /**
     * Set the upgrades property: List of revisions available for upgrade of a specific mesh revision.
     *
     * @param upgrades the upgrades value to set.
     * @return the MeshRevision object itself.
     */
    public MeshRevision withUpgrades(List<String> upgrades) {
        this.upgrades = upgrades;
        return this;
    }

    /**
     * Get the compatibleWith property: List of items this revision of service mesh is compatible with, and their
     * associated versions.
     *
     * @return the compatibleWith value.
     */
    public List<CompatibleVersions> compatibleWith() {
        return this.compatibleWith;
    }

    /**
     * Set the compatibleWith property: List of items this revision of service mesh is compatible with, and their
     * associated versions.
     *
     * @param compatibleWith the compatibleWith value to set.
     * @return the MeshRevision object itself.
     */
    public MeshRevision withCompatibleWith(List<CompatibleVersions> compatibleWith) {
        this.compatibleWith = compatibleWith;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (compatibleWith() != null) {
            compatibleWith().forEach(e -> e.validate());
        }
    }
}
