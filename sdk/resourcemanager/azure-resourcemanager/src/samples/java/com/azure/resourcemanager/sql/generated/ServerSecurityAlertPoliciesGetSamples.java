// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.models.SecurityAlertPolicyName;

/** Samples for ServerSecurityAlertPolicies Get. */
public final class ServerSecurityAlertPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ServerSecurityAlertsGet.json
     */
    /**
     * Sample code: Get a server's threat detection policy.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAServerSThreatDetectionPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServerSecurityAlertPolicies()
            .getWithResponse(
                "securityalert-4799",
                "securityalert-6440",
                SecurityAlertPolicyName.DEFAULT,
                com.azure.core.util.Context.NONE);
    }
}
