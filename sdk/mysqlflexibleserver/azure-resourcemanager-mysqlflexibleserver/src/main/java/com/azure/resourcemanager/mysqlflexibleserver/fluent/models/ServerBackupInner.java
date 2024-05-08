// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Server backup properties.
 */
@Fluent
public final class ServerBackupInner extends ProxyResource {
    /*
     * The properties of a server backup.
     */
    @JsonProperty(value = "properties")
    private ServerBackupProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of ServerBackupInner class.
     */
    public ServerBackupInner() {
    }

    /**
     * Get the innerProperties property: The properties of a server backup.
     * 
     * @return the innerProperties value.
     */
    private ServerBackupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the backupType property: Backup type.
     * 
     * @return the backupType value.
     */
    public String backupType() {
        return this.innerProperties() == null ? null : this.innerProperties().backupType();
    }

    /**
     * Set the backupType property: Backup type.
     * 
     * @param backupType the backupType value to set.
     * @return the ServerBackupInner object itself.
     */
    public ServerBackupInner withBackupType(String backupType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerBackupProperties();
        }
        this.innerProperties().withBackupType(backupType);
        return this;
    }

    /**
     * Get the completedTime property: Backup completed time (ISO8601 format).
     * 
     * @return the completedTime value.
     */
    public OffsetDateTime completedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().completedTime();
    }

    /**
     * Set the completedTime property: Backup completed time (ISO8601 format).
     * 
     * @param completedTime the completedTime value to set.
     * @return the ServerBackupInner object itself.
     */
    public ServerBackupInner withCompletedTime(OffsetDateTime completedTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerBackupProperties();
        }
        this.innerProperties().withCompletedTime(completedTime);
        return this;
    }

    /**
     * Get the source property: Backup source.
     * 
     * @return the source value.
     */
    public String source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: Backup source.
     * 
     * @param source the source value to set.
     * @return the ServerBackupInner object itself.
     */
    public ServerBackupInner withSource(String source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerBackupProperties();
        }
        this.innerProperties().withSource(source);
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
