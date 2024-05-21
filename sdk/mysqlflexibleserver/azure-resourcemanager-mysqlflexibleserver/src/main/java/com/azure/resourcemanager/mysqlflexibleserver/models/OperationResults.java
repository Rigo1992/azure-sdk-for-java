// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of OperationResults.
 */
public interface OperationResults {
    /**
     * Get the operation result for a long running operation.
     * 
     * @param locationName The name of the location.
     * @param operationId The operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result for a long running operation along with {@link Response}.
     */
    Response<OperationStatusExtendedResult> getWithResponse(String locationName, String operationId, Context context);

    /**
     * Get the operation result for a long running operation.
     * 
     * @param locationName The name of the location.
     * @param operationId The operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result for a long running operation.
     */
    OperationStatusExtendedResult get(String locationName, String operationId);
}
