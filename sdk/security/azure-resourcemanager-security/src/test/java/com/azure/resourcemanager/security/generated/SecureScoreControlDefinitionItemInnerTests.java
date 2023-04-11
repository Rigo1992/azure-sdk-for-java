// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.SecureScoreControlDefinitionItemInner;

public final class SecureScoreControlDefinitionItemInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecureScoreControlDefinitionItemInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"displayName\":\"uyturml\",\"description\":\"owolbaui\",\"maxScore\":79221925,\"source\":{\"sourceType\":\"Custom\"},\"assessmentDefinitions\":[{\"id\":\"nw\"},{\"id\":\"gajinnixjawrtmj\"},{\"id\":\"myccx\"},{\"id\":\"hcoxov\"}]},\"id\":\"ekhenl\",\"name\":\"sfnrdtjxt\",\"type\":\"r\"}")
                .toObject(SecureScoreControlDefinitionItemInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecureScoreControlDefinitionItemInner model = new SecureScoreControlDefinitionItemInner();
        model = BinaryData.fromObject(model).toObject(SecureScoreControlDefinitionItemInner.class);
    }
}
