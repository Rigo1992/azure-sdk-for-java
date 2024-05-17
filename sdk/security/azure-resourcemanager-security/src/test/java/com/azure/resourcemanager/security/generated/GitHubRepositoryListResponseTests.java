// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.GitHubRepositoryInner;
import com.azure.resourcemanager.security.models.DevOpsProvisioningState;
import com.azure.resourcemanager.security.models.GitHubRepositoryListResponse;
import com.azure.resourcemanager.security.models.GitHubRepositoryProperties;
import com.azure.resourcemanager.security.models.OnboardingState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class GitHubRepositoryListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GitHubRepositoryListResponse model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningStatusMessage\":\"ntsxjmfmeftvh\",\"provisioningStatusUpdateTimeUtc\":\"2021-09-28T22:33:38Z\",\"provisioningState\":\"Failed\",\"repoId\":\"rh\",\"repoName\":\"bwgmjgrul\",\"repoFullName\":\"ogxhcxn\",\"onboardingState\":\"NotOnboarded\",\"repoUrl\":\"fdz\",\"parentOwnerName\":\"ouzfwofwakuk\"},\"id\":\"kdt\",\"name\":\"xsoednlw\",\"type\":\"li\"}],\"nextLink\":\"zomucmqgisnionet\"}")
            .toObject(GitHubRepositoryListResponse.class);
        Assertions.assertEquals(DevOpsProvisioningState.FAILED, model.value().get(0).properties().provisioningState());
        Assertions.assertEquals(OnboardingState.NOT_ONBOARDED, model.value().get(0).properties().onboardingState());
        Assertions.assertEquals("ouzfwofwakuk", model.value().get(0).properties().parentOwnerName());
        Assertions.assertEquals("zomucmqgisnionet", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GitHubRepositoryListResponse model
            = new GitHubRepositoryListResponse().withValue(Arrays.asList(new GitHubRepositoryInner()
                .withProperties(new GitHubRepositoryProperties().withProvisioningState(DevOpsProvisioningState.FAILED)
                    .withOnboardingState(OnboardingState.NOT_ONBOARDED)
                    .withParentOwnerName("ouzfwofwakuk"))))
                .withNextLink("zomucmqgisnionet");
        model = BinaryData.fromObject(model).toObject(GitHubRepositoryListResponse.class);
        Assertions.assertEquals(DevOpsProvisioningState.FAILED, model.value().get(0).properties().provisioningState());
        Assertions.assertEquals(OnboardingState.NOT_ONBOARDED, model.value().get(0).properties().onboardingState());
        Assertions.assertEquals("ouzfwofwakuk", model.value().get(0).properties().parentOwnerName());
        Assertions.assertEquals("zomucmqgisnionet", model.nextLink());
    }
}
