// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** A rule that defines actions to execute upon a specific trigger. */
@Fluent
public final class ExceptionRuleInternal {
    /*
     * The trigger for this exception rule
     */
    @JsonProperty(value = "trigger", required = true)
    private JobExceptionTriggerInternal trigger;

    /*
     * A dictionary collection of actions to perform once the exception is
     * triggered. Key is the Id of each exception action.
     */
    @JsonProperty(value = "actions", required = true)
    private Map<String, Object> actions;

    /**
     * Get the trigger property: The trigger for this exception rule.
     *
     * @return the trigger value.
     */
    public JobExceptionTriggerInternal getTrigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: The trigger for this exception rule.
     *
     * @param trigger the trigger value to set.
     * @return the ExceptionRuleInternal object itself.
     */
    public ExceptionRuleInternal setTrigger(JobExceptionTriggerInternal trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Get the actions property: A dictionary collection of actions to perform once the exception is triggered. Key is
     * the Id of each exception action.
     *
     * @return the actions value.
     */
    public Map<String, Object> getActions() {
        return this.actions;
    }

    /**
     * Set the actions property: A dictionary collection of actions to perform once the exception is triggered. Key is
     * the Id of each exception action.
     *
     * @param actions the actions value to set.
     * @return the ExceptionRuleInternal object itself.
     */
    public ExceptionRuleInternal setActions(Map<String, Object> actions) {
        this.actions = actions;
        return this;
    }
}
