// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** A message indicating if changes on the service provider require any updates on the consumer. */
public final class ActionsRequired extends ExpandableStringEnum<ActionsRequired> {
    /** Static value None for ActionsRequired. */
    public static final ActionsRequired NONE = fromString("None");

    /** Static value Recreate for ActionsRequired. */
    public static final ActionsRequired RECREATE = fromString("Recreate");

    /**
     * Creates a new instance of ActionsRequired value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ActionsRequired() {
    }

    /**
     * Creates or finds a ActionsRequired from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ActionsRequired.
     */
    @JsonCreator
    public static ActionsRequired fromString(String name) {
        return fromString(name, ActionsRequired.class);
    }

    /**
     * Gets known ActionsRequired values.
     *
     * @return known ActionsRequired values.
     */
    public static Collection<ActionsRequired> values() {
        return values(ActionsRequired.class);
    }
}
