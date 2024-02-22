// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * backupType
 * 
 * Type of backup Manual or Scheduled.
 */
public final class BackupType extends ExpandableStringEnum<BackupType> {
    /**
     * Static value Manual for BackupType.
     */
    public static final BackupType MANUAL = fromString("Manual");

    /**
     * Static value Scheduled for BackupType.
     */
    public static final BackupType SCHEDULED = fromString("Scheduled");

    /**
     * Creates a new instance of BackupType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BackupType() {
    }

    /**
     * Creates or finds a BackupType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BackupType.
     */
    @JsonCreator
    public static BackupType fromString(String name) {
        return fromString(name, BackupType.class);
    }

    /**
     * Gets known BackupType values.
     * 
     * @return known BackupType values.
     */
    public static Collection<BackupType> values() {
        return values(BackupType.class);
    }
}
