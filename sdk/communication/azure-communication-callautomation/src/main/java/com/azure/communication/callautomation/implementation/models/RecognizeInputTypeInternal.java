// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Determines the type of the recognition.
 */
public final class RecognizeInputTypeInternal extends ExpandableStringEnum<RecognizeInputTypeInternal> {
    /**
     * Static value dtmf for RecognizeInputTypeInternal.
     */
    public static final RecognizeInputTypeInternal DTMF = fromString("dtmf");

    /**
     * Static value speech for RecognizeInputTypeInternal.
     */
    public static final RecognizeInputTypeInternal SPEECH = fromString("speech");

    /**
     * Static value speechOrDtmf for RecognizeInputTypeInternal.
     */
    public static final RecognizeInputTypeInternal SPEECH_OR_DTMF = fromString("speechOrDtmf");

    /**
     * Static value choices for RecognizeInputTypeInternal.
     */
    public static final RecognizeInputTypeInternal CHOICES = fromString("choices");

    /**
     * Creates a new instance of RecognizeInputTypeInternal value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RecognizeInputTypeInternal() {
    }

    /**
     * Creates or finds a RecognizeInputTypeInternal from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RecognizeInputTypeInternal.
     */
    @JsonCreator
    public static RecognizeInputTypeInternal fromString(String name) {
        return fromString(name, RecognizeInputTypeInternal.class);
    }

    /**
     * Gets known RecognizeInputTypeInternal values.
     * 
     * @return known RecognizeInputTypeInternal values.
     */
    public static Collection<RecognizeInputTypeInternal> values() {
        return values(RecognizeInputTypeInternal.class);
    }
}
