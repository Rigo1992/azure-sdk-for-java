// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/**
 * Samples for BackupVaults Get.
 */
public final class BackupVaultsGetSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/preview/2023-05-01-preview/examples/BackupVaults_Get.json
     */
    /**
     * Sample code: BackupVaults_Get.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void backupVaultsGet(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.backupVaults().getWithResponse("myRG", "account1", "backupVault1", com.azure.core.util.Context.NONE);
    }
}
