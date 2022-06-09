// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for CodeContainers Get. */
public final class CodeContainersGetSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/CodeContainer/get.json
     */
    /**
     * Sample code: Get Code Container.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void getCodeContainer(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.codeContainers().getWithResponse("testrg123", "testworkspace", "testContainer", Context.NONE);
    }
}
