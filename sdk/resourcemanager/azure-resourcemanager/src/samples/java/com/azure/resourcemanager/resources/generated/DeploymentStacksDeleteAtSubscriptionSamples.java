// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

/** Samples for DeploymentStacks DeleteAtSubscription. */
public final class DeploymentStacksDeleteAtSubscriptionSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/preview/2022-08-01-preview/examples/DeploymentStackSubscriptionDelete.json
     */
    /**
     * Sample code: DeploymentStacksDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deploymentStacksDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .deploymentStackClient()
            .getDeploymentStacks()
            .deleteAtSubscription("simpleDeploymentStack", null, null, com.azure.core.util.Context.NONE);
    }
}
