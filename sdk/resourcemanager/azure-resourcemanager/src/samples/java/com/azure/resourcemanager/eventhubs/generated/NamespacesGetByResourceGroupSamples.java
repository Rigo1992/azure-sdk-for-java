// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated;

/** Samples for Namespaces GetByResourceGroup. */
public final class NamespacesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/preview/2022-10-01-preview/examples/NameSpaces/EHNameSpaceGet.json
     */
    /**
     * Sample code: NameSpaceGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void nameSpaceGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .eventHubs()
            .manager()
            .serviceClient()
            .getNamespaces()
            .getByResourceGroupWithResponse("ResurceGroupSample", "NamespaceSample", com.azure.core.util.Context.NONE);
    }
}
