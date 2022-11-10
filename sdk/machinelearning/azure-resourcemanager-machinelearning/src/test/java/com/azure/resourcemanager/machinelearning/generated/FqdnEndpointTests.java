// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.FqdnEndpoint;
import com.azure.resourcemanager.machinelearning.models.FqdnEndpointDetail;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FqdnEndpointTests {
    @Test
    public void testDeserialize() {
        FqdnEndpoint model =
            BinaryData
                .fromString(
                    "{\"domainName\":\"ievseotgqrllt\",\"endpointDetails\":[{\"port\":883294723},{\"port\":1914003848},{\"port\":779410918},{\"port\":1035303462}]}")
                .toObject(FqdnEndpoint.class);
        Assertions.assertEquals("ievseotgqrllt", model.domainName());
        Assertions.assertEquals(883294723, model.endpointDetails().get(0).port());
    }

    @Test
    public void testSerialize() {
        FqdnEndpoint model =
            new FqdnEndpoint()
                .withDomainName("ievseotgqrllt")
                .withEndpointDetails(
                    Arrays
                        .asList(
                            new FqdnEndpointDetail().withPort(883294723),
                            new FqdnEndpointDetail().withPort(1914003848),
                            new FqdnEndpointDetail().withPort(779410918),
                            new FqdnEndpointDetail().withPort(1035303462)));
        model = BinaryData.fromObject(model).toObject(FqdnEndpoint.class);
        Assertions.assertEquals("ievseotgqrllt", model.domainName());
        Assertions.assertEquals(883294723, model.endpointDetails().get(0).port());
    }
}
