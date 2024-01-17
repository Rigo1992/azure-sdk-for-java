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
            "{\"type\":\"SapCloudForCustomerSource\",\"query\":\"dataoaopzqpfwnjd\",\"httpRequestTimeout\":\"dataxformfeedfqjne\",\"queryTimeout\":\"dataxtesnhxphxo\",\"additionalColumns\":\"databvtpqttusuxxbzm\",\"sourceRetryCount\":\"dataueijrnnwgrx\",\"sourceRetryWait\":\"datanwguezxl\",\"maxConcurrentConnections\":\"datamkwbwmgqzq\",\"disableMetricsCollection\":\"datanycchpcjztz\",\"\":{\"vp\":\"datau\",\"xciunet\":\"datafvin\",\"hxxvft\":\"dataxgdgqkletlwavtzb\",\"kyjmtdnymbe\":\"datadrqgionm\"}}")
            .toObject(SapCloudForCustomerSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapCloudForCustomerSource model = new SapCloudForCustomerSource().withSourceRetryCount("dataueijrnnwgrx")
            .withSourceRetryWait("datanwguezxl").withMaxConcurrentConnections("datamkwbwmgqzq")
            .withDisableMetricsCollection("datanycchpcjztz").withQueryTimeout("dataxtesnhxphxo")
            .withAdditionalColumns("databvtpqttusuxxbzm").withQuery("dataoaopzqpfwnjd")
            .withHttpRequestTimeout("dataxformfeedfqjne");
        model = BinaryData.fromObject(model).toObject(SapCloudForCustomerSource.class);
    }
}
