// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for ServerBlobAuditingPolicies Get. */
public final class ServerBlobAuditingPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-11-01-preview/examples/ServerBlobAuditingGet.json
     */
    /**
     * Sample code: Get a server's blob auditing policy.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAServerSBlobAuditingPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServerBlobAuditingPolicies()
            .getWithResponse("blobauditingtest-4799", "blobauditingtest-6440", com.azure.core.util.Context.NONE);
    }
}
