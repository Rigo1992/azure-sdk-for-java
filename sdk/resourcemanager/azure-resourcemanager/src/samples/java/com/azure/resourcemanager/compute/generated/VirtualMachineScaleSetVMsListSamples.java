// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/** Samples for VirtualMachineScaleSetVMs List. */
public final class VirtualMachineScaleSetVMsListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-07-01/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSetVM_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSetVM_List_MinimumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachineScaleSetVMListMinimumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSetVMs()
            .list("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", null, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-07-01/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSetVM_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSetVM_List_MaximumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachineScaleSetVMListMaximumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSetVMs()
            .list(
                "rgcompute",
                "aaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaa",
                com.azure.core.util.Context.NONE);
    }
}
