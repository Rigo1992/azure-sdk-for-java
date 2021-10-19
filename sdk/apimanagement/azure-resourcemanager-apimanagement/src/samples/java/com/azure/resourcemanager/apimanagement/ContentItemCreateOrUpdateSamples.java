// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for ContentItem CreateOrUpdate. */
public final class ContentItemCreateOrUpdateSamples {
    /*
     * operationId: ContentItem_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateContentTypeContentItem
     */
    /**
     * Sample code: ApiManagementCreateContentTypeContentItem.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateContentTypeContentItem(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .contentItems()
            .createOrUpdateWithResponse(
                "rg1", "apimService1", "page", "4e3cf6a5-574a-ba08-1f23-2e7a38faa6d8", null, Context.NONE);
    }
}
