// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for Connectors Get.
 */
public final class ConnectorsGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2020-01-01-preview/examples/Connectors/GetConnectorSubscription_example.json
     */
    /**
     * Sample code: Details of a specific cloud account connector.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void
        detailsOfASpecificCloudAccountConnector(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.connectors().getWithResponse("aws_dev1", com.azure.core.util.Context.NONE);
    }
}
