// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.AzureADPartnerClientAuthenticationProperties;
import org.junit.jupiter.api.Assertions;

public final class AzureADPartnerClientAuthenticationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureADPartnerClientAuthenticationProperties model = BinaryData.fromString(
            "{\"azureActiveDirectoryTenantId\":\"vmsxbaevwjcnkot\",\"azureActiveDirectoryApplicationIdOrUri\":\"wuhvaj\"}")
            .toObject(AzureADPartnerClientAuthenticationProperties.class);
        Assertions.assertEquals("vmsxbaevwjcnkot", model.azureActiveDirectoryTenantId());
        Assertions.assertEquals("wuhvaj", model.azureActiveDirectoryApplicationIdOrUri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureADPartnerClientAuthenticationProperties model
            = new AzureADPartnerClientAuthenticationProperties().withAzureActiveDirectoryTenantId("vmsxbaevwjcnkot")
                .withAzureActiveDirectoryApplicationIdOrUri("wuhvaj");
        model = BinaryData.fromObject(model).toObject(AzureADPartnerClientAuthenticationProperties.class);
        Assertions.assertEquals("vmsxbaevwjcnkot", model.azureActiveDirectoryTenantId());
        Assertions.assertEquals("wuhvaj", model.azureActiveDirectoryApplicationIdOrUri());
    }
}
