// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.resourcemanager.servicefabric.models.UpgradableVersionsDescription;

/**
 * Samples for Clusters ListUpgradableVersions.
 */
public final class ClustersListUpgradableVersionsSamples {
    /*
     * x-ms-original-file:
     * specification/servicefabric/resource-manager/Microsoft.ServiceFabric/stable/2021-06-01/examples/
     * ListUpgradableVersionsMinMax_example.json
     */
    /**
     * Sample code: Get minimum and maximum code versions.
     * 
     * @param manager Entry point to ServiceFabricManager.
     */
    public static void
        getMinimumAndMaximumCodeVersions(com.azure.resourcemanager.servicefabric.ServiceFabricManager manager) {
        manager.clusters().listUpgradableVersionsWithResponse("resRg", "myCluster", null,
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/servicefabric/resource-manager/Microsoft.ServiceFabric/stable/2021-06-01/examples/
     * ListUpgradableVersionsPath_example.json
     */
    /**
     * Sample code: Get upgrade path.
     * 
     * @param manager Entry point to ServiceFabricManager.
     */
    public static void getUpgradePath(com.azure.resourcemanager.servicefabric.ServiceFabricManager manager) {
        manager.clusters().listUpgradableVersionsWithResponse("resRg", "myCluster",
            new UpgradableVersionsDescription().withTargetVersion("7.2.432.9590"), com.azure.core.util.Context.NONE);
    }
}
