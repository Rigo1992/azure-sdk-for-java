// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AcquireStorageAccountLock. */
public final class AcquireStorageAccountLock extends ExpandableStringEnum<AcquireStorageAccountLock> {
    /** Static value Acquire for AcquireStorageAccountLock. */
    public static final AcquireStorageAccountLock ACQUIRE = fromString("Acquire");

    /** Static value NotAcquire for AcquireStorageAccountLock. */
    public static final AcquireStorageAccountLock NOT_ACQUIRE = fromString("NotAcquire");

    /**
     * Creates or finds a AcquireStorageAccountLock from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AcquireStorageAccountLock.
     */
    @JsonCreator
    public static AcquireStorageAccountLock fromString(String name) {
        return fromString(name, AcquireStorageAccountLock.class);
    }

    /** @return known AcquireStorageAccountLock values. */
    public static Collection<AcquireStorageAccountLock> values() {
        return values(AcquireStorageAccountLock.class);
    }
}
