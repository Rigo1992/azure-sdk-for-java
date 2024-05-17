// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The outcome of the liveness classification.
 */
public final class FaceLivenessDecision extends ExpandableStringEnum<FaceLivenessDecision> {

    /**
     * The algorithm could not classify the target face as either real or spoof.
     */
    @Generated
    public static final FaceLivenessDecision UNCERTAIN = fromString("uncertain");

    /**
     * The algorithm has classified the target face as real.
     */
    @Generated
    public static final FaceLivenessDecision REAL_FACE = fromString("realface");

    /**
     * The algorithm has classified the target face as a spoof.
     */
    @Generated
    public static final FaceLivenessDecision SPOOF_FACE = fromString("spoofface");

    /**
     * Creates a new instance of FaceLivenessDecision value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public FaceLivenessDecision() {
    }

    /**
     * Creates or finds a FaceLivenessDecision from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FaceLivenessDecision.
     */
    @Generated
    @JsonCreator
    public static FaceLivenessDecision fromString(String name) {
        return fromString(name, FaceLivenessDecision.class);
    }

    /**
     * Gets known FaceLivenessDecision values.
     *
     * @return known FaceLivenessDecision values.
     */
    @Generated
    public static Collection<FaceLivenessDecision> values() {
        return values(FaceLivenessDecision.class);
    }
}
