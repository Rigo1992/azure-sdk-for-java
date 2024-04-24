// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.models.PublicNetworkAccess;
import com.azure.resourcemanager.healthcareapis.models.ServicesPatchDescription;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ServicesPatchDescriptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServicesPatchDescription model = BinaryData.fromString(
            "{\"tags\":{\"rzevdphlxaol\":\"jakhmsbzjh\",\"fsinzgvfcjrwzoxx\":\"hqtrgqjbpf\",\"wfzitonpeqfpjk\":\"tfell\",\"nmayhuybb\":\"lxofpdvhpfxxypin\"},\"properties\":{\"publicNetworkAccess\":\"Enabled\"}}")
            .toObject(ServicesPatchDescription.class);
        Assertions.assertEquals("jakhmsbzjh", model.tags().get("rzevdphlxaol"));
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServicesPatchDescription model
            = new ServicesPatchDescription()
                .withTags(mapOf("rzevdphlxaol", "jakhmsbzjh", "fsinzgvfcjrwzoxx", "hqtrgqjbpf", "wfzitonpeqfpjk",
                    "tfell", "nmayhuybb", "lxofpdvhpfxxypin"))
                .withPublicNetworkAccess(PublicNetworkAccess.ENABLED);
        model = BinaryData.fromObject(model).toObject(ServicesPatchDescription.class);
        Assertions.assertEquals("jakhmsbzjh", model.tags().get("rzevdphlxaol"));
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
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
