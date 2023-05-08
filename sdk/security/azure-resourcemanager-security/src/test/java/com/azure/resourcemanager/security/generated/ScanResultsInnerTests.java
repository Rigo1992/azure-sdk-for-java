// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.ScanResultInner;
import com.azure.resourcemanager.security.fluent.models.ScanResultsInner;
import com.azure.resourcemanager.security.models.RuleStatus;
import com.azure.resourcemanager.security.models.ScanResultProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScanResultsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScanResultsInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"ruleId\":\"egthortudawl\",\"status\":\"InternalError\",\"isTrimmed\":true,\"queryResults\":[]},\"id\":\"ptcbgqnzmnh\",\"name\":\"ilialwcjgc\",\"type\":\"bbcccgz\"},{\"properties\":{\"ruleId\":\"oxnyuffatsg\",\"status\":\"InternalError\",\"isTrimmed\":true,\"queryResults\":[]},\"id\":\"ubhiqdxyur\",\"name\":\"pnuhzafccnu\",\"type\":\"iig\"}]}")
                .toObject(ScanResultsInner.class);
        Assertions.assertEquals("egthortudawl", model.value().get(0).properties().ruleId());
        Assertions.assertEquals(RuleStatus.INTERNAL_ERROR, model.value().get(0).properties().status());
        Assertions.assertEquals(true, model.value().get(0).properties().isTrimmed());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScanResultsInner model =
            new ScanResultsInner()
                .withValue(
                    Arrays
                        .asList(
                            new ScanResultInner()
                                .withProperties(
                                    new ScanResultProperties()
                                        .withRuleId("egthortudawl")
                                        .withStatus(RuleStatus.INTERNAL_ERROR)
                                        .withIsTrimmed(true)
                                        .withQueryResults(Arrays.asList())),
                            new ScanResultInner()
                                .withProperties(
                                    new ScanResultProperties()
                                        .withRuleId("oxnyuffatsg")
                                        .withStatus(RuleStatus.INTERNAL_ERROR)
                                        .withIsTrimmed(true)
                                        .withQueryResults(Arrays.asList()))));
        model = BinaryData.fromObject(model).toObject(ScanResultsInner.class);
        Assertions.assertEquals("egthortudawl", model.value().get(0).properties().ruleId());
        Assertions.assertEquals(RuleStatus.INTERNAL_ERROR, model.value().get(0).properties().status());
        Assertions.assertEquals(true, model.value().get(0).properties().isTrimmed());
    }
}
