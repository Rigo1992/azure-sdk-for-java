// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.fluent.models.BackupVaultInner;
import com.azure.resourcemanager.netapp.models.BackupVault;
import com.azure.resourcemanager.netapp.models.BackupVaultPatch;
import java.util.Collections;
import java.util.Map;

public final class BackupVaultImpl implements BackupVault, BackupVault.Definition, BackupVault.Update {
    private BackupVaultInner innerObject;

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

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public BackupVaultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String backupVaultName;

    private BackupVaultPatch updateBody;

    public BackupVaultImpl withExistingNetAppAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public BackupVault create() {
        this.innerObject = serviceManager.serviceClient().getBackupVaults().createOrUpdate(resourceGroupName,
            accountName, backupVaultName, this.innerModel(), Context.NONE);
        return this;
    }

    public BackupVault create(Context context) {
        this.innerObject = serviceManager.serviceClient().getBackupVaults().createOrUpdate(resourceGroupName,
            accountName, backupVaultName, this.innerModel(), context);
        return this;
    }

    BackupVaultImpl(String name, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = new BackupVaultInner();
        this.serviceManager = serviceManager;
        this.backupVaultName = name;
    }

    public BackupVaultImpl update() {
        this.updateBody = new BackupVaultPatch();
        return this;
    }

    public BackupVault apply() {
        this.innerObject = serviceManager.serviceClient().getBackupVaults().update(resourceGroupName, accountName,
            backupVaultName, updateBody, Context.NONE);
        return this;
    }

    public BackupVault apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getBackupVaults().update(resourceGroupName, accountName,
            backupVaultName, updateBody, context);
        return this;
    }

    BackupVaultImpl(BackupVaultInner innerObject, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "netAppAccounts");
        this.backupVaultName = Utils.getValueFromIdByName(innerObject.id(), "backupVaults");
    }

    public BackupVault refresh() {
        this.innerObject = serviceManager.serviceClient().getBackupVaults()
            .getWithResponse(resourceGroupName, accountName, backupVaultName, Context.NONE).getValue();
        return this;
    }

    public BackupVault refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getBackupVaults()
            .getWithResponse(resourceGroupName, accountName, backupVaultName, context).getValue();
        return this;
    }

    public BackupVaultImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public BackupVaultImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public BackupVaultImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
