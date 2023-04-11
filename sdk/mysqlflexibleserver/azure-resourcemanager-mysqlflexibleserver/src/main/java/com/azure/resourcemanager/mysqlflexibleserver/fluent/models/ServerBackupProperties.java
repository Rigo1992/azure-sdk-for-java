// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The properties of a server backup. */
@Fluent
public final class ServerBackupProperties {
    /*
     * Backup type.
     */
    @JsonProperty(value = "backupType")
    private String backupType;

    /*
     * Backup completed time (ISO8601 format).
     */
    @JsonProperty(value = "completedTime")
    private OffsetDateTime completedTime;

    /*
     * Backup source
     */
    @JsonProperty(value = "source")
    private String source;

    /** Creates an instance of ServerBackupProperties class. */
    public ServerBackupProperties() {
    }

    /**
     * Get the backupType property: Backup type.
     *
     * @return the backupType value.
     */
    public String backupType() {
        return this.backupType;
    }

    /**
     * Set the backupType property: Backup type.
     *
     * @param backupType the backupType value to set.
     * @return the ServerBackupProperties object itself.
     */
    public ServerBackupProperties withBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    /**
     * Get the completedTime property: Backup completed time (ISO8601 format).
     *
     * @return the completedTime value.
     */
    public OffsetDateTime completedTime() {
        return this.completedTime;
    }

    /**
     * Set the completedTime property: Backup completed time (ISO8601 format).
     *
     * @param completedTime the completedTime value to set.
     * @return the ServerBackupProperties object itself.
     */
    public ServerBackupProperties withCompletedTime(OffsetDateTime completedTime) {
        this.completedTime = completedTime;
        return this;
    }

    /**
     * Get the source property: Backup source.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: Backup source.
     *
     * @param source the source value to set.
     * @return the ServerBackupProperties object itself.
     */
    public ServerBackupProperties withSource(String source) {
        this.source = source;
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
