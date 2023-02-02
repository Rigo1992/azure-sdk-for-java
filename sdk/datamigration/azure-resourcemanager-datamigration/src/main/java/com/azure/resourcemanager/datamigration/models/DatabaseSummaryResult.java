// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Summary of database results in the migration. */
@Immutable
public final class DatabaseSummaryResult extends DataItemMigrationSummaryResult {
    /*
     * Size of the database in megabytes
     */
    @JsonProperty(value = "sizeMB", access = JsonProperty.Access.WRITE_ONLY)
    private Double sizeMB;

    /** Creates an instance of DatabaseSummaryResult class. */
    public DatabaseSummaryResult() {
    }

    /**
     * Get the sizeMB property: Size of the database in megabytes.
     *
     * @return the sizeMB value.
     */
    public Double sizeMB() {
        return this.sizeMB;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
