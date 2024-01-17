// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.batch.BatchManager;
import com.azure.resourcemanager.batch.models.PrivateEndpointConnection;
import com.azure.resourcemanager.batch.models.PrivateLinkServiceConnectionStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Updating\",\"privateEndpoint\":{\"id\":\"vcimpev\"},\"groupIds\":[\"b\",\"rrilbywdxsmic\",\"wrwfscjfnyns\"],\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"i\",\"actionsRequired\":\"voqyt\"}},\"etag\":\"yo\",\"id\":\"bblgyavut\",\"name\":\"thjoxoism\",\"type\":\"ksbpimlqoljx\"}";

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

        BatchManager manager = BatchManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnection response = manager.privateEndpointConnections()
            .getWithResponse("cubiipuipw", "qonmacj", "k", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.APPROVED,
            response.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("i", response.privateLinkServiceConnectionState().description());
    }
}
