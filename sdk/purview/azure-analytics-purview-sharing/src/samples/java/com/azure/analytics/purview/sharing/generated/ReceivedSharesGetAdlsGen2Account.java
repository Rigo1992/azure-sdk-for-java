// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.generated;

import com.azure.analytics.purview.sharing.ReceivedSharesClient;
import com.azure.analytics.purview.sharing.ReceivedSharesClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class ReceivedSharesGetAdlsGen2Account {
    public static void main(String[] args) {
        ReceivedSharesClient receivedSharesClient =
                new ReceivedSharesClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("accountName.purview.azure.com/share")
                        .buildClient();
        // BEGIN:com.azure.analytics.purview.sharing.generated.receivedsharesgetreceivedshare.receivedsharesgetadlsgen2account
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                receivedSharesClient.getReceivedShareWithResponse(
                        "0D67B9C8-A6C6-4990-9EDE-12EA059D3002", requestOptions);
        // END:com.azure.analytics.purview.sharing.generated.receivedsharesgetreceivedshare.receivedsharesgetadlsgen2account
    }
}
