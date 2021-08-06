// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The object representing periodic mode backup policy. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Periodic")
@Fluent
public final class PeriodicModeBackupPolicy extends BackupPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PeriodicModeBackupPolicy.class);

    /*
     * Configuration values for periodic mode backup
     */
    @JsonProperty(value = "periodicModeProperties")
    private PeriodicModeProperties periodicModeProperties;

    /**
     * Get the periodicModeProperties property: Configuration values for periodic mode backup.
     *
     * @return the periodicModeProperties value.
     */
    public PeriodicModeProperties periodicModeProperties() {
        return this.periodicModeProperties;
    }

    /**
     * Set the periodicModeProperties property: Configuration values for periodic mode backup.
     *
     * @param periodicModeProperties the periodicModeProperties value to set.
     * @return the PeriodicModeBackupPolicy object itself.
     */
    public PeriodicModeBackupPolicy withPeriodicModeProperties(PeriodicModeProperties periodicModeProperties) {
        this.periodicModeProperties = periodicModeProperties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PeriodicModeBackupPolicy withMigrationState(BackupPolicyMigrationState migrationState) {
        super.withMigrationState(migrationState);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (periodicModeProperties() != null) {
            periodicModeProperties().validate();
        }
    }
}
