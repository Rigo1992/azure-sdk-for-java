// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.VolumeInner;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VolumeInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeInner model =
            BinaryData
                .fromString(
                    "{\"extendedLocation\":{\"name\":\"qzinkfkbg\",\"type\":\"z\"},\"properties\":{\"attachedTo\":[\"xeqoc\",\"jmygvk\",\"qkjjeokbz\",\"fezrx\"],\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"rtle\",\"provisioningState\":\"Provisioning\",\"serialNumber\":\"bkwvzg\",\"sizeMiB\":3286584437525688934},\"location\":\"fbzdixzmqpnoda\",\"tags\":{\"tmcg\":\"qhewj\"},\"id\":\"bostzel\",\"name\":\"dlat\",\"type\":\"tmzlbiojlv\"}")
                .toObject(VolumeInner.class);
        Assertions.assertEquals("fbzdixzmqpnoda", model.location());
        Assertions.assertEquals("qhewj", model.tags().get("tmcg"));
        Assertions.assertEquals("qzinkfkbg", model.extendedLocation().name());
        Assertions.assertEquals("z", model.extendedLocation().type());
        Assertions.assertEquals(3286584437525688934L, model.sizeMiB());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeInner model =
            new VolumeInner()
                .withLocation("fbzdixzmqpnoda")
                .withTags(mapOf("tmcg", "qhewj"))
                .withExtendedLocation(new ExtendedLocation().withName("qzinkfkbg").withType("z"))
                .withSizeMiB(3286584437525688934L);
        model = BinaryData.fromObject(model).toObject(VolumeInner.class);
        Assertions.assertEquals("fbzdixzmqpnoda", model.location());
        Assertions.assertEquals("qhewj", model.tags().get("tmcg"));
        Assertions.assertEquals("qzinkfkbg", model.extendedLocation().name());
        Assertions.assertEquals("z", model.extendedLocation().type());
        Assertions.assertEquals(3286584437525688934L, model.sizeMiB());
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
