// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ManagedIdentityCredential;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ManagedIdentityCredentialTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedIdentityCredential model = BinaryData.fromString(
            "{\"type\":\"rthqe\",\"typeProperties\":{\"resourceId\":\"jqafkmkro\"},\"description\":\"pqrtvaoznqni\",\"annotations\":[\"datazeagmceituuge\",\"datahfpjstlzmbls\",\"datajdeolctae\",\"datafsyrledjc\"],\"\":{\"igdx\":\"databvt\"}}")
            .toObject(ManagedIdentityCredential.class);
        Assertions.assertEquals("pqrtvaoznqni", model.description());
        Assertions.assertEquals("jqafkmkro", model.resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedIdentityCredential model = new ManagedIdentityCredential().withDescription("pqrtvaoznqni")
            .withAnnotations(Arrays.asList("datazeagmceituuge", "datahfpjstlzmbls", "datajdeolctae", "datafsyrledjc"))
            .withResourceId("jqafkmkro");
        model = BinaryData.fromObject(model).toObject(ManagedIdentityCredential.class);
        Assertions.assertEquals("pqrtvaoznqni", model.description());
        Assertions.assertEquals("jqafkmkro", model.resourceId());
    }
}
