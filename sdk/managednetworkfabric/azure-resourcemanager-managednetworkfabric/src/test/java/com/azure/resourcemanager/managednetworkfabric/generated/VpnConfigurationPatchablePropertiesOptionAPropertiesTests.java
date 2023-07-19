// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.VpnConfigurationPatchablePropertiesOptionAProperties;
import org.junit.jupiter.api.Assertions;

public final class VpnConfigurationPatchablePropertiesOptionAPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VpnConfigurationPatchablePropertiesOptionAProperties model =
            BinaryData
                .fromString(
                    "{\"primaryIpv4Prefix\":\"sklkqnqvkixnm\",\"primaryIpv6Prefix\":\"mecuyrzwim\",\"secondaryIpv4Prefix\":\"ayspzvriet\",\"secondaryIpv6Prefix\":\"phmdzxplgtp\",\"mtu\":130554,\"vlanId\":1400650785,\"peerASN\":9083634510135709483,\"bfdConfiguration\":{\"administrativeState\":\"MAT\",\"intervalInMilliSeconds\":1662288047,\"multiplier\":2022282106}}")
                .toObject(VpnConfigurationPatchablePropertiesOptionAProperties.class);
        Assertions.assertEquals(130554, model.mtu());
        Assertions.assertEquals(1400650785, model.vlanId());
        Assertions.assertEquals(9083634510135709483L, model.peerAsn());
        Assertions.assertEquals(1662288047, model.bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(2022282106, model.bfdConfiguration().multiplier());
        Assertions.assertEquals("sklkqnqvkixnm", model.primaryIpv4Prefix());
        Assertions.assertEquals("mecuyrzwim", model.primaryIpv6Prefix());
        Assertions.assertEquals("ayspzvriet", model.secondaryIpv4Prefix());
        Assertions.assertEquals("phmdzxplgtp", model.secondaryIpv6Prefix());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VpnConfigurationPatchablePropertiesOptionAProperties model =
            new VpnConfigurationPatchablePropertiesOptionAProperties()
                .withMtu(130554)
                .withVlanId(1400650785)
                .withPeerAsn(9083634510135709483L)
                .withBfdConfiguration(
                    new BfdConfiguration().withIntervalInMilliSeconds(1662288047).withMultiplier(2022282106))
                .withPrimaryIpv4Prefix("sklkqnqvkixnm")
                .withPrimaryIpv6Prefix("mecuyrzwim")
                .withSecondaryIpv4Prefix("ayspzvriet")
                .withSecondaryIpv6Prefix("phmdzxplgtp");
        model = BinaryData.fromObject(model).toObject(VpnConfigurationPatchablePropertiesOptionAProperties.class);
        Assertions.assertEquals(130554, model.mtu());
        Assertions.assertEquals(1400650785, model.vlanId());
        Assertions.assertEquals(9083634510135709483L, model.peerAsn());
        Assertions.assertEquals(1662288047, model.bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(2022282106, model.bfdConfiguration().multiplier());
        Assertions.assertEquals("sklkqnqvkixnm", model.primaryIpv4Prefix());
        Assertions.assertEquals("mecuyrzwim", model.primaryIpv6Prefix());
        Assertions.assertEquals("ayspzvriet", model.secondaryIpv4Prefix());
        Assertions.assertEquals("phmdzxplgtp", model.secondaryIpv6Prefix());
    }
}