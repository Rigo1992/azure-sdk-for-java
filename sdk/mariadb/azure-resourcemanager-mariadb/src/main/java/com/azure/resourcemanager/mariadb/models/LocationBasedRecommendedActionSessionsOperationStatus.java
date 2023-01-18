// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of LocationBasedRecommendedActionSessionsOperationStatus. */
public interface LocationBasedRecommendedActionSessionsOperationStatus {
    /**
     * Recommendation action session operation status.
     *
     * @param locationName The name of the location.
     * @param operationId The operation identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return recommendation action session operation status along with {@link Response}.
     */
    Response<RecommendedActionSessionsOperationStatus> getWithResponse(
        String locationName, String operationId, Context context);

    /**
     * Recommendation action session operation status.
     *
     * @param locationName The name of the location.
     * @param operationId The operation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return recommendation action session operation status.
     */
    RecommendedActionSessionsOperationStatus get(String locationName, String operationId);
}
