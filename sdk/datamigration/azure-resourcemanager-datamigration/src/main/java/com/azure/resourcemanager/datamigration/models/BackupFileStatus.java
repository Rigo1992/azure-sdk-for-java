// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BackupFileStatus. */
public final class BackupFileStatus extends ExpandableStringEnum<BackupFileStatus> {
    /** Static value Arrived for BackupFileStatus. */
    public static final BackupFileStatus ARRIVED = fromString("Arrived");

    /** Static value Queued for BackupFileStatus. */
    public static final BackupFileStatus QUEUED = fromString("Queued");

    /** Static value Uploading for BackupFileStatus. */
    public static final BackupFileStatus UPLOADING = fromString("Uploading");

    /** Static value Uploaded for BackupFileStatus. */
    public static final BackupFileStatus UPLOADED = fromString("Uploaded");

    /** Static value Restoring for BackupFileStatus. */
    public static final BackupFileStatus RESTORING = fromString("Restoring");

    /** Static value Restored for BackupFileStatus. */
    public static final BackupFileStatus RESTORED = fromString("Restored");

    /** Static value Cancelled for BackupFileStatus. */
    public static final BackupFileStatus CANCELLED = fromString("Cancelled");

    /**
     * Creates or finds a BackupFileStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BackupFileStatus.
     */
    @JsonCreator
    public static BackupFileStatus fromString(String name) {
        return fromString(name, BackupFileStatus.class);
    }

    /** @return known BackupFileStatus values. */
    public static Collection<BackupFileStatus> values() {
        return values(BackupFileStatus.class);
    }
}
