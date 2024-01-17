// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specify what happens to the network interface when the VM is deleted.
 */
public final class DeleteOptions extends ExpandableStringEnum<DeleteOptions> {
    /**
     * Static value Delete for DeleteOptions.
     */
    public static final DeleteOptions DELETE = fromString("Delete");

    /**
     * Static value Detach for DeleteOptions.
     */
    public static final DeleteOptions DETACH = fromString("Detach");

    /**
     * Creates a new instance of DeleteOptions value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DeleteOptions() {
    }

    /**
     * Creates or finds a DeleteOptions from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DeleteOptions.
     */
    @JsonCreator
    public static DeleteOptions fromString(String name) {
        return fromString(name, DeleteOptions.class);
    }

    /**
     * Gets known DeleteOptions values.
     * 
     * @return known DeleteOptions values.
     */
    public static Collection<DeleteOptions> values() {
        return values(DeleteOptions.class);
    }
}
