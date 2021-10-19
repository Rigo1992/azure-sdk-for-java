// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.generated;

import com.azure.core.util.Context;

/** Samples for OperationStatuses Get. */
public final class OperationStatusesGetSamples {
    /*
     * x-ms-original-file: specification/videoanalyzer/resource-manager/Microsoft.Media/preview/2021-11-01-preview/examples/video-analyzer-private-endpoint-connection-operation-status-by-id-terminal-state.json
     */
    /**
     * Sample code: Get status of private endpoint asynchronous operation when it is completed.
     *
     * @param manager Entry point to VideoAnalyzerManager.
     */
    public static void getStatusOfPrivateEndpointAsynchronousOperationWhenItIsCompleted(
        com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager) {
        manager
            .operationStatuses()
            .getWithResponse(
                "contoso",
                "contososports",
                "D612C429-2526-49D5-961B-885AE11406FD",
                "CDE44A33-DD32-4FFA-A1BC-601DC4D52B03",
                Context.NONE);
    }
}
