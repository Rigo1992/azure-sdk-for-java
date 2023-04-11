// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.GovernanceRuleOwnerSource;
import com.azure.resourcemanager.security.models.GovernanceRuleOwnerSourceType;
import org.junit.jupiter.api.Assertions;

public final class GovernanceRuleOwnerSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GovernanceRuleOwnerSource model =
            BinaryData.fromString("{\"type\":\"ByTag\",\"value\":\"mtx\"}").toObject(GovernanceRuleOwnerSource.class);
        Assertions.assertEquals(GovernanceRuleOwnerSourceType.BY_TAG, model.type());
        Assertions.assertEquals("mtx", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GovernanceRuleOwnerSource model =
            new GovernanceRuleOwnerSource().withType(GovernanceRuleOwnerSourceType.BY_TAG).withValue("mtx");
        model = BinaryData.fromObject(model).toObject(GovernanceRuleOwnerSource.class);
        Assertions.assertEquals(GovernanceRuleOwnerSourceType.BY_TAG, model.type());
        Assertions.assertEquals("mtx", model.value());
    }
}
