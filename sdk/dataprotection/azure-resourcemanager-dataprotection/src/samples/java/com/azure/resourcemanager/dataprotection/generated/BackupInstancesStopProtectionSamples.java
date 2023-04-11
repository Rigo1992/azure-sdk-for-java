// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

/** Samples for BackupInstances StopProtection. */
public final class BackupInstancesStopProtectionSamples {
    /*
     * x-ms-original-file: specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2023-01-01/examples/BackupInstanceOperations/StopProtection.json
     */
    /**
     * Sample code: StopProtection.
     *
     * @param manager Entry point to DataProtectionManager.
     */
    public static void stopProtection(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.backupInstances().stopProtection("testrg", "testvault", "testbi", com.azure.core.util.Context.NONE);
    }
}
