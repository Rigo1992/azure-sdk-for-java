// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.models.ServerDnsAliasAcquisition;

/** Samples for ServerDnsAliases Acquire. */
public final class ServerDnsAliasesAcquireSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ServerDnsAliasAcquire.json
     */
    /**
     * Sample code: Acquire server DNS alias.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void acquireServerDNSAlias(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServerDnsAliases()
            .acquire(
                "Default",
                "dns-alias-new-server",
                "dns-alias-name-1",
                new ServerDnsAliasAcquisition()
                    .withOldServerDnsAliasId(
                        "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default/providers/Microsoft.Sql/servers/dns-alias-old-server/dnsAliases/dns-alias-name-1"),
                com.azure.core.util.Context.NONE);
    }
}
