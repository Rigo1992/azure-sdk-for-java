// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

/**
 * Samples for DataFlows Get.
 */
public final class DataFlowsGetSamples {
    /*
     * x-ms-original-file:
     * specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/DataFlows_Get.json
     */
    /**
     * Sample code: DataFlows_Get.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void dataFlowsGet(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.dataFlows().getWithResponse("exampleResourceGroup", "exampleFactoryName", "exampleDataFlow", null,
            com.azure.core.util.Context.NONE);
    }
}
