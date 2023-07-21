// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Local replication role of the failover group instance. */
public final class InstanceFailoverGroupReplicationRole
    extends ExpandableStringEnum<InstanceFailoverGroupReplicationRole> {
    /** Static value Primary for InstanceFailoverGroupReplicationRole. */
    public static final InstanceFailoverGroupReplicationRole PRIMARY = fromString("Primary");

    /** Static value Secondary for InstanceFailoverGroupReplicationRole. */
    public static final InstanceFailoverGroupReplicationRole SECONDARY = fromString("Secondary");

    /**
     * Creates a new instance of InstanceFailoverGroupReplicationRole value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InstanceFailoverGroupReplicationRole() {
    }

    /**
     * Creates or finds a InstanceFailoverGroupReplicationRole from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InstanceFailoverGroupReplicationRole.
     */
    @JsonCreator
    public static InstanceFailoverGroupReplicationRole fromString(String name) {
        return fromString(name, InstanceFailoverGroupReplicationRole.class);
    }

    /**
     * Gets known InstanceFailoverGroupReplicationRole values.
     *
     * @return known InstanceFailoverGroupReplicationRole values.
     */
    public static Collection<InstanceFailoverGroupReplicationRole> values() {
        return values(InstanceFailoverGroupReplicationRole.class);
    }
}
