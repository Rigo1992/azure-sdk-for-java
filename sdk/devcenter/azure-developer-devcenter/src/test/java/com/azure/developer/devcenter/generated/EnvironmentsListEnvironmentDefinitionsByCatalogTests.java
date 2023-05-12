// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;

public final class EnvironmentsListEnvironmentDefinitionsByCatalogTests extends DevCenterClientTestBase {
    @Test
    public void testEnvironmentsListEnvironmentDefinitionsByCatalogTests() {
        RequestOptions requestOptions = new RequestOptions();

        PagedIterable<BinaryData> response =
            deploymentEnvironmentsClient.listEnvironmentDefinitionsByCatalog(projectName, catalogName, requestOptions);

        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());

        int numberOfEnvDefinitions = 0;
        for (BinaryData data : response) {
            numberOfEnvDefinitions++;
            LinkedHashMap envDefinition = data.toObject(LinkedHashMap.class);
            System.out.println(envDefinition.get("name"));
        }

        Assertions.assertEquals(3, numberOfEnvDefinitions);
    }
}
