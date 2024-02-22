// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.Alert;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ConfigureAlertRequestProperties;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ReplicationAlertSettingsCreateWithResponseMockTests {
    @Test
    public void testCreateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"sendToOwners\":\"xbvkvwzdmvdd\",\"customEmailAddresses\":[\"rugyozzzawnjdv\"],\"locale\":\"rho\"},\"location\":\"kkvxu\",\"id\":\"dqzbvbpsuvqhx\",\"name\":\"ozf\",\"type\":\"dkwbkurklpiig\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        SiteRecoveryManager manager = SiteRecoveryManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        Alert response
            = manager.replicationAlertSettings().define("derjennmk").withExistingVault("ustihtgrafjajvky", "mmjczvog")
                .withProperties(new ConfigureAlertRequestProperties().withSendToOwners("uwqdwxhhlbmyphf")
                    .withCustomEmailAddresses(Arrays.asList("pdhewokyqs", "kx", "sy")).withLocale("ihqbtod"))
                .create();

        Assertions.assertEquals("xbvkvwzdmvdd", response.properties().sendToOwners());
        Assertions.assertEquals("rugyozzzawnjdv", response.properties().customEmailAddresses().get(0));
        Assertions.assertEquals("rho", response.properties().locale());
        Assertions.assertEquals("kkvxu", response.location());
    }
}
