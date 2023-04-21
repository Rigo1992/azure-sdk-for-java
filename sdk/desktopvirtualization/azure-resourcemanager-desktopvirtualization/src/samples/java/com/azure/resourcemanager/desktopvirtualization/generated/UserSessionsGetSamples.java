// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

/** Samples for UserSessions Get. */
public final class UserSessionsGetSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2022-09-09/examples/UserSession_Get.json
     */
    /**
     * Sample code: UserSession_Get.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void userSessionGet(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager
            .userSessions()
            .getWithResponse(
                "resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", "1", com.azure.core.util.Context.NONE);
    }
}
