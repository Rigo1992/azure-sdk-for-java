// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestFailoverInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestFailoverInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestFailoverProviderSpecificInput;
import org.junit.jupiter.api.Assertions;

public final class TestFailoverInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TestFailoverInput model = BinaryData.fromString(
            "{\"properties\":{\"failoverDirection\":\"chvcyyysfgdo\",\"networkType\":\"ubiipuipwoqonma\",\"networkId\":\"ekni\",\"providerSpecificDetails\":{\"instanceType\":\"TestFailoverProviderSpecificInput\"}}}")
            .toObject(TestFailoverInput.class);
        Assertions.assertEquals("chvcyyysfgdo", model.properties().failoverDirection());
        Assertions.assertEquals("ubiipuipwoqonma", model.properties().networkType());
        Assertions.assertEquals("ekni", model.properties().networkId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TestFailoverInput model = new TestFailoverInput().withProperties(
            new TestFailoverInputProperties().withFailoverDirection("chvcyyysfgdo").withNetworkType("ubiipuipwoqonma")
                .withNetworkId("ekni").withProviderSpecificDetails(new TestFailoverProviderSpecificInput()));
        model = BinaryData.fromObject(model).toObject(TestFailoverInput.class);
        Assertions.assertEquals("chvcyyysfgdo", model.properties().failoverDirection());
        Assertions.assertEquals("ubiipuipwoqonma", model.properties().networkType());
        Assertions.assertEquals("ekni", model.properties().networkId());
    }
}
