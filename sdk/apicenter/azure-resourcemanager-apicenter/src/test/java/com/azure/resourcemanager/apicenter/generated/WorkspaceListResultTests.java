// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apicenter.models.WorkspaceListResult;

public final class WorkspaceListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkspaceListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"title\":\"ex\",\"description\":\"bhtqqrolfpfpsa\"},\"id\":\"bquxigjy\",\"name\":\"gzjaoyfhrtxilne\",\"type\":\"kujysvlejuvfq\"}],\"nextLink\":\"rlyxwjkcprbnw\"}")
            .toObject(WorkspaceListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkspaceListResult model = new WorkspaceListResult();
        model = BinaryData.fromObject(model).toObject(WorkspaceListResult.class);
    }
}
