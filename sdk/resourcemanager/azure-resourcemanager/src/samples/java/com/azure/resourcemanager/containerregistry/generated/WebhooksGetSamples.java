// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/** Samples for Webhooks Get. */
public final class WebhooksGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-08-01-preview/examples/WebhookGet.json
     */
    /**
     * Sample code: WebhookGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void webhookGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getWebhooks()
            .getWithResponse("myResourceGroup", "myRegistry", "myWebhook", com.azure.core.util.Context.NONE);
    }
}
