// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.ManagedIdentitySettings;
import com.azure.resourcemanager.signalr.models.ServerlessUpstreamSettings;
import com.azure.resourcemanager.signalr.models.UpstreamAuthSettings;
import com.azure.resourcemanager.signalr.models.UpstreamAuthType;
import com.azure.resourcemanager.signalr.models.UpstreamTemplate;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServerlessUpstreamSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerlessUpstreamSettings model =
            BinaryData
                .fromString(
                    "{\"templates\":[{\"hubPattern\":\"ddhcratizzr\",\"eventPattern\":\"asxifto\",\"categoryPattern\":\"yzhftwesgogczh\",\"urlTemplate\":\"nnxk\",\"auth\":{\"type\":\"ManagedIdentity\",\"managedIdentity\":{\"resource\":\"mossxkkgthrrghxj\"}}},{\"hubPattern\":\"hqxvcxgfrpdsofbs\",\"eventPattern\":\"nsvbuswdv\",\"categoryPattern\":\"ybycnunvj\",\"urlTemplate\":\"rtkfawnopq\",\"auth\":{\"type\":\"ManagedIdentity\",\"managedIdentity\":{\"resource\":\"rtxdyuxzejnt\"}}},{\"hubPattern\":\"ewgioilqukrydxt\",\"eventPattern\":\"ieoxorggufhyaomt\",\"categoryPattern\":\"hhavgrvkffovjz\",\"urlTemplate\":\"pjbi\",\"auth\":{\"type\":\"ManagedIdentity\",\"managedIdentity\":{\"resource\":\"umvfclu\"}}}]}")
                .toObject(ServerlessUpstreamSettings.class);
        Assertions.assertEquals("ddhcratizzr", model.templates().get(0).hubPattern());
        Assertions.assertEquals("asxifto", model.templates().get(0).eventPattern());
        Assertions.assertEquals("yzhftwesgogczh", model.templates().get(0).categoryPattern());
        Assertions.assertEquals("nnxk", model.templates().get(0).urlTemplate());
        Assertions.assertEquals(UpstreamAuthType.MANAGED_IDENTITY, model.templates().get(0).auth().type());
        Assertions.assertEquals("mossxkkgthrrghxj", model.templates().get(0).auth().managedIdentity().resource());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerlessUpstreamSettings model =
            new ServerlessUpstreamSettings()
                .withTemplates(
                    Arrays
                        .asList(
                            new UpstreamTemplate()
                                .withHubPattern("ddhcratizzr")
                                .withEventPattern("asxifto")
                                .withCategoryPattern("yzhftwesgogczh")
                                .withUrlTemplate("nnxk")
                                .withAuth(
                                    new UpstreamAuthSettings()
                                        .withType(UpstreamAuthType.MANAGED_IDENTITY)
                                        .withManagedIdentity(
                                            new ManagedIdentitySettings().withResource("mossxkkgthrrghxj"))),
                            new UpstreamTemplate()
                                .withHubPattern("hqxvcxgfrpdsofbs")
                                .withEventPattern("nsvbuswdv")
                                .withCategoryPattern("ybycnunvj")
                                .withUrlTemplate("rtkfawnopq")
                                .withAuth(
                                    new UpstreamAuthSettings()
                                        .withType(UpstreamAuthType.MANAGED_IDENTITY)
                                        .withManagedIdentity(
                                            new ManagedIdentitySettings().withResource("rtxdyuxzejnt"))),
                            new UpstreamTemplate()
                                .withHubPattern("ewgioilqukrydxt")
                                .withEventPattern("ieoxorggufhyaomt")
                                .withCategoryPattern("hhavgrvkffovjz")
                                .withUrlTemplate("pjbi")
                                .withAuth(
                                    new UpstreamAuthSettings()
                                        .withType(UpstreamAuthType.MANAGED_IDENTITY)
                                        .withManagedIdentity(new ManagedIdentitySettings().withResource("umvfclu")))));
        model = BinaryData.fromObject(model).toObject(ServerlessUpstreamSettings.class);
        Assertions.assertEquals("ddhcratizzr", model.templates().get(0).hubPattern());
        Assertions.assertEquals("asxifto", model.templates().get(0).eventPattern());
        Assertions.assertEquals("yzhftwesgogczh", model.templates().get(0).categoryPattern());
        Assertions.assertEquals("nnxk", model.templates().get(0).urlTemplate());
        Assertions.assertEquals(UpstreamAuthType.MANAGED_IDENTITY, model.templates().get(0).auth().type());
        Assertions.assertEquals("mossxkkgthrrghxj", model.templates().get(0).auth().managedIdentity().resource());
    }
}
