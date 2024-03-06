// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.SnapshotInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The List Snapshots operation response.
 */
@Fluent
public final class SnapshotList {
    /*
     * A list of snapshots.
     */
    @JsonProperty(value = "value", required = true)
    private List<SnapshotInner> value;

    /*
     * The uri to fetch the next page of snapshots. Call ListNext() with this to fetch the next page of snapshots.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of SnapshotList class.
     */
    public SnapshotList() {
    }

    /**
     * Get the value property: A list of snapshots.
     * 
     * @return the value value.
     */
    public List<SnapshotInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of snapshots.
     * 
     * @param value the value value to set.
     * @return the SnapshotList object itself.
     */
    public SnapshotList withValue(List<SnapshotInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of snapshots. Call ListNext() with this to fetch the
     * next page of snapshots.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of snapshots. Call ListNext() with this to fetch the
     * next page of snapshots.
     * 
     * @param nextLink the nextLink value to set.
     * @return the SnapshotList object itself.
     */
    public SnapshotList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property value in model SnapshotList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SnapshotList.class);
}
