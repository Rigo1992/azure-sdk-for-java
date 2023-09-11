// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkSegmentInner;
import com.azure.resourcemanager.avs.models.WorkloadNetworkSegmentSubnet;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WorkloadNetworkSegmentInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadNetworkSegmentInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"displayName\":\"k\",\"connectedGateway\":\"oxafn\",\"subnet\":{\"dhcpRanges\":[\"ichkoymkcdyhb\",\"kkpwdreqnovvq\",\"ovljxywsu\"],\"gatewayAddress\":\"yrs\"},\"portVif\":[{\"portName\":\"tgadgvraeaen\"},{\"portName\":\"nzar\"},{\"portName\":\"lquuijfqkacewii\"}],\"status\":\"SUCCESS\",\"provisioningState\":\"Succeeded\",\"revision\":4401878821743951844},\"id\":\"wwiftohqkvpuv\",\"name\":\"sgplsakn\",\"type\":\"n\"}")
                .toObject(WorkloadNetworkSegmentInner.class);
        Assertions.assertEquals("k", model.displayName());
        Assertions.assertEquals("oxafn", model.connectedGateway());
        Assertions.assertEquals("ichkoymkcdyhb", model.subnet().dhcpRanges().get(0));
        Assertions.assertEquals("yrs", model.subnet().gatewayAddress());
        Assertions.assertEquals(4401878821743951844L, model.revision());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadNetworkSegmentInner model =
            new WorkloadNetworkSegmentInner()
                .withDisplayName("k")
                .withConnectedGateway("oxafn")
                .withSubnet(
                    new WorkloadNetworkSegmentSubnet()
                        .withDhcpRanges(Arrays.asList("ichkoymkcdyhb", "kkpwdreqnovvq", "ovljxywsu"))
                        .withGatewayAddress("yrs"))
                .withRevision(4401878821743951844L);
        model = BinaryData.fromObject(model).toObject(WorkloadNetworkSegmentInner.class);
        Assertions.assertEquals("k", model.displayName());
        Assertions.assertEquals("oxafn", model.connectedGateway());
        Assertions.assertEquals("ichkoymkcdyhb", model.subnet().dhcpRanges().get(0));
        Assertions.assertEquals("yrs", model.subnet().gatewayAddress());
        Assertions.assertEquals(4401878821743951844L, model.revision());
    }
}
