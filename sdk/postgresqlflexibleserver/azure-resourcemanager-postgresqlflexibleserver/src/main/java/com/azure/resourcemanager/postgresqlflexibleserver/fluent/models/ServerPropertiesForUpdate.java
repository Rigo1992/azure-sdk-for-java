// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.postgresqlflexibleserver.models.AuthConfig;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Backup;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CreateModeForUpdate;
import com.azure.resourcemanager.postgresqlflexibleserver.models.DataEncryption;
import com.azure.resourcemanager.postgresqlflexibleserver.models.HighAvailability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MaintenanceWindow;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Network;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Replica;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ReplicationRole;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ServerVersion;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Storage;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ServerPropertiesForUpdate model.
 */
@Fluent
public final class ServerPropertiesForUpdate {
    /*
     * The password of the administrator login.
     */
    @JsonProperty(value = "administratorLoginPassword")
    private String administratorLoginPassword;

    /*
     * PostgreSQL Server version. Version 16 is currently not supported for MVU.
     */
    @JsonProperty(value = "version")
    private ServerVersion version;

    /*
     * Storage properties of a server.
     */
    @JsonProperty(value = "storage")
    private Storage storage;

    /*
     * Backup properties of a server.
     */
    @JsonProperty(value = "backup")
    private Backup backup;

    /*
     * High availability properties of a server.
     */
    @JsonProperty(value = "highAvailability")
    private HighAvailability highAvailability;

    /*
     * Maintenance window properties of a server.
     */
    @JsonProperty(value = "maintenanceWindow")
    private MaintenanceWindow maintenanceWindow;

    /*
     * AuthConfig properties of a server.
     */
    @JsonProperty(value = "authConfig")
    private AuthConfig authConfig;

    /*
     * Data encryption properties of a server.
     */
    @JsonProperty(value = "dataEncryption")
    private DataEncryption dataEncryption;

    /*
     * The mode to update a new PostgreSQL server.
     */
    @JsonProperty(value = "createMode")
    private CreateModeForUpdate createMode;

    /*
     * Replication role of the server
     */
    @JsonProperty(value = "replicationRole")
    private ReplicationRole replicationRole;

    /*
     * Replica properties of a server. These Replica properties are required to be passed only in case you want to
     * Promote a server.
     */
    @JsonProperty(value = "replica")
    private Replica replica;

    /*
     * Network properties of a server. These are required to be passed only in case if server is a private access
     * server.
     */
    @JsonProperty(value = "network")
    private Network network;

    /**
     * Creates an instance of ServerPropertiesForUpdate class.
     */
    public ServerPropertiesForUpdate() {
    }

    /**
     * Get the administratorLoginPassword property: The password of the administrator login.
     * 
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: The password of the administrator login.
     * 
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the version property: PostgreSQL Server version. Version 16 is currently not supported for MVU.
     * 
     * @return the version value.
     */
    public ServerVersion version() {
        return this.version;
    }

    /**
     * Set the version property: PostgreSQL Server version. Version 16 is currently not supported for MVU.
     * 
     * @param version the version value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withVersion(ServerVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Get the storage property: Storage properties of a server.
     * 
     * @return the storage value.
     */
    public Storage storage() {
        return this.storage;
    }

    /**
     * Set the storage property: Storage properties of a server.
     * 
     * @param storage the storage value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    /**
     * Get the backup property: Backup properties of a server.
     * 
     * @return the backup value.
     */
    public Backup backup() {
        return this.backup;
    }

    /**
     * Set the backup property: Backup properties of a server.
     * 
     * @param backup the backup value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withBackup(Backup backup) {
        this.backup = backup;
        return this;
    }

    /**
     * Get the highAvailability property: High availability properties of a server.
     * 
     * @return the highAvailability value.
     */
    public HighAvailability highAvailability() {
        return this.highAvailability;
    }

    /**
     * Set the highAvailability property: High availability properties of a server.
     * 
     * @param highAvailability the highAvailability value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withHighAvailability(HighAvailability highAvailability) {
        this.highAvailability = highAvailability;
        return this;
    }

    /**
     * Get the maintenanceWindow property: Maintenance window properties of a server.
     * 
     * @return the maintenanceWindow value.
     */
    public MaintenanceWindow maintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * Set the maintenanceWindow property: Maintenance window properties of a server.
     * 
     * @param maintenanceWindow the maintenanceWindow value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    /**
     * Get the authConfig property: AuthConfig properties of a server.
     * 
     * @return the authConfig value.
     */
    public AuthConfig authConfig() {
        return this.authConfig;
    }

    /**
     * Set the authConfig property: AuthConfig properties of a server.
     * 
     * @param authConfig the authConfig value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withAuthConfig(AuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }

    /**
     * Get the dataEncryption property: Data encryption properties of a server.
     * 
     * @return the dataEncryption value.
     */
    public DataEncryption dataEncryption() {
        return this.dataEncryption;
    }

    /**
     * Set the dataEncryption property: Data encryption properties of a server.
     * 
     * @param dataEncryption the dataEncryption value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withDataEncryption(DataEncryption dataEncryption) {
        this.dataEncryption = dataEncryption;
        return this;
    }

    /**
     * Get the createMode property: The mode to update a new PostgreSQL server.
     * 
     * @return the createMode value.
     */
    public CreateModeForUpdate createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: The mode to update a new PostgreSQL server.
     * 
     * @param createMode the createMode value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withCreateMode(CreateModeForUpdate createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the replicationRole property: Replication role of the server.
     * 
     * @return the replicationRole value.
     */
    public ReplicationRole replicationRole() {
        return this.replicationRole;
    }

    /**
     * Set the replicationRole property: Replication role of the server.
     * 
     * @param replicationRole the replicationRole value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withReplicationRole(ReplicationRole replicationRole) {
        this.replicationRole = replicationRole;
        return this;
    }

    /**
     * Get the replica property: Replica properties of a server. These Replica properties are required to be passed
     * only in case you want to Promote a server.
     * 
     * @return the replica value.
     */
    public Replica replica() {
        return this.replica;
    }

    /**
     * Set the replica property: Replica properties of a server. These Replica properties are required to be passed
     * only in case you want to Promote a server.
     * 
     * @param replica the replica value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withReplica(Replica replica) {
        this.replica = replica;
        return this;
    }

    /**
     * Get the network property: Network properties of a server. These are required to be passed only in case if server
     * is a private access server.
     * 
     * @return the network value.
     */
    public Network network() {
        return this.network;
    }

    /**
     * Set the network property: Network properties of a server. These are required to be passed only in case if server
     * is a private access server.
     * 
     * @param network the network value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withNetwork(Network network) {
        this.network = network;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storage() != null) {
            storage().validate();
        }
        if (backup() != null) {
            backup().validate();
        }
        if (highAvailability() != null) {
            highAvailability().validate();
        }
        if (maintenanceWindow() != null) {
            maintenanceWindow().validate();
        }
        if (authConfig() != null) {
            authConfig().validate();
        }
        if (dataEncryption() != null) {
            dataEncryption().validate();
        }
        if (replica() != null) {
            replica().validate();
        }
        if (network() != null) {
            network().validate();
        }
    }
}
