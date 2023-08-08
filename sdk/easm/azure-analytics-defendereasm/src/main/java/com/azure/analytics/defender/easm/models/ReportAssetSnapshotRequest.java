// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A request body used to retrieve an asset report snapshot. */
@Fluent
public final class ReportAssetSnapshotRequest {
    /*
     * The metric to retrieve a snapshot for.
     */
    @Generated
    @JsonProperty(value = "metric")
    private String metric;

    /*
     * The name of the label to retrieve a snapshot for.
     */
    @Generated
    @JsonProperty(value = "labelName")
    private String labelName;

    /*
     * The number of assets per page.
     */
    @Generated
    @JsonProperty(value = "size")
    private Integer size;

    /*
     * The page to retrieve.
     */
    @Generated
    @JsonProperty(value = "page")
    private Integer page;

    /** Creates an instance of ReportAssetSnapshotRequest class. */
    @Generated
    public ReportAssetSnapshotRequest() {}

    /**
     * Get the metric property: The metric to retrieve a snapshot for.
     *
     * @return the metric value.
     */
    @Generated
    public String getMetric() {
        return this.metric;
    }

    /**
     * Set the metric property: The metric to retrieve a snapshot for.
     *
     * @param metric the metric value to set.
     * @return the ReportAssetSnapshotRequest object itself.
     */
    @Generated
    public ReportAssetSnapshotRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get the labelName property: The name of the label to retrieve a snapshot for.
     *
     * @return the labelName value.
     */
    @Generated
    public String getLabelName() {
        return this.labelName;
    }

    /**
     * Set the labelName property: The name of the label to retrieve a snapshot for.
     *
     * @param labelName the labelName value to set.
     * @return the ReportAssetSnapshotRequest object itself.
     */
    @Generated
    public ReportAssetSnapshotRequest setLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }

    /**
     * Get the size property: The number of assets per page.
     *
     * @return the size value.
     */
    @Generated
    public Integer getSize() {
        return this.size;
    }

    /**
     * Set the size property: The number of assets per page.
     *
     * @param size the size value to set.
     * @return the ReportAssetSnapshotRequest object itself.
     */
    @Generated
    public ReportAssetSnapshotRequest setSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Get the page property: The page to retrieve.
     *
     * @return the page value.
     */
    @Generated
    public Integer getPage() {
        return this.page;
    }

    /**
     * Set the page property: The page to retrieve.
     *
     * @param page the page value to set.
     * @return the ReportAssetSnapshotRequest object itself.
     */
    @Generated
    public ReportAssetSnapshotRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
}
