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
            "{\"name\":\"obbc\",\"displayName\":\"s\",\"displayDescription\":\"jriplrbpbewtghf\",\"unit\":\"lcgwxzvlvqh\",\"aggregationType\":\"begibtnmxiebwwa\",\"supportedAggregationTypes\":[\"Average\",\"NotSpecified\"],\"metricClass\":\"gwrtzju\",\"dimensions\":[{\"name\":\"zmh\",\"displayName\":\"ongmtsa\",\"internalName\":\"cbpwxqpsrknft\",\"toBeExportedForShoebox\":true},{\"name\":\"iuhprwmdyvxqta\",\"displayName\":\"iwwroyqbexrmc\",\"internalName\":\"bycnojvkn\",\"toBeExportedForShoebox\":true},{\"name\":\"sgzvahapjyzhpv\",\"displayName\":\"zcjrvxdjzlmwlx\",\"internalName\":\"ug\",\"toBeExportedForShoebox\":false}]}")
            .toObject(MetricSpecification.class);
        Assertions.assertEquals("obbc", model.name());
        Assertions.assertEquals("s", model.displayName());
        Assertions.assertEquals("jriplrbpbewtghf", model.displayDescription());
        Assertions.assertEquals("lcgwxzvlvqh", model.unit());
        Assertions.assertEquals("begibtnmxiebwwa", model.aggregationType());
        Assertions.assertEquals(MetricAggregationType.AVERAGE, model.supportedAggregationTypes().get(0));
        Assertions.assertEquals("gwrtzju", model.metricClass());
        Assertions.assertEquals("zmh", model.dimensions().get(0).name());
        Assertions.assertEquals("ongmtsa", model.dimensions().get(0).displayName());
        Assertions.assertEquals("cbpwxqpsrknft", model.dimensions().get(0).internalName());
        Assertions.assertEquals(true, model.dimensions().get(0).toBeExportedForShoebox());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MetricSpecification model = new MetricSpecification().withName("obbc")
            .withDisplayName("s")
            .withDisplayDescription("jriplrbpbewtghf")
            .withUnit("lcgwxzvlvqh")
            .withAggregationType("begibtnmxiebwwa")
            .withSupportedAggregationTypes(
                Arrays.asList(MetricAggregationType.AVERAGE, MetricAggregationType.NOT_SPECIFIED))
            .withMetricClass("gwrtzju")
            .withDimensions(Arrays.asList(
                new MetricDimension().withName("zmh")
                    .withDisplayName("ongmtsa")
                    .withInternalName("cbpwxqpsrknft")
                    .withToBeExportedForShoebox(true),
                new MetricDimension().withName("iuhprwmdyvxqta")
                    .withDisplayName("iwwroyqbexrmc")
                    .withInternalName("bycnojvkn")
                    .withToBeExportedForShoebox(true),
                new MetricDimension().withName("sgzvahapjyzhpv")
                    .withDisplayName("zcjrvxdjzlmwlx")
                    .withInternalName("ug")
                    .withToBeExportedForShoebox(false)));
        model = BinaryData.fromObject(model).toObject(MetricSpecification.class);
        Assertions.assertEquals("obbc", model.name());
        Assertions.assertEquals("s", model.displayName());
        Assertions.assertEquals("jriplrbpbewtghf", model.displayDescription());
        Assertions.assertEquals("lcgwxzvlvqh", model.unit());
        Assertions.assertEquals("begibtnmxiebwwa", model.aggregationType());
        Assertions.assertEquals(MetricAggregationType.AVERAGE, model.supportedAggregationTypes().get(0));
        Assertions.assertEquals("gwrtzju", model.metricClass());
        Assertions.assertEquals("zmh", model.dimensions().get(0).name());
        Assertions.assertEquals("ongmtsa", model.dimensions().get(0).displayName());
        Assertions.assertEquals("cbpwxqpsrknft", model.dimensions().get(0).internalName());
        Assertions.assertEquals(true, model.dimensions().get(0).toBeExportedForShoebox());
    }
}
