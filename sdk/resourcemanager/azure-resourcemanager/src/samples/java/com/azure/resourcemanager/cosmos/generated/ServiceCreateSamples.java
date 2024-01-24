// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.ServiceResourceCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.models.ServiceSize;
import com.azure.resourcemanager.cosmos.models.ServiceType;

/**
 * Samples for Service Create.
 */
public final class ServiceCreateSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-11-15-preview/examples/
     * CosmosDBSqlDedicatedGatewayServiceCreate.json
     */
    /**
     * Sample code: SqlDedicatedGatewayServiceCreate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void sqlDedicatedGatewayServiceCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getServices()
            .create("rg1", "ddb1", "SqlDedicatedGateway",
                new ServiceResourceCreateUpdateParameters().withInstanceSize(ServiceSize.COSMOS_D4S)
                    .withInstanceCount(1).withServiceType(ServiceType.SQL_DEDICATED_GATEWAY),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-11-15-preview/examples/
     * CosmosDBDataTransferServiceCreate.json
     */
    /**
     * Sample code: DataTransferServiceCreate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dataTransferServiceCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getServices().create("rg1", "ddb1", "DataTransfer",
            new ServiceResourceCreateUpdateParameters().withInstanceSize(ServiceSize.COSMOS_D4S).withInstanceCount(1)
                .withServiceType(ServiceType.DATA_TRANSFER),
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-11-15-preview/examples/
     * CosmosDBMaterializedViewsBuilderServiceCreate.json
     */
    /**
     * Sample code: MaterializedViewsBuilderServiceCreate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void materializedViewsBuilderServiceCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getServices()
            .create("rg1", "ddb1", "MaterializedViewsBuilder",
                new ServiceResourceCreateUpdateParameters().withInstanceSize(ServiceSize.COSMOS_D4S)
                    .withInstanceCount(1).withServiceType(ServiceType.MATERIALIZED_VIEWS_BUILDER),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-11-15-preview/examples/
     * CosmosDBGraphAPIComputeServiceCreate.json
     */
    /**
     * Sample code: GraphAPIComputeServiceCreate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void graphAPIComputeServiceCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getServices()
            .create("rg1", "ddb1", "GraphAPICompute",
                new ServiceResourceCreateUpdateParameters().withInstanceSize(ServiceSize.COSMOS_D4S)
                    .withInstanceCount(1).withServiceType(ServiceType.GRAPH_APICOMPUTE),
                com.azure.core.util.Context.NONE);
    }
}
