// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.redis.models.DefaultName;

/** Samples for PatchSchedules Delete. */
public final class PatchSchedulesDeleteSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2021-06-01/examples/RedisCachePatchSchedulesDelete.json
     */
    /**
     * Sample code: RedisCachePatchSchedulesDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void redisCachePatchSchedulesDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .redisCaches()
            .manager()
            .serviceClient()
            .getPatchSchedules()
            .deleteWithResponse("rg1", "cache1", DefaultName.DEFAULT, Context.NONE);
    }
}
