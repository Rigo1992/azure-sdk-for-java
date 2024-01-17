// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.dashboard.fluent.models.ManagedGrafanaInner;

/**
 * Contains all response data for the update operation.
 */
public final class GrafanasUpdateResponse extends ResponseBase<GrafanasUpdateHeaders, ManagedGrafanaInner> {
    /**
     * Creates an instance of GrafanasUpdateResponse.
     * 
     * @param request the request which resulted in this GrafanasUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public GrafanasUpdateResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders,
        ManagedGrafanaInner value, GrafanasUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     * 
     * @return the deserialized response body.
     */
    @Override
    public ManagedGrafanaInner getValue() {
        return super.getValue();
    }
}
