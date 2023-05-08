// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Specifies authentication type being used for connecting to the storage account. */
public final class AuthenticationType extends ExpandableStringEnum<AuthenticationType> {
    /** Static value keyBased for AuthenticationType. */
    public static final AuthenticationType KEY_BASED = fromString("keyBased");

    /** Static value identityBased for AuthenticationType. */
    public static final AuthenticationType IDENTITY_BASED = fromString("identityBased");

    /**
     * Creates a new instance of AuthenticationType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AuthenticationType() {
    }

    /**
     * Creates or finds a AuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AuthenticationType.
     */
    @JsonCreator
    public static AuthenticationType fromString(String name) {
        return fromString(name, AuthenticationType.class);
    }

    /**
     * Gets known AuthenticationType values.
     *
     * @return known AuthenticationType values.
     */
    public static Collection<AuthenticationType> values() {
        return values(AuthenticationType.class);
    }
}
