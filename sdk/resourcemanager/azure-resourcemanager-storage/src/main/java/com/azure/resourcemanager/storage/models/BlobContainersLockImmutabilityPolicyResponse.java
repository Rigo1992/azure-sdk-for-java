// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.storage.fluent.models.ImmutabilityPolicyInner;

/**
 * Contains all response data for the lockImmutabilityPolicy operation.
 */
public final class BlobContainersLockImmutabilityPolicyResponse
    extends ResponseBase<BlobContainersLockImmutabilityPolicyHeaders, ImmutabilityPolicyInner> {
    /**
     * Creates an instance of BlobContainersLockImmutabilityPolicyResponse.
     * 
     * @param request the request which resulted in this BlobContainersLockImmutabilityPolicyResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlobContainersLockImmutabilityPolicyResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders,
        ImmutabilityPolicyInner value, BlobContainersLockImmutabilityPolicyHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     * 
     * @return the deserialized response body.
     */
    @Override
    public ImmutabilityPolicyInner getValue() {
        return super.getValue();
    }
}
