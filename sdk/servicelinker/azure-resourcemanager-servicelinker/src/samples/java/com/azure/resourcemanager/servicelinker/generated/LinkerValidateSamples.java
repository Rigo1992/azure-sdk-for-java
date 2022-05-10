// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.generated;

import com.azure.core.util.Context;

/** Samples for Linker Validate. */
public final class LinkerValidateSamples {
    /*
     * x-ms-original-file: specification/servicelinker/resource-manager/Microsoft.ServiceLinker/stable/2022-05-01/examples/ValidateLinkSuccess.json
     */
    /**
     * Sample code: ValidateLinkSuccess.
     *
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void validateLinkSuccess(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager
            .linkers()
            .validate(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Web/sites/test-app",
                "linkName",
                Context.NONE);
    }
}
