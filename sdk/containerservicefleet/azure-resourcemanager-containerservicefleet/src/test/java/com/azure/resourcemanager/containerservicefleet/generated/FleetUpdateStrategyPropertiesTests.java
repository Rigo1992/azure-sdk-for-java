// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.fluent.models.FleetUpdateStrategyProperties;
import com.azure.resourcemanager.containerservicefleet.models.UpdateGroup;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRunStrategy;
import com.azure.resourcemanager.containerservicefleet.models.UpdateStage;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FleetUpdateStrategyPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FleetUpdateStrategyProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Canceled\",\"strategy\":{\"stages\":[{\"name\":\"vlopwiyighx\",\"groups\":[{\"name\":\"wzbaiue\"},{\"name\":\"baumnyqupedeoj\"}],\"afterStageWaitInSeconds\":746279797},{\"name\":\"ckhsmtxpsieb\",\"groups\":[{\"name\":\"vpesapskrdqmhjjd\"},{\"name\":\"tldwkyzxuutk\"},{\"name\":\"cwscwsvlx\"},{\"name\":\"togt\"}],\"afterStageWaitInSeconds\":1309356083},{\"name\":\"pqsxvnmicy\",\"groups\":[{\"name\":\"eoveilovnotyf\"},{\"name\":\"fcnj\"},{\"name\":\"k\"}],\"afterStageWaitInSeconds\":74427835},{\"name\":\"dhbt\",\"groups\":[{\"name\":\"h\"},{\"name\":\"wpn\"}],\"afterStageWaitInSeconds\":224051014}]}}")
                .toObject(FleetUpdateStrategyProperties.class);
        Assertions.assertEquals("vlopwiyighx", model.strategy().stages().get(0).name());
        Assertions.assertEquals("wzbaiue", model.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(746279797, model.strategy().stages().get(0).afterStageWaitInSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FleetUpdateStrategyProperties model =
            new FleetUpdateStrategyProperties()
                .withStrategy(
                    new UpdateRunStrategy()
                        .withStages(
                            Arrays
                                .asList(
                                    new UpdateStage()
                                        .withName("vlopwiyighx")
                                        .withGroups(
                                            Arrays
                                                .asList(
                                                    new UpdateGroup().withName("wzbaiue"),
                                                    new UpdateGroup().withName("baumnyqupedeoj")))
                                        .withAfterStageWaitInSeconds(746279797),
                                    new UpdateStage()
                                        .withName("ckhsmtxpsieb")
                                        .withGroups(
                                            Arrays
                                                .asList(
                                                    new UpdateGroup().withName("vpesapskrdqmhjjd"),
                                                    new UpdateGroup().withName("tldwkyzxuutk"),
                                                    new UpdateGroup().withName("cwscwsvlx"),
                                                    new UpdateGroup().withName("togt")))
                                        .withAfterStageWaitInSeconds(1309356083),
                                    new UpdateStage()
                                        .withName("pqsxvnmicy")
                                        .withGroups(
                                            Arrays
                                                .asList(
                                                    new UpdateGroup().withName("eoveilovnotyf"),
                                                    new UpdateGroup().withName("fcnj"),
                                                    new UpdateGroup().withName("k")))
                                        .withAfterStageWaitInSeconds(74427835),
                                    new UpdateStage()
                                        .withName("dhbt")
                                        .withGroups(
                                            Arrays
                                                .asList(
                                                    new UpdateGroup().withName("h"), new UpdateGroup().withName("wpn")))
                                        .withAfterStageWaitInSeconds(224051014))));
        model = BinaryData.fromObject(model).toObject(FleetUpdateStrategyProperties.class);
        Assertions.assertEquals("vlopwiyighx", model.strategy().stages().get(0).name());
        Assertions.assertEquals("wzbaiue", model.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(746279797, model.strategy().stages().get(0).afterStageWaitInSeconds());
    }
}
