// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.ControlPlaneProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.ControlPlaneProfileControlPlaneEndpoint;
import org.junit.jupiter.api.Assertions;

public final class ControlPlaneProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ControlPlaneProfile model = BinaryData
            .fromString("{\"count\":1819090851,\"vmSize\":\"htbmuf\",\"controlPlaneEndpoint\":{\"hostIP\":\"noi\"}}")
            .toObject(ControlPlaneProfile.class);
        Assertions.assertEquals(1819090851, model.count());
        Assertions.assertEquals("htbmuf", model.vmSize());
        Assertions.assertEquals("noi", model.controlPlaneEndpoint().hostIp());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ControlPlaneProfile model = new ControlPlaneProfile().withCount(1819090851).withVmSize("htbmuf")
            .withControlPlaneEndpoint(new ControlPlaneProfileControlPlaneEndpoint().withHostIp("noi"));
        model = BinaryData.fromObject(model).toObject(ControlPlaneProfile.class);
        Assertions.assertEquals(1819090851, model.count());
        Assertions.assertEquals("htbmuf", model.vmSize());
        Assertions.assertEquals("noi", model.controlPlaneEndpoint().hostIp());
    }
}
