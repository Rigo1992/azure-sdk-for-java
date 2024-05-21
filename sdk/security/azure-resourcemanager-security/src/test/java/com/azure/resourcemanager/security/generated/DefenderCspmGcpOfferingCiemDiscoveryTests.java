// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderCspmGcpOfferingCiemDiscovery;
import org.junit.jupiter.api.Assertions;

public final class DefenderCspmGcpOfferingCiemDiscoveryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderCspmGcpOfferingCiemDiscovery model = BinaryData.fromString(
            "{\"workloadIdentityProviderId\":\"dsvcz\",\"serviceAccountEmailAddress\":\"iahuqymjzucw\",\"azureActiveDirectoryAppName\":\"ejjqhddw\"}")
            .toObject(DefenderCspmGcpOfferingCiemDiscovery.class);
        Assertions.assertEquals("dsvcz", model.workloadIdentityProviderId());
        Assertions.assertEquals("iahuqymjzucw", model.serviceAccountEmailAddress());
        Assertions.assertEquals("ejjqhddw", model.azureActiveDirectoryAppName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderCspmGcpOfferingCiemDiscovery model
            = new DefenderCspmGcpOfferingCiemDiscovery().withWorkloadIdentityProviderId("dsvcz")
                .withServiceAccountEmailAddress("iahuqymjzucw")
                .withAzureActiveDirectoryAppName("ejjqhddw");
        model = BinaryData.fromObject(model).toObject(DefenderCspmGcpOfferingCiemDiscovery.class);
        Assertions.assertEquals("dsvcz", model.workloadIdentityProviderId());
        Assertions.assertEquals("iahuqymjzucw", model.serviceAccountEmailAddress());
        Assertions.assertEquals("ejjqhddw", model.azureActiveDirectoryAppName());
    }
}
