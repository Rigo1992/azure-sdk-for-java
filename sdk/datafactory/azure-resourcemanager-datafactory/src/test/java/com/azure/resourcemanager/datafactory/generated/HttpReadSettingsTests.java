// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.HttpReadSettings;

public final class HttpReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HttpReadSettings model = BinaryData.fromString(
            "{\"type\":\"HttpReadSettings\",\"requestMethod\":\"dataaiqyxlr\",\"requestBody\":\"dataxpebsxcnhq\",\"additionalHeaders\":\"databtyorlr\",\"requestTimeout\":\"datamyumro\",\"additionalColumns\":\"dataaxnym\",\"maxConcurrentConnections\":\"datag\",\"disableMetricsCollection\":\"dataqmkakgw\",\"\":{\"sdgyhe\":\"datano\"}}")
            .toObject(HttpReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HttpReadSettings model
            = new HttpReadSettings().withMaxConcurrentConnections("datag").withDisableMetricsCollection("dataqmkakgw")
                .withRequestMethod("dataaiqyxlr").withRequestBody("dataxpebsxcnhq").withAdditionalHeaders("databtyorlr")
                .withRequestTimeout("datamyumro").withAdditionalColumns("dataaxnym");
        model = BinaryData.fromObject(model).toObject(HttpReadSettings.class);
    }
}
