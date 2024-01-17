// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.EnvironmentPermission;
import com.azure.resourcemanager.devtestlabs.models.Lab;
import com.azure.resourcemanager.devtestlabs.models.PremiumDataDisk;
import com.azure.resourcemanager.devtestlabs.models.StorageType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LabsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"defaultStorageAccount\":\"uuvbx\",\"defaultPremiumStorageAccount\":\"rebwggahtt\",\"artifactsStorageAccount\":\"swvajqfu\",\"premiumDataDiskStorageAccount\":\"x\",\"vaultName\":\"qzasunwqrjzfrgqh\",\"labStorageType\":\"StandardSSD\",\"mandatoryArtifactsResourceIdsLinux\":[\"buocnjr\",\"hmbpyryxamebly\",\"yvk\",\"kmrocxne\"],\"mandatoryArtifactsResourceIdsWindows\":[\"mtodl\"],\"createdDate\":\"2021-05-01T05:25:27Z\",\"premiumDataDisks\":\"Enabled\",\"environmentPermission\":\"Contributor\",\"announcement\":{\"title\":\"voavyunssxl\",\"markdown\":\"ieegjl\",\"enabled\":\"Disabled\",\"expirationDate\":\"2021-02-19T16:42:25Z\",\"expired\":true,\"provisioningState\":\"sgb\",\"uniqueIdentifier\":\"antuygdhgaqipirp\"},\"support\":{\"enabled\":\"Enabled\",\"markdown\":\"fulopmjnlexwhcb\"},\"vmCreationResourceGroup\":\"ibkeph\",\"publicIpId\":\"uerct\",\"loadBalancerId\":\"oyin\",\"networkSecurityGroupId\":\"pbrlcyrduczkgofx\",\"extendedProperties\":{\"vjeaqnrmvvfkoxml\":\"rucvcrrpcjttbs\",\"lpdwwexymzvlazi\":\"hktuidvrma\",\"uzivensrpmeyyvp\":\"bhpwvqsgnyy\",\"gsksrfhf\":\"patlbijp\"},\"provisioningState\":\"lmknbnxwcdom\",\"uniqueIdentifier\":\"vfqawzfgbrttuiac\"},\"location\":\"kiexhajlfnthiq\",\"tags\":{\"diygbpvnwswmtxky\":\"t\",\"l\":\"twwgzwx\",\"ygzyvneezaifght\":\"ecvo\"},\"id\":\"oqqtl\",\"name\":\"fhzbkr\",\"type\":\"jjjavfqnvhnq\"}]}";

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

        PagedIterable<Lab> response =
            manager.labs().list("atmzw", "jj", 1651064350, "qtjzmizvgbg", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("kiexhajlfnthiq", response.iterator().next().location());
        Assertions.assertEquals("t", response.iterator().next().tags().get("diygbpvnwswmtxky"));
        Assertions.assertEquals(StorageType.STANDARD_SSD, response.iterator().next().labStorageType());
        Assertions.assertEquals("buocnjr", response.iterator().next().mandatoryArtifactsResourceIdsLinux().get(0));
        Assertions.assertEquals("mtodl", response.iterator().next().mandatoryArtifactsResourceIdsWindows().get(0));
        Assertions.assertEquals(PremiumDataDisk.ENABLED, response.iterator().next().premiumDataDisks());
        Assertions.assertEquals(EnvironmentPermission.CONTRIBUTOR, response.iterator().next().environmentPermission());
        Assertions.assertEquals("voavyunssxl", response.iterator().next().announcement().title());
        Assertions.assertEquals("ieegjl", response.iterator().next().announcement().markdown());
        Assertions.assertEquals(EnableStatus.DISABLED, response.iterator().next().announcement().enabled());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-02-19T16:42:25Z"),
                response.iterator().next().announcement().expirationDate());
        Assertions.assertEquals(true, response.iterator().next().announcement().expired());
        Assertions.assertEquals(EnableStatus.ENABLED, response.iterator().next().support().enabled());
        Assertions.assertEquals("fulopmjnlexwhcb", response.iterator().next().support().markdown());
        Assertions
            .assertEquals("rucvcrrpcjttbs", response.iterator().next().extendedProperties().get("vjeaqnrmvvfkoxml"));
    }
}
