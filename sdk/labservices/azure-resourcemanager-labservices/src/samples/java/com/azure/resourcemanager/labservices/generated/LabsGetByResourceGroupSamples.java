// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.generated;

import com.azure.core.util.Context;

/** Samples for Labs GetByResourceGroup. */
public final class LabsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/labservices/resource-manager/Microsoft.LabServices/preview/2021-11-15-preview/examples/Labs/getLab.json
     */
    /**
     * Sample code: getLab.
     *
     * @param manager Entry point to LabServicesManager.
     */
    public static void getLab(com.azure.resourcemanager.labservices.LabServicesManager manager) {
        manager.labs().getByResourceGroupWithResponse("testrg123", "testlab", Context.NONE);
    }
}
