// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VideoScaleMode. */
public final class VideoScaleMode extends ExpandableStringEnum<VideoScaleMode> {
    /** Static value Pad for VideoScaleMode. */
    public static final VideoScaleMode PAD = fromString("Pad");

    /** Static value PreserveAspectRatio for VideoScaleMode. */
    public static final VideoScaleMode PRESERVE_ASPECT_RATIO = fromString("PreserveAspectRatio");

    /** Static value Stretch for VideoScaleMode. */
    public static final VideoScaleMode STRETCH = fromString("Stretch");

    /**
     * Creates or finds a VideoScaleMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VideoScaleMode.
     */
    @JsonCreator
    public static VideoScaleMode fromString(String name) {
        return fromString(name, VideoScaleMode.class);
    }

    /** @return known VideoScaleMode values. */
    public static Collection<VideoScaleMode> values() {
        return values(VideoScaleMode.class);
    }
}
