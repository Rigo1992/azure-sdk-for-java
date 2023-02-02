// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The swagger schema type. */
public final class SwaggerSchemaType extends ExpandableStringEnum<SwaggerSchemaType> {
    /** Static value String for SwaggerSchemaType. */
    public static final SwaggerSchemaType STRING = fromString("String");

    /** Static value Number for SwaggerSchemaType. */
    public static final SwaggerSchemaType NUMBER = fromString("Number");

    /** Static value Integer for SwaggerSchemaType. */
    public static final SwaggerSchemaType INTEGER = fromString("Integer");

    /** Static value Boolean for SwaggerSchemaType. */
    public static final SwaggerSchemaType BOOLEAN = fromString("Boolean");

    /** Static value Array for SwaggerSchemaType. */
    public static final SwaggerSchemaType ARRAY = fromString("Array");

    /** Static value File for SwaggerSchemaType. */
    public static final SwaggerSchemaType FILE = fromString("File");

    /** Static value Object for SwaggerSchemaType. */
    public static final SwaggerSchemaType OBJECT = fromString("Object");

    /** Static value Null for SwaggerSchemaType. */
    public static final SwaggerSchemaType NULL = fromString("Null");

    /**
     * Creates a new instance of SwaggerSchemaType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SwaggerSchemaType() {
    }

    /**
     * Creates or finds a SwaggerSchemaType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SwaggerSchemaType.
     */
    @JsonCreator
    public static SwaggerSchemaType fromString(String name) {
        return fromString(name, SwaggerSchemaType.class);
    }

    /**
     * Gets known SwaggerSchemaType values.
     *
     * @return known SwaggerSchemaType values.
     */
    public static Collection<SwaggerSchemaType> values() {
        return values(SwaggerSchemaType.class);
    }
}
