// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

/**
 * Samples for Pool Get.
 */
public final class PoolGetSamples {
    /*
     * x-ms-original-file:
     * specification/batch/resource-manager/Microsoft.Batch/stable/2023-11-01/examples/PoolGet_SecurityProfile.json
     */
    /**
     * Sample code: GetPool - SecurityProfile.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void getPoolSecurityProfile(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools().getWithResponse("default-azurebatch-japaneast", "sampleacct", "testpool",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2023-11-01/examples/
     * PoolGet_VirtualMachineConfiguration_Extensions.json
     */
    /**
     * Sample code: GetPool - VirtualMachineConfiguration Extensions.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void
        getPoolVirtualMachineConfigurationExtensions(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools().getWithResponse("default-azurebatch-japaneast", "sampleacct", "testpool",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2023-11-01/examples/
     * PoolGet_VirtualMachineConfiguration_MangedOSDisk.json
     */
    /**
     * Sample code: GetPool - VirtualMachineConfiguration OSDisk.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void getPoolVirtualMachineConfigurationOSDisk(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools().getWithResponse("default-azurebatch-japaneast", "sampleacct", "testpool",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2023-11-01/examples/
     * PoolGet_VirtualMachineConfiguration_ServiceArtifactReference.json
     */
    /**
     * Sample code: GetPool - VirtualMachineConfiguration ServiceArtifactReference.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void getPoolVirtualMachineConfigurationServiceArtifactReference(
        com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools().getWithResponse("default-azurebatch-japaneast", "sampleacct", "testpool",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/batch/resource-manager/Microsoft.Batch/stable/2023-11-01/examples/PoolGet_AcceleratedNetworking.
     * json
     */
    /**
     * Sample code: GetPool - AcceleratedNetworking.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void getPoolAcceleratedNetworking(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools().getWithResponse("default-azurebatch-japaneast", "sampleacct", "testpool",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2023-11-01/examples/PoolGet.json
     */
    /**
     * Sample code: GetPool.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void getPool(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools().getWithResponse("default-azurebatch-japaneast", "sampleacct", "testpool",
            com.azure.core.util.Context.NONE);
    }
}
