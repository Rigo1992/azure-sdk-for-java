// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RecordingFormatInternal. */
public final class RecordingFormatInternal extends ExpandableStringEnum<RecordingFormatInternal> {
    /** Static value wav for RecordingFormatInternal. */
    public static final RecordingFormatInternal WAV = fromString("wav");

    /** Static value mp3 for RecordingFormatInternal. */
    public static final RecordingFormatInternal MP3 = fromString("mp3");

    /** Static value mp4 for RecordingFormatInternal. */
    public static final RecordingFormatInternal MP4 = fromString("mp4");

    /**
     * Creates or finds a RecordingFormatInternal from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecordingFormatInternal.
     */
    @JsonCreator
    public static RecordingFormatInternal fromString(String name) {
        return fromString(name, RecordingFormatInternal.class);
    }

    /** @return known RecordingFormatInternal values. */
    public static Collection<RecordingFormatInternal> values() {
        return values(RecordingFormatInternal.class);
    }
}
