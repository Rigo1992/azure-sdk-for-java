// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ActionableRemediation;
import com.azure.resourcemanager.security.models.ActionableRemediationState;
import com.azure.resourcemanager.security.models.AnnotateDefaultBranchState;
import com.azure.resourcemanager.security.models.AzureDevOpsOrgProperties;
import com.azure.resourcemanager.security.models.CategoryConfiguration;
import com.azure.resourcemanager.security.models.DevOpsProvisioningState;
import com.azure.resourcemanager.security.models.InheritFromParentState;
import com.azure.resourcemanager.security.models.OnboardingState;
import com.azure.resourcemanager.security.models.RuleCategory;
import com.azure.resourcemanager.security.models.TargetBranchConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureDevOpsOrgPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDevOpsOrgProperties model = BinaryData.fromString(
            "{\"provisioningStatusMessage\":\"rnskby\",\"provisioningStatusUpdateTimeUtc\":\"2021-02-05T12:22:46Z\",\"provisioningState\":\"Succeeded\",\"onboardingState\":\"OnboardedByOtherConnector\",\"actionableRemediation\":{\"state\":\"Disabled\",\"categoryConfigurations\":[{\"minimumSeverityLevel\":\"pxecxqnwhscozaw\",\"category\":\"Secrets\"},{\"minimumSeverityLevel\":\"smpknpwi\",\"category\":\"Containers\"},{\"minimumSeverityLevel\":\"fewxqouox\",\"category\":\"Containers\"},{\"minimumSeverityLevel\":\"ckaprhknqiijge\",\"category\":\"Code\"}],\"branchConfiguration\":{\"branchNames\":[\"queqihk\",\"yowltj\",\"uwhldxwhieproqks\",\"fxmcvprstvk\"],\"annotateDefaultBranch\":\"Disabled\"},\"inheritFromParentState\":\"Enabled\"}}")
            .toObject(AzureDevOpsOrgProperties.class);
        Assertions.assertEquals(DevOpsProvisioningState.SUCCEEDED, model.provisioningState());
        Assertions.assertEquals(OnboardingState.ONBOARDED_BY_OTHER_CONNECTOR, model.onboardingState());
        Assertions.assertEquals(ActionableRemediationState.DISABLED, model.actionableRemediation().state());
        Assertions.assertEquals("pxecxqnwhscozaw",
            model.actionableRemediation().categoryConfigurations().get(0).minimumSeverityLevel());
        Assertions.assertEquals(RuleCategory.SECRETS,
            model.actionableRemediation().categoryConfigurations().get(0).category());
        Assertions.assertEquals("queqihk", model.actionableRemediation().branchConfiguration().branchNames().get(0));
        Assertions.assertEquals(AnnotateDefaultBranchState.DISABLED,
            model.actionableRemediation().branchConfiguration().annotateDefaultBranch());
        Assertions.assertEquals(InheritFromParentState.ENABLED, model.actionableRemediation().inheritFromParentState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDevOpsOrgProperties model
            = new AzureDevOpsOrgProperties().withProvisioningState(DevOpsProvisioningState.SUCCEEDED)
                .withOnboardingState(OnboardingState.ONBOARDED_BY_OTHER_CONNECTOR)
                .withActionableRemediation(new ActionableRemediation().withState(ActionableRemediationState.DISABLED)
                    .withCategoryConfigurations(Arrays.asList(
                        new CategoryConfiguration().withMinimumSeverityLevel("pxecxqnwhscozaw")
                            .withCategory(RuleCategory.SECRETS),
                        new CategoryConfiguration().withMinimumSeverityLevel("smpknpwi")
                            .withCategory(RuleCategory.CONTAINERS),
                        new CategoryConfiguration().withMinimumSeverityLevel("fewxqouox")
                            .withCategory(RuleCategory.CONTAINERS),
                        new CategoryConfiguration().withMinimumSeverityLevel("ckaprhknqiijge")
                            .withCategory(RuleCategory.CODE)))
                    .withBranchConfiguration(new TargetBranchConfiguration()
                        .withBranchNames(Arrays.asList("queqihk", "yowltj", "uwhldxwhieproqks", "fxmcvprstvk"))
                        .withAnnotateDefaultBranch(AnnotateDefaultBranchState.DISABLED))
                    .withInheritFromParentState(InheritFromParentState.ENABLED));
        model = BinaryData.fromObject(model).toObject(AzureDevOpsOrgProperties.class);
        Assertions.assertEquals(DevOpsProvisioningState.SUCCEEDED, model.provisioningState());
        Assertions.assertEquals(OnboardingState.ONBOARDED_BY_OTHER_CONNECTOR, model.onboardingState());
        Assertions.assertEquals(ActionableRemediationState.DISABLED, model.actionableRemediation().state());
        Assertions.assertEquals("pxecxqnwhscozaw",
            model.actionableRemediation().categoryConfigurations().get(0).minimumSeverityLevel());
        Assertions.assertEquals(RuleCategory.SECRETS,
            model.actionableRemediation().categoryConfigurations().get(0).category());
        Assertions.assertEquals("queqihk", model.actionableRemediation().branchConfiguration().branchNames().get(0));
        Assertions.assertEquals(AnnotateDefaultBranchState.DISABLED,
            model.actionableRemediation().branchConfiguration().annotateDefaultBranch());
        Assertions.assertEquals(InheritFromParentState.ENABLED, model.actionableRemediation().inheritFromParentState());
    }
}
