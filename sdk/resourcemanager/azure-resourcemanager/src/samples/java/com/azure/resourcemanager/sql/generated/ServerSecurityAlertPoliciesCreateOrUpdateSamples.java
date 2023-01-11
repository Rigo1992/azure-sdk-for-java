// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.ServerSecurityAlertPolicyInner;
import com.azure.resourcemanager.sql.models.SecurityAlertPolicyNameAutoGenerated;
import com.azure.resourcemanager.sql.models.SecurityAlertPolicyState;
import java.util.Arrays;

/** Samples for ServerSecurityAlertPolicies CreateOrUpdate. */
public final class ServerSecurityAlertPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ServerSecurityAlertsCreateMin.json
     */
    /**
     * Sample code: Update a server's threat detection policy with minimal parameters.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAServerSThreatDetectionPolicyWithMinimalParameters(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServerSecurityAlertPolicies()
            .createOrUpdate(
                "securityalert-4799",
                "securityalert-6440",
                SecurityAlertPolicyNameAutoGenerated.DEFAULT,
                new ServerSecurityAlertPolicyInner().withState(SecurityAlertPolicyState.ENABLED),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ServerSecurityAlertsCreateMax.json
     */
    /**
     * Sample code: Update a server's threat detection policy with all parameters.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAServerSThreatDetectionPolicyWithAllParameters(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServerSecurityAlertPolicies()
            .createOrUpdate(
                "securityalert-4799",
                "securityalert-6440",
                SecurityAlertPolicyNameAutoGenerated.DEFAULT,
                new ServerSecurityAlertPolicyInner()
                    .withState(SecurityAlertPolicyState.ENABLED)
                    .withDisabledAlerts(Arrays.asList("Access_Anomaly", "Usage_Anomaly"))
                    .withEmailAddresses(Arrays.asList("testSecurityAlert@microsoft.com"))
                    .withEmailAccountAdmins(true)
                    .withStorageEndpoint("https://mystorage.blob.core.windows.net")
                    .withStorageAccountAccessKey(
                        "sdlfkjabc+sdlfkjsdlkfsjdfLDKFTERLKFDFKLjsdfksjdflsdkfD2342309432849328476458/3RSD==")
                    .withRetentionDays(5),
                Context.NONE);
    }
}
