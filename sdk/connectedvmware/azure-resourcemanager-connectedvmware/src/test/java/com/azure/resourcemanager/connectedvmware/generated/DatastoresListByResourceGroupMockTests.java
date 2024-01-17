// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager;
import com.azure.resourcemanager.connectedvmware.models.Datastore;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DatastoresListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"uuid\":\"frgqhaohcm\",\"vCenterId\":\"oc\",\"moRefId\":\"r\",\"inventoryItemId\":\"mbpyryxamebly\",\"moName\":\"vkfkmr\",\"statuses\":[{\"type\":\"e\",\"status\":\"sm\",\"reason\":\"dlfp\",\"message\":\"pucygvoavyunss\",\"severity\":\"ghiee\",\"lastUpdatedAt\":\"2021-08-05T04:13:57Z\"}],\"customResourceName\":\"vvpa\",\"capacityGB\":8261650227561779504,\"freeSpaceGB\":232841743311876710,\"provisioningState\":\"Created\"},\"extendedLocation\":{\"type\":\"uygdhgaqipirp\",\"name\":\"rqofulopmjnlexwh\"},\"kind\":\"pibkephuu\",\"location\":\"erctatoyin\",\"tags\":{\"rduczkgofxyfs\":\"brlc\",\"crrpcjttbstvje\":\"uc\",\"mlghktuidvrmazlp\":\"qnrmvvfko\",\"wvqsgny\":\"wwexymzvlazipbh\"},\"id\":\"uuzivensrpmeyyvp\",\"name\":\"patlbijp\",\"type\":\"gsksrfhf\"}]}";

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

        ConnectedVMwareManager manager =
            ConnectedVMwareManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Datastore> response =
            manager.datastores().listByResourceGroup("unwqr", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("erctatoyin", response.iterator().next().location());
        Assertions.assertEquals("brlc", response.iterator().next().tags().get("rduczkgofxyfs"));
        Assertions.assertEquals("uygdhgaqipirp", response.iterator().next().extendedLocation().type());
        Assertions.assertEquals("rqofulopmjnlexwh", response.iterator().next().extendedLocation().name());
        Assertions.assertEquals("pibkephuu", response.iterator().next().kind());
        Assertions.assertEquals("oc", response.iterator().next().vCenterId());
        Assertions.assertEquals("r", response.iterator().next().moRefId());
        Assertions.assertEquals("mbpyryxamebly", response.iterator().next().inventoryItemId());
    }
}
