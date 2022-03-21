// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PrincipalsModificationKind. */
public final class PrincipalsModificationKind extends ExpandableStringEnum<PrincipalsModificationKind> {
    /** Static value Union for PrincipalsModificationKind. */
    public static final PrincipalsModificationKind UNION = fromString("Union");

    /** Static value Replace for PrincipalsModificationKind. */
    public static final PrincipalsModificationKind REPLACE = fromString("Replace");

    /** Static value None for PrincipalsModificationKind. */
    public static final PrincipalsModificationKind NONE = fromString("None");

    /**
     * Creates or finds a PrincipalsModificationKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrincipalsModificationKind.
     */
    @JsonCreator
    public static PrincipalsModificationKind fromString(String name) {
        return fromString(name, PrincipalsModificationKind.class);
    }

    /** @return known PrincipalsModificationKind values. */
    public static Collection<PrincipalsModificationKind> values() {
        return values(PrincipalsModificationKind.class);
    }
}
