// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.LakeHouseLocation;

public final class LakeHouseLocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LakeHouseLocation model = BinaryData.fromString(
            "{\"type\":\"lznfhkqytkztado\",\"folderPath\":\"datafzdgjfcycrsvloy\",\"fileName\":\"dataigqkzjuqwqa\",\"\":{\"pnfdbgsosciene\":\"datazxpixhyo\"}}")
            .toObject(LakeHouseLocation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LakeHouseLocation model
            = new LakeHouseLocation().withFolderPath("datafzdgjfcycrsvloy").withFileName("dataigqkzjuqwqa");
        model = BinaryData.fromObject(model).toObject(LakeHouseLocation.class);
    }
}
