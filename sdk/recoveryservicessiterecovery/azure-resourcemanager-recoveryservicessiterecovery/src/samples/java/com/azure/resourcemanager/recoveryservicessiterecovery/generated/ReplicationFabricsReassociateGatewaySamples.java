// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.FailoverProcessServerRequest;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.FailoverProcessServerRequestProperties;
import java.util.Arrays;

/** Samples for ReplicationFabrics ReassociateGateway. */
public final class ReplicationFabricsReassociateGatewaySamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationFabrics_ReassociateGateway.json
     */
    /**
     * Sample code: Perform failover of the process server.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void performFailoverOfTheProcessServer(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationFabrics()
            .reassociateGateway(
                "MadhaviVault",
                "MadhaviVRG",
                "GRACE-V2A-1",
                new FailoverProcessServerRequest()
                    .withProperties(
                        new FailoverProcessServerRequestProperties()
                            .withContainerName("cloud_1f3c15af-2256-4568-9e06-e1ef4f728f75")
                            .withSourceProcessServerId("AFA0EC54-1894-4E44-9CAB02DB8854B117")
                            .withTargetProcessServerId("5D3ED340-85AE-C646-B338641E015DA405")
                            .withVmsToMigrate(Arrays.asList("Vm1", "Vm2"))
                            .withUpdateType("ServerLevel")),
                Context.NONE);
    }
}
