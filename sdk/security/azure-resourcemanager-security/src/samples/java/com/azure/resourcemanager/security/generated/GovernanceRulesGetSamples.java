// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/** Samples for GovernanceRules Get. */
public final class GovernanceRulesGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2022-01-01-preview/examples/GovernanceRules/GetManagementGroupGovernanceRule_example.json
     */
    /**
     * Sample code: Get a governance rule over management group scope.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getAGovernanceRuleOverManagementGroupScope(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .governanceRules()
            .getWithResponse(
                "providers/Microsoft.Management/managementGroups/contoso",
                "ad9a8e26-29d9-4829-bb30-e597a58cdbb8",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2022-01-01-preview/examples/GovernanceRules/GetGovernanceRule_example.json
     */
    /**
     * Sample code: Get a governance rule over subscription scope.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getAGovernanceRuleOverSubscriptionScope(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .governanceRules()
            .getWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23",
                "ad9a8e26-29d9-4829-bb30-e597a58cdbb8",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2022-01-01-preview/examples/GovernanceRules/GetSecurityConnectorGovernanceRule_example.json
     */
    /**
     * Sample code: Get a governance rule over security connector scope.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getAGovernanceRuleOverSecurityConnectorScope(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .governanceRules()
            .getWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/gcpResourceGroup/providers/Microsoft.Security/securityConnectors/gcpconnector",
                "ad9a8e26-29d9-4829-bb30-e597a58cdbb8",
                com.azure.core.util.Context.NONE);
    }
}
