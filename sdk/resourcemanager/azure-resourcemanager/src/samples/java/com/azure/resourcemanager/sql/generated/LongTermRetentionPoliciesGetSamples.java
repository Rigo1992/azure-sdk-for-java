// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.models.LongTermRetentionPolicyName;

/** Samples for LongTermRetentionPolicies Get. */
public final class LongTermRetentionPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/LongTermRetentionPolicyGet.json
     */
    /**
     * Sample code: Get the long term retention policy for the database.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getTheLongTermRetentionPolicyForTheDatabase(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getLongTermRetentionPolicies()
            .getWithResponse(
                "resourceGroup",
                "testserver",
                "testDatabase",
                LongTermRetentionPolicyName.DEFAULT,
                com.azure.core.util.Context.NONE);
    }
}
