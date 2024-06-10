// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Parameters for reconfiguring active geo-replication, of an existing database that was previously unlinked from a
 * replication group.
 */
@Fluent
public final class ForceLinkParameters {
    /*
     * The name of the group of linked database resources. This should match the existing replication group name.
     */
    @JsonProperty(value = "groupNickname", required = true)
    private String groupNickname;

    /*
     * The resource IDs of the databases that are expected to be linked and included in the replication group. This parameter is used to validate that the linking is to the expected (unlinked) part of the replication group, if it is splintered.
     */
    @JsonProperty(value = "linkedDatabases", required = true)
    private List<LinkedDatabase> linkedDatabases;

    /**
     * Creates an instance of ForceLinkParameters class.
     */
    public ForceLinkParameters() {
    }

    /**
     * Get the groupNickname property: The name of the group of linked database resources. This should match the
     * existing replication group name.
     * 
     * @return the groupNickname value.
     */
    public String groupNickname() {
        return this.groupNickname;
    }

    /**
     * Set the groupNickname property: The name of the group of linked database resources. This should match the
     * existing replication group name.
     * 
     * @param groupNickname the groupNickname value to set.
     * @return the ForceLinkParameters object itself.
     */
    public ForceLinkParameters withGroupNickname(String groupNickname) {
        this.groupNickname = groupNickname;
        return this;
    }

    /**
     * Get the linkedDatabases property: The resource IDs of the databases that are expected to be linked and included
     * in the replication group. This parameter is used to validate that the linking is to the expected (unlinked) part
     * of the replication group, if it is splintered.
     * 
     * @return the linkedDatabases value.
     */
    public List<LinkedDatabase> linkedDatabases() {
        return this.linkedDatabases;
    }

    /**
     * Set the linkedDatabases property: The resource IDs of the databases that are expected to be linked and included
     * in the replication group. This parameter is used to validate that the linking is to the expected (unlinked) part
     * of the replication group, if it is splintered.
     * 
     * @param linkedDatabases the linkedDatabases value to set.
     * @return the ForceLinkParameters object itself.
     */
    public ForceLinkParameters withLinkedDatabases(List<LinkedDatabase> linkedDatabases) {
        this.linkedDatabases = linkedDatabases;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (groupNickname() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property groupNickname in model ForceLinkParameters"));
        }
        if (linkedDatabases() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property linkedDatabases in model ForceLinkParameters"));
        } else {
            linkedDatabases().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ForceLinkParameters.class);
}
