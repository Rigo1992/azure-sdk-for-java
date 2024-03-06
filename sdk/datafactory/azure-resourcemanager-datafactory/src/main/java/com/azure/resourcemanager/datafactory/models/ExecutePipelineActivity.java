// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.ExecutePipelineActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Execute pipeline activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ExecutePipeline")
@Fluent
public final class ExecutePipelineActivity extends ControlActivity {
    /*
     * Execute pipeline activity policy.
     */
    @JsonProperty(value = "policy")
    private ExecutePipelineActivityPolicy policy;

    /*
     * Execute pipeline activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private ExecutePipelineActivityTypeProperties innerTypeProperties = new ExecutePipelineActivityTypeProperties();

    /**
     * Creates an instance of ExecutePipelineActivity class.
     */
    public ExecutePipelineActivity() {
    }

    /**
     * Get the policy property: Execute pipeline activity policy.
     * 
     * @return the policy value.
     */
    public ExecutePipelineActivityPolicy policy() {
        return this.policy;
    }

    /**
     * Set the policy property: Execute pipeline activity policy.
     * 
     * @param policy the policy value to set.
     * @return the ExecutePipelineActivity object itself.
     */
    public ExecutePipelineActivity withPolicy(ExecutePipelineActivityPolicy policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Get the innerTypeProperties property: Execute pipeline activity properties.
     * 
     * @return the innerTypeProperties value.
     */
    private ExecutePipelineActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutePipelineActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutePipelineActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutePipelineActivity withState(ActivityState state) {
        super.withState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutePipelineActivity withOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.withOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutePipelineActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecutePipelineActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the pipeline property: Pipeline reference.
     * 
     * @return the pipeline value.
     */
    public PipelineReference pipeline() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().pipeline();
    }

    /**
     * Set the pipeline property: Pipeline reference.
     * 
     * @param pipeline the pipeline value to set.
     * @return the ExecutePipelineActivity object itself.
     */
    public ExecutePipelineActivity withPipeline(PipelineReference pipeline) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecutePipelineActivityTypeProperties();
        }
        this.innerTypeProperties().withPipeline(pipeline);
        return this;
    }

    /**
     * Get the parameters property: Pipeline parameters.
     * 
     * @return the parameters value.
     */
    public Map<String, Object> parameters() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().parameters();
    }

    /**
     * Set the parameters property: Pipeline parameters.
     * 
     * @param parameters the parameters value to set.
     * @return the ExecutePipelineActivity object itself.
     */
    public ExecutePipelineActivity withParameters(Map<String, Object> parameters) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecutePipelineActivityTypeProperties();
        }
        this.innerTypeProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the waitOnCompletion property: Defines whether activity execution will wait for the dependent pipeline
     * execution to finish. Default is false.
     * 
     * @return the waitOnCompletion value.
     */
    public Boolean waitOnCompletion() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().waitOnCompletion();
    }

    /**
     * Set the waitOnCompletion property: Defines whether activity execution will wait for the dependent pipeline
     * execution to finish. Default is false.
     * 
     * @param waitOnCompletion the waitOnCompletion value to set.
     * @return the ExecutePipelineActivity object itself.
     */
    public ExecutePipelineActivity withWaitOnCompletion(Boolean waitOnCompletion) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecutePipelineActivityTypeProperties();
        }
        this.innerTypeProperties().withWaitOnCompletion(waitOnCompletion);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (policy() != null) {
            policy().validate();
        }
        if (innerTypeProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerTypeProperties in model ExecutePipelineActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExecutePipelineActivity.class);
}
