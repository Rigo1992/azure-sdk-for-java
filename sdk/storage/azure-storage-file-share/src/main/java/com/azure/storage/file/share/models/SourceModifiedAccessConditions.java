// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;

/**
 * Parameter group.
 */
@Fluent
public final class SourceModifiedAccessConditions {
    /*
     * Specify the crc64 value to operate only on range with a matching crc64 checksum.
     */
    private byte[] sourceIfMatchCrc64;

    /*
     * Specify the crc64 value to operate only on range without a matching crc64 checksum.
     */
    private byte[] sourceIfNoneMatchCrc64;

    /**
     * Creates an instance of SourceModifiedAccessConditions class.
     */
    public SourceModifiedAccessConditions() {
    }

    /**
     * Get the sourceIfMatchCrc64 property: Specify the crc64 value to operate only on range with a matching crc64
     * checksum.
     * 
     * @return the sourceIfMatchCrc64 value.
     */
    public byte[] getSourceIfMatchCrc64() {
        return CoreUtils.clone(this.sourceIfMatchCrc64);
    }

    /**
     * Set the sourceIfMatchCrc64 property: Specify the crc64 value to operate only on range with a matching crc64
     * checksum.
     * 
     * @param sourceIfMatchCrc64 the sourceIfMatchCrc64 value to set.
     * @return the SourceModifiedAccessConditions object itself.
     */
    public SourceModifiedAccessConditions setSourceIfMatchCrc64(byte[] sourceIfMatchCrc64) {
        this.sourceIfMatchCrc64 = CoreUtils.clone(sourceIfMatchCrc64);
        return this;
    }

    /**
     * Get the sourceIfNoneMatchCrc64 property: Specify the crc64 value to operate only on range without a matching
     * crc64 checksum.
     * 
     * @return the sourceIfNoneMatchCrc64 value.
     */
    public byte[] getSourceIfNoneMatchCrc64() {
        return CoreUtils.clone(this.sourceIfNoneMatchCrc64);
    }

    /**
     * Set the sourceIfNoneMatchCrc64 property: Specify the crc64 value to operate only on range without a matching
     * crc64 checksum.
     * 
     * @param sourceIfNoneMatchCrc64 the sourceIfNoneMatchCrc64 value to set.
     * @return the SourceModifiedAccessConditions object itself.
     */
    public SourceModifiedAccessConditions setSourceIfNoneMatchCrc64(byte[] sourceIfNoneMatchCrc64) {
        this.sourceIfNoneMatchCrc64 = CoreUtils.clone(sourceIfNoneMatchCrc64);
        return this;
    }
}
