// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

/**
 * Samples for RegisteredIdentities Delete.
 */
public final class RegisteredIdentitiesDeleteSamples {
    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2024-04-01/examples/DeleteRegisteredIdentities.json
     */
    /**
     * Sample code: Delete registered Identity.
     * 
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void
        deleteRegisteredIdentity(com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager.registeredIdentities()
            .deleteWithResponse("BCDRIbzRG", "BCDRIbzVault", "dpmcontainer01", com.azure.core.util.Context.NONE);
    }
}
