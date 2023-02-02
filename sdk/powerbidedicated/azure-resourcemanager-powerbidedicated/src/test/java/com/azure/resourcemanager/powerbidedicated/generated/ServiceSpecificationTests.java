// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.powerbidedicated.models.LogSpecification;
import com.azure.resourcemanager.powerbidedicated.models.MetricSpecification;
import com.azure.resourcemanager.powerbidedicated.models.ServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServiceSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceSpecification model =
            BinaryData
                .fromString(
                    "{\"metricSpecifications\":[{\"name\":\"ddntwndei\",\"displayName\":\"twnpzaoqvuhrhcf\",\"displayDescription\":\"yd\",\"unit\":\"lmjthjq\",\"aggregationType\":\"pyeicxm\",\"metricFilterPattern\":\"iwqvhkh\",\"dimensions\":[]},{\"name\":\"gdtopbobjogh\",\"displayName\":\"w\",\"displayDescription\":\"m\",\"unit\":\"hrzayvvtpgvdf\",\"aggregationType\":\"otkftutqxlngx\",\"metricFilterPattern\":\"fgugnxkrxdqmid\",\"dimensions\":[]},{\"name\":\"rvqdra\",\"displayName\":\"jybige\",\"displayDescription\":\"qfbow\",\"unit\":\"anyktzlcuiywg\",\"aggregationType\":\"wgndrvynhzgpp\",\"metricFilterPattern\":\"cgyncocpecf\",\"dimensions\":[]},{\"name\":\"oo\",\"displayName\":\"xlzevgbmqjqabcy\",\"displayDescription\":\"ivkwlzuvccfwnfnb\",\"unit\":\"fionl\",\"aggregationType\":\"x\",\"metricFilterPattern\":\"qgtz\",\"dimensions\":[]}],\"logSpecifications\":[{\"name\":\"qqwx\",\"displayName\":\"feallnwsu\",\"blobDuration\":\"snjampmng\"},{\"name\":\"scxaq\",\"displayName\":\"ochcbonqvpkvl\",\"blobDuration\":\"njeaseipheofloke\"}]}")
                .toObject(ServiceSpecification.class);
        Assertions.assertEquals("twnpzaoqvuhrhcf", model.metricSpecifications().get(0).displayName());
        Assertions.assertEquals("yd", model.metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("feallnwsu", model.logSpecifications().get(0).displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceSpecification model =
            new ServiceSpecification()
                .withMetricSpecifications(
                    Arrays
                        .asList(
                            new MetricSpecification()
                                .withDisplayName("twnpzaoqvuhrhcf")
                                .withDisplayDescription("yd")
                                .withDimensions(Arrays.asList()),
                            new MetricSpecification()
                                .withDisplayName("w")
                                .withDisplayDescription("m")
                                .withDimensions(Arrays.asList()),
                            new MetricSpecification()
                                .withDisplayName("jybige")
                                .withDisplayDescription("qfbow")
                                .withDimensions(Arrays.asList()),
                            new MetricSpecification()
                                .withDisplayName("xlzevgbmqjqabcy")
                                .withDisplayDescription("ivkwlzuvccfwnfnb")
                                .withDimensions(Arrays.asList())))
                .withLogSpecifications(
                    Arrays
                        .asList(
                            new LogSpecification().withDisplayName("feallnwsu"),
                            new LogSpecification().withDisplayName("ochcbonqvpkvl")));
        model = BinaryData.fromObject(model).toObject(ServiceSpecification.class);
        Assertions.assertEquals("twnpzaoqvuhrhcf", model.metricSpecifications().get(0).displayName());
        Assertions.assertEquals("yd", model.metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("feallnwsu", model.logSpecifications().get(0).displayName());
    }
}
