// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/**
 * Samples for Certificates Get.
 */
public final class CertificatesGetSamples {
    /*
     * x-ms-original-file:
     * specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/Certificates_Get.json
     */
    /**
     * Sample code: Certificates_Get.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void certificatesGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices().manager().serviceClient().getCertificates().getWithResponse("myResourceGroup",
            "myservice", "mycertificate", com.azure.core.util.Context.NONE);
    }
}
