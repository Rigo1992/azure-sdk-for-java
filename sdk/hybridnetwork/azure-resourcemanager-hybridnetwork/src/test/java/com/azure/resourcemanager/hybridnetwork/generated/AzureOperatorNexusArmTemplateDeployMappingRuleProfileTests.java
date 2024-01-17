// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.ApplicationEnablement;
import com.azure.resourcemanager.hybridnetwork.models.ArmTemplateMappingRuleProfile;
import com.azure.resourcemanager.hybridnetwork.models.AzureOperatorNexusArmTemplateDeployMappingRuleProfile;
import org.junit.jupiter.api.Assertions;

public final class AzureOperatorNexusArmTemplateDeployMappingRuleProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureOperatorNexusArmTemplateDeployMappingRuleProfile model = BinaryData.fromString(
            "{\"templateMappingRuleProfile\":{\"templateParameters\":\"pqxbkwvzgnzvdf\"},\"applicationEnablement\":\"Enabled\"}")
            .toObject(AzureOperatorNexusArmTemplateDeployMappingRuleProfile.class);
        Assertions.assertEquals(ApplicationEnablement.ENABLED, model.applicationEnablement());
        Assertions.assertEquals("pqxbkwvzgnzvdf", model.templateMappingRuleProfile().templateParameters());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureOperatorNexusArmTemplateDeployMappingRuleProfile model
            = new AzureOperatorNexusArmTemplateDeployMappingRuleProfile()
                .withApplicationEnablement(ApplicationEnablement.ENABLED).withTemplateMappingRuleProfile(
                    new ArmTemplateMappingRuleProfile().withTemplateParameters("pqxbkwvzgnzvdf"));
        model = BinaryData.fromObject(model).toObject(AzureOperatorNexusArmTemplateDeployMappingRuleProfile.class);
        Assertions.assertEquals(ApplicationEnablement.ENABLED, model.applicationEnablement());
        Assertions.assertEquals("pqxbkwvzgnzvdf", model.templateMappingRuleProfile().templateParameters());
    }
}
