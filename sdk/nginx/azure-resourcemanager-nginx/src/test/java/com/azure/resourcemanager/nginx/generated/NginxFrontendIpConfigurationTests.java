// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.models.NginxFrontendIpConfiguration;
import com.azure.resourcemanager.nginx.models.NginxPrivateIpAddress;
import com.azure.resourcemanager.nginx.models.NginxPrivateIpAllocationMethod;
import com.azure.resourcemanager.nginx.models.NginxPublicIpAddress;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NginxFrontendIpConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NginxFrontendIpConfiguration model = BinaryData.fromString(
            "{\"publicIPAddresses\":[{\"id\":\"jugwdkcglhsl\"},{\"id\":\"jdyggdtji\"},{\"id\":\"b\"}],\"privateIPAddresses\":[{\"privateIPAddress\":\"qweykhmenev\",\"privateIPAllocationMethod\":\"Static\",\"subnetId\":\"fwhybcibvy\"},{\"privateIPAddress\":\"c\",\"privateIPAllocationMethod\":\"Dynamic\",\"subnetId\":\"nnaamdectehfiqsc\"},{\"privateIPAddress\":\"ypvhezrkg\",\"privateIPAllocationMethod\":\"Static\",\"subnetId\":\"refovgmkqsleyyvx\"},{\"privateIPAddress\":\"jpkcattpng\",\"privateIPAllocationMethod\":\"Dynamic\",\"subnetId\":\"czsqpjhvm\"}]}")
            .toObject(NginxFrontendIpConfiguration.class);
        Assertions.assertEquals("jugwdkcglhsl", model.publicIpAddresses().get(0).id());
        Assertions.assertEquals("qweykhmenev", model.privateIpAddresses().get(0).privateIpAddress());
        Assertions.assertEquals(NginxPrivateIpAllocationMethod.STATIC,
            model.privateIpAddresses().get(0).privateIpAllocationMethod());
        Assertions.assertEquals("fwhybcibvy", model.privateIpAddresses().get(0).subnetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NginxFrontendIpConfiguration model = new NginxFrontendIpConfiguration()
            .withPublicIpAddresses(Arrays.asList(new NginxPublicIpAddress().withId("jugwdkcglhsl"),
                new NginxPublicIpAddress().withId("jdyggdtji"), new NginxPublicIpAddress().withId("b")))
            .withPrivateIpAddresses(Arrays.asList(
                new NginxPrivateIpAddress().withPrivateIpAddress("qweykhmenev")
                    .withPrivateIpAllocationMethod(NginxPrivateIpAllocationMethod.STATIC).withSubnetId("fwhybcibvy"),
                new NginxPrivateIpAddress().withPrivateIpAddress("c")
                    .withPrivateIpAllocationMethod(NginxPrivateIpAllocationMethod.DYNAMIC)
                    .withSubnetId("nnaamdectehfiqsc"),
                new NginxPrivateIpAddress().withPrivateIpAddress("ypvhezrkg")
                    .withPrivateIpAllocationMethod(NginxPrivateIpAllocationMethod.STATIC)
                    .withSubnetId("refovgmkqsleyyvx"),
                new NginxPrivateIpAddress().withPrivateIpAddress("jpkcattpng")
                    .withPrivateIpAllocationMethod(NginxPrivateIpAllocationMethod.DYNAMIC).withSubnetId("czsqpjhvm")));
        model = BinaryData.fromObject(model).toObject(NginxFrontendIpConfiguration.class);
        Assertions.assertEquals("jugwdkcglhsl", model.publicIpAddresses().get(0).id());
        Assertions.assertEquals("qweykhmenev", model.privateIpAddresses().get(0).privateIpAddress());
        Assertions.assertEquals(NginxPrivateIpAllocationMethod.STATIC,
            model.privateIpAddresses().get(0).privateIpAllocationMethod());
        Assertions.assertEquals("fwhybcibvy", model.privateIpAddresses().get(0).subnetId());
    }
}
