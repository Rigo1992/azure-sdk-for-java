// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Migration phase of Public IP Address. */
public final class PublicIpAddressMigrationPhase extends ExpandableStringEnum<PublicIpAddressMigrationPhase> {
    /** Static value None for PublicIpAddressMigrationPhase. */
    public static final PublicIpAddressMigrationPhase NONE = fromString("None");

    /** Static value Prepare for PublicIpAddressMigrationPhase. */
    public static final PublicIpAddressMigrationPhase PREPARE = fromString("Prepare");

    /** Static value Commit for PublicIpAddressMigrationPhase. */
    public static final PublicIpAddressMigrationPhase COMMIT = fromString("Commit");

    /** Static value Abort for PublicIpAddressMigrationPhase. */
    public static final PublicIpAddressMigrationPhase ABORT = fromString("Abort");

    /** Static value Committed for PublicIpAddressMigrationPhase. */
    public static final PublicIpAddressMigrationPhase COMMITTED = fromString("Committed");

    /**
     * Creates a new instance of PublicIpAddressMigrationPhase value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PublicIpAddressMigrationPhase() {
    }

    /**
     * Creates or finds a PublicIpAddressMigrationPhase from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PublicIpAddressMigrationPhase.
     */
    @JsonCreator
    public static PublicIpAddressMigrationPhase fromString(String name) {
        return fromString(name, PublicIpAddressMigrationPhase.class);
    }

    /**
     * Gets known PublicIpAddressMigrationPhase values.
     *
     * @return known PublicIpAddressMigrationPhase values.
     */
    public static Collection<PublicIpAddressMigrationPhase> values() {
        return values(PublicIpAddressMigrationPhase.class);
    }
}
