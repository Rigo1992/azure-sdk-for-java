// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.models.SkuLocationInfo;

public final class SkuLocationInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuLocationInfo model
            = BinaryData.fromString("{\"location\":\"qduujitcjczdz\",\"zones\":[\"dhkrwpdappdsbdk\",\"wrwjfeu\"]}")
                .toObject(SkuLocationInfo.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuLocationInfo model = new SkuLocationInfo();
        model = BinaryData.fromObject(model).toObject(SkuLocationInfo.class);
    }
}
