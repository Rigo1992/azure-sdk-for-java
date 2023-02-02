// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managedapplications.ApplicationManager;
import com.azure.resourcemanager.managedapplications.models.ApplicationDefinition;
import com.azure.resourcemanager.managedapplications.models.ApplicationLockLevel;
import com.azure.resourcemanager.managedapplications.models.ResourceIdentityType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ApplicationDefinitionsGetByIdWithResponseMockTests {
    @Test
    public void testGetByIdWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"lockLevel\":\"None\",\"displayName\":\"kfrlhrxsbky\",\"isEnabled\":\"ycanuzbpzkafku\",\"authorizations\":[],\"artifacts\":[],\"description\":\"wbme\",\"packageFileUri\":\"seyvj\",\"mainTemplate\":\"datarts\",\"createUiDefinition\":\"dataspkdee\"},\"managedBy\":\"ofmxagkvtmelmqkr\",\"sku\":{\"name\":\"hvljuahaquh\",\"tier\":\"hmdua\",\"size\":\"exq\",\"family\":\"fadmws\",\"model\":\"r\",\"capacity\":1259983494},\"identity\":{\"principalId\":\"gomz\",\"tenantId\":\"misgwbnb\",\"type\":\"SystemAssigned\"},\"location\":\"dawkzbali\",\"tags\":{\"xosow\":\"qhakauhashsf\",\"cjooxdjebwpucwwf\":\"xcug\",\"hzceuojgjrwjue\":\"ovbvmeueciv\"},\"id\":\"otwmcdyt\",\"name\":\"x\",\"type\":\"it\"}";

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

        ApplicationManager manager =
            ApplicationManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ApplicationDefinition response =
            manager
                .applicationDefinitions()
                .getByIdWithResponse("wfudwpzntxhdzhl", "qj", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("dawkzbali", response.location());
        Assertions.assertEquals("qhakauhashsf", response.tags().get("xosow"));
        Assertions.assertEquals("ofmxagkvtmelmqkr", response.managedBy());
        Assertions.assertEquals("hvljuahaquh", response.sku().name());
        Assertions.assertEquals("hmdua", response.sku().tier());
        Assertions.assertEquals("exq", response.sku().size());
        Assertions.assertEquals("fadmws", response.sku().family());
        Assertions.assertEquals("r", response.sku().model());
        Assertions.assertEquals(1259983494, response.sku().capacity());
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals(ApplicationLockLevel.NONE, response.lockLevel());
        Assertions.assertEquals("kfrlhrxsbky", response.displayName());
        Assertions.assertEquals("ycanuzbpzkafku", response.isEnabled());
        Assertions.assertEquals("wbme", response.description());
        Assertions.assertEquals("seyvj", response.packageFileUri());
    }
}
