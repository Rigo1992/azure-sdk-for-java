// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Database backup settings.
 */
@Fluent
public final class DatabaseBackupSetting {
    /*
     * Database type (e.g. SqlAzure / MySql).
     */
    @JsonProperty(value = "databaseType", required = true)
    private DatabaseType databaseType;

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Contains a connection string name that is linked to the SiteConfig.ConnectionStrings.
     * This is used during restore with overwrite connection strings options.
     */
    @JsonProperty(value = "connectionStringName")
    private String connectionStringName;

    /*
     * Contains a connection string to a database which is being backed up or restored. If the restore should happen to a new database, the database name inside is the new one.
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /**
     * Creates an instance of DatabaseBackupSetting class.
     */
    public DatabaseBackupSetting() {
    }

    /**
     * Get the databaseType property: Database type (e.g. SqlAzure / MySql).
     * 
     * @return the databaseType value.
     */
    public DatabaseType databaseType() {
        return this.databaseType;
    }

    /**
     * Set the databaseType property: Database type (e.g. SqlAzure / MySql).
     * 
     * @param databaseType the databaseType value to set.
     * @return the DatabaseBackupSetting object itself.
     */
    public DatabaseBackupSetting withDatabaseType(DatabaseType databaseType) {
        this.databaseType = databaseType;
        return this;
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     * 
     * @param name the name value to set.
     * @return the DatabaseBackupSetting object itself.
     */
    public DatabaseBackupSetting withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the connectionStringName property: Contains a connection string name that is linked to the
     * SiteConfig.ConnectionStrings.
     * This is used during restore with overwrite connection strings options.
     * 
     * @return the connectionStringName value.
     */
    public String connectionStringName() {
        return this.connectionStringName;
    }

    /**
     * Set the connectionStringName property: Contains a connection string name that is linked to the
     * SiteConfig.ConnectionStrings.
     * This is used during restore with overwrite connection strings options.
     * 
     * @param connectionStringName the connectionStringName value to set.
     * @return the DatabaseBackupSetting object itself.
     */
    public DatabaseBackupSetting withConnectionStringName(String connectionStringName) {
        this.connectionStringName = connectionStringName;
        return this;
    }

    /**
     * Get the connectionString property: Contains a connection string to a database which is being backed up or
     * restored. If the restore should happen to a new database, the database name inside is the new one.
     * 
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: Contains a connection string to a database which is being backed up or
     * restored. If the restore should happen to a new database, the database name inside is the new one.
     * 
     * @param connectionString the connectionString value to set.
     * @return the DatabaseBackupSetting object itself.
     */
    public DatabaseBackupSetting withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (databaseType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property databaseType in model DatabaseBackupSetting"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatabaseBackupSetting.class);
}
