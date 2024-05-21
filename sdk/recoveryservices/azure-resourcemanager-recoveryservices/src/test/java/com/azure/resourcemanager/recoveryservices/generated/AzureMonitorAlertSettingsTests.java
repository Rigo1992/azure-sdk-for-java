// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.AlertsState;
import com.azure.resourcemanager.recoveryservices.models.AzureMonitorAlertSettings;
import org.junit.jupiter.api.Assertions;

public final class AzureMonitorAlertSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMonitorAlertSettings model = BinaryData.fromString(
            "{\"alertsForAllJobFailures\":\"Disabled\",\"alertsForAllReplicationIssues\":\"Disabled\",\"alertsForAllFailoverIssues\":\"Disabled\"}")
            .toObject(AzureMonitorAlertSettings.class);
        Assertions.assertEquals(AlertsState.DISABLED, model.alertsForAllJobFailures());
        Assertions.assertEquals(AlertsState.DISABLED, model.alertsForAllReplicationIssues());
        Assertions.assertEquals(AlertsState.DISABLED, model.alertsForAllFailoverIssues());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMonitorAlertSettings model
            = new AzureMonitorAlertSettings().withAlertsForAllJobFailures(AlertsState.DISABLED)
                .withAlertsForAllReplicationIssues(AlertsState.DISABLED)
                .withAlertsForAllFailoverIssues(AlertsState.DISABLED);
        model = BinaryData.fromObject(model).toObject(AzureMonitorAlertSettings.class);
        Assertions.assertEquals(AlertsState.DISABLED, model.alertsForAllJobFailures());
        Assertions.assertEquals(AlertsState.DISABLED, model.alertsForAllReplicationIssues());
        Assertions.assertEquals(AlertsState.DISABLED, model.alertsForAllFailoverIssues());
    }
}
