// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.RoleDefinitionInner;

/** Samples for RoleDefinitions CreateOrUpdate. */
public final class RoleDefinitionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2015-07-01/examples/PutRoleDefinition.json
     */
    /**
     * Sample code: Create role definition.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createRoleDefinition(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .accessManagement()
            .roleAssignments()
            .manager()
            .roleServiceClient()
            .getRoleDefinitions()
            .createOrUpdateWithResponse("scope", "roleDefinitionId", new RoleDefinitionInner(), Context.NONE);
    }
}
