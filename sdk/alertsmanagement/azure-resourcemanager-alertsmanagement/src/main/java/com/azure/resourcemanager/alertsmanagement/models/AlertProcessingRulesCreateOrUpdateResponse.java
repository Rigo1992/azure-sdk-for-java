// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.alertsmanagement.fluent.models.AlertProcessingRuleInner;

/** Contains all response data for the createOrUpdate operation. */
public final class AlertProcessingRulesCreateOrUpdateResponse
    extends ResponseBase<AlertProcessingRulesCreateOrUpdateHeaders, AlertProcessingRuleInner> {
    /**
     * Creates an instance of AlertProcessingRulesCreateOrUpdateResponse.
     *
     * @param request the request which resulted in this AlertProcessingRulesCreateOrUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public AlertProcessingRulesCreateOrUpdateResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        AlertProcessingRuleInner value,
        AlertProcessingRulesCreateOrUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     *
     * @return the deserialized response body.
     */
    @Override
    public AlertProcessingRuleInner getValue() {
        return super.getValue();
    }
}
