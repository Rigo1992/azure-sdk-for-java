// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.MigrationResourcePropertiesForPatch;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Represents a migration resource for patch. */
@Fluent
public final class MigrationResourceForPatch {
    /*
     * Migration resource properties.
     */
    @JsonProperty(value = "properties")
    private MigrationResourcePropertiesForPatch innerProperties;

    /*
     * Application-specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of MigrationResourceForPatch class. */
    public MigrationResourceForPatch() {
    }

    /**
     * Get the innerProperties property: Migration resource properties.
     *
     * @return the innerProperties value.
     */
    private MigrationResourcePropertiesForPatch innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Application-specific metadata in the form of key-value pairs.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Application-specific metadata in the form of key-value pairs.
     *
     * @param tags the tags value to set.
     * @return the MigrationResourceForPatch object itself.
     */
    public MigrationResourceForPatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sourceDbServerResourceId property: ResourceId of the source database server.
     *
     * @return the sourceDbServerResourceId value.
     */
    public String sourceDbServerResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceDbServerResourceId();
    }

    /**
     * Set the sourceDbServerResourceId property: ResourceId of the source database server.
     *
     * @param sourceDbServerResourceId the sourceDbServerResourceId value to set.
     * @return the MigrationResourceForPatch object itself.
     */
    public MigrationResourceForPatch withSourceDbServerResourceId(String sourceDbServerResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourcePropertiesForPatch();
        }
        this.innerProperties().withSourceDbServerResourceId(sourceDbServerResourceId);
        return this;
    }

    /**
     * Get the sourceDbServerFullyQualifiedDomainName property: Source server fully qualified domain name or ip. It is a
     * optional value, if customer provide it, dms will always use it for connection.
     *
     * @return the sourceDbServerFullyQualifiedDomainName value.
     */
    public String sourceDbServerFullyQualifiedDomainName() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceDbServerFullyQualifiedDomainName();
    }

    /**
     * Set the sourceDbServerFullyQualifiedDomainName property: Source server fully qualified domain name or ip. It is a
     * optional value, if customer provide it, dms will always use it for connection.
     *
     * @param sourceDbServerFullyQualifiedDomainName the sourceDbServerFullyQualifiedDomainName value to set.
     * @return the MigrationResourceForPatch object itself.
     */
    public MigrationResourceForPatch withSourceDbServerFullyQualifiedDomainName(
        String sourceDbServerFullyQualifiedDomainName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourcePropertiesForPatch();
        }
        this.innerProperties().withSourceDbServerFullyQualifiedDomainName(sourceDbServerFullyQualifiedDomainName);
        return this;
    }

    /**
     * Get the targetDbServerFullyQualifiedDomainName property: Target server fully qualified domain name or ip. It is a
     * optional value, if customer provide it, dms will always use it for connection.
     *
     * @return the targetDbServerFullyQualifiedDomainName value.
     */
    public String targetDbServerFullyQualifiedDomainName() {
        return this.innerProperties() == null ? null : this.innerProperties().targetDbServerFullyQualifiedDomainName();
    }

    /**
     * Set the targetDbServerFullyQualifiedDomainName property: Target server fully qualified domain name or ip. It is a
     * optional value, if customer provide it, dms will always use it for connection.
     *
     * @param targetDbServerFullyQualifiedDomainName the targetDbServerFullyQualifiedDomainName value to set.
     * @return the MigrationResourceForPatch object itself.
     */
    public MigrationResourceForPatch withTargetDbServerFullyQualifiedDomainName(
        String targetDbServerFullyQualifiedDomainName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourcePropertiesForPatch();
        }
        this.innerProperties().withTargetDbServerFullyQualifiedDomainName(targetDbServerFullyQualifiedDomainName);
        return this;
    }

    /**
     * Get the secretParameters property: Migration secret parameters.
     *
     * @return the secretParameters value.
     */
    public MigrationSecretParameters secretParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().secretParameters();
    }

    /**
     * Set the secretParameters property: Migration secret parameters.
     *
     * @param secretParameters the secretParameters value to set.
     * @return the MigrationResourceForPatch object itself.
     */
    public MigrationResourceForPatch withSecretParameters(MigrationSecretParameters secretParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourcePropertiesForPatch();
        }
        this.innerProperties().withSecretParameters(secretParameters);
        return this;
    }

    /**
     * Get the dbsToMigrate property: Number of databases to migrate.
     *
     * @return the dbsToMigrate value.
     */
    public List<String> dbsToMigrate() {
        return this.innerProperties() == null ? null : this.innerProperties().dbsToMigrate();
    }

    /**
     * Set the dbsToMigrate property: Number of databases to migrate.
     *
     * @param dbsToMigrate the dbsToMigrate value to set.
     * @return the MigrationResourceForPatch object itself.
     */
    public MigrationResourceForPatch withDbsToMigrate(List<String> dbsToMigrate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourcePropertiesForPatch();
        }
        this.innerProperties().withDbsToMigrate(dbsToMigrate);
        return this;
    }

    /**
     * Get the setupLogicalReplicationOnSourceDbIfNeeded property: Indicates whether to setup
     * LogicalReplicationOnSourceDb, if needed.
     *
     * @return the setupLogicalReplicationOnSourceDbIfNeeded value.
     */
    public LogicalReplicationOnSourceDbEnum setupLogicalReplicationOnSourceDbIfNeeded() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().setupLogicalReplicationOnSourceDbIfNeeded();
    }

    /**
     * Set the setupLogicalReplicationOnSourceDbIfNeeded property: Indicates whether to setup
     * LogicalReplicationOnSourceDb, if needed.
     *
     * @param setupLogicalReplicationOnSourceDbIfNeeded the setupLogicalReplicationOnSourceDbIfNeeded value to set.
     * @return the MigrationResourceForPatch object itself.
     */
    public MigrationResourceForPatch withSetupLogicalReplicationOnSourceDbIfNeeded(
        LogicalReplicationOnSourceDbEnum setupLogicalReplicationOnSourceDbIfNeeded) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourcePropertiesForPatch();
        }
        this.innerProperties().withSetupLogicalReplicationOnSourceDbIfNeeded(setupLogicalReplicationOnSourceDbIfNeeded);
        return this;
    }

    /**
     * Get the overwriteDbsInTarget property: Indicates whether the databases on the target server can be overwritten,
     * if already present. If set to False, the migration workflow will wait for a confirmation, if it detects that the
     * database already exists.
     *
     * @return the overwriteDbsInTarget value.
     */
    public OverwriteDbsInTargetEnum overwriteDbsInTarget() {
        return this.innerProperties() == null ? null : this.innerProperties().overwriteDbsInTarget();
    }

    /**
     * Set the overwriteDbsInTarget property: Indicates whether the databases on the target server can be overwritten,
     * if already present. If set to False, the migration workflow will wait for a confirmation, if it detects that the
     * database already exists.
     *
     * @param overwriteDbsInTarget the overwriteDbsInTarget value to set.
     * @return the MigrationResourceForPatch object itself.
     */
    public MigrationResourceForPatch withOverwriteDbsInTarget(OverwriteDbsInTargetEnum overwriteDbsInTarget) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourcePropertiesForPatch();
        }
        this.innerProperties().withOverwriteDbsInTarget(overwriteDbsInTarget);
        return this;
    }

    /**
     * Get the migrationWindowStartTimeInUtc property: Start time in UTC for migration window.
     *
     * @return the migrationWindowStartTimeInUtc value.
     */
    public OffsetDateTime migrationWindowStartTimeInUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().migrationWindowStartTimeInUtc();
    }

    /**
     * Set the migrationWindowStartTimeInUtc property: Start time in UTC for migration window.
     *
     * @param migrationWindowStartTimeInUtc the migrationWindowStartTimeInUtc value to set.
     * @return the MigrationResourceForPatch object itself.
     */
    public MigrationResourceForPatch withMigrationWindowStartTimeInUtc(OffsetDateTime migrationWindowStartTimeInUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourcePropertiesForPatch();
        }
        this.innerProperties().withMigrationWindowStartTimeInUtc(migrationWindowStartTimeInUtc);
        return this;
    }

    /**
     * Get the startDataMigration property: Indicates whether the data migration should start right away.
     *
     * @return the startDataMigration value.
     */
    public StartDataMigrationEnum startDataMigration() {
        return this.innerProperties() == null ? null : this.innerProperties().startDataMigration();
    }

    /**
     * Set the startDataMigration property: Indicates whether the data migration should start right away.
     *
     * @param startDataMigration the startDataMigration value to set.
     * @return the MigrationResourceForPatch object itself.
     */
    public MigrationResourceForPatch withStartDataMigration(StartDataMigrationEnum startDataMigration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourcePropertiesForPatch();
        }
        this.innerProperties().withStartDataMigration(startDataMigration);
        return this;
    }

    /**
     * Get the triggerCutover property: To trigger cutover for entire migration we need to send this flag as True.
     *
     * @return the triggerCutover value.
     */
    public TriggerCutoverEnum triggerCutover() {
        return this.innerProperties() == null ? null : this.innerProperties().triggerCutover();
    }

    /**
     * Set the triggerCutover property: To trigger cutover for entire migration we need to send this flag as True.
     *
     * @param triggerCutover the triggerCutover value to set.
     * @return the MigrationResourceForPatch object itself.
     */
    public MigrationResourceForPatch withTriggerCutover(TriggerCutoverEnum triggerCutover) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourcePropertiesForPatch();
        }
        this.innerProperties().withTriggerCutover(triggerCutover);
        return this;
    }

    /**
     * Get the dbsToTriggerCutoverOn property: When you want to trigger cutover for specific databases send
     * triggerCutover flag as True and database names in this array.
     *
     * @return the dbsToTriggerCutoverOn value.
     */
    public List<String> dbsToTriggerCutoverOn() {
        return this.innerProperties() == null ? null : this.innerProperties().dbsToTriggerCutoverOn();
    }

    /**
     * Set the dbsToTriggerCutoverOn property: When you want to trigger cutover for specific databases send
     * triggerCutover flag as True and database names in this array.
     *
     * @param dbsToTriggerCutoverOn the dbsToTriggerCutoverOn value to set.
     * @return the MigrationResourceForPatch object itself.
     */
    public MigrationResourceForPatch withDbsToTriggerCutoverOn(List<String> dbsToTriggerCutoverOn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourcePropertiesForPatch();
        }
        this.innerProperties().withDbsToTriggerCutoverOn(dbsToTriggerCutoverOn);
        return this;
    }

    /**
     * Get the cancel property: To trigger cancel for entire migration we need to send this flag as True.
     *
     * @return the cancel value.
     */
    public CancelEnum cancel() {
        return this.innerProperties() == null ? null : this.innerProperties().cancel();
    }

    /**
     * Set the cancel property: To trigger cancel for entire migration we need to send this flag as True.
     *
     * @param cancel the cancel value to set.
     * @return the MigrationResourceForPatch object itself.
     */
    public MigrationResourceForPatch withCancel(CancelEnum cancel) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourcePropertiesForPatch();
        }
        this.innerProperties().withCancel(cancel);
        return this;
    }

    /**
     * Get the dbsToCancelMigrationOn property: When you want to trigger cancel for specific databases send cancel flag
     * as True and database names in this array.
     *
     * @return the dbsToCancelMigrationOn value.
     */
    public List<String> dbsToCancelMigrationOn() {
        return this.innerProperties() == null ? null : this.innerProperties().dbsToCancelMigrationOn();
    }

    /**
     * Set the dbsToCancelMigrationOn property: When you want to trigger cancel for specific databases send cancel flag
     * as True and database names in this array.
     *
     * @param dbsToCancelMigrationOn the dbsToCancelMigrationOn value to set.
     * @return the MigrationResourceForPatch object itself.
     */
    public MigrationResourceForPatch withDbsToCancelMigrationOn(List<String> dbsToCancelMigrationOn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourcePropertiesForPatch();
        }
        this.innerProperties().withDbsToCancelMigrationOn(dbsToCancelMigrationOn);
        return this;
    }

    /**
     * Get the migrationMode property: There are two types of migration modes Online and Offline.
     *
     * @return the migrationMode value.
     */
    public MigrationMode migrationMode() {
        return this.innerProperties() == null ? null : this.innerProperties().migrationMode();
    }

    /**
     * Set the migrationMode property: There are two types of migration modes Online and Offline.
     *
     * @param migrationMode the migrationMode value to set.
     * @return the MigrationResourceForPatch object itself.
     */
    public MigrationResourceForPatch withMigrationMode(MigrationMode migrationMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationResourcePropertiesForPatch();
        }
        this.innerProperties().withMigrationMode(migrationMode);
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
