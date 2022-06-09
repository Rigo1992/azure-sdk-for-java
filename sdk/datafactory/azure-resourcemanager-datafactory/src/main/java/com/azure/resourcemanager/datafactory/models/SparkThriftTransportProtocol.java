// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SparkThriftTransportProtocol. */
public final class SparkThriftTransportProtocol extends ExpandableStringEnum<SparkThriftTransportProtocol> {
    /** Static value Binary for SparkThriftTransportProtocol. */
    public static final SparkThriftTransportProtocol BINARY = fromString("Binary");

    /** Static value SASL for SparkThriftTransportProtocol. */
    public static final SparkThriftTransportProtocol SASL = fromString("SASL");

    /** Static value HTTP for SparkThriftTransportProtocol. */
    public static final SparkThriftTransportProtocol HTTP = fromString("HTTP ");

    /**
     * Creates or finds a SparkThriftTransportProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SparkThriftTransportProtocol.
     */
    @JsonCreator
    public static SparkThriftTransportProtocol fromString(String name) {
        return fromString(name, SparkThriftTransportProtocol.class);
    }

    /**
     * Gets known SparkThriftTransportProtocol values.
     *
     * @return known SparkThriftTransportProtocol values.
     */
    public static Collection<SparkThriftTransportProtocol> values() {
        return values(SparkThriftTransportProtocol.class);
    }
}
