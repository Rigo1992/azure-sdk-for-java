// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.GalleryListResult;

public final class GalleryListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GalleryListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Updated\",\"galleryResourceId\":\"uxwgipwho\"},\"id\":\"wkgshwa\",\"name\":\"kix\",\"type\":\"bin\"},{\"properties\":{\"provisioningState\":\"TransientFailure\",\"galleryResourceId\":\"ttmrywnuzoqf\"},\"id\":\"yqzrnkcqvyxlw\",\"name\":\"zlsico\",\"type\":\"oqqnwvlryav\"},{\"properties\":{\"provisioningState\":\"Running\",\"galleryResourceId\":\"unmmq\"},\"id\":\"yxzk\",\"name\":\"noc\",\"type\":\"koklya\"},{\"properties\":{\"provisioningState\":\"Creating\",\"galleryResourceId\":\"nuqszfkbey\"},\"id\":\"wrmjmwvvjektc\",\"name\":\"senhwlrs\",\"type\":\"frzpwvlqdqgb\"}],\"nextLink\":\"ylihkaetckt\"}")
            .toObject(GalleryListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GalleryListResult model = new GalleryListResult();
        model = BinaryData.fromObject(model).toObject(GalleryListResult.class);
    }
}
