// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.models.VirtualNetworkConfig;
import org.junit.jupiter.api.Assertions;

public final class VirtualNetworkConfigTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualNetworkConfig model
            = BinaryData.fromString("{\"subnetId\":\"qduujitcjczdz\",\"proxyVmSize\":\"ndhkrw\"}")
                .toObject(VirtualNetworkConfig.class);
        Assertions.assertEquals("qduujitcjczdz", model.subnetId());
        Assertions.assertEquals("ndhkrw", model.proxyVmSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualNetworkConfig model = new VirtualNetworkConfig().withSubnetId("qduujitcjczdz").withProxyVmSize("ndhkrw");
        model = BinaryData.fromObject(model).toObject(VirtualNetworkConfig.class);
        Assertions.assertEquals("qduujitcjczdz", model.subnetId());
        Assertions.assertEquals("ndhkrw", model.proxyVmSize());
    }
}
