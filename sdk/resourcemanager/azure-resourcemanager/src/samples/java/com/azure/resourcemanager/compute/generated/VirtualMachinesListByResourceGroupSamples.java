// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachines ListByResourceGroup. */
public final class VirtualMachinesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-03-01/examples/virtualMachineExamples/VirtualMachines_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_List_MaximumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachinesListMaximumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachines()
            .listByResourceGroup("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaa", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-03-01/examples/virtualMachineExamples/VirtualMachines_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_List_MinimumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachinesListMinimumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachines()
            .listByResourceGroup("rgcompute", null, Context.NONE);
    }
}
