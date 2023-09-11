// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridconnectivity.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridconnectivity.fluent.models.AadProfileProperties;
import org.junit.jupiter.api.Assertions;

public final class AadProfilePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AadProfileProperties model =
            BinaryData
                .fromString("{\"serverId\":\"yqduujit\",\"tenantId\":\"jczdzevndh\"}")
                .toObject(AadProfileProperties.class);
        Assertions.assertEquals("yqduujit", model.serverId());
        Assertions.assertEquals("jczdzevndh", model.tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AadProfileProperties model = new AadProfileProperties().withServerId("yqduujit").withTenantId("jczdzevndh");
        model = BinaryData.fromObject(model).toObject(AadProfileProperties.class);
        Assertions.assertEquals("yqduujit", model.serverId());
        Assertions.assertEquals("jczdzevndh", model.tenantId());
    }
}
