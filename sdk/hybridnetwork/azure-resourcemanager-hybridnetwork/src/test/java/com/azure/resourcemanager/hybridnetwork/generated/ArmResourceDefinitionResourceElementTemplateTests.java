// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.ArmResourceDefinitionResourceElementTemplate;
import com.azure.resourcemanager.hybridnetwork.models.NsdArtifactProfile;
import com.azure.resourcemanager.hybridnetwork.models.ReferencedResource;
import com.azure.resourcemanager.hybridnetwork.models.TemplateType;
import org.junit.jupiter.api.Assertions;

public final class ArmResourceDefinitionResourceElementTemplateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArmResourceDefinitionResourceElementTemplate model = BinaryData.fromString(
            "{\"templateType\":\"ArmTemplate\",\"parameterValues\":\"iuubwefqsf\",\"artifactProfile\":{\"artifactStoreReference\":{\"id\":\"tf\"},\"artifactName\":\"rqwexjkmfxapjwog\",\"artifactVersion\":\"nobpudcdabtqwpw\"}}")
            .toObject(ArmResourceDefinitionResourceElementTemplate.class);
        Assertions.assertEquals(TemplateType.ARM_TEMPLATE, model.templateType());
        Assertions.assertEquals("iuubwefqsf", model.parameterValues());
        Assertions.assertEquals("tf", model.artifactProfile().artifactStoreReference().id());
        Assertions.assertEquals("rqwexjkmfxapjwog", model.artifactProfile().artifactName());
        Assertions.assertEquals("nobpudcdabtqwpw", model.artifactProfile().artifactVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArmResourceDefinitionResourceElementTemplate model = new ArmResourceDefinitionResourceElementTemplate()
            .withTemplateType(TemplateType.ARM_TEMPLATE).withParameterValues("iuubwefqsf").withArtifactProfile(
                new NsdArtifactProfile().withArtifactStoreReference(new ReferencedResource().withId("tf"))
                    .withArtifactName("rqwexjkmfxapjwog").withArtifactVersion("nobpudcdabtqwpw"));
        model = BinaryData.fromObject(model).toObject(ArmResourceDefinitionResourceElementTemplate.class);
        Assertions.assertEquals(TemplateType.ARM_TEMPLATE, model.templateType());
        Assertions.assertEquals("iuubwefqsf", model.parameterValues());
        Assertions.assertEquals("tf", model.artifactProfile().artifactStoreReference().id());
        Assertions.assertEquals("rqwexjkmfxapjwog", model.artifactProfile().artifactName());
        Assertions.assertEquals("nobpudcdabtqwpw", model.artifactProfile().artifactVersion());
    }
}
