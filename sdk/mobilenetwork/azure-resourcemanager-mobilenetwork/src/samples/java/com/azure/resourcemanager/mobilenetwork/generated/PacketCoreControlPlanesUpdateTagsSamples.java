// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlane;
import java.util.HashMap;
import java.util.Map;

/** Samples for PacketCoreControlPlanes UpdateTags. */
public final class PacketCoreControlPlanesUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2022-11-01/examples/PacketCoreControlPlaneUpdateTags.json
     */
    /**
     * Sample code: Update packet core control plane tags.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void updatePacketCoreControlPlaneTags(
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        PacketCoreControlPlane resource =
            manager
                .packetCoreControlPlanes()
                .getByResourceGroupWithResponse("rg1", "TestPacketCoreCP", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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
