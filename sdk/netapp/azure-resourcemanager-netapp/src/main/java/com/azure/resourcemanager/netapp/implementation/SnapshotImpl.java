// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotInner;
import com.azure.resourcemanager.netapp.models.Snapshot;
import com.azure.resourcemanager.netapp.models.SnapshotRestoreFiles;
import java.time.OffsetDateTime;

public final class SnapshotImpl implements Snapshot, Snapshot.Definition {
    private SnapshotInner innerObject;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    SnapshotImpl(SnapshotInner innerObject, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String snapshotId() {
        return this.innerModel().snapshotId();
    }

    public OffsetDateTime created() {
        return this.innerModel().created();
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

    public SnapshotInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String poolName;

    private String volumeName;

    private String snapshotName;

    public SnapshotImpl withExistingVolume(String resourceGroupName, String accountName, String poolName,
        String volumeName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.poolName = poolName;
        this.volumeName = volumeName;
        return this;
    }

    public Snapshot create() {
        this.innerObject = serviceManager.serviceClient().getSnapshots().create(resourceGroupName, accountName,
            poolName, volumeName, snapshotName, this.innerModel(), Context.NONE);
        return this;
    }

    public Snapshot create(Context context) {
        this.innerObject = serviceManager.serviceClient().getSnapshots().create(resourceGroupName, accountName,
            poolName, volumeName, snapshotName, this.innerModel(), context);
        return this;
    }

    SnapshotImpl(String name, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = new SnapshotInner();
        this.serviceManager = serviceManager;
        this.snapshotName = name;
    }

    public Snapshot refresh() {
        this.innerObject = serviceManager.serviceClient().getSnapshots()
            .getWithResponse(resourceGroupName, accountName, poolName, volumeName, snapshotName, Context.NONE)
            .getValue();
        return this;
    }

    public Snapshot refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getSnapshots()
            .getWithResponse(resourceGroupName, accountName, poolName, volumeName, snapshotName, context).getValue();
        return this;
    }

    public void restoreFiles(SnapshotRestoreFiles body) {
        serviceManager.snapshots().restoreFiles(resourceGroupName, accountName, poolName, volumeName, snapshotName,
            body);
    }

    public void restoreFiles(SnapshotRestoreFiles body, Context context) {
        serviceManager.snapshots().restoreFiles(resourceGroupName, accountName, poolName, volumeName, snapshotName,
            body, context);
    }

    public SnapshotImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SnapshotImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }
}
