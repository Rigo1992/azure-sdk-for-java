// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.connectedvmware.models.IpAddressAllocationMethod;
import com.azure.resourcemanager.connectedvmware.models.NicIpSettings;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NicIpSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NicIpSettings model =
            BinaryData
                .fromString(
                    "{\"allocationMethod\":\"random\",\"dnsServers\":[\"vfelfktgplcrpwj\"],\"gateway\":[\"noigbrnjwmwk\",\"nbsazejjoqkag\"],\"ipAddress\":\"sxtta\",\"subnetMask\":\"zxnfaaz\",\"primaryWinsServer\":\"dtnkdmkq\",\"secondaryWinsServer\":\"lwuenvrkp\",\"ipAddressInfo\":[{\"allocationMethod\":\"ibreb\",\"ipAddress\":\"aysjkixqtnqttez\",\"subnetMask\":\"fffiak\"},{\"allocationMethod\":\"pqqmted\",\"ipAddress\":\"mmji\",\"subnetMask\":\"eozphv\"},{\"allocationMethod\":\"uyqncygupkvipmd\",\"ipAddress\":\"wx\",\"subnetMask\":\"pevzhfst\"},{\"allocationMethod\":\"xhojuj\",\"ipAddress\":\"pelmcuvhixbjxyf\",\"subnetMask\":\"yl\"}]}")
                .toObject(NicIpSettings.class);
        Assertions.assertEquals(IpAddressAllocationMethod.RANDOM, model.allocationMethod());
        Assertions.assertEquals("vfelfktgplcrpwj", model.dnsServers().get(0));
        Assertions.assertEquals("noigbrnjwmwk", model.gateway().get(0));
        Assertions.assertEquals("sxtta", model.ipAddress());
        Assertions.assertEquals("zxnfaaz", model.subnetMask());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NicIpSettings model =
            new NicIpSettings()
                .withAllocationMethod(IpAddressAllocationMethod.RANDOM)
                .withDnsServers(Arrays.asList("vfelfktgplcrpwj"))
                .withGateway(Arrays.asList("noigbrnjwmwk", "nbsazejjoqkag"))
                .withIpAddress("sxtta")
                .withSubnetMask("zxnfaaz");
        model = BinaryData.fromObject(model).toObject(NicIpSettings.class);
        Assertions.assertEquals(IpAddressAllocationMethod.RANDOM, model.allocationMethod());
        Assertions.assertEquals("vfelfktgplcrpwj", model.dnsServers().get(0));
        Assertions.assertEquals("noigbrnjwmwk", model.gateway().get(0));
        Assertions.assertEquals("sxtta", model.ipAddress());
        Assertions.assertEquals("zxnfaaz", model.subnetMask());
    }
}
