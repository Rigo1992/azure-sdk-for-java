// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.OperationInner;
import com.azure.resourcemanager.synapse.models.OperationDisplay;
import com.azure.resourcemanager.synapse.models.OperationListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"qofyuicdhzbdy\",\"display\":{\"provider\":\"gbdvibidmhmwff\",\"operation\":\"fmuvapckccr\",\"resource\":\"weyoxoy\",\"description\":\"k\"},\"origin\":\"aimmoiroqb\",\"properties\":\"datahbragapyyr\"},{\"name\":\"svbpavbopfppdbwn\",\"display\":{\"provider\":\"ahxku\",\"operation\":\"sjcaacfdmmcpugm\",\"resource\":\"qepvufhbzeh\",\"description\":\"hoqhnl\"},\"origin\":\"nbldxeaclgschori\",\"properties\":\"datarsrrmoucsofldp\"},{\"name\":\"iyfc\",\"display\":{\"provider\":\"eolhbhlvbmx\",\"operation\":\"ibsxtkcud\",\"resource\":\"sfar\",\"description\":\"iowl\"},\"origin\":\"xnq\",\"properties\":\"datawgfstmhqykizm\"}],\"nextLink\":\"saoafcluqvox\"}")
                .toObject(OperationListResult.class);
        Assertions.assertEquals("qofyuicdhzbdy", model.value().get(0).name());
        Assertions.assertEquals("gbdvibidmhmwff", model.value().get(0).display().provider());
        Assertions.assertEquals("fmuvapckccr", model.value().get(0).display().operation());
        Assertions.assertEquals("weyoxoy", model.value().get(0).display().resource());
        Assertions.assertEquals("k", model.value().get(0).display().description());
        Assertions.assertEquals("aimmoiroqb", model.value().get(0).origin());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model =
            new OperationListResult()
                .withValue(
                    Arrays
                        .asList(
                            new OperationInner()
                                .withName("qofyuicdhzbdy")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("gbdvibidmhmwff")
                                        .withOperation("fmuvapckccr")
                                        .withResource("weyoxoy")
                                        .withDescription("k"))
                                .withOrigin("aimmoiroqb")
                                .withProperties("datahbragapyyr"),
                            new OperationInner()
                                .withName("svbpavbopfppdbwn")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("ahxku")
                                        .withOperation("sjcaacfdmmcpugm")
                                        .withResource("qepvufhbzeh")
                                        .withDescription("hoqhnl"))
                                .withOrigin("nbldxeaclgschori")
                                .withProperties("datarsrrmoucsofldp"),
                            new OperationInner()
                                .withName("iyfc")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("eolhbhlvbmx")
                                        .withOperation("ibsxtkcud")
                                        .withResource("sfar")
                                        .withDescription("iowl"))
                                .withOrigin("xnq")
                                .withProperties("datawgfstmhqykizm")));
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
        Assertions.assertEquals("qofyuicdhzbdy", model.value().get(0).name());
        Assertions.assertEquals("gbdvibidmhmwff", model.value().get(0).display().provider());
        Assertions.assertEquals("fmuvapckccr", model.value().get(0).display().operation());
        Assertions.assertEquals("weyoxoy", model.value().get(0).display().resource());
        Assertions.assertEquals("k", model.value().get(0).display().description());
        Assertions.assertEquals("aimmoiroqb", model.value().get(0).origin());
    }
}
