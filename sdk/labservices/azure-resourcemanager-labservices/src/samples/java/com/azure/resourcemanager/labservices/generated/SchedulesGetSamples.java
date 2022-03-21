// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.generated;

import com.azure.core.util.Context;

/** Samples for Schedules Get. */
public final class SchedulesGetSamples {
    /*
     * x-ms-original-file: specification/labservices/resource-manager/Microsoft.LabServices/preview/2021-11-15-preview/examples/Schedules/getSchedule.json
     */
    /**
     * Sample code: getSchedule.
     *
     * @param manager Entry point to LabServicesManager.
     */
    public static void getSchedule(com.azure.resourcemanager.labservices.LabServicesManager manager) {
        manager.schedules().getWithResponse("testrg123", "testlab", "schedule1", Context.NONE);
    }
}
