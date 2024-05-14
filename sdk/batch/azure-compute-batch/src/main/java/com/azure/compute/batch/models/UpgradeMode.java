// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * UpgradeMode enums.
 */
public final class UpgradeMode extends ExpandableStringEnum<UpgradeMode> {

    /**
     * TAll virtual machines in the scale set are automatically updated at the same time.
     */
    @Generated
    public static final UpgradeMode AUTOMATIC = fromString("automatic");

    /**
     * You control the application of updates to virtual machines in the scale set. You do this by using the
     * manualUpgrade action.
     */
    @Generated
    public static final UpgradeMode MANUAL = fromString("manual");

    /**
     * The existing instances in a scale set are brought down in batches to be upgraded. Once the upgraded batch is
     * complete, the instances will begin taking traffic again and the next batch will begin. This continues until all
     * instances brought up-to-date.
     */
    @Generated
    public static final UpgradeMode ROLLING = fromString("rolling");

    /**
     * Creates a new instance of UpgradeMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public UpgradeMode() {
    }

    /**
     * Creates or finds a UpgradeMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UpgradeMode.
     */
    @Generated
    public static UpgradeMode fromString(String name) {
        return fromString(name, UpgradeMode.class);
    }

    /**
     * Gets known UpgradeMode values.
     *
     * @return known UpgradeMode values.
     */
    @Generated
    public static Collection<UpgradeMode> values() {
        return values(UpgradeMode.class);
    }
}
