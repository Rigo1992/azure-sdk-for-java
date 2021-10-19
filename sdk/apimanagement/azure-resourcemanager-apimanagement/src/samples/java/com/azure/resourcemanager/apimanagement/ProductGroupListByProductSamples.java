// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for ProductGroup ListByProduct. */
public final class ProductGroupListByProductSamples {
    /*
     * operationId: ProductGroup_ListByProduct
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementListProductGroups
     */
    /**
     * Sample code: ApiManagementListProductGroups.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListProductGroups(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .productGroups()
            .listByProduct("rg1", "apimService1", "5600b57e7e8880006a060002", null, null, null, Context.NONE);
    }
}
