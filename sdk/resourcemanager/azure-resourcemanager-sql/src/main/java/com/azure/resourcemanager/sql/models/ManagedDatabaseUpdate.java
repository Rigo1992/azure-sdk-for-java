// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.fluent.models.ManagedDatabaseProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** An managed database update. */
@Fluent
public final class ManagedDatabaseUpdate {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private ManagedDatabaseProperties innerProperties;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of ManagedDatabaseUpdate class. */
    public ManagedDatabaseUpdate() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private ManagedDatabaseProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the collation property: Collation of the managed database.
     *
     * @return the collation value.
     */
    public String collation() {
        return this.innerProperties() == null ? null : this.innerProperties().collation();
    }

    /**
     * Set the collation property: Collation of the managed database.
     *
     * @param collation the collation value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withCollation(String collation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this.innerProperties().withCollation(collation);
        return this;
    }

    /**
     * Get the status property: Status of the database.
     *
     * @return the status value.
     */
    public ManagedDatabaseStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the creationDate property: Creation date of the database.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().creationDate();
    }

    /**
     * Get the earliestRestorePoint property: Earliest restore point in time for point in time restore.
     *
     * @return the earliestRestorePoint value.
     */
    public OffsetDateTime earliestRestorePoint() {
        return this.innerProperties() == null ? null : this.innerProperties().earliestRestorePoint();
    }

    /**
     * Get the restorePointInTime property: Conditional. If createMode is PointInTimeRestore, this value is required.
     * Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new
     * database.
     *
     * @return the restorePointInTime value.
     */
    public OffsetDateTime restorePointInTime() {
        return this.innerProperties() == null ? null : this.innerProperties().restorePointInTime();
    }

    /**
     * Set the restorePointInTime property: Conditional. If createMode is PointInTimeRestore, this value is required.
     * Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new
     * database.
     *
     * @param restorePointInTime the restorePointInTime value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withRestorePointInTime(OffsetDateTime restorePointInTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this.innerProperties().withRestorePointInTime(restorePointInTime);
        return this;
    }

    /**
     * Get the defaultSecondaryLocation property: Geo paired region.
     *
     * @return the defaultSecondaryLocation value.
     */
    public String defaultSecondaryLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultSecondaryLocation();
    }

    /**
     * Get the catalogCollation property: Collation of the metadata catalog.
     *
     * @return the catalogCollation value.
     */
    public CatalogCollationType catalogCollation() {
        return this.innerProperties() == null ? null : this.innerProperties().catalogCollation();
    }

    /**
     * Set the catalogCollation property: Collation of the metadata catalog.
     *
     * @param catalogCollation the catalogCollation value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withCatalogCollation(CatalogCollationType catalogCollation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this.innerProperties().withCatalogCollation(catalogCollation);
        return this;
    }

    /**
     * Get the createMode property: Managed database create mode. PointInTimeRestore: Create a database by restoring a
     * point in time backup of an existing database. SourceDatabaseName, SourceManagedInstanceName and PointInTime must
     * be specified. RestoreExternalBackup: Create a database by restoring from external backup files. Collation,
     * StorageContainerUri and StorageContainerSasToken must be specified. Recovery: Creates a database by restoring a
     * geo-replicated backup. RecoverableDatabaseId must be specified as the recoverable database resource ID to
     * restore. RestoreLongTermRetentionBackup: Create a database by restoring from a long term retention backup
     * (longTermRetentionBackupResourceId required).
     *
     * @return the createMode value.
     */
    public ManagedDatabaseCreateMode createMode() {
        return this.innerProperties() == null ? null : this.innerProperties().createMode();
    }

    /**
     * Set the createMode property: Managed database create mode. PointInTimeRestore: Create a database by restoring a
     * point in time backup of an existing database. SourceDatabaseName, SourceManagedInstanceName and PointInTime must
     * be specified. RestoreExternalBackup: Create a database by restoring from external backup files. Collation,
     * StorageContainerUri and StorageContainerSasToken must be specified. Recovery: Creates a database by restoring a
     * geo-replicated backup. RecoverableDatabaseId must be specified as the recoverable database resource ID to
     * restore. RestoreLongTermRetentionBackup: Create a database by restoring from a long term retention backup
     * (longTermRetentionBackupResourceId required).
     *
     * @param createMode the createMode value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withCreateMode(ManagedDatabaseCreateMode createMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this.innerProperties().withCreateMode(createMode);
        return this;
    }

    /**
     * Get the storageContainerUri property: Conditional. If createMode is RestoreExternalBackup, this value is
     * required. Specifies the uri of the storage container where backups for this restore are stored.
     *
     * @return the storageContainerUri value.
     */
    public String storageContainerUri() {
        return this.innerProperties() == null ? null : this.innerProperties().storageContainerUri();
    }

    /**
     * Set the storageContainerUri property: Conditional. If createMode is RestoreExternalBackup, this value is
     * required. Specifies the uri of the storage container where backups for this restore are stored.
     *
     * @param storageContainerUri the storageContainerUri value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withStorageContainerUri(String storageContainerUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this.innerProperties().withStorageContainerUri(storageContainerUri);
        return this;
    }

    /**
     * Get the sourceDatabaseId property: The resource identifier of the source database associated with create
     * operation of this database.
     *
     * @return the sourceDatabaseId value.
     */
    public String sourceDatabaseId() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceDatabaseId();
    }

    /**
     * Set the sourceDatabaseId property: The resource identifier of the source database associated with create
     * operation of this database.
     *
     * @param sourceDatabaseId the sourceDatabaseId value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withSourceDatabaseId(String sourceDatabaseId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this.innerProperties().withSourceDatabaseId(sourceDatabaseId);
        return this;
    }

    /**
     * Get the crossSubscriptionSourceDatabaseId property: The resource identifier of the cross-subscription source
     * database associated with create operation of this database.
     *
     * @return the crossSubscriptionSourceDatabaseId value.
     */
    public String crossSubscriptionSourceDatabaseId() {
        return this.innerProperties() == null ? null : this.innerProperties().crossSubscriptionSourceDatabaseId();
    }

    /**
     * Set the crossSubscriptionSourceDatabaseId property: The resource identifier of the cross-subscription source
     * database associated with create operation of this database.
     *
     * @param crossSubscriptionSourceDatabaseId the crossSubscriptionSourceDatabaseId value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withCrossSubscriptionSourceDatabaseId(String crossSubscriptionSourceDatabaseId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this.innerProperties().withCrossSubscriptionSourceDatabaseId(crossSubscriptionSourceDatabaseId);
        return this;
    }

    /**
     * Get the restorableDroppedDatabaseId property: The restorable dropped database resource id to restore when
     * creating this database.
     *
     * @return the restorableDroppedDatabaseId value.
     */
    public String restorableDroppedDatabaseId() {
        return this.innerProperties() == null ? null : this.innerProperties().restorableDroppedDatabaseId();
    }

    /**
     * Set the restorableDroppedDatabaseId property: The restorable dropped database resource id to restore when
     * creating this database.
     *
     * @param restorableDroppedDatabaseId the restorableDroppedDatabaseId value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withRestorableDroppedDatabaseId(String restorableDroppedDatabaseId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this.innerProperties().withRestorableDroppedDatabaseId(restorableDroppedDatabaseId);
        return this;
    }

    /**
     * Get the crossSubscriptionRestorableDroppedDatabaseId property: The restorable cross-subscription dropped database
     * resource id to restore when creating this database.
     *
     * @return the crossSubscriptionRestorableDroppedDatabaseId value.
     */
    public String crossSubscriptionRestorableDroppedDatabaseId() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().crossSubscriptionRestorableDroppedDatabaseId();
    }

    /**
     * Set the crossSubscriptionRestorableDroppedDatabaseId property: The restorable cross-subscription dropped database
     * resource id to restore when creating this database.
     *
     * @param crossSubscriptionRestorableDroppedDatabaseId the crossSubscriptionRestorableDroppedDatabaseId value to
     *     set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withCrossSubscriptionRestorableDroppedDatabaseId(
        String crossSubscriptionRestorableDroppedDatabaseId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this
            .innerProperties()
            .withCrossSubscriptionRestorableDroppedDatabaseId(crossSubscriptionRestorableDroppedDatabaseId);
        return this;
    }

    /**
     * Get the storageContainerIdentity property: Conditional. If createMode is RestoreExternalBackup, this value is
     * used. Specifies the identity used for storage container authentication. Can be 'SharedAccessSignature' or
     * 'ManagedIdentity'; if not specified 'SharedAccessSignature' is assumed.
     *
     * @return the storageContainerIdentity value.
     */
    public String storageContainerIdentity() {
        return this.innerProperties() == null ? null : this.innerProperties().storageContainerIdentity();
    }

    /**
     * Set the storageContainerIdentity property: Conditional. If createMode is RestoreExternalBackup, this value is
     * used. Specifies the identity used for storage container authentication. Can be 'SharedAccessSignature' or
     * 'ManagedIdentity'; if not specified 'SharedAccessSignature' is assumed.
     *
     * @param storageContainerIdentity the storageContainerIdentity value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withStorageContainerIdentity(String storageContainerIdentity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this.innerProperties().withStorageContainerIdentity(storageContainerIdentity);
        return this;
    }

    /**
     * Get the storageContainerSasToken property: Conditional. If createMode is RestoreExternalBackup and
     * storageContainerIdentity is not ManagedIdentity, this value is required. Specifies the storage container sas
     * token.
     *
     * @return the storageContainerSasToken value.
     */
    public String storageContainerSasToken() {
        return this.innerProperties() == null ? null : this.innerProperties().storageContainerSasToken();
    }

    /**
     * Set the storageContainerSasToken property: Conditional. If createMode is RestoreExternalBackup and
     * storageContainerIdentity is not ManagedIdentity, this value is required. Specifies the storage container sas
     * token.
     *
     * @param storageContainerSasToken the storageContainerSasToken value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withStorageContainerSasToken(String storageContainerSasToken) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this.innerProperties().withStorageContainerSasToken(storageContainerSasToken);
        return this;
    }

    /**
     * Get the failoverGroupId property: Instance Failover Group resource identifier that this managed database belongs
     * to.
     *
     * @return the failoverGroupId value.
     */
    public String failoverGroupId() {
        return this.innerProperties() == null ? null : this.innerProperties().failoverGroupId();
    }

    /**
     * Get the recoverableDatabaseId property: The resource identifier of the recoverable database associated with
     * create operation of this database.
     *
     * @return the recoverableDatabaseId value.
     */
    public String recoverableDatabaseId() {
        return this.innerProperties() == null ? null : this.innerProperties().recoverableDatabaseId();
    }

    /**
     * Set the recoverableDatabaseId property: The resource identifier of the recoverable database associated with
     * create operation of this database.
     *
     * @param recoverableDatabaseId the recoverableDatabaseId value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withRecoverableDatabaseId(String recoverableDatabaseId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this.innerProperties().withRecoverableDatabaseId(recoverableDatabaseId);
        return this;
    }

    /**
     * Get the longTermRetentionBackupResourceId property: The name of the Long Term Retention backup to be used for
     * restore of this managed database.
     *
     * @return the longTermRetentionBackupResourceId value.
     */
    public String longTermRetentionBackupResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().longTermRetentionBackupResourceId();
    }

    /**
     * Set the longTermRetentionBackupResourceId property: The name of the Long Term Retention backup to be used for
     * restore of this managed database.
     *
     * @param longTermRetentionBackupResourceId the longTermRetentionBackupResourceId value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withLongTermRetentionBackupResourceId(String longTermRetentionBackupResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this.innerProperties().withLongTermRetentionBackupResourceId(longTermRetentionBackupResourceId);
        return this;
    }

    /**
     * Get the autoCompleteRestore property: Whether to auto complete restore of this managed database.
     *
     * @return the autoCompleteRestore value.
     */
    public Boolean autoCompleteRestore() {
        return this.innerProperties() == null ? null : this.innerProperties().autoCompleteRestore();
    }

    /**
     * Set the autoCompleteRestore property: Whether to auto complete restore of this managed database.
     *
     * @param autoCompleteRestore the autoCompleteRestore value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withAutoCompleteRestore(Boolean autoCompleteRestore) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this.innerProperties().withAutoCompleteRestore(autoCompleteRestore);
        return this;
    }

    /**
     * Get the lastBackupName property: Last backup file name for restore of this managed database.
     *
     * @return the lastBackupName value.
     */
    public String lastBackupName() {
        return this.innerProperties() == null ? null : this.innerProperties().lastBackupName();
    }

    /**
     * Set the lastBackupName property: Last backup file name for restore of this managed database.
     *
     * @param lastBackupName the lastBackupName value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withLastBackupName(String lastBackupName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this.innerProperties().withLastBackupName(lastBackupName);
        return this;
    }

    /**
     * Get the crossSubscriptionTargetManagedInstanceId property: Target managed instance id used in cross-subscription
     * restore.
     *
     * @return the crossSubscriptionTargetManagedInstanceId value.
     */
    public String crossSubscriptionTargetManagedInstanceId() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().crossSubscriptionTargetManagedInstanceId();
    }

    /**
     * Set the crossSubscriptionTargetManagedInstanceId property: Target managed instance id used in cross-subscription
     * restore.
     *
     * @param crossSubscriptionTargetManagedInstanceId the crossSubscriptionTargetManagedInstanceId value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withCrossSubscriptionTargetManagedInstanceId(
        String crossSubscriptionTargetManagedInstanceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this.innerProperties().withCrossSubscriptionTargetManagedInstanceId(crossSubscriptionTargetManagedInstanceId);
        return this;
    }

    /**
     * Get the isLedgerOn property: Whether or not this database is a ledger database, which means all tables in the
     * database are ledger tables. Note: the value of this property cannot be changed after the database has been
     * created.
     *
     * @return the isLedgerOn value.
     */
    public Boolean isLedgerOn() {
        return this.innerProperties() == null ? null : this.innerProperties().isLedgerOn();
    }

    /**
     * Set the isLedgerOn property: Whether or not this database is a ledger database, which means all tables in the
     * database are ledger tables. Note: the value of this property cannot be changed after the database has been
     * created.
     *
     * @param isLedgerOn the isLedgerOn value to set.
     * @return the ManagedDatabaseUpdate object itself.
     */
    public ManagedDatabaseUpdate withIsLedgerOn(Boolean isLedgerOn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedDatabaseProperties();
        }
        this.innerProperties().withIsLedgerOn(isLedgerOn);
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
