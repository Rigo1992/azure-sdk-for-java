// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The HDInsightActivityDebugInfoOption settings to use.
 */
public final class HDInsightActivityDebugInfoOption extends ExpandableStringEnum<HDInsightActivityDebugInfoOption> {
    /**
     * Static value None for HDInsightActivityDebugInfoOption.
     */
    public static final HDInsightActivityDebugInfoOption NONE = fromString("None");

    /**
     * Static value Always for HDInsightActivityDebugInfoOption.
     */
    public static final HDInsightActivityDebugInfoOption ALWAYS = fromString("Always");

    /**
     * Static value Failure for HDInsightActivityDebugInfoOption.
     */
    public static final HDInsightActivityDebugInfoOption FAILURE = fromString("Failure");

    /**
     * Creates a new instance of HDInsightActivityDebugInfoOption value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HDInsightActivityDebugInfoOption() {
    }

    /**
     * Creates or finds a HDInsightActivityDebugInfoOption from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding HDInsightActivityDebugInfoOption.
     */
    @JsonCreator
    public static HDInsightActivityDebugInfoOption fromString(String name) {
        return fromString(name, HDInsightActivityDebugInfoOption.class);
    }

    /**
     * Gets known HDInsightActivityDebugInfoOption values.
     * 
     * @return known HDInsightActivityDebugInfoOption values.
     */
    public static Collection<HDInsightActivityDebugInfoOption> values() {
        return values(HDInsightActivityDebugInfoOption.class);
    }
}
