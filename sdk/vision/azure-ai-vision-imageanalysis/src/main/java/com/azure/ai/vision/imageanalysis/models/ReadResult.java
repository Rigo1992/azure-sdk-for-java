// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.imageanalysis.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The results of a Read (OCR) operation.
 */
@Immutable
public final class ReadResult {

    /*
     * A list of text blocks in the image. At the moment only one block is returned, containing all the text detected
     * in the image.
     */
    @Generated
    @JsonProperty(value = "blocks")
    private List<DetectedTextBlock> blocks;

    /**
     * Creates an instance of ReadResult class.
     *
     * @param blocks the blocks value to set.
     */
    @Generated
    @JsonCreator
    private ReadResult(@JsonProperty(value = "blocks") List<DetectedTextBlock> blocks) {
        this.blocks = blocks;
    }

    /**
     * Get the blocks property: A list of text blocks in the image. At the moment only one block is returned,
     * containing all the text detected in the image.
     *
     * @return the blocks value.
     */
    @Generated
    public List<DetectedTextBlock> getBlocks() {
        return this.blocks;
    }
}
