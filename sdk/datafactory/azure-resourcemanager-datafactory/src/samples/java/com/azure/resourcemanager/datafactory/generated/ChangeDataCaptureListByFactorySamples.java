// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

/**
 * Samples for ChangeDataCapture ListByFactory.
 */
public final class ChangeDataCaptureListByFactorySamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/ChangeDataCapture_ListByFactory.json
     */
    /**
     * Sample code: ChangeDataCapture_ListByFactory.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void
        changeDataCaptureListByFactory(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.changeDataCaptures()
            .listByFactory("exampleResourceGroup", "exampleFactoryName", com.azure.core.util.Context.NONE);
    }
}
