// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CompressionReadSettings;
import com.azure.resourcemanager.datafactory.models.ParquetReadSettings;
import com.azure.resourcemanager.datafactory.models.ParquetSource;
import com.azure.resourcemanager.datafactory.models.StoreReadSettings;
import java.util.HashMap;
import java.util.Map;

public final class ParquetSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ParquetSource model = BinaryData.fromString(
            "{\"type\":\"ParquetSource\",\"storeSettings\":{\"type\":\"StoreReadSettings\",\"maxConcurrentConnections\":\"datagadkrknyyjngdf\",\"disableMetricsCollection\":\"datacjfqmyfgwbuxq\",\"\":{\"xzyj\":\"datagbqsv\"}},\"formatSettings\":{\"type\":\"ParquetReadSettings\",\"compressionProperties\":{\"type\":\"CompressionReadSettings\",\"\":{\"xrsky\":\"datamqutgxdlznfokc\"}},\"\":{\"teikktret\":\"datapp\",\"nvb\":\"datatsygzjplaxxfnrlt\"}},\"additionalColumns\":\"dataotghxkrrpmgdoli\",\"sourceRetryCount\":\"datazsglavdtttyd\",\"sourceRetryWait\":\"dataomz\",\"maxConcurrentConnections\":\"datakjq\",\"disableMetricsCollection\":\"datahbypwmveyrciked\",\"\":{\"sz\":\"datafjuqowuicvjy\",\"lwkcgu\":\"dataleuqxhmr\"}}")
            .toObject(ParquetSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ParquetSource model
            = new ParquetSource().withSourceRetryCount("datazsglavdtttyd").withSourceRetryWait("dataomz")
                .withMaxConcurrentConnections("datakjq").withDisableMetricsCollection("datahbypwmveyrciked")
                .withStoreSettings(new StoreReadSettings().withMaxConcurrentConnections("datagadkrknyyjngdf")
                    .withDisableMetricsCollection("datacjfqmyfgwbuxq")
                    .withAdditionalProperties(mapOf("type", "StoreReadSettings")))
                .withFormatSettings(new ParquetReadSettings().withCompressionProperties(
                    new CompressionReadSettings().withAdditionalProperties(mapOf("type", "CompressionReadSettings"))))
                .withAdditionalColumns("dataotghxkrrpmgdoli");
        model = BinaryData.fromObject(model).toObject(ParquetSource.class);
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
