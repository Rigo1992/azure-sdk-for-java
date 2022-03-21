// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

/** Samples for Scripts CreateOrUpdate. */
public final class ScriptsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2022-02-01/examples/KustoScriptsCreateOrUpdate.json
     */
    /**
     * Sample code: KustoScriptsCreateOrUpdate.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoScriptsCreateOrUpdate(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .scripts()
            .define("kustoScript")
            .withExistingDatabase("kustorptest", "kustoCluster", "KustoDatabase8")
            .withScriptUrl("https://mysa.blob.core.windows.net/container/script.txt")
            .withScriptUrlSasToken(
                "?sv=2019-02-02&st=2019-04-29T22%3A18%3A26Z&se=2019-04-30T02%3A23%3A26Z&sr=b&sp=rw&sip=168.1.5.60-168.1.5.70&spr=https&sig=********************************")
            .withForceUpdateTag("2bcf3c21-ffd1-4444-b9dd-e52e00ee53fe")
            .withContinueOnErrors(true)
            .create();
    }
}
