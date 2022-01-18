// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.GlossaryClient;
import com.azure.analytics.purview.catalog.PurviewCatalogClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GlossaryCreateGlossaryCategory {
    public static void main(String[] args) {
        GlossaryClient client =
                new PurviewCatalogClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildGlossaryClient();
        BinaryData glossaryCategory =
                BinaryData.fromString(
                        "{\"name\":\"ExampleCategory1\",\"anchor\":{\"glossaryGuid\":\"c018ddaf-7c21-4b37-a838-dae5f110c3d8\"},\"terms\":[{\"termGuid\":\"54688d39-b298-4104-9e80-f2a16f44aaea\"}]}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = client.createGlossaryCategoryWithResponse(glossaryCategory, requestOptions);
    }
}
