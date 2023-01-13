// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The protocol of the destination to where the traffic is redirected. */
public final class FrontDoorRedirectProtocol extends ExpandableStringEnum<FrontDoorRedirectProtocol> {
    /** Static value HttpOnly for FrontDoorRedirectProtocol. */
    public static final FrontDoorRedirectProtocol HTTP_ONLY = fromString("HttpOnly");

    /** Static value HttpsOnly for FrontDoorRedirectProtocol. */
    public static final FrontDoorRedirectProtocol HTTPS_ONLY = fromString("HttpsOnly");

    /** Static value MatchRequest for FrontDoorRedirectProtocol. */
    public static final FrontDoorRedirectProtocol MATCH_REQUEST = fromString("MatchRequest");

    /**
     * Creates a new instance of FrontDoorRedirectProtocol value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FrontDoorRedirectProtocol() {
    }

    /**
     * Creates or finds a FrontDoorRedirectProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FrontDoorRedirectProtocol.
     */
    @JsonCreator
    public static FrontDoorRedirectProtocol fromString(String name) {
        return fromString(name, FrontDoorRedirectProtocol.class);
    }

    /**
     * Gets known FrontDoorRedirectProtocol values.
     *
     * @return known FrontDoorRedirectProtocol values.
     */
    public static Collection<FrontDoorRedirectProtocol> values() {
        return values(FrontDoorRedirectProtocol.class);
    }
}
