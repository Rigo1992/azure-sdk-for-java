// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Possible values for the status of an assistant thread run.
 */
public final class RunStatus extends ExpandableStringEnum<RunStatus> {

    /**
     * Represents a run that is queued to start.
     */
    @Generated
    public static final RunStatus QUEUED = fromString("queued");

    /**
     * Represents a run that is in progress.
     */
    @Generated
    public static final RunStatus IN_PROGRESS = fromString("in_progress");

    /**
     * Represents a run that needs another operation, such as tool output submission, to continue.
     */
    @Generated
    public static final RunStatus REQUIRES_ACTION = fromString("requires_action");

    /**
     * Represents a run that is in the process of cancellation.
     */
    @Generated
    public static final RunStatus CANCELLING = fromString("cancelling");

    /**
     * Represents a run that has been cancelled.
     */
    @Generated
    public static final RunStatus CANCELLED = fromString("cancelled");

    /**
     * Represents a run that failed.
     */
    @Generated
    public static final RunStatus FAILED = fromString("failed");

    /**
     * Represents a run that successfully completed.
     */
    @Generated
    public static final RunStatus COMPLETED = fromString("completed");

    /**
     * Represents a run that expired before it could otherwise finish.
     */
    @Generated
    public static final RunStatus EXPIRED = fromString("expired");

    /**
     * Creates a new instance of RunStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public RunStatus() {
    }

    /**
     * Creates or finds a RunStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RunStatus.
     */
    @Generated
    @JsonCreator
    public static RunStatus fromString(String name) {
        return fromString(name, RunStatus.class);
    }

    /**
     * Gets known RunStatus values.
     *
     * @return known RunStatus values.
     */
    @Generated
    public static Collection<RunStatus> values() {
        return values(RunStatus.class);
    }
}
