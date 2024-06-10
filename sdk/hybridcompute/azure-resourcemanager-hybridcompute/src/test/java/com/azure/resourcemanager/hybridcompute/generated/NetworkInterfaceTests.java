// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.IpAddress;
import com.azure.resourcemanager.hybridcompute.models.NetworkInterface;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkInterfaceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkInterface model = BinaryData.fromString(
            "{\"ipAddresses\":[{\"address\":\"xzko\",\"ipAddressVersion\":\"cukoklyaxuconu\",\"subnet\":{\"addressPrefix\":\"fkbey\"}},{\"address\":\"wrmjmwvvjektc\",\"ipAddressVersion\":\"enhwlrs\",\"subnet\":{\"addressPrefix\":\"zpwv\"}}]}")
            .toObject(NetworkInterface.class);
        Assertions.assertEquals("xzko", model.ipAddresses().get(0).address());
        Assertions.assertEquals("cukoklyaxuconu", model.ipAddresses().get(0).ipAddressVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkInterface model = new NetworkInterface()
            .withIpAddresses(Arrays.asList(new IpAddress().withAddress("xzko").withIpAddressVersion("cukoklyaxuconu"),
                new IpAddress().withAddress("wrmjmwvvjektc").withIpAddressVersion("enhwlrs")));
        model = BinaryData.fromObject(model).toObject(NetworkInterface.class);
        Assertions.assertEquals("xzko", model.ipAddresses().get(0).address());
        Assertions.assertEquals("cukoklyaxuconu", model.ipAddresses().get(0).ipAddressVersion());
    }
}
