// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.SecuritySolutionProperties;
import com.azure.resourcemanager.security.models.ProvisioningState;
import com.azure.resourcemanager.security.models.SecurityFamily;
import org.junit.jupiter.api.Assertions;

public final class SecuritySolutionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecuritySolutionProperties model = BinaryData.fromString(
            "{\"securityFamily\":\"Ngfw\",\"provisioningState\":\"Updating\",\"template\":\"zladltxkpbq\",\"protectionStatus\":\"v\"}")
            .toObject(SecuritySolutionProperties.class);
        Assertions.assertEquals(SecurityFamily.NGFW, model.securityFamily());
        Assertions.assertEquals(ProvisioningState.UPDATING, model.provisioningState());
        Assertions.assertEquals("zladltxkpbq", model.template());
        Assertions.assertEquals("v", model.protectionStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecuritySolutionProperties model = new SecuritySolutionProperties().withSecurityFamily(SecurityFamily.NGFW)
            .withProvisioningState(ProvisioningState.UPDATING)
            .withTemplate("zladltxkpbq")
            .withProtectionStatus("v");
        model = BinaryData.fromObject(model).toObject(SecuritySolutionProperties.class);
        Assertions.assertEquals(SecurityFamily.NGFW, model.securityFamily());
        Assertions.assertEquals(ProvisioningState.UPDATING, model.provisioningState());
        Assertions.assertEquals("zladltxkpbq", model.template());
        Assertions.assertEquals("v", model.protectionStatus());
    }
}
