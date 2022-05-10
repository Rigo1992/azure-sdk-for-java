// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FhirResourceVersionPolicy. */
public final class FhirResourceVersionPolicy extends ExpandableStringEnum<FhirResourceVersionPolicy> {
    /** Static value no-version for FhirResourceVersionPolicy. */
    public static final FhirResourceVersionPolicy NO_VERSION = fromString("no-version");

    /** Static value versioned for FhirResourceVersionPolicy. */
    public static final FhirResourceVersionPolicy VERSIONED = fromString("versioned");

    /** Static value versioned-update for FhirResourceVersionPolicy. */
    public static final FhirResourceVersionPolicy VERSIONED_UPDATE = fromString("versioned-update");

    /**
     * Creates or finds a FhirResourceVersionPolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FhirResourceVersionPolicy.
     */
    @JsonCreator
    public static FhirResourceVersionPolicy fromString(String name) {
        return fromString(name, FhirResourceVersionPolicy.class);
    }

    /** @return known FhirResourceVersionPolicy values. */
    public static Collection<FhirResourceVersionPolicy> values() {
        return values(FhirResourceVersionPolicy.class);
    }
}
