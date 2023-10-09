// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

import com.azure.resourcemanager.containerregistry.models.ReplicationUpdateParameters;
import java.util.HashMap;
import java.util.Map;

/** Samples for Replications Update. */
public final class ReplicationsUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-08-01-preview/examples/ReplicationUpdate.json
     */
    /**
     * Sample code: ReplicationUpdate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void replicationUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getReplications()
            .update(
                "myResourceGroup",
                "myRegistry",
                "myReplication",
                new ReplicationUpdateParameters().withTags(mapOf("key", "fakeTokenPlaceholder")),
                com.azure.core.util.Context.NONE);
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
