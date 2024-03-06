// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.fluent.models.OperationDetailInner;
import com.azure.resourcemanager.healthcareapis.models.LogSpecification;
import com.azure.resourcemanager.healthcareapis.models.MetricDimension;
import com.azure.resourcemanager.healthcareapis.models.MetricSpecification;
import com.azure.resourcemanager.healthcareapis.models.OperationDisplay;
import com.azure.resourcemanager.healthcareapis.models.OperationProperties;
import com.azure.resourcemanager.healthcareapis.models.ServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationDetailInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDetailInner model = BinaryData.fromString(
            "{\"name\":\"ogjltdtbnnhad\",\"isDataAction\":true,\"display\":{\"provider\":\"vcikhnvpamqgx\",\"resource\":\"u\",\"operation\":\"ik\",\"description\":\"ggxkallatmelwuip\"},\"origin\":\"cjzkzivgvvcna\",\"actionType\":\"Internal\",\"properties\":{\"serviceSpecification\":{\"logSpecifications\":[{\"name\":\"mueedndrdvstk\",\"displayName\":\"qtc\",\"blobDuration\":\"alm\"},{\"name\":\"tdaaygdvwvg\",\"displayName\":\"ohgwxrtfudxepxg\",\"blobDuration\":\"agvrvmnpkuk\"}],\"metricSpecifications\":[{\"name\":\"dblx\",\"displayName\":\"imfnjhfjx\",\"displayDescription\":\"szkkfoqre\",\"unit\":\"kzikfjawneaivxwc\",\"category\":\"lpcirelsf\",\"aggregationType\":\"enwabfatk\",\"supportedAggregationTypes\":[\"xbjhwuaanozjosph\",\"oulpjrv\",\"ag\",\"rvimjwosytxitcsk\"],\"supportedTimeGrainTypes\":[\"tq\"],\"fillGapWithZero\":false,\"metricFilterPattern\":\"kkezzikhlyfjhdgq\",\"dimensions\":[{},{}],\"isInternal\":false,\"sourceMdmAccount\":\"nyga\",\"sourceMdmNamespace\":\"idb\",\"enableRegionalMdmAccount\":false,\"resourceIdDimensionNameOverride\":\"pxllrx\"}]}}}")
            .toObject(OperationDetailInner.class);
        Assertions.assertEquals("mueedndrdvstk",
            model.properties().serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("qtc",
            model.properties().serviceSpecification().logSpecifications().get(0).displayName());
        Assertions.assertEquals("alm",
            model.properties().serviceSpecification().logSpecifications().get(0).blobDuration());
        Assertions.assertEquals("dblx", model.properties().serviceSpecification().metricSpecifications().get(0).name());
        Assertions.assertEquals("imfnjhfjx",
            model.properties().serviceSpecification().metricSpecifications().get(0).displayName());
        Assertions.assertEquals("szkkfoqre",
            model.properties().serviceSpecification().metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("kzikfjawneaivxwc",
            model.properties().serviceSpecification().metricSpecifications().get(0).unit());
        Assertions.assertEquals("lpcirelsf",
            model.properties().serviceSpecification().metricSpecifications().get(0).category());
        Assertions.assertEquals("enwabfatk",
            model.properties().serviceSpecification().metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("xbjhwuaanozjosph",
            model.properties().serviceSpecification().metricSpecifications().get(0).supportedAggregationTypes().get(0));
        Assertions.assertEquals("tq",
            model.properties().serviceSpecification().metricSpecifications().get(0).supportedTimeGrainTypes().get(0));
        Assertions.assertEquals(false,
            model.properties().serviceSpecification().metricSpecifications().get(0).fillGapWithZero());
        Assertions.assertEquals("kkezzikhlyfjhdgq",
            model.properties().serviceSpecification().metricSpecifications().get(0).metricFilterPattern());
        Assertions.assertEquals(false,
            model.properties().serviceSpecification().metricSpecifications().get(0).isInternal());
        Assertions.assertEquals("nyga",
            model.properties().serviceSpecification().metricSpecifications().get(0).sourceMdmAccount());
        Assertions.assertEquals("idb",
            model.properties().serviceSpecification().metricSpecifications().get(0).sourceMdmNamespace());
        Assertions.assertEquals(false,
            model.properties().serviceSpecification().metricSpecifications().get(0).enableRegionalMdmAccount());
        Assertions.assertEquals("pxllrx",
            model.properties().serviceSpecification().metricSpecifications().get(0).resourceIdDimensionNameOverride());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationDetailInner model = new OperationDetailInner().withDisplay(new OperationDisplay())
            .withProperties(new OperationProperties().withServiceSpecification(new ServiceSpecification()
                .withLogSpecifications(Arrays.asList(
                    new LogSpecification().withName("mueedndrdvstk").withDisplayName("qtc").withBlobDuration("alm"),
                    new LogSpecification().withName("tdaaygdvwvg").withDisplayName("ohgwxrtfudxepxg")
                        .withBlobDuration("agvrvmnpkuk")))
                .withMetricSpecifications(Arrays.asList(new MetricSpecification().withName("dblx")
                    .withDisplayName("imfnjhfjx").withDisplayDescription("szkkfoqre").withUnit("kzikfjawneaivxwc")
                    .withCategory("lpcirelsf").withAggregationType("enwabfatk")
                    .withSupportedAggregationTypes(
                        Arrays.asList("xbjhwuaanozjosph", "oulpjrv", "ag", "rvimjwosytxitcsk"))
                    .withSupportedTimeGrainTypes(Arrays.asList("tq")).withFillGapWithZero(false)
                    .withMetricFilterPattern("kkezzikhlyfjhdgq")
                    .withDimensions(Arrays.asList(new MetricDimension(), new MetricDimension())).withIsInternal(false)
                    .withSourceMdmAccount("nyga").withSourceMdmNamespace("idb").withEnableRegionalMdmAccount(false)
                    .withResourceIdDimensionNameOverride("pxllrx")))));
        model = BinaryData.fromObject(model).toObject(OperationDetailInner.class);
        Assertions.assertEquals("mueedndrdvstk",
            model.properties().serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("qtc",
            model.properties().serviceSpecification().logSpecifications().get(0).displayName());
        Assertions.assertEquals("alm",
            model.properties().serviceSpecification().logSpecifications().get(0).blobDuration());
        Assertions.assertEquals("dblx", model.properties().serviceSpecification().metricSpecifications().get(0).name());
        Assertions.assertEquals("imfnjhfjx",
            model.properties().serviceSpecification().metricSpecifications().get(0).displayName());
        Assertions.assertEquals("szkkfoqre",
            model.properties().serviceSpecification().metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("kzikfjawneaivxwc",
            model.properties().serviceSpecification().metricSpecifications().get(0).unit());
        Assertions.assertEquals("lpcirelsf",
            model.properties().serviceSpecification().metricSpecifications().get(0).category());
        Assertions.assertEquals("enwabfatk",
            model.properties().serviceSpecification().metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("xbjhwuaanozjosph",
            model.properties().serviceSpecification().metricSpecifications().get(0).supportedAggregationTypes().get(0));
        Assertions.assertEquals("tq",
            model.properties().serviceSpecification().metricSpecifications().get(0).supportedTimeGrainTypes().get(0));
        Assertions.assertEquals(false,
            model.properties().serviceSpecification().metricSpecifications().get(0).fillGapWithZero());
        Assertions.assertEquals("kkezzikhlyfjhdgq",
            model.properties().serviceSpecification().metricSpecifications().get(0).metricFilterPattern());
        Assertions.assertEquals(false,
            model.properties().serviceSpecification().metricSpecifications().get(0).isInternal());
        Assertions.assertEquals("nyga",
            model.properties().serviceSpecification().metricSpecifications().get(0).sourceMdmAccount());
        Assertions.assertEquals("idb",
            model.properties().serviceSpecification().metricSpecifications().get(0).sourceMdmNamespace());
        Assertions.assertEquals(false,
            model.properties().serviceSpecification().metricSpecifications().get(0).enableRegionalMdmAccount());
        Assertions.assertEquals("pxllrx",
            model.properties().serviceSpecification().metricSpecifications().get(0).resourceIdDimensionNameOverride());
    }
}
