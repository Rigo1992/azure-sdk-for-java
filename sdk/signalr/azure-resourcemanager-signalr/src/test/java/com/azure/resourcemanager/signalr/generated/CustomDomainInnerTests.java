// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.fluent.models.CustomDomainInner;
import com.azure.resourcemanager.signalr.models.ResourceReference;
import org.junit.jupiter.api.Assertions;

public final class CustomDomainInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomDomainInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Deleting\",\"domainName\":\"mygtdssls\",\"customCertificate\":{\"id\":\"mweriofzpy\"}},\"id\":\"semwabnet\",\"name\":\"hhszh\",\"type\":\"d\"}")
                .toObject(CustomDomainInner.class);
        Assertions.assertEquals("mygtdssls", model.domainName());
        Assertions.assertEquals("mweriofzpy", model.customCertificate().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomDomainInner model =
            new CustomDomainInner()
                .withDomainName("mygtdssls")
                .withCustomCertificate(new ResourceReference().withId("mweriofzpy"));
        model = BinaryData.fromObject(model).toObject(CustomDomainInner.class);
        Assertions.assertEquals("mygtdssls", model.domainName());
        Assertions.assertEquals("mweriofzpy", model.customCertificate().id());
    }
}
