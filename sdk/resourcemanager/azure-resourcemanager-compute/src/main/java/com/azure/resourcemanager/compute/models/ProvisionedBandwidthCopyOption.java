// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * If this field is set on a snapshot and createOption is CopyStart, the snapshot will be copied at a quicker speed.
 */
public final class ProvisionedBandwidthCopyOption extends ExpandableStringEnum<ProvisionedBandwidthCopyOption> {
    /**
     * Static value None for ProvisionedBandwidthCopyOption.
     */
    public static final ProvisionedBandwidthCopyOption NONE = fromString("None");

    /**
     * Static value Enhanced for ProvisionedBandwidthCopyOption.
     */
    public static final ProvisionedBandwidthCopyOption ENHANCED = fromString("Enhanced");

    /**
     * Creates a new instance of ProvisionedBandwidthCopyOption value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProvisionedBandwidthCopyOption() {
    }

    /**
     * Creates or finds a ProvisionedBandwidthCopyOption from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProvisionedBandwidthCopyOption.
     */
    @JsonCreator
    public static ProvisionedBandwidthCopyOption fromString(String name) {
        return fromString(name, ProvisionedBandwidthCopyOption.class);
    }

    /**
     * Gets known ProvisionedBandwidthCopyOption values.
     * 
     * @return known ProvisionedBandwidthCopyOption values.
     */
    public static Collection<ProvisionedBandwidthCopyOption> values() {
        return values(ProvisionedBandwidthCopyOption.class);
    }
}
