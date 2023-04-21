// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.generated;

import com.azure.analytics.purview.sharing.SentSharesClient;
import com.azure.analytics.purview.sharing.SentSharesClientBuilder;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class SentSharesList {
    public static void main(String[] args) {
        SentSharesClient sentSharesClient =
                new SentSharesClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("accountName.purview.azure.com/share")
                        .buildClient();
        // BEGIN:com.azure.analytics.purview.sharing.generated.sentsharesgetallsentshares.sentshareslist
        RequestOptions requestOptions = new RequestOptions().addQueryParam("filter", "Name eq 'testName'");
        PagedIterable<BinaryData> response =
                sentSharesClient.getAllSentShares(
                        "/subscriptions/de06c3a0-4610-4ca0-8cbb-bbdac204bd65/resourceGroups/sender-storage-rg/providers/Microsoft.Storage/storageAccounts/providerstorage",
                        requestOptions);
        // END:com.azure.analytics.purview.sharing.generated.sentsharesgetallsentshares.sentshareslist
    }
}
