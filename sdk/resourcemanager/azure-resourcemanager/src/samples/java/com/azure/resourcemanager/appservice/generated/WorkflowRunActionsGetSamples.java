// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for WorkflowRunActions Get. */
public final class WorkflowRunActionsGetSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/WorkflowRunActions_Get.json
     */
    /**
     * Sample code: Get a workflow run action.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAWorkflowRunAction(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWorkflowRunActions()
            .getWithResponse(
                "test-resource-group",
                "test-name",
                "test-workflow",
                "08586676746934337772206998657CU22",
                "HTTP",
                Context.NONE);
    }
}
