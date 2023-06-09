// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.search.documents.indexes.models.PhoneticEncoder;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Create tokens for phonetic matches. This token filter is implemented using Apache Lucene. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "@odata.type",
        visible = true)
@JsonTypeName("#Microsoft.Azure.Search.PhoneticTokenFilter")
@Fluent
public final class PhoneticTokenFilter extends TokenFilter {
    /*
     * Identifies the concrete type of the token filter.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Azure.Search.PhoneticTokenFilter";

    /*
     * The phonetic encoder to use. Default is "metaphone".
     */
    @JsonProperty(value = "encoder")
    private PhoneticEncoder encoder;

    /*
     * A value indicating whether encoded tokens should replace original tokens. If false, encoded tokens are added as
     * synonyms. Default is true.
     */
    @JsonProperty(value = "replace")
    private Boolean replaceOriginalTokens;

    /**
     * Creates an instance of PhoneticTokenFilter class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public PhoneticTokenFilter(@JsonProperty(value = "name", required = true) String name) {
        super(name);
    }

    /**
     * Get the odataType property: Identifies the concrete type of the token filter.
     *
     * @return the odataType value.
     */
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Get the encoder property: The phonetic encoder to use. Default is "metaphone".
     *
     * @return the encoder value.
     */
    public PhoneticEncoder getEncoder() {
        return this.encoder;
    }

    /**
     * Set the encoder property: The phonetic encoder to use. Default is "metaphone".
     *
     * @param encoder the encoder value to set.
     * @return the PhoneticTokenFilter object itself.
     */
    public PhoneticTokenFilter setEncoder(PhoneticEncoder encoder) {
        this.encoder = encoder;
        return this;
    }

    /**
     * Get the replaceOriginalTokens property: A value indicating whether encoded tokens should replace original tokens.
     * If false, encoded tokens are added as synonyms. Default is true.
     *
     * @return the replaceOriginalTokens value.
     */
    public Boolean isReplaceOriginalTokens() {
        return this.replaceOriginalTokens;
    }

    /**
     * Set the replaceOriginalTokens property: A value indicating whether encoded tokens should replace original tokens.
     * If false, encoded tokens are added as synonyms. Default is true.
     *
     * @param replaceOriginalTokens the replaceOriginalTokens value to set.
     * @return the PhoneticTokenFilter object itself.
     */
    public PhoneticTokenFilter setReplaceOriginalTokens(Boolean replaceOriginalTokens) {
        this.replaceOriginalTokens = replaceOriginalTokens;
        return this;
    }
}
