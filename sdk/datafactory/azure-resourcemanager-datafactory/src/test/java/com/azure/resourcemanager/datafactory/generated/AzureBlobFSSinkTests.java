// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobFSSink;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import java.util.Arrays;

public final class AzureBlobFSSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobFSSink model = BinaryData.fromString(
            "{\"type\":\"AzureBlobFSSink\",\"copyBehavior\":\"dataqnprbvruhdjzivl\",\"metadata\":[{\"name\":\"datamq\",\"value\":\"datambfpt\"}],\"writeBatchSize\":\"dataxmksxxbdtjvvngn\",\"writeBatchTimeout\":\"datakzulmqxficinw\",\"sinkRetryCount\":\"dataveyxtxerxttobo\",\"sinkRetryWait\":\"dataxb\",\"maxConcurrentConnections\":\"datattenruditu\",\"disableMetricsCollection\":\"dataycvt\",\"\":{\"hivxblqvwhjgtbh\":\"datalyimhspj\"}}")
            .toObject(AzureBlobFSSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobFSSink model = new AzureBlobFSSink().withWriteBatchSize("dataxmksxxbdtjvvngn")
            .withWriteBatchTimeout("datakzulmqxficinw").withSinkRetryCount("dataveyxtxerxttobo")
            .withSinkRetryWait("dataxb").withMaxConcurrentConnections("datattenruditu")
            .withDisableMetricsCollection("dataycvt").withCopyBehavior("dataqnprbvruhdjzivl")
            .withMetadata(Arrays.asList(new MetadataItem().withName("datamq").withValue("datambfpt")));
        model = BinaryData.fromObject(model).toObject(AzureBlobFSSink.class);
    }
}
