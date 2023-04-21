// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

/** Samples for Providers GetAtTenantScope. */
public final class ProvidersGetAtTenantScopeSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2021-01-01/examples/GetNamedProviderAtTenant.json
     */
    /**
     * Sample code: Get a resource provider at tenant scope.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAResourceProviderAtTenantScope(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .serviceClient()
            .getProviders()
            .getAtTenantScopeWithResponse(
                "Microsoft.Storage", "resourceTypes/aliases", com.azure.core.util.Context.NONE);
    }
}
