// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/** Samples for SecurityOperators List. */
public final class SecurityOperatorsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-01-01-preview/examples/SecurityOperators/ListSecurityOperators_example.json
     */
    /**
     * Sample code: List SecurityOperators.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void listSecurityOperators(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.securityOperators().listWithResponse("CloudPosture", com.azure.core.util.Context.NONE);
    }
}
