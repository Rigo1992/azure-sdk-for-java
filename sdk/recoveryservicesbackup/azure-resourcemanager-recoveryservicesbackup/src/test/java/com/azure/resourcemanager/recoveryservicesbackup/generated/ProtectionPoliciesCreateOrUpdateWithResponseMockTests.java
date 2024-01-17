// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionPolicyResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ProtectionPoliciesCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"backupManagementType\":\"ProtectionPolicy\",\"protectedItemsCount\":1909827281,\"resourceGuardOperationRequests\":[\"jgvrquvpyggl\",\"mcrdcue\"]},\"eTag\":\"tiahxmfq\",\"location\":\"yarvsxzqbglcjk\",\"tags\":{\"odubtlmjt\":\"pth\",\"jxyxgb\":\"blioskkfmkmf\",\"lskkzpxvj\":\"kqvjcteoedlr\",\"cojhpcnabx\":\"zdpv\"},\"id\":\"fsnggytexvzilm\",\"name\":\"iv\",\"type\":\"kwwwnckn\"}";

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

        RecoveryServicesBackupManager manager =
            RecoveryServicesBackupManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ProtectionPolicyResource response =
            manager
                .protectionPolicies()
                .define("trdexyionofnin")
                .withRegion("tbfcm")
                .withExistingVault("eexpgeumi", "hwu")
                .withTags(mapOf("mb", "tsjcwjjxs", "xkecifhocj", "wvif"))
                .withProperties(
                    new ProtectionPolicy()
                        .withProtectedItemsCount(1366131106)
                        .withResourceGuardOperationRequests(Arrays.asList("cw", "qrs", "pcbbprtugav")))
                .withEtag("bcyksivmfogd")
                .create();

        Assertions.assertEquals("yarvsxzqbglcjk", response.location());
        Assertions.assertEquals("pth", response.tags().get("odubtlmjt"));
        Assertions.assertEquals(1909827281, response.properties().protectedItemsCount());
        Assertions.assertEquals("jgvrquvpyggl", response.properties().resourceGuardOperationRequests().get(0));
        Assertions.assertEquals("tiahxmfq", response.etag());
    }

    // Use "Map.of" if available
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
