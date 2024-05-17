// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.SecureScoreControlDefinitionItemInner;
import com.azure.resourcemanager.security.fluent.models.SecureScoreControlDetailsInner;

public final class SecureScoreControlDetailsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecureScoreControlDetailsInner model = BinaryData.fromString(
            "{\"properties\":{\"displayName\":\"jpeuqlsdxeqztvxw\",\"score\":{\"max\":1828893529,\"current\":47.66084176433939,\"percentage\":6.469283873890586},\"healthyResourceCount\":1288324640,\"unhealthyResourceCount\":535686320,\"notApplicableResourceCount\":1358634456,\"weight\":1800415892008741044,\"definition\":{\"properties\":{\"displayName\":\"lndh\",\"description\":\"oeojhto\",\"maxScore\":97704799,\"source\":{\"sourceType\":\"BuiltIn\"},\"assessmentDefinitions\":[{\"id\":\"tzlnglxpn\"},{\"id\":\"yoan\"}]},\"id\":\"bcswqagyw\",\"name\":\"t\",\"type\":\"igvjrktp\"}},\"id\":\"aeukyawohpm\",\"name\":\"hqnucs\",\"type\":\"lhsidsjtdl\"}")
            .toObject(SecureScoreControlDetailsInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecureScoreControlDetailsInner model
            = new SecureScoreControlDetailsInner().withDefinition(new SecureScoreControlDefinitionItemInner());
        model = BinaryData.fromObject(model).toObject(SecureScoreControlDetailsInner.class);
    }
}
