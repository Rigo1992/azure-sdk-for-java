// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.resourcemanager.mobilenetwork.models.ManagedServiceIdentity;
import com.azure.resourcemanager.mobilenetwork.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.mobilenetwork.models.SimGroup;
import com.azure.resourcemanager.mobilenetwork.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;

/** Samples for SimGroups UpdateTags. */
public final class SimGroupsUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2023-09-01/examples/SimGroupPatch.json
     */
    /**
     * Sample code: Patch SIM group.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void patchSIMGroup(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        SimGroup resource =
            manager
                .simGroups()
                .getByResourceGroupWithResponse("rg1", "testSimGroup", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/testUserAssignedManagedIdentity",
                            new UserAssignedIdentity())))
            .apply();
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
