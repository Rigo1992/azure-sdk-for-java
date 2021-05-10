// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OperationResultStatus. */
public final class OperationResultStatus extends ExpandableStringEnum<OperationResultStatus> {
    /** Static value Canceled for OperationResultStatus. */
    public static final OperationResultStatus CANCELED = fromString("Canceled");

    /** Static value Succeeded for OperationResultStatus. */
    public static final OperationResultStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for OperationResultStatus. */
    public static final OperationResultStatus FAILED = fromString("Failed");

    /** Static value Requested for OperationResultStatus. */
    public static final OperationResultStatus REQUESTED = fromString("Requested");

    /** Static value Running for OperationResultStatus. */
    public static final OperationResultStatus RUNNING = fromString("Running");

    /**
     * Creates or finds a OperationResultStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationResultStatus.
     */
    @JsonCreator
    public static OperationResultStatus fromString(String name) {
        return fromString(name, OperationResultStatus.class);
    }

    /** @return known OperationResultStatus values. */
    public static Collection<OperationResultStatus> values() {
        return values(OperationResultStatus.class);
    }
}
