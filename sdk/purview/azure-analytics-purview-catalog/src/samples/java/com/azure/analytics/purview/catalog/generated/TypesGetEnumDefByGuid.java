// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.PurviewCatalogClientBuilder;
import com.azure.analytics.purview.catalog.TypesClient;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class TypesGetEnumDefByGuid {
    public static void main(String[] args) {
        TypesClient client =
                new PurviewCatalogClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildTypesClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                client.getEnumDefByGuidWithResponse("644ab9c7-893a-4a4d-8e0a-591a6556d1a0", requestOptions);
    }
}
