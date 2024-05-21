// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.compute.batch.models;

import com.azure.core.http.RequestConditions;

/**
 * Optional parameters for enabling a Batch Job, allowing new Tasks to run.
 */
public class EnableBatchJobOptions extends BatchBaseOptions {
    private RequestConditions requestConditions;

    /**
     * Gets the HTTP options for conditional requests based on modification time.
     *
     * <p>The request conditions allow you to specify conditions that must be met for the request to be processed.
     *
     * @return The HTTP options for conditional requests.
     */
    public RequestConditions getRequestConditions() {
        return requestConditions;
    }

    /**
     * Sets the HTTP options for conditional requests based on modification time.
     *
     * <p>The request conditions allow you to specify conditions that must be met for the request to be processed.
     *
     * @param requestConditions The HTTP options for conditional requests.
     * @return The {@link EnableBatchJobOptions} object itself, allowing for method chaining.
     */
    public EnableBatchJobOptions setRequestConditions(RequestConditions requestConditions) {
        this.requestConditions = requestConditions;
        return this;
    }

}
