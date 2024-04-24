// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.fluent.models.ServiceInner;
import com.azure.resourcemanager.support.models.ServicesListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServicesListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServicesListResult model = BinaryData.fromString(
            "{\"value\":[{\"id\":\"m\",\"name\":\"fp\",\"type\":\"qobmtukk\",\"properties\":{\"displayName\":\"rtihfxtijbpz\",\"resourceTypes\":[\"wzsymglzufcy\",\"kohdbiha\"]}},{\"id\":\"fhfcb\",\"name\":\"s\",\"type\":\"ithxqhabifpi\",\"properties\":{\"displayName\":\"czbysc\",\"resourceTypes\":[\"x\"]}},{\"id\":\"ivyqniwbybrkxvd\",\"name\":\"jgrtfwvukxga\",\"type\":\"ccsnhsjc\",\"properties\":{\"displayName\":\"j\",\"resourceTypes\":[\"yhtnapczwlokjye\",\"kkvnipjox\",\"jnchgej\",\"podmailzydehojwy\"]}},{\"id\":\"uxinpmqnjaq\",\"name\":\"xj\",\"type\":\"r\",\"properties\":{\"displayName\":\"cputegjvwmfdats\",\"resourceTypes\":[\"vpjhulsuuv\",\"kjozkrwfnd\",\"odjpslwejd\",\"vwryoqpso\"]}}]}")
            .toObject(ServicesListResult.class);
        Assertions.assertEquals("rtihfxtijbpz", model.value().get(0).displayName());
        Assertions.assertEquals("wzsymglzufcy", model.value().get(0).resourceTypes().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServicesListResult model = new ServicesListResult().withValue(Arrays.asList(
            new ServiceInner().withDisplayName("rtihfxtijbpz")
                .withResourceTypes(Arrays.asList("wzsymglzufcy", "kohdbiha")),
            new ServiceInner().withDisplayName("czbysc").withResourceTypes(Arrays.asList("x")),
            new ServiceInner().withDisplayName("j")
                .withResourceTypes(Arrays.asList("yhtnapczwlokjye", "kkvnipjox", "jnchgej", "podmailzydehojwy")),
            new ServiceInner().withDisplayName("cputegjvwmfdats")
                .withResourceTypes(Arrays.asList("vpjhulsuuv", "kjozkrwfnd", "odjpslwejd", "vwryoqpso"))));
        model = BinaryData.fromObject(model).toObject(ServicesListResult.class);
        Assertions.assertEquals("rtihfxtijbpz", model.value().get(0).displayName());
        Assertions.assertEquals("wzsymglzufcy", model.value().get(0).resourceTypes().get(0));
    }
}
