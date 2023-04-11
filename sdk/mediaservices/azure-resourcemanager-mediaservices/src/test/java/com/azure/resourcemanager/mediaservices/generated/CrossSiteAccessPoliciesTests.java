// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.CrossSiteAccessPolicies;
import org.junit.jupiter.api.Assertions;

public final class CrossSiteAccessPoliciesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CrossSiteAccessPolicies model =
            BinaryData
                .fromString("{\"clientAccessPolicy\":\"xbjhwuaanozjosph\",\"crossDomainPolicy\":\"ulpjr\"}")
                .toObject(CrossSiteAccessPolicies.class);
        Assertions.assertEquals("xbjhwuaanozjosph", model.clientAccessPolicy());
        Assertions.assertEquals("ulpjr", model.crossDomainPolicy());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CrossSiteAccessPolicies model =
            new CrossSiteAccessPolicies().withClientAccessPolicy("xbjhwuaanozjosph").withCrossDomainPolicy("ulpjr");
        model = BinaryData.fromObject(model).toObject(CrossSiteAccessPolicies.class);
        Assertions.assertEquals("xbjhwuaanozjosph", model.clientAccessPolicy());
        Assertions.assertEquals("ulpjr", model.crossDomainPolicy());
    }
}
