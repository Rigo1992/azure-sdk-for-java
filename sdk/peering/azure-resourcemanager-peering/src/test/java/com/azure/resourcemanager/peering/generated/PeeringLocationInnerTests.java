// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.peering.fluent.models.PeeringLocationInner;
import com.azure.resourcemanager.peering.models.Kind;
import com.azure.resourcemanager.peering.models.PeeringLocationPropertiesDirect;
import com.azure.resourcemanager.peering.models.PeeringLocationPropertiesExchange;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PeeringLocationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PeeringLocationInner model =
            BinaryData
                .fromString(
                    "{\"kind\":\"Exchange\",\"properties\":{\"direct\":{\"peeringFacilities\":[],\"bandwidthOffers\":[]},\"exchange\":{\"peeringFacilities\":[]},\"peeringLocation\":\"zyiuokk\",\"country\":\"hrdxwzywqsmbs\",\"azureRegion\":\"exim\"},\"id\":\"ryocfsfksymdd\",\"name\":\"stkiiuxhqyud\",\"type\":\"o\"}")
                .toObject(PeeringLocationInner.class);
        Assertions.assertEquals(Kind.EXCHANGE, model.kind());
        Assertions.assertEquals("zyiuokk", model.peeringLocation());
        Assertions.assertEquals("hrdxwzywqsmbs", model.country());
        Assertions.assertEquals("exim", model.azureRegion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PeeringLocationInner model =
            new PeeringLocationInner()
                .withKind(Kind.EXCHANGE)
                .withDirect(
                    new PeeringLocationPropertiesDirect()
                        .withPeeringFacilities(Arrays.asList())
                        .withBandwidthOffers(Arrays.asList()))
                .withExchange(new PeeringLocationPropertiesExchange().withPeeringFacilities(Arrays.asList()))
                .withPeeringLocation("zyiuokk")
                .withCountry("hrdxwzywqsmbs")
                .withAzureRegion("exim");
        model = BinaryData.fromObject(model).toObject(PeeringLocationInner.class);
        Assertions.assertEquals(Kind.EXCHANGE, model.kind());
        Assertions.assertEquals("zyiuokk", model.peeringLocation());
        Assertions.assertEquals("hrdxwzywqsmbs", model.country());
        Assertions.assertEquals("exim", model.azureRegion());
    }
}
