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

public class ReceivedSharesCreateOrReplaceBlobAccount {
    public static void main(String[] args) {
        ReceivedSharesClient receivedSharesClient =
                new ReceivedSharesClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("accountName.purview.azure.com/share")
                        .buildClient();
        // BEGIN:com.azure.analytics.purview.sharing.generated.receivedsharescreateorreplacereceivedshare.receivedsharescreateorreplaceblobaccount
        BinaryData receivedShare =
                BinaryData.fromString(
                        "{\"properties\":{\"displayName\":\"updatedReceivedShareName\",\"sink\":{\"properties\":{\"containerName\":\"receivingContainer\",\"folder\":\"receivingFolder\",\"mountPath\":\"path\"},\"storeKind\":\"BlobAccount\",\"storeReference\":{\"type\":\"ArmResourceReference\",\"referenceName\":\"/subscriptions/4D8FD81D-431D-4B1D-B46C-C770CFC034FC/resourceGroups/contoso-rg/providers/Microsoft.Storage/storageAccounts/blobAccount\"}}},\"shareKind\":\"InPlace\"}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                receivedSharesClient.createOrReplaceReceivedShareWithResponse(
                        "0D67B9C8-A6C6-4990-9EDE-12EA059D3002", receivedShare, requestOptions);
        // END:com.azure.analytics.purview.sharing.generated.receivedsharescreateorreplacereceivedshare.receivedsharescreateorreplaceblobaccount
    }
}
