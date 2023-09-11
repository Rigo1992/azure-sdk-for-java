// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Type of API to create. * `http` creates a REST API * `soap` creates a SOAP pass-through API * `websocket` creates
 * websocket API * `graphql` creates GraphQL API.
 */
public final class SoapApiType extends ExpandableStringEnum<SoapApiType> {
    /** Static value http for SoapApiType. */
    public static final SoapApiType HTTP = fromString("http");

    /** Static value soap for SoapApiType. */
    public static final SoapApiType SOAP = fromString("soap");

    /** Static value websocket for SoapApiType. */
    public static final SoapApiType WEBSOCKET = fromString("websocket");

    /** Static value graphql for SoapApiType. */
    public static final SoapApiType GRAPHQL = fromString("graphql");

    /**
     * Creates a new instance of SoapApiType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SoapApiType() {
    }

    /**
     * Creates or finds a SoapApiType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SoapApiType.
     */
    @JsonCreator
    public static SoapApiType fromString(String name) {
        return fromString(name, SoapApiType.class);
    }

    /**
     * Gets known SoapApiType values.
     *
     * @return known SoapApiType values.
     */
    public static Collection<SoapApiType> values() {
        return values(SoapApiType.class);
    }
}
