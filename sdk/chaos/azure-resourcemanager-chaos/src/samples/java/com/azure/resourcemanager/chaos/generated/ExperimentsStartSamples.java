// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

/** Samples for Experiments Start. */
public final class ExperimentsStartSamples {
    /*
     * x-ms-original-file: specification/chaos/resource-manager/Microsoft.Chaos/preview/2023-04-15-preview/examples/StartAExperiment.json
     */
    /**
     * Sample code: Start a Experiment.
     *
     * @param manager Entry point to ChaosManager.
     */
    public static void startAExperiment(com.azure.resourcemanager.chaos.ChaosManager manager) {
        manager.experiments().startWithResponse("exampleRG", "exampleExperiment", com.azure.core.util.Context.NONE);
    }
}