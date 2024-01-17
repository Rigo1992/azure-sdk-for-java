// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager;
import com.azure.resourcemanager.applicationinsights.models.CategoryType;
import com.azure.resourcemanager.applicationinsights.models.Kind;
import com.azure.resourcemanager.applicationinsights.models.MyWorkbook;
import com.azure.resourcemanager.applicationinsights.models.MyWorkbookManagedIdentityType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class MyWorkbooksListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"kind\":\"user\",\"properties\":{\"displayName\":\"st\",\"serializedData\":\"vnlvxbcuiiznktwf\",\"version\":\"snvpdibmi\",\"timeModified\":\"stbz\",\"category\":\"kiwbuqnyoph\",\"tags\":[\"l\"],\"userId\":\"crpfbcunez\",\"sourceId\":\"e\",\"storageUri\":\"lfwyfwlwxjwetn\"},\"identity\":{\"userAssignedIdentities\":{\"principalId\":\"lafzvaylptr\",\"tenantId\":\"qwztcmwqkc\"},\"type\":\"None\"},\"id\":\"mikzeb\",\"name\":\"qbsms\",\"type\":\"ziqgfuh\",\"etag\":{\"wpgj\":\"xzjrgy\",\"pttaqutd\":\"snptfujgicgaao\",\"gehkfkimrtixokff\":\"wemxswvruunzz\",\"qwhix\":\"yinljqe\"},\"location\":\"onsts\",\"tags\":{\"vuwcobiegstmnin\":\"xgvelfclduccbird\",\"ejjtbxqmul\":\"jizcilnghgs\",\"rsbycucrwn\":\"xlxqzvn\"}}]}";

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

        ApplicationInsightsManager manager =
            ApplicationInsightsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<MyWorkbook> response =
            manager
                .myWorkbooks()
                .listByResourceGroup(
                    "kxkbsazgakgacyr",
                    CategoryType.WORKBOOK,
                    Arrays.asList("jdmspofapvuhryln"),
                    "ofrzgb",
                    false,
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("onsts", response.iterator().next().location());
        Assertions.assertEquals("xgvelfclduccbird", response.iterator().next().tags().get("vuwcobiegstmnin"));
        Assertions.assertEquals(MyWorkbookManagedIdentityType.NONE, response.iterator().next().identity().type());
        Assertions.assertEquals("mikzeb", response.iterator().next().id());
        Assertions.assertEquals("qbsms", response.iterator().next().name());
        Assertions.assertEquals("ziqgfuh", response.iterator().next().type());
        Assertions.assertEquals("xzjrgy", response.iterator().next().etag().get("wpgj"));
        Assertions.assertEquals(Kind.USER, response.iterator().next().kind());
        Assertions.assertEquals("st", response.iterator().next().displayName());
        Assertions.assertEquals("vnlvxbcuiiznktwf", response.iterator().next().serializedData());
        Assertions.assertEquals("snvpdibmi", response.iterator().next().version());
        Assertions.assertEquals("kiwbuqnyoph", response.iterator().next().category());
        Assertions.assertEquals("l", response.iterator().next().tagsPropertiesTags().get(0));
        Assertions.assertEquals("e", response.iterator().next().sourceId());
        Assertions.assertEquals("lfwyfwlwxjwetn", response.iterator().next().storageUri());
    }
}
