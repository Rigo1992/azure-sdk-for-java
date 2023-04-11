// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.CosmosDbDataConnectionProperties;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class CosmosDbDataConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CosmosDbDataConnectionProperties model =
            BinaryData
                .fromString(
                    "{\"tableName\":\"krribdeibqi\",\"mappingRuleName\":\"kghv\",\"managedIdentityResourceId\":\"ndzwmkrefa\",\"managedIdentityObjectId\":\"jorwkqnyhgbij\",\"cosmosDbAccountResourceId\":\"jivfxzsjabib\",\"cosmosDbDatabase\":\"ystawfsdjpvkvp\",\"cosmosDbContainer\":\"jxbkzbzkdvn\",\"retrievalStartDate\":\"2021-04-26T00:18:09Z\",\"provisioningState\":\"Creating\"}")
                .toObject(CosmosDbDataConnectionProperties.class);
        Assertions.assertEquals("krribdeibqi", model.tableName());
        Assertions.assertEquals("kghv", model.mappingRuleName());
        Assertions.assertEquals("ndzwmkrefa", model.managedIdentityResourceId());
        Assertions.assertEquals("jivfxzsjabib", model.cosmosDbAccountResourceId());
        Assertions.assertEquals("ystawfsdjpvkvp", model.cosmosDbDatabase());
        Assertions.assertEquals("jxbkzbzkdvn", model.cosmosDbContainer());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-26T00:18:09Z"), model.retrievalStartDate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CosmosDbDataConnectionProperties model =
            new CosmosDbDataConnectionProperties()
                .withTableName("krribdeibqi")
                .withMappingRuleName("kghv")
                .withManagedIdentityResourceId("ndzwmkrefa")
                .withCosmosDbAccountResourceId("jivfxzsjabib")
                .withCosmosDbDatabase("ystawfsdjpvkvp")
                .withCosmosDbContainer("jxbkzbzkdvn")
                .withRetrievalStartDate(OffsetDateTime.parse("2021-04-26T00:18:09Z"));
        model = BinaryData.fromObject(model).toObject(CosmosDbDataConnectionProperties.class);
        Assertions.assertEquals("krribdeibqi", model.tableName());
        Assertions.assertEquals("kghv", model.mappingRuleName());
        Assertions.assertEquals("ndzwmkrefa", model.managedIdentityResourceId());
        Assertions.assertEquals("jivfxzsjabib", model.cosmosDbAccountResourceId());
        Assertions.assertEquals("ystawfsdjpvkvp", model.cosmosDbDatabase());
        Assertions.assertEquals("jxbkzbzkdvn", model.cosmosDbContainer());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-26T00:18:09Z"), model.retrievalStartDate());
    }
}
