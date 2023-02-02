// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.resourcemanager.mediaservices.models.ListEdgePoliciesInput;

/** Samples for Mediaservices ListEdgePolicies. */
public final class MediaservicesListEdgePoliciesSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Accounts/stable/2021-11-01/examples/accounts-list-media-edge-policies.json
     */
    /**
     * Sample code: List the media edge policies.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listTheMediaEdgePolicies(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .mediaservices()
            .listEdgePoliciesWithResponse(
                "contoso",
                "contososports",
                new ListEdgePoliciesInput().withDeviceId("contosiothubhost_contosoiotdevice"),
                com.azure.core.util.Context.NONE);
    }
}
