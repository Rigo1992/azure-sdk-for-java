// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.IlrRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.IlrRequestResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IlrRequestResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IlrRequestResource model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"objectType\":\"IlrRequest\"},\"eTag\":\"jaltolmnc\",\"location\":\"sobqw\",\"tags\":{\"cqdpfuv\":\"bnwdcfh\"},\"id\":\"lsbjjcanvxbv\",\"name\":\"vudutncor\",\"type\":\"r\"}")
                .toObject(IlrRequestResource.class);
        Assertions.assertEquals("sobqw", model.location());
        Assertions.assertEquals("bnwdcfh", model.tags().get("cqdpfuv"));
        Assertions.assertEquals("jaltolmnc", model.etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IlrRequestResource model =
            new IlrRequestResource()
                .withLocation("sobqw")
                .withTags(mapOf("cqdpfuv", "bnwdcfh"))
                .withProperties(new IlrRequest())
                .withEtag("jaltolmnc");
        model = BinaryData.fromObject(model).toObject(IlrRequestResource.class);
        Assertions.assertEquals("sobqw", model.location());
        Assertions.assertEquals("bnwdcfh", model.tags().get("cqdpfuv"));
        Assertions.assertEquals("jaltolmnc", model.etag());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
