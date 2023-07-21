// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for ServerTrustCertificates Get. */
public final class ServerTrustCertificatesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-11-01-preview/examples/ServerTrustCertificatesGet.json
     */
    /**
     * Sample code: Gets server trust certificate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsServerTrustCertificate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServerTrustCertificates()
            .getWithResponse("testrg", "testcl", "customerCertificateName", com.azure.core.util.Context.NONE);
    }
}
