// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Encoding that is used to serialize messages to blobs. Supported values are 'avro', 'avrodeflate', and 'JSON'. Default
 * value is 'avro'.
 */
public final class RoutingStorageContainerPropertiesEncoding
    extends ExpandableStringEnum<RoutingStorageContainerPropertiesEncoding> {
    /** Static value Avro for RoutingStorageContainerPropertiesEncoding. */
    public static final RoutingStorageContainerPropertiesEncoding AVRO = fromString("Avro");

    /** Static value AvroDeflate for RoutingStorageContainerPropertiesEncoding. */
    public static final RoutingStorageContainerPropertiesEncoding AVRO_DEFLATE = fromString("AvroDeflate");

    /** Static value JSON for RoutingStorageContainerPropertiesEncoding. */
    public static final RoutingStorageContainerPropertiesEncoding JSON = fromString("JSON");

    /**
     * Creates or finds a RoutingStorageContainerPropertiesEncoding from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RoutingStorageContainerPropertiesEncoding.
     */
    @JsonCreator
    public static RoutingStorageContainerPropertiesEncoding fromString(String name) {
        return fromString(name, RoutingStorageContainerPropertiesEncoding.class);
    }

    /**
     * Gets known RoutingStorageContainerPropertiesEncoding values.
     *
     * @return known RoutingStorageContainerPropertiesEncoding values.
     */
    public static Collection<RoutingStorageContainerPropertiesEncoding> values() {
        return values(RoutingStorageContainerPropertiesEncoding.class);
    }
}
