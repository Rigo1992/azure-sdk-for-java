// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for CustomEntityStoreAssignments Create.
 */
public final class CustomEntityStoreAssignmentsCreateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2021-07-01-preview/examples/CustomEntityStoreAssignments/customEntityStoreAssignmentCreate_example.json
     */
    /**
     * Sample code: Create a custom entity store assignment.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void createACustomEntityStoreAssignment(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.customEntityStoreAssignments()
            .define("33e7cc6e-a139-4723-a0e5-76993aee0771")
            .withExistingResourceGroup("TestResourceGroup")
            .withPrincipal("aaduser=f3923a3e-ad57-4752-b1a9-fbf3c8e5e082;72f988bf-86f1-41af-91ab-2d7cd011db47")
            .create();
    }
}
