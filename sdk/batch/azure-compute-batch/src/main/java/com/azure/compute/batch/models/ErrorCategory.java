// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** ErrorCategory enums. */
public final class ErrorCategory extends ExpandableStringEnum<ErrorCategory> {

    /** The error is due to a user issue, such as misconfiguration. */
    @Generated public static final ErrorCategory USER_ERROR = fromString("usererror");

    /** The error is due to an internal server issue. */
    @Generated public static final ErrorCategory SERVER_ERROR = fromString("servererror");

    /**
     * Creates a new instance of ErrorCategory value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ErrorCategory() {}

    /**
     * Creates or finds a ErrorCategory from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ErrorCategory.
     */
    @Generated
    @JsonCreator
    public static ErrorCategory fromString(String name) {
        return fromString(name, ErrorCategory.class);
    }

    /**
     * Gets known ErrorCategory values.
     *
     * @return known ErrorCategory values.
     */
    @Generated
    public static Collection<ErrorCategory> values() {
        return values(ErrorCategory.class);
    }
}
