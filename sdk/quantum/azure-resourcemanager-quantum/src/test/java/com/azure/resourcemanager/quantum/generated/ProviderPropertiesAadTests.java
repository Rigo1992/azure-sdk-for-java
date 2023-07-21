// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quantum.models.ProviderPropertiesAad;

public final class ProviderPropertiesAadTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProviderPropertiesAad model =
            BinaryData
                .fromString("{\"applicationId\":\"qolbgyc\",\"tenantId\":\"iertgccymvaolp\"}")
                .toObject(ProviderPropertiesAad.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProviderPropertiesAad model = new ProviderPropertiesAad();
        model = BinaryData.fromObject(model).toObject(ProviderPropertiesAad.class);
    }
}