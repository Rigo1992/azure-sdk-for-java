// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.fluent.models.BlobContainerInner;
import com.azure.resourcemanager.storage.models.PublicAccess;
import java.util.HashMap;
import java.util.Map;

/** Samples for BlobContainers Update. */
public final class BlobContainersUpdateSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2022-09-01/examples/BlobContainersPatch.json
     */
    /**
     * Sample code: UpdateContainers.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateContainers(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getBlobContainers()
            .updateWithResponse(
                "res3376",
                "sto328",
                "container6185",
                new BlobContainerInner()
                    .withPublicAccess(PublicAccess.CONTAINER)
                    .withMetadata(mapOf("metadata", "true")),
                Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
