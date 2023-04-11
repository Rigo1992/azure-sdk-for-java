// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.ManagedPrivateEndpointInner;
import com.azure.resourcemanager.kusto.models.ManagedPrivateEndpointListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ManagedPrivateEndpointListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedPrivateEndpointListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"privateLinkResourceId\":\"igvpgylg\",\"privateLinkResourceRegion\":\"itxmedjvcslynqww\",\"groupId\":\"cwzzhxgktr\",\"requestMessage\":\"ucnapkteoellwp\",\"provisioningState\":\"Deleting\"},\"id\":\"gpfqbuace\",\"name\":\"pzfqrhhuaoppp\",\"type\":\"qeqxo\"},{\"properties\":{\"privateLinkResourceId\":\"dahzxctobg\",\"privateLinkResourceRegion\":\"dmoizpostmg\",\"groupId\":\"cfbu\",\"requestMessage\":\"mfqjhhkxbp\",\"provisioningState\":\"Running\"},\"id\":\"jhxxjyn\",\"name\":\"u\",\"type\":\"ivkrtsw\"}]}")
                .toObject(ManagedPrivateEndpointListResult.class);
        Assertions.assertEquals("igvpgylg", model.value().get(0).privateLinkResourceId());
        Assertions.assertEquals("itxmedjvcslynqww", model.value().get(0).privateLinkResourceRegion());
        Assertions.assertEquals("cwzzhxgktr", model.value().get(0).groupId());
        Assertions.assertEquals("ucnapkteoellwp", model.value().get(0).requestMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedPrivateEndpointListResult model =
            new ManagedPrivateEndpointListResult()
                .withValue(
                    Arrays
                        .asList(
                            new ManagedPrivateEndpointInner()
                                .withPrivateLinkResourceId("igvpgylg")
                                .withPrivateLinkResourceRegion("itxmedjvcslynqww")
                                .withGroupId("cwzzhxgktr")
                                .withRequestMessage("ucnapkteoellwp"),
                            new ManagedPrivateEndpointInner()
                                .withPrivateLinkResourceId("dahzxctobg")
                                .withPrivateLinkResourceRegion("dmoizpostmg")
                                .withGroupId("cfbu")
                                .withRequestMessage("mfqjhhkxbp")));
        model = BinaryData.fromObject(model).toObject(ManagedPrivateEndpointListResult.class);
        Assertions.assertEquals("igvpgylg", model.value().get(0).privateLinkResourceId());
        Assertions.assertEquals("itxmedjvcslynqww", model.value().get(0).privateLinkResourceRegion());
        Assertions.assertEquals("cwzzhxgktr", model.value().get(0).groupId());
        Assertions.assertEquals("ucnapkteoellwp", model.value().get(0).requestMessage());
    }
}
