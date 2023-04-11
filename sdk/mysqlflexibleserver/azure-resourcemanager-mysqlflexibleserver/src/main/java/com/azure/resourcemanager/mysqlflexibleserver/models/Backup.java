// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Storage Profile properties of a server. */
@Fluent
public final class Backup {
    /*
     * Backup retention days for the server.
     */
    @JsonProperty(value = "backupRetentionDays")
    private Integer backupRetentionDays;

    /*
     * Whether or not geo redundant backup is enabled.
     */
    @JsonProperty(value = "geoRedundantBackup")
    private EnableStatusEnum geoRedundantBackup;

    /*
     * Earliest restore point creation time (ISO8601 format)
     */
    @JsonProperty(value = "earliestRestoreDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime earliestRestoreDate;

    /** Creates an instance of Backup class. */
    public Backup() {
    }

    /**
     * Get the backupRetentionDays property: Backup retention days for the server.
     *
     * @return the backupRetentionDays value.
     */
    public Integer backupRetentionDays() {
        return this.backupRetentionDays;
    }

    /**
     * Set the backupRetentionDays property: Backup retention days for the server.
     *
     * @param backupRetentionDays the backupRetentionDays value to set.
     * @return the Backup object itself.
     */
    public Backup withBackupRetentionDays(Integer backupRetentionDays) {
        this.backupRetentionDays = backupRetentionDays;
        return this;
    }

    /**
     * Get the geoRedundantBackup property: Whether or not geo redundant backup is enabled.
     *
     * @return the geoRedundantBackup value.
     */
    public EnableStatusEnum geoRedundantBackup() {
        return this.geoRedundantBackup;
    }

    /**
     * Set the geoRedundantBackup property: Whether or not geo redundant backup is enabled.
     *
     * @param geoRedundantBackup the geoRedundantBackup value to set.
     * @return the Backup object itself.
     */
    public Backup withGeoRedundantBackup(EnableStatusEnum geoRedundantBackup) {
        this.geoRedundantBackup = geoRedundantBackup;
        return this;
    }

    /**
     * Get the earliestRestoreDate property: Earliest restore point creation time (ISO8601 format).
     *
     * @return the earliestRestoreDate value.
     */
    public OffsetDateTime earliestRestoreDate() {
        return this.earliestRestoreDate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
