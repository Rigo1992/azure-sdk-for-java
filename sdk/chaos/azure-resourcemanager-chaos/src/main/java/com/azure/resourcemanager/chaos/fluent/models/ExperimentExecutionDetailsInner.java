// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.chaos.models.ExperimentExecutionDetailsPropertiesRunInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Model that represents the execution details of a Experiment. */
@Immutable
public final class ExperimentExecutionDetailsInner {
    /*
     * String of the resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * String of the fully qualified resource ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * String of the resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The properties of the experiment execution details.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private ExperimentExecutionDetailsProperties innerProperties;

    /** Creates an instance of ExperimentExecutionDetailsInner class. */
    public ExperimentExecutionDetailsInner() {
    }

    /**
     * Get the type property: String of the resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the id property: String of the fully qualified resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: String of the resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the innerProperties property: The properties of the experiment execution details.
     *
     * @return the innerProperties value.
     */
    private ExperimentExecutionDetailsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the experimentId property: The id of the experiment.
     *
     * @return the experimentId value.
     */
    public String experimentId() {
        return this.innerProperties() == null ? null : this.innerProperties().experimentId();
    }

    /**
     * Get the status property: The value of the status of the experiment execution.
     *
     * @return the status value.
     */
    public String status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the failureReason property: The reason why the execution failed.
     *
     * @return the failureReason value.
     */
    public String failureReason() {
        return this.innerProperties() == null ? null : this.innerProperties().failureReason();
    }

    /**
     * Get the createdDateTime property: String that represents the created date time.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDateTime();
    }

    /**
     * Get the lastActionDateTime property: String that represents the last action date time.
     *
     * @return the lastActionDateTime value.
     */
    public OffsetDateTime lastActionDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastActionDateTime();
    }

    /**
     * Get the startDateTime property: String that represents the start date time.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime startDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startDateTime();
    }

    /**
     * Get the stopDateTime property: String that represents the stop date time.
     *
     * @return the stopDateTime value.
     */
    public OffsetDateTime stopDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().stopDateTime();
    }

    /**
     * Get the runInformation property: The information of the experiment run.
     *
     * @return the runInformation value.
     */
    public ExperimentExecutionDetailsPropertiesRunInformation runInformation() {
        return this.innerProperties() == null ? null : this.innerProperties().runInformation();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}