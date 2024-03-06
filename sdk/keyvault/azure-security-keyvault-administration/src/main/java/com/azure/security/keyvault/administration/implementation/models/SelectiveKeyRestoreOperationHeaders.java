// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;

/**
 * The SelectiveKeyRestoreOperationHeaders model.
 */
@Fluent
public final class SelectiveKeyRestoreOperationHeaders {
    /*
     * The Retry-After property.
     */
    private Integer retryAfter;

    /*
     * The Azure-AsyncOperation property.
     */
    private String azureAsyncOperation;

    private static final HttpHeaderName AZURE_ASYNC_OPERATION = HttpHeaderName.fromString("Azure-AsyncOperation");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of SelectiveKeyRestoreOperationHeaders class.
     * 
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public SelectiveKeyRestoreOperationHeaders(HttpHeaders rawHeaders) {
        String retryAfter = rawHeaders.getValue(HttpHeaderName.RETRY_AFTER);
        if (retryAfter != null) {
            this.retryAfter = Integer.parseInt(retryAfter);
        }
        this.azureAsyncOperation = rawHeaders.getValue(AZURE_ASYNC_OPERATION);
    }

    /**
     * Get the retryAfter property: The Retry-After property.
     * 
     * @return the retryAfter value.
     */
    public Integer getRetryAfter() {
        return this.retryAfter;
    }

    /**
     * Set the retryAfter property: The Retry-After property.
     * 
     * @param retryAfter the retryAfter value to set.
     * @return the SelectiveKeyRestoreOperationHeaders object itself.
     */
    public SelectiveKeyRestoreOperationHeaders setRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

    /**
     * Get the azureAsyncOperation property: The Azure-AsyncOperation property.
     * 
     * @return the azureAsyncOperation value.
     */
    public String getAzureAsyncOperation() {
        return this.azureAsyncOperation;
    }

    /**
     * Set the azureAsyncOperation property: The Azure-AsyncOperation property.
     * 
     * @param azureAsyncOperation the azureAsyncOperation value to set.
     * @return the SelectiveKeyRestoreOperationHeaders object itself.
     */
    public SelectiveKeyRestoreOperationHeaders setAzureAsyncOperation(String azureAsyncOperation) {
        this.azureAsyncOperation = azureAsyncOperation;
        return this;
    }
}
