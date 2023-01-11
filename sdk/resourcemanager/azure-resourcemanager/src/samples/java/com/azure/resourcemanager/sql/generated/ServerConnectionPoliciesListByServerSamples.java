// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for ServerConnectionPolicies ListByServer. */
public final class ServerConnectionPoliciesListByServerSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ServerConnectionPoliciesList.json
     */
    /**
     * Sample code: Lists a servers connection policies.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listsAServersConnectionPolicies(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServerConnectionPolicies()
            .listByServer("rgtest-12", "servertest-6285", Context.NONE);
    }
}
