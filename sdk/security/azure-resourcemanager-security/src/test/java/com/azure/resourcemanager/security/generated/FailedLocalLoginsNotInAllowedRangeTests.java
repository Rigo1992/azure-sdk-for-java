// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.FailedLocalLoginsNotInAllowedRange;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class FailedLocalLoginsNotInAllowedRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FailedLocalLoginsNotInAllowedRange model =
            BinaryData
                .fromString(
                    "{\"ruleType\":\"FailedLocalLoginsNotInAllowedRange\",\"timeWindowSize\":\"PT78H46M30S\",\"minThreshold\":1982738288,\"maxThreshold\":589538374,\"displayName\":\"rrcoi\",\"description\":\"bamnppcc\",\"isEnabled\":true}")
                .toObject(FailedLocalLoginsNotInAllowedRange.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals(1982738288, model.minThreshold());
        Assertions.assertEquals(589538374, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT78H46M30S"), model.timeWindowSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FailedLocalLoginsNotInAllowedRange model =
            new FailedLocalLoginsNotInAllowedRange()
                .withIsEnabled(true)
                .withMinThreshold(1982738288)
                .withMaxThreshold(589538374)
                .withTimeWindowSize(Duration.parse("PT78H46M30S"));
        model = BinaryData.fromObject(model).toObject(FailedLocalLoginsNotInAllowedRange.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals(1982738288, model.minThreshold());
        Assertions.assertEquals(589538374, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT78H46M30S"), model.timeWindowSize());
    }
}
