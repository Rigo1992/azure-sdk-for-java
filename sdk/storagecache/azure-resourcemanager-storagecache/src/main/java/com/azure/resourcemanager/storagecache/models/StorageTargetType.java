// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for StorageTargetType. */
public final class StorageTargetType extends ExpandableStringEnum<StorageTargetType> {
    /** Static value nfs3 for StorageTargetType. */
    public static final StorageTargetType NFS3 = fromString("nfs3");

    /** Static value clfs for StorageTargetType. */
    public static final StorageTargetType CLFS = fromString("clfs");

    /** Static value unknown for StorageTargetType. */
    public static final StorageTargetType UNKNOWN = fromString("unknown");

    /** Static value blobNfs for StorageTargetType. */
    public static final StorageTargetType BLOB_NFS = fromString("blobNfs");

    /**
     * Creates or finds a StorageTargetType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StorageTargetType.
     */
    @JsonCreator
    public static StorageTargetType fromString(String name) {
        return fromString(name, StorageTargetType.class);
    }

    /**
     * Gets known StorageTargetType values.
     *
     * @return known StorageTargetType values.
     */
    public static Collection<StorageTargetType> values() {
        return values(StorageTargetType.class);
    }
}
