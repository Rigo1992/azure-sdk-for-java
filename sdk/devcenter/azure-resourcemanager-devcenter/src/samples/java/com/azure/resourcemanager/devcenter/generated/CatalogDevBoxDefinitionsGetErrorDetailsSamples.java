// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

/** Samples for CatalogDevBoxDefinitions GetErrorDetails. */
public final class CatalogDevBoxDefinitionsGetErrorDetailsSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2023-10-01-preview/examples/CatalogDevBoxDefinitions_GetErrorDetails.json
     */
    /**
     * Sample code: CatalogDevBoxDefinitions_GetErrorDetails.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void catalogDevBoxDefinitionsGetErrorDetails(
        com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager
            .catalogDevBoxDefinitions()
            .getErrorDetailsWithResponse(
                "rg1", "Contoso", "CentralCatalog", "WebDevBox", com.azure.core.util.Context.NONE);
    }
}
