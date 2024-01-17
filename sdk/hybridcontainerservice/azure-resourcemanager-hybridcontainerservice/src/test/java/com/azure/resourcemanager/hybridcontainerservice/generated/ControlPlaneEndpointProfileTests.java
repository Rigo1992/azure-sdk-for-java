// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.ControlPlaneEndpointProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.ControlPlaneEndpointProfileControlPlaneEndpoint;
import org.junit.jupiter.api.Assertions;

public final class ControlPlaneEndpointProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ControlPlaneEndpointProfile model
            = BinaryData.fromString("{\"controlPlaneEndpoint\":{\"hostIP\":\"yflusarhmofc\",\"port\":590284670}}")
                .toObject(ControlPlaneEndpointProfile.class);
        Assertions.assertEquals("yflusarhmofc", model.controlPlaneEndpoint().hostIp());
        Assertions.assertEquals(590284670, model.controlPlaneEndpoint().port());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ControlPlaneEndpointProfile model = new ControlPlaneEndpointProfile().withControlPlaneEndpoint(
            new ControlPlaneEndpointProfileControlPlaneEndpoint().withHostIp("yflusarhmofc").withPort(590284670));
        model = BinaryData.fromObject(model).toObject(ControlPlaneEndpointProfile.class);
        Assertions.assertEquals("yflusarhmofc", model.controlPlaneEndpoint().hostIp());
        Assertions.assertEquals(590284670, model.controlPlaneEndpoint().port());
    }
}
