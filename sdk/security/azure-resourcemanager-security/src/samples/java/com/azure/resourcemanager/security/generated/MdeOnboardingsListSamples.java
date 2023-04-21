// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/** Samples for MdeOnboardings List. */
public final class MdeOnboardingsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2021-10-01-preview/examples/MdeOnboardings/ListMdeOnboardings_example.json
     */
    /**
     * Sample code: The configuration or data needed to onboard the machine to MDE.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void theConfigurationOrDataNeededToOnboardTheMachineToMDE(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.mdeOnboardings().listWithResponse(com.azure.core.util.Context.NONE);
    }
}
