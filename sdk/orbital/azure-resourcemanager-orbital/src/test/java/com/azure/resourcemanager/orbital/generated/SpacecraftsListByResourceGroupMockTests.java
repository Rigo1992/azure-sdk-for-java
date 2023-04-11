// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.orbital.OrbitalManager;
import com.azure.resourcemanager.orbital.models.Spacecraft;
import com.azure.resourcemanager.orbital.models.SpacecraftsPropertiesProvisioningState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SpacecraftsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"succeeded\",\"noradId\":\"hoxus\",\"titleLine\":\"rpabg\",\"tleLine1\":\"epsbjtazqu\",\"tleLine2\":\"xywpmueefjzwfqkq\",\"links\":[]},\"location\":\"dsuyonobgla\",\"tags\":{\"udxytlmoyrx\":\"xtccmg\",\"qj\":\"wfudwpzntxhdzhl\",\"bkyvp\":\"hckfrlhrx\"},\"id\":\"ca\",\"name\":\"uzbpzkafku\",\"type\":\"b\"}]}";

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

        OrbitalManager manager =
            OrbitalManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Spacecraft> response =
            manager.spacecrafts().listByResourceGroup("kphywpnvjto", "nermcl", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("dsuyonobgla", response.iterator().next().location());
        Assertions.assertEquals("xtccmg", response.iterator().next().tags().get("udxytlmoyrx"));
        Assertions
            .assertEquals(
                SpacecraftsPropertiesProvisioningState.SUCCEEDED, response.iterator().next().provisioningState());
        Assertions.assertEquals("hoxus", response.iterator().next().noradId());
        Assertions.assertEquals("rpabg", response.iterator().next().titleLine());
        Assertions.assertEquals("epsbjtazqu", response.iterator().next().tleLine1());
        Assertions.assertEquals("xywpmueefjzwfqkq", response.iterator().next().tleLine2());
    }
}
