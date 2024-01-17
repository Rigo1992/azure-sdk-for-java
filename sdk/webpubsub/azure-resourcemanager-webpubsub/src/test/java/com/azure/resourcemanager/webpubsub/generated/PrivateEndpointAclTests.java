// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.PrivateEndpointAcl;
import com.azure.resourcemanager.webpubsub.models.WebPubSubRequestType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointAclTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointAcl model =
            BinaryData
                .fromString(
                    "{\"name\":\"oakgtdlmkkzev\",\"allow\":[\"Trace\",\"Trace\",\"ServerConnection\"],\"deny\":[\"ServerConnection\",\"RESTAPI\",\"RESTAPI\"]}")
                .toObject(PrivateEndpointAcl.class);
        Assertions.assertEquals(WebPubSubRequestType.TRACE, model.allow().get(0));
        Assertions.assertEquals(WebPubSubRequestType.SERVER_CONNECTION, model.deny().get(0));
        Assertions.assertEquals("oakgtdlmkkzev", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointAcl model =
            new PrivateEndpointAcl()
                .withAllow(
                    Arrays
                        .asList(
                            WebPubSubRequestType.TRACE,
                            WebPubSubRequestType.TRACE,
                            WebPubSubRequestType.SERVER_CONNECTION))
                .withDeny(
                    Arrays
                        .asList(
                            WebPubSubRequestType.SERVER_CONNECTION,
                            WebPubSubRequestType.RESTAPI,
                            WebPubSubRequestType.RESTAPI))
                .withName("oakgtdlmkkzev");
        model = BinaryData.fromObject(model).toObject(PrivateEndpointAcl.class);
        Assertions.assertEquals(WebPubSubRequestType.TRACE, model.allow().get(0));
        Assertions.assertEquals(WebPubSubRequestType.SERVER_CONNECTION, model.deny().get(0));
        Assertions.assertEquals("oakgtdlmkkzev", model.name());
    }
}
