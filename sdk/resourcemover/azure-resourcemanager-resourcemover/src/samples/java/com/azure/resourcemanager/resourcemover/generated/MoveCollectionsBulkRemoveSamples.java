// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.resourcemanager.resourcemover.models.BulkRemoveRequest;
import java.util.Arrays;

/** Samples for MoveCollections BulkRemove. */
public final class MoveCollectionsBulkRemoveSamples {
    /*
     * x-ms-original-file: specification/resourcemover/resource-manager/Microsoft.Migrate/stable/2021-01-01/examples/MoveCollections_BulkRemove.json
     */
    /**
     * Sample code: MoveCollections_BulkRemove.
     *
     * @param manager Entry point to ResourceMoverManager.
     */
    public static void moveCollectionsBulkRemove(com.azure.resourcemanager.resourcemover.ResourceMoverManager manager) {
        manager
            .moveCollections()
            .bulkRemove(
                "rg1",
                "movecollection1",
                new BulkRemoveRequest()
                    .withValidateOnly(false)
                    .withMoveResources(
                        Arrays
                            .asList(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Migrate/MoveCollections/movecollection1/MoveResources/moveresource1")),
                com.azure.core.util.Context.NONE);
    }
}
