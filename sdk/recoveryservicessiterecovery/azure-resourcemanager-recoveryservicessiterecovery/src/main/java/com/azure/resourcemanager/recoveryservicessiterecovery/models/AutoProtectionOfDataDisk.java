// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** A value indicating whether the auto protection is enabled. */
public final class AutoProtectionOfDataDisk extends ExpandableStringEnum<AutoProtectionOfDataDisk> {
    /** Static value Disabled for AutoProtectionOfDataDisk. */
    public static final AutoProtectionOfDataDisk DISABLED = fromString("Disabled");

    /** Static value Enabled for AutoProtectionOfDataDisk. */
    public static final AutoProtectionOfDataDisk ENABLED = fromString("Enabled");

    /**
     * Creates or finds a AutoProtectionOfDataDisk from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutoProtectionOfDataDisk.
     */
    @JsonCreator
    public static AutoProtectionOfDataDisk fromString(String name) {
        return fromString(name, AutoProtectionOfDataDisk.class);
    }

    /**
     * Gets known AutoProtectionOfDataDisk values.
     *
     * @return known AutoProtectionOfDataDisk values.
     */
    public static Collection<AutoProtectionOfDataDisk> values() {
        return values(AutoProtectionOfDataDisk.class);
    }
}
