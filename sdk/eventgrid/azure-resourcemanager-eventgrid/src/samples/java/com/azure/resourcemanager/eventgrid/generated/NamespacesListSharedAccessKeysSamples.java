// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/**
 * Samples for Namespaces ListSharedAccessKeys.
 */
public final class NamespacesListSharedAccessKeysSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2024-06-01-preview/examples/Namespaces_ListSharedAccessKeys.json
     */
    /**
     * Sample code: Namespaces_ListSharedAccessKeys.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void namespacesListSharedAccessKeys(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.namespaces()
            .listSharedAccessKeysWithResponse("examplerg", "exampleNamespaceName1", com.azure.core.util.Context.NONE);
    }
}
