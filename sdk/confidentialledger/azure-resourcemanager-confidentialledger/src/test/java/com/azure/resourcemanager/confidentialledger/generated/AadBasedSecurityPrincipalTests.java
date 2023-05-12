// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confidentialledger.models.AadBasedSecurityPrincipal;
import com.azure.resourcemanager.confidentialledger.models.LedgerRoleName;
import org.junit.jupiter.api.Assertions;

public final class AadBasedSecurityPrincipalTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AadBasedSecurityPrincipal model =
            BinaryData
                .fromString("{\"principalId\":\"vamih\",\"tenantId\":\"gnarxzxtheo\",\"ledgerRoleName\":\"Reader\"}")
                .toObject(AadBasedSecurityPrincipal.class);
        Assertions.assertEquals("vamih", model.principalId());
        Assertions.assertEquals("gnarxzxtheo", model.tenantId());
        Assertions.assertEquals(LedgerRoleName.READER, model.ledgerRoleName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AadBasedSecurityPrincipal model =
            new AadBasedSecurityPrincipal()
                .withPrincipalId("vamih")
                .withTenantId("gnarxzxtheo")
                .withLedgerRoleName(LedgerRoleName.READER);
        model = BinaryData.fromObject(model).toObject(AadBasedSecurityPrincipal.class);
        Assertions.assertEquals("vamih", model.principalId());
        Assertions.assertEquals("gnarxzxtheo", model.tenantId());
        Assertions.assertEquals(LedgerRoleName.READER, model.ledgerRoleName());
    }
}
