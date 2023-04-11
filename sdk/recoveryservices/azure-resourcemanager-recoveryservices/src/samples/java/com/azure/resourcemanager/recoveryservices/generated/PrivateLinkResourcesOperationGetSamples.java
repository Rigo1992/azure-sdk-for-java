// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

/** Samples for PrivateLinkResourcesOperation Get. */
public final class PrivateLinkResourcesOperationGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2023-01-01/examples/GetPrivateLinkResources.json
     */
    /**
     * Sample code: Get PrivateLinkResource.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void getPrivateLinkResource(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager
            .privateLinkResourcesOperations()
            .getWithResponse("petesting", "pemsi-ecy-rsv2", "backupResource", com.azure.core.util.Context.NONE);
    }
}
