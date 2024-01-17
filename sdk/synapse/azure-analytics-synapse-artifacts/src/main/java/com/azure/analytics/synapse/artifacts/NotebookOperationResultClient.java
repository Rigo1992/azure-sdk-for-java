// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.NotebookOperationResultsImpl;
import com.azure.analytics.synapse.artifacts.models.ErrorContractException;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Initializes a new instance of the synchronous ArtifactsClient type.
 */
@ServiceClient(builder = ArtifactsClientBuilder.class)
public final class NotebookOperationResultClient {
    @Generated
    private final NotebookOperationResultsImpl serviceClient;

    /**
     * Initializes an instance of NotebookOperationResultClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    NotebookOperationResultClient(NotebookOperationResultsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get notebook operation result.
     * 
     * @param operationId Operation ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return notebook operation result along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getWithResponse(String operationId, Context context) {
        return this.serviceClient.getWithResponse(operationId, context);
    }

    /**
     * Get notebook operation result.
     * 
     * @param operationId Operation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void get(String operationId) {
        this.serviceClient.get(operationId);
    }
}
