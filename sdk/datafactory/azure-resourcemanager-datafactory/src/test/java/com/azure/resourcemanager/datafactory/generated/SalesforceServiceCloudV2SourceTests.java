// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SalesforceServiceCloudV2Source;

public final class SalesforceServiceCloudV2SourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceServiceCloudV2Source model = BinaryData.fromString(
            "{\"type\":\"mvpsvwwtn\",\"SOQLQuery\":\"datazdecgiomdcolwq\",\"includeDeletedObjects\":\"datarrjudgnph\",\"additionalColumns\":\"datadqt\",\"sourceRetryCount\":\"datanoq\",\"sourceRetryWait\":\"datanllicovvdc\",\"maxConcurrentConnections\":\"datafnbdpaoijx\",\"disableMetricsCollection\":\"datafm\",\"\":{\"xjfkpuszsjay\":\"datavv\"}}")
            .toObject(SalesforceServiceCloudV2Source.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceServiceCloudV2Source model = new SalesforceServiceCloudV2Source().withSourceRetryCount("datanoq")
            .withSourceRetryWait("datanllicovvdc")
            .withMaxConcurrentConnections("datafnbdpaoijx")
            .withDisableMetricsCollection("datafm")
            .withSoqlQuery("datazdecgiomdcolwq")
            .withIncludeDeletedObjects("datarrjudgnph")
            .withAdditionalColumns("datadqt");
        model = BinaryData.fromObject(model).toObject(SalesforceServiceCloudV2Source.class);
    }
}
