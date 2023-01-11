// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.models.ElasticPoolLicenseType;
import com.azure.resourcemanager.sql.models.ElasticPoolPerDatabaseSettings;
import com.azure.resourcemanager.sql.models.ElasticPoolUpdate;
import com.azure.resourcemanager.sql.models.Sku;

/** Samples for ElasticPools Update. */
public final class ElasticPoolsUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ElasticPoolUpdateMax.json
     */
    /**
     * Sample code: Update an elastic pool with all parameter.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAnElasticPoolWithAllParameter(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getElasticPools()
            .update(
                "sqlcrudtest-2369",
                "sqlcrudtest-8069",
                "sqlcrudtest-8102",
                new ElasticPoolUpdate()
                    .withSku(new Sku().withName("BC_Gen4").withTier("BusinessCritical").withCapacity(2))
                    .withPerDatabaseSettings(
                        new ElasticPoolPerDatabaseSettings().withMinCapacity(0.25D).withMaxCapacity(1.0D))
                    .withZoneRedundant(true)
                    .withLicenseType(ElasticPoolLicenseType.LICENSE_INCLUDED),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/HyperscaleElasticPoolUpdateSetHighAvailabilityReplicaCount.json
     */
    /**
     * Sample code: Update high availability replica count of a Hyperscale elastic pool.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateHighAvailabilityReplicaCountOfAHyperscaleElasticPool(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getElasticPools()
            .update(
                "sqlcrudtest-2369",
                "sqlcrudtest-8069",
                "sqlcrudtest-8102",
                new ElasticPoolUpdate().withHighAvailabilityReplicaCount(2),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ElasticPoolUpdateMin.json
     */
    /**
     * Sample code: Update an elastic pool with minimum parameters.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAnElasticPoolWithMinimumParameters(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getElasticPools()
            .update("sqlcrudtest-2369", "sqlcrudtest-8069", "sqlcrudtest-8102", new ElasticPoolUpdate(), Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ElasticPoolUpdateAssignMaintenanceConfiguration.json
     */
    /**
     * Sample code: Assigns maintenance configuration to an elastic pool.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void assignsMaintenanceConfigurationToAnElasticPool(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getElasticPools()
            .update(
                "sqlcrudtest-2369",
                "sqlcrudtest-8069",
                "sqlcrudtest-8102",
                new ElasticPoolUpdate()
                    .withMaintenanceConfigurationId(
                        "/subscriptions/00000000-1111-2222-3333-444444444444/providers/Microsoft.Maintenance/publicMaintenanceConfigurations/SQL_JapanEast_1"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ElasticPoolUpdateResetMaintenanceConfiguration.json
     */
    /**
     * Sample code: Resets maintenance configuration of an elastic pool to default.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void resetsMaintenanceConfigurationOfAnElasticPoolToDefault(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getElasticPools()
            .update(
                "sqlcrudtest-2369",
                "sqlcrudtest-8069",
                "sqlcrudtest-8102",
                new ElasticPoolUpdate()
                    .withMaintenanceConfigurationId(
                        "/subscriptions/00000000-1111-2222-3333-444444444444/providers/Microsoft.Maintenance/publicMaintenanceConfigurations/SQL_Default"),
                Context.NONE);
    }
}
