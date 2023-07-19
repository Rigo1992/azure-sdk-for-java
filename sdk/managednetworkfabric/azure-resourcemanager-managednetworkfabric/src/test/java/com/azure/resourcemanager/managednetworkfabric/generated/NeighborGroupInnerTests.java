// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NeighborGroupInner;
import com.azure.resourcemanager.managednetworkfabric.models.NeighborGroupDestination;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class NeighborGroupInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NeighborGroupInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"networkTapIds\":[\"oqueqihkkyowltj\",\"uwhldxwhieproqks\",\"fxmcvprstvk\",\"tbfjtdyotnplf\"],\"networkTapRuleIds\":[\"occqrqxw\",\"tjtdrhutfd\",\"a\",\"txop\"],\"provisioningState\":\"Updating\",\"destination\":{\"ipv4Addresses\":[\"k\",\"d\",\"gssz\"],\"ipv6Addresses\":[\"tkbbxuhar\",\"sirncclabvoy\",\"gsuxxczbmyqj\"]},\"annotation\":\"hdsaidj\"},\"location\":\"ormovdxxurntujmo\",\"tags\":{\"d\":\"nwemhdeeljslkyo\",\"jtv\":\"fzjuegrhrhtsl\"},\"id\":\"j\",\"name\":\"xvgjbfi\",\"type\":\"bpnjodf\"}")
                .toObject(NeighborGroupInner.class);
        Assertions.assertEquals("ormovdxxurntujmo", model.location());
        Assertions.assertEquals("nwemhdeeljslkyo", model.tags().get("d"));
        Assertions.assertEquals("k", model.destination().ipv4Addresses().get(0));
        Assertions.assertEquals("tkbbxuhar", model.destination().ipv6Addresses().get(0));
        Assertions.assertEquals("hdsaidj", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NeighborGroupInner model =
            new NeighborGroupInner()
                .withLocation("ormovdxxurntujmo")
                .withTags(mapOf("d", "nwemhdeeljslkyo", "jtv", "fzjuegrhrhtsl"))
                .withDestination(
                    new NeighborGroupDestination()
                        .withIpv4Addresses(Arrays.asList("k", "d", "gssz"))
                        .withIpv6Addresses(Arrays.asList("tkbbxuhar", "sirncclabvoy", "gsuxxczbmyqj")))
                .withAnnotation("hdsaidj");
        model = BinaryData.fromObject(model).toObject(NeighborGroupInner.class);
        Assertions.assertEquals("ormovdxxurntujmo", model.location());
        Assertions.assertEquals("nwemhdeeljslkyo", model.tags().get("d"));
        Assertions.assertEquals("k", model.destination().ipv4Addresses().get(0));
        Assertions.assertEquals("tkbbxuhar", model.destination().ipv6Addresses().get(0));
        Assertions.assertEquals("hdsaidj", model.annotation());
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