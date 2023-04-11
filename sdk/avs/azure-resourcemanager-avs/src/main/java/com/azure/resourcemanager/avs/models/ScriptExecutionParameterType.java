// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of execution parameter. */
public final class ScriptExecutionParameterType extends ExpandableStringEnum<ScriptExecutionParameterType> {
    /** Static value Value for ScriptExecutionParameterType. */
    public static final ScriptExecutionParameterType VALUE = fromString("Value");

    /** Static value SecureValue for ScriptExecutionParameterType. */
    public static final ScriptExecutionParameterType SECURE_VALUE = fromString("SecureValue");

    /** Static value Credential for ScriptExecutionParameterType. */
    public static final ScriptExecutionParameterType CREDENTIAL = fromString("Credential");

    /**
     * Creates a new instance of ScriptExecutionParameterType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ScriptExecutionParameterType() {
    }

    /**
     * Creates or finds a ScriptExecutionParameterType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScriptExecutionParameterType.
     */
    @JsonCreator
    public static ScriptExecutionParameterType fromString(String name) {
        return fromString(name, ScriptExecutionParameterType.class);
    }

    /**
     * Gets known ScriptExecutionParameterType values.
     *
     * @return known ScriptExecutionParameterType values.
     */
    public static Collection<ScriptExecutionParameterType> values() {
        return values(ScriptExecutionParameterType.class);
    }
}
