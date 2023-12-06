// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for WebApps ListWorkflowsConnections.
 */
public final class WebAppsListWorkflowsConnectionsSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/ListWorkflowsConfigurationConnections
     * .json
     */
    /**
     * Sample code: List the Instance Workflows Configuration Connections.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        listTheInstanceWorkflowsConfigurationConnections(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getWebApps().listWorkflowsConnectionsWithResponse("testrg123",
            "testsite2", com.azure.core.util.Context.NONE);
    }
}
