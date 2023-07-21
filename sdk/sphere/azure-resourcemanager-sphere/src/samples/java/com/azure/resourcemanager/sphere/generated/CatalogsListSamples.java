// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

/** Samples for Catalogs List. */
public final class CatalogsListSamples {
    /*
     * x-ms-original-file: specification/sphere/resource-manager/Microsoft.AzureSphere/preview/2022-09-01-preview/examples/GetCatalogsSub.json
     */
    /**
     * Sample code: Catalogs_ListBySubscription.
     *
     * @param manager Entry point to AzureSphereManager.
     */
    public static void catalogsListBySubscription(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.catalogs().list(com.azure.core.util.Context.NONE);
    }
}