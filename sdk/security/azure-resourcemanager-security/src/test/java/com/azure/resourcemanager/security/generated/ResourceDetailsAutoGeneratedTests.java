// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ResourceDetailsAutoGenerated;
import com.azure.resourcemanager.security.models.Source;
import org.junit.jupiter.api.Assertions;

public final class ResourceDetailsAutoGeneratedTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceDetailsAutoGenerated model =
            BinaryData
                .fromString("{\"source\":\"OnPremiseSql\",\"id\":\"eseyqr\",\"connectorId\":\"y\"}")
                .toObject(ResourceDetailsAutoGenerated.class);
        Assertions.assertEquals(Source.ON_PREMISE_SQL, model.source());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceDetailsAutoGenerated model = new ResourceDetailsAutoGenerated().withSource(Source.ON_PREMISE_SQL);
        model = BinaryData.fromObject(model).toObject(ResourceDetailsAutoGenerated.class);
        Assertions.assertEquals(Source.ON_PREMISE_SQL, model.source());
    }
}
