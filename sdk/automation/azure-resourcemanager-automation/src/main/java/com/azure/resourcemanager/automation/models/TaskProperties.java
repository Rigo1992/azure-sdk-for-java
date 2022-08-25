// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Task properties of the software update configuration. */
@Fluent
public final class TaskProperties {
    /*
     * Gets or sets the parameters of the task.
     */
    @JsonProperty(value = "parameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> parameters;

    /*
     * Gets or sets the name of the runbook.
     */
    @JsonProperty(value = "source")
    private String source;

    /**
     * Get the parameters property: Gets or sets the parameters of the task.
     *
     * @return the parameters value.
     */
    public Map<String, String> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Gets or sets the parameters of the task.
     *
     * @param parameters the parameters value to set.
     * @return the TaskProperties object itself.
     */
    public TaskProperties withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the source property: Gets or sets the name of the runbook.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: Gets or sets the name of the runbook.
     *
     * @param source the source value to set.
     * @return the TaskProperties object itself.
     */
    public TaskProperties withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
