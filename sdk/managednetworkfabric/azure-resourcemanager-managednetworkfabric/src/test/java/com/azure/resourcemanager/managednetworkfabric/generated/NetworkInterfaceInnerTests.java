// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkInterfaceInner;
import org.junit.jupiter.api.Assertions;

public final class NetworkInterfaceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkInterfaceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"physicalIdentifier\":\"nsnaajphmp\",\"connectedTo\":\"jnglpwsad\",\"interfaceType\":\"Data\",\"ipv4Address\":\"umxpezcoi\",\"ipv6Address\":\"jrmfqzwqd\",\"provisioningState\":\"Deleting\",\"administrativeState\":\"Enabled\",\"annotation\":\"c\"},\"id\":\"wmywxfqzkvemy\",\"name\":\"dpczaqpqifd\",\"type\":\"m\"}")
                .toObject(NetworkInterfaceInner.class);
        Assertions.assertEquals("c", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkInterfaceInner model = new NetworkInterfaceInner().withAnnotation("c");
        model = BinaryData.fromObject(model).toObject(NetworkInterfaceInner.class);
        Assertions.assertEquals("c", model.annotation());
    }
}
