// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ScanningMode;
import com.azure.resourcemanager.security.models.VmScannersBaseConfiguration;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VmScannersBaseConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VmScannersBaseConfiguration model = BinaryData
            .fromString("{\"scanningMode\":\"Default\",\"exclusionTags\":{\"mwgsghq\":\"haxttpf\",\"dd\":\"cum\"}}")
            .toObject(VmScannersBaseConfiguration.class);
        Assertions.assertEquals(ScanningMode.DEFAULT, model.scanningMode());
        Assertions.assertEquals("haxttpf", model.exclusionTags().get("mwgsghq"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VmScannersBaseConfiguration model = new VmScannersBaseConfiguration().withScanningMode(ScanningMode.DEFAULT)
            .withExclusionTags(mapOf("mwgsghq", "haxttpf", "dd", "cum"));
        model = BinaryData.fromObject(model).toObject(VmScannersBaseConfiguration.class);
        Assertions.assertEquals(ScanningMode.DEFAULT, model.scanningMode());
        Assertions.assertEquals("haxttpf", model.exclusionTags().get("mwgsghq"));
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
