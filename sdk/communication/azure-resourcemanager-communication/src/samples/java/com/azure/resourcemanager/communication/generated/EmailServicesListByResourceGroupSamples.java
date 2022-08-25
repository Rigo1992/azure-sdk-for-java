// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.util.Context;

/** Samples for EmailServices ListByResourceGroup. */
public final class EmailServicesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-07-01-preview/examples/emailServices/listByResourceGroup.json
     */
    /**
     * Sample code: List EmailService resources by resource group.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void listEmailServiceResourcesByResourceGroup(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager.emailServices().listByResourceGroup("MyResourceGroup", Context.NONE);
    }
}
