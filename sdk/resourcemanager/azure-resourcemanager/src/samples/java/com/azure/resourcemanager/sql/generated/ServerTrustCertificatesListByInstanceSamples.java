// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for ServerTrustCertificates ListByInstance. */
public final class ServerTrustCertificatesListByInstanceSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-11-01-preview/examples/ServerTrustCertificatesListByInstance.json
     */
    /**
     * Sample code: Gets a list of server trust certificates on a given server.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsAListOfServerTrustCertificatesOnAGivenServer(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServerTrustCertificates()
            .listByInstance("testrg", "testcl", com.azure.core.util.Context.NONE);
    }
}
