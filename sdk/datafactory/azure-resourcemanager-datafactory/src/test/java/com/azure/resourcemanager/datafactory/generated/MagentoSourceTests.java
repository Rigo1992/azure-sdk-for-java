// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MagentoSource;

public final class MagentoSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MagentoSource model = BinaryData.fromString(
            "{\"type\":\"MagentoSource\",\"query\":\"datavyktfu\",\"queryTimeout\":\"dataaabibvslo\",\"additionalColumns\":\"datakpvvkqlkhdxnz\",\"sourceRetryCount\":\"dataas\",\"sourceRetryWait\":\"dataiz\",\"maxConcurrentConnections\":\"datamibwzuhyda\",\"disableMetricsCollection\":\"datakgwtbfxxsfj\",\"\":{\"mkdsvayyhti\":\"datascjig\",\"tlnmmyznwrc\":\"dataxehmnizoybtehk\",\"ohwi\":\"dataqwkqulkzov\"}}")
            .toObject(MagentoSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MagentoSource model = new MagentoSource().withSourceRetryCount("dataas").withSourceRetryWait("dataiz")
            .withMaxConcurrentConnections("datamibwzuhyda").withDisableMetricsCollection("datakgwtbfxxsfj")
            .withQueryTimeout("dataaabibvslo").withAdditionalColumns("datakpvvkqlkhdxnz").withQuery("datavyktfu");
        model = BinaryData.fromObject(model).toObject(MagentoSource.class);
    }
}
