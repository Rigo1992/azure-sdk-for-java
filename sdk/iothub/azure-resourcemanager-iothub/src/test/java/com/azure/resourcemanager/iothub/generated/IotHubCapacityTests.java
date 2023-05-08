// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.IotHubCapacity;

public final class IotHubCapacityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IotHubCapacity model =
            BinaryData
                .fromString(
                    "{\"minimum\":2874780118088744582,\"maximum\":9144697658006681867,\"default\":8641218324516083606,\"scaleType\":\"Manual\"}")
                .toObject(IotHubCapacity.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IotHubCapacity model = new IotHubCapacity();
        model = BinaryData.fromObject(model).toObject(IotHubCapacity.class);
    }
}
