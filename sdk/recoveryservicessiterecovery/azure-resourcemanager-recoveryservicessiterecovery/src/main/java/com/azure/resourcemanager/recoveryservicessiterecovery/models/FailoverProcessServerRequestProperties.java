// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The properties of the Failover Process Server request.
 */
@Fluent
public final class FailoverProcessServerRequestProperties {
    /*
     * The container identifier.
     */
    @JsonProperty(value = "containerName")
    private String containerName;

    /*
     * The source process server.
     */
    @JsonProperty(value = "sourceProcessServerId")
    private String sourceProcessServerId;

    /*
     * The new process server.
     */
    @JsonProperty(value = "targetProcessServerId")
    private String targetProcessServerId;

    /*
     * The VMS to migrate.
     */
    @JsonProperty(value = "vmsToMigrate")
    private List<String> vmsToMigrate;

    /*
     * A value for failover type. It can be systemlevel/serverlevel.
     */
    @JsonProperty(value = "updateType")
    private String updateType;

    /**
     * Creates an instance of FailoverProcessServerRequestProperties class.
     */
    public FailoverProcessServerRequestProperties() {
    }

    /**
     * Get the containerName property: The container identifier.
     * 
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: The container identifier.
     * 
     * @param containerName the containerName value to set.
     * @return the FailoverProcessServerRequestProperties object itself.
     */
    public FailoverProcessServerRequestProperties withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the sourceProcessServerId property: The source process server.
     * 
     * @return the sourceProcessServerId value.
     */
    public String sourceProcessServerId() {
        return this.sourceProcessServerId;
    }

    /**
     * Set the sourceProcessServerId property: The source process server.
     * 
     * @param sourceProcessServerId the sourceProcessServerId value to set.
     * @return the FailoverProcessServerRequestProperties object itself.
     */
    public FailoverProcessServerRequestProperties withSourceProcessServerId(String sourceProcessServerId) {
        this.sourceProcessServerId = sourceProcessServerId;
        return this;
    }

    /**
     * Get the targetProcessServerId property: The new process server.
     * 
     * @return the targetProcessServerId value.
     */
    public String targetProcessServerId() {
        return this.targetProcessServerId;
    }

    /**
     * Set the targetProcessServerId property: The new process server.
     * 
     * @param targetProcessServerId the targetProcessServerId value to set.
     * @return the FailoverProcessServerRequestProperties object itself.
     */
    public FailoverProcessServerRequestProperties withTargetProcessServerId(String targetProcessServerId) {
        this.targetProcessServerId = targetProcessServerId;
        return this;
    }

    /**
     * Get the vmsToMigrate property: The VMS to migrate.
     * 
     * @return the vmsToMigrate value.
     */
    public List<String> vmsToMigrate() {
        return this.vmsToMigrate;
    }

    /**
     * Set the vmsToMigrate property: The VMS to migrate.
     * 
     * @param vmsToMigrate the vmsToMigrate value to set.
     * @return the FailoverProcessServerRequestProperties object itself.
     */
    public FailoverProcessServerRequestProperties withVmsToMigrate(List<String> vmsToMigrate) {
        this.vmsToMigrate = vmsToMigrate;
        return this;
    }

    /**
     * Get the updateType property: A value for failover type. It can be systemlevel/serverlevel.
     * 
     * @return the updateType value.
     */
    public String updateType() {
        return this.updateType;
    }

    /**
     * Set the updateType property: A value for failover type. It can be systemlevel/serverlevel.
     * 
     * @param updateType the updateType value to set.
     * @return the FailoverProcessServerRequestProperties object itself.
     */
    public FailoverProcessServerRequestProperties withUpdateType(String updateType) {
        this.updateType = updateType;
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
