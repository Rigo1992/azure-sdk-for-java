// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.DataLocationToServiceLocationMap;

public final class DataLocationToServiceLocationMapTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataLocationToServiceLocationMap model =
            BinaryData
                .fromString("{\"dataLocation\":\"mpukgriw\",\"serviceLocation\":\"zlfbxzpuzycispnq\"}")
                .toObject(DataLocationToServiceLocationMap.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataLocationToServiceLocationMap model = new DataLocationToServiceLocationMap();
        model = BinaryData.fromObject(model).toObject(DataLocationToServiceLocationMap.class);
    }
}
