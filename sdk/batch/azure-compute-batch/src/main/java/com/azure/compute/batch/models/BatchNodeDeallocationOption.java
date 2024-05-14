// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * BatchNodeDeallocationOption enums.
 */
public final class BatchNodeDeallocationOption extends ExpandableStringEnum<BatchNodeDeallocationOption> {

    /**
     * Terminate running Task processes and requeue the Tasks. The Tasks will run again when a Compute Node is
     * available. Remove Compute Nodes as soon as Tasks have been terminated.
     */
    @Generated
    public static final BatchNodeDeallocationOption REQUEUE = fromString("requeue");

    /**
     * Terminate running Tasks. The Tasks will be completed with failureInfo indicating that they were terminated, and
     * will not run again. Remove Compute Nodes as soon as Tasks have been terminated.
     */
    @Generated
    public static final BatchNodeDeallocationOption TERMINATE = fromString("terminate");

    /**
     * Allow currently running Tasks to complete. Schedule no new Tasks while waiting. Remove Compute Nodes when all
     * Tasks have completed.
     */
    @Generated
    public static final BatchNodeDeallocationOption TASK_COMPLETION = fromString("taskcompletion");

    /**
     * Allow currently running Tasks to complete, then wait for all Task data retention periods to expire. Schedule no
     * new Tasks while waiting. Remove Compute Nodes when all Task retention periods have expired.
     */
    @Generated
    public static final BatchNodeDeallocationOption RETAINED_DATA = fromString("retaineddata");

    /**
     * Creates a new instance of BatchNodeDeallocationOption value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public BatchNodeDeallocationOption() {
    }

    /**
     * Creates or finds a BatchNodeDeallocationOption from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BatchNodeDeallocationOption.
     */
    @Generated
    public static BatchNodeDeallocationOption fromString(String name) {
        return fromString(name, BatchNodeDeallocationOption.class);
    }

    /**
     * Gets known BatchNodeDeallocationOption values.
     *
     * @return known BatchNodeDeallocationOption values.
     */
    @Generated
    public static Collection<BatchNodeDeallocationOption> values() {
        return values(BatchNodeDeallocationOption.class);
    }
}
