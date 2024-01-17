// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.AvailabilitySetResourceSettings;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AvailabilitySetResourceSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailabilitySetResourceSettings model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"Microsoft.Compute/availabilitySets\",\"tags\":{\"cohoq\":\"hzls\",\"hgyxzkonoc\":\"nwvlryavwhheunmm\",\"uconuqszfkbey\":\"koklya\"},\"faultDomain\":1315033601,\"updateDomain\":1004577663,\"targetResourceName\":\"mwvvjektcxsenhw\",\"targetResourceGroupName\":\"s\"}")
                .toObject(AvailabilitySetResourceSettings.class);
        Assertions.assertEquals("mwvvjektcxsenhw", model.targetResourceName());
        Assertions.assertEquals("s", model.targetResourceGroupName());
        Assertions.assertEquals("hzls", model.tags().get("cohoq"));
        Assertions.assertEquals(1315033601, model.faultDomain());
        Assertions.assertEquals(1004577663, model.updateDomain());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailabilitySetResourceSettings model =
            new AvailabilitySetResourceSettings()
                .withTargetResourceName("mwvvjektcxsenhw")
                .withTargetResourceGroupName("s")
                .withTags(mapOf("cohoq", "hzls", "hgyxzkonoc", "nwvlryavwhheunmm", "uconuqszfkbey", "koklya"))
                .withFaultDomain(1315033601)
                .withUpdateDomain(1004577663);
        model = BinaryData.fromObject(model).toObject(AvailabilitySetResourceSettings.class);
        Assertions.assertEquals("mwvvjektcxsenhw", model.targetResourceName());
        Assertions.assertEquals("s", model.targetResourceGroupName());
        Assertions.assertEquals("hzls", model.tags().get("cohoq"));
        Assertions.assertEquals(1315033601, model.faultDomain());
        Assertions.assertEquals(1004577663, model.updateDomain());
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
