// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for ServerDevOpsAuditSettings ListByServer. */
public final class ServerDevOpsAuditSettingsListByServerSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/ServerDevOpsAuditList.json
     */
    /**
     * Sample code: List DevOps audit settings of a server.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listDevOpsAuditSettingsOfAServer(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServerDevOpsAuditSettings()
            .listByServer("devAuditTestRG", "devOpsAuditTestSvr", com.azure.core.util.Context.NONE);
    }
}
