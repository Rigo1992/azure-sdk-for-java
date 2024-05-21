// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

/**
 * Samples for Certificates List.
 */
public final class CertificatesListSamples {
    /*
     * x-ms-original-file: specification/nginx/resource-manager/NGINX.NGINXPLUS/preview/2024-01-01-preview/examples/Certificates_List.json
     */
    /**
     * Sample code: Certificates_List.
     * 
     * @param manager Entry point to NginxManager.
     */
    public static void certificatesList(com.azure.resourcemanager.nginx.NginxManager manager) {
        manager.certificates().list("myResourceGroup", "myDeployment", com.azure.core.util.Context.NONE);
    }
}
