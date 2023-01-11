// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.Context;

/** Samples for Accounts ListByResourceGroup. */
public final class AccountsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/stable/2022-10-01/examples/ListAccountsByResourceGroup.json
     */
    /**
     * Sample code: List Accounts by Resource Group.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listAccountsByResourceGroup(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.accounts().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
