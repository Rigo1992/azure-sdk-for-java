// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Legacy similarity algorithm which uses the Lucene TFIDFSimilarity implementation of TF-IDF. This variation of TF-IDF
 * introduces static document length normalization as well as coordinating factors that penalize documents that only
 * partially match the searched queries.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "@odata.type",
        visible = true)
@JsonTypeName("#Microsoft.Azure.Search.ClassicSimilarity")
@Immutable
public final class ClassicSimilarityAlgorithm extends SimilarityAlgorithm {
    /*
     * The @odata.type property.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Azure.Search.ClassicSimilarity";
}
