// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.fluent.models.ChatTranscriptDetailsProperties;
import com.azure.resourcemanager.support.models.MessageProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ChatTranscriptDetailsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChatTranscriptDetailsProperties model = BinaryData.fromString(
            "{\"messages\":[{\"communicationDirection\":\"outbound\",\"sender\":\"uhavhql\",\"body\":\"humaqolbgyc\",\"createdDate\":\"2021-09-15T15:38:14Z\"},{\"communicationDirection\":\"outbound\",\"sender\":\"ccymvaolpsslql\",\"body\":\"mdnbbglzpswiy\",\"createdDate\":\"2021-07-14T12:06:58Z\"},{\"communicationDirection\":\"outbound\",\"sender\":\"dxssadbzm\",\"body\":\"dfznudaodv\",\"createdDate\":\"2021-05-29T13:49:41Z\"},{\"communicationDirection\":\"outbound\",\"sender\":\"ylpstdbhhxsrzdz\",\"body\":\"erscdntne\",\"createdDate\":\"2021-04-19T04:18:41Z\"}],\"startTime\":\"2021-05-10T05:26:40Z\"}")
            .toObject(ChatTranscriptDetailsProperties.class);
        Assertions.assertEquals("uhavhql", model.messages().get(0).sender());
        Assertions.assertEquals("humaqolbgyc", model.messages().get(0).body());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChatTranscriptDetailsProperties model = new ChatTranscriptDetailsProperties()
            .withMessages(Arrays.asList(new MessageProperties().withSender("uhavhql").withBody("humaqolbgyc"),
                new MessageProperties().withSender("ccymvaolpsslql").withBody("mdnbbglzpswiy"),
                new MessageProperties().withSender("dxssadbzm").withBody("dfznudaodv"),
                new MessageProperties().withSender("ylpstdbhhxsrzdz").withBody("erscdntne")));
        model = BinaryData.fromObject(model).toObject(ChatTranscriptDetailsProperties.class);
        Assertions.assertEquals("uhavhql", model.messages().get(0).sender());
        Assertions.assertEquals("humaqolbgyc", model.messages().get(0).body());
    }
}
