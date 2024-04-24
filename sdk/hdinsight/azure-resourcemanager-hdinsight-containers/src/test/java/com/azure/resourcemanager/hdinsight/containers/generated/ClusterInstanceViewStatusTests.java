// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterInstanceViewStatus;
import org.junit.jupiter.api.Assertions;

public final class ClusterInstanceViewStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterInstanceViewStatus model
            = BinaryData.fromString("{\"ready\":\"kaivwit\",\"reason\":\"cywuggwol\",\"message\":\"czbwemhairsbr\"}")
                .toObject(ClusterInstanceViewStatus.class);
        Assertions.assertEquals("kaivwit", model.ready());
        Assertions.assertEquals("cywuggwol", model.reason());
        Assertions.assertEquals("czbwemhairsbr", model.message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterInstanceViewStatus model
            = new ClusterInstanceViewStatus().withReady("kaivwit").withReason("cywuggwol").withMessage("czbwemhairsbr");
        model = BinaryData.fromObject(model).toObject(ClusterInstanceViewStatus.class);
        Assertions.assertEquals("kaivwit", model.ready());
        Assertions.assertEquals("cywuggwol", model.reason());
        Assertions.assertEquals("czbwemhairsbr", model.message());
    }
}
