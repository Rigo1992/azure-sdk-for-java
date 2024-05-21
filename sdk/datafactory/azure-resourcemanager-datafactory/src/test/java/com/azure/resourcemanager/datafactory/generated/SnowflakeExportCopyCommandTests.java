// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SnowflakeExportCopyCommand;
import java.util.HashMap;
import java.util.Map;

public final class SnowflakeExportCopyCommandTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnowflakeExportCopyCommand model = BinaryData.fromString(
            "{\"type\":\"mfom\",\"additionalCopyOptions\":{\"tabgejopvegmtgoe\":\"datayphdkxw\",\"bdjzcfdpxbwqgkfx\":\"datayhojdgwezcrss\",\"yevvuddnwj\":\"datadtj\",\"flemxbmaiiv\":\"databc\"},\"additionalFormatOptions\":{\"o\":\"datatzbkevh\",\"sis\":\"datajpumpqlugzydylf\"},\"\":{\"htkprbmcazrfh\":\"datavfnxxkmrf\",\"akjxduhqilv\":\"datajwik\",\"lfrfardjqwd\":\"datajctp\"}}")
            .toObject(SnowflakeExportCopyCommand.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnowflakeExportCopyCommand model = new SnowflakeExportCopyCommand()
            .withAdditionalCopyOptions(mapOf("tabgejopvegmtgoe", "datayphdkxw", "bdjzcfdpxbwqgkfx", "datayhojdgwezcrss",
                "yevvuddnwj", "datadtj", "flemxbmaiiv", "databc"))
            .withAdditionalFormatOptions(mapOf("o", "datatzbkevh", "sis", "datajpumpqlugzydylf"));
        model = BinaryData.fromObject(model).toObject(SnowflakeExportCopyCommand.class);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
