// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.security.fluent.models.OperationResultAutoGeneratedInner;

/** Contains all response data for the operationResults operation. */
public final class GovernanceRulesOperationResultsResponse
    extends ResponseBase<GovernanceRulesOperationResultsHeaders, OperationResultAutoGeneratedInner> {
    /**
     * Creates an instance of GovernanceRulesOperationResultsResponse.
     *
     * @param request the request which resulted in this GovernanceRulesOperationResultsResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public GovernanceRulesOperationResultsResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        OperationResultAutoGeneratedInner value,
        GovernanceRulesOperationResultsHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     *
     * @return the deserialized response body.
     */
    @Override
    public OperationResultAutoGeneratedInner getValue() {
        return super.getValue();
    }
}
