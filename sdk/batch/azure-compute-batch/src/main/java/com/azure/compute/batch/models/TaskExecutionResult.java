// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** TaskExecutionResult enums. */
public final class TaskExecutionResult extends ExpandableStringEnum<TaskExecutionResult> {

    /** The Task ran successfully. */
    @Generated public static final TaskExecutionResult SUCCESS = fromString("success");

    /**
     * There was an error during processing of the Task. The failure may have occurred before the Task process was
     * launched, while the Task process was executing, or after the Task process exited.
     */
    @Generated public static final TaskExecutionResult FAILURE = fromString("failure");

    /**
     * Creates a new instance of TaskExecutionResult value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public TaskExecutionResult() {}

    /**
     * Creates or finds a TaskExecutionResult from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TaskExecutionResult.
     */
    @Generated
    @JsonCreator
    public static TaskExecutionResult fromString(String name) {
        return fromString(name, TaskExecutionResult.class);
    }

    /**
     * Gets known TaskExecutionResult values.
     *
     * @return known TaskExecutionResult values.
     */
    @Generated
    public static Collection<TaskExecutionResult> values() {
        return values(TaskExecutionResult.class);
    }
}
