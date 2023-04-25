// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated;

/** Samples for NetworkSecurityPerimeterConfigurationsOperation CreateOrUpdate. */
public final class NetworkSecurityPerimeterConfigurationsOperationCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/preview/2022-10-01-preview/examples/NameSpaces/NetworkSecurityPerimeterConfigurationReconcile.json
     */
    /**
     * Sample code: NetworkSecurityPerimeterConfigurationList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkSecurityPerimeterConfigurationList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .eventHubs()
            .manager()
            .serviceClient()
            .getNetworkSecurityPerimeterConfigurationsOperations()
            .createOrUpdate(
                "SDK-EventHub-4794", "sdk-Namespace-5828", "resourceAssociation1", com.azure.core.util.Context.NONE);
    }
}
