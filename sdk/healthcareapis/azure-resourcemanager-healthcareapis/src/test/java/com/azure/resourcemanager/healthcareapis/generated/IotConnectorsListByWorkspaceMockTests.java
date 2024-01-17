// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.healthcareapis.HealthcareApisManager;
import com.azure.resourcemanager.healthcareapis.models.IotConnector;
import com.azure.resourcemanager.healthcareapis.models.ServiceManagedIdentityType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class IotConnectorsListByWorkspaceMockTests {
    @Test
    public void testListByWorkspace() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"ingestionEndpointConfiguration\":{\"eventHubName\":\"ogfnzjvusf\",\"consumerGroup\":\"dmozu\",\"fullyQualifiedEventHubNamespace\":\"lfsbtkadpysow\"},\"deviceMapping\":{\"content\":\"datagkbugrjqct\"}},\"identity\":{\"type\":\"None\",\"principalId\":\"3f82d37a-4df2-4924-89a5-a9c92f3283a8\",\"tenantId\":\"2b92efa9-288e-4e47-a976-6254e012463c\",\"userAssignedIdentities\":{\"ypefojyqdhcupl\":{\"principalId\":\"61ccb15a-2a2c-42b9-8e3c-8957de0b2cf2\",\"clientId\":\"aa1fd0cc-df27-4312-b4cf-a7f74775d946\"},\"cwkhihi\":{\"principalId\":\"d4ed73c9-4efb-4fee-8573-a797972c376a\",\"clientId\":\"e4c5cde5-ac0c-4845-9795-108bce58e9e4\"},\"zdsqtzbsrgnow\":{\"principalId\":\"728d72db-8d68-4604-b75d-7ab8b741bd35\",\"clientId\":\"5264019b-0820-4ad5-b1f8-423c21e30067\"},\"fgmvecactxmwo\":{\"principalId\":\"289bffa9-ea93-471d-ab02-fe66abf9092f\",\"clientId\":\"6704adc3-1cd2-471b-8b83-9fc80082b40a\"}}},\"tags\":{\"ekqvgqouwif\":\"owcluqo\"},\"location\":\"pjwyiv\",\"etag\":\"kfxcvhrfs\",\"id\":\"huagrttikteusqc\",\"name\":\"kvyklxubyjaffmm\",\"type\":\"bl\"}]}";

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

        HealthcareApisManager manager = HealthcareApisManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<IotConnector> response
            = manager.iotConnectors().listByWorkspace("ydwqfbylyrf", "iagtc", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("kfxcvhrfs", response.iterator().next().etag());
        Assertions.assertEquals("pjwyiv", response.iterator().next().location());
        Assertions.assertEquals("owcluqo", response.iterator().next().tags().get("ekqvgqouwif"));
        Assertions.assertEquals(ServiceManagedIdentityType.NONE, response.iterator().next().identity().type());
        Assertions.assertEquals("ogfnzjvusf",
            response.iterator().next().ingestionEndpointConfiguration().eventHubName());
        Assertions.assertEquals("dmozu", response.iterator().next().ingestionEndpointConfiguration().consumerGroup());
        Assertions.assertEquals("lfsbtkadpysow",
            response.iterator().next().ingestionEndpointConfiguration().fullyQualifiedEventHubNamespace());
    }
}
