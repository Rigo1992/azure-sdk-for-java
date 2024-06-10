// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for WorkflowRunActionRepetitions Get.
 */
public final class WorkflowRunActionRepetitionsGetSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/WorkflowRunActionRepetitions_Get.json
     */
    /**
     * Sample code: Get a repetition.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getARepetition(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getWorkflowRunActionRepetitions()
            .getWithResponse("testResourceGroup", "test-name", "testFlow", "08586776228332053161046300351",
                "testAction", "000001", com.azure.core.util.Context.NONE);
    }
}
