// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.apimanagement.fluent.models.TagContractInner;

/** Contains all response data for the assignToApi operation. */
public final class TagsAssignToApiResponse extends ResponseBase<TagsAssignToApiHeaders, TagContractInner> {
    /**
     * Creates an instance of TagsAssignToApiResponse.
     *
     * @param request the request which resulted in this TagsAssignToApiResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public TagsAssignToApiResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        TagContractInner value,
        TagsAssignToApiHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     *
     * @return the deserialized response body.
     */
    @Override
    public TagContractInner getValue() {
        return super.getValue();
    }
}
