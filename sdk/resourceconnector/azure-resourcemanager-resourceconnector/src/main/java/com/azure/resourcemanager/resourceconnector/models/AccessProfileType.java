// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AccessProfileType. */
public final class AccessProfileType extends ExpandableStringEnum<AccessProfileType> {
    /** Static value clusterUser for AccessProfileType. */
    public static final AccessProfileType CLUSTER_USER = fromString("clusterUser");

    /** Static value clusterCustomerUser for AccessProfileType. */
    public static final AccessProfileType CLUSTER_CUSTOMER_USER = fromString("clusterCustomerUser");

    /**
     * Creates or finds a AccessProfileType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AccessProfileType.
     */
    @JsonCreator
    public static AccessProfileType fromString(String name) {
        return fromString(name, AccessProfileType.class);
    }

    /**
     * Gets known AccessProfileType values.
     *
     * @return known AccessProfileType values.
     */
    public static Collection<AccessProfileType> values() {
        return values(AccessProfileType.class);
    }
}
