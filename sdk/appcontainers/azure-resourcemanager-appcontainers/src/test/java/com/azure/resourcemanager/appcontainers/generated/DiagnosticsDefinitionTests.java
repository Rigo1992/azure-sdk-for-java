// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DiagnosticSupportTopic;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsDefinition;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DiagnosticsDefinitionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiagnosticsDefinition model =
            BinaryData
                .fromString(
                    "{\"id\":\"rxgkne\",\"name\":\"yinzqodfvpgs\",\"description\":\"xgsg\",\"author\":\"fgzdjtxvz\",\"category\":\"bqvgaqv\",\"supportTopicList\":[{\"id\":\"cqusr\",\"pesId\":\"etnwsdtutnw\"}],\"analysisTypes\":[\"ycvuzhyrmewipmv\",\"k\",\"xukuqgsj\",\"xundxgk\"],\"type\":\"wzhhzjhfjmhvvmuv\",\"score\":15.738064}")
                .toObject(DiagnosticsDefinition.class);
        Assertions.assertEquals("ycvuzhyrmewipmv", model.analysisTypes().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiagnosticsDefinition model =
            new DiagnosticsDefinition()
                .withSupportTopicList(Arrays.asList(new DiagnosticSupportTopic()))
                .withAnalysisTypes(Arrays.asList("ycvuzhyrmewipmv", "k", "xukuqgsj", "xundxgk"));
        model = BinaryData.fromObject(model).toObject(DiagnosticsDefinition.class);
        Assertions.assertEquals("ycvuzhyrmewipmv", model.analysisTypes().get(0));
    }
}
