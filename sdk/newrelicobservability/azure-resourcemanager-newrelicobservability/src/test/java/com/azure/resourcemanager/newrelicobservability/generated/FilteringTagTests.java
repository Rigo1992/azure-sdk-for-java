// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.models.FilteringTag;
import com.azure.resourcemanager.newrelicobservability.models.TagAction;
import org.junit.jupiter.api.Assertions;

public final class FilteringTagTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FilteringTag model =
            BinaryData
                .fromString("{\"name\":\"nqvpkvlrxnje\",\"value\":\"eipheoflokeyy\",\"action\":\"Include\"}")
                .toObject(FilteringTag.class);
        Assertions.assertEquals("nqvpkvlrxnje", model.name());
        Assertions.assertEquals("eipheoflokeyy", model.value());
        Assertions.assertEquals(TagAction.INCLUDE, model.action());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FilteringTag model =
            new FilteringTag().withName("nqvpkvlrxnje").withValue("eipheoflokeyy").withAction(TagAction.INCLUDE);
        model = BinaryData.fromObject(model).toObject(FilteringTag.class);
        Assertions.assertEquals("nqvpkvlrxnje", model.name());
        Assertions.assertEquals("eipheoflokeyy", model.value());
        Assertions.assertEquals(TagAction.INCLUDE, model.action());
    }
}
