// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.redis.models.RedisUpdateParameters;

/** Samples for Redis Update. */
public final class RedisUpdateSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2021-06-01/examples/RedisCacheUpdate.json
     */
    /**
     * Sample code: RedisCacheUpdate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void redisCacheUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .redisCaches()
            .manager()
            .serviceClient()
            .getRedis()
            .updateWithResponse(
                "rg1",
                "cache1",
                new RedisUpdateParameters().withEnableNonSslPort(true).withReplicasPerPrimary(2),
                Context.NONE);
    }
}
