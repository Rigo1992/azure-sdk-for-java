// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.ApplicationProperties;
import com.azure.resourcemanager.security.models.ApplicationSourceResourceType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ApplicationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationProperties model = BinaryData.fromString(
            "{\"displayName\":\"efkifr\",\"description\":\"puqujmqlgkfbtn\",\"sourceResourceType\":\"Assessments\",\"conditionSets\":[\"dataongbjcnt\",\"datajitcjedftwwaez\"]}")
            .toObject(ApplicationProperties.class);
        Assertions.assertEquals("efkifr", model.displayName());
        Assertions.assertEquals("puqujmqlgkfbtn", model.description());
        Assertions.assertEquals(ApplicationSourceResourceType.ASSESSMENTS, model.sourceResourceType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationProperties model = new ApplicationProperties().withDisplayName("efkifr")
            .withDescription("puqujmqlgkfbtn")
            .withSourceResourceType(ApplicationSourceResourceType.ASSESSMENTS)
            .withConditionSets(Arrays.asList("dataongbjcnt", "datajitcjedftwwaez"));
        model = BinaryData.fromObject(model).toObject(ApplicationProperties.class);
        Assertions.assertEquals("efkifr", model.displayName());
        Assertions.assertEquals("puqujmqlgkfbtn", model.description());
        Assertions.assertEquals(ApplicationSourceResourceType.ASSESSMENTS, model.sourceResourceType());
    }
}
