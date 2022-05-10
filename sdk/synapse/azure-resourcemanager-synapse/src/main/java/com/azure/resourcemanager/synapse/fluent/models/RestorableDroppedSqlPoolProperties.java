// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The properties of a restorable dropped Sql pool. */
@Immutable
public final class RestorableDroppedSqlPoolProperties {
    /*
     * The name of the database
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * The edition of the database
     */
    @JsonProperty(value = "edition", access = JsonProperty.Access.WRITE_ONLY)
    private String edition;

    /*
     * The max size in bytes of the database
     */
    @JsonProperty(value = "maxSizeBytes", access = JsonProperty.Access.WRITE_ONLY)
    private String maxSizeBytes;

    /*
     * The service level objective name of the database
     */
    @JsonProperty(value = "serviceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceLevelObjective;

    /*
     * The elastic pool name of the database
     */
    @JsonProperty(value = "elasticPoolName", access = JsonProperty.Access.WRITE_ONLY)
    private String elasticPoolName;

    /*
     * The creation date of the database (ISO8601 format)
     */
    @JsonProperty(value = "creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /*
     * The deletion date of the database (ISO8601 format)
     */
    @JsonProperty(value = "deletionDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime deletionDate;

    /*
     * The earliest restore date of the database (ISO8601 format)
     */
    @JsonProperty(value = "earliestRestoreDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime earliestRestoreDate;

    /**
     * Get the databaseName property: The name of the database.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the edition property: The edition of the database.
     *
     * @return the edition value.
     */
    public String edition() {
        return this.edition;
    }

    /**
     * Get the maxSizeBytes property: The max size in bytes of the database.
     *
     * @return the maxSizeBytes value.
     */
    public String maxSizeBytes() {
        return this.maxSizeBytes;
    }

    /**
     * Get the serviceLevelObjective property: The service level objective name of the database.
     *
     * @return the serviceLevelObjective value.
     */
    public String serviceLevelObjective() {
        return this.serviceLevelObjective;
    }

    /**
     * Get the elasticPoolName property: The elastic pool name of the database.
     *
     * @return the elasticPoolName value.
     */
    public String elasticPoolName() {
        return this.elasticPoolName;
    }

    /**
     * Get the creationDate property: The creation date of the database (ISO8601 format).
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the deletionDate property: The deletion date of the database (ISO8601 format).
     *
     * @return the deletionDate value.
     */
    public OffsetDateTime deletionDate() {
        return this.deletionDate;
    }

    /**
     * Get the earliestRestoreDate property: The earliest restore date of the database (ISO8601 format).
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
