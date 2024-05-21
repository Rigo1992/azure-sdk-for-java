// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.GovernanceRuleEmailNotification;
import org.junit.jupiter.api.Assertions;

public final class GovernanceRuleEmailNotificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GovernanceRuleEmailNotification model = BinaryData
            .fromString("{\"disableManagerEmailNotification\":true,\"disableOwnerEmailNotification\":false}")
            .toObject(GovernanceRuleEmailNotification.class);
        Assertions.assertEquals(true, model.disableManagerEmailNotification());
        Assertions.assertEquals(false, model.disableOwnerEmailNotification());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GovernanceRuleEmailNotification model
            = new GovernanceRuleEmailNotification().withDisableManagerEmailNotification(true)
                .withDisableOwnerEmailNotification(false);
        model = BinaryData.fromObject(model).toObject(GovernanceRuleEmailNotification.class);
        Assertions.assertEquals(true, model.disableManagerEmailNotification());
        Assertions.assertEquals(false, model.disableOwnerEmailNotification());
    }
}
