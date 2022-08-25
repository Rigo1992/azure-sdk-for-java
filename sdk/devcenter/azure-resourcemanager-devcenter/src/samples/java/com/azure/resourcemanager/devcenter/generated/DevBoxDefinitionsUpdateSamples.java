// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.models.DevBoxDefinition;
import com.azure.resourcemanager.devcenter.models.ImageReference;

/** Samples for DevBoxDefinitions Update. */
public final class DevBoxDefinitionsUpdateSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-08-01-preview/examples/DevBoxDefinitions_Patch.json
     */
    /**
     * Sample code: DevBoxDefinitions_Patch.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void devBoxDefinitionsPatch(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        DevBoxDefinition resource =
            manager.devBoxDefinitions().getWithResponse("rg1", "Contoso", "WebDevBox", Context.NONE).getValue();
        resource
            .update()
            .withImageReference(
                new ImageReference()
                    .withId(
                        "/subscriptions/0ac520ee-14c0-480f-b6c9-0a90c58ffff/resourceGroups/Example/providers/Microsoft.DevCenter/devcenters/Contoso/galleries/contosogallery/images/exampleImage/version/2.0.0"))
            .apply();
    }
}
