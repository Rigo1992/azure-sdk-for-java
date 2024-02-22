// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.resourcemanager.recoveryservicessiterecovery.models.AddRecoveryServicesProviderInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.IdentityProviderInput;

/**
 * Samples for ReplicationRecoveryServicesProviders Create.
 */
public final class ReplicationRecoveryServicesProvidersCreateSampl {
    /*
     * x-ms-original-file:
     * specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2023-08-01/examples
     * /ReplicationRecoveryServicesProviders_Create.json
     */
    /**
     * Sample code: Adds a recovery services provider.
     * 
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void addsARecoveryServicesProvider(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationRecoveryServicesProviders().define("vmwareprovider1")
            .withExistingReplicationFabric("migrationvault", "resourcegroup1", "vmwarefabric1")
            .withProperties(new AddRecoveryServicesProviderInputProperties().withMachineName("vmwareprovider1")
                .withAuthenticationIdentityInput(
                    new IdentityProviderInput().withTenantId("72f988bf-86f1-41af-91ab-2d7cd011db47")
                        .withApplicationId("f66fce08-c0c6-47a1-beeb-0ede5ea94f90")
                        .withObjectId("141360b8-5686-4240-a027-5e24e6affeba")
                        .withAudience("https://microsoft.onmicrosoft.com/cf19e349-644c-4c6a-bcae-9c8f35357874")
                        .withAadAuthority("https://login.microsoftonline.com"))
                .withResourceAccessIdentityInput(
                    new IdentityProviderInput().withTenantId("72f988bf-86f1-41af-91ab-2d7cd011db47")
                        .withApplicationId("f66fce08-c0c6-47a1-beeb-0ede5ea94f90")
                        .withObjectId("141360b8-5686-4240-a027-5e24e6affeba")
                        .withAudience("https://microsoft.onmicrosoft.com/cf19e349-644c-4c6a-bcae-9c8f35357874")
                        .withAadAuthority("https://login.microsoftonline.com")))
            .create();
    }
}
