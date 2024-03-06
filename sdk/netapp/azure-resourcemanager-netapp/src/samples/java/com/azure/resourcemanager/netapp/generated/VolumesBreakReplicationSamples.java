// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.resourcemanager.netapp.models.BreakReplicationRequest;

/**
 * Samples for Volumes BreakReplication.
 */
public final class VolumesBreakReplicationSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/preview/2023-05-01-preview/examples/
     * Volumes_BreakReplication.json
     */
    /**
     * Sample code: Volumes_BreakReplication.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumesBreakReplication(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.volumes().breakReplication("myRG", "account1", "pool1", "volume1",
            new BreakReplicationRequest().withForceBreakReplication(false), com.azure.core.util.Context.NONE);
    }
}
