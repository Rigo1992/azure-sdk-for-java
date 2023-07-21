// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for DataMaskingRules ListByDatabase. */
public final class DataMaskingRulesListByDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/DataMaskingRuleList.json
     */
    /**
     * Sample code: List data masking rules.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listDataMaskingRules(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDataMaskingRules()
            .listByDatabase(
                "sqlcrudtest-6852", "sqlcrudtest-2080", "sqlcrudtest-331", com.azure.core.util.Context.NONE);
    }
}
