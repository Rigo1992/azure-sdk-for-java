// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines the sequence of characters to use between the lines of text recognized by the OCR skill. The default value is
 * "space".
 */
public final class LineEnding extends ExpandableStringEnum<LineEnding> {
    /** Lines are separated by a single space character. */
    public static final LineEnding SPACE = fromString("space");

    /** Lines are separated by a carriage return ('\r') character. */
    public static final LineEnding CARRIAGE_RETURN = fromString("carriageReturn");

    /** Lines are separated by a single line feed ('\n') character. */
    public static final LineEnding LINE_FEED = fromString("lineFeed");

    /** Lines are separated by a carriage return and a line feed ('\r\n') character. */
    public static final LineEnding CARRIAGE_RETURN_LINE_FEED = fromString("carriageReturnLineFeed");

    /**
     * Creates a new instance of LineEnding value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LineEnding() {}

    /**
     * Creates or finds a LineEnding from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LineEnding.
     */
    public static LineEnding fromString(String name) {
        return fromString(name, LineEnding.class);
    }

    /**
     * Gets known LineEnding values.
     *
     * @return known LineEnding values.
     */
    public static Collection<LineEnding> values() {
        return values(LineEnding.class);
    }
}
