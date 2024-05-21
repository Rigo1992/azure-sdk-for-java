// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DevOpsProvisioningState;
import com.azure.resourcemanager.security.models.GitLabProjectProperties;
import com.azure.resourcemanager.security.models.OnboardingState;
import org.junit.jupiter.api.Assertions;

public final class GitLabProjectPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GitLabProjectProperties model = BinaryData.fromString(
            "{\"provisioningStatusMessage\":\"hxuk\",\"provisioningStatusUpdateTimeUtc\":\"2021-10-05T01:12:22Z\",\"provisioningState\":\"PendingDeletion\",\"fullyQualifiedName\":\"oiboan\",\"fullyQualifiedFriendlyName\":\"rcoanvxuldx\",\"fullyQualifiedParentGroupName\":\"c\",\"url\":\"nlb\",\"onboardingState\":\"NotApplicable\"}")
            .toObject(GitLabProjectProperties.class);
        Assertions.assertEquals(DevOpsProvisioningState.PENDING_DELETION, model.provisioningState());
        Assertions.assertEquals(OnboardingState.NOT_APPLICABLE, model.onboardingState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GitLabProjectProperties model
            = new GitLabProjectProperties().withProvisioningState(DevOpsProvisioningState.PENDING_DELETION)
                .withOnboardingState(OnboardingState.NOT_APPLICABLE);
        model = BinaryData.fromObject(model).toObject(GitLabProjectProperties.class);
        Assertions.assertEquals(DevOpsProvisioningState.PENDING_DELETION, model.provisioningState());
        Assertions.assertEquals(OnboardingState.NOT_APPLICABLE, model.onboardingState());
    }
}
