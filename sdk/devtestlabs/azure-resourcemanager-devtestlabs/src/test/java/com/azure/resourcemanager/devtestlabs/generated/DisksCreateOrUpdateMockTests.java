// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.models.Disk;
import com.azure.resourcemanager.devtestlabs.models.StorageType;
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

public final class DisksCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"diskType\":\"StandardSSD\",\"diskSizeGiB\":990994976,\"leasedByLabVmId\":\"tme\",\"diskBlobName\":\"fsvpink\",\"diskUri\":\"atqtdiswxspvckoj\",\"storageAccountId\":\"bbg\",\"createdDate\":\"2021-06-11T04:02:23Z\",\"hostCaching\":\"esubzpvpv\",\"managedDiskId\":\"lyt\",\"provisioningState\":\"Succeeded\",\"uniqueIdentifier\":\"j\"},\"location\":\"d\",\"tags\":{\"dihdcyyyzlwhb\":\"xnxmlbmuoswkj\",\"dq\":\"zjnufzrfg\"},\"id\":\"nn\",\"name\":\"zrtftedzuubjt\",\"type\":\"gjsxmty\"}";

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

        DevTestLabsManager manager =
            DevTestLabsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Disk response =
            manager
                .disks()
                .define("neyttl")
                .withRegion("rdnyeita")
                .withExistingUser("kkagvwukhsusmmor", "mzhwilzzhni", "mriprlk")
                .withTags(mapOf("nzjahwriuomzczf", "ad"))
                .withDiskType(StorageType.PREMIUM)
                .withDiskSizeGiB(138918433)
                .withLeasedByLabVmId("bkut")
                .withDiskBlobName("mltwjfluxynbpvzl")
                .withDiskUri("wa")
                .withStorageAccountId("qnjckhmocg")
                .withHostCaching("ouarhwvixqqggljk")
                .withManagedDiskId("sjrclrvtzq")
                .create();

        Assertions.assertEquals("d", response.location());
        Assertions.assertEquals("xnxmlbmuoswkj", response.tags().get("dihdcyyyzlwhb"));
        Assertions.assertEquals(StorageType.STANDARD_SSD, response.diskType());
        Assertions.assertEquals(990994976, response.diskSizeGiB());
        Assertions.assertEquals("tme", response.leasedByLabVmId());
        Assertions.assertEquals("fsvpink", response.diskBlobName());
        Assertions.assertEquals("atqtdiswxspvckoj", response.diskUri());
        Assertions.assertEquals("bbg", response.storageAccountId());
        Assertions.assertEquals("esubzpvpv", response.hostCaching());
        Assertions.assertEquals("lyt", response.managedDiskId());
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
