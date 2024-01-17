// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.loganalytics.models.SearchMetadata;
import com.azure.resourcemanager.loganalytics.models.SearchSchemaValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The get schema operation response. */
@Fluent
public final class SearchGetSchemaResponseInner {
    /*
     * The metadata from search results.
     */
    @JsonProperty(value = "metadata")
    private SearchMetadata metadata;

    /*
     * The array of result values.
     */
    @JsonProperty(value = "value")
    private List<SearchSchemaValue> value;

    /** Creates an instance of SearchGetSchemaResponseInner class. */
    public SearchGetSchemaResponseInner() {
    }

    /**
     * Get the metadata property: The metadata from search results.
     *
     * @return the metadata value.
     */
    public SearchMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata from search results.
     *
     * @param metadata the metadata value to set.
     * @return the SearchGetSchemaResponseInner object itself.
     */
    public SearchGetSchemaResponseInner withMetadata(SearchMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the value property: The array of result values.
     *
     * @return the value value.
     */
    public List<SearchSchemaValue> value() {
        return this.value;
    }

    /**
     * Set the value property: The array of result values.
     *
     * @param value the value value to set.
     * @return the SearchGetSchemaResponseInner object itself.
     */
    public SearchGetSchemaResponseInner withValue(List<SearchSchemaValue> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metadata() != null) {
            metadata().validate();
        }
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
