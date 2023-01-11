// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.fluent.models.MonitoringTagRulesInner;
import com.azure.resourcemanager.elastic.models.MonitoringTagRulesListResponse;
import com.azure.resourcemanager.elastic.models.MonitoringTagRulesProperties;
import com.azure.resourcemanager.elastic.models.ProvisioningState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MonitoringTagRulesListResponseTests {
    @Test
    public void testDeserialize() {
        MonitoringTagRulesListResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Deleting\"},\"id\":\"dxkqpx\",\"name\":\"kajionpim\",\"type\":\"xg\"}],\"nextLink\":\"xgcp\"}")
                .toObject(MonitoringTagRulesListResponse.class);
        Assertions.assertEquals(ProvisioningState.DELETING, model.value().get(0).properties().provisioningState());
        Assertions.assertEquals("xgcp", model.nextLink());
    }

    @Test
    public void testSerialize() {
        MonitoringTagRulesListResponse model =
            new MonitoringTagRulesListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new MonitoringTagRulesInner()
                                .withProperties(
                                    new MonitoringTagRulesProperties()
                                        .withProvisioningState(ProvisioningState.DELETING))))
                .withNextLink("xgcp");
        model = BinaryData.fromObject(model).toObject(MonitoringTagRulesListResponse.class);
        Assertions.assertEquals(ProvisioningState.DELETING, model.value().get(0).properties().provisioningState());
        Assertions.assertEquals("xgcp", model.nextLink());
    }
}
