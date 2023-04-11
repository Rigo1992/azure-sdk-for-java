// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storagecache.fluent.models.AmlFilesystemInner;
import com.azure.resourcemanager.storagecache.models.AmlFilesystem;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemArchiveInfo;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemEncryptionSettings;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemHealth;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemIdentity;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemPropertiesHsm;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemPropertiesMaintenanceWindow;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemProvisioningStateType;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemUpdate;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemUpdatePropertiesMaintenanceWindow;
import com.azure.resourcemanager.storagecache.models.SkuName;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AmlFilesystemImpl implements AmlFilesystem, AmlFilesystem.Definition, AmlFilesystem.Update {
    private AmlFilesystemInner innerObject;

    private final com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager;

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

    public AmlFilesystemIdentity identity() {
        return this.innerModel().identity();
    }

    public SkuName sku() {
        return this.innerModel().sku();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public float storageCapacityTiB() {
        return this.innerModel().storageCapacityTiB();
    }

    public AmlFilesystemHealth health() {
        return this.innerModel().health();
    }

    public AmlFilesystemProvisioningStateType provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String filesystemSubnet() {
        return this.innerModel().filesystemSubnet();
    }

    public String mgsAddress() {
        return this.innerModel().mgsAddress();
    }

    public String mountCommand() {
        return this.innerModel().mountCommand();
    }

    public String lustreVersion() {
        return this.innerModel().lustreVersion();
    }

    public Integer throughputProvisionedMBps() {
        return this.innerModel().throughputProvisionedMBps();
    }

    public AmlFilesystemEncryptionSettings encryptionSettings() {
        return this.innerModel().encryptionSettings();
    }

    public AmlFilesystemPropertiesMaintenanceWindow maintenanceWindow() {
        return this.innerModel().maintenanceWindow();
    }

    public AmlFilesystemPropertiesHsm hsm() {
        return this.innerModel().hsm();
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

    public AmlFilesystemInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storagecache.StorageCacheManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String amlFilesystemName;

    private AmlFilesystemUpdate updateAmlFilesystem;

    public AmlFilesystemImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public AmlFilesystem create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAmlFilesystems()
                .createOrUpdate(resourceGroupName, amlFilesystemName, this.innerModel(), Context.NONE);
        return this;
    }

    public AmlFilesystem create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAmlFilesystems()
                .createOrUpdate(resourceGroupName, amlFilesystemName, this.innerModel(), context);
        return this;
    }

    AmlFilesystemImpl(String name, com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager) {
        this.innerObject = new AmlFilesystemInner();
        this.serviceManager = serviceManager;
        this.amlFilesystemName = name;
    }

    public AmlFilesystemImpl update() {
        this.updateAmlFilesystem = new AmlFilesystemUpdate();
        return this;
    }

    public AmlFilesystem apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAmlFilesystems()
                .update(resourceGroupName, amlFilesystemName, updateAmlFilesystem, Context.NONE);
        return this;
    }

    public AmlFilesystem apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAmlFilesystems()
                .update(resourceGroupName, amlFilesystemName, updateAmlFilesystem, context);
        return this;
    }

    AmlFilesystemImpl(
        AmlFilesystemInner innerObject, com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.amlFilesystemName = Utils.getValueFromIdByName(innerObject.id(), "amlFilesystems");
    }

    public AmlFilesystem refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAmlFilesystems()
                .getByResourceGroupWithResponse(resourceGroupName, amlFilesystemName, Context.NONE)
                .getValue();
        return this;
    }

    public AmlFilesystem refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAmlFilesystems()
                .getByResourceGroupWithResponse(resourceGroupName, amlFilesystemName, context)
                .getValue();
        return this;
    }

    public Response<Void> archiveWithResponse(AmlFilesystemArchiveInfo archiveInfo, Context context) {
        return serviceManager
            .amlFilesystems()
            .archiveWithResponse(resourceGroupName, amlFilesystemName, archiveInfo, context);
    }

    public void archive() {
        serviceManager.amlFilesystems().archive(resourceGroupName, amlFilesystemName);
    }

    public Response<Void> cancelArchiveWithResponse(Context context) {
        return serviceManager.amlFilesystems().cancelArchiveWithResponse(resourceGroupName, amlFilesystemName, context);
    }

    public void cancelArchive() {
        serviceManager.amlFilesystems().cancelArchive(resourceGroupName, amlFilesystemName);
    }

    public AmlFilesystemImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AmlFilesystemImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AmlFilesystemImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateAmlFilesystem.withTags(tags);
            return this;
        }
    }

    public AmlFilesystemImpl withIdentity(AmlFilesystemIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public AmlFilesystemImpl withSku(SkuName sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public AmlFilesystemImpl withZones(List<String> zones) {
        this.innerModel().withZones(zones);
        return this;
    }

    public AmlFilesystemImpl withStorageCapacityTiB(float storageCapacityTiB) {
        this.innerModel().withStorageCapacityTiB(storageCapacityTiB);
        return this;
    }

    public AmlFilesystemImpl withFilesystemSubnet(String filesystemSubnet) {
        this.innerModel().withFilesystemSubnet(filesystemSubnet);
        return this;
    }

    public AmlFilesystemImpl withEncryptionSettings(AmlFilesystemEncryptionSettings encryptionSettings) {
        if (isInCreateMode()) {
            this.innerModel().withEncryptionSettings(encryptionSettings);
            return this;
        } else {
            this.updateAmlFilesystem.withEncryptionSettings(encryptionSettings);
            return this;
        }
    }

    public AmlFilesystemImpl withMaintenanceWindow(AmlFilesystemPropertiesMaintenanceWindow maintenanceWindow) {
        this.innerModel().withMaintenanceWindow(maintenanceWindow);
        return this;
    }

    public AmlFilesystemImpl withHsm(AmlFilesystemPropertiesHsm hsm) {
        this.innerModel().withHsm(hsm);
        return this;
    }

    public AmlFilesystemImpl withMaintenanceWindow(AmlFilesystemUpdatePropertiesMaintenanceWindow maintenanceWindow) {
        this.updateAmlFilesystem.withMaintenanceWindow(maintenanceWindow);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
