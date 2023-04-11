// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class ReceivedSharesListAttachedTests extends PurviewShareClientTestBase {
    @Test
    @Disabled
    public void testReceivedSharesListAttachedTests() {
        RequestOptions requestOptions = new RequestOptions().addQueryParam("filter", "Name eq 'testName'");
        PagedIterable<BinaryData> response =
                receivedSharesClient.getAllAttachedReceivedShares(
                        "/subscriptions/4D8FD81D-431D-4B1D-B46C-C770CFC034FC/resourceGroups/contoso-rg/providers/Microsoft.Storage/storageAccounts/blobAccount",
                        requestOptions);
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());
        Assertions.assertEquals(
                "Wed, 12 July 2022 18:04:32 GMT",
                response.iterableByPage().iterator().next().getHeaders().get("Date").getValue());
        Assertions.assertEquals(
                "25c78f97-0b0a-4fe9-ad39-883a482265cd",
                response.iterableByPage().iterator().next().getHeaders().get("x-ms-correlation-request-id").getValue());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"type\":\"receivedShares\",\"id\":\"0D67B9C8-A6C6-4990-9EDE-12EA059D3002\",\"properties\":{\"assetLocation\":\"eastus\",\"assetStoreKind\":\"BlobAccount\",\"createdAt\":\"2022-07-12T18:18:50.7095202Z\",\"displayName\":\"receivedShareName1\",\"receiverEmail\":\"janedoe@fabrikam.com\",\"receiverName\":\"Jane Doe\",\"receiverTenantName\":\"Fabrikam\",\"senderEmail\":\"ali.smith@contoso.com\",\"senderName\":\"Ali Smith\",\"senderTenantName\":\"Contoso\",\"sentShareDescription\":\"description\",\"shareStatus\":\"Attached\",\"sharedAt\":\"2022-07-12T18:17:56.1065304Z\",\"sink\":{\"properties\":{\"containerName\":\"receivingContainer\",\"folder\":\"receivingFolder\",\"location\":\"eastus\",\"mountPath\":\"path\"},\"storeKind\":\"BlobAccount\",\"storeReference\":{\"type\":\"ArmResourceReference\",\"referenceName\":\"/subscriptions/4D8FD81D-431D-4B1D-B46C-C770CFC034FC/resourceGroups/contoso-rg/providers/Microsoft.Storage/storageAccounts/blobAccount\"}},\"state\":\"Succeeded\"},\"shareKind\":\"InPlace\"}")
                        .toObject(Object.class),
                response.iterator().next().toObject(Object.class));
    }
}
