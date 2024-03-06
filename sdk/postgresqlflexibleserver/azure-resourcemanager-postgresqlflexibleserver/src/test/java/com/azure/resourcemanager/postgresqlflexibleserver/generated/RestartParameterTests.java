// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FailoverMode;
import com.azure.resourcemanager.postgresqlflexibleserver.models.RestartParameter;
import org.junit.jupiter.api.Assertions;

public final class RestartParameterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RestartParameter model
            = BinaryData.fromString("{\"restartWithFailover\":false,\"failoverMode\":\"PlannedSwitchover\"}")
                .toObject(RestartParameter.class);
        Assertions.assertEquals(false, model.restartWithFailover());
        Assertions.assertEquals(FailoverMode.PLANNED_SWITCHOVER, model.failoverMode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RestartParameter model
            = new RestartParameter().withRestartWithFailover(false).withFailoverMode(FailoverMode.PLANNED_SWITCHOVER);
        model = BinaryData.fromObject(model).toObject(RestartParameter.class);
        Assertions.assertEquals(false, model.restartWithFailover());
        Assertions.assertEquals(FailoverMode.PLANNED_SWITCHOVER, model.failoverMode());
    }
}
