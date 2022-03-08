// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.Context;

/** Samples for SqlVirtualMachines ListBySqlVmGroup. */
public final class SqlVirtualMachinesListBySqlVmGroupSamples {
    /*
     * x-ms-original-file: specification/sqlvirtualmachine/resource-manager/Microsoft.SqlVirtualMachine/preview/2021-11-01-preview/examples/ListBySqlVirtualMachineGroupSqlVirtualMachine.json
     */
    /**
     * Sample code: Gets the list of sql virtual machines in a SQL virtual machine group.
     *
     * @param manager Entry point to SqlVirtualMachineManager.
     */
    public static void getsTheListOfSqlVirtualMachinesInASQLVirtualMachineGroup(
        com.azure.resourcemanager.sqlvirtualmachine.SqlVirtualMachineManager manager) {
        manager.sqlVirtualMachines().listBySqlVmGroup("testrg", "testvm", Context.NONE);
    }
}
