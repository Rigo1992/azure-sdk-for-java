// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.storagemover.StorageMoverManager;
import com.azure.resourcemanager.storagemover.models.CopyMode;
import com.azure.resourcemanager.storagemover.models.JobDefinition;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class JobDefinitionsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"description\":\"sluicpdggkzz\",\"copyMode\":\"Additive\",\"sourceName\":\"mbmpaxmodfvuefy\",\"sourceResourceId\":\"bpfvm\",\"sourceSubpath\":\"hrfou\",\"targetName\":\"ft\",\"targetResourceId\":\"kcpwiy\",\"targetSubpath\":\"qtmnubexkpzk\",\"latestJobRunName\":\"ondjmq\",\"latestJobRunResourceId\":\"vypomgkopkwho\",\"latestJobRunStatus\":\"Canceling\",\"agentName\":\"jqg\",\"agentResourceId\":\"smocmbq\",\"provisioningState\":\"Succeeded\"},\"id\":\"kcxozapvhelx\",\"name\":\"rgly\",\"type\":\"tddckcb\"}";

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

        StorageMoverManager manager =
            StorageMoverManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        JobDefinition response =
            manager
                .jobDefinitions()
                .define("yhtozfikdowwqu")
                .withExistingProject("zmuvpbttdumorppx", "bmnzbtbhjpgl", "fgohdneuelfphs")
                .withCopyMode(CopyMode.ADDITIVE)
                .withSourceName("thhqzonosggbh")
                .withTargetName("vhqcrail")
                .withDescription("xzxcl")
                .withSourceSubpath("cffgdkzzewk")
                .withTargetSubpath("fuflrwdmhdlx")
                .withAgentName("qdcvdrhvoo")
                .create();

        Assertions.assertEquals("sluicpdggkzz", response.description());
        Assertions.assertEquals(CopyMode.ADDITIVE, response.copyMode());
        Assertions.assertEquals("mbmpaxmodfvuefy", response.sourceName());
        Assertions.assertEquals("hrfou", response.sourceSubpath());
        Assertions.assertEquals("ft", response.targetName());
        Assertions.assertEquals("qtmnubexkpzk", response.targetSubpath());
        Assertions.assertEquals("jqg", response.agentName());
    }
}
