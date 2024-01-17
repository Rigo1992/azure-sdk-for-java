// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.EventHandler;
import com.azure.resourcemanager.webpubsub.models.EventListener;
import com.azure.resourcemanager.webpubsub.models.EventListenerEndpoint;
import com.azure.resourcemanager.webpubsub.models.EventListenerFilter;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentitySettings;
import com.azure.resourcemanager.webpubsub.models.UpstreamAuthSettings;
import com.azure.resourcemanager.webpubsub.models.UpstreamAuthType;
import com.azure.resourcemanager.webpubsub.models.WebPubSubHubProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WebPubSubHubPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WebPubSubHubProperties model =
            BinaryData
                .fromString(
                    "{\"eventHandlers\":[{\"urlTemplate\":\"ronzmyhgfip\",\"userEventPattern\":\"xkmcwaekrrjre\",\"systemEvents\":[\"tsgumhj\"],\"auth\":{\"type\":\"None\",\"managedIdentity\":{\"resource\":\"wslolbqp\"}}},{\"urlTemplate\":\"uzlm\",\"userEventPattern\":\"elfk\",\"systemEvents\":[\"lcrpw\",\"xeznoi\",\"brnjwmw\",\"pn\"],\"auth\":{\"type\":\"None\",\"managedIdentity\":{\"resource\":\"joqkagfhsxt\"}}},{\"urlTemplate\":\"augzxnfaazpxdtn\",\"userEventPattern\":\"mkqjj\",\"systemEvents\":[\"envrkpyouaibrebq\",\"aysjkixqtnqttez\"],\"auth\":{\"type\":\"None\",\"managedIdentity\":{\"resource\":\"akpjpqqmtedlt\"}}}],\"eventListeners\":[{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}}],\"anonymousConnectPolicy\":\"hyeozphvwau\"}")
                .toObject(WebPubSubHubProperties.class);
        Assertions.assertEquals("ronzmyhgfip", model.eventHandlers().get(0).urlTemplate());
        Assertions.assertEquals("xkmcwaekrrjre", model.eventHandlers().get(0).userEventPattern());
        Assertions.assertEquals("tsgumhj", model.eventHandlers().get(0).systemEvents().get(0));
        Assertions.assertEquals(UpstreamAuthType.NONE, model.eventHandlers().get(0).auth().type());
        Assertions.assertEquals("wslolbqp", model.eventHandlers().get(0).auth().managedIdentity().resource());
        Assertions.assertEquals("hyeozphvwau", model.anonymousConnectPolicy());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WebPubSubHubProperties model =
            new WebPubSubHubProperties()
                .withEventHandlers(
                    Arrays
                        .asList(
                            new EventHandler()
                                .withUrlTemplate("ronzmyhgfip")
                                .withUserEventPattern("xkmcwaekrrjre")
                                .withSystemEvents(Arrays.asList("tsgumhj"))
                                .withAuth(
                                    new UpstreamAuthSettings()
                                        .withType(UpstreamAuthType.NONE)
                                        .withManagedIdentity(new ManagedIdentitySettings().withResource("wslolbqp"))),
                            new EventHandler()
                                .withUrlTemplate("uzlm")
                                .withUserEventPattern("elfk")
                                .withSystemEvents(Arrays.asList("lcrpw", "xeznoi", "brnjwmw", "pn"))
                                .withAuth(
                                    new UpstreamAuthSettings()
                                        .withType(UpstreamAuthType.NONE)
                                        .withManagedIdentity(
                                            new ManagedIdentitySettings().withResource("joqkagfhsxt"))),
                            new EventHandler()
                                .withUrlTemplate("augzxnfaazpxdtn")
                                .withUserEventPattern("mkqjj")
                                .withSystemEvents(Arrays.asList("envrkpyouaibrebq", "aysjkixqtnqttez"))
                                .withAuth(
                                    new UpstreamAuthSettings()
                                        .withType(UpstreamAuthType.NONE)
                                        .withManagedIdentity(
                                            new ManagedIdentitySettings().withResource("akpjpqqmtedlt")))))
                .withEventListeners(
                    Arrays
                        .asList(
                            new EventListener()
                                .withFilter(new EventListenerFilter())
                                .withEndpoint(new EventListenerEndpoint())))
                .withAnonymousConnectPolicy("hyeozphvwau");
        model = BinaryData.fromObject(model).toObject(WebPubSubHubProperties.class);
        Assertions.assertEquals("ronzmyhgfip", model.eventHandlers().get(0).urlTemplate());
        Assertions.assertEquals("xkmcwaekrrjre", model.eventHandlers().get(0).userEventPattern());
        Assertions.assertEquals("tsgumhj", model.eventHandlers().get(0).systemEvents().get(0));
        Assertions.assertEquals(UpstreamAuthType.NONE, model.eventHandlers().get(0).auth().type());
        Assertions.assertEquals("wslolbqp", model.eventHandlers().get(0).auth().managedIdentity().resource());
        Assertions.assertEquals("hyeozphvwau", model.anonymousConnectPolicy());
    }
}
