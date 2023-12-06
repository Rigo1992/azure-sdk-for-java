// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Execute pipeline activity properties.
 */
@Fluent
public final class ExecutePipelineActivityTypeProperties {
    /*
     * Pipeline reference.
     */
    @JsonProperty(value = "pipeline", required = true)
    private PipelineReference pipeline;

    /*
     * Pipeline parameters.
     */
    @JsonProperty(value = "parameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> parameters;

    /*
     * Defines whether activity execution will wait for the dependent pipeline execution to finish. Default is false.
     */
    @JsonProperty(value = "waitOnCompletion")
    private Boolean waitOnCompletion;

    /**
     * Creates an instance of ExecutePipelineActivityTypeProperties class.
     */
    public ExecutePipelineActivityTypeProperties() {
    }

    /**
     * Get the pipeline property: Pipeline reference.
     * 
     * @return the pipeline value.
     */
    public PipelineReference pipeline() {
        return this.pipeline;
    }

    /**
     * Set the pipeline property: Pipeline reference.
     * 
     * @param pipeline the pipeline value to set.
     * @return the ExecutePipelineActivityTypeProperties object itself.
     */
    public ExecutePipelineActivityTypeProperties withPipeline(PipelineReference pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Get the parameters property: Pipeline parameters.
     * 
     * @return the parameters value.
     */
    public Map<String, Object> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Pipeline parameters.
     * 
     * @param parameters the parameters value to set.
     * @return the ExecutePipelineActivityTypeProperties object itself.
     */
    public ExecutePipelineActivityTypeProperties withParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the waitOnCompletion property: Defines whether activity execution will wait for the dependent pipeline
     * execution to finish. Default is false.
     * 
     * @return the waitOnCompletion value.
     */
    public Boolean waitOnCompletion() {
        return this.waitOnCompletion;
    }

    /**
     * Set the waitOnCompletion property: Defines whether activity execution will wait for the dependent pipeline
     * execution to finish. Default is false.
     * 
     * @param waitOnCompletion the waitOnCompletion value to set.
     * @return the ExecutePipelineActivityTypeProperties object itself.
     */
    public ExecutePipelineActivityTypeProperties withWaitOnCompletion(Boolean waitOnCompletion) {
        this.waitOnCompletion = waitOnCompletion;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pipeline() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property pipeline in model ExecutePipelineActivityTypeProperties"));
        } else {
            pipeline().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExecutePipelineActivityTypeProperties.class);
}
