// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.workloads.WorkloadsManager;
import com.azure.resourcemanager.workloads.models.SapDatabaseInstance;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SapDatabaseInstancesCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"subnet\":\"vbmqzbqq\",\"databaseSid\":\"aj\",\"databaseType\":\"wxacevehj\",\"ipAddress\":\"yxoaf\",\"loadBalancerDetails\":{\"id\":\"qltfaey\"},\"vmDetails\":[],\"status\":\"Starting\",\"provisioningState\":\"Succeeded\",\"errors\":{}},\"location\":\"pghriypoqeyhl\",\"tags\":{\"qdsmexiit\":\"kprlpyznuc\",\"stgnl\":\"fuxtyasiibmiybnn\",\"vmqfoud\":\"hnmgixhcm\"},\"id\":\"rhc\",\"name\":\"yyprotwyp\",\"type\":\"ndm\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        WorkloadsManager manager =
            WorkloadsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SapDatabaseInstance response =
            manager
                .sapDatabaseInstances()
                .define("fuojrngif")
                .withRegion("phojeevyhy")
                .withExistingSapVirtualInstance("ouau", "rjtloq")
                .withTags(mapOf("mfg", "zfczbg"))
                .create();

        Assertions.assertEquals("pghriypoqeyhl", response.location());
        Assertions.assertEquals("kprlpyznuc", response.tags().get("qdsmexiit"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
