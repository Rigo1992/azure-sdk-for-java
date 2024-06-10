// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.NetworkFeatures;
import com.azure.resourcemanager.netapp.models.UpdateNetworkSiblingSetRequest;
import org.junit.jupiter.api.Assertions;

public final class UpdateNetworkSiblingSetRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateNetworkSiblingSetRequest model = BinaryData.fromString(
            "{\"networkSiblingSetId\":\"bt\",\"subnetId\":\"wrqpue\",\"networkSiblingSetStateId\":\"ckzywbiexzfeyue\",\"networkFeatures\":\"Standard_Basic\"}")
            .toObject(UpdateNetworkSiblingSetRequest.class);
        Assertions.assertEquals("bt", model.networkSiblingSetId());
        Assertions.assertEquals("wrqpue", model.subnetId());
        Assertions.assertEquals("ckzywbiexzfeyue", model.networkSiblingSetStateId());
        Assertions.assertEquals(NetworkFeatures.STANDARD_BASIC, model.networkFeatures());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateNetworkSiblingSetRequest model = new UpdateNetworkSiblingSetRequest().withNetworkSiblingSetId("bt")
            .withSubnetId("wrqpue")
            .withNetworkSiblingSetStateId("ckzywbiexzfeyue")
            .withNetworkFeatures(NetworkFeatures.STANDARD_BASIC);
        model = BinaryData.fromObject(model).toObject(UpdateNetworkSiblingSetRequest.class);
        Assertions.assertEquals("bt", model.networkSiblingSetId());
        Assertions.assertEquals("wrqpue", model.subnetId());
        Assertions.assertEquals("ckzywbiexzfeyue", model.networkSiblingSetStateId());
        Assertions.assertEquals(NetworkFeatures.STANDARD_BASIC, model.networkFeatures());
    }
}
