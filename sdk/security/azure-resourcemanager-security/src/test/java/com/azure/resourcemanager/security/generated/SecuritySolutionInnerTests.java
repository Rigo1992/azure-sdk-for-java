// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.SecuritySolutionInner;
import com.azure.resourcemanager.security.models.ProvisioningState;
import com.azure.resourcemanager.security.models.SecurityFamily;
import org.junit.jupiter.api.Assertions;

public final class SecuritySolutionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecuritySolutionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"securityFamily\":\"Ngfw\",\"provisioningState\":\"Failed\",\"template\":\"rxhtvso\",\"protectionStatus\":\"hlwntsjgq\"},\"location\":\"xypruuuy\",\"id\":\"nchrszizoyu\",\"name\":\"lyetndnbfqygg\",\"type\":\"g\"}")
                .toObject(SecuritySolutionInner.class);
        Assertions.assertEquals(SecurityFamily.NGFW, model.securityFamily());
        Assertions.assertEquals(ProvisioningState.FAILED, model.provisioningState());
        Assertions.assertEquals("rxhtvso", model.template());
        Assertions.assertEquals("hlwntsjgq", model.protectionStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecuritySolutionInner model =
            new SecuritySolutionInner()
                .withSecurityFamily(SecurityFamily.NGFW)
                .withProvisioningState(ProvisioningState.FAILED)
                .withTemplate("rxhtvso")
                .withProtectionStatus("hlwntsjgq");
        model = BinaryData.fromObject(model).toObject(SecuritySolutionInner.class);
        Assertions.assertEquals(SecurityFamily.NGFW, model.securityFamily());
        Assertions.assertEquals(ProvisioningState.FAILED, model.provisioningState());
        Assertions.assertEquals("rxhtvso", model.template());
        Assertions.assertEquals("hlwntsjgq", model.protectionStatus());
    }
}
