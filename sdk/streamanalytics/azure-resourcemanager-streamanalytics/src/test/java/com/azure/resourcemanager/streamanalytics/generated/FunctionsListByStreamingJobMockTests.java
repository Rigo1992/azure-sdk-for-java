// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager;
import com.azure.resourcemanager.streamanalytics.models.Function;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class FunctionsListByStreamingJobMockTests {
    @Test
    public void testListByStreamingJob() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"type\":\"FunctionProperties\",\"etag\":\"dmsyqtfihwhbo\",\"properties\":{\"inputs\":[{\"dataType\":\"amvpphoszqzudph\",\"isConfigurationParameter\":false},{\"dataType\":\"dkfw\",\"isConfigurationParameter\":true},{\"dataType\":\"vtbvkayh\",\"isConfigurationParameter\":false}],\"output\":{\"dataType\":\"qiatkzwpcnp\"},\"binding\":{\"type\":\"FunctionBinding\"}}},\"name\":\"jaesgvvsccya\",\"type\":\"uq\",\"id\":\"wygzlvdnkfxusem\"}]}";

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

        StreamAnalyticsManager manager = StreamAnalyticsManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Function> response = manager.functions().listByStreamingJob("wspughftqsxhqx", "j", "ukndxdigrjgu",
            com.azure.core.util.Context.NONE);

        Assertions.assertEquals("wygzlvdnkfxusem", response.iterator().next().id());
        Assertions.assertEquals("amvpphoszqzudph", response.iterator().next().properties().inputs().get(0).dataType());
        Assertions.assertEquals(false,
            response.iterator().next().properties().inputs().get(0).isConfigurationParameter());
        Assertions.assertEquals("qiatkzwpcnp", response.iterator().next().properties().output().dataType());
        Assertions.assertEquals("jaesgvvsccya", response.iterator().next().name());
    }
}
