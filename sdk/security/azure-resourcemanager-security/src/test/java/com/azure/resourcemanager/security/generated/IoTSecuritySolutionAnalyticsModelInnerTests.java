// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionAnalyticsModelInner;
import com.azure.resourcemanager.security.models.IoTSecurityAlertedDevice;
import com.azure.resourcemanager.security.models.IoTSecurityDeviceAlert;
import com.azure.resourcemanager.security.models.IoTSecurityDeviceRecommendation;
import java.util.Arrays;

public final class IoTSecuritySolutionAnalyticsModelInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IoTSecuritySolutionAnalyticsModelInner model = BinaryData.fromString(
            "{\"properties\":{\"metrics\":{\"high\":6305545466909412711,\"medium\":8195055251984826363,\"low\":4830440788707299128},\"unhealthyDeviceCount\":471557874852116918,\"devicesMetrics\":[{\"date\":\"2021-10-12T12:35:10Z\",\"devicesMetrics\":{\"high\":5325894233408276718,\"medium\":6559236271976201384,\"low\":393726436509496352}},{\"date\":\"2020-12-21T16:05:28Z\",\"devicesMetrics\":{\"high\":4646574514973502366,\"medium\":4763535453823038956,\"low\":4302482241155419558}}],\"topAlertedDevices\":[{\"deviceId\":\"idvmfqhppubo\",\"alertsCount\":5928896004596070285}],\"mostPrevalentDeviceAlerts\":[{\"alertDisplayName\":\"kmtdher\",\"reportedSeverity\":\"Low\",\"alertsCount\":638483715899302997},{\"alertDisplayName\":\"ahokqtobkauxofsh\",\"reportedSeverity\":\"High\",\"alertsCount\":3172922641680010339},{\"alertDisplayName\":\"lai\",\"reportedSeverity\":\"Medium\",\"alertsCount\":1933668171444781550}],\"mostPrevalentDeviceRecommendations\":[{\"recommendationDisplayName\":\"lwkojpllndnpdw\",\"reportedSeverity\":\"High\",\"devicesCount\":3295231317713174174}]},\"id\":\"fugsnnfhyetefy\",\"name\":\"oc\",\"type\":\"ctfjgtixr\"}")
            .toObject(IoTSecuritySolutionAnalyticsModelInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IoTSecuritySolutionAnalyticsModelInner model = new IoTSecuritySolutionAnalyticsModelInner()
            .withTopAlertedDevices(Arrays.asList(new IoTSecurityAlertedDevice()))
            .withMostPrevalentDeviceAlerts(
                Arrays.asList(new IoTSecurityDeviceAlert(), new IoTSecurityDeviceAlert(), new IoTSecurityDeviceAlert()))
            .withMostPrevalentDeviceRecommendations(Arrays.asList(new IoTSecurityDeviceRecommendation()));
        model = BinaryData.fromObject(model).toObject(IoTSecuritySolutionAnalyticsModelInner.class);
    }
}
