// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The kind of disco source. */
public final class DiscoSourceKind extends ExpandableStringEnum<DiscoSourceKind> {
    /** Static value as for DiscoSourceKind. */
    @Generated public static final DiscoSourceKind AS = fromString("as");

    /** Static value attribute for DiscoSourceKind. */
    @Generated public static final DiscoSourceKind ATTRIBUTE = fromString("attribute");

    /** Static value contact for DiscoSourceKind. */
    @Generated public static final DiscoSourceKind CONTACT = fromString("contact");

    /** Static value domain for DiscoSourceKind. */
    @Generated public static final DiscoSourceKind DOMAIN = fromString("domain");

    /** Static value host for DiscoSourceKind. */
    @Generated public static final DiscoSourceKind HOST = fromString("host");

    /** Static value ipBlock for DiscoSourceKind. */
    @Generated public static final DiscoSourceKind IP_BLOCK = fromString("ipBlock");

    /**
     * Creates a new instance of DiscoSourceKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public DiscoSourceKind() {}

    /**
     * Creates or finds a DiscoSourceKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DiscoSourceKind.
     */
    @Generated
    @JsonCreator
    public static DiscoSourceKind fromString(String name) {
        return fromString(name, DiscoSourceKind.class);
    }

    /**
     * Gets known DiscoSourceKind values.
     *
     * @return known DiscoSourceKind values.
     */
    @Generated
    public static Collection<DiscoSourceKind> values() {
        return values(DiscoSourceKind.class);
    }
}
