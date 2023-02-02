// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

/** Samples for WorkflowTriggers GetSchemaJson. */
public final class WorkflowTriggersGetSchemaJsonSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowTriggers_GetSchemaJson.json
     */
    /**
     * Sample code: Get trigger schema.
     *
     * @param manager Entry point to LogicManager.
     */
    public static void getTriggerSchema(com.azure.resourcemanager.logic.LogicManager manager) {
        manager
            .workflowTriggers()
            .getSchemaJsonWithResponse(
                "testResourceGroup", "testWorkflow", "testTrigger", com.azure.core.util.Context.NONE);
    }
}
