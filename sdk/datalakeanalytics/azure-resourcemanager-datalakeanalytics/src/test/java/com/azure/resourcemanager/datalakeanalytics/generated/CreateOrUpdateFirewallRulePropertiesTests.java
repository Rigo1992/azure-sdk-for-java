// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.CreateOrUpdateFirewallRuleProperties;
import org.junit.jupiter.api.Assertions;

public final class CreateOrUpdateFirewallRulePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateOrUpdateFirewallRuleProperties model =
            BinaryData
                .fromString("{\"startIpAddress\":\"vkocrcjdkwtn\",\"endIpAddress\":\"xbnjbiksq\"}")
                .toObject(CreateOrUpdateFirewallRuleProperties.class);
        Assertions.assertEquals("vkocrcjdkwtn", model.startIpAddress());
        Assertions.assertEquals("xbnjbiksq", model.endIpAddress());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateOrUpdateFirewallRuleProperties model =
            new CreateOrUpdateFirewallRuleProperties().withStartIpAddress("vkocrcjdkwtn").withEndIpAddress("xbnjbiksq");
        model = BinaryData.fromObject(model).toObject(CreateOrUpdateFirewallRuleProperties.class);
        Assertions.assertEquals("vkocrcjdkwtn", model.startIpAddress());
        Assertions.assertEquals("xbnjbiksq", model.endIpAddress());
    }
}
