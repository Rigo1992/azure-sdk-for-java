// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.timeseriesinsights.models.LogSpecification;
import com.azure.resourcemanager.timeseriesinsights.models.MetricSpecification;
import com.azure.resourcemanager.timeseriesinsights.models.ServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServiceSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceSpecification model =
            BinaryData
                .fromString(
                    "{\"metricSpecifications\":[{\"name\":\"pslwejdpvw\",\"displayName\":\"oqpsoa\",\"displayDescription\":\"tazak\",\"unit\":\"lahbcryff\",\"dimensions\":[],\"aggregationType\":\"sy\",\"availabilities\":[],\"category\":\"aojakhmsbzjhcrz\",\"resourceIdDimensionNameOverride\":\"dphlxaolt\"},{\"name\":\"trg\",\"displayName\":\"bpf\",\"displayDescription\":\"s\",\"unit\":\"zgvfcjrwz\",\"dimensions\":[],\"aggregationType\":\"tfell\",\"availabilities\":[],\"category\":\"it\",\"resourceIdDimensionNameOverride\":\"peqfpjkjl\"}],\"logSpecifications\":[{\"name\":\"dvhpfxxypininm\",\"displayName\":\"huyb\"},{\"name\":\"podepoo\",\"displayName\":\"nuvamiheogna\"},{\"name\":\"zxtheotusivyevcc\",\"displayName\":\"ihnhun\"}]}")
                .toObject(ServiceSpecification.class);
        Assertions.assertEquals("pslwejdpvw", model.metricSpecifications().get(0).name());
        Assertions.assertEquals("oqpsoa", model.metricSpecifications().get(0).displayName());
        Assertions.assertEquals("tazak", model.metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("lahbcryff", model.metricSpecifications().get(0).unit());
        Assertions.assertEquals("sy", model.metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("aojakhmsbzjhcrz", model.metricSpecifications().get(0).category());
        Assertions.assertEquals("dphlxaolt", model.metricSpecifications().get(0).resourceIdDimensionNameOverride());
        Assertions.assertEquals("dvhpfxxypininm", model.logSpecifications().get(0).name());
        Assertions.assertEquals("huyb", model.logSpecifications().get(0).displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceSpecification model =
            new ServiceSpecification()
                .withMetricSpecifications(
                    Arrays
                        .asList(
                            new MetricSpecification()
                                .withName("pslwejdpvw")
                                .withDisplayName("oqpsoa")
                                .withDisplayDescription("tazak")
                                .withUnit("lahbcryff")
                                .withDimensions(Arrays.asList())
                                .withAggregationType("sy")
                                .withAvailabilities(Arrays.asList())
                                .withCategory("aojakhmsbzjhcrz")
                                .withResourceIdDimensionNameOverride("dphlxaolt"),
                            new MetricSpecification()
                                .withName("trg")
                                .withDisplayName("bpf")
                                .withDisplayDescription("s")
                                .withUnit("zgvfcjrwz")
                                .withDimensions(Arrays.asList())
                                .withAggregationType("tfell")
                                .withAvailabilities(Arrays.asList())
                                .withCategory("it")
                                .withResourceIdDimensionNameOverride("peqfpjkjl")))
                .withLogSpecifications(
                    Arrays
                        .asList(
                            new LogSpecification().withName("dvhpfxxypininm").withDisplayName("huyb"),
                            new LogSpecification().withName("podepoo").withDisplayName("nuvamiheogna"),
                            new LogSpecification().withName("zxtheotusivyevcc").withDisplayName("ihnhun")));
        model = BinaryData.fromObject(model).toObject(ServiceSpecification.class);
        Assertions.assertEquals("pslwejdpvw", model.metricSpecifications().get(0).name());
        Assertions.assertEquals("oqpsoa", model.metricSpecifications().get(0).displayName());
        Assertions.assertEquals("tazak", model.metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("lahbcryff", model.metricSpecifications().get(0).unit());
        Assertions.assertEquals("sy", model.metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("aojakhmsbzjhcrz", model.metricSpecifications().get(0).category());
        Assertions.assertEquals("dphlxaolt", model.metricSpecifications().get(0).resourceIdDimensionNameOverride());
        Assertions.assertEquals("dvhpfxxypininm", model.logSpecifications().get(0).name());
        Assertions.assertEquals("huyb", model.logSpecifications().get(0).displayName());
    }
}
