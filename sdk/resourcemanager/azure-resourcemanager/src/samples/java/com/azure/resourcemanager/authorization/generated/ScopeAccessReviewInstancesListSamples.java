// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated;

/** Samples for ScopeAccessReviewInstances List. */
public final class ScopeAccessReviewInstancesListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewInstances.json
     */
    /**
     * Sample code: GetAccessReviews.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAccessReviews(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .accessManagement()
            .roleAssignments()
            .manager()
            .roleServiceClient()
            .getScopeAccessReviewInstances()
            .list(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "265785a7-a81f-4201-8a18-bb0db95982b7",
                null,
                com.azure.core.util.Context.NONE);
    }
}
