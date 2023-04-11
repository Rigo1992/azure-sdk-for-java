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
import com.azure.resourcemanager.security.models.GovernanceRule;
import com.azure.resourcemanager.security.models.GovernanceRuleEmailNotification;
import com.azure.resourcemanager.security.models.GovernanceRuleMetadata;
import com.azure.resourcemanager.security.models.GovernanceRuleOwnerSource;
import com.azure.resourcemanager.security.models.GovernanceRuleOwnerSourceType;
import com.azure.resourcemanager.security.models.GovernanceRuleSourceResourceType;
import com.azure.resourcemanager.security.models.GovernanceRuleType;
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

public final class GovernanceRulesCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"tenantId\":\"ol\",\"displayName\":\"wil\",\"description\":\"gojfsqe\",\"remediationTimeframe\":\"uxjxhfxf\",\"isGracePeriod\":true,\"rulePriority\":1987568238,\"isDisabled\":false,\"ruleType\":\"ServiceNow\",\"sourceResourceType\":\"Assessments\",\"excludedScopes\":[\"mxbmbrwgzzxljbkh\",\"sdplaumydmhw\",\"qjfyx\",\"dgtokvqbvwg\"],\"conditionSets\":[\"dataw\",\"datapvxakglhpsesrfga\"],\"includeMemberScopes\":false,\"ownerSource\":{\"type\":\"Manually\",\"value\":\"xcgdhyhgoqgso\"},\"governanceEmailNotification\":{\"disableManagerEmailNotification\":true,\"disableOwnerEmailNotification\":true},\"metadata\":{\"createdBy\":\"b\",\"createdOn\":\"2021-03-05T15:00:41Z\",\"updatedBy\":\"spglq\",\"updatedOn\":\"2021-05-23T05:40:58Z\"}},\"id\":\"tdahneaoovtyjzti\",\"name\":\"fwjlof\",\"type\":\"ekfsrm\"}";

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

        GovernanceRule response =
            manager
                .governanceRules()
                .define("tbqgdirdamm")
                .withExistingScope("shtkutzc")
                .withDisplayName("dgfttmd")
                .withDescription("geoagfuof")
                .withRemediationTimeframe("xodwxm")
                .withIsGracePeriod(true)
                .withRulePriority(2110518274)
                .withIsDisabled(false)
                .withRuleType(GovernanceRuleType.INTEGRATED)
                .withSourceResourceType(GovernanceRuleSourceResourceType.ASSESSMENTS)
                .withExcludedScopes(Arrays.asList("evmdm", "enlrstgf", "zljdnci", "tjva"))
                .withConditionSets(
                    Arrays.asList("datayznm", "datagcdogcvucgy", "dataoxuwhttnzqsaqm", "databgszplusdek"))
                .withIncludeMemberScopes(true)
                .withOwnerSource(
                    new GovernanceRuleOwnerSource()
                        .withType(GovernanceRuleOwnerSourceType.MANUALLY)
                        .withValue("sgpgvokyejidbd"))
                .withGovernanceEmailNotification(
                    new GovernanceRuleEmailNotification()
                        .withDisableManagerEmailNotification(true)
                        .withDisableOwnerEmailNotification(false))
                .withMetadata(new GovernanceRuleMetadata())
                .create();

        Assertions.assertEquals("wil", response.displayName());
        Assertions.assertEquals("gojfsqe", response.description());
        Assertions.assertEquals("uxjxhfxf", response.remediationTimeframe());
        Assertions.assertEquals(true, response.isGracePeriod());
        Assertions.assertEquals(1987568238, response.rulePriority());
        Assertions.assertEquals(false, response.isDisabled());
        Assertions.assertEquals(GovernanceRuleType.SERVICE_NOW, response.ruleType());
        Assertions.assertEquals(GovernanceRuleSourceResourceType.ASSESSMENTS, response.sourceResourceType());
        Assertions.assertEquals("mxbmbrwgzzxljbkh", response.excludedScopes().get(0));
        Assertions.assertEquals(false, response.includeMemberScopes());
        Assertions.assertEquals(GovernanceRuleOwnerSourceType.MANUALLY, response.ownerSource().type());
        Assertions.assertEquals("xcgdhyhgoqgso", response.ownerSource().value());
        Assertions.assertEquals(true, response.governanceEmailNotification().disableManagerEmailNotification());
        Assertions.assertEquals(true, response.governanceEmailNotification().disableOwnerEmailNotification());
    }
}
