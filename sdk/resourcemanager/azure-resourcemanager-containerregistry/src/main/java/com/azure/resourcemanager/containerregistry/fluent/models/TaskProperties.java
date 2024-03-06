// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerregistry.models.AgentProperties;
import com.azure.resourcemanager.containerregistry.models.Credentials;
import com.azure.resourcemanager.containerregistry.models.PlatformProperties;
import com.azure.resourcemanager.containerregistry.models.ProvisioningState;
import com.azure.resourcemanager.containerregistry.models.TaskStatus;
import com.azure.resourcemanager.containerregistry.models.TaskStepProperties;
import com.azure.resourcemanager.containerregistry.models.TriggerProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The properties of a task.
 */
@Fluent
public final class TaskProperties {
    /*
     * The provisioning state of the task.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The creation date of task.
     */
    @JsonProperty(value = "creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /*
     * The current status of task.
     */
    @JsonProperty(value = "status")
    private TaskStatus status;

    /*
     * The platform properties against which the run has to happen.
     */
    @JsonProperty(value = "platform")
    private PlatformProperties platform;

    /*
     * The machine configuration of the run agent.
     */
    @JsonProperty(value = "agentConfiguration")
    private AgentProperties agentConfiguration;

    /*
     * The dedicated agent pool for the task.
     */
    @JsonProperty(value = "agentPoolName")
    private String agentPoolName;

    /*
     * Run timeout in seconds.
     */
    @JsonProperty(value = "timeout")
    private Integer timeout;

    /*
     * The properties of a task step.
     */
    @JsonProperty(value = "step")
    private TaskStepProperties step;

    /*
     * The properties that describe all triggers for the task.
     */
    @JsonProperty(value = "trigger")
    private TriggerProperties trigger;

    /*
     * The properties that describes a set of credentials that will be used when this run is invoked.
     */
    @JsonProperty(value = "credentials")
    private Credentials credentials;

    /*
     * The template that describes the repository and tag information for run log artifact.
     */
    @JsonProperty(value = "logTemplate")
    private String logTemplate;

    /*
     * The value of this property indicates whether the task resource is system task or not.
     */
    @JsonProperty(value = "isSystemTask")
    private Boolean isSystemTask;

    /**
     * Creates an instance of TaskProperties class.
     */
    public TaskProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the task.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the creationDate property: The creation date of task.
     * 
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the status property: The current status of task.
     * 
     * @return the status value.
     */
    public TaskStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The current status of task.
     * 
     * @param status the status value to set.
     * @return the TaskProperties object itself.
     */
    public TaskProperties withStatus(TaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the platform property: The platform properties against which the run has to happen.
     * 
     * @return the platform value.
     */
    public PlatformProperties platform() {
        return this.platform;
    }

    /**
     * Set the platform property: The platform properties against which the run has to happen.
     * 
     * @param platform the platform value to set.
     * @return the TaskProperties object itself.
     */
    public TaskProperties withPlatform(PlatformProperties platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the agentConfiguration property: The machine configuration of the run agent.
     * 
     * @return the agentConfiguration value.
     */
    public AgentProperties agentConfiguration() {
        return this.agentConfiguration;
    }

    /**
     * Set the agentConfiguration property: The machine configuration of the run agent.
     * 
     * @param agentConfiguration the agentConfiguration value to set.
     * @return the TaskProperties object itself.
     */
    public TaskProperties withAgentConfiguration(AgentProperties agentConfiguration) {
        this.agentConfiguration = agentConfiguration;
        return this;
    }

    /**
     * Get the agentPoolName property: The dedicated agent pool for the task.
     * 
     * @return the agentPoolName value.
     */
    public String agentPoolName() {
        return this.agentPoolName;
    }

    /**
     * Set the agentPoolName property: The dedicated agent pool for the task.
     * 
     * @param agentPoolName the agentPoolName value to set.
     * @return the TaskProperties object itself.
     */
    public TaskProperties withAgentPoolName(String agentPoolName) {
        this.agentPoolName = agentPoolName;
        return this;
    }

    /**
     * Get the timeout property: Run timeout in seconds.
     * 
     * @return the timeout value.
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: Run timeout in seconds.
     * 
     * @param timeout the timeout value to set.
     * @return the TaskProperties object itself.
     */
    public TaskProperties withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the step property: The properties of a task step.
     * 
     * @return the step value.
     */
    public TaskStepProperties step() {
        return this.step;
    }

    /**
     * Set the step property: The properties of a task step.
     * 
     * @param step the step value to set.
     * @return the TaskProperties object itself.
     */
    public TaskProperties withStep(TaskStepProperties step) {
        this.step = step;
        return this;
    }

    /**
     * Get the trigger property: The properties that describe all triggers for the task.
     * 
     * @return the trigger value.
     */
    public TriggerProperties trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: The properties that describe all triggers for the task.
     * 
     * @param trigger the trigger value to set.
     * @return the TaskProperties object itself.
     */
    public TaskProperties withTrigger(TriggerProperties trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Get the credentials property: The properties that describes a set of credentials that will be used when this run
     * is invoked.
     * 
     * @return the credentials value.
     */
    public Credentials credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: The properties that describes a set of credentials that will be used when this run
     * is invoked.
     * 
     * @param credentials the credentials value to set.
     * @return the TaskProperties object itself.
     */
    public TaskProperties withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the logTemplate property: The template that describes the repository and tag information for run log
     * artifact.
     * 
     * @return the logTemplate value.
     */
    public String logTemplate() {
        return this.logTemplate;
    }

    /**
     * Set the logTemplate property: The template that describes the repository and tag information for run log
     * artifact.
     * 
     * @param logTemplate the logTemplate value to set.
     * @return the TaskProperties object itself.
     */
    public TaskProperties withLogTemplate(String logTemplate) {
        this.logTemplate = logTemplate;
        return this;
    }

    /**
     * Get the isSystemTask property: The value of this property indicates whether the task resource is system task or
     * not.
     * 
     * @return the isSystemTask value.
     */
    public Boolean isSystemTask() {
        return this.isSystemTask;
    }

    /**
     * Set the isSystemTask property: The value of this property indicates whether the task resource is system task or
     * not.
     * 
     * @param isSystemTask the isSystemTask value to set.
     * @return the TaskProperties object itself.
     */
    public TaskProperties withIsSystemTask(Boolean isSystemTask) {
        this.isSystemTask = isSystemTask;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (platform() != null) {
            platform().validate();
        }
        if (agentConfiguration() != null) {
            agentConfiguration().validate();
        }
        if (step() != null) {
            step().validate();
        }
        if (trigger() != null) {
            trigger().validate();
        }
        if (credentials() != null) {
            credentials().validate();
        }
    }
}
