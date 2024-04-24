// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.Backend;
import com.azure.resourcemanager.frontdoor.models.BackendEnabledState;
import org.junit.jupiter.api.Assertions;

public final class BackendTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Backend model = BinaryData.fromString(
            "{\"address\":\"dyhgkfminsg\",\"privateLinkAlias\":\"zfttsttktlahb\",\"privateLinkResourceId\":\"ctxtgzukxi\",\"privateLinkLocation\":\"m\",\"privateEndpointStatus\":\"Disconnected\",\"privateLinkApprovalMessage\":\"qqxhrnxrxcpj\",\"httpPort\":58328549,\"httpsPort\":1960010520,\"enabledState\":\"Enabled\",\"priority\":744996388,\"weight\":1739983778,\"backendHostHeader\":\"azivjlfrqttbajl\"}")
            .toObject(Backend.class);
        Assertions.assertEquals("dyhgkfminsg", model.address());
        Assertions.assertEquals("zfttsttktlahb", model.privateLinkAlias());
        Assertions.assertEquals("ctxtgzukxi", model.privateLinkResourceId());
        Assertions.assertEquals("m", model.privateLinkLocation());
        Assertions.assertEquals("qqxhrnxrxcpj", model.privateLinkApprovalMessage());
        Assertions.assertEquals(58328549, model.httpPort());
        Assertions.assertEquals(1960010520, model.httpsPort());
        Assertions.assertEquals(BackendEnabledState.ENABLED, model.enabledState());
        Assertions.assertEquals(744996388, model.priority());
        Assertions.assertEquals(1739983778, model.weight());
        Assertions.assertEquals("azivjlfrqttbajl", model.backendHostHeader());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Backend model = new Backend().withAddress("dyhgkfminsg")
            .withPrivateLinkAlias("zfttsttktlahb")
            .withPrivateLinkResourceId("ctxtgzukxi")
            .withPrivateLinkLocation("m")
            .withPrivateLinkApprovalMessage("qqxhrnxrxcpj")
            .withHttpPort(58328549)
            .withHttpsPort(1960010520)
            .withEnabledState(BackendEnabledState.ENABLED)
            .withPriority(744996388)
            .withWeight(1739983778)
            .withBackendHostHeader("azivjlfrqttbajl");
        model = BinaryData.fromObject(model).toObject(Backend.class);
        Assertions.assertEquals("dyhgkfminsg", model.address());
        Assertions.assertEquals("zfttsttktlahb", model.privateLinkAlias());
        Assertions.assertEquals("ctxtgzukxi", model.privateLinkResourceId());
        Assertions.assertEquals("m", model.privateLinkLocation());
        Assertions.assertEquals("qqxhrnxrxcpj", model.privateLinkApprovalMessage());
        Assertions.assertEquals(58328549, model.httpPort());
        Assertions.assertEquals(1960010520, model.httpsPort());
        Assertions.assertEquals(BackendEnabledState.ENABLED, model.enabledState());
        Assertions.assertEquals(744996388, model.priority());
        Assertions.assertEquals(1739983778, model.weight());
        Assertions.assertEquals("azivjlfrqttbajl", model.backendHostHeader());
    }
}
