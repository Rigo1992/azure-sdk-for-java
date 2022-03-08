// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.Context;

/** Samples for VolumeGroups Delete. */
public final class VolumeGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2021-10-01/examples/VolumeGroups_Delete.json
     */
    /**
     * Sample code: VolumeGroups_Delete.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumeGroupsDelete(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.volumeGroups().delete("myRG", "account1", "group1", Context.NONE);
    }
}
