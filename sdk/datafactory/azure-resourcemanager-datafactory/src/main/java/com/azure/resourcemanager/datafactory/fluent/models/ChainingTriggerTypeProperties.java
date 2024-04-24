// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Chaining Trigger properties.
 */
@Fluent
public final class ChainingTriggerTypeProperties {
    /*
     * Upstream Pipelines.
     */
    @JsonProperty(value = "dependsOn", required = true)
    private List<PipelineReference> dependsOn;

    /*
     * Run Dimension property that needs to be emitted by upstream pipelines.
     */
    @JsonProperty(value = "runDimension", required = true)
    private String runDimension;

    /**
     * Creates an instance of ChainingTriggerTypeProperties class.
     */
    public ChainingTriggerTypeProperties() {
    }

    /**
     * Get the dependsOn property: Upstream Pipelines.
     * 
     * @return the dependsOn value.
     */
    public List<PipelineReference> dependsOn() {
        return this.dependsOn;
    }

    /**
     * Set the dependsOn property: Upstream Pipelines.
     * 
     * @param dependsOn the dependsOn value to set.
     * @return the ChainingTriggerTypeProperties object itself.
     */
    public ChainingTriggerTypeProperties withDependsOn(List<PipelineReference> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    /**
     * Get the runDimension property: Run Dimension property that needs to be emitted by upstream pipelines.
     * 
     * @return the runDimension value.
     */
    public String runDimension() {
        return this.runDimension;
    }

    /**
     * Set the runDimension property: Run Dimension property that needs to be emitted by upstream pipelines.
     * 
     * @param runDimension the runDimension value to set.
     * @return the ChainingTriggerTypeProperties object itself.
     */
    public ChainingTriggerTypeProperties withRunDimension(String runDimension) {
        this.runDimension = runDimension;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dependsOn() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property dependsOn in model ChainingTriggerTypeProperties"));
        } else {
            dependsOn().forEach(e -> e.validate());
        }
        if (runDimension() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property runDimension in model ChainingTriggerTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ChainingTriggerTypeProperties.class);
}
