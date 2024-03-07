// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated;

/**
 * Samples for Usages ListBySubscription.
 */
public final class UsagesListBySubscriptionSamples {
    /*
     * x-ms-original-file:
     * specification/search/resource-manager/Microsoft.Search/preview/2024-03-01-preview/examples/GetQuotaUsagesList.
     * json
     */
    /**
     * Sample code: GetQuotaUsagesList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getQuotaUsagesList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.searchServices().manager().serviceClient().getUsages().listBySubscription("westus", null,
            com.azure.core.util.Context.NONE);
    }
}
