// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Terminal event indicating a server side error while streaming.
 */
public final class ErrorEvent extends ExpandableStringEnum<ErrorEvent> {

    /**
     * Event sent when an error occurs, such as an internal server error or a timeout.
     */
    @Generated
    public static final ErrorEvent ERROR = fromString("error");

    /**
     * Creates a new instance of ErrorEvent value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ErrorEvent() {
    }

    /**
     * Creates or finds a ErrorEvent from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ErrorEvent.
     */
    @Generated
    public static ErrorEvent fromString(String name) {
        return fromString(name, ErrorEvent.class);
    }

    /**
     * Gets known ErrorEvent values.
     *
     * @return known ErrorEvent values.
     */
    @Generated
    public static Collection<ErrorEvent> values() {
        return values(ErrorEvent.class);
    }
}
