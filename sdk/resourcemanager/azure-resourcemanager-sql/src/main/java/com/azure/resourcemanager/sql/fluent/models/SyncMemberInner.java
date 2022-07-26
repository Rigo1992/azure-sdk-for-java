// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.models.SyncDirection;
import com.azure.resourcemanager.sql.models.SyncMemberDbType;
import com.azure.resourcemanager.sql.models.SyncMemberState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** An Azure SQL Database sync member. */
@Fluent
public final class SyncMemberInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private SyncMemberProperties innerProperties;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private SyncMemberProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the databaseType property: Database type of the sync member.
     *
     * @return the databaseType value.
     */
    public SyncMemberDbType databaseType() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseType();
    }

    /**
     * Set the databaseType property: Database type of the sync member.
     *
     * @param databaseType the databaseType value to set.
     * @return the SyncMemberInner object itself.
     */
    public SyncMemberInner withDatabaseType(SyncMemberDbType databaseType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncMemberProperties();
        }
        this.innerProperties().withDatabaseType(databaseType);
        return this;
    }

    /**
     * Get the syncAgentId property: ARM resource id of the sync agent in the sync member.
     *
     * @return the syncAgentId value.
     */
    public String syncAgentId() {
        return this.innerProperties() == null ? null : this.innerProperties().syncAgentId();
    }

    /**
     * Set the syncAgentId property: ARM resource id of the sync agent in the sync member.
     *
     * @param syncAgentId the syncAgentId value to set.
     * @return the SyncMemberInner object itself.
     */
    public SyncMemberInner withSyncAgentId(String syncAgentId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncMemberProperties();
        }
        this.innerProperties().withSyncAgentId(syncAgentId);
        return this;
    }

    /**
     * Get the sqlServerDatabaseId property: SQL Server database id of the sync member.
     *
     * @return the sqlServerDatabaseId value.
     */
    public UUID sqlServerDatabaseId() {
        return this.innerProperties() == null ? null : this.innerProperties().sqlServerDatabaseId();
    }

    /**
     * Set the sqlServerDatabaseId property: SQL Server database id of the sync member.
     *
     * @param sqlServerDatabaseId the sqlServerDatabaseId value to set.
     * @return the SyncMemberInner object itself.
     */
    public SyncMemberInner withSqlServerDatabaseId(UUID sqlServerDatabaseId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncMemberProperties();
        }
        this.innerProperties().withSqlServerDatabaseId(sqlServerDatabaseId);
        return this;
    }

    /**
     * Get the serverName property: Server name of the member database in the sync member.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.innerProperties() == null ? null : this.innerProperties().serverName();
    }

    /**
     * Set the serverName property: Server name of the member database in the sync member.
     *
     * @param serverName the serverName value to set.
     * @return the SyncMemberInner object itself.
     */
    public SyncMemberInner withServerName(String serverName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncMemberProperties();
        }
        this.innerProperties().withServerName(serverName);
        return this;
    }

    /**
     * Get the databaseName property: Database name of the member database in the sync member.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseName();
    }

    /**
     * Set the databaseName property: Database name of the member database in the sync member.
     *
     * @param databaseName the databaseName value to set.
     * @return the SyncMemberInner object itself.
     */
    public SyncMemberInner withDatabaseName(String databaseName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncMemberProperties();
        }
        this.innerProperties().withDatabaseName(databaseName);
        return this;
    }

    /**
     * Get the username property: User name of the member database in the sync member.
     *
     * @return the username value.
     */
    public String username() {
        return this.innerProperties() == null ? null : this.innerProperties().username();
    }

    /**
     * Set the username property: User name of the member database in the sync member.
     *
     * @param username the username value to set.
     * @return the SyncMemberInner object itself.
     */
    public SyncMemberInner withUsername(String username) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncMemberProperties();
        }
        this.innerProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: Password of the member database in the sync member.
     *
     * @return the password value.
     */
    public String password() {
        return this.innerProperties() == null ? null : this.innerProperties().password();
    }

    /**
     * Set the password property: Password of the member database in the sync member.
     *
     * @param password the password value to set.
     * @return the SyncMemberInner object itself.
     */
    public SyncMemberInner withPassword(String password) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncMemberProperties();
        }
        this.innerProperties().withPassword(password);
        return this;
    }

    /**
     * Get the syncDirection property: Sync direction of the sync member.
     *
     * @return the syncDirection value.
     */
    public SyncDirection syncDirection() {
        return this.innerProperties() == null ? null : this.innerProperties().syncDirection();
    }

    /**
     * Set the syncDirection property: Sync direction of the sync member.
     *
     * @param syncDirection the syncDirection value to set.
     * @return the SyncMemberInner object itself.
     */
    public SyncMemberInner withSyncDirection(SyncDirection syncDirection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SyncMemberProperties();
        }
        this.innerProperties().withSyncDirection(syncDirection);
        return this;
    }

    /**
     * Get the syncState property: Sync state of the sync member.
     *
     * @return the syncState value.
     */
    public SyncMemberState syncState() {
        return this.innerProperties() == null ? null : this.innerProperties().syncState();
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
