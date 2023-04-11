// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.NetworkInterfaceResourceNames;
import org.junit.jupiter.api.Assertions;

public final class NetworkInterfaceResourceNamesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkInterfaceResourceNames model =
            BinaryData
                .fromString("{\"networkInterfaceName\":\"ldsyuuximerqfob\"}")
                .toObject(NetworkInterfaceResourceNames.class);
        Assertions.assertEquals("ldsyuuximerqfob", model.networkInterfaceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkInterfaceResourceNames model =
            new NetworkInterfaceResourceNames().withNetworkInterfaceName("ldsyuuximerqfob");
        model = BinaryData.fromObject(model).toObject(NetworkInterfaceResourceNames.class);
        Assertions.assertEquals("ldsyuuximerqfob", model.networkInterfaceName());
    }
}
