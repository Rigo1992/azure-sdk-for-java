// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.EventListener;
import com.azure.resourcemanager.webpubsub.models.EventListenerEndpoint;
import com.azure.resourcemanager.webpubsub.models.EventListenerFilter;

public final class EventListenerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EventListener model =
            BinaryData
                .fromString(
                    "{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}}")
                .toObject(EventListener.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EventListener model =
            new EventListener().withFilter(new EventListenerFilter()).withEndpoint(new EventListenerEndpoint());
        model = BinaryData.fromObject(model).toObject(EventListener.class);
    }
}
