// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.NotificationContractInner;
import com.azure.resourcemanager.apimanagement.models.RecipientsContractProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NotificationContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NotificationContractInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"title\":\"alec\",\"description\":\"ibiwksdegyxsb\",\"recipients\":{\"emails\":[\"oikvntwcz\",\"zwushlcxpblal\",\"hezpfkissaidqzs\"],\"users\":[\"qdsgptotxj\",\"fiafc\"]}},\"id\":\"lrtbfij\",\"name\":\"z\",\"type\":\"aoijolb\"}")
                .toObject(NotificationContractInner.class);
        Assertions.assertEquals("alec", model.title());
        Assertions.assertEquals("ibiwksdegyxsb", model.description());
        Assertions.assertEquals("oikvntwcz", model.recipients().emails().get(0));
        Assertions.assertEquals("qdsgptotxj", model.recipients().users().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NotificationContractInner model =
            new NotificationContractInner()
                .withTitle("alec")
                .withDescription("ibiwksdegyxsb")
                .withRecipients(
                    new RecipientsContractProperties()
                        .withEmails(Arrays.asList("oikvntwcz", "zwushlcxpblal", "hezpfkissaidqzs"))
                        .withUsers(Arrays.asList("qdsgptotxj", "fiafc")));
        model = BinaryData.fromObject(model).toObject(NotificationContractInner.class);
        Assertions.assertEquals("alec", model.title());
        Assertions.assertEquals("ibiwksdegyxsb", model.description());
        Assertions.assertEquals("oikvntwcz", model.recipients().emails().get(0));
        Assertions.assertEquals("qdsgptotxj", model.recipients().users().get(0));
    }
}
