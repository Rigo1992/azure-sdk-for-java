// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.DiscoveryClient;
import com.azure.analytics.purview.catalog.PurviewCatalogClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class DiscoveryQueryTaxonomy {
    public static void main(String[] args) {
        DiscoveryClient client =
                new PurviewCatalogClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildDiscoveryClient();
        BinaryData searchRequest =
                BinaryData.fromString(
                        "{\"facets\":[{\"count\":0,\"facet\":\"assetType\"},{\"count\":10,\"facet\":\"classification\"},{\"count\":10,\"facet\":\"terms\"}],\"filter\":{\"and\":[{\"not\":{\"or\":[{\"attributeName\":\"size\",\"attributeValue\":0,\"operator\":\"eq\"},{\"attributeName\":\"fileSize\",\"attributeValue\":0,\"operator\":\"eq\"}]}},{\"not\":{\"classification\":\"MICROSOFT.SYSTEM.TEMP_FILE\"}},{\"not\":{\"entityType\":\"AtlasGlossaryTerm\",\"includeSubTypes\":false}}]},\"keywords\":\"example\",\"limit\":10,\"offset\":0,\"taxonomySetting\":{\"assetTypes\":[\"Azure Blob Storage\"],\"facet\":{\"count\":10,\"sort\":{\"count\":\"desc\"}}}}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = client.queryWithResponse(searchRequest, requestOptions);
    }
}
