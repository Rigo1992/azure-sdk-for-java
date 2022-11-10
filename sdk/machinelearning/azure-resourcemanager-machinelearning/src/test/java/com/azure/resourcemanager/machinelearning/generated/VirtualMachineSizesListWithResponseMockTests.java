// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.MachineLearningManager;
import com.azure.resourcemanager.machinelearning.models.VirtualMachineSizeListResult;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class VirtualMachineSizesListWithResponseMockTests {
    @Test
    public void testListWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"name\":\"mq\",\"family\":\"uiocuselqkrsazr\",\"vCPUs\":907855670,\"gpus\":162147994,\"osVhdSizeMB\":1160671233,\"maxResourceVolumeMB\":1893332175,\"memoryGB\":44.634673287925494,\"lowPriorityCapable\":false,\"premiumIO\":true,\"supportedComputeTypes\":[\"mw\",\"mdlgy\",\"ixokwtjawhv\",\"gnqfqqdlcvmyol\"]},{\"name\":\"ymjc\",\"family\":\"vsnvlaq\",\"vCPUs\":4380351,\"gpus\":1268203688,\"osVhdSizeMB\":1622025421,\"maxResourceVolumeMB\":2099242028,\"memoryGB\":84.58306289880801,\"lowPriorityCapable\":true,\"premiumIO\":true,\"supportedComputeTypes\":[\"thymgobl\",\"msn\",\"gwi\"]}]}";

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

        MachineLearningManager manager =
            MachineLearningManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        VirtualMachineSizeListResult response =
            manager.virtualMachineSizes().listWithResponse("bpfiddhlrufz", Context.NONE).getValue();

        Assertions.assertEquals("mw", response.value().get(0).supportedComputeTypes().get(0));
    }
}
