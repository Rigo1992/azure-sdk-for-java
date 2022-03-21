// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.botservice.fluent.models.OperationResultsDescriptionInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in OperationResultsClient. */
public interface OperationResultsClient {
    /**
     * Get the operation result for a long running operation.
     *
     * @param operationResultId The ID of the operation result to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result for a long running operation along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationResultsDescriptionInner>, OperationResultsDescriptionInner> beginGet(
        String operationResultId);

    /**
     * Get the operation result for a long running operation.
     *
     * @param operationResultId The ID of the operation result to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result for a long running operation along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationResultsDescriptionInner>, OperationResultsDescriptionInner> beginGet(
        String operationResultId, Context context);

    /**
     * Get the operation result for a long running operation.
     *
     * @param operationResultId The ID of the operation result to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result for a long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationResultsDescriptionInner get(String operationResultId);

    /**
     * Get the operation result for a long running operation.
     *
     * @param operationResultId The ID of the operation result to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result for a long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationResultsDescriptionInner get(String operationResultId, Context context);
}
