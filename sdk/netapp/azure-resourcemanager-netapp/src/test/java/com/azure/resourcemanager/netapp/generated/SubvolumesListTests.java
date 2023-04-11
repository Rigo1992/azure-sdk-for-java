// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SubvolumeInfoInner;
import com.azure.resourcemanager.netapp.models.SubvolumesList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SubvolumesListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubvolumesList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"path\":\"elvezrypq\",\"size\":2764555725436180174,\"parentPath\":\"kerqwkyh\",\"provisioningState\":\"bopgxedkowepbqp\"},\"id\":\"fkbw\",\"name\":\"csnjvcdwxlpqekft\",\"type\":\"khtj\"}],\"nextLink\":\"i\"}")
                .toObject(SubvolumesList.class);
        Assertions.assertEquals("elvezrypq", model.value().get(0).path());
        Assertions.assertEquals(2764555725436180174L, model.value().get(0).size());
        Assertions.assertEquals("kerqwkyh", model.value().get(0).parentPath());
        Assertions.assertEquals("i", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubvolumesList model =
            new SubvolumesList()
                .withValue(
                    Arrays
                        .asList(
                            new SubvolumeInfoInner()
                                .withPath("elvezrypq")
                                .withSize(2764555725436180174L)
                                .withParentPath("kerqwkyh")))
                .withNextLink("i");
        model = BinaryData.fromObject(model).toObject(SubvolumesList.class);
        Assertions.assertEquals("elvezrypq", model.value().get(0).path());
        Assertions.assertEquals(2764555725436180174L, model.value().get(0).size());
        Assertions.assertEquals("kerqwkyh", model.value().get(0).parentPath());
        Assertions.assertEquals("i", model.nextLink());
    }
}
