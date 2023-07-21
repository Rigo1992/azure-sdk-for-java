// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for Capabilities ListByLocation. */
public final class CapabilitiesListByLocationSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/LocationCapabilityListByLocation.json
     */
    /**
     * Sample code: List subscription capabilities in the given location.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listSubscriptionCapabilitiesInTheGivenLocation(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getCapabilities()
            .listByLocationWithResponse("eastus", null, com.azure.core.util.Context.NONE);
    }
}
