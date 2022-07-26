// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CustomDomainStatus. */
public final class CustomDomainStatus extends ExpandableStringEnum<CustomDomainStatus> {
    /** Static value RetrievingValidationToken for CustomDomainStatus. */
    public static final CustomDomainStatus RETRIEVING_VALIDATION_TOKEN = fromString("RetrievingValidationToken");

    /** Static value Validating for CustomDomainStatus. */
    public static final CustomDomainStatus VALIDATING = fromString("Validating");

    /** Static value Adding for CustomDomainStatus. */
    public static final CustomDomainStatus ADDING = fromString("Adding");

    /** Static value Ready for CustomDomainStatus. */
    public static final CustomDomainStatus READY = fromString("Ready");

    /** Static value Failed for CustomDomainStatus. */
    public static final CustomDomainStatus FAILED = fromString("Failed");

    /** Static value Deleting for CustomDomainStatus. */
    public static final CustomDomainStatus DELETING = fromString("Deleting");

    /** Static value Unhealthy for CustomDomainStatus. */
    public static final CustomDomainStatus UNHEALTHY = fromString("Unhealthy");

    /**
     * Creates or finds a CustomDomainStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CustomDomainStatus.
     */
    @JsonCreator
    public static CustomDomainStatus fromString(String name) {
        return fromString(name, CustomDomainStatus.class);
    }

    /**
     * Gets known CustomDomainStatus values.
     *
     * @return known CustomDomainStatus values.
     */
    public static Collection<CustomDomainStatus> values() {
        return values(CustomDomainStatus.class);
    }
}
