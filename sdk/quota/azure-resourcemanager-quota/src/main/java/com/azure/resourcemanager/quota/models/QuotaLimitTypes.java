// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The quota or usages limit types.
 */
public final class QuotaLimitTypes extends ExpandableStringEnum<QuotaLimitTypes> {
    /**
     * Static value Independent for QuotaLimitTypes.
     */
    public static final QuotaLimitTypes INDEPENDENT = fromString("Independent");

    /**
     * Static value Shared for QuotaLimitTypes.
     */
    public static final QuotaLimitTypes SHARED = fromString("Shared");

    /**
     * Creates a new instance of QuotaLimitTypes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public QuotaLimitTypes() {
    }

    /**
     * Creates or finds a QuotaLimitTypes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding QuotaLimitTypes.
     */
    @JsonCreator
    public static QuotaLimitTypes fromString(String name) {
        return fromString(name, QuotaLimitTypes.class);
    }

    /**
     * Gets known QuotaLimitTypes values.
     * 
     * @return known QuotaLimitTypes values.
     */
    public static Collection<QuotaLimitTypes> values() {
        return values(QuotaLimitTypes.class);
    }
}
