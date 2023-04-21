// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.GovernanceAssignment;
import com.azure.resourcemanager.security.models.GovernanceAssignmentAdditionalData;
import com.azure.resourcemanager.security.models.GovernanceEmailNotification;
import com.azure.resourcemanager.security.models.RemediationEta;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class GovernanceAssignmentsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"owner\":\"jjzgxqgqw\",\"remediationDueDate\":\"2021-06-27T22:34:45Z\",\"remediationEta\":{\"eta\":\"2021-09-27T23:54:35Z\",\"justification\":\"gtvh\"},\"isGracePeriod\":false,\"governanceEmailNotification\":{\"disableManagerEmailNotification\":true,\"disableOwnerEmailNotification\":false},\"additionalData\":{\"ticketNumber\":1254338347,\"ticketLink\":\"zejogmkorvvmvm\",\"ticketStatus\":\"fnqh\"}},\"id\":\"bsn\",\"name\":\"snqliwkmzojfe\",\"type\":\"yalhtgm\"}";

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

        SecurityManager manager =
            SecurityManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        GovernanceAssignment response =
            manager
                .governanceAssignments()
                .define("canzb")
                .withExistingAssessment("kgdet", "z")
                .withOwner("wu")
                .withRemediationDueDate(OffsetDateTime.parse("2021-04-13T16:18:12Z"))
                .withRemediationEta(
                    new RemediationEta()
                        .withEta(OffsetDateTime.parse("2021-10-14T16:12:54Z"))
                        .withJustification("vnensmuffiw"))
                .withIsGracePeriod(true)
                .withGovernanceEmailNotification(
                    new GovernanceEmailNotification()
                        .withDisableManagerEmailNotification(true)
                        .withDisableOwnerEmailNotification(true))
                .withAdditionalData(
                    new GovernanceAssignmentAdditionalData()
                        .withTicketNumber(844736587)
                        .withTicketLink("totdxposcslh")
                        .withTicketStatus("usiecktybhjuxid"))
                .create();

        Assertions.assertEquals("jjzgxqgqw", response.owner());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-27T22:34:45Z"), response.remediationDueDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-27T23:54:35Z"), response.remediationEta().eta());
        Assertions.assertEquals("gtvh", response.remediationEta().justification());
        Assertions.assertEquals(false, response.isGracePeriod());
        Assertions.assertEquals(true, response.governanceEmailNotification().disableManagerEmailNotification());
        Assertions.assertEquals(false, response.governanceEmailNotification().disableOwnerEmailNotification());
        Assertions.assertEquals(1254338347, response.additionalData().ticketNumber());
        Assertions.assertEquals("zejogmkorvvmvm", response.additionalData().ticketLink());
        Assertions.assertEquals("fnqh", response.additionalData().ticketStatus());
    }
}
