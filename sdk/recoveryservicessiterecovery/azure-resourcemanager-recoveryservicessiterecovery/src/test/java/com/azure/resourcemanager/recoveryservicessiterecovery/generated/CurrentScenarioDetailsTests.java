// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CurrentScenarioDetails;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class CurrentScenarioDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CurrentScenarioDetails model = BinaryData
            .fromString(
                "{\"scenarioName\":\"epxgyqagvr\",\"jobId\":\"npkukghimdblx\",\"startTime\":\"2021-02-15T12:58:28Z\"}")
            .toObject(CurrentScenarioDetails.class);
        Assertions.assertEquals("epxgyqagvr", model.scenarioName());
        Assertions.assertEquals("npkukghimdblx", model.jobId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-15T12:58:28Z"), model.startTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CurrentScenarioDetails model = new CurrentScenarioDetails().withScenarioName("epxgyqagvr")
            .withJobId("npkukghimdblx").withStartTime(OffsetDateTime.parse("2021-02-15T12:58:28Z"));
        model = BinaryData.fromObject(model).toObject(CurrentScenarioDetails.class);
        Assertions.assertEquals("epxgyqagvr", model.scenarioName());
        Assertions.assertEquals("npkukghimdblx", model.jobId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-15T12:58:28Z"), model.startTime());
    }
}
