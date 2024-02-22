// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.ResourceGuardOperationDetail;
import com.azure.resourcemanager.recoveryservicesbackup.models.ResourceGuardProxyBase;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ResourceGuardProxyBaseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceGuardProxyBase model = BinaryData.fromString(
            "{\"resourceGuardResourceId\":\"saz\",\"resourceGuardOperationDetails\":[{\"vaultCriticalOperation\":\"qkagfhsxt\",\"defaultResourceRequest\":\"ugzxnf\"},{\"vaultCriticalOperation\":\"zpxdt\",\"defaultResourceRequest\":\"dm\"},{\"vaultCriticalOperation\":\"j\",\"defaultResourceRequest\":\"wuenvr\"}],\"lastUpdatedTime\":\"yo\",\"description\":\"ibreb\"}")
            .toObject(ResourceGuardProxyBase.class);
        Assertions.assertEquals("saz", model.resourceGuardResourceId());
        Assertions.assertEquals("qkagfhsxt", model.resourceGuardOperationDetails().get(0).vaultCriticalOperation());
        Assertions.assertEquals("ugzxnf", model.resourceGuardOperationDetails().get(0).defaultResourceRequest());
        Assertions.assertEquals("yo", model.lastUpdatedTime());
        Assertions.assertEquals("ibreb", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceGuardProxyBase model = new ResourceGuardProxyBase().withResourceGuardResourceId("saz")
            .withResourceGuardOperationDetails(Arrays.asList(
                new ResourceGuardOperationDetail().withVaultCriticalOperation("qkagfhsxt")
                    .withDefaultResourceRequest("ugzxnf"),
                new ResourceGuardOperationDetail().withVaultCriticalOperation("zpxdt").withDefaultResourceRequest("dm"),
                new ResourceGuardOperationDetail().withVaultCriticalOperation("j")
                    .withDefaultResourceRequest("wuenvr")))
            .withLastUpdatedTime("yo").withDescription("ibreb");
        model = BinaryData.fromObject(model).toObject(ResourceGuardProxyBase.class);
        Assertions.assertEquals("saz", model.resourceGuardResourceId());
        Assertions.assertEquals("qkagfhsxt", model.resourceGuardOperationDetails().get(0).vaultCriticalOperation());
        Assertions.assertEquals("ugzxnf", model.resourceGuardOperationDetails().get(0).defaultResourceRequest());
        Assertions.assertEquals("yo", model.lastUpdatedTime());
        Assertions.assertEquals("ibreb", model.description());
    }
}
