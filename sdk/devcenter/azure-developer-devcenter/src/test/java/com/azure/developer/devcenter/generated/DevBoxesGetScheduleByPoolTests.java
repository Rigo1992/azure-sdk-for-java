// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;

public final class DevBoxesGetScheduleByPoolTests extends DevCenterClientTestBase {
    @Test
    public void testDevBoxesGetScheduleByPoolTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                devBoxesClient.getScheduleWithResponse(projectName, poolName, "default", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        LinkedHashMap poolData = response.getValue().toObject(LinkedHashMap.class);
        Assertions.assertEquals("default", poolData.get("name"));
    }
}
