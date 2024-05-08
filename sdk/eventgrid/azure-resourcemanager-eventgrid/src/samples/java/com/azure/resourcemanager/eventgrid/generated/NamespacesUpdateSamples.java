// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.resourcemanager.eventgrid.models.Namespace;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Namespaces Update.
 */
public final class NamespacesUpdateSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2024-06-01-preview/examples/Namespaces_Update.json
     */
    /**
     * Sample code: Namespaces_Update.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void namespacesUpdate(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        Namespace resource = manager.namespaces()
            .getByResourceGroupWithResponse("examplerg", "exampleNamespaceName1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("tag1", "value1Updated")).apply();
    }

    // Use "Map.of" if available
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
