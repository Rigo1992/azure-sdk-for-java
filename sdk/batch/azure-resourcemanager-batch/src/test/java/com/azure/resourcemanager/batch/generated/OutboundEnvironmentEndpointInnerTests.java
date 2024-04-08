// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.OutboundEnvironmentEndpointInner;

public final class OutboundEnvironmentEndpointInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OutboundEnvironmentEndpointInner model = BinaryData.fromString(
            "{\"category\":\"gokdwbwhks\",\"endpoints\":[{\"domainName\":\"rvexztvb\",\"description\":\"gsfraoyzkoow\",\"endpointDetails\":[{\"port\":1663606623},{\"port\":1523878268},{\"port\":1953532777},{\"port\":1275486297}]},{\"domainName\":\"dsyuuximerqfob\",\"description\":\"znkbykutwpfhpagm\",\"endpointDetails\":[{\"port\":1595958724},{\"port\":803916344},{\"port\":1293750730},{\"port\":2086518628}]}]}")
            .toObject(OutboundEnvironmentEndpointInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OutboundEnvironmentEndpointInner model = new OutboundEnvironmentEndpointInner();
        model = BinaryData.fromObject(model).toObject(OutboundEnvironmentEndpointInner.class);
    }
}
