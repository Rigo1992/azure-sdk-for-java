// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.ResourceSkuLocationInfo;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ResourceSkuLocationInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceSkuLocationInfo model =
            BinaryData
                .fromString("{\"location\":\"flnrosfqpteehzz\",\"zones\":[\"yqrimzin\"]}")
                .toObject(ResourceSkuLocationInfo.class);
        Assertions.assertEquals("flnrosfqpteehzz", model.location());
        Assertions.assertEquals("yqrimzin", model.zones().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceSkuLocationInfo model =
            new ResourceSkuLocationInfo().withLocation("flnrosfqpteehzz").withZones(Arrays.asList("yqrimzin"));
        model = BinaryData.fromObject(model).toObject(ResourceSkuLocationInfo.class);
        Assertions.assertEquals("flnrosfqpteehzz", model.location());
        Assertions.assertEquals("yqrimzin", model.zones().get(0));
    }
}
