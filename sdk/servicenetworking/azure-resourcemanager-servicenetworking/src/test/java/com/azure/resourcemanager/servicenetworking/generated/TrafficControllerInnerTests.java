// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicenetworking.fluent.models.TrafficControllerInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TrafficControllerInnerTests {
    @Test
    public void testDeserialize() {
        TrafficControllerInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"configurationEndpoints\":[\"vnipjox\",\"jnchgej\",\"podmailzydehojwy\"],\"frontends\":[{\"id\":\"xinpmqnjaq\"},{\"id\":\"ixjsprozvcputeg\"},{\"id\":\"vwmf\"}],\"associations\":[{\"id\":\"scmdvpjhulsuu\"}],\"provisioningState\":\"Failed\"},\"location\":\"ozkrwfndiodjpslw\",\"tags\":{\"azakl\":\"pvwryoqpsoacc\",\"fdosyg\":\"lahbcryff\",\"hcrzevd\":\"xpaojakhmsbz\",\"qjbpfzfsin\":\"hlxaolthqtr\"},\"id\":\"gvfcj\",\"name\":\"wzo\",\"type\":\"xjtfelluwfzit\"}")
                .toObject(TrafficControllerInner.class);
        Assertions.assertEquals("ozkrwfndiodjpslw", model.location());
        Assertions.assertEquals("pvwryoqpsoacc", model.tags().get("azakl"));
    }

    @Test
    public void testSerialize() {
        TrafficControllerInner model =
            new TrafficControllerInner()
                .withLocation("ozkrwfndiodjpslw")
                .withTags(
                    mapOf(
                        "azakl",
                        "pvwryoqpsoacc",
                        "fdosyg",
                        "lahbcryff",
                        "hcrzevd",
                        "xpaojakhmsbz",
                        "qjbpfzfsin",
                        "hlxaolthqtr"));
        model = BinaryData.fromObject(model).toObject(TrafficControllerInner.class);
        Assertions.assertEquals("ozkrwfndiodjpslw", model.location());
        Assertions.assertEquals("pvwryoqpsoacc", model.tags().get("azakl"));
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
