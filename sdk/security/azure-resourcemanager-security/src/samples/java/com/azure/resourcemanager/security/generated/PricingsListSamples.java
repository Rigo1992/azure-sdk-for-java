// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/** Samples for Pricings List. */
public final class PricingsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2022-03-01/examples/Pricings/ListPricings_example.json
     */
    /**
     * Sample code: Get pricings on subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getPricingsOnSubscription(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.pricings().listWithResponse(com.azure.core.util.Context.NONE);
    }
}
