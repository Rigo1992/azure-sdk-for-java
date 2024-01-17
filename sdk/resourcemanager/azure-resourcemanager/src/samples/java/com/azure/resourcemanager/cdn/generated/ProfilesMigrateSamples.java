// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

import com.azure.resourcemanager.cdn.models.MigrationParameters;
import com.azure.resourcemanager.cdn.models.ResourceReference;
import com.azure.resourcemanager.cdn.models.Sku;
import com.azure.resourcemanager.cdn.models.SkuName;

/** Samples for Profiles Migrate. */
public final class ProfilesMigrateSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/Profiles_Migrate.json
     */
    /**
     * Sample code: Profiles_Migrate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void profilesMigrate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getProfiles()
            .migrate(
                "RG",
                new MigrationParameters()
                    .withSku(new Sku().withName(SkuName.STANDARD_AZURE_FRONT_DOOR))
                    .withClassicResourceReference(
                        new ResourceReference()
                            .withId(
                                "/subscriptions/subid/resourcegroups/RG/providers/Microsoft.Network/frontdoors/frontdoorname"))
                    .withProfileName("profile1"),
                com.azure.core.util.Context.NONE);
    }
}
