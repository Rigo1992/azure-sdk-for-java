// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Sets options that control the availability of semantic search. This configuration is only possible for certain Azure
 * AI Search SKUs in certain locations.
 */
public final class SearchSemanticSearch extends ExpandableStringEnum<SearchSemanticSearch> {
    /**
     * Static value disabled for SearchSemanticSearch.
     */
    public static final SearchSemanticSearch DISABLED = fromString("disabled");

    /**
     * Static value free for SearchSemanticSearch.
     */
    public static final SearchSemanticSearch FREE = fromString("free");

    /**
     * Static value standard for SearchSemanticSearch.
     */
    public static final SearchSemanticSearch STANDARD = fromString("standard");

    /**
     * Creates a new instance of SearchSemanticSearch value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SearchSemanticSearch() {
    }

    /**
     * Creates or finds a SearchSemanticSearch from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SearchSemanticSearch.
     */
    @JsonCreator
    public static SearchSemanticSearch fromString(String name) {
        return fromString(name, SearchSemanticSearch.class);
    }

    /**
     * Gets known SearchSemanticSearch values.
     * 
     * @return known SearchSemanticSearch values.
     */
    public static Collection<SearchSemanticSearch> values() {
        return values(SearchSemanticSearch.class);
    }
}
