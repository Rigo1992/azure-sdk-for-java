// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Format of the content in analyzed result. */
public final class ContentFormat extends ExpandableStringEnum<ContentFormat> {
    /** Plain text representation of the document content without any formatting. */
    @Generated public static final ContentFormat TEXT = fromString("text");

    /** Markdown representation of the document content with section headings, tables, etc. */
    @Generated public static final ContentFormat MARKDOWN = fromString("markdown");

    /**
     * Creates a new instance of ContentFormat value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ContentFormat() {}

    /**
     * Creates or finds a ContentFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContentFormat.
     */
    @Generated
    @JsonCreator
    public static ContentFormat fromString(String name) {
        return fromString(name, ContentFormat.class);
    }

    /**
     * Gets known ContentFormat values.
     *
     * @return known ContentFormat values.
     */
    @Generated
    public static Collection<ContentFormat> values() {
        return values(ContentFormat.class);
    }
}
