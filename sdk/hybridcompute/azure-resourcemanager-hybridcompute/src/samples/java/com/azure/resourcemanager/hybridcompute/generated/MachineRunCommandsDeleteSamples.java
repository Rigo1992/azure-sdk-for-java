// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

/**
 * Samples for MachineRunCommands Delete.
 */
public final class MachineRunCommandsDeleteSamples {
    /*
     * x-ms-original-file: specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2024-03-31-preview/examples/runCommand/RunCommands_Delete.json
     */
    /**
     * Sample code: Delete a Machine Run Command.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void deleteAMachineRunCommand(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.machineRunCommands()
            .delete("myResourceGroup", "myMachine", "myRunCommand", com.azure.core.util.Context.NONE);
    }
}
