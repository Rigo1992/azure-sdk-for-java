// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.MultiRegionSettings;
import com.azure.resourcemanager.cognitiveservices.models.RegionSetting;
import com.azure.resourcemanager.cognitiveservices.models.RoutingMethods;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MultiRegionSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MultiRegionSettings model =
            BinaryData
                .fromString(
                    "{\"routingMethod\":\"Performance\",\"regions\":[{\"name\":\"qqedqytbciqfou\",\"value\":68.96301,\"customsubdomain\":\"nkzsmodmglou\"},{\"name\":\"b\",\"value\":18.99814,\"customsubdomain\":\"utduqktapspwgcu\"},{\"name\":\"tumkdosvqwhbm\",\"value\":84.869194,\"customsubdomain\":\"jfddgmbmbe\"},{\"name\":\"pbhtqqrolfpfpsa\",\"value\":49.90956,\"customsubdomain\":\"uxig\"}]}")
                .toObject(MultiRegionSettings.class);
        Assertions.assertEquals(RoutingMethods.PERFORMANCE, model.routingMethod());
        Assertions.assertEquals("qqedqytbciqfou", model.regions().get(0).name());
        Assertions.assertEquals(68.96301F, model.regions().get(0).value());
        Assertions.assertEquals("nkzsmodmglou", model.regions().get(0).customsubdomain());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MultiRegionSettings model =
            new MultiRegionSettings()
                .withRoutingMethod(RoutingMethods.PERFORMANCE)
                .withRegions(
                    Arrays
                        .asList(
                            new RegionSetting()
                                .withName("qqedqytbciqfou")
                                .withValue(68.96301F)
                                .withCustomsubdomain("nkzsmodmglou"),
                            new RegionSetting()
                                .withName("b")
                                .withValue(18.99814F)
                                .withCustomsubdomain("utduqktapspwgcu"),
                            new RegionSetting()
                                .withName("tumkdosvqwhbm")
                                .withValue(84.869194F)
                                .withCustomsubdomain("jfddgmbmbe"),
                            new RegionSetting()
                                .withName("pbhtqqrolfpfpsa")
                                .withValue(49.90956F)
                                .withCustomsubdomain("uxig")));
        model = BinaryData.fromObject(model).toObject(MultiRegionSettings.class);
        Assertions.assertEquals(RoutingMethods.PERFORMANCE, model.routingMethod());
        Assertions.assertEquals("qqedqytbciqfou", model.regions().get(0).name());
        Assertions.assertEquals(68.96301F, model.regions().get(0).value());
        Assertions.assertEquals("nkzsmodmglou", model.regions().get(0).customsubdomain());
    }
}
