// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.MetricAggregationType;
import com.azure.resourcemanager.storagecache.models.MetricDimension;
import com.azure.resourcemanager.storagecache.models.MetricSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MetricSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MetricSpecification model = BinaryData.fromString(
            "{\"name\":\"wgndrvynhzgpp\",\"displayName\":\"cgyncocpecf\",\"displayDescription\":\"mcoo\",\"unit\":\"xlzevgbmqjqabcy\",\"aggregationType\":\"ivkwlzuvccfwnfnb\",\"supportedAggregationTypes\":[\"None\",\"Count\"],\"metricClass\":\"l\",\"dimensions\":[{\"name\":\"tqgtzxdpnqbqq\",\"displayName\":\"rjfeallnwsubisnj\",\"internalName\":\"pmng\",\"toBeExportedForShoebox\":false}]}")
            .toObject(MetricSpecification.class);
        Assertions.assertEquals("wgndrvynhzgpp", model.name());
        Assertions.assertEquals("cgyncocpecf", model.displayName());
        Assertions.assertEquals("mcoo", model.displayDescription());
        Assertions.assertEquals("xlzevgbmqjqabcy", model.unit());
        Assertions.assertEquals("ivkwlzuvccfwnfnb", model.aggregationType());
        Assertions.assertEquals(MetricAggregationType.NONE, model.supportedAggregationTypes().get(0));
        Assertions.assertEquals("l", model.metricClass());
        Assertions.assertEquals("tqgtzxdpnqbqq", model.dimensions().get(0).name());
        Assertions.assertEquals("rjfeallnwsubisnj", model.dimensions().get(0).displayName());
        Assertions.assertEquals("pmng", model.dimensions().get(0).internalName());
        Assertions.assertEquals(false, model.dimensions().get(0).toBeExportedForShoebox());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MetricSpecification model = new MetricSpecification().withName("wgndrvynhzgpp").withDisplayName("cgyncocpecf")
            .withDisplayDescription("mcoo").withUnit("xlzevgbmqjqabcy").withAggregationType("ivkwlzuvccfwnfnb")
            .withSupportedAggregationTypes(Arrays.asList(MetricAggregationType.NONE, MetricAggregationType.COUNT))
            .withMetricClass("l").withDimensions(Arrays.asList(new MetricDimension().withName("tqgtzxdpnqbqq")
                .withDisplayName("rjfeallnwsubisnj").withInternalName("pmng").withToBeExportedForShoebox(false)));
        model = BinaryData.fromObject(model).toObject(MetricSpecification.class);
        Assertions.assertEquals("wgndrvynhzgpp", model.name());
        Assertions.assertEquals("cgyncocpecf", model.displayName());
        Assertions.assertEquals("mcoo", model.displayDescription());
        Assertions.assertEquals("xlzevgbmqjqabcy", model.unit());
        Assertions.assertEquals("ivkwlzuvccfwnfnb", model.aggregationType());
        Assertions.assertEquals(MetricAggregationType.NONE, model.supportedAggregationTypes().get(0));
        Assertions.assertEquals("l", model.metricClass());
        Assertions.assertEquals("tqgtzxdpnqbqq", model.dimensions().get(0).name());
        Assertions.assertEquals("rjfeallnwsubisnj", model.dimensions().get(0).displayName());
        Assertions.assertEquals("pmng", model.dimensions().get(0).internalName());
        Assertions.assertEquals(false, model.dimensions().get(0).toBeExportedForShoebox());
    }
}
