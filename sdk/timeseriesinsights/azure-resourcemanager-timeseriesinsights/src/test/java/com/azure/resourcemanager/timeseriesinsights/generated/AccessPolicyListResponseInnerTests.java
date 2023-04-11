// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.AccessPolicyListResponseInner;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.AccessPolicyResourceInner;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AccessPolicyListResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccessPolicyListResponseInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"principalObjectId\":\"ksymd\",\"description\":\"stkiiuxhqyud\",\"roles\":[]},\"id\":\"rrqnbpoczvyifqrv\",\"name\":\"dvjsllrmvvdf\",\"type\":\"atkpnp\"},{\"properties\":{\"principalObjectId\":\"xxbczwtr\",\"description\":\"iqzbq\",\"roles\":[]},\"id\":\"sovmyokacspkwl\",\"name\":\"zdobpxjmflbvvnch\",\"type\":\"kcciwwzjuqkhr\"},{\"properties\":{\"principalObjectId\":\"iwkuofos\",\"description\":\"hsauuimjmvxied\",\"roles\":[]},\"id\":\"gidyjrrf\",\"name\":\"y\",\"type\":\"osvexcsonpclhoc\"}]}")
                .toObject(AccessPolicyListResponseInner.class);
        Assertions.assertEquals("ksymd", model.value().get(0).principalObjectId());
        Assertions.assertEquals("stkiiuxhqyud", model.value().get(0).description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccessPolicyListResponseInner model =
            new AccessPolicyListResponseInner()
                .withValue(
                    Arrays
                        .asList(
                            new AccessPolicyResourceInner()
                                .withPrincipalObjectId("ksymd")
                                .withDescription("stkiiuxhqyud")
                                .withRoles(Arrays.asList()),
                            new AccessPolicyResourceInner()
                                .withPrincipalObjectId("xxbczwtr")
                                .withDescription("iqzbq")
                                .withRoles(Arrays.asList()),
                            new AccessPolicyResourceInner()
                                .withPrincipalObjectId("iwkuofos")
                                .withDescription("hsauuimjmvxied")
                                .withRoles(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(AccessPolicyListResponseInner.class);
        Assertions.assertEquals("ksymd", model.value().get(0).principalObjectId());
        Assertions.assertEquals("stkiiuxhqyud", model.value().get(0).description());
    }
}
