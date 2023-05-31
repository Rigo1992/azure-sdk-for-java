// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.NotebookWorkspaceName;

/** Samples for NotebookWorkspaces Delete. */
public final class NotebookWorkspacesDeleteSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2023-03-15-preview/examples/CosmosDBNotebookWorkspaceDelete.json
     */
    /**
     * Sample code: CosmosDBNotebookWorkspaceDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBNotebookWorkspaceDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getNotebookWorkspaces()
            .delete("rg1", "ddb1", NotebookWorkspaceName.DEFAULT, com.azure.core.util.Context.NONE);
    }
}
