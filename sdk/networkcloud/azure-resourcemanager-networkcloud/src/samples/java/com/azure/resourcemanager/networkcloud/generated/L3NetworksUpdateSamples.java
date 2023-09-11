// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.L3Network;
import java.util.HashMap;
import java.util.Map;

/** Samples for L3Networks Update. */
public final class L3NetworksUpdateSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/stable/2023-07-01/examples/L3Networks_Patch.json
     */
    /**
     * Sample code: Patch L3 network.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void patchL3Network(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        L3Network resource =
            manager
                .l3Networks()
                .getByResourceGroupWithResponse("resourceGroupName", "l3NetworkName", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder")).apply();
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
