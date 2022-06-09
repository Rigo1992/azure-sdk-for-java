// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IncidentClassification. */
public final class IncidentClassification extends ExpandableStringEnum<IncidentClassification> {
    /** Static value Undetermined for IncidentClassification. */
    public static final IncidentClassification UNDETERMINED = fromString("Undetermined");

    /** Static value TruePositive for IncidentClassification. */
    public static final IncidentClassification TRUE_POSITIVE = fromString("TruePositive");

    /** Static value BenignPositive for IncidentClassification. */
    public static final IncidentClassification BENIGN_POSITIVE = fromString("BenignPositive");

    /** Static value FalsePositive for IncidentClassification. */
    public static final IncidentClassification FALSE_POSITIVE = fromString("FalsePositive");

    /**
     * Creates or finds a IncidentClassification from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IncidentClassification.
     */
    @JsonCreator
    public static IncidentClassification fromString(String name) {
        return fromString(name, IncidentClassification.class);
    }

    /**
     * Gets known IncidentClassification values.
     *
     * @return known IncidentClassification values.
     */
    public static Collection<IncidentClassification> values() {
        return values(IncidentClassification.class);
    }
}
