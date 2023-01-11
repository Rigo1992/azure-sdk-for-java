// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.fluent.models.VaultUsageInner;
import com.azure.resourcemanager.recoveryservices.models.NameInfo;
import com.azure.resourcemanager.recoveryservices.models.UsagesUnit;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VaultUsageInnerTests {
    @Test
    public void testDeserialize() {
        VaultUsageInner model =
            BinaryData
                .fromString(
                    "{\"unit\":\"Bytes\",\"quotaPeriod\":\"jbkcnxdhbttkph\",\"nextResetTime\":\"2021-04-14T06:41:24Z\",\"currentValue\":5517955949236106562,\"limit\":2567791736937591136,\"name\":{\"value\":\"rmclfplphoxu\",\"localizedValue\":\"rpabg\"}}")
                .toObject(VaultUsageInner.class);
        Assertions.assertEquals(UsagesUnit.BYTES, model.unit());
        Assertions.assertEquals("jbkcnxdhbttkph", model.quotaPeriod());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-14T06:41:24Z"), model.nextResetTime());
        Assertions.assertEquals(5517955949236106562L, model.currentValue());
        Assertions.assertEquals(2567791736937591136L, model.limit());
        Assertions.assertEquals("rmclfplphoxu", model.name().value());
        Assertions.assertEquals("rpabg", model.name().localizedValue());
    }

    @Test
    public void testSerialize() {
        VaultUsageInner model =
            new VaultUsageInner()
                .withUnit(UsagesUnit.BYTES)
                .withQuotaPeriod("jbkcnxdhbttkph")
                .withNextResetTime(OffsetDateTime.parse("2021-04-14T06:41:24Z"))
                .withCurrentValue(5517955949236106562L)
                .withLimit(2567791736937591136L)
                .withName(new NameInfo().withValue("rmclfplphoxu").withLocalizedValue("rpabg"));
        model = BinaryData.fromObject(model).toObject(VaultUsageInner.class);
        Assertions.assertEquals(UsagesUnit.BYTES, model.unit());
        Assertions.assertEquals("jbkcnxdhbttkph", model.quotaPeriod());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-14T06:41:24Z"), model.nextResetTime());
        Assertions.assertEquals(5517955949236106562L, model.currentValue());
        Assertions.assertEquals(2567791736937591136L, model.limit());
        Assertions.assertEquals("rmclfplphoxu", model.name().value());
        Assertions.assertEquals("rpabg", model.name().localizedValue());
    }
}
