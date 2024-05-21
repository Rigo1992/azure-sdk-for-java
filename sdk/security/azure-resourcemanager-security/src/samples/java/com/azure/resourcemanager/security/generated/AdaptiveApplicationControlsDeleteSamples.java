// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for AdaptiveApplicationControls Delete.
 */
public final class AdaptiveApplicationControlsDeleteSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2020-01-01/examples/ApplicationWhitelistings/DeleteAdaptiveApplicationControls_example.json
     */
    /**
     * Sample code: Delete an application control machine group.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void
        deleteAnApplicationControlMachineGroup(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.adaptiveApplicationControls()
            .deleteByResourceGroupWithResponse("centralus", "GROUP1", com.azure.core.util.Context.NONE);
    }
}
