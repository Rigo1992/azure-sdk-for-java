// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

/**
 * Samples for Organization Delete.
 */
public final class OrganizationDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/confluent/resource-manager/Microsoft.Confluent/stable/2023-08-22/examples/Organization_Delete.json
     */
    /**
     * Sample code: Confluent_Delete.
     * 
     * @param manager Entry point to ConfluentManager.
     */
    public static void confluentDelete(com.azure.resourcemanager.confluent.ConfluentManager manager) {
        manager.organizations().delete("myResourceGroup", "myOrganization", com.azure.core.util.Context.NONE);
    }
}
