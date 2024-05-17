// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.GitLabGroupInner;
import com.azure.resourcemanager.security.models.DevOpsProvisioningState;
import com.azure.resourcemanager.security.models.GitLabGroupProperties;
import com.azure.resourcemanager.security.models.OnboardingState;
import org.junit.jupiter.api.Assertions;

public final class GitLabGroupInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GitLabGroupInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningStatusMessage\":\"cakznhokhoitwhrj\",\"provisioningStatusUpdateTimeUtc\":\"2021-10-09T11:08:07Z\",\"provisioningState\":\"Canceled\",\"fullyQualifiedName\":\"dnckidbjpglhz\",\"fullyQualifiedFriendlyName\":\"xzbawkikc\",\"url\":\"fhbssdpjeyoqxded\",\"onboardingState\":\"NotApplicable\"},\"id\":\"iwhagxsur\",\"name\":\"jqrshz\",\"type\":\"bgullc\"}")
            .toObject(GitLabGroupInner.class);
        Assertions.assertEquals(DevOpsProvisioningState.CANCELED, model.properties().provisioningState());
        Assertions.assertEquals(OnboardingState.NOT_APPLICABLE, model.properties().onboardingState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GitLabGroupInner model = new GitLabGroupInner()
            .withProperties(new GitLabGroupProperties().withProvisioningState(DevOpsProvisioningState.CANCELED)
                .withOnboardingState(OnboardingState.NOT_APPLICABLE));
        model = BinaryData.fromObject(model).toObject(GitLabGroupInner.class);
        Assertions.assertEquals(DevOpsProvisioningState.CANCELED, model.properties().provisioningState());
        Assertions.assertEquals(OnboardingState.NOT_APPLICABLE, model.properties().onboardingState());
    }
}
