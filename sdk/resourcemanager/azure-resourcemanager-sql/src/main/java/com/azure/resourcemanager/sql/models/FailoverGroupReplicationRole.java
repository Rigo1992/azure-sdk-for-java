// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Local replication role of the failover group instance. */
public final class FailoverGroupReplicationRole extends ExpandableStringEnum<FailoverGroupReplicationRole> {
    /** Static value Primary for FailoverGroupReplicationRole. */
    public static final FailoverGroupReplicationRole PRIMARY = fromString("Primary");

    /** Static value Secondary for FailoverGroupReplicationRole. */
    public static final FailoverGroupReplicationRole SECONDARY = fromString("Secondary");

    /**
     * Creates a new instance of FailoverGroupReplicationRole value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FailoverGroupReplicationRole() {
    }

    /**
     * Creates or finds a FailoverGroupReplicationRole from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FailoverGroupReplicationRole.
     */
    @JsonCreator
    public static FailoverGroupReplicationRole fromString(String name) {
        return fromString(name, FailoverGroupReplicationRole.class);
    }

    /**
     * Gets known FailoverGroupReplicationRole values.
     *
     * @return known FailoverGroupReplicationRole values.
     */
    public static Collection<FailoverGroupReplicationRole> values() {
        return values(FailoverGroupReplicationRole.class);
    }
}
