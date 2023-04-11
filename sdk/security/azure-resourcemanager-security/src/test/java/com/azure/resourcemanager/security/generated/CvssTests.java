// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.Cvss;

public final class CvssTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Cvss model = BinaryData.fromString("{\"base\":53.688263}").toObject(Cvss.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Cvss model = new Cvss();
        model = BinaryData.fromObject(model).toObject(Cvss.class);
    }
}
