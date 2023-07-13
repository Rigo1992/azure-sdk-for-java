// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RouterJobStatus. */
public final class RouterJobStatus extends ExpandableStringEnum<RouterJobStatus> {
    /** Static value pendingClassification for RouterJobStatus. */
    public static final RouterJobStatus PENDING_CLASSIFICATION = fromString("pendingClassification");

    /** Static value queued for RouterJobStatus. */
    public static final RouterJobStatus QUEUED = fromString("queued");

    /** Static value assigned for RouterJobStatus. */
    public static final RouterJobStatus ASSIGNED = fromString("assigned");

    /** Static value completed for RouterJobStatus. */
    public static final RouterJobStatus COMPLETED = fromString("completed");

    /** Static value closed for RouterJobStatus. */
    public static final RouterJobStatus CLOSED = fromString("closed");

    /** Static value cancelled for RouterJobStatus. */
    public static final RouterJobStatus CANCELLED = fromString("cancelled");

    /** Static value classificationFailed for RouterJobStatus. */
    public static final RouterJobStatus CLASSIFICATION_FAILED = fromString("classificationFailed");

    /** Static value created for RouterJobStatus. */
    public static final RouterJobStatus CREATED = fromString("created");

    /** Static value pendingSchedule for RouterJobStatus. */
    public static final RouterJobStatus PENDING_SCHEDULE = fromString("pendingSchedule");

    /** Static value scheduled for RouterJobStatus. */
    public static final RouterJobStatus SCHEDULED = fromString("scheduled");

    /** Static value scheduleFailed for RouterJobStatus. */
    public static final RouterJobStatus SCHEDULE_FAILED = fromString("scheduleFailed");

    /** Static value waitingForActivation for RouterJobStatus. */
    public static final RouterJobStatus WAITING_FOR_ACTIVATION = fromString("waitingForActivation");

    /**
     * Creates or finds a RouterJobStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RouterJobStatus.
     */
    @JsonCreator
    public static RouterJobStatus fromString(String name) {
        return fromString(name, RouterJobStatus.class);
    }

    /**
     * Gets known RouterJobStatus values.
     *
     * @return known RouterJobStatus values.
     */
    public static Collection<RouterJobStatus> values() {
        return values(RouterJobStatus.class);
    }
}
