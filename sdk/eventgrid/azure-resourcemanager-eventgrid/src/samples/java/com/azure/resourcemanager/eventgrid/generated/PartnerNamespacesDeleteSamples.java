// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;

/** Samples for PartnerNamespaces Delete. */
public final class PartnerNamespacesDeleteSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/stable/2022-06-15/examples/PartnerNamespaces_Delete.json
     */
    /**
     * Sample code: PartnerNamespaces_Delete.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void partnerNamespacesDelete(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.partnerNamespaces().delete("examplerg", "examplePartnerNamespaceName1", Context.NONE);
    }
}
