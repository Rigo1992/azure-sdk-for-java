// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.maintenance.MaintenanceManager;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignment;
import com.azure.resourcemanager.maintenance.models.TagOperators;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ConfigurationAssignmentsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"location\":\"hbxvvyhgsopbyrqu\",\"properties\":{\"maintenanceConfigurationId\":\"xuvw\",\"resourceId\":\"bnhlmc\",\"filter\":{\"resourceTypes\":[\"ngitvgbmhrixkwm\"],\"resourceGroups\":[\"ejvegrhbpnaixex\",\"cbdreaxhcexd\"],\"osTypes\":[\"qahqkghtpwijn\",\"yjsvfyc\",\"z\"],\"locations\":[\"oowvrv\",\"t\"],\"tagSettings\":{\"tags\":{\"waekrrjreafxtsgu\":[\"y\",\"s\",\"ronzmyhgfip\",\"sxkm\"],\"elfk\":[\"jglikkxwslolb\",\"pvuzlmv\"],\"jjoqkagf\":[\"plcrpwjxeznoig\",\"rnjwmw\",\"pn\",\"saz\"],\"envrkpyouaibrebq\":[\"xttaugzxnfaaz\",\"xdtnkdmkqjjlw\"]},\"filterOperator\":\"Any\"}}},\"id\":\"j\",\"name\":\"ixqtn\",\"type\":\"ttezlw\"}]}";

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

        MaintenanceManager manager =
            MaintenanceManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ConfigurationAssignment> response =
            manager
                .configurationAssignments()
                .list("x", "v", "kkgll", "wjygvjayvblmhvk", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hbxvvyhgsopbyrqu", response.iterator().next().location());
        Assertions.assertEquals("xuvw", response.iterator().next().maintenanceConfigurationId());
        Assertions.assertEquals("bnhlmc", response.iterator().next().resourceId());
        Assertions.assertEquals("ngitvgbmhrixkwm", response.iterator().next().filter().resourceTypes().get(0));
        Assertions.assertEquals("ejvegrhbpnaixex", response.iterator().next().filter().resourceGroups().get(0));
        Assertions.assertEquals("qahqkghtpwijn", response.iterator().next().filter().osTypes().get(0));
        Assertions.assertEquals("oowvrv", response.iterator().next().filter().locations().get(0));
        Assertions
            .assertEquals("y", response.iterator().next().filter().tagSettings().tags().get("waekrrjreafxtsgu").get(0));
        Assertions.assertEquals(TagOperators.ANY, response.iterator().next().filter().tagSettings().filterOperator());
    }
}
