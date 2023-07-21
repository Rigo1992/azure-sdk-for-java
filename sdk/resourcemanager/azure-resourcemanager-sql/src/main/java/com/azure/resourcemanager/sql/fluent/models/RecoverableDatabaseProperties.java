// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.models.DatabaseKey;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** The recoverable database's properties. */
@Fluent
public final class RecoverableDatabaseProperties {
    /*
     * The edition of the database.
     */
    @JsonProperty(value = "edition", access = JsonProperty.Access.WRITE_ONLY)
    private String edition;

    /*
     * The service level objective name of the database.
     */
    @JsonProperty(value = "serviceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceLevelObjective;

    /*
     * The elastic pool name of the database
     */
    @JsonProperty(value = "elasticPoolName", access = JsonProperty.Access.WRITE_ONLY)
    private String elasticPoolName;

    /*
     * The last available backup date.
     */
    @JsonProperty(value = "lastAvailableBackupDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastAvailableBackupDate;

    /*
     * The resource ids of the user assigned identities to use
     */
    @JsonProperty(value = "keys")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, DatabaseKey> keys;

    /** Creates an instance of RecoverableDatabaseProperties class. */
    public RecoverableDatabaseProperties() {
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
     * Get the lastAvailableBackupDate property: The last available backup date.
     *
     * @return the lastAvailableBackupDate value.
     */
    public OffsetDateTime lastAvailableBackupDate() {
        return this.lastAvailableBackupDate;
    }

    /**
     * Get the keys property: The resource ids of the user assigned identities to use.
     *
     * @return the keys value.
     */
    public Map<String, DatabaseKey> keys() {
        return this.keys;
    }

    /**
     * Set the keys property: The resource ids of the user assigned identities to use.
     *
     * @param keys the keys value to set.
     * @return the RecoverableDatabaseProperties object itself.
     */
    public RecoverableDatabaseProperties withKeys(Map<String, DatabaseKey> keys) {
        this.keys = keys;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keys() != null) {
            keys()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
