// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Query filter option for listing runs.
 */
@Fluent
public final class RunQueryFilter {
    /*
     * Parameter name to be used for filter. The allowed operands to query pipeline runs are PipelineName, RunStart,
     * RunEnd and Status; to query activity runs are ActivityName, ActivityRunStart, ActivityRunEnd, ActivityType and
     * Status, and to query trigger runs are TriggerName, TriggerRunTimestamp and Status.
     */
    @JsonProperty(value = "operand", required = true)
    private RunQueryFilterOperand operand;

    /*
     * Operator to be used for filter.
     */
    @JsonProperty(value = "operator", required = true)
    private RunQueryFilterOperator operator;

    /*
     * List of filter values.
     */
    @JsonProperty(value = "values", required = true)
    private List<String> values;

    /**
     * Creates an instance of RunQueryFilter class.
     */
    public RunQueryFilter() {
    }

    /**
     * Get the operand property: Parameter name to be used for filter. The allowed operands to query pipeline runs are
     * PipelineName, RunStart, RunEnd and Status; to query activity runs are ActivityName, ActivityRunStart,
     * ActivityRunEnd, ActivityType and Status, and to query trigger runs are TriggerName, TriggerRunTimestamp and
     * Status.
     * 
     * @return the operand value.
     */
    public RunQueryFilterOperand operand() {
        return this.operand;
    }

    /**
     * Set the operand property: Parameter name to be used for filter. The allowed operands to query pipeline runs are
     * PipelineName, RunStart, RunEnd and Status; to query activity runs are ActivityName, ActivityRunStart,
     * ActivityRunEnd, ActivityType and Status, and to query trigger runs are TriggerName, TriggerRunTimestamp and
     * Status.
     * 
     * @param operand the operand value to set.
     * @return the RunQueryFilter object itself.
     */
    public RunQueryFilter withOperand(RunQueryFilterOperand operand) {
        this.operand = operand;
        return this;
    }

    /**
     * Get the operator property: Operator to be used for filter.
     * 
     * @return the operator value.
     */
    public RunQueryFilterOperator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: Operator to be used for filter.
     * 
     * @param operator the operator value to set.
     * @return the RunQueryFilter object itself.
     */
    public RunQueryFilter withOperator(RunQueryFilterOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the values property: List of filter values.
     * 
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set the values property: List of filter values.
     * 
     * @param values the values value to set.
     * @return the RunQueryFilter object itself.
     */
    public RunQueryFilter withValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operand() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property operand in model RunQueryFilter"));
        }
        if (operator() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property operator in model RunQueryFilter"));
        }
        if (values() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property values in model RunQueryFilter"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RunQueryFilter.class);
}
