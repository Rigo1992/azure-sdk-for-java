// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservices.RecoveryServicesManager;
import com.azure.resourcemanager.recoveryservices.models.ClientDiscoveryValueForSingleApi;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class OperationsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"name\":\"bfatklddxbjhwu\",\"display\":{\"provider\":\"oz\",\"resource\":\"sphyoulpjrvxa\",\"operation\":\"rvimjwosytxitcsk\",\"description\":\"k\"},\"origin\":\"umiekkezzi\",\"properties\":{\"serviceSpecification\":{\"logSpecifications\":[]}}}]}";

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

        RecoveryServicesManager manager =
            RecoveryServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ClientDiscoveryValueForSingleApi> response = manager.operations().list(Context.NONE);

        Assertions.assertEquals("bfatklddxbjhwu", response.iterator().next().name());
        Assertions.assertEquals("oz", response.iterator().next().display().provider());
        Assertions.assertEquals("sphyoulpjrvxa", response.iterator().next().display().resource());
        Assertions.assertEquals("rvimjwosytxitcsk", response.iterator().next().display().operation());
        Assertions.assertEquals("k", response.iterator().next().display().description());
        Assertions.assertEquals("umiekkezzi", response.iterator().next().origin());
    }
}
