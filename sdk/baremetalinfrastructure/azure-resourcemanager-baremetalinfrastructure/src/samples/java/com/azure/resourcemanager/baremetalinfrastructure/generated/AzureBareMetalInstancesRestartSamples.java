// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.generated;

/** Samples for AzureBareMetalInstances Restart. */
public final class AzureBareMetalInstancesRestartSamples {
    /*
     * x-ms-original-file: specification/baremetalinfrastructure/resource-manager/Microsoft.BareMetalInfrastructure/preview/2023-08-04-preview/examples/AzureBareMetalInstances_Restart.json
     */
    /**
     * Sample code: Restart an Azure Bare Metal Instance.
     *
     * @param manager Entry point to BareMetalInfrastructureManager.
     */
    public static void restartAnAzureBareMetalInstance(
        com.azure.resourcemanager.baremetalinfrastructure.BareMetalInfrastructureManager manager) {
        manager
            .azureBareMetalInstances()
            .restart("myResourceGroup", "myABMInstance", null, com.azure.core.util.Context.NONE);
    }
}
