// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.NetworkProfileInner;
import com.azure.resourcemanager.hybridcompute.models.IpAddress;
import com.azure.resourcemanager.hybridcompute.models.NetworkInterface;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkProfileInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkProfileInner model = BinaryData.fromString(
            "{\"networkInterfaces\":[{\"ipAddresses\":[{\"address\":\"oppusuesnzw\",\"ipAddressVersion\":\"jbavorxzdm\",\"subnet\":{\"addressPrefix\":\"tbqvudw\"}},{\"address\":\"ndnvo\",\"ipAddressVersion\":\"ujjugwdkcglh\",\"subnet\":{\"addressPrefix\":\"zj\"}},{\"address\":\"ggd\",\"ipAddressVersion\":\"ixhbkuofqweykhm\",\"subnet\":{\"addressPrefix\":\"vfyexfw\"}},{\"address\":\"bcibvyvdcsitynn\",\"ipAddressVersion\":\"mdectehfiqscjey\",\"subnet\":{\"addressPrefix\":\"ezrkgqhcjrefo\"}}]},{\"ipAddresses\":[{\"address\":\"qsl\",\"ipAddressVersion\":\"yvxyqjp\",\"subnet\":{\"addressPrefix\":\"t\"}},{\"address\":\"ngj\",\"ipAddressVersion\":\"cczsq\",\"subnet\":{\"addressPrefix\":\"vmdajvnysou\"}},{\"address\":\"e\",\"ipAddressVersion\":\"noae\",\"subnet\":{\"addressPrefix\":\"hy\"}}]},{\"ipAddresses\":[{\"address\":\"pmopjmc\",\"ipAddressVersion\":\"tuo\",\"subnet\":{\"addressPrefix\":\"fu\"}},{\"address\":\"aodsfcpkv\",\"ipAddressVersion\":\"dpuozmyz\",\"subnet\":{\"addressPrefix\":\"gf\"}}]},{\"ipAddresses\":[{\"address\":\"ezyiuokktwhrdxw\",\"ipAddressVersion\":\"wqsmbsur\",\"subnet\":{\"addressPrefix\":\"moryocfsfksym\"}},{\"address\":\"ys\",\"ipAddressVersion\":\"i\",\"subnet\":{\"addressPrefix\":\"hqyudxorrqnbpoc\"}},{\"address\":\"yifqrvkdvjsllrmv\",\"ipAddressVersion\":\"f\",\"subnet\":{\"addressPrefix\":\"kpnpulexxbczwtr\"}},{\"address\":\"iqzbq\",\"ipAddressVersion\":\"sovmyokacspkwl\",\"subnet\":{\"addressPrefix\":\"obpxjmflbvvn\"}}]}]}")
            .toObject(NetworkProfileInner.class);
        Assertions.assertEquals("oppusuesnzw", model.networkInterfaces().get(0).ipAddresses().get(0).address());
        Assertions.assertEquals("jbavorxzdm", model.networkInterfaces().get(0).ipAddresses().get(0).ipAddressVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkProfileInner model
            = new NetworkProfileInner()
                .withNetworkInterfaces(
                    Arrays.asList(
                        new NetworkInterface().withIpAddresses(
                            Arrays.asList(new IpAddress().withAddress("oppusuesnzw").withIpAddressVersion("jbavorxzdm"),
                                new IpAddress().withAddress("ndnvo").withIpAddressVersion("ujjugwdkcglh"),
                                new IpAddress().withAddress("ggd").withIpAddressVersion("ixhbkuofqweykhm"),
                                new IpAddress().withAddress("bcibvyvdcsitynn")
                                    .withIpAddressVersion("mdectehfiqscjey"))),
                        new NetworkInterface().withIpAddresses(
                            Arrays.asList(new IpAddress().withAddress("qsl").withIpAddressVersion("yvxyqjp"),
                                new IpAddress().withAddress("ngj").withIpAddressVersion("cczsq"),
                                new IpAddress().withAddress("e").withIpAddressVersion("noae"))),
                        new NetworkInterface().withIpAddresses(
                            Arrays.asList(new IpAddress().withAddress("pmopjmc").withIpAddressVersion("tuo"),
                                new IpAddress().withAddress("aodsfcpkv").withIpAddressVersion("dpuozmyz"))),
                        new NetworkInterface().withIpAddresses(Arrays.asList(
                            new IpAddress().withAddress("ezyiuokktwhrdxw").withIpAddressVersion("wqsmbsur"),
                            new IpAddress().withAddress("ys").withIpAddressVersion("i"),
                            new IpAddress().withAddress("yifqrvkdvjsllrmv").withIpAddressVersion("f"),
                            new IpAddress().withAddress("iqzbq").withIpAddressVersion("sovmyokacspkwl")))));
        model = BinaryData.fromObject(model).toObject(NetworkProfileInner.class);
        Assertions.assertEquals("oppusuesnzw", model.networkInterfaces().get(0).ipAddresses().get(0).address());
        Assertions.assertEquals("jbavorxzdm", model.networkInterfaces().get(0).ipAddresses().get(0).ipAddressVersion());
    }
}
