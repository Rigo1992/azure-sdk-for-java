// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.IssueAttachmentContractInner;
import org.junit.jupiter.api.Assertions;

public final class IssueAttachmentContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IssueAttachmentContractInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"title\":\"fkak\",\"contentFormat\":\"qfrkemyildudxj\",\"content\":\"sco\"},\"id\":\"vfdjkpdxp\",\"name\":\"lkksnmgzvyfi\",\"type\":\"dkz\"}")
                .toObject(IssueAttachmentContractInner.class);
        Assertions.assertEquals("fkak", model.title());
        Assertions.assertEquals("qfrkemyildudxj", model.contentFormat());
        Assertions.assertEquals("sco", model.content());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IssueAttachmentContractInner model =
            new IssueAttachmentContractInner().withTitle("fkak").withContentFormat("qfrkemyildudxj").withContent("sco");
        model = BinaryData.fromObject(model).toObject(IssueAttachmentContractInner.class);
        Assertions.assertEquals("fkak", model.title());
        Assertions.assertEquals("qfrkemyildudxj", model.contentFormat());
        Assertions.assertEquals("sco", model.content());
    }
}
