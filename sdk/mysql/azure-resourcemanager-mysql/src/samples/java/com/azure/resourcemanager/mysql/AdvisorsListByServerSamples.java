// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql;

import com.azure.core.util.Context;

/** Samples for Advisors ListByServer. */
public final class AdvisorsListByServerSamples {
    /**
     * Sample code: AdvisorsListByServer.
     *
     * @param mySqlManager Entry point to MySqlManager. The Microsoft Azure management API provides create, read,
     *     update, and delete functionality for Azure MySQL resources including servers, databases, firewall rules, VNET
     *     rules, log files and configurations with new business model.
     */
    public static void advisorsListByServer(com.azure.resourcemanager.mysql.MySqlManager mySqlManager) {
        mySqlManager.advisors().listByServer("testResourceGroupName", "testServerName", Context.NONE);
    }
}
