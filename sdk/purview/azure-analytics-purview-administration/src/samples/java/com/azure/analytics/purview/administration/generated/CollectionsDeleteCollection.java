// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.administration.generated;

import com.azure.analytics.purview.administration.CollectionsClient;
import com.azure.analytics.purview.administration.PurviewAccountClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CollectionsDeleteCollection {
    public static void main(String[] args) {
        CollectionsClient client =
                new PurviewAccountClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{endpoint}")
                        .buildCollectionsClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response = client.deleteCollectionWithResponse("myCollection1", requestOptions);
    }
}
