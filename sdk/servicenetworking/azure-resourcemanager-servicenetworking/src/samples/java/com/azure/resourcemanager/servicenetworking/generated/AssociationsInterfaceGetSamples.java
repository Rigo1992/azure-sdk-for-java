// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.util.Context;

/** Samples for AssociationsInterface Get. */
public final class AssociationsInterfaceGetSamples {
    /*
     * x-ms-original-file: specification/servicenetworking/resource-manager/Microsoft.ServiceNetworking/cadl/examples/AssociationGet.json
     */
    /**
     * Sample code: Get Association.
     *
     * @param manager Entry point to TrafficControllerManager.
     */
    public static void getAssociation(com.azure.resourcemanager.servicenetworking.TrafficControllerManager manager) {
        manager.associationsInterfaces().getWithResponse("rg1", "TC1", "associatedvnet-2", Context.NONE);
    }
}
