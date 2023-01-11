// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response body structure of data flow query for data preview, statistics or expression preview. */
@Fluent
public final class DataFlowDebugQueryResponse {
    /*
     * The run ID of data flow debug session.
     */
    @JsonProperty(value = "runId")
    private String runId;

    /** Creates an instance of DataFlowDebugQueryResponse class. */
    public DataFlowDebugQueryResponse() {}

    /**
     * Get the runId property: The run ID of data flow debug session.
     *
     * @return the runId value.
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * Set the runId property: The run ID of data flow debug session.
     *
     * @param runId the runId value to set.
     * @return the DataFlowDebugQueryResponse object itself.
     */
    public DataFlowDebugQueryResponse setRunId(String runId) {
        this.runId = runId;
        return this;
    }
}
