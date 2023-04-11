// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BlobCopySourceTagsMode. */
public final class BlobCopySourceTagsMode extends ExpandableStringEnum<BlobCopySourceTagsMode> {
    /** Static value REPLACE for BlobCopySourceTagsMode. */
    public static final BlobCopySourceTagsMode REPLACE = fromString("REPLACE");

    /** Static value COPY for BlobCopySourceTagsMode. */
    public static final BlobCopySourceTagsMode COPY = fromString("COPY");

    /**
     * Creates a new instance of BlobCopySourceTagsMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BlobCopySourceTagsMode() {}

    /**
     * Creates or finds a BlobCopySourceTagsMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BlobCopySourceTagsMode.
     */
    @JsonCreator
    public static BlobCopySourceTagsMode fromString(String name) {
        return fromString(name, BlobCopySourceTagsMode.class);
    }

    /**
     * Gets known BlobCopySourceTagsMode values.
     *
     * @return known BlobCopySourceTagsMode values.
     */
    public static Collection<BlobCopySourceTagsMode> values() {
        return values(BlobCopySourceTagsMode.class);
    }
}
