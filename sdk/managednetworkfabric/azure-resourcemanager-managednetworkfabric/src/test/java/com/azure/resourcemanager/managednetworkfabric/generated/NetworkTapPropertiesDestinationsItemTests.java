// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.DestinationType;
import com.azure.resourcemanager.managednetworkfabric.models.Encapsulation;
import com.azure.resourcemanager.managednetworkfabric.models.IsolationDomainProperties;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapPropertiesDestinationsItem;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkTapPropertiesDestinationsItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkTapPropertiesDestinationsItem model =
            BinaryData
                .fromString(
                    "{\"name\":\"avi\",\"destinationType\":\"IsolationDomain\",\"destinationId\":\"g\",\"isolationDomainProperties\":{\"encapsulation\":\"None\",\"neighborGroupIds\":[\"wichmxczby\"]},\"destinationTapRuleId\":\"ocgmzdcts\"}")
                .toObject(NetworkTapPropertiesDestinationsItem.class);
        Assertions.assertEquals("avi", model.name());
        Assertions.assertEquals(DestinationType.ISOLATION_DOMAIN, model.destinationType());
        Assertions.assertEquals("g", model.destinationId());
        Assertions.assertEquals(Encapsulation.NONE, model.isolationDomainProperties().encapsulation());
        Assertions.assertEquals("wichmxczby", model.isolationDomainProperties().neighborGroupIds().get(0));
        Assertions.assertEquals("ocgmzdcts", model.destinationTapRuleId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkTapPropertiesDestinationsItem model =
            new NetworkTapPropertiesDestinationsItem()
                .withName("avi")
                .withDestinationType(DestinationType.ISOLATION_DOMAIN)
                .withDestinationId("g")
                .withIsolationDomainProperties(
                    new IsolationDomainProperties()
                        .withEncapsulation(Encapsulation.NONE)
                        .withNeighborGroupIds(Arrays.asList("wichmxczby")))
                .withDestinationTapRuleId("ocgmzdcts");
        model = BinaryData.fromObject(model).toObject(NetworkTapPropertiesDestinationsItem.class);
        Assertions.assertEquals("avi", model.name());
        Assertions.assertEquals(DestinationType.ISOLATION_DOMAIN, model.destinationType());
        Assertions.assertEquals("g", model.destinationId());
        Assertions.assertEquals(Encapsulation.NONE, model.isolationDomainProperties().encapsulation());
        Assertions.assertEquals("wichmxczby", model.isolationDomainProperties().neighborGroupIds().get(0));
        Assertions.assertEquals("ocgmzdcts", model.destinationTapRuleId());
    }
}