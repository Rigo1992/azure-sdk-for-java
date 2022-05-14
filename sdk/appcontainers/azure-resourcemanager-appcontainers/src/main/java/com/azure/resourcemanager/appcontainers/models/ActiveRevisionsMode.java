// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ActiveRevisionsMode. */
public final class ActiveRevisionsMode extends ExpandableStringEnum<ActiveRevisionsMode> {
    /** Static value Multiple for ActiveRevisionsMode. */
    public static final ActiveRevisionsMode MULTIPLE = fromString("Multiple");

    /** Static value Single for ActiveRevisionsMode. */
    public static final ActiveRevisionsMode SINGLE = fromString("Single");

    /**
     * Creates or finds a ActiveRevisionsMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ActiveRevisionsMode.
     */
    @JsonCreator
    public static ActiveRevisionsMode fromString(String name) {
        return fromString(name, ActiveRevisionsMode.class);
    }

    /**
     * Gets known ActiveRevisionsMode values.
     *
     * @return known ActiveRevisionsMode values.
     */
    public static Collection<ActiveRevisionsMode> values() {
        return values(ActiveRevisionsMode.class);
    }
}
