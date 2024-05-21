// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobFSSource;

public final class AzureBlobFSSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobFSSource model = BinaryData.fromString(
            "{\"type\":\"tnhi\",\"treatEmptyAsNull\":\"dataoeegal\",\"skipHeaderLineCount\":\"dataqy\",\"recursive\":\"datayzilocn\",\"sourceRetryCount\":\"dataegjvhyvnqbhcl\",\"sourceRetryWait\":\"dataksoqzzyrovvnac\",\"maxConcurrentConnections\":\"datajmhclhcqcjngwmb\",\"disableMetricsCollection\":\"datagsidasovlrj\",\"\":{\"pxxbkxwhsfhe\":\"dataydtjebbacscirzts\"}}")
            .toObject(AzureBlobFSSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobFSSource model = new AzureBlobFSSource().withSourceRetryCount("dataegjvhyvnqbhcl")
            .withSourceRetryWait("dataksoqzzyrovvnac")
            .withMaxConcurrentConnections("datajmhclhcqcjngwmb")
            .withDisableMetricsCollection("datagsidasovlrj")
            .withTreatEmptyAsNull("dataoeegal")
            .withSkipHeaderLineCount("dataqy")
            .withRecursive("datayzilocn");
        model = BinaryData.fromObject(model).toObject(AzureBlobFSSource.class);
    }
}
