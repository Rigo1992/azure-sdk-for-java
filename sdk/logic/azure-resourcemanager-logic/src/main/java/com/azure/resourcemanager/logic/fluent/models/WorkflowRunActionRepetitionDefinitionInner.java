// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.models.ContentLink;
import com.azure.resourcemanager.logic.models.RepetitionIndex;
import com.azure.resourcemanager.logic.models.RetryHistory;
import com.azure.resourcemanager.logic.models.RunActionCorrelation;
import com.azure.resourcemanager.logic.models.WorkflowStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** The workflow run action repetition definition. */
@Fluent
public final class WorkflowRunActionRepetitionDefinitionInner extends Resource {
    /*
     * The workflow run action repetition properties definition.
     */
    @JsonProperty(value = "properties", required = true)
    private WorkflowRunActionRepetitionProperties innerProperties = new WorkflowRunActionRepetitionProperties();

    /** Creates an instance of WorkflowRunActionRepetitionDefinitionInner class. */
    public WorkflowRunActionRepetitionDefinitionInner() {
    }

    /**
     * Get the innerProperties property: The workflow run action repetition properties definition.
     *
     * @return the innerProperties value.
     */
    private WorkflowRunActionRepetitionProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public WorkflowRunActionRepetitionDefinitionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WorkflowRunActionRepetitionDefinitionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the repetitionIndexes property: The repetition indexes.
     *
     * @return the repetitionIndexes value.
     */
    public List<RepetitionIndex> repetitionIndexes() {
        return this.innerProperties() == null ? null : this.innerProperties().repetitionIndexes();
    }

    /**
     * Set the repetitionIndexes property: The repetition indexes.
     *
     * @param repetitionIndexes the repetitionIndexes value to set.
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withRepetitionIndexes(List<RepetitionIndex> repetitionIndexes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowRunActionRepetitionProperties();
        }
        this.innerProperties().withRepetitionIndexes(repetitionIndexes);
        return this;
    }

    /**
     * Get the trackingId property: Gets the tracking id.
     *
     * @return the trackingId value.
     */
    public String trackingId() {
        return this.innerProperties() == null ? null : this.innerProperties().trackingId();
    }

    /**
     * Get the inputs property: Gets the inputs.
     *
     * @return the inputs value.
     */
    public Object inputs() {
        return this.innerProperties() == null ? null : this.innerProperties().inputs();
    }

    /**
     * Get the inputsLink property: Gets the link to inputs.
     *
     * @return the inputsLink value.
     */
    public ContentLink inputsLink() {
        return this.innerProperties() == null ? null : this.innerProperties().inputsLink();
    }

    /**
     * Get the outputs property: Gets the outputs.
     *
     * @return the outputs value.
     */
    public Object outputs() {
        return this.innerProperties() == null ? null : this.innerProperties().outputs();
    }

    /**
     * Get the outputsLink property: Gets the link to outputs.
     *
     * @return the outputsLink value.
     */
    public ContentLink outputsLink() {
        return this.innerProperties() == null ? null : this.innerProperties().outputsLink();
    }

    /**
     * Get the trackedProperties property: Gets the tracked properties.
     *
     * @return the trackedProperties value.
     */
    public Object trackedProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().trackedProperties();
    }

    /**
     * Get the retryHistory property: Gets the retry histories.
     *
     * @return the retryHistory value.
     */
    public List<RetryHistory> retryHistory() {
        return this.innerProperties() == null ? null : this.innerProperties().retryHistory();
    }

    /**
     * Set the retryHistory property: Gets the retry histories.
     *
     * @param retryHistory the retryHistory value to set.
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withRetryHistory(List<RetryHistory> retryHistory) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowRunActionRepetitionProperties();
        }
        this.innerProperties().withRetryHistory(retryHistory);
        return this;
    }

    /**
     * Get the iterationCount property: The iterationCount property.
     *
     * @return the iterationCount value.
     */
    public Integer iterationCount() {
        return this.innerProperties() == null ? null : this.innerProperties().iterationCount();
    }

    /**
     * Set the iterationCount property: The iterationCount property.
     *
     * @param iterationCount the iterationCount value to set.
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withIterationCount(Integer iterationCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowRunActionRepetitionProperties();
        }
        this.innerProperties().withIterationCount(iterationCount);
        return this;
    }

    /**
     * Get the startTime property: The start time of the workflow scope repetition.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Set the startTime property: The start time of the workflow scope repetition.
     *
     * @param startTime the startTime value to set.
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withStartTime(OffsetDateTime startTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowRunActionRepetitionProperties();
        }
        this.innerProperties().withStartTime(startTime);
        return this;
    }

    /**
     * Get the endTime property: The end time of the workflow scope repetition.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.innerProperties() == null ? null : this.innerProperties().endTime();
    }

    /**
     * Set the endTime property: The end time of the workflow scope repetition.
     *
     * @param endTime the endTime value to set.
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withEndTime(OffsetDateTime endTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowRunActionRepetitionProperties();
        }
        this.innerProperties().withEndTime(endTime);
        return this;
    }

    /**
     * Get the correlation property: The correlation properties.
     *
     * @return the correlation value.
     */
    public RunActionCorrelation correlation() {
        return this.innerProperties() == null ? null : this.innerProperties().correlation();
    }

    /**
     * Set the correlation property: The correlation properties.
     *
     * @param correlation the correlation value to set.
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withCorrelation(RunActionCorrelation correlation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowRunActionRepetitionProperties();
        }
        this.innerProperties().withCorrelation(correlation);
        return this;
    }

    /**
     * Get the status property: The status of the workflow scope repetition.
     *
     * @return the status value.
     */
    public WorkflowStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The status of the workflow scope repetition.
     *
     * @param status the status value to set.
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withStatus(WorkflowStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowRunActionRepetitionProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the code property: The workflow scope repetition code.
     *
     * @return the code value.
     */
    public String code() {
        return this.innerProperties() == null ? null : this.innerProperties().code();
    }

    /**
     * Set the code property: The workflow scope repetition code.
     *
     * @param code the code value to set.
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withCode(String code) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowRunActionRepetitionProperties();
        }
        this.innerProperties().withCode(code);
        return this;
    }

    /**
     * Get the error property: Anything.
     *
     * @return the error value.
     */
    public Object error() {
        return this.innerProperties() == null ? null : this.innerProperties().error();
    }

    /**
     * Set the error property: Anything.
     *
     * @param error the error value to set.
     * @return the WorkflowRunActionRepetitionDefinitionInner object itself.
     */
    public WorkflowRunActionRepetitionDefinitionInner withError(Object error) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowRunActionRepetitionProperties();
        }
        this.innerProperties().withError(error);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model"
                            + " WorkflowRunActionRepetitionDefinitionInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkflowRunActionRepetitionDefinitionInner.class);
}
