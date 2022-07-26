// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for Global GetSubscriptionOperationWithAsyncResponse. */
public final class GlobalGetSubscriptionOperationWithAsyncResponseSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/GetSubscriptionOperationWithAsyncResponse.json
     */
    /**
     * Sample code: Gets an operation in a subscription and given region.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsAnOperationInASubscriptionAndGivenRegion(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getGlobals()
            .getSubscriptionOperationWithAsyncResponseWithResponse(
                "West US", "34adfa4f-cedf-4dc0-ba29-b6d1a69ab5d5", Context.NONE);
    }
}
