// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for DedicatedHosts Redeploy.
 */
public final class DedicatedHostsRedeploySamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * dedicatedHostExamples/DedicatedHost_Redeploy.json
     */
    /**
     * Sample code: Redeploy Dedicated Host.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void redeployDedicatedHost(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getDedicatedHosts().redeploy("myResourceGroup",
            "myDedicatedHostGroup", "myHost", com.azure.core.util.Context.NONE);
    }
}
