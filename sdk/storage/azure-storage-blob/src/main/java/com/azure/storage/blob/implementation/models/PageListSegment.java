// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.storage.blob.models.ClearRange;
import com.azure.storage.blob.models.PageRange;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/** The PageListSegment model. */
@JacksonXmlRootElement(localName = "PageListSegment")
@Fluent
public final class PageListSegment {
    /*
     * The PageRanges property.
     */
    @JsonProperty("PageRange")
    private List<PageRange> pageRanges = new ArrayList<>();

    /*
     * The ClearRanges property.
     */
    @JsonProperty("ClearRange")
    private List<ClearRange> clearRanges = new ArrayList<>();

    /*
     * The NextMarker property.
     */
    @JsonProperty(value = "NextMarker")
    private String nextMarker;

    /**
     * Get the pageRanges property: The PageRanges property.
     *
     * @return the pageRanges value.
     */
    public List<PageRange> getPageRanges() {
        return this.pageRanges;
    }

    /**
     * Set the pageRanges property: The PageRanges property.
     *
     * @param pageRanges the pageRanges value to set.
     * @return the PageListSegment object itself.
     */
    public PageListSegment setPageRanges(List<PageRange> pageRanges) {
        this.pageRanges = pageRanges;
        return this;
    }

    /**
     * Get the clearRanges property: The ClearRanges property.
     *
     * @return the clearRanges value.
     */
    public List<ClearRange> getClearRanges() {
        return this.clearRanges;
    }

    /**
     * Set the clearRanges property: The ClearRanges property.
     *
     * @param clearRanges the clearRanges value to set.
     * @return the PageListSegment object itself.
     */
    public PageListSegment setClearRanges(List<ClearRange> clearRanges) {
        this.clearRanges = clearRanges;
        return this;
    }

    /**
     * Get the nextMarker property: The NextMarker property.
     *
     * @return the nextMarker value.
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * Set the nextMarker property: The NextMarker property.
     *
     * @param nextMarker the nextMarker value to set.
     * @return the PageListSegment object itself.
     */
    public PageListSegment setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
}
