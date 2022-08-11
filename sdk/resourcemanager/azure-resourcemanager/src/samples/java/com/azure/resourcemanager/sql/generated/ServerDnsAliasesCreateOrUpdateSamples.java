// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for ServerDnsAliases CreateOrUpdate. */
public final class ServerDnsAliasesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2017-03-01-preview/examples/ServerDnsAliasCreateOrUpdate.json
     */
    /**
     * Sample code: Create server DNS alias.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createServerDNSAlias(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServerDnsAliases()
            .createOrUpdate("Default", "dns-alias-server", "dns-alias-name-1", Context.NONE);
    }
}
