// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.AksClusterProfileAksClusterAgentPoolIdentityProfile;
import org.junit.jupiter.api.Assertions;

public final class AksClusterProfileAksClusterAgentPoolIdentityProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AksClusterProfileAksClusterAgentPoolIdentityProfile model =
            BinaryData
                .fromString(
                    "{\"msiResourceId\":\"ailzydehojwyahu\",\"msiClientId\":\"inpm\",\"msiObjectId\":\"njaqwixjspro\"}")
                .toObject(AksClusterProfileAksClusterAgentPoolIdentityProfile.class);
        Assertions.assertEquals("ailzydehojwyahu", model.msiResourceId());
        Assertions.assertEquals("inpm", model.msiClientId());
        Assertions.assertEquals("njaqwixjspro", model.msiObjectId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AksClusterProfileAksClusterAgentPoolIdentityProfile model =
            new AksClusterProfileAksClusterAgentPoolIdentityProfile()
                .withMsiResourceId("ailzydehojwyahu")
                .withMsiClientId("inpm")
                .withMsiObjectId("njaqwixjspro");
        model = BinaryData.fromObject(model).toObject(AksClusterProfileAksClusterAgentPoolIdentityProfile.class);
        Assertions.assertEquals("ailzydehojwyahu", model.msiResourceId());
        Assertions.assertEquals("inpm", model.msiClientId());
        Assertions.assertEquals("njaqwixjspro", model.msiObjectId());
    }
}
