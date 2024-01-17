// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

/**
 * Samples for Services List.
 */
public final class ServicesListSamples {
    /*
     * x-ms-original-file:
     * specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/stable/2023-11-01/examples/legacy/
     * ServiceList.json
     */
    /**
     * Sample code: List all services in subscription.
     * 
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void
        listAllServicesInSubscription(com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        manager.services().list(com.azure.core.util.Context.NONE);
    }
}
