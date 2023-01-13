// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

/** Samples for Experiments Delete. */
public final class ExperimentsDeleteSamples {
    /*
     * x-ms-original-file: specification/frontdoor/resource-manager/Microsoft.Network/stable/2019-11-01/examples/NetworkExperimentDeleteExperiment.json
     */
    /**
     * Sample code: Deletes an Experiment.
     *
     * @param manager Entry point to FrontDoorManager.
     */
    public static void deletesAnExperiment(com.azure.resourcemanager.frontdoor.FrontDoorManager manager) {
        manager.experiments().delete("MyResourceGroup", "MyProfile", "MyExperiment", com.azure.core.util.Context.NONE);
    }
}
