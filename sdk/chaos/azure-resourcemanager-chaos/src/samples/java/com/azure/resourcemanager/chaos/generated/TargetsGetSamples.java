// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

/** Samples for Targets Get. */
public final class TargetsGetSamples {
    /*
     * x-ms-original-file: specification/chaos/resource-manager/Microsoft.Chaos/stable/2023-11-01/examples/GetTarget.json
     */
    /**
     * Sample code: Get a Target that extends a virtual machine resource.
     *
     * @param manager Entry point to ChaosManager.
     */
    public static void getATargetThatExtendsAVirtualMachineResource(
        com.azure.resourcemanager.chaos.ChaosManager manager) {
        manager
            .targets()
            .getWithResponse(
                "exampleRG",
                "Microsoft.Compute",
                "virtualMachines",
                "exampleVM",
                "Microsoft-Agent",
                com.azure.core.util.Context.NONE);
    }
}
