// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.DevOpsProvisioningState;
import com.azure.resourcemanager.security.models.GitLabProject;
import com.azure.resourcemanager.security.models.OnboardingState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class GitLabProjectsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningStatusMessage\":\"pjj\",\"provisioningStatusUpdateTimeUtc\":\"2021-05-25T00:17:10Z\",\"provisioningState\":\"Pending\",\"fullyQualifiedName\":\"jfpxoygnmjniqwu\",\"fullyQualifiedFriendlyName\":\"yxfknj\",\"fullyQualifiedParentGroupName\":\"stnwvravntvklkwq\",\"url\":\"nlpaymketotk\",\"onboardingState\":\"Onboarded\"},\"id\":\"ewwlkry\",\"name\":\"mpgqqdhtct\",\"type\":\"xregykjmpad\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<GitLabProject> response
            = manager.gitLabProjects().list("mcgvjb", "ybfarkhkoqcudn", "m", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(DevOpsProvisioningState.PENDING,
            response.iterator().next().properties().provisioningState());
        Assertions.assertEquals(OnboardingState.ONBOARDED, response.iterator().next().properties().onboardingState());
    }
}
