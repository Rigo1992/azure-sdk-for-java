// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

/** Samples for Advisors ListByServer. */
public final class AdvisorsListByServerSamples {
    /*
     * x-ms-original-file: specification/mariadb/resource-manager/Microsoft.DBforMariaDB/stable/2018-06-01/examples/AdvisorsListByServer.json
     */
    /**
     * Sample code: AdvisorsListByServer.
     *
     * @param manager Entry point to MariaDBManager.
     */
    public static void advisorsListByServer(com.azure.resourcemanager.mariadb.MariaDBManager manager) {
        manager.advisors().listByServer("testResourceGroupName", "testServerName", com.azure.core.util.Context.NONE);
    }
}
