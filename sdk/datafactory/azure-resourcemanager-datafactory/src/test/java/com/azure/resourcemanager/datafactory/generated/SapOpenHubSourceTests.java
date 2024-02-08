// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapOpenHubSource;

public final class SapOpenHubSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapOpenHubSource model = BinaryData.fromString(
            "{\"type\":\"SapOpenHubSource\",\"excludeLastRequest\":\"datap\",\"baseRequestId\":\"datagfnqtxlk\",\"customRfcReadTableFunctionModule\":\"dataviklxsgstunsa\",\"sapDataColumnDelimiter\":\"dataistdbehkb\",\"queryTimeout\":\"datajkodpzqtgsa\",\"additionalColumns\":\"dataxd\",\"sourceRetryCount\":\"dataaskhasjbuhzucdl\",\"sourceRetryWait\":\"datajstncjwze\",\"maxConcurrentConnections\":\"dataezltlundkjphvh\",\"disableMetricsCollection\":\"dataivsh\",\"\":{\"xearlp\":\"datamcjyt\"}}")
            .toObject(SapOpenHubSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapOpenHubSource model = new SapOpenHubSource().withSourceRetryCount("dataaskhasjbuhzucdl")
            .withSourceRetryWait("datajstncjwze").withMaxConcurrentConnections("dataezltlundkjphvh")
            .withDisableMetricsCollection("dataivsh").withQueryTimeout("datajkodpzqtgsa")
            .withAdditionalColumns("dataxd").withExcludeLastRequest("datap").withBaseRequestId("datagfnqtxlk")
            .withCustomRfcReadTableFunctionModule("dataviklxsgstunsa").withSapDataColumnDelimiter("dataistdbehkb");
        model = BinaryData.fromObject(model).toObject(SapOpenHubSource.class);
    }
}
