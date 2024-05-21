// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapCloudForCustomerSource;

public final class SapCloudForCustomerSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapCloudForCustomerSource model = BinaryData.fromString(
            "{\"type\":\"kympwquu\",\"query\":\"dataujshcsnk\",\"httpRequestTimeout\":\"datagpqxqevt\",\"queryTimeout\":\"datakjirvjogsalvjl\",\"additionalColumns\":\"dataimua\",\"sourceRetryCount\":\"dataz\",\"sourceRetryWait\":\"datau\",\"maxConcurrentConnections\":\"datahszjyanhsliqeftg\",\"disableMetricsCollection\":\"dataro\",\"\":{\"zxj\":\"dataufqsdt\",\"gibog\":\"dataxolmehquqi\",\"lxcwrszwa\":\"dataojupenoupc\"}}")
            .toObject(SapCloudForCustomerSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapCloudForCustomerSource model = new SapCloudForCustomerSource().withSourceRetryCount("dataz")
            .withSourceRetryWait("datau")
            .withMaxConcurrentConnections("datahszjyanhsliqeftg")
            .withDisableMetricsCollection("dataro")
            .withQueryTimeout("datakjirvjogsalvjl")
            .withAdditionalColumns("dataimua")
            .withQuery("dataujshcsnk")
            .withHttpRequestTimeout("datagpqxqevt");
        model = BinaryData.fromObject(model).toObject(SapCloudForCustomerSource.class);
    }
}
