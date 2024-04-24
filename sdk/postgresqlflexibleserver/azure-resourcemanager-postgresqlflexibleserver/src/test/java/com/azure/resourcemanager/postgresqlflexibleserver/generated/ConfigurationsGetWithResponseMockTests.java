// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Configuration;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ConfigurationsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"value\":\"meisls\",\"description\":\"asylwx\",\"defaultValue\":\"aumweoohguufu\",\"dataType\":\"Integer\",\"allowedValues\":\"jathwtzo\",\"source\":\"a\",\"isDynamicConfig\":false,\"isReadOnly\":false,\"isConfigPendingRestart\":true,\"unit\":\"bwjscjpahlxveab\",\"documentationLink\":\"xnmwmqtibxyijddt\"},\"id\":\"cttadi\",\"name\":\"aeukm\",\"type\":\"sieekpndzaapm\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PostgreSqlManager manager = PostgreSqlManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Configuration response = manager.configurations()
            .getWithResponse("ankjpdnjzh", "joylh", "lmuoyxprimrsopte", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("meisls", response.value());
        Assertions.assertEquals("a", response.source());
    }
}
