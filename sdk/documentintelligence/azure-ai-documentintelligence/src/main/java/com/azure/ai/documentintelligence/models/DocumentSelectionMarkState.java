// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * State of the selection mark.
 */
public final class DocumentSelectionMarkState extends ExpandableStringEnum<DocumentSelectionMarkState> {
    /**
     * The selection mark is selected, often indicated by a check ✓ or cross X inside
     * the selection mark.
     */
    @Generated
    public static final DocumentSelectionMarkState SELECTED = fromString("selected");

    /**
     * The selection mark is not selected.
     */
    @Generated
    public static final DocumentSelectionMarkState UNSELECTED = fromString("unselected");

    /**
     * Creates a new instance of DocumentSelectionMarkState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public DocumentSelectionMarkState() {
    }

    /**
     * Creates or finds a DocumentSelectionMarkState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DocumentSelectionMarkState.
     */
    @Generated
    public static DocumentSelectionMarkState fromString(String name) {
        return fromString(name, DocumentSelectionMarkState.class);
    }

    /**
     * Gets known DocumentSelectionMarkState values.
     * 
     * @return known DocumentSelectionMarkState values.
     */
    @Generated
    public static Collection<DocumentSelectionMarkState> values() {
        return values(DocumentSelectionMarkState.class);
    }
}
