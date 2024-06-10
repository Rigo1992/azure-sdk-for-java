// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.fluent.models.BackupInner;
import com.azure.resourcemanager.netapp.models.Backup;
import com.azure.resourcemanager.netapp.models.BackupPatch;
import com.azure.resourcemanager.netapp.models.BackupType;
import java.time.OffsetDateTime;

public final class BackupImpl implements Backup, Backup.Definition, Backup.Update {
    private BackupInner innerObject;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String backupId() {
        return this.innerModel().backupId();
    }

    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Long size() {
        return this.innerModel().size();
    }

    public String label() {
        return this.innerModel().label();
    }

    public BackupType backupType() {
        return this.innerModel().backupType();
    }

    public String failureReason() {
        return this.innerModel().failureReason();
    }

    public String volumeResourceId() {
        return this.innerModel().volumeResourceId();
    }

    public Boolean useExistingSnapshot() {
        return this.innerModel().useExistingSnapshot();
    }

    public String snapshotName() {
        return this.innerModel().snapshotName();
    }

    public String backupPolicyResourceId() {
        return this.innerModel().backupPolicyResourceId();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public BackupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String backupVaultName;

    private String backupName;

    private BackupPatch updateBody;

    public BackupImpl withExistingBackupVault(String resourceGroupName, String accountName, String backupVaultName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.backupVaultName = backupVaultName;
        return this;
    }

    public Backup create() {
        this.innerObject = serviceManager.serviceClient()
            .getBackups()
            .create(resourceGroupName, accountName, backupVaultName, backupName, this.innerModel(), Context.NONE);
        return this;
    }

    public Backup create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getBackups()
            .create(resourceGroupName, accountName, backupVaultName, backupName, this.innerModel(), context);
        return this;
    }

    BackupImpl(String name, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = new BackupInner();
        this.serviceManager = serviceManager;
        this.backupName = name;
    }

    public BackupImpl update() {
        this.updateBody = new BackupPatch();
        return this;
    }

    public Backup apply() {
        this.innerObject = serviceManager.serviceClient()
            .getBackups()
            .update(resourceGroupName, accountName, backupVaultName, backupName, updateBody, Context.NONE);
        return this;
    }

    public Backup apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getBackups()
            .update(resourceGroupName, accountName, backupVaultName, backupName, updateBody, context);
        return this;
    }

    BackupImpl(BackupInner innerObject, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "netAppAccounts");
        this.backupVaultName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "backupVaults");
        this.backupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "backups");
    }

    public Backup refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getBackups()
            .getWithResponse(resourceGroupName, accountName, backupVaultName, backupName, Context.NONE)
            .getValue();
        return this;
    }

    public Backup refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getBackups()
            .getWithResponse(resourceGroupName, accountName, backupVaultName, backupName, context)
            .getValue();
        return this;
    }

    public BackupImpl withVolumeResourceId(String volumeResourceId) {
        this.innerModel().withVolumeResourceId(volumeResourceId);
        return this;
    }

    public BackupImpl withLabel(String label) {
        if (isInCreateMode()) {
            this.innerModel().withLabel(label);
            return this;
        } else {
            this.updateBody.withLabel(label);
            return this;
        }
    }

    public BackupImpl withUseExistingSnapshot(Boolean useExistingSnapshot) {
        this.innerModel().withUseExistingSnapshot(useExistingSnapshot);
        return this;
    }

    public BackupImpl withSnapshotName(String snapshotName) {
        this.innerModel().withSnapshotName(snapshotName);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
