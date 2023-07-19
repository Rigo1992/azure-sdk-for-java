// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated;

import com.azure.resourcemanager.authorization.fluent.models.AccessReviewHistoryDefinitionProperties;

/** Samples for ScopeAccessReviewHistoryDefinitionOperation Create. */
public final class ScopeAccessReviewHistoryDefinitionOperationCreateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/PutAccessReviewHistoryDefinition.json
     */
    /**
     * Sample code: PutAccessReviewHistoryDefinition.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void putAccessReviewHistoryDefinition(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .accessManagement()
            .roleAssignments()
            .manager()
            .roleServiceClient()
            .getScopeAccessReviewHistoryDefinitionOperations()
            .createWithResponse(
                "subscriptions/129a304b-4aea-4b86-a9f7-ba7e2b23737a",
                "44724910-d7a5-4c29-b28f-db73e717165a",
                new AccessReviewHistoryDefinitionProperties(),
                com.azure.core.util.Context.NONE);
    }
}
