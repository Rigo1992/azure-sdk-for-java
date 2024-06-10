// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of the SQL script. */
public final class SqlScriptType extends ExpandableStringEnum<SqlScriptType> {
    /** Static value SqlQuery for SqlScriptType. */
    public static final SqlScriptType SQL_QUERY = fromString("SqlQuery");

    /**
     * Creates a new instance of SqlScriptType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SqlScriptType() {}

    /**
     * Creates or finds a SqlScriptType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SqlScriptType.
     */
    @JsonCreator
    public static SqlScriptType fromString(String name) {
        return fromString(name, SqlScriptType.class);
    }

    /**
     * Gets known SqlScriptType values.
     *
     * @return known SqlScriptType values.
     */
    public static Collection<SqlScriptType> values() {
        return values(SqlScriptType.class);
    }
}
