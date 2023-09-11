// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Specifies for what type of messages sampling settings should not apply. */
public final class AlwaysLog extends ExpandableStringEnum<AlwaysLog> {
    /** Static value allErrors for AlwaysLog. */
    public static final AlwaysLog ALL_ERRORS = fromString("allErrors");

    /**
     * Creates a new instance of AlwaysLog value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AlwaysLog() {
    }

    /**
     * Creates or finds a AlwaysLog from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AlwaysLog.
     */
    @JsonCreator
    public static AlwaysLog fromString(String name) {
        return fromString(name, AlwaysLog.class);
    }

    /**
     * Gets known AlwaysLog values.
     *
     * @return known AlwaysLog values.
     */
    public static Collection<AlwaysLog> values() {
        return values(AlwaysLog.class);
    }
}
