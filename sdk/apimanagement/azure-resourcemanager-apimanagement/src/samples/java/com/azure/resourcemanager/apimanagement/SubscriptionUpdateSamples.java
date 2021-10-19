// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.SubscriptionUpdateParameters;

/** Samples for Subscription Update. */
public final class SubscriptionUpdateSamples {
    /*
     * operationId: Subscription_Update
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementUpdateSubscription
     */
    /**
     * Sample code: ApiManagementUpdateSubscription.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementUpdateSubscription(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .subscriptions()
            .updateWithResponse(
                "rg1",
                "apimService1",
                "testsub",
                "*",
                new SubscriptionUpdateParameters().withDisplayName("testsub"),
                null,
                null,
                Context.NONE);
    }
}
