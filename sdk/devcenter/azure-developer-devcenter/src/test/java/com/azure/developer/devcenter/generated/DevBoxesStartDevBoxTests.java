// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.SyncPoller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DevBoxesStartDevBoxTests extends DevCenterClientTestBase {
    @Test
    public void testDevBoxesStartDevBoxTests() {
        createDevBox();

        RequestOptions requestOptions = new RequestOptions();
        SyncPoller<BinaryData, BinaryData> response =
                devBoxesClient.beginStartDevBox(projectName, "me", devBoxName, requestOptions);

        Assertions.assertEquals(
                LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, response.waitForCompletion().getStatus());

        deleteDevBox();
    }
}
