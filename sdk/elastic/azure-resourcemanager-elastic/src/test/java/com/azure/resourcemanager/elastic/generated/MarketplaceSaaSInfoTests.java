// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.models.MarketplaceSaaSInfo;
import com.azure.resourcemanager.elastic.models.MarketplaceSaaSInfoMarketplaceSubscription;
import org.junit.jupiter.api.Assertions;

public final class MarketplaceSaaSInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MarketplaceSaaSInfo model =
            BinaryData
                .fromString(
                    "{\"marketplaceSubscription\":{\"id\":\"g\"},\"marketplaceName\":\"tnwu\",\"marketplaceResourceId\":\"gazxuf\"}")
                .toObject(MarketplaceSaaSInfo.class);
        Assertions.assertEquals("g", model.marketplaceSubscription().id());
        Assertions.assertEquals("tnwu", model.marketplaceName());
        Assertions.assertEquals("gazxuf", model.marketplaceResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MarketplaceSaaSInfo model =
            new MarketplaceSaaSInfo()
                .withMarketplaceSubscription(new MarketplaceSaaSInfoMarketplaceSubscription().withId("g"))
                .withMarketplaceName("tnwu")
                .withMarketplaceResourceId("gazxuf");
        model = BinaryData.fromObject(model).toObject(MarketplaceSaaSInfo.class);
        Assertions.assertEquals("g", model.marketplaceSubscription().id());
        Assertions.assertEquals("tnwu", model.marketplaceName());
        Assertions.assertEquals("gazxuf", model.marketplaceResourceId());
    }
}
