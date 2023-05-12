// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the data to extract from Azure blob storage and tells the indexer which data to extract from image content
 * when "imageAction" is set to a value other than "none". This applies to embedded image content in a .PDF or other
 * application, or image files such as .jpg and .png, in Azure blobs.
 */
public final class BlobIndexerDataToExtract extends ExpandableStringEnum<BlobIndexerDataToExtract> {
    /** Indexes just the standard blob properties and user-specified metadata. */
    public static final BlobIndexerDataToExtract STORAGE_METADATA = fromString("storageMetadata");

    /**
     * Extracts metadata provided by the Azure blob storage subsystem and the content-type specific metadata (for
     * example, metadata unique to just .png files are indexed).
     */
    public static final BlobIndexerDataToExtract ALL_METADATA = fromString("allMetadata");

    /** Extracts all metadata and textual content from each blob. */
    public static final BlobIndexerDataToExtract CONTENT_AND_METADATA = fromString("contentAndMetadata");

    /**
     * Creates a new instance of BlobIndexerDataToExtract value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BlobIndexerDataToExtract() {}

    /**
     * Creates or finds a BlobIndexerDataToExtract from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BlobIndexerDataToExtract.
     */
    public static BlobIndexerDataToExtract fromString(String name) {
        return fromString(name, BlobIndexerDataToExtract.class);
    }

    /**
     * Gets known BlobIndexerDataToExtract values.
     *
     * @return known BlobIndexerDataToExtract values.
     */
    public static Collection<BlobIndexerDataToExtract> values() {
        return values(BlobIndexerDataToExtract.class);
    }
}
