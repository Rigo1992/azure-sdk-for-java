// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreateNetworkMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreateNetworkMappingInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.FabricSpecificCreateNetworkMappingInput;
import org.junit.jupiter.api.Assertions;

public final class CreateNetworkMappingInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateNetworkMappingInput model = BinaryData.fromString(
            "{\"properties\":{\"recoveryFabricName\":\"yp\",\"recoveryNetworkId\":\"rbpizc\",\"fabricSpecificDetails\":{\"instanceType\":\"FabricSpecificCreateNetworkMappingInput\"}}}")
            .toObject(CreateNetworkMappingInput.class);
        Assertions.assertEquals("yp", model.properties().recoveryFabricName());
        Assertions.assertEquals("rbpizc", model.properties().recoveryNetworkId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateNetworkMappingInput model = new CreateNetworkMappingInput().withProperties(
            new CreateNetworkMappingInputProperties().withRecoveryFabricName("yp").withRecoveryNetworkId("rbpizc")
                .withFabricSpecificDetails(new FabricSpecificCreateNetworkMappingInput()));
        model = BinaryData.fromObject(model).toObject(CreateNetworkMappingInput.class);
        Assertions.assertEquals("yp", model.properties().recoveryFabricName());
        Assertions.assertEquals("rbpizc", model.properties().recoveryNetworkId());
    }
}
