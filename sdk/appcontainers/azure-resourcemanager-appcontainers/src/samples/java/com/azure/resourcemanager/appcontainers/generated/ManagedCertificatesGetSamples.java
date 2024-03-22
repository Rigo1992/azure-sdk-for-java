// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for ManagedCertificates Get.
 */
public final class ManagedCertificatesGetSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/preview/2023-11-02-preview/examples/ManagedCertificate_Get.json
     */
    /**
     * Sample code: Get Certificate.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getCertificate(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedCertificates().getWithResponse("examplerg", "testcontainerenv", "certificate-firendly-name",
            com.azure.core.util.Context.NONE);
    }
}
