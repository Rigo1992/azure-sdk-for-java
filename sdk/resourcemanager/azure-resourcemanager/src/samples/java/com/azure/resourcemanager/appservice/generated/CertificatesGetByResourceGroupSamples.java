// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/** Samples for Certificates GetByResourceGroup. */
public final class CertificatesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/GetCertificate.json
     */
    /**
     * Sample code: Get Certificate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getCertificate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getCertificates()
            .getByResourceGroupWithResponse("testrg123", "testc6282", com.azure.core.util.Context.NONE);
    }
}
