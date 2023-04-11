// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Redis eviction policy - default is VolatileLRU. */
public final class EvictionPolicy extends ExpandableStringEnum<EvictionPolicy> {
    /** Static value AllKeysLFU for EvictionPolicy. */
    public static final EvictionPolicy ALL_KEYS_LFU = fromString("AllKeysLFU");

    /** Static value AllKeysLRU for EvictionPolicy. */
    public static final EvictionPolicy ALL_KEYS_LRU = fromString("AllKeysLRU");

    /** Static value AllKeysRandom for EvictionPolicy. */
    public static final EvictionPolicy ALL_KEYS_RANDOM = fromString("AllKeysRandom");

    /** Static value VolatileLRU for EvictionPolicy. */
    public static final EvictionPolicy VOLATILE_LRU = fromString("VolatileLRU");

    /** Static value VolatileLFU for EvictionPolicy. */
    public static final EvictionPolicy VOLATILE_LFU = fromString("VolatileLFU");

    /** Static value VolatileTTL for EvictionPolicy. */
    public static final EvictionPolicy VOLATILE_TTL = fromString("VolatileTTL");

    /** Static value VolatileRandom for EvictionPolicy. */
    public static final EvictionPolicy VOLATILE_RANDOM = fromString("VolatileRandom");

    /** Static value NoEviction for EvictionPolicy. */
    public static final EvictionPolicy NO_EVICTION = fromString("NoEviction");

    /**
     * Creates a new instance of EvictionPolicy value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EvictionPolicy() {
    }

    /**
     * Creates or finds a EvictionPolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EvictionPolicy.
     */
    @JsonCreator
    public static EvictionPolicy fromString(String name) {
        return fromString(name, EvictionPolicy.class);
    }

    /**
     * Gets known EvictionPolicy values.
     *
     * @return known EvictionPolicy values.
     */
    public static Collection<EvictionPolicy> values() {
        return values(EvictionPolicy.class);
    }
}
