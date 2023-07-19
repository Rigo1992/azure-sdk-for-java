// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkRack;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkRackType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class NetworkRacksListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"networkRackType\":\"Combined\",\"networkFabricId\":\"empahyuxxeike\",\"networkDevices\":[\"wrnh\",\"afu\"],\"provisioningState\":\"Succeeded\",\"annotation\":\"phjkx\"},\"location\":\"mesxjeqqfy\",\"tags\":{\"hdncq\":\"kxtanlvoorv\",\"vxp\":\"uwtpssgqlnols\"},\"id\":\"egxlzd\",\"name\":\"atptzkmfvdrkcw\",\"type\":\"smnwsffia\"}]}";

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

        ManagedNetworkFabricManager manager =
            ManagedNetworkFabricManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<NetworkRack> response =
            manager.networkRacks().listByResourceGroup("pyfrtlukafq", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("mesxjeqqfy", response.iterator().next().location());
        Assertions.assertEquals("kxtanlvoorv", response.iterator().next().tags().get("hdncq"));
        Assertions.assertEquals(NetworkRackType.COMBINED, response.iterator().next().networkRackType());
        Assertions.assertEquals("empahyuxxeike", response.iterator().next().networkFabricId());
        Assertions.assertEquals("phjkx", response.iterator().next().annotation());
    }
}
