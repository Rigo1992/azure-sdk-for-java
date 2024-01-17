// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.DocumentDbCollectionDatasetTypeProperties;

public final class DocumentDbCollectionDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DocumentDbCollectionDatasetTypeProperties model
            = BinaryData.fromString("{\"collectionName\":\"datakplobzgottaksadz\"}")
                .toObject(DocumentDbCollectionDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DocumentDbCollectionDatasetTypeProperties model
            = new DocumentDbCollectionDatasetTypeProperties().withCollectionName("datakplobzgottaksadz");
        model = BinaryData.fromObject(model).toObject(DocumentDbCollectionDatasetTypeProperties.class);
    }
}
