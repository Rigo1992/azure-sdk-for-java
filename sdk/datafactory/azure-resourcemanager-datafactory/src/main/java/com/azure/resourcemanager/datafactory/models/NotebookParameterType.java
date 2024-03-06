// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Notebook parameter type.
 */
public final class NotebookParameterType extends ExpandableStringEnum<NotebookParameterType> {
    /**
     * Static value string for NotebookParameterType.
     */
    public static final NotebookParameterType STRING = fromString("string");

    /**
     * Static value int for NotebookParameterType.
     */
    public static final NotebookParameterType INT = fromString("int");

    /**
     * Static value float for NotebookParameterType.
     */
    public static final NotebookParameterType FLOAT = fromString("float");

    /**
     * Static value bool for NotebookParameterType.
     */
    public static final NotebookParameterType BOOL = fromString("bool");

    /**
     * Creates a new instance of NotebookParameterType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NotebookParameterType() {
    }

    /**
     * Creates or finds a NotebookParameterType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NotebookParameterType.
     */
    @JsonCreator
    public static NotebookParameterType fromString(String name) {
        return fromString(name, NotebookParameterType.class);
    }

    /**
     * Gets known NotebookParameterType values.
     * 
     * @return known NotebookParameterType values.
     */
    public static Collection<NotebookParameterType> values() {
        return values(NotebookParameterType.class);
    }
}
