// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Only userAssignedIdentity is supported in this API version; other types may be supported in the future. */
public final class CmkIdentityType extends ExpandableStringEnum<CmkIdentityType> {
    /** Static value systemAssignedIdentity for CmkIdentityType. */
    public static final CmkIdentityType SYSTEM_ASSIGNED_IDENTITY = fromString("systemAssignedIdentity");

    /** Static value userAssignedIdentity for CmkIdentityType. */
    public static final CmkIdentityType USER_ASSIGNED_IDENTITY = fromString("userAssignedIdentity");

    /**
     * Creates a new instance of CmkIdentityType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CmkIdentityType() {
    }

    /**
     * Creates or finds a CmkIdentityType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CmkIdentityType.
     */
    @JsonCreator
    public static CmkIdentityType fromString(String name) {
        return fromString(name, CmkIdentityType.class);
    }

    /**
     * Gets known CmkIdentityType values.
     *
     * @return known CmkIdentityType values.
     */
    public static Collection<CmkIdentityType> values() {
        return values(CmkIdentityType.class);
    }
}
