// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.VnetConfiguration;
import org.junit.jupiter.api.Assertions;

public final class VnetConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VnetConfiguration model =
            BinaryData
                .fromString(
                    "{\"internal\":true,\"infrastructureSubnetId\":\"tgsfja\",\"dockerBridgeCidr\":\"slhhxudbxv\",\"platformReservedCidr\":\"htnsi\",\"platformReservedDnsIP\":\"dhzmmesckdlp\"}")
                .toObject(VnetConfiguration.class);
        Assertions.assertEquals(true, model.internal());
        Assertions.assertEquals("tgsfja", model.infrastructureSubnetId());
        Assertions.assertEquals("slhhxudbxv", model.dockerBridgeCidr());
        Assertions.assertEquals("htnsi", model.platformReservedCidr());
        Assertions.assertEquals("dhzmmesckdlp", model.platformReservedDnsIp());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VnetConfiguration model =
            new VnetConfiguration()
                .withInternal(true)
                .withInfrastructureSubnetId("tgsfja")
                .withDockerBridgeCidr("slhhxudbxv")
                .withPlatformReservedCidr("htnsi")
                .withPlatformReservedDnsIp("dhzmmesckdlp");
        model = BinaryData.fromObject(model).toObject(VnetConfiguration.class);
        Assertions.assertEquals(true, model.internal());
        Assertions.assertEquals("tgsfja", model.infrastructureSubnetId());
        Assertions.assertEquals("slhhxudbxv", model.dockerBridgeCidr());
        Assertions.assertEquals("htnsi", model.platformReservedCidr());
        Assertions.assertEquals("dhzmmesckdlp", model.platformReservedDnsIp());
    }
}
