// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Run notebook error.
 */
@Fluent
public final class RunNotebookError {
    /*
     * Error name.
     */
    @JsonProperty(value = "ename", access = JsonProperty.Access.WRITE_ONLY)
    private String ename;

    /*
     * Error message.
     */
    @JsonProperty(value = "evalue", access = JsonProperty.Access.WRITE_ONLY)
    private String evalue;

    /*
     * Error trace.
     */
    @JsonProperty(value = "traceback")
    private List<String> traceback;

    /**
     * Creates an instance of RunNotebookError class.
     */
    public RunNotebookError() {
    }

    /**
     * Get the ename property: Error name.
     * 
     * @return the ename value.
     */
    public String getEname() {
        return this.ename;
    }

    /**
     * Get the evalue property: Error message.
     * 
     * @return the evalue value.
     */
    public String getEvalue() {
        return this.evalue;
    }

    /**
     * Get the traceback property: Error trace.
     * 
     * @return the traceback value.
     */
    public List<String> getTraceback() {
        return this.traceback;
    }

    /**
     * Set the traceback property: Error trace.
     * 
     * @param traceback the traceback value to set.
     * @return the RunNotebookError object itself.
     */
    public RunNotebookError setTraceback(List<String> traceback) {
        this.traceback = traceback;
        return this;
    }
}
