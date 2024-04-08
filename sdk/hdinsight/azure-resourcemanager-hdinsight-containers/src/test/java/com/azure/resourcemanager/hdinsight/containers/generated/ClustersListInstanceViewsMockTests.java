// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterInstanceViewResult;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ClustersListInstanceViewsMockTests {
    @Test
    public void testListInstanceViews() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"name\":\"tgguwpijrajcivmm\",\"properties\":{\"status\":{\"ready\":\"hfcf\",\"reason\":\"rxgkne\",\"message\":\"yinzqodfvpgs\"},\"serviceStatuses\":[{\"kind\":\"xgsg\",\"ready\":\"p\",\"message\":\"zdjtxvzflbqv\"},{\"kind\":\"aqvlgafcqusr\",\"ready\":\"vetnwsdtutn\",\"message\":\"duy\"},{\"kind\":\"vuzhyr\",\"ready\":\"ewipm\",\"message\":\"k\"},{\"kind\":\"xukuqgsj\",\"ready\":\"xundxgk\",\"message\":\"wzhhzjhfjmhvvmuv\"}]}}]}";

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

        HDInsightContainersManager manager = HDInsightContainersManager.configure().withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ClusterInstanceViewResult> response
            = manager.clusters().listInstanceViews("pxtgqscjav", "t", "uhdqazk", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("tgguwpijrajcivmm", response.iterator().next().name());
        Assertions.assertEquals("hfcf", response.iterator().next().properties().status().ready());
        Assertions.assertEquals("rxgkne", response.iterator().next().properties().status().reason());
        Assertions.assertEquals("yinzqodfvpgs", response.iterator().next().properties().status().message());
        Assertions.assertEquals("xgsg", response.iterator().next().properties().serviceStatuses().get(0).kind());
        Assertions.assertEquals("p", response.iterator().next().properties().serviceStatuses().get(0).ready());
        Assertions.assertEquals("zdjtxvzflbqv",
            response.iterator().next().properties().serviceStatuses().get(0).message());
    }
}
