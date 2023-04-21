// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

/** Samples for MsixPackages Delete. */
public final class MsixPackagesDeleteSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2022-09-09/examples/MsixPackage_Delete.json
     */
    /**
     * Sample code: MSIXPackage_Delete.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void mSIXPackageDelete(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager
            .msixPackages()
            .deleteWithResponse("resourceGroup1", "hostpool1", "packagefullname", com.azure.core.util.Context.NONE);
    }
}
