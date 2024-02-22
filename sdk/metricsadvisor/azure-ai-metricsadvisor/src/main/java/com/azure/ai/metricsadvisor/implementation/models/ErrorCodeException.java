// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/**
 * Exception thrown for an invalid response with ErrorCode information.
 */
public final class ErrorCodeException extends HttpResponseException {
    /**
     * Initializes a new instance of the ErrorCodeException class.
     * 
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public ErrorCodeException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the ErrorCodeException class.
     * 
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public ErrorCodeException(String message, HttpResponse response, ErrorCode value) {
        super(message, response, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ErrorCode getValue() {
        return (ErrorCode) super.getValue();
    }
}
