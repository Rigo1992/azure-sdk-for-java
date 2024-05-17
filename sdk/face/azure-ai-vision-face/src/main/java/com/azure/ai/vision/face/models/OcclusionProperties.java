// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties describing occlusions on a given face.
 */
@Immutable
public final class OcclusionProperties {

    /*
     * A boolean value indicating whether forehead is occluded.
     */
    @Generated
    @JsonProperty(value = "foreheadOccluded")
    private final boolean foreheadOccluded;

    /*
     * A boolean value indicating whether eyes are occluded.
     */
    @Generated
    @JsonProperty(value = "eyeOccluded")
    private final boolean eyeOccluded;

    /*
     * A boolean value indicating whether the mouth is occluded.
     */
    @Generated
    @JsonProperty(value = "mouthOccluded")
    private final boolean mouthOccluded;

    /**
     * Creates an instance of OcclusionProperties class.
     *
     * @param foreheadOccluded the foreheadOccluded value to set.
     * @param eyeOccluded the eyeOccluded value to set.
     * @param mouthOccluded the mouthOccluded value to set.
     */
    @Generated
    @JsonCreator
    private OcclusionProperties(@JsonProperty(value = "foreheadOccluded") boolean foreheadOccluded,
        @JsonProperty(value = "eyeOccluded") boolean eyeOccluded,
        @JsonProperty(value = "mouthOccluded") boolean mouthOccluded) {
        this.foreheadOccluded = foreheadOccluded;
        this.eyeOccluded = eyeOccluded;
        this.mouthOccluded = mouthOccluded;
    }

    /**
     * Get the foreheadOccluded property: A boolean value indicating whether forehead is occluded.
     *
     * @return the foreheadOccluded value.
     */
    @Generated
    public boolean isForeheadOccluded() {
        return this.foreheadOccluded;
    }

    /**
     * Get the eyeOccluded property: A boolean value indicating whether eyes are occluded.
     *
     * @return the eyeOccluded value.
     */
    @Generated
    public boolean isEyeOccluded() {
        return this.eyeOccluded;
    }

    /**
     * Get the mouthOccluded property: A boolean value indicating whether the mouth is occluded.
     *
     * @return the mouthOccluded value.
     */
    @Generated
    public boolean isMouthOccluded() {
        return this.mouthOccluded;
    }
}
