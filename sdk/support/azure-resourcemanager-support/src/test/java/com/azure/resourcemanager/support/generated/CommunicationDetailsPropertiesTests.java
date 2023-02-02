// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.fluent.models.CommunicationDetailsProperties;
import org.junit.jupiter.api.Assertions;

public final class CommunicationDetailsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommunicationDetailsProperties model =
            BinaryData
                .fromString(
                    "{\"communicationType\":\"web\",\"communicationDirection\":\"outbound\",\"sender\":\"vfaxkffeiith\",\"subject\":\"vmezy\",\"body\":\"shxmzsbbzoggigrx\",\"createdDate\":\"2021-08-02T21:26:13Z\"}")
                .toObject(CommunicationDetailsProperties.class);
        Assertions.assertEquals("vfaxkffeiith", model.sender());
        Assertions.assertEquals("vmezy", model.subject());
        Assertions.assertEquals("shxmzsbbzoggigrx", model.body());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommunicationDetailsProperties model =
            new CommunicationDetailsProperties()
                .withSender("vfaxkffeiith")
                .withSubject("vmezy")
                .withBody("shxmzsbbzoggigrx");
        model = BinaryData.fromObject(model).toObject(CommunicationDetailsProperties.class);
        Assertions.assertEquals("vfaxkffeiith", model.sender());
        Assertions.assertEquals("vmezy", model.subject());
        Assertions.assertEquals("shxmzsbbzoggigrx", model.body());
    }
}
