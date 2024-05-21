// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.DnsZoneResponse;
import com.azure.resourcemanager.recoveryservices.models.VaultSubResourceType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DnsZoneResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DnsZoneResponse model
            = BinaryData.fromString("{\"requiredZoneNames\":[\"ap\"],\"subResource\":\"AzureBackup_secondary\"}")
                .toObject(DnsZoneResponse.class);
        Assertions.assertEquals(VaultSubResourceType.AZURE_BACKUP_SECONDARY, model.subResource());
        Assertions.assertEquals("ap", model.requiredZoneNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DnsZoneResponse model = new DnsZoneResponse().withSubResource(VaultSubResourceType.AZURE_BACKUP_SECONDARY)
            .withRequiredZoneNames(Arrays.asList("ap"));
        model = BinaryData.fromObject(model).toObject(DnsZoneResponse.class);
        Assertions.assertEquals(VaultSubResourceType.AZURE_BACKUP_SECONDARY, model.subResource());
        Assertions.assertEquals("ap", model.requiredZoneNames().get(0));
    }
}
