// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Describes the edition of the license. The values are either Standard or Datacenter. */
public final class LicenseEdition extends ExpandableStringEnum<LicenseEdition> {
    /** Static value Standard for LicenseEdition. */
    public static final LicenseEdition STANDARD = fromString("Standard");

    /** Static value Datacenter for LicenseEdition. */
    public static final LicenseEdition DATACENTER = fromString("Datacenter");

    /**
     * Creates a new instance of LicenseEdition value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LicenseEdition() {
    }

    /**
     * Creates or finds a LicenseEdition from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LicenseEdition.
     */
    @JsonCreator
    public static LicenseEdition fromString(String name) {
        return fromString(name, LicenseEdition.class);
    }

    /**
     * Gets known LicenseEdition values.
     *
     * @return known LicenseEdition values.
     */
    public static Collection<LicenseEdition> values() {
        return values(LicenseEdition.class);
    }
}
