// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated;

/** Samples for RoleAssignmentScheduleRequests ListForScope. */
public final class RoleAssignmentScheduleRequestsListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-04-01-preview/examples/GetRoleAssignmentScheduleRequestByScope.json
     */
    /**
     * Sample code: GetRoleAssignmentScheduleRequestByScope.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getRoleAssignmentScheduleRequestByScope(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .accessManagement()
            .roleAssignments()
            .manager()
            .roleServiceClient()
            .getRoleAssignmentScheduleRequests()
            .listForScope(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "assignedTo('A3BB8764-CB92-4276-9D2A-CA1E895E55EA')",
                com.azure.core.util.Context.NONE);
    }
}
