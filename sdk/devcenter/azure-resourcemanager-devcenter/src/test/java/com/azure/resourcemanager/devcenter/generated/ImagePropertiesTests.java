// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.ImageProperties;

public final class ImagePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageProperties model = BinaryData.fromString(
            "{\"description\":\"ped\",\"publisher\":\"jn\",\"offer\":\"ckhsmtxpsieb\",\"sku\":\"hvpesapskrdqm\",\"recommendedMachineConfiguration\":{\"memory\":{\"min\":1444957859,\"max\":1056627326},\"vCPUs\":{\"min\":2108720528,\"max\":1644974889}},\"provisioningState\":\"Updated\",\"hibernateSupport\":\"Disabled\"}")
            .toObject(ImageProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageProperties model = new ImageProperties();
        model = BinaryData.fromObject(model).toObject(ImageProperties.class);
    }
}
