// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.models.ElasticSanUpdate;
import com.azure.resourcemanager.elasticsan.models.PublicNetworkAccess;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ElasticSanUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ElasticSanUpdate model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"baseSizeTiB\":1438278296562022676,\"extendedCapacitySizeTiB\":9026620259515350080,\"publicNetworkAccess\":\"Disabled\"},\"tags\":{\"ksymd\":\"ureximoryocfs\",\"kiiuxhqyudxor\":\"ys\"}}")
                .toObject(ElasticSanUpdate.class);
        Assertions.assertEquals("ureximoryocfs", model.tags().get("ksymd"));
        Assertions.assertEquals(1438278296562022676L, model.baseSizeTiB());
        Assertions.assertEquals(9026620259515350080L, model.extendedCapacitySizeTiB());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ElasticSanUpdate model =
            new ElasticSanUpdate()
                .withTags(mapOf("ksymd", "ureximoryocfs", "kiiuxhqyudxor", "ys"))
                .withBaseSizeTiB(1438278296562022676L)
                .withExtendedCapacitySizeTiB(9026620259515350080L)
                .withPublicNetworkAccess(PublicNetworkAccess.DISABLED);
        model = BinaryData.fromObject(model).toObject(ElasticSanUpdate.class);
        Assertions.assertEquals("ureximoryocfs", model.tags().get("ksymd"));
        Assertions.assertEquals(1438278296562022676L, model.baseSizeTiB());
        Assertions.assertEquals(9026620259515350080L, model.extendedCapacitySizeTiB());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
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
