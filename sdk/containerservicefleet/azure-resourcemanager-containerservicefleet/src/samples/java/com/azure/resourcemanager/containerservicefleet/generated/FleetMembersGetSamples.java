// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

/**
 * Samples for FleetMembers Get.
 */
public final class FleetMembersGetSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/fleet/stable/2024-04-01/examples/FleetMembers_Get.json
     */
    /**
     * Sample code: Gets a FleetMember resource.
     * 
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void
        getsAFleetMemberResource(com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.fleetMembers().getWithResponse("rg1", "fleet1", "member-1", com.azure.core.util.Context.NONE);
    }
}
