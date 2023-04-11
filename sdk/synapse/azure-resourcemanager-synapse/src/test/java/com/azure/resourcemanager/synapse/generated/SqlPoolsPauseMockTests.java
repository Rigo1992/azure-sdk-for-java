// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.models.CreateMode;
import com.azure.resourcemanager.synapse.models.SqlPool;
import com.azure.resourcemanager.synapse.models.StorageAccountType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SqlPoolsPauseMockTests {
    @Test
    public void testPause() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"sku\":{\"tier\":\"fqwtltngvm\",\"name\":\"uptrklz\",\"capacity\":1008629589},\"properties\":{\"maxSizeBytes\":1427322319045036829,\"collation\":\"xfsv\",\"sourceDatabaseId\":\"h\",\"recoverableDatabaseId\":\"ynwlslrcigtzjcv\",\"provisioningState\":\"Succeeded\",\"status\":\"xpavid\",\"restorePointInTime\":\"2021-01-18T02:31:50Z\",\"createMode\":\"PointInTimeRestore\",\"creationDate\":\"2021-08-20T14:25:11Z\",\"storageAccountType\":\"LRS\",\"sourceDatabaseDeletionDate\":\"2021-01-18T14:39:45Z\"},\"location\":\"ezslp\",\"tags\":{\"gpazwu\":\"cbdsvalpnptwtrk\",\"qvn\":\"x\",\"gqlmfaewzgi\":\"obfelhldiuhz\",\"qhnmhk\":\"djpxpqht\"},\"id\":\"ezsdsuxheq\",\"name\":\"gcruxspinym\",\"type\":\"qgwokmikp\"}";

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

        SynapseManager manager =
            SynapseManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SqlPool response =
            manager.sqlPools().pause("nsyby", "polwzrghsrlei", "kfscjfncjwv", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ezslp", response.location());
        Assertions.assertEquals("cbdsvalpnptwtrk", response.tags().get("gpazwu"));
        Assertions.assertEquals("fqwtltngvm", response.sku().tier());
        Assertions.assertEquals("uptrklz", response.sku().name());
        Assertions.assertEquals(1008629589, response.sku().capacity());
        Assertions.assertEquals(1427322319045036829L, response.maxSizeBytes());
        Assertions.assertEquals("xfsv", response.collation());
        Assertions.assertEquals("h", response.sourceDatabaseId());
        Assertions.assertEquals("ynwlslrcigtzjcv", response.recoverableDatabaseId());
        Assertions.assertEquals("Succeeded", response.provisioningState());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-18T02:31:50Z"), response.restorePointInTime());
        Assertions.assertEquals(CreateMode.POINT_IN_TIME_RESTORE, response.createMode());
        Assertions.assertEquals(StorageAccountType.LRS, response.storageAccountType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-18T14:39:45Z"), response.sourceDatabaseDeletionDate());
    }
}
